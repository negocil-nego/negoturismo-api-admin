package com.negocil.negoturismo.admin.feature.user.repository;

import com.negocil.negoturismo.admin.feature.user.model.User;
import com.negocil.negoturismo.admin.feature.user.util.UserQuery;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends ConcreteRepository<User> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findByPhone(String phone);

    @NativeQuery(value = UserQuery.USER_SEARCH, countQuery = UserQuery.USER_SEARCH_COUNT)
    Page<User> search(@Param("query") String query, Pageable pageable);
}
