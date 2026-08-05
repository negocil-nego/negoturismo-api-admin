package com.negocil.negoturismo.admin.feature.product.dto.response;

import com.negocil.negoturismo.admin.feature.product.enums.ProductPromotionStatus;
import com.negocil.negoturismo.admin.feature.product.model.ProductPromotion;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.Instant;
import java.util.UUID;

@Schema(description = "Product promotion data returned to clients")
public record ProductPromotionResponse(
        @Schema(description = "Unique identifier of the product promotion", example = "1")
        Long id,

        @Schema(description = "UUID of the product", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID productUuid,

        @Schema(description = "Promotion status", example = "PENDENT")
        ProductPromotionStatus status,

        @Schema(description = "Start date and time of the promotion", example = "2026-01-01T00:00:00Z")
        Instant startedAt,

        @Schema(description = "End date and time of the promotion", example = "2026-12-31T23:59:59Z")
        Instant completedAt,

        @Schema(description = "Computed concatenation of product name, description, and status", example = "City Tour, A guided tour, ACTIVE")
        String concat
) {
    public static ProductPromotionResponse of(ProductPromotion productPromotion) {
        return new ProductPromotionResponse(
                productPromotion.getId(),
                productPromotion.getProduct().getUuid(),
                productPromotion.getStatus(),
                productPromotion.getStartedAt(),
                productPromotion.getCompletedAt(),
                productPromotion.getConcat()
        );
    }
}
