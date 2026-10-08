package com.negocil.negoturismo.admin.shared.full_search.shared.service;

import com.negocil.negoturismo.admin.config.ServiceConfig;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.feature.tour_guide.repository.TouristAreaRepository;
import com.negocil.negoturismo.admin.shared.full_search.algolia.tourist_area.service.TouristAreaAlgoliaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class TouristAreaFullSearchService {
    private static final int REINDEX_PAGE_SIZE = 500;

    private final ServiceConfig serviceConfig;
    private final ObjectProvider<TouristAreaAlgoliaService> touristAreaAlgolia;
    private final TouristAreaRepository repository;

    public void indexBulk(Collection<TouristArea> touristAreas) {
        algolia().ifPresent(service -> service.indexBulk(touristAreas));
    }

    public void indexSaveOrUpdate(TouristArea touristArea) {
        algolia().ifPresent(service -> service.indexSaveOrUpdate(touristArea));
    }

    public void remove(TouristArea touristArea) {
        algolia().ifPresent(service -> service.remove(touristArea));
    }

    public void reindexAll() {
        var algoliaService = algolia();
        if (algoliaService.isEmpty()) {
            log.info("Full search index is not active, skipping tourist areas reindex");
            return;
        }

        algoliaService.get().deleteAll();

        long total = 0;
        var pageable = PageRequest.of(0, REINDEX_PAGE_SIZE, Sort.by("id"));
        var page = repository.findAll(pageable);
        while (true) {
            var content = page.getContent();
            if (!content.isEmpty()) {
                algoliaService.get().indexBulk(content);
                total += content.size();
            }
            if (!page.hasNext()) {
                break;
            }
            page = repository.findAll(page.nextPageable());
        }
        log.info("Reindexed {} tourist areas", total);
    }

    public Page<TouristArea> search(String query, Pageable pageable) {
        return algolia()
                .map(service -> service.search(query, pageable))
                .orElseGet(() -> repository.search(query, pageable));
    }

    private Optional<TouristAreaAlgoliaService> algolia() {
        return serviceConfig.fullsearchEqualsAlgolia()
                ? Optional.ofNullable(touristAreaAlgolia.getIfAvailable())
                : Optional.empty();
    }
}
