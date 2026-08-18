package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.product.model.ProductReviews;
import com.negocil.negoturismo.admin.feature.review.enums.ReviewData;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductReviewsData {
    PROD_REVIEW_1(
            ProductReviews.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SINGLE.getProduct())
                    .review(ReviewData.REVIEW_9.getReview())
                    .build()
    ),
    PROD_REVIEW_2(
            ProductReviews.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SINGLE.getProduct())
                    .review(ReviewData.REVIEW_1.getReview())
                    .build()
    ),
    PROD_REVIEW_3(
            ProductReviews.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SUITE.getProduct())
                    .review(ReviewData.REVIEW_3.getReview())
                    .build()
    ),
    PROD_REVIEW_4(
            ProductReviews.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SUITE.getProduct())
                    .review(ReviewData.REVIEW_10.getReview())
                    .build()
    ),
    PROD_REVIEW_5(
            ProductReviews.builder()
                    .product(ProductData.MIRAMAR_ROOM_DOUBLE.getProduct())
                    .review(ReviewData.REVIEW_5.getReview())
                    .build()
    ),
    PROD_REVIEW_6(
            ProductReviews.builder()
                    .product(ProductData.MIRAMAR_ROOM_DOUBLE.getProduct())
                    .review(ReviewData.REVIEW_6.getReview())
                    .build()
    ),
    PROD_REVIEW_7(
            ProductReviews.builder()
                    .product(ProductData.HUAMBO_ROOM_TWIN.getProduct())
                    .review(ReviewData.REVIEW_7.getReview())
                    .build()
    ),
    PROD_REVIEW_8(
            ProductReviews.builder()
                    .product(ProductData.HUAMBO_ROOM_TWIN.getProduct())
                    .review(ReviewData.REVIEW_8.getReview())
                    .build()
    );

    private final ProductReviews productReviews;
}
