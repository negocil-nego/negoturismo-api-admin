package com.negocil.negoturismo.admin.feature.organization.dto.mapper;

import com.negocil.negoturismo.admin.feature.organization.dto.request.OrganizationFilterPaginate;
import com.negocil.negoturismo.admin.feature.organization.enums.OrganizationField;
import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrganizationSpecification implements Specification<Organization> {

    private final OrganizationFilterPaginate filter;

    public OrganizationSpecification(OrganizationFilterPaginate filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(@NonNull Root<Organization> root, @NonNull CriteriaQuery<?> query, @NonNull CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.isNull(root.get("deletedBy")));
        predicates.add(cb.isNull(root.get("deletedAt")));

        Optional.ofNullable(filter.getSearch()).filter((it -> !it.isBlank())).ifPresent((it) -> {
            String search = it.toLowerCase();
            if (filter.getField() == OrganizationField.ALL) {
                predicates.add(cb.or(
                    cb.like(cb.lower(root.get("name")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("email")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("phone")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("description")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("address")), ("%" + search + "%"))
                ));
            } else if (filter.getField() == OrganizationField.NAME) {
                predicates.add(cb.like(cb.lower(root.get("name")), ("%" + search + "%")));
            } else if (filter.getField() == OrganizationField.EMAIL) {
                predicates.add(cb.like(cb.lower(root.get("email")), ("%" + search + "%")));
            } else if (filter.getField() == OrganizationField.PHONE) {
                predicates.add(cb.like(cb.lower(root.get("phone")), ("%" + search + "%")));
            } else if (filter.getField() == OrganizationField.DESCRIPTION) {
                predicates.add(cb.like(cb.lower(root.get("description")), ("%" + search + "%")));
            } else if (filter.getField() == OrganizationField.ADDRESS) {
                predicates.add(cb.like(cb.lower(root.get("address")), ("%" + search + "%")));
            }
        });

        return cb.and(predicates.toArray(new Predicate[0]));
    }
}
