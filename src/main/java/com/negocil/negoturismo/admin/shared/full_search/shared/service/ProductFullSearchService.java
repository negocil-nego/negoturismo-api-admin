package com.negocil.negoturismo.admin.shared.full_search.shared.service;

import com.negocil.negoturismo.admin.config.ServiceConfig;
import com.negocil.negoturismo.admin.feature.product.model.Product;
import com.negocil.negoturismo.admin.feature.product.repository.ProductRepository;
import com.negocil.negoturismo.admin.shared.full_search.algolia.product.service.ProductAlgoliaService;
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
public class ProductFullSearchService {
    private static final int REINDEX_PAGE_SIZE = 500;

    private final ServiceConfig serviceConfig;
    private final ObjectProvider<ProductAlgoliaService> productAlgolia;
    private final ProductRepository repository;

    public void indexBulk(Collection<Product> products) {
        algolia().ifPresent(service -> service.indexBulk(products));
    }

    public void indexSaveOrUpdate(Product product) {
        algolia().ifPresent(service -> service.indexSaveOrUpdate(product));
    }

    public void remove(Product product) {
        algolia().ifPresent(service -> service.remove(product));
    }

    public void reindexAll() {
        var algoliaService = algolia();
        if (algoliaService.isEmpty()) {
            log.info("Full search index is not active, skipping products reindex");
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
        log.info("Reindexed {} products", total);
    }

    public Page<Product> search(String query, Pageable pageable) {
        return algolia()
                .map(service -> service.search(query, pageable))
                .orElseGet(() -> repository.search(query, pageable));
    }

    private Optional<ProductAlgoliaService> algolia() {
        return serviceConfig.fullsearchEqualsAlgolia()
                ? Optional.ofNullable(productAlgolia.getIfAvailable())
                : Optional.empty();
    }
}
