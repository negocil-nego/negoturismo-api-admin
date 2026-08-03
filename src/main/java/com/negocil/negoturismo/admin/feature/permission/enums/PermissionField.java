package com.negocil.negoturismo.admin.feature.permission.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum PermissionField {
    ALL("ALL"),
    CODE("CODE"),
    NAME("NAME"),
    DESCRIPTION("DESCRIPTION");

    private final String value;

    PermissionField(String value) {
        this.value = value;
    }

    public static PermissionField fromValue(String value) {
        return Arrays.stream(values())
                .filter(it -> it.getValue().equals(value))
                .findFirst()
                .orElseGet(() -> ALL);
    }
}
