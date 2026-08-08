package com.negocil.negoturismo.admin.feature.product.dto.request;

import com.negocil.negoturismo.admin.feature.product.enums.ProductPromotionStatus;
import com.negocil.negoturismo.admin.feature.product.model.ProductPromotion;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.UUID;

@Schema(description = "Request payload for creating or updating a product promotion")
public record ProductPromotionRequest(
        @Schema(description = "UUID of the product", example = "550e8400-e29b-41d4-a716-446655440000", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        UUID productUuid,

        @Schema(description = "Promotion status", example = "PENDENT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        ProductPromotionStatus status,

        @Schema(description = "Start date and time of the promotion", example = "2026-01-01T00:00:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        Instant startedAt,

        @Schema(description = "End date and time of the promotion", example = "2026-12-31T23:59:59Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        Instant completedAt,

        @Schema(description = "Old price before promotion", example = "120.00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        double oldPrice,

        @Schema(description = "New price after promotion", example = "99.90", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        double newPrice
) {
    public ProductPromotion toModel() {
        return ProductPromotion.builder()
                .status(status != null ? status : ProductPromotionStatus.PENDENT)
                .startedAt(startedAt)
                .completedAt(completedAt)
                .oldPrice(oldPrice)
                .newPrice(newPrice)
                .build();
    }
}
