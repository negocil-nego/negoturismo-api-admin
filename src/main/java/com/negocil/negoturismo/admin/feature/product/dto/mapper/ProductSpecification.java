package com.negocil.negoturismo.admin.feature.product.dto.mapper;

import com.negocil.negoturismo.admin.feature.product.dto.request.ProductFilterPaginate;
import com.negocil.negoturismo.admin.feature.product.enums.ProductField;
import com.negocil.negoturismo.admin.feature.product.model.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductSpecification implements Specification<Product> {

    private final ProductFilterPaginate filter;

    public ProductSpecification(ProductFilterPaginate filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(@NonNull Root<Product> root, @NonNull CriteriaQuery<?> query, @NonNull CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.isNull(root.get("deletedBy")));
        predicates.add(cb.isNull(root.get("deletedAt")));

        Optional.ofNullable(filter.getSearch()).filter((it -> !it.isBlank())).ifPresent((it) -> {
            String search = it.toLowerCase();
            if (filter.getField() == ProductField.ALL) {
                predicates.add(cb.or(
                    cb.like(cb.lower(root.get("name")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("description")), ("%" + search + "%"))
                ));
            } else if (filter.getField() == ProductField.NAME) {
                predicates.add(cb.like(cb.lower(root.get("name")), ("%" + search + "%")));
            } else if (filter.getField() == ProductField.DESCRIPTION) {
                predicates.add(cb.like(cb.lower(root.get("description")), ("%" + search + "%")));
            }
        });

        return cb.and(predicates.toArray(new Predicate[0]));
    }
}
