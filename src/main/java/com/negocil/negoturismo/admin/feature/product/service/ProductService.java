package com.negocil.negoturismo.admin.feature.product.service;

import com.negocil.negoturismo.admin.feature.product.exception.ProductNotFoundException;

import com.negocil.negoturismo.admin.feature.product.repository.ProductRepository;
import com.negocil.negoturismo.admin.feature.product.model.Product;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import com.negocil.negoturismo.admin.shared.core.util.StringUtils;
import com.negocil.negoturismo.admin.shared.full_search.shared.service.ProductFullSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductService extends ConcreteService<Product> implements IFindOrCreate<Product> {
    private final ProductRepository repository;
    private final ProductFullSearchService fullSearch;

    public ProductService(ProductRepository repository, ProductFullSearchService fullSearch) {
        super(repository);
        this.repository = repository;
        this.fullSearch = fullSearch;
    }

    public Page<Product> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Product> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    @Override
    public Product findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new ProductNotFoundException(uuid));
    }

    @Override
    public Product save(Product data) {
        data.setSlug(StringUtils.generateSlug(data.getName()));
        var product = super.save(data);
        fullSearch.indexSaveOrUpdate(product);
        return product;
    }

    @Override
    public Product update(long id, Product data) {
        data.setSlug(StringUtils.generateSlug(data.getName()));
        var product = super.update(id, data);
        fullSearch.indexSaveOrUpdate(product);
        return product;
    }

    @Override
    public Product update(UUID uuid, Product data) {
        data.setSlug(StringUtils.generateSlug(data.getName()));
        var product = super.update(uuid, data);
        fullSearch.indexSaveOrUpdate(product);
        return product;
    }

    @Override
    public boolean deleteByUuid(UUID uuid) {
        var product = findByUuid(uuid);
        var deleted = super.deleteByUuid(uuid);
        fullSearch.remove(product);
        return deleted;
    }

    @Override
    public Product findOrCreate(Product model) {
        return repository.findByName(model.getName()).orElseGet(() -> save(model));
    }
}
