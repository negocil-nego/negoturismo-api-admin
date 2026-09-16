package com.negocil.negoturismo.admin.shared.user.repository;

import com.negocil.negoturismo.admin.shared.user.model.User;
import com.negocil.negoturismo.admin.shared.user.util.UserQuery;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.Optional;

@Repository
public interface UserRepository extends ConcreteRepository<User> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findByPhone(String phone);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE User u SET u.tokensInvalidatedAt = :tokensInvalidatedAt WHERE u.id = :id")
    void updateTokensInvalidatedAtById(@Param("id") Long id, @Param("tokensInvalidatedAt") Instant tokensInvalidatedAt);

    @NativeQuery(value = UserQuery.USER_SEARCH, countQuery = UserQuery.USER_SEARCH_COUNT)
    Page<User> search(@Param("query") String query, Pageable pageable);
}
