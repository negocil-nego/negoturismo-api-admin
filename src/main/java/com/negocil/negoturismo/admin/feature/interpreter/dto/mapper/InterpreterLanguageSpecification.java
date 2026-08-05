package com.negocil.negoturismo.admin.feature.interpreter.dto.mapper;

import com.negocil.negoturismo.admin.feature.interpreter.dto.request.InterpreterLanguageFilterPaginate;
import com.negocil.negoturismo.admin.feature.interpreter.enums.InterpreterField;
import com.negocil.negoturismo.admin.feature.interpreter.model.InterpreterLanguage;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InterpreterLanguageSpecification implements Specification<InterpreterLanguage> {

    private final InterpreterLanguageFilterPaginate filter;

    public InterpreterLanguageSpecification(InterpreterLanguageFilterPaginate filter) {
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(@NonNull Root<InterpreterLanguage> root, @NonNull CriteriaQuery<?> query, @NonNull CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();

        Optional.ofNullable(filter.getSearch()).filter((it -> !it.isBlank())).ifPresent((it) -> {
            String search = it.toLowerCase();
            if (filter.getField() == InterpreterField.ALL) {
                predicates.add(cb.or(
                    cb.like(cb.lower(root.get("concat")), ("%" + search + "%")),
                    cb.like(cb.lower(root.get("language")), ("%" + search + "%"))
                ));
            } else if (filter.getField() == InterpreterField.LANGUAGE) {
                predicates.add(cb.like(cb.lower(root.get("language")), ("%" + search + "%")));
            }
        });

        return cb.and(predicates.toArray(new Predicate[0]));
    }
}
