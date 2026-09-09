package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.product.enums.ProductPromotionStatus;
import com.negocil.negoturismo.admin.feature.product.model.ProductPromotion;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public enum ProductPromotionData {
    ROOM_SINGLE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SINGLE.getProduct())
                    .description("Oferta especial: 20% de desconto no quarto deluxe com pequeno-almoço incluído.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(150.00)
                    .newPrice(120.00)
                    .build()
    ),
    ROOM_DOUBLE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MIRAMAR_ROOM_DOUBLE.getProduct())
                    .description("Promoção de verão: reserve por 3 noites e ganhe 1 noite grátis.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(200.00)
                    .newPrice(160.00)
                    .build()
    );

    private final ProductPromotion productPromotion;
}
