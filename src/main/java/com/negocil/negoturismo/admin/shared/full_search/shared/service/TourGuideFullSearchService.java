package com.negocil.negoturismo.admin.shared.full_search.shared.service;

import com.negocil.negoturismo.admin.config.ServiceConfig;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import com.negocil.negoturismo.admin.feature.tour_guide.repository.TourGuideRepository;
import com.negocil.negoturismo.admin.shared.full_search.algolia.tour_guide.service.TourGuideAlgoliaService;
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
public class TourGuideFullSearchService {
    private static final int REINDEX_PAGE_SIZE = 500;

    private final ServiceConfig serviceConfig;
    private final ObjectProvider<TourGuideAlgoliaService> tourGuideAlgolia;
    private final TourGuideRepository repository;

    public void indexBulk(Collection<TourGuide> tourGuides) {
        algolia().ifPresent(service -> service.indexBulk(tourGuides));
    }

    public void indexSaveOrUpdate(TourGuide tourGuide) {
        algolia().ifPresent(service -> service.indexSaveOrUpdate(tourGuide));
    }

    public void remove(TourGuide tourGuide) {
        algolia().ifPresent(service -> service.remove(tourGuide));
    }

    public void reindexAll() {
        var algoliaService = algolia();
        if (algoliaService.isEmpty()) {
            log.info("Full search index is not active, skipping tour guides reindex");
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
        log.info("Reindexed {} tour guides", total);
    }

    public Page<TourGuide> search(String query, Pageable pageable) {
        return algolia()
                .map(service -> service.search(query, pageable))
                .orElseGet(() -> repository.search(query, pageable));
    }

    private Optional<TourGuideAlgoliaService> algolia() {
        return serviceConfig.fullsearchEqualsAlgolia()
                ? Optional.ofNullable(tourGuideAlgolia.getIfAvailable())
                : Optional.empty();
    }
}
