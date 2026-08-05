package com.negocil.negoturismo.admin.feature.tour_guide.dto.request;

import com.negocil.negoturismo.admin.feature.tour_guide.enums.TouristAreaField;
import com.negocil.negoturismo.admin.shared.core.dto.request.PaginateRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Filter and pagination parameters for listing tourist areas")
public class TouristAreaFilterPaginate extends PaginateRequest {
    @Schema(description = "Field used to search/sort tourist areas", example = "NAME")
    private TouristAreaField field;

    @Schema(
            description = "Free-text search term to filter tourist areas by name, state, or address",
            example = "kissama",
            nullable = true
    )
    private String search;
}
