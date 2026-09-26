package com.negocil.negoturismo.admin.feature.address.repository;

import com.negocil.negoturismo.admin.feature.address.model.UserAddress;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAddressRepository extends ConcreteRepository<UserAddress> {
    Optional<UserAddress> findByUserId(Long userId);
}
