package com.negocil.negoturismo.admin.feature.category.dto.mapper;

import com.negocil.negoturismo.admin.feature.category.dto.request.CategoryFilterPaginate;
import com.negocil.negoturismo.admin.feature.category.enums.CategoryField;
import com.negocil.negoturismo.admin.feature.category.model.Category;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CategorySpecification implements Specification<Category> {

    private final CategoryFilterPaginate filter;

    public CategorySpecification(CategoryFilterPaginate filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(@NonNull Root<Category> root, @NonNull CriteriaQuery<?> query, @NonNull CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.isNull(root.get("deletedBy")));
        predicates.add(cb.isNull(root.get("deletedAt")));

        Optional.ofNullable(filter.getSearch()).filter((it -> !it.isBlank())).ifPresent((it) -> {
            String search = it.toLowerCase();
            if (filter.getField() == CategoryField.ALL) {
                predicates.add(cb.or(
                    cb.like(cb.lower(root.get("name")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("description")), ("%" + search + "%"))
                ));
            } else if (filter.getField() == CategoryField.NAME) {
                predicates.add(cb.like(cb.lower(root.get("name")), ("%" + search + "%")));
            } else if (filter.getField() == CategoryField.DESCRIPTION) {
                predicates.add(cb.like(cb.lower(root.get("description")), ("%" + search + "%")));
            }
        });

        return cb.and(predicates.toArray(new Predicate[0]));
    }
}