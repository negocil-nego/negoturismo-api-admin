package com.negocil.negoturismo.admin.feature.tour_guide.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum TourGuideField {
    ALL("ALL"),
    NAME("NAME");

    private final String value;

    TourGuideField(String value) {
        this.value = value;
    }

    public static TourGuideField fromValue(String value) {
        return Arrays.stream(values())
                .filter(it -> it.getValue().equals(value))
                .findFirst()
                .orElseGet(() -> ALL);
    }
}
