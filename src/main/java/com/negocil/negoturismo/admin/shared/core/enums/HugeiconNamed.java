package com.negocil.negoturismo.admin.shared.core.enums;

import lombok.Getter;

@Getter
public enum HugeiconNamed {
    HOTEL_01("hotel-01", "hgi hgi-stroke hgi-rounded hgi-hotel-01"),
    HOTEL_02("hotel-02", "hgi hgi-stroke hgi-rounded hgi-hotel-02"),
    GUESTHOUSE("guesthouse", "hgi hgi-stroke hgi-rounded hgi-house-01"),
    FLIGHTS("airplane-01", "hgi hgi-stroke hgi-rounded hgi-airplane-01"),
    TRAVEL_AGENCIES("suitcase-01", "hgi hgi-stroke hgi-rounded hgi-suitcase-01"),
    TOUR_GUIDE("map-location-01", "hgi hgi-stroke hgi-rounded hgi-map-location-01"),
    INTERPRETER("translate-01", "hgi hgi-stroke hgi-rounded hgi-translate-01");

    private final String key;
    private final String web;

    HugeiconNamed(String key, String web) {
        this.key = key;
        this.web = web;
    }
}