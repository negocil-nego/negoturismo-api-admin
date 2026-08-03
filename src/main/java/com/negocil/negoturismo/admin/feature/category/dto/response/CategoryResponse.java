package com.negocil.negoturismo.admin.feature.category.dto.response;

import com.negocil.negoturismo.admin.feature.category.model.Category;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Category data returned to clients")
public record CategoryResponse(
        @Schema(description = "Unique identifier of the category", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "Category name", example = "Restaurants")
        String name,

        @Schema(description = "URL-friendly slug generated from the category name", example = "restaurants"
        )
        String slug,

        @Schema(description = "Category description", example = "Places to eat and drink")
        String description,

        @Schema(description = "Icon identifier or URL for the category", example = "restaurant-icon.svg", nullable = true)
        String icon

) {
    public static CategoryResponse of(Category category) {
        return new CategoryResponse(
                category.getUuid(),
                category.getName(),
                category.getSlug(),
                category.getDescription(),
                category.getIcon()
        );
    }
}