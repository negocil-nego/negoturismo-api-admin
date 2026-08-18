package com.negocil.negoturismo.admin.feature.organization.service;

import com.negocil.negoturismo.admin.feature.organization.model.OrganizationAddress;
import com.negocil.negoturismo.admin.feature.organization.repository.OrganizationAddressRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OrganizationAddressService implements IFindOrCreate<OrganizationAddress> {
    private final OrganizationAddressRepository repository;

    public OrganizationAddressService(OrganizationAddressRepository repository) {
        this.repository = repository;
    }

    public Page<OrganizationAddress> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public OrganizationAddress save(OrganizationAddress data) {
        return repository.save(data);
    }

    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public OrganizationAddress findOrCreate(OrganizationAddress model) {
        return repository.findByOrganizationAndAddress(model.getOrganization(), model.getAddress())
                .orElseGet(() -> save(model));
    }
}
