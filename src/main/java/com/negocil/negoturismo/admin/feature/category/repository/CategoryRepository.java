package com.negocil.negoturismo.admin.feature.category.repository;

import com.negocil.negoturismo.admin.feature.category.model.Category;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends ConcreteRepository<Category> {
    Optional<Category> findByName(String name);

    @Query(name = "Category.search", countQuery = "Category.countSearch")
    Page<Category> search(@Param("query") String query, Pageable pageable);
}