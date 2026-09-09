package com.negocil.negoturismo.admin.feature.organization.repository;

import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationReviews;
import com.negocil.negoturismo.admin.feature.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizationReviewsRepository extends JpaRepository<OrganizationReviews, Long>, JpaSpecificationExecutor<OrganizationReviews> {
    Optional<OrganizationReviews> findByOrganizationAndReview(Organization organization, Review review);
}
