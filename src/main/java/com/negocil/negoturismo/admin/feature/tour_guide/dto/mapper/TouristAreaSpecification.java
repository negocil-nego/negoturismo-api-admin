package com.negocil.negoturismo.admin.feature.tour_guide.dto.mapper;

import com.negocil.negoturismo.admin.feature.tour_guide.dto.request.TouristAreaFilterPaginate;
import com.negocil.negoturismo.admin.feature.tour_guide.enums.TouristAreaField;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TouristAreaSpecification implements Specification<TouristArea> {

    private final TouristAreaFilterPaginate filter;

    public TouristAreaSpecification(TouristAreaFilterPaginate filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(@NonNull Root<TouristArea> root, @NonNull CriteriaQuery<?> query, @NonNull CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.isNull(root.get("deletedBy")));
        predicates.add(cb.isNull(root.get("deletedAt")));

        Optional.ofNullable(filter.getSearch()).filter((it -> !it.isBlank())).ifPresent((it) -> {
            String search = it.toLowerCase();
            if (filter.getField() == TouristAreaField.ALL) {
                predicates.add(cb.or(
                    cb.like(cb.lower(root.get("name")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("state")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("address")), ("%" + search + "%"))
                ));
            } else if (filter.getField() == TouristAreaField.NAME) {
                predicates.add(cb.like(cb.lower(root.get("name")), ("%" + search + "%")));
            } else if (filter.getField() == TouristAreaField.STATE) {
                predicates.add(cb.like(cb.lower(root.get("state")), ("%" + search + "%")));
            } else if (filter.getField() == TouristAreaField.ADDRESS) {
                predicates.add(cb.like(cb.lower(root.get("address")), ("%" + search + "%")));
            }
        });

        return cb.and(predicates.toArray(new Predicate[0]));
    }
}
