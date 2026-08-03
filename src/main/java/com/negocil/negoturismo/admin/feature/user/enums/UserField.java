package com.negocil.negoturismo.admin.feature.user.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum UserField {
    ALL("ALL"),
    NAME("NAME"),
    USERNAME("USERNAME"),
    EMAIL("EMAIL"),
    PHONE("PHONE");

    private final String value;

    UserField(String value) {
        this.value = value;
    }

    public static UserField fromValue(String value) {
        return Arrays.stream(values())
                .filter(it -> it.getValue().equals(value))
                .findFirst()
                .orElseGet(() -> ALL);
    }
}
