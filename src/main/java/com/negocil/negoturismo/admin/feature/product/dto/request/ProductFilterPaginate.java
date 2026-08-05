package com.negocil.negoturismo.admin.feature.product.dto.request;

import com.negocil.negoturismo.admin.feature.product.enums.ProductField;
import com.negocil.negoturismo.admin.shared.core.dto.request.PaginateRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Filter and pagination parameters for listing products")
public class ProductFilterPaginate extends PaginateRequest {
    @Schema(description = "Field used to search/sort products", example = "NAME")
    private ProductField field;

    @Schema(
            description = "Free-text search term to filter products by name or other text field",
            example = "tour",
            nullable = true
    )
    private String search;
}
