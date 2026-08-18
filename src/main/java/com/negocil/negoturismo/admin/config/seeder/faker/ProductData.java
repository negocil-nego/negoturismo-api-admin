package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.product.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum ProductData {
    EPIC_SANA_ROOM_SINGLE(
            Product.builder()
                    .name("Quarto Single Deluxe - Epic Sana")
                    .slug("quarto-single-deluxe-epic-sana")
                    .description("Quarto individual espaçoso com cama queen-size, ar condicionado, TV de ecrã plano e pequeno-almoço incluído.")
                    .image("https://images.unsplash.com/photo-1631049307264-da0ec9d70304?w=800")
                    .price(new BigDecimal("120000.00"))
                    .position(1)
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .build()
    ),
    EPIC_SANA_ROOM_SUITE(
            Product.builder()
                    .name("Suite Presidencial - Epic Sana")
                    .slug("suite-presidencial-epic-sana")
                    .description("Suite luxuosa com sala de estar independente, varanda privada com vista para a baía, jacuzzi e serviços VIP.")
                    .image("https://images.unsplash.com/photo-1578683010236-d716f9a3f461?w=800")
                    .price(new BigDecimal("450000.00"))
                    .position(2)
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .build()
    ),
    MIRAMAR_ROOM_DOUBLE(
            Product.builder()
                    .name("Quarto Casal Standard - Miramar")
                    .slug("quarto-casal-standard-miramar")
                    .description("Quarto de casal com vista para a cidade, ar condicionado e Wi-Fi gratuito.")
                    .image("https://images.unsplash.com/photo-1590490360182-c33d955f7e4d?w=800")
                    .price(new BigDecimal("45000.00"))
                    .position(1)
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .build()
    ),
    HUAMBO_ROOM_TWIN(
            Product.builder()
                    .name("Quarto Twin Simples - Huambo")
                    .slug("quarto-twin-simples-huambo")
                    .description("Quarto com duas camas individuais, ideal para estadias curtas de trabalho ou lazer.")
                    .image("https://images.unsplash.com/photo-1595576508898-0ad5c879a061?w=800")
                    .price(new BigDecimal("25000.00"))
                    .position(1)
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .build()
    );

    private final Product product;
}
