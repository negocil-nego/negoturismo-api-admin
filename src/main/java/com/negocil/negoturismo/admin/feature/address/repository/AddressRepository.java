package com.negocil.negoturismo.admin.feature.address.repository;

import com.negocil.negoturismo.admin.feature.address.model.Address;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends ConcreteRepository<Address> {
}
