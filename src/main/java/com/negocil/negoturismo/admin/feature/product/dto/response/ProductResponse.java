package com.negocil.negoturismo.admin.feature.product.dto.response;

import com.negocil.negoturismo.admin.feature.product.model.Product;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.UUID;

@Schema(description = "Product data returned to clients")
public record ProductResponse(
        @Schema(description = "Unique identifier of the product", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "Product name", example = "City Tour")
        String name,

        @Schema(description = "URL-friendly slug generated from the product name", example = "city_tour")
        String slug,

        @Schema(description = "Product description", example = "A guided tour through the city center")
        String description,

        @Schema(description = "Product image URL", example = "https://example.com/image.jpg", nullable = true)
        String image,

        @Schema(description = "Product price", example = "99.90")
        BigDecimal price,

        @Schema(description = "Display position for ordering", example = "0")
        Integer position,

        @Schema(description = "UUID of the organization this product belongs to", example = "550e8400-e29b-41d4-a716-446655440000", nullable = true)
        UUID organizationUuid,

        @Schema(description = "Organization name", example = "Negocil", nullable = true)
        String organizationName,

        @Schema(description = "Organization logo URL", example = "https://example.com/logo.png", nullable = true)
        String organizationLogo

) {
    public static ProductResponse of(Product product) {
        var org = product.getOrganization();
        return new ProductResponse(
                product.getUuid(),
                product.getName(),
                product.getSlug(),
                product.getDescription(),
                product.getImage(),
                product.getPrice(),
                product.getPosition(),
                org != null ? org.getUuid() : null,
                org != null ? org.getName() : null,
                org != null ? org.getLogo() : null
        );
    }
}
