package com.negocil.negoturismo.admin.feature.socialnetwork.repository;

import com.negocil.negoturismo.admin.feature.socialnetwork.model.SocialNetwork;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SocialNetworkRepository extends ConcreteRepository<SocialNetwork> {
    Optional<SocialNetwork> findByUserId(Long userId);
}
