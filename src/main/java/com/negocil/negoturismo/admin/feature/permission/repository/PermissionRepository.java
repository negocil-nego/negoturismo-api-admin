package com.negocil.negoturismo.admin.feature.permission.repository;

import com.negocil.negoturismo.admin.feature.permission.model.Permission;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PermissionRepository extends ConcreteRepository<Permission> {
    Optional<Permission> findByCode(String code);
}
