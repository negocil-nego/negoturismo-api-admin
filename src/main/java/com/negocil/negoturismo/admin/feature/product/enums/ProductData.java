package com.negocil.negoturismo.admin.feature.product.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum ProductData {
    EPIC_SANA_ROOM_SINGLE(
            "Quarto Single Deluxe - Epic Sana",
            "quarto-single-deluxe-epic-sana",
            "Quarto individual espaçoso com cama queen-size, ar condicionado, TV de ecrã plano e pequeno-almoço incluído.",
            "https://images.unsplash.com/photo-1631049307264-da0ec9d70304?w=800",
            new BigDecimal("120000.00"),
            1,
            "Hotel Epic Sana Luanda"
    ),
    EPIC_SANA_ROOM_SUITE(
            "Suite Presidencial - Epic Sana",
            "suite-presidencial-epic-sana",
            "Suite luxuosa com sala de estar independente, varanda privada com vista para a baía, jacuzzi e serviços VIP.",
            "https://images.unsplash.com/photo-1578683010236-d716f9a3f461?w=800",
            new BigDecimal("450000.00"),
            2,
            "Hotel Epic Sana Luanda"
    ),
    MIRAMAR_ROOM_DOUBLE(
            "Quarto Casal Standard - Miramar",
            "quarto-casal-standard-miramar",
            "Quarto de casal com vista para a cidade, ar condicionado e Wi-Fi gratuito.",
            "https://images.unsplash.com/photo-1590490360182-c33d955f7e4d?w=800",
            new BigDecimal("45000.00"),
            1,
            "Pensão Residencial Miramar"
    ),
    HUAMBO_ROOM_TWIN(
            "Quarto Twin Simples - Huambo",
            "quarto-twin-simples-huambo",
            "Quarto com duas camas individuais, ideal para estadias curtas de trabalho ou lazer.",
            "https://images.unsplash.com/photo-1595576508898-0ad5c879a061?w=800",
            new BigDecimal("25000.00"),
            1,
            "Hospedaria Central do Huambo"
    );

    private final String name;
    private final String slug;
    private final String description;
    private final String image;
    private final BigDecimal price;
    private final Integer position;
    private final String organizationName;
}
