package com.negocil.negoturismo.admin.feature.tour_guide.dto.mapper;

import com.negocil.negoturismo.admin.feature.tour_guide.dto.request.TourGuideFilterPaginate;
import com.negocil.negoturismo.admin.feature.tour_guide.enums.TourGuideField;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TourGuideSpecification implements Specification<TourGuide> {

    private final TourGuideFilterPaginate filter;

    public TourGuideSpecification(TourGuideFilterPaginate filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(@NonNull Root<TourGuide> root, @NonNull CriteriaQuery<?> query, @NonNull CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.isNull(root.get("deletedBy")));
        predicates.add(cb.isNull(root.get("deletedAt")));

        Optional.ofNullable(filter.getSearch()).filter((it -> !it.isBlank())).ifPresent((it) -> {
            String search = it.toLowerCase();
            if (filter.getField() == TourGuideField.ALL || filter.getField() == TourGuideField.NAME) {
                predicates.add(cb.like(cb.lower(root.get("concat")), ("%" + search + "%")));
            }
        });

        return cb.and(predicates.toArray(new Predicate[0]));
    }
}
