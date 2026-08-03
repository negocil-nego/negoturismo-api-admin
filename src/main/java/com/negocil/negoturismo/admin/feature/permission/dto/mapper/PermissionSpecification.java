package com.negocil.negoturismo.admin.feature.permission.dto.mapper;

import com.negocil.negoturismo.admin.feature.permission.dto.request.PermissionFilterPaginate;
import com.negocil.negoturismo.admin.feature.permission.enums.PermissionField;
import com.negocil.negoturismo.admin.feature.permission.model.Permission;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PermissionSpecification implements Specification<Permission> {

    private final PermissionFilterPaginate filter;

    public PermissionSpecification(PermissionFilterPaginate filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(@NonNull Root<Permission> root, @NonNull CriteriaQuery<?> query, @NonNull CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.isNull(root.get("deletedBy")));
        predicates.add(cb.isNull(root.get("deletedAt")));

        Optional.ofNullable(filter.getSearch()).filter((it -> !it.isBlank())).ifPresent((it) -> {
            String search = it.toLowerCase();
            if (filter.getField() == PermissionField.ALL) {
                predicates.add(cb.or(
                    cb.like(cb.lower(root.get("code")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("name")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("description")), ("%" + search + "%"))
                ));
            } else if (filter.getField() == PermissionField.CODE) {
                predicates.add(cb.like(cb.lower(root.get("code")), ("%" + search + "%")));
            } else if (filter.getField() == PermissionField.NAME) {
                predicates.add(cb.like(cb.lower(root.get("name")), ("%" + search + "%")));
            } else if (filter.getField() == PermissionField.DESCRIPTION) {
                predicates.add(cb.like(cb.lower(root.get("description")), ("%" + search + "%")));
            }
        });

        return cb.and(predicates.toArray(new Predicate[0]));
    }
}
