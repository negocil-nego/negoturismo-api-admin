package com.negocil.negoturismo.admin.feature.tour_guide.dto.request;

import com.negocil.negoturismo.admin.feature.tour_guide.enums.TourGuideField;
import com.negocil.negoturismo.admin.shared.core.dto.request.PaginateRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Filter and pagination parameters for listing tour guides")
public class TourGuideFilterPaginate extends PaginateRequest {
    @Schema(description = "Field used to search/sort tour guides", example = "NAME")
    private TourGuideField field;

    @Schema(
            description = "Free-text search term to filter tour guides by name or other text field",
            example = "john",
            nullable = true
    )
    private String search;
}
