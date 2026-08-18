package com.negocil.negoturismo.admin.feature.review.repository;

import com.negocil.negoturismo.admin.feature.review.model.Review;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends ConcreteRepository<Review> {
    List<Review> findByRatingAndContent(Integer rating, String content);
}
