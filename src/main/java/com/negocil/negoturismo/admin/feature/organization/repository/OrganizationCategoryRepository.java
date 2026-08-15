package com.negocil.negoturismo.admin.feature.organization.repository;

import com.negocil.negoturismo.admin.feature.category.model.Category;
import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizationCategoryRepository extends JpaRepository<OrganizationCategory, Long>, JpaSpecificationExecutor<OrganizationCategory> {
    Optional<OrganizationCategory> findByOrganizationAndCategory(Organization organization, Category category);
}
