package com.negocil.negoturismo.admin.feature.category.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum CategoryField {
    ALL("ALL"),
    NAME("NAME"),
    DESCRIPTION("DESCRIPTION");

    private final String value;

    CategoryField(String value) {
        this.value = value;
    }

    public static CategoryField fromValue(String value) {
        return Arrays.stream(values())
                .filter(it -> it.getValue().equals(value))
                .findFirst()
                .orElseGet(() -> ALL);
    }
}