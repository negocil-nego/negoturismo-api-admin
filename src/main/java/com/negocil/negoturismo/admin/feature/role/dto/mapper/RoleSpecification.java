package com.negocil.negoturismo.admin.feature.role.dto.mapper;

import com.negocil.negoturismo.admin.feature.role.dto.request.RoleFilterPaginate;
import com.negocil.negoturismo.admin.feature.role.enums.RoleField;
import com.negocil.negoturismo.admin.feature.role.model.Role;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RoleSpecification implements Specification<Role> {

    private final RoleFilterPaginate filter;

    public RoleSpecification(RoleFilterPaginate filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(@NonNull Root<Role> root, @NonNull CriteriaQuery<?> query, @NonNull CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.isNull(root.get("deletedBy")));
        predicates.add(cb.isNull(root.get("deletedAt")));

        Optional.ofNullable(filter.getSearch()).filter((it -> !it.isBlank())).ifPresent((it) -> {
            String search = it.toLowerCase();
            if (filter.getField() == RoleField.ALL) {
                predicates.add(cb.or(
                    cb.like(cb.lower(root.get("code")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("name")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("description")), ("%" + search + "%"))
                ));
            } else if (filter.getField() == RoleField.CODE) {
                predicates.add(cb.like(cb.lower(root.get("code")), ("%" + search + "%")));
            } else if (filter.getField() == RoleField.NAME) {
                predicates.add(cb.like(cb.lower(root.get("name")), ("%" + search + "%")));
            } else if (filter.getField() == RoleField.DESCRIPTION) {
                predicates.add(cb.like(cb.lower(root.get("description")), ("%" + search + "%")));
            }
        });

        return cb.and(predicates.toArray(new Predicate[0]));
    }
}
