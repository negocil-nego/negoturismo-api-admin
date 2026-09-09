package com.negocil.negoturismo.admin.feature.product.service;

import com.negocil.negoturismo.admin.feature.product.exception.ProductFileNotFoundException;
import com.negocil.negoturismo.admin.feature.product.model.ProductFile;
import com.negocil.negoturismo.admin.feature.product.repository.ProductFileRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductFileService implements IFindOrCreate<ProductFile> {
    private final ProductFileRepository repository;

    public ProductFileService(ProductFileRepository repository) {
        this.repository = repository;
    }

    public Page<ProductFile> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public ProductFile findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ProductFileNotFoundException(id));
    }

    public ProductFile save(ProductFile data) {
        return repository.save(data);
    }

    public boolean deleteById(Long id) {
        var item = findById(id);
        repository.delete(item);
        return true;
    }

    @Override
    public ProductFile findOrCreate(ProductFile model) {
        return repository.findByProductAndDoc(model.getProduct(), model.getDoc())
                .orElseGet(() -> save(model));
    }
}
