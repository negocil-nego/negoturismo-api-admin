package com.negocil.negoturismo.admin.feature.travel.dto.request;

import com.negocil.negoturismo.admin.feature.travel.enums.Country;
import com.negocil.negoturismo.admin.feature.travel.enums.TravelType;
import com.negocil.negoturismo.admin.feature.travel.model.Travel;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.UUID;

@Schema(description = "Request payload for creating or updating a travel")
public record TravelRequest(
        @Schema(description = "City where the travel starts", example = "Luanda", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 100)
        @NotBlank
        @Size(max = 100)
        String city,

        @Schema(description = "Country of the travel", example = "AO", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        Country country,

        @Schema(description = "Travel description", example = "Voo direto para Lubango", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 1000)
        @NotBlank
        @Size(max = 1000)
        String description,

        @Schema(description = "Travel type", example = "FLIGHT", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        TravelType type,

        @Schema(description = "Departure date and time", example = "2026-03-01T08:30:00", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        LocalDateTime departureTime,

        @Schema(description = "Estimated completion date and time", example = "2026-03-01T10:15:00", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        LocalDateTime estimatedCompletionTime,

        @Schema(description = "UUID of the organization", example = "550e8400-e29b-41d4-a716-446655440000", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        UUID organizationUuid
) {
    public Travel toModel() {
        return Travel.builder()
                .city(city)
                .country(country)
                .description(description)
                .type(type)
                .departureTime(departureTime)
                .estimatedCompletionTime(estimatedCompletionTime)
                .build();
    }
}
