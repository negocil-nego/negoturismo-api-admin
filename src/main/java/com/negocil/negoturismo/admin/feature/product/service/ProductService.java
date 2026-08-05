package com.negocil.negoturismo.admin.feature.product.service;

import com.negocil.negoturismo.admin.feature.product.exception.ProductNotFoundException;
import com.negocil.negoturismo.admin.feature.product.dto.request.ProductFilterPaginate;
import com.negocil.negoturismo.admin.feature.product.dto.mapper.ProductSpecification;
import com.negocil.negoturismo.admin.feature.product.repository.ProductRepository;
import com.negocil.negoturismo.admin.feature.product.model.Product;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import com.negocil.negoturismo.admin.shared.core.util.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductService extends ConcreteService<Product> implements IFindOrCreate<Product> {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Page<Product> findAll(ProductFilterPaginate productFilterPaginate) {
        var spec = new ProductSpecification(productFilterPaginate);
        return findAll(spec, productFilterPaginate.toRequest());
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
        data.setSlug(StringUtils.generateFlag(data.getName()));
        return super.save(data);
    }

    @Override
    public Product findOrCreate(Product model) {
        return repository.findByName(model.getName()).orElseGet(() -> save(model));
    }
}
