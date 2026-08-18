package com.negocil.negoturismo.admin.feature.product.repository;

import com.negocil.negoturismo.admin.feature.product.model.Product;
import com.negocil.negoturismo.admin.feature.product.model.ProductReviews;
import com.negocil.negoturismo.admin.feature.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductReviewsRepository extends JpaRepository<ProductReviews, Long>, JpaSpecificationExecutor<ProductReviews> {
    Optional<ProductReviews> findByProductAndReview(Product product, Review review);
}
