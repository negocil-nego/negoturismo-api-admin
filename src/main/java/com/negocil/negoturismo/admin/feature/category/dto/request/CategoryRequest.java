package com.negocil.negoturismo.admin.feature.category.dto.request;

import com.negocil.negoturismo.admin.feature.category.enums.CategoryGroup;
import com.negocil.negoturismo.admin.feature.category.model.Category;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Schema(description = "Request payload for creating or updating a category")
public record CategoryRequest(
        @Schema(description = "Category name", example = "Restaurants", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 100)
        @NotBlank
        @Size(max = 100)
        String name,

        @Schema(description = "Category description", example = "Places to eat and drink", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 255)
        @NotBlank
        @Size(max = 255)
        String description,

        @Schema(description = "Icon identifier or URL for the category", example = "restaurant-icon.svg", requiredMode = Schema.RequiredMode.NOT_REQUIRED, maxLength = 255)
        @Size(max = 255)
        String icon,

        @Schema(description = "Category group", example = "HOSTING", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        CategoryGroup group
) {
    public Category toModel() {
        return Category.builder()
                .name(name)
                .description(description)
                .icon(icon)
                .categoryGroup(group)
                .build();
    }
}