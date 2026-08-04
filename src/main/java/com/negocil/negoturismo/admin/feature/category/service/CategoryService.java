package com.negocil.negoturismo.admin.feature.category.service;

import com.negocil.negoturismo.admin.feature.category.exception.CategoryNotFoundException;
import com.negocil.negoturismo.admin.feature.category.dto.request.CategoryFilterPaginate;
import com.negocil.negoturismo.admin.feature.category.dto.mapper.CategorySpecification;
import com.negocil.negoturismo.admin.feature.category.repository.CategoryRepository;
import com.negocil.negoturismo.admin.feature.category.model.Category;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import com.negocil.negoturismo.admin.shared.core.util.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CategoryService extends ConcreteService<Category> implements IFindOrCreate<Category> {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Page<Category> findAll(CategoryFilterPaginate categoryFilterPaginate) {
        var spec = new CategorySpecification(categoryFilterPaginate);
        return findAll(spec, categoryFilterPaginate.toRequest());
    }

    public Page<Category> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    @Override
    public Category findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new CategoryNotFoundException(uuid));
    }

    @Override
    public Category save(Category data) {
        data.setSlug(StringUtils.generateFlag(data.getName()));
        return super.save(data);
    }

    @Override
    public Category findOrCreate(Category model) {
        return repository.findByName(model.getName()).orElseGet(() -> save(model));
    }
}