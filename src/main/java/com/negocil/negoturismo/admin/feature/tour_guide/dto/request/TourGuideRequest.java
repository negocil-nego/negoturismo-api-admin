package com.negocil.negoturismo.admin.feature.tour_guide.dto.request;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import com.negocil.negoturismo.admin.shared.core.util.ValidateFields;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.UUID;

@Schema(description = "Request payload for creating or updating a tour guide")
public record TourGuideRequest(
        @Schema(description = "UUID of the user associated with the tour guide", example = "550e8400-e29b-41d4-a716-446655440000", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        UUID userUuid,

        @Schema(description = "Email address of the tour guide", example = "tourguide@example.com")
        @Email
        String email,

        @Schema(description = "WhatsApp contact number of the tour guide", example = "+244923456789")
        @Size(max = 15)
        @Pattern(regexp = ValidateFields.REGEX_PHONE, message = "Phone invalid")
        String whatsapp
) {
    public TourGuide toModel() {
        return TourGuide.builder()
                .email(email)
                .whatsapp(whatsapp)
                .build();
    }
}
