package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.organization.model.OrganizationReviews;
import com.negocil.negoturismo.admin.feature.review.enums.ReviewData;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrganizationReviewsData {
    ORG_REVIEW_1(
            OrganizationReviews.builder()
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .review(ReviewData.REVIEW_1.getReview())
                    .build()
    ),
    ORG_REVIEW_2(
            OrganizationReviews.builder()
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .review(ReviewData.REVIEW_2.getReview())
                    .build()
    ),
    ORG_REVIEW_3(
            OrganizationReviews.builder()
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .review(ReviewData.REVIEW_3.getReview())
                    .build()
    ),
    ORG_REVIEW_4(
            OrganizationReviews.builder()
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .review(ReviewData.REVIEW_4.getReview())
                    .build()
    ),
    ORG_REVIEW_5(
            OrganizationReviews.builder()
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .review(ReviewData.REVIEW_5.getReview())
                    .build()
    ),
    ORG_REVIEW_6(
            OrganizationReviews.builder()
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .review(ReviewData.REVIEW_6.getReview())
                    .build()
    ),
    ORG_REVIEW_7(
            OrganizationReviews.builder()
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .review(ReviewData.REVIEW_7.getReview())
                    .build()
    ),
    ORG_REVIEW_8(
            OrganizationReviews.builder()
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .review(ReviewData.REVIEW_8.getReview())
                    .build()
    );

    private final OrganizationReviews organizationReviews;
}
