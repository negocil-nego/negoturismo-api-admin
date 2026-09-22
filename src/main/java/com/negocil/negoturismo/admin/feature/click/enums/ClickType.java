package com.negocil.negoturismo.admin.feature.click.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ClickType {
    PRODUCT("PRODUCT"),
    INTERPRETER("INTERPRETER"),
    TOUR_GUIDE("TOUR_GUIDE"),
    TOURIST_AREA("TOURIST_AREA");

    private final String label;
}
