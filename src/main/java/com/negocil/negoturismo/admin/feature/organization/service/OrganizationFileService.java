package com.negocil.negoturismo.admin.feature.organization.service;

import com.negocil.negoturismo.admin.feature.organization.exception.OrganizationFileNotFoundException;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationFile;
import com.negocil.negoturismo.admin.feature.organization.repository.OrganizationFileRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OrganizationFileService implements IFindOrCreate<OrganizationFile> {
    private final OrganizationFileRepository repository;

    public OrganizationFileService(OrganizationFileRepository repository) {
        this.repository = repository;
    }

    public Page<OrganizationFile> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public OrganizationFile findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new OrganizationFileNotFoundException(id));
    }

    public OrganizationFile save(OrganizationFile data) {
        return repository.save(data);
    }

    public boolean deleteById(Long id) {
        var item = findById(id);
        repository.delete(item);
        return true;
    }

    @Override
    public OrganizationFile findOrCreate(OrganizationFile model) {
        return repository.findByOrganizationAndDoc(model.getOrganization(), model.getDoc())
                .orElseGet(() -> save(model));
    }
}
