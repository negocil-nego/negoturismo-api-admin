package com.negocil.negoturismo.admin.feature.organization.service;

import com.negocil.negoturismo.admin.feature.organization.exception.OrganizationNotFoundException;
import com.negocil.negoturismo.admin.feature.organization.dto.request.OrganizationFilterPaginate;
import com.negocil.negoturismo.admin.feature.organization.dto.mapper.OrganizationSpecification;
import com.negocil.negoturismo.admin.feature.organization.repository.OrganizationRepository;
import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import com.negocil.negoturismo.admin.shared.core.util.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrganizationService extends ConcreteService<Organization> implements IFindOrCreate<Organization> {
    private final OrganizationRepository repository;

    public OrganizationService(OrganizationRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Page<Organization> findAll(OrganizationFilterPaginate organizationFilterPaginate) {
        var spec = new OrganizationSpecification(organizationFilterPaginate);
        return findAll(spec, organizationFilterPaginate.toRequest());
    }

    public Page<Organization> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    @Override
    public Organization findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new OrganizationNotFoundException(uuid));
    }

    @Override
    public Organization save(Organization data) {
        data.setSlug(StringUtils.generateFlag(data.getName()));
        return super.save(data);
    }

    @Override
    public Organization findOrCreate(Organization model) {
        return repository.findByName(model.getName()).orElseGet(() -> save(model));
    }
}
