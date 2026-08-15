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

        @Schema(description = "Email address of the tour guide", example = "tourguide@example.com")
        String email,

        @Schema(description = "WhatsApp contact number of the tour guide", example = "+244923456789")
        String whatsapp,

        @Schema(description = "Computed concatenation of user name, phone, and email", example = "John Doe+551234567890+john@example.com")
        String concat,

        @Schema(description = "Photo URL of the tour guide", example = "https://cdn.negocil.com/tour-guides/photo.png")
        String photo,

        @Schema(description = "Video URL of the tour guide", example = "https://cdn.negocil.com/tour-guides/video.mp4")
        String video
) {
    public static TourGuideResponse of(TourGuide tourGuide) {
        return new TourGuideResponse(
                tourGuide.getUuid(),
                tourGuide.getUser() != null ? tourGuide.getUser().getUuid() : null,
                tourGuide.getEmail(),
                tourGuide.getWhatsapp(),
                tourGuide.getConcat(),
                tourGuide.getPhoto(),
                tourGuide.getVideo()
        );
    }
}
