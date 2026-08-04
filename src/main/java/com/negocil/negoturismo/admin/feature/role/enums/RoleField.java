package com.negocil.negoturismo.admin.feature.role.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum RoleField {
    ALL("ALL"),
    CODE("CODE"),
    NAME("NAME"),
    DESCRIPTION("DESCRIPTION");

    private final String value;

    RoleField(String value) {
        this.value = value;
    }

    public static RoleField fromValue(String value) {
        return Arrays.stream(values())
                .filter(it -> it.getValue().equals(value))
                .findFirst()
                .orElseGet(() -> ALL);
    }
}
