package com.negocil.negoturismo.admin.feature.organization.service;

import com.negocil.negoturismo.admin.feature.organization.exception.OrganizationHighlightsNotFoundException;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationHighlights;
import com.negocil.negoturismo.admin.feature.organization.repository.OrganizationHighlightsRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OrganizationHighlightsService implements IFindOrCreate<OrganizationHighlights> {
    private final OrganizationHighlightsRepository repository;

    public OrganizationHighlightsService(OrganizationHighlightsRepository repository) {
        this.repository = repository;
    }

    public Page<OrganizationHighlights> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<OrganizationHighlights> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    public OrganizationHighlights findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new OrganizationHighlightsNotFoundException(id));
    }

    public OrganizationHighlights save(OrganizationHighlights data) {
        var org = data.getOrganization();
        data.setConcat(org.getName() + ", " + org.getEmail() + ", " + org.getPhone() + ", " + org.getDescription() + ", " + data.getStatus());
        return repository.save(data);
    }

    public OrganizationHighlights update(Long id, OrganizationHighlights data) {
        var item = findById(id);
        item.setOrganization(data.getOrganization());
        item.setStatus(data.getStatus());
        item.setStartedAt(data.getStartedAt());
        item.setCompletedAt(data.getCompletedAt());
        var org = item.getOrganization();
        item.setConcat(org.getName() + ", " + org.getEmail() + ", " + org.getPhone() + ", " + org.getDescription() + ", " + item.getStatus());
        return repository.save(item);
    }

    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public OrganizationHighlights findOrCreate(OrganizationHighlights model) {
        return repository.findByOrganization(model.getOrganization())
                .orElseGet(() -> save(model));
    }
}
