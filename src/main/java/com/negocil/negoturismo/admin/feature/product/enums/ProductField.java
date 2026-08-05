package com.negocil.negoturismo.admin.feature.product.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum ProductField {
    ALL("ALL"),
    NAME("NAME"),
    DESCRIPTION("DESCRIPTION");

    private final String value;

    ProductField(String value) {
        this.value = value;
    }

    public static ProductField fromValue(String value) {
        return Arrays.stream(values())
                .filter(it -> it.getValue().equals(value))
                .findFirst()
                .orElseGet(() -> ALL);
    }
}
