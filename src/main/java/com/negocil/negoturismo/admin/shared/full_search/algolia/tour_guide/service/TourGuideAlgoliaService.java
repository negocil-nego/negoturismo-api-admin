package com.negocil.negoturismo.admin.shared.full_search.algolia.tour_guide.service;

import com.algolia.api.SearchClient;
import com.algolia.model.search.Hit;
import com.algolia.model.search.SearchResponse;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import com.negocil.negoturismo.admin.feature.tour_guide.repository.TourGuideRepository;
import com.negocil.negoturismo.admin.shared.full_search.algolia.tour_guide.mapper.TourGuideSearchDocumentMapper;
import com.negocil.negoturismo.admin.shared.full_search.algolia.util.AlgoliaUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "service", name = "fullsearch", havingValue = "algolia", matchIfMissing = true)
public class TourGuideAlgoliaService {
    private static final String TOUR_GUIDES_INDEX = "tour_guides";
    private final TourGuideRepository repository;
    private final SearchClient algoliaClient;

    public void indexBulk(Collection<TourGuide> tourGuides) {
        try {
            var documents = tourGuides.stream().map(TourGuideSearchDocumentMapper::toDocument).toList();
            algoliaClient.saveObjects(TOUR_GUIDES_INDEX, documents);
            log.info("Indexed {} tour guides in search index", documents.size());
        } catch (Exception e) {
            log.error("Failed to index {} tour guides in search index", tourGuides.size(), e);
        }
    }

    public void indexSaveOrUpdate(TourGuide tourGuide) {
        try {
            algoliaClient.saveObject(TOUR_GUIDES_INDEX, TourGuideSearchDocumentMapper.toDocument(tourGuide));
        } catch (Exception e) {
            log.error("Failed to save tour guide {} in search index", tourGuide.getUuid(), e);
        }
    }

    public void remove(TourGuide tourGuide) {
        try {
            algoliaClient.deleteObject(TOUR_GUIDES_INDEX, String.valueOf(tourGuide.getUuid()));
        } catch (Exception e) {
            log.error("Failed to remove tour guide {} from search index", tourGuide.getUuid(), e);
        }
    }

    public void deleteAll() {
        try {
            algoliaClient.clearObjects(TOUR_GUIDES_INDEX);
            log.info("Cleared tour guides search index");
        } catch (Exception e) {
            log.error("Failed to clear tour guides search index", e);
        }
    }

    public Page<TourGuide> search(String query, Pageable pageable) {
        try {
            var responses = algoliaClient.search(AlgoliaUtils.searchMethodParams(TOUR_GUIDES_INDEX, query, pageable), Hit.class);

            if (!(responses.getResults().getFirst() instanceof SearchResponse<Hit> result) || result.getHits().isEmpty()) {
                return Page.empty(pageable);
            }

            var uuids = AlgoliaUtils.generatorUuids(result.getHits());

            var byUuid = repository.findByUuidIn(uuids).stream().collect(Collectors.toMap(TourGuide::getUuid, Function.identity()));

            var tourGuides = uuids.stream().map(byUuid::get).filter(Objects::nonNull).toList();

            return new PageImpl<>(tourGuides, pageable, Optional.ofNullable(result.getNbHits()).orElse(0));
        } catch (Exception e) {
            log.error("Failed to search tour guides in search index", e);
            return Page.empty(pageable);
        }
    }
}
