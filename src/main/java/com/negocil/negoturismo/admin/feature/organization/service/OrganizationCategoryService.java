package com.negocil.negoturismo.admin.feature.organization.service;

import com.negocil.negoturismo.admin.feature.organization.exception.OrganizationCategoryNotFoundException;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationCategory;
import com.negocil.negoturismo.admin.feature.organization.repository.OrganizationCategoryRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OrganizationCategoryService implements IFindOrCreate<OrganizationCategory> {
    private final OrganizationCategoryRepository repository;

    public OrganizationCategoryService(OrganizationCategoryRepository repository) {
        this.repository = repository;
    }

    public Page<OrganizationCategory> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public OrganizationCategory findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new OrganizationCategoryNotFoundException(id));
    }

    public OrganizationCategory save(OrganizationCategory data) {
        var category = data.getCategory();
        var organization = data.getOrganization();
        data.setConcat(category.getName() + ", " + category.getCategoryGroup() + ", " + organization.getName());
        return repository.save(data);
    }

    public boolean deleteById(Long id) {
        var item = findById(id);
        repository.delete(item);
        return true;
    }

    @Override
    public OrganizationCategory findOrCreate(OrganizationCategory model) {
        return repository.findByOrganizationAndCategory(model.getOrganization(), model.getCategory())
                .orElseGet(() -> save(model));
    }
}
