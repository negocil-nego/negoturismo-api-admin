package com.negocil.negoturismo.admin.feature.product.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductFileData {
    EPIC_SANA_ROOM_SINGLE_PHOTO(
            "Quarto Single Deluxe - Epic Sana",
            "Fotografia Quarto Single Deluxe"
    ),
    EPIC_SANA_ROOM_SUITE_PHOTO(
            "Suite Presidencial - Epic Sana",
            "Fotografia Suite Presidencial"
    ),
    MIRAMAR_ROOM_DOUBLE_PHOTO(
            "Quarto Casal Standard - Miramar",
            "Fotografia Quarto Casal Standard"
    ),
    HUAMBO_ROOM_TWIN_PHOTO(
            "Quarto Twin Simples - Huambo",
            "Fotografia Quarto Twin Simples"
    );

    private final String productName;
    private final String documentFileTitle;
}
