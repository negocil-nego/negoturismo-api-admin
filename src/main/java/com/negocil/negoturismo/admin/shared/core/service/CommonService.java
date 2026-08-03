package com.negocil.negoturismo.admin.shared.core.service;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;
import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import com.negocil.negoturismo.admin.shared.core.repository.CommonRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.UUID;

@AllArgsConstructor
abstract public class CommonService<T extends CommonModel> {

    private CommonRepository<T> repository;

    public T findById(long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public Page<T> findAll(Specification<T> spec, Pageable  pageable) { return  repository.findAll(spec, pageable); }

    public T save(T data) {
        return repository.save(data);
    }

    public T update(UUID uuid, T data) {
        var item = repository.findByUuid(uuid).orElseThrow(NotFoundException::new);
        data.setId(item.getId());
        return save(data);
    }

    public T update(long id, T data) {
        var item = repository.findById(id).orElseThrow(NotFoundException::new);
        data.setId(item.getId());
        return save(data);
    }

    public boolean deleteByUuid(UUID uuid) {
        repository.deleteByUuid(uuid);
        return true;
    }

    public boolean deleteAll() {
        repository.deleteAll();
        return true;
    }
}
