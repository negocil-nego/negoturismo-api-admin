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
    INTERPRETER("translate-01", "hgi hgi-stroke hgi-rounded hgi-translate-01"),

    RESTAURANT("utensils-crossed", "hgi hgi-stroke hgi-rounded hgi-utensils-crossed"),
    RESTAURANT_01("restaurant-01", "hgi hgi-stroke hgi-rounded hgi-restaurant-01"),
    RESTAURANT_02("restaurant-02", "hgi hgi-stroke hgi-rounded hgi-restaurant-02"),
    RESTAURANT_03("restaurant-03", "hgi hgi-stroke hgi-rounded hgi-restaurant-03"),
    RESTAURANT_TABLE("restaurant-table", "hgi hgi-stroke hgi-rounded hgi-restaurant-table"),
    MENU_RESTAURANT("menu-restaurant", "hgi hgi-stroke hgi-rounded hgi-menu-restaurant"),
    KITCHEN_UTENSILS("kitchen-utensils", "hgi hgi-stroke hgi-rounded hgi-kitchen-utensils"),
    DINING_TABLE("dining-table", "hgi hgi-stroke hgi-rounded hgi-dining-table"),
    WAITER("waiter", "hgi hgi-stroke hgi-rounded hgi-waiter"),
    WAITERS("waiters", "hgi hgi-stroke hgi-rounded hgi-waiters"),
    CHEF_HAT("chef-hat", "hgi hgi-stroke hgi-rounded hgi-chef-hat"),
    CAFE("cafe", "hgi hgi-stroke hgi-rounded hgi-cafe"),
    COFFEE_01("coffee-01", "hgi hgi-stroke hgi-rounded hgi-coffee-01"),
    PIZZA_01("pizza-01", "hgi hgi-stroke hgi-rounded hgi-pizza-01"),
    PIZZA_02("pizza-02", "hgi hgi-stroke hgi-rounded hgi-pizza-02"),
    HAMBURGER_01("hamburger-01", "hgi hgi-stroke hgi-rounded hgi-hamburger-01"),
    HAMBURGER_02("hamburger-02", "hgi hgi-stroke hgi-rounded hgi-hamburger-02"),
    BBQ_GRILL("bbq-grill", "hgi hgi-stroke hgi-rounded hgi-bbq-grill"),
    SHELLFISH("shellfish", "hgi hgi-stroke hgi-rounded hgi-shellfish"),
    FISH_FOOD("fish-food", "hgi hgi-stroke hgi-rounded hgi-fish-food"),
    SUSHI_01("sushi-01", "hgi hgi-stroke hgi-rounded hgi-sushi-01"),
    SUSHI_02("sushi-02", "hgi hgi-stroke hgi-rounded hgi-sushi-02"),
    RICE_BOWL_01("rice-bowl-01", "hgi hgi-stroke hgi-rounded hgi-rice-bowl-01"),
    RICE_BOWL_02("rice-bowl-02", "hgi hgi-stroke hgi-rounded hgi-rice-bowl-02"),
    STEAK("steak", "hgi hgi-stroke hgi-rounded hgi-steak"),
    VEGETARIAN_FOOD("vegetarian-food", "hgi hgi-stroke hgi-rounded hgi-vegetarian-food"),
    NATURAL_FOOD("natural-food", "hgi hgi-stroke hgi-rounded hgi-natural-food"),
    DRINK("drink", "hgi hgi-stroke hgi-rounded hgi-drink"),
    SOFT_DRINK_01("soft-drink-01", "hgi hgi-stroke hgi-rounded hgi-soft-drink-01"),
    CUPCAKE_01("cupcake-01", "hgi hgi-stroke hgi-rounded hgi-cupcake-01"),
    CHEESE_CAKE_01("cheese-cake-01", "hgi hgi-stroke hgi-rounded hgi-cheese-cake-01"),

    ;

    private final String key;
    private final String web;

    HugeiconNamed(String key, String web) {
        this.key = key;
        this.web = web;
    }
}