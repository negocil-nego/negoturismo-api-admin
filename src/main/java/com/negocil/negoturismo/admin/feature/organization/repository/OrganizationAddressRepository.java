package com.negocil.negoturismo.admin.feature.organization.repository;

import com.negocil.negoturismo.admin.feature.address.model.Address;
import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizationAddressRepository extends JpaRepository<OrganizationAddress, Long>, JpaSpecificationExecutor<OrganizationAddress> {
    Optional<OrganizationAddress> findByOrganizationAndAddress(Organization organization, Address address);
}
