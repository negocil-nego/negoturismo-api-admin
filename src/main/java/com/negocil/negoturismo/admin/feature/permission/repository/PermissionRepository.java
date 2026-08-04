package com.negocil.negoturismo.admin.feature.permission.repository;

import com.negocil.negoturismo.admin.feature.permission.model.Permission;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PermissionRepository extends ConcreteRepository<Permission> {
    Optional<Permission> findByCode(String code);

    @Query(name = "Permission.search", countQuery = "Permission.countSearch")
    Page<Permission> search(@Param("query") String query, Pageable pageable);
}
