package com.negocil.negoturismo.admin.feature.role.repository;

import com.negocil.negoturismo.admin.feature.role.model.Role;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends ConcreteRepository<Role> {
    Optional<Role> findByCode(String code);
}
