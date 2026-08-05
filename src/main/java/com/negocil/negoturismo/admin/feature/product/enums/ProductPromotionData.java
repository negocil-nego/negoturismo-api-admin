package com.negocil.negoturismo.admin.feature.product.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public enum ProductPromotionData {
    ROOM_SINGLE_PROMO(
            "Quarto Single Deluxe - Epic Sana",
            ProductPromotionStatus.ACTIVE,
            Instant.parse("2026-01-01T00:00:00Z"),
            Instant.parse("2027-12-31T23:59:59Z")
    ),
    ROOM_DOUBLE_PROMO(
            "Quarto Casal Standard - Miramar",
            ProductPromotionStatus.ACTIVE,
            Instant.parse("2026-01-01T00:00:00Z"),
            Instant.parse("2027-12-31T23:59:59Z")
    );

    private final String productName;
    private final ProductPromotionStatus status;
    private final Instant startedAt;
    private final Instant completedAt;
}
