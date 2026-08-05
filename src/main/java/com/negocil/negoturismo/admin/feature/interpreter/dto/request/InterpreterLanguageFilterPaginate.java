package com.negocil.negoturismo.admin.feature.interpreter.dto.request;

import com.negocil.negoturismo.admin.feature.interpreter.enums.InterpreterField;
import com.negocil.negoturismo.admin.shared.core.dto.request.PaginateRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Filter and pagination parameters for listing interpreter languages")
public class InterpreterLanguageFilterPaginate extends PaginateRequest {
    @Schema(description = "Field used to search/sort interpreter languages", example = "LANGUAGE")
    private InterpreterField field;

    @Schema(
            description = "Free-text search term to filter interpreter languages by concat or other text field",
            example = "Spanish",
            nullable = true
    )
    private String search;
}
