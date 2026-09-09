package com.negocil.negoturismo.admin.feature.review.service;

import com.negocil.negoturismo.admin.feature.review.model.Review;
import com.negocil.negoturismo.admin.feature.review.repository.ReviewRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import org.springframework.stereotype.Service;

@Service
public class ReviewService extends ConcreteService<Review> implements IFindOrCreate<Review> {
    private final ReviewRepository repository;

    public ReviewService(ReviewRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public Review findOrCreate(Review model) {
        var list = repository.findByRatingAndContent(model.getRating(), model.getContent());
        if (!list.isEmpty()) return list.getFirst();
        return  save(model);
    }
}
