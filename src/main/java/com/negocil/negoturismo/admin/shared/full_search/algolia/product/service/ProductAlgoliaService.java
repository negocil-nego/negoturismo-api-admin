package com.negocil.negoturismo.admin.shared.full_search.algolia.product.service;

import com.algolia.api.SearchClient;
import com.algolia.model.search.Hit;
import com.algolia.model.search.SearchResponse;
import com.negocil.negoturismo.admin.feature.product.model.Product;
import com.negocil.negoturismo.admin.feature.product.repository.ProductRepository;
import com.negocil.negoturismo.admin.shared.full_search.algolia.product.mapper.ProductSearchDocumentMapper;
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
public class ProductAlgoliaService {
    private static final String PRODUCTS_INDEX = "products";
    private final ProductRepository repository;
    private final SearchClient algoliaClient;

    public void indexBulk(Collection<Product> products) {
        try {
            var documents = products.stream().map(ProductSearchDocumentMapper::toDocument).toList();
            algoliaClient.saveObjects(PRODUCTS_INDEX, documents);
            log.info("Indexed {} products in search index", documents.size());
        } catch (Exception e) {
            log.error("Failed to index {} products in search index", products.size(), e);
        }
    }

    public void indexSaveOrUpdate(Product product) {
        try {
            algoliaClient.saveObject(PRODUCTS_INDEX, ProductSearchDocumentMapper.toDocument(product));
        } catch (Exception e) {
            log.error("Failed to save product {} in search index", product.getUuid(), e);
        }
    }

    public void remove(Product product) {
        try {
            algoliaClient.deleteObject(PRODUCTS_INDEX, String.valueOf(product.getUuid()));
        } catch (Exception e) {
            log.error("Failed to remove product {} from search index", product.getUuid(), e);
        }
    }

    public void deleteAll() {
        try {
            algoliaClient.clearObjects(PRODUCTS_INDEX);
            log.info("Cleared products search index");
        } catch (Exception e) {
            log.error("Failed to clear products search index", e);
        }
    }

    public Page<Product> search(String query, Pageable pageable) {
        try {
            var responses = algoliaClient.search(AlgoliaUtils.searchMethodParams(PRODUCTS_INDEX, query, pageable), Hit.class);

            if (!(responses.getResults().getFirst() instanceof SearchResponse<Hit> result) || result.getHits().isEmpty()) {
                return Page.empty(pageable);
            }

            var uuids = AlgoliaUtils.generatorUuids(result.getHits());

            var byUuid = repository.findByUuidIn(uuids).stream().collect(Collectors.toMap(Product::getUuid, Function.identity()));

            var products = uuids.stream().map(byUuid::get).filter(Objects::nonNull).toList();

            return new PageImpl<>(products, pageable, Optional.ofNullable(result.getNbHits()).orElse(0));
        } catch (Exception e) {
            log.error("Failed to search products in search index", e);
            return Page.empty(pageable);
        }
    }
}
