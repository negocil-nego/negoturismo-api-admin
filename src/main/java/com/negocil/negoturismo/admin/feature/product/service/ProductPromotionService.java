package com.negocil.negoturismo.admin.feature.product.service;

import com.negocil.negoturismo.admin.feature.product.exception.ProductPromotionNotFoundException;
import com.negocil.negoturismo.admin.feature.product.model.ProductPromotion;
import com.negocil.negoturismo.admin.feature.product.repository.ProductPromotionRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductPromotionService implements IFindOrCreate<ProductPromotion> {
    private final ProductPromotionRepository repository;

    public ProductPromotionService(ProductPromotionRepository repository) {
        this.repository = repository;
    }

    public Page<ProductPromotion> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<ProductPromotion> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    public ProductPromotion findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ProductPromotionNotFoundException(id));
    }

    public ProductPromotion save(ProductPromotion data) {
        data.setConcat(data.getProduct().getName() + ", " + data.getProduct().getDescription() + ", " + data.getStatus());
        return repository.save(data);
    }

    public ProductPromotion update(Long id, ProductPromotion data) {
        var item = findById(id);
        item.setProduct(data.getProduct());
        item.setStatus(data.getStatus());
        item.setStartedAt(data.getStartedAt());
        item.setCompletedAt(data.getCompletedAt());
        item.setConcat(data.getProduct().getName() + ", " + data.getProduct().getDescription() + ", " + data.getStatus());
        return repository.save(item);
    }

    public boolean deleteById(Long id) {
        var item = findById(id);
        repository.delete(item);
        return true;
    }

    @Override
    public ProductPromotion findOrCreate(ProductPromotion model) {
        return repository.findByProduct(model.getProduct())
                .orElseGet(() -> save(model));
    }
}
