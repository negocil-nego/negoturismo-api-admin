package com.negocil.negoturismo.admin.feature.category.repository;

import com.negocil.negoturismo.admin.feature.category.model.Category;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends ConcreteRepository<Category> {
    Optional<Category> findByName(String name);
}