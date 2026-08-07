package com.negocil.negoturismo.admin.feature.organization.repository;

import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.organization.util.OrganizationQuery;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizationRepository extends ConcreteRepository<Organization> {
    Optional<Organization> findByName(String name);

    @NativeQuery(value = OrganizationQuery.ORGANIZATION_SEARCH, countQuery = OrganizationQuery.ORGANIZATION_SEARCH_COUNT)
    Page<Organization> search(@Param("query") String query, Pageable pageable);
}
