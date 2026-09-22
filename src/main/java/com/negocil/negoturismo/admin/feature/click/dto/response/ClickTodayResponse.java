package com.negocil.negoturismo.admin.feature.click.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Map;

@Schema(description = "Click statistics for the current day grouped by type")
public record ClickTodayResponse(
        @Schema(description = "Click count per type for today", example = "{\"PRODUCT\": 15, \"INTERPRETER\": 8, \"TOUR_GUIDE\": 12, \"TOURIST_AREA\": 5}")
        Map<String, Long> clicksByType
) {
}
