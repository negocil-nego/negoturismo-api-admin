package com.negocil.negoturismo.admin.feature.category.dto.request;

import com.negocil.negoturismo.admin.feature.category.enums.CategoryField;
import com.negocil.negoturismo.admin.shared.core.dto.request.PaginateRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Filter and pagination parameters for listing categories")
public class CategoryFilterPaginate extends PaginateRequest {
    @Schema(description = "Field used to search/sort categories", example = "NAME")
    private CategoryField field;

    @Schema(
            description = "Free-text search term to filter categories by name or other text field",
            example = "restaurant",
            nullable = true
    )
    private String search;
}