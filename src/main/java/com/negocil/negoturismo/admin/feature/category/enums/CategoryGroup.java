package com.negocil.negoturismo.admin.feature.category.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CategoryGroup {
    HOSTING("Hospedagem"),
    RESTAURANT("Restaurante"),
    TOURISM("Tourismo"),
    INTERPRETER("Interpretador");

    private final String label;
}