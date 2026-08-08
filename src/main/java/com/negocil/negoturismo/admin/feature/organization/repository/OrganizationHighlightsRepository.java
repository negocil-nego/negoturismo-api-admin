package com.negocil.negoturismo.admin.feature.organization.repository;

import com.negocil.negoturismo.admin.feature.organization.model.OrganizationHighlights;
import com.negocil.negoturismo.admin.feature.organization.util.OrganizationHighlightsQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import java.util.Optional;

@Repository
public interface OrganizationHighlightsRepository extends JpaRepository<OrganizationHighlights, Long>, JpaSpecificationExecutor<OrganizationHighlights> {
    @NativeQuery(value = OrganizationHighlightsQuery.ORGANIZATION_HIGHLIGHTS_SEARCH, countQuery = OrganizationHighlightsQuery.ORGANIZATION_HIGHLIGHTS_SEARCH_COUNT)
    Page<OrganizationHighlights> search(@Param("query") String query, Pageable pageable);

    Optional<OrganizationHighlights> findByOrganization(Organization organization);

    @Modifying
    @Transactional
    @Query("UPDATE OrganizationHighlights o SET o.status = com.negocil.negoturismo.admin.feature.organization.enums.OrganizationHighlightsStatus.EXPIRED WHERE o.completedAt < :now AND o.status != com.negocil.negoturismo.admin.feature.organization.enums.OrganizationHighlightsStatus.EXPIRED")
    int updateStatusToExpired(@Param("now") Instant now);
}
