package com.negocil.negoturismo.admin.feature.product.service;

import com.negocil.negoturismo.admin.feature.product.model.ProductReviews;
import com.negocil.negoturismo.admin.feature.product.repository.ProductReviewsRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductReviewsService implements IFindOrCreate<ProductReviews> {
    private final ProductReviewsRepository repository;

    public ProductReviewsService(ProductReviewsRepository repository) {
        this.repository = repository;
    }

    public Page<ProductReviews> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public ProductReviews save(ProductReviews data) {
        return repository.save(data);
    }

    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public ProductReviews findOrCreate(ProductReviews model) {
        return repository.findByProductAndReview(model.getProduct(), model.getReview())
                .orElseGet(() -> save(model));
    }
}
