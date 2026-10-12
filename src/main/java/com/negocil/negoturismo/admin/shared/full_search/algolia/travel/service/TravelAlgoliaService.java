package com.negocil.negoturismo.admin.shared.full_search.algolia.travel.service;

import com.algolia.api.SearchClient;
import com.algolia.model.search.Hit;
import com.algolia.model.search.SearchResponse;
import com.negocil.negoturismo.admin.feature.travel.model.Travel;
import com.negocil.negoturismo.admin.feature.travel.repository.TravelRepository;
import com.negocil.negoturismo.admin.shared.full_search.algolia.travel.mapper.TravelSearchDocumentMapper;
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
public class TravelAlgoliaService {
    private static final String TRAVELS_INDEX = "travels";
    private final TravelRepository repository;
    private final SearchClient algoliaClient;

    public void indexBulk(Collection<Travel> travels) {
        try {
            var documents = travels.stream().map(TravelSearchDocumentMapper::toDocument).toList();
            algoliaClient.saveObjects(TRAVELS_INDEX, documents);
            log.info("Indexed {} travels in search index", documents.size());
        } catch (Exception e) {
            log.error("Failed to index {} travels in search index", travels.size(), e);
        }
    }

    public void indexSaveOrUpdate(Travel travel) {
        try {
            algoliaClient.saveObject(TRAVELS_INDEX, TravelSearchDocumentMapper.toDocument(travel));
        } catch (Exception e) {
            log.error("Failed to save travel {} in search index", travel.getUuid(), e);
        }
    }

    public void remove(Travel travel) {
        try {
            algoliaClient.deleteObject(TRAVELS_INDEX, String.valueOf(travel.getUuid()));
        } catch (Exception e) {
            log.error("Failed to remove travel {} from search index", travel.getUuid(), e);
        }
    }

    public void deleteAll() {
        try {
            algoliaClient.clearObjects(TRAVELS_INDEX);
            log.info("Cleared travels search index");
        } catch (Exception e) {
            log.error("Failed to clear travels search index", e);
        }
    }

    public Page<Travel> search(String query, Pageable pageable) {
        try {
            var responses = algoliaClient.search(AlgoliaUtils.searchMethodParams(TRAVELS_INDEX, query, pageable), Hit.class);

            if (!(responses.getResults().getFirst() instanceof SearchResponse<Hit> result) || result.getHits().isEmpty()) {
                return Page.empty(pageable);
            }

            var uuids = AlgoliaUtils.generatorUuids(result.getHits());

            var byUuid = repository.findByUuidIn(uuids).stream().collect(Collectors.toMap(Travel::getUuid, Function.identity()));

            var travels = uuids.stream().map(byUuid::get).filter(Objects::nonNull).toList();

            return new PageImpl<>(travels, pageable, Optional.ofNullable(result.getNbHits()).orElse(0));
        } catch (Exception e) {
            log.error("Failed to search travels in search index", e);
            return Page.empty(pageable);
        }
    }
}
