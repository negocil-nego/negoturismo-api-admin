package com.negocil.negoturismo.admin.feature.product.service;

import com.negocil.negoturismo.admin.feature.product.model.ProductAddress;
import com.negocil.negoturismo.admin.feature.product.repository.ProductAddressRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductAddressService implements IFindOrCreate<ProductAddress> {
    private final ProductAddressRepository repository;

    public ProductAddressService(ProductAddressRepository repository) {
        this.repository = repository;
    }

    public Page<ProductAddress> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public ProductAddress save(ProductAddress data) {
        return repository.save(data);
    }

    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public ProductAddress findOrCreate(ProductAddress model) {
        return repository.findByProductAndAddress(model.getProduct(), model.getAddress())
                .orElseGet(() -> save(model));
    }
}
