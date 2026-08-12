package com.negocil.negoturismo.admin.feature.product.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public enum ProductPromotionData {
    ROOM_SINGLE_PROMO(
            "Quarto Single Deluxe - Epic Sana",
            "Oferta especial: 20% de desconto no quarto deluxe com pequeno-almoço incluído.",
            ProductPromotionStatus.ACTIVE,
            Instant.parse("2026-01-01T00:00:00Z"),
            Instant.parse("2027-12-31T23:59:59Z"),
            150.00,
            120.00
    ),
    ROOM_DOUBLE_PROMO(
            "Quarto Casal Standard - Miramar",
            "Promoção de verão: reserve por 3 noites e ganhe 1 noite grátis.",
            ProductPromotionStatus.ACTIVE,
            Instant.parse("2026-01-01T00:00:00Z"),
            Instant.parse("2027-12-31T23:59:59Z"),
            200.00,
            160.00
    );

    private final String productName;
    private final String description;
    private final ProductPromotionStatus status;
    private final Instant startedAt;
    private final Instant completedAt;
    private final double oldPrice;
    private final double newPrice;
}
