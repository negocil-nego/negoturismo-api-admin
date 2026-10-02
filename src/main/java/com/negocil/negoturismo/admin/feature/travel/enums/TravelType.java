package com.negocil.negoturismo.admin.feature.travel.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TravelType {
    FLIGHT("Flight"),
    INTERPROVINCIAL("Interprovincial");

    private final String label;
}
