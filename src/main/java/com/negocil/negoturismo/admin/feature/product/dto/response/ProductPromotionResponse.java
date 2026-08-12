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

        @Schema(description = "Product name", example = "City Tour")
        String productName,

        @Schema(description = "Product slug", example = "city_tour")
        String productSlug,

        @Schema(description = "Product image URL", example = "https://example.com/image.jpg", nullable = true)
        String productImage,

        @Schema(description = "Promotion description", example = "Oferta especial de verão")
        String description,

        @Schema(description = "Promotion status", example = "PENDENT")
        ProductPromotionStatus status,

        @Schema(description = "Start date and time of the promotion", example = "2026-01-01T00:00:00Z")
        Instant startedAt,

        @Schema(description = "End date and time of the promotion", example = "2026-12-31T23:59:59Z")
        Instant completedAt,

        @Schema(description = "Old price before promotion", example = "120.00")
        double oldPrice,

        @Schema(description = "New price after promotion", example = "99.90")
        double newPrice,

        @Schema(description = "Computed concatenation of product name, description, and status", example = "City Tour, A guided tour, ACTIVE")
        String concat
) {
    public static ProductPromotionResponse of(ProductPromotion productPromotion) {
        var product = productPromotion.getProduct();
        return new ProductPromotionResponse(
                productPromotion.getId(),
                product.getUuid(),
                product.getName(),
                product.getSlug(),
                product.getImage(),
                productPromotion.getDescription() != null ? productPromotion.getDescription() : product.getDescription(),
                productPromotion.getStatus(),
                productPromotion.getStartedAt(),
                productPromotion.getCompletedAt(),
                productPromotion.getOldPrice(),
                productPromotion.getNewPrice(),
                productPromotion.getConcat()
        );
    }
}
