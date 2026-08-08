package com.negocil.negoturismo.admin.feature.tour_guide.dto.request;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuideTouristArea;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

@Schema(description = "Request payload for creating or updating a tour guide tourist area association")
public record TourGuideTouristAreaRequest(
        @Schema(description = "UUID of the tour guide", example = "550e8400-e29b-41d4-a716-446655440000", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        UUID tourGuideUuid,

        @Schema(description = "UUID of the tourist area", example = "550e8400-e29b-41d4-a716-446655440000", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        UUID touristAreaUuid,

        @Schema(description = "Price for the tour guide service at this tourist area", example = "150.00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        BigDecimal price
) {
    public TourGuideTouristArea toModel() {
        return TourGuideTouristArea.builder()
                .price(price != null ? price : BigDecimal.ZERO)
                .build();
    }
}
