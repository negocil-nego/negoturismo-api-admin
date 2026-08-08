package com.negocil.negoturismo.admin.feature.tour_guide.dto.response;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuideTouristArea;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.UUID;

@Schema(description = "Tour guide tourist area data returned to clients")
public record TourGuideTouristAreaResponse(
        @Schema(description = "Unique identifier of the association", example = "1")
        Long uuid,

        @Schema(description = "UUID of the tour guide", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID tourGuideUuid,

        @Schema(description = "UUID of the tourist area", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID touristAreaUuid,

        @Schema(description = "Price for the tour guide service at this tourist area", example = "150.00")
        BigDecimal price
) {
    public static TourGuideTouristAreaResponse of(TourGuideTouristArea model) {
        return new TourGuideTouristAreaResponse(
                model.getId(),
                model.getTourGuide() != null ? model.getTourGuide().getUuid() : null,
                model.getTouristArea() != null ? model.getTouristArea().getUuid() : null,
                model.getPrice()
        );
    }
}
