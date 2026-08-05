package com.negocil.negoturismo.admin.feature.permission.service;

import com.negocil.negoturismo.admin.feature.permission.exception.PermissionNotFoundException;

import com.negocil.negoturismo.admin.feature.permission.repository.PermissionRepository;
import com.negocil.negoturismo.admin.feature.permission.model.Permission;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PermissionService extends ConcreteService<Permission> implements IFindOrCreate<Permission> {
    private final PermissionRepository repository;

    public PermissionService(PermissionRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Page<Permission> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Permission> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    @Override
    public Permission findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new PermissionNotFoundException(uuid));
    }

    @Override
    public Permission findOrCreate(Permission model) {
        return repository.findByCode(model.getCode()).orElseGet(() -> repository.save(model));
    }
}
