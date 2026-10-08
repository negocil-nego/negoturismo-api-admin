package com.negocil.negoturismo.admin.shared.full_search.algolia.tourist_area.service;

import com.algolia.api.SearchClient;
import com.algolia.model.search.Hit;
import com.algolia.model.search.SearchResponse;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.feature.tour_guide.repository.TouristAreaRepository;
import com.negocil.negoturismo.admin.shared.full_search.algolia.tourist_area.mapper.TouristAreaSearchDocumentMapper;
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
public class TouristAreaAlgoliaService {
    private static final String TOURIST_AREAS_INDEX = "tourist_areas";
    private final TouristAreaRepository repository;
    private final SearchClient algoliaClient;

    public void indexBulk(Collection<TouristArea> touristAreas) {
        try {
            var documents = touristAreas.stream().map(TouristAreaSearchDocumentMapper::toDocument).toList();
            algoliaClient.saveObjects(TOURIST_AREAS_INDEX, documents);
            log.info("Indexed {} tourist areas in search index", documents.size());
        } catch (Exception e) {
            log.error("Failed to index {} tourist areas in search index", touristAreas.size(), e);
        }
    }

    public void indexSaveOrUpdate(TouristArea touristArea) {
        try {
            algoliaClient.saveObject(TOURIST_AREAS_INDEX, TouristAreaSearchDocumentMapper.toDocument(touristArea));
        } catch (Exception e) {
            log.error("Failed to save tourist area {} in search index", touristArea.getUuid(), e);
        }
    }

    public void remove(TouristArea touristArea) {
        try {
            algoliaClient.deleteObject(TOURIST_AREAS_INDEX, String.valueOf(touristArea.getUuid()));
        } catch (Exception e) {
            log.error("Failed to remove tourist area {} from search index", touristArea.getUuid(), e);
        }
    }

    public void deleteAll() {
        try {
            algoliaClient.clearObjects(TOURIST_AREAS_INDEX);
            log.info("Cleared tourist areas search index");
        } catch (Exception e) {
            log.error("Failed to clear tourist areas search index", e);
        }
    }

    public Page<TouristArea> search(String query, Pageable pageable) {
        try {
            var responses = algoliaClient.search(AlgoliaUtils.searchMethodParams(TOURIST_AREAS_INDEX, query, pageable), Hit.class);

            if (!(responses.getResults().getFirst() instanceof SearchResponse<Hit> result) || result.getHits().isEmpty()) {
                return Page.empty(pageable);
            }

            var uuids = AlgoliaUtils.generatorUuids(result.getHits());

            var byUuid = repository.findByUuidIn(uuids).stream().collect(Collectors.toMap(TouristArea::getUuid, Function.identity()));

            var touristAreas = uuids.stream().map(byUuid::get).filter(Objects::nonNull).toList();

            return new PageImpl<>(touristAreas, pageable, Optional.ofNullable(result.getNbHits()).orElse(0));
        } catch (Exception e) {
            log.error("Failed to search tourist areas in search index", e);
            return Page.empty(pageable);
        }
    }
}
