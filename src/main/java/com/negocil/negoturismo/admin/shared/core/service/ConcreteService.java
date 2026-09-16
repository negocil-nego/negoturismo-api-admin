package com.negocil.negoturismo.admin.shared.core.service;


import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.beans.BeanUtils;

import java.time.Instant;
import java.util.UUID;

public abstract class ConcreteService<T extends ConcreteModel> extends CommonService<T> {
    
    private final ConcreteRepository<T> repository;

    public ConcreteService(ConcreteRepository<T> repository) {
        super(repository);
        this.repository = repository;
    }

    public T findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new NotFoundException(uuid));
    }

    public T update(UUID uuid, T data) {
        var item = findByUuid(uuid);;
        BeanUtils.copyProperties(data, item, "id", "uuid");
        return save(data);
    }

    @Override
    public T update(long id, T data) {
        var item = findById(id);
        BeanUtils.copyProperties(data, item, "id", "uuid");
        return save(item);
    }

    public boolean deleteByUuid(UUID uuid) {
        var item = findByUuid(uuid);
        item.setDeletedAt(Instant.now());
        super.save(item);
        return true;
    }

}
