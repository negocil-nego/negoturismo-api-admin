package com.negocil.negoturismo.admin.feature.organization.service;

import com.negocil.negoturismo.admin.feature.organization.exception.OrganizationNotFoundException;

import com.negocil.negoturismo.admin.feature.organization.repository.OrganizationRepository;
import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import com.negocil.negoturismo.admin.shared.core.util.StringUtils;
import com.negocil.negoturismo.admin.shared.full_search.shared.service.OrganizationFullSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrganizationService extends ConcreteService<Organization> implements IFindOrCreate<Organization> {
    private final OrganizationRepository repository;
    private final OrganizationFullSearchService fullSearch;

    public OrganizationService(OrganizationRepository repository, OrganizationFullSearchService fullSearch) {
        super(repository);
        this.repository = repository;
        this.fullSearch = fullSearch;
    }

    public Page<Organization> findAll(Pageable pageable) {
        return repository.findAll(pageable);
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
        data.setSlug(StringUtils.generateSlug(data.getName()));
        var organization = super.save(data);
        fullSearch.indexSaveOrUpdate(organization);
        return organization;
    }

    @Override
    public Organization update(long id, Organization data) {
        data.setSlug(StringUtils.generateSlug(data.getName()));
        var organization = super.update(id, data);
        fullSearch.indexSaveOrUpdate(organization);
        return organization;
    }

    @Override
    public Organization update(UUID uuid, Organization data) {
        data.setSlug(StringUtils.generateSlug(data.getName()));
        var organization = super.update(uuid, data);
        fullSearch.indexSaveOrUpdate(organization);
        return organization;
    }

    @Override
    public boolean deleteByUuid(UUID uuid) {
        var organization = findByUuid(uuid);
        var deleted = super.deleteByUuid(uuid);
        fullSearch.remove(organization);
        return deleted;
    }

    @Override
    public Organization findOrCreate(Organization model) {
        return repository.findByName(model.getName()).orElseGet(() -> save(model));
    }
}
