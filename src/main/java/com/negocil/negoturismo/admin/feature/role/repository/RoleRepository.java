package com.negocil.negoturismo.admin.feature.role.repository;

import com.negocil.negoturismo.admin.feature.role.model.Role;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends ConcreteRepository<Role> {
    Optional<Role> findByCode(String code);

    @Query(name = "Role.search", countQuery = "Role.countSearch")
    Page<Role> search(@Param("query") String query, Pageable pageable);
}
