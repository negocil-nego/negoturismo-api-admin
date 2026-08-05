package com.negocil.negoturismo.admin.feature.tour_guide.dto.response;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Tour guide data returned to clients")
public record TourGuideResponse(
        @Schema(description = "Unique identifier of the tour guide", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "UUID of the associated user", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID userUuid,

        @Schema(description = "Computed concatenation of user name, phone, and email", example = "John Doe+551234567890+john@example.com")
        String concat
) {
    public static TourGuideResponse of(TourGuide tourGuide) {
        return new TourGuideResponse(
                tourGuide.getUuid(),
                tourGuide.getUser() != null ? tourGuide.getUser().getUuid() : null,
                tourGuide.getConcat()
        );
    }
}
