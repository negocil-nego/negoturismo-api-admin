package com.negocil.negoturismo.admin.shared.core.enums;

import lombok.Getter;

@Getter
public enum HugeiconNamed {
    HOTEL_01("hotel-01", "hugeicons/hotel-01"),
    HOTEL_02("hotel-02", "hugeicons/hotel-02"),
    GUESTHOUSE("guesthouse", "hugeicons/guesthouse");

    private final String key;
    private final String web;

    HugeiconNamed(String key, String web) {
        this.key = key;
        this.web = web;
    }
}
