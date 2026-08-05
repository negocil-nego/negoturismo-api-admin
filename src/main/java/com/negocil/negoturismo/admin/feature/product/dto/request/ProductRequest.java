package com.negocil.negoturismo.admin.feature.product.dto.request;

import com.negocil.negoturismo.admin.feature.product.model.Product;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.util.UUID;

@Schema(description = "Request payload for creating or updating a product")
public record ProductRequest(
        @Schema(description = "Product name", example = "City Tour", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 100)
        @NotBlank
        @Size(max = 100)
        String name,

        @Schema(description = "Product description", example = "A guided tour through the city center", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 1000)
        @NotBlank
        @Size(max = 1000)
        String description,

        @Schema(description = "Product image URL", example = "https://example.com/image.jpg", requiredMode = Schema.RequiredMode.NOT_REQUIRED, maxLength = 2000)
        @Size(max = 2000)
        String image,

        @Schema(description = "Product price", example = "99.90", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        BigDecimal price,

        @Schema(description = "Display position for ordering", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @PositiveOrZero
        Integer position,

        @Schema(description = "UUID of the organization this product belongs to", example = "550e8400-e29b-41d4-a716-446655440000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        UUID organizationUuid
) {
    public Product toModel() {
        return Product.builder()
                .name(name)
                .description(description)
                .image(image)
                .price(price)
                .position(position)
                .build();
    }
}
