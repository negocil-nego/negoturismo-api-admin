package com.negocil.negoturismo.admin.feature.role.repository;

import com.negocil.negoturismo.admin.feature.role.model.Role;
import com.negocil.negoturismo.admin.feature.role.util.RoleQuery;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends ConcreteRepository<Role> {
    Optional<Role> findByCode(String code);

    @NativeQuery(value = RoleQuery.ROLE_SEARCH, countQuery = RoleQuery.ROLE_SEARCH_COUNT)
    Page<Role> search(@Param("query") String query, Pageable pageable);
}
