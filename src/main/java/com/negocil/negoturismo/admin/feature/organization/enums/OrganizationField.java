package com.negocil.negoturismo.admin.feature.organization.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum OrganizationField {
    ALL("ALL"),
    NAME("NAME"),
    EMAIL("EMAIL"),
    PHONE("PHONE"),
    DESCRIPTION("DESCRIPTION"),
    ADDRESS("ADDRESS");

    private final String value;

    OrganizationField(String value) {
        this.value = value;
    }

    public static OrganizationField fromValue(String value) {
        return Arrays.stream(values())
                .filter(it -> it.getValue().equals(value))
                .findFirst()
                .orElseGet(() -> ALL);
    }
}
