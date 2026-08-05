package com.negocil.negoturismo.admin.feature.tour_guide.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum TouristAreaField {
    ALL("ALL"),
    NAME("NAME"),
    STATE("STATE"),
    ADDRESS("ADDRESS");

    private final String value;

    TouristAreaField(String value) {
        this.value = value;
    }

    public static TouristAreaField fromValue(String value) {
        return Arrays.stream(values())
                .filter(it -> it.getValue().equals(value))
                .findFirst()
                .orElseGet(() -> ALL);
    }
}
