package com.negocil.negoturismo.admin.feature.user.dto.mapper;

import com.negocil.negoturismo.admin.feature.user.dto.request.UserFilterPaginate;
import com.negocil.negoturismo.admin.feature.user.enums.UserField;
import com.negocil.negoturismo.admin.feature.user.model.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserSpecification implements Specification<User> {

    private final UserFilterPaginate filter;

    public UserSpecification(UserFilterPaginate filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(@NonNull Root<User> root, @NonNull CriteriaQuery<?> query, @NonNull CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.isNull(root.get("deletedBy")));
        predicates.add(cb.isNull(root.get("deletedAt")));

        Optional.ofNullable(filter.getSearch()).filter((it -> !it.isBlank())).ifPresent((it) -> {
            String search = it.toLowerCase();
            if (filter.getField() == UserField.ALL) {
                predicates.add(cb.or(
                    cb.like(cb.lower(root.get("name")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("username")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("email")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("phone")), ("%" + search + "%"))
                ));
            } else if (filter.getField() == UserField.NAME) {
                predicates.add(cb.like(cb.lower(root.get("name")), ("%" + search + "%")));
            } else if (filter.getField() == UserField.USERNAME) {
                predicates.add(cb.like(cb.lower(root.get("username")), ("%" + search + "%")));
            } else if (filter.getField() == UserField.EMAIL) {
                predicates.add(cb.like(cb.lower(root.get("email")), ("%" + search + "%")));
            } else if (filter.getField() == UserField.PHONE) {
                predicates.add(cb.like(cb.lower(root.get("phone")), ("%" + search + "%")));
            }
        });

        return cb.and(predicates.toArray(new Predicate[0]));
    }
}
