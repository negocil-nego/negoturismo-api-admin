package com.negocil.negoturismo.admin.feature.role.service;

import com.negocil.negoturismo.admin.feature.role.exception.RoleNotFoundException;
import com.negocil.negoturismo.admin.feature.role.dto.request.RoleFilterPaginate;
import com.negocil.negoturismo.admin.feature.role.dto.mapper.RoleSpecification;
import com.negocil.negoturismo.admin.feature.role.repository.RoleRepository;
import com.negocil.negoturismo.admin.feature.role.model.Role;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RoleService extends ConcreteService<Role> implements IFindOrCreate<Role> {
    private final RoleRepository repository;

    public RoleService(RoleRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Page<Role> findAll(RoleFilterPaginate roleFilterPaginate) {
        var spec = new RoleSpecification(roleFilterPaginate);
        return findAll(spec, roleFilterPaginate.toRequest());
    }

    public Page<Role> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    @Override
    public Role findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new RoleNotFoundException(uuid));
    }

    @Override
    public Role findOrCreate(Role model) {
        return repository.findByCode(model.getCode()).orElseGet(() -> repository.save(model));
    }
}
