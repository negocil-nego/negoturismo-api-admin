package com.negocil.negoturismo.admin.feature.tour_guide.dto.request;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Schema(description = "Request payload for creating or updating a tour guide")
public record TourGuideRequest(
        @Schema(description = "UUID of the user associated with the tour guide", example = "550e8400-e29b-41d4-a716-446655440000", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        UUID userUuid
) {
    public TourGuide toModel() {
        return TourGuide.builder()
                .build();
    }
}
