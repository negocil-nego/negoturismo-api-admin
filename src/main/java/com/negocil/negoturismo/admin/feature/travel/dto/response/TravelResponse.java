package com.negocil.negoturismo.admin.feature.travel.dto.response;

import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.travel.enums.Country;
import com.negocil.negoturismo.admin.feature.travel.enums.TravelType;
import com.negocil.negoturismo.admin.feature.travel.model.Travel;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import java.util.UUID;

@Schema(description = "Travel data returned to clients")
public record TravelResponse(
        @Schema(description = "Unique identifier of the travel", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "City where the travel starts", example = "Luanda")
        String city,

        @Schema(description = "Country of the travel", example = "AO")
        Country country,

        @Schema(description = "Travel description", example = "Voo direto para Lubango")
        String description,

        @Schema(description = "Travel type", example = "FLIGHT")
        TravelType type,

        @Schema(description = "Departure date and time", example = "2026-03-01T08:30:00")
        LocalDateTime departureTime,

        @Schema(description = "Estimated completion date and time", example = "2026-03-01T10:15:00")
        LocalDateTime estimatedCompletionTime,

        @Schema(description = "UUID of the organization", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID organizationUuid,

        @Schema(description = "Name of the organization", example = "Hotel Epic Sana Luanda", nullable = true)
        String organizationName
) {
    public static TravelResponse of(Travel travel) {
        Organization organization = travel.getOrganization();
        return new TravelResponse(
                travel.getUuid(),
                travel.getCity(),
                travel.getCountry(),
                travel.getDescription(),
                travel.getType(),
                travel.getDepartureTime(),
                travel.getEstimatedCompletionTime(),
                organization != null ? organization.getUuid() : null,
                organization != null ? organization.getName() : null
        );
    }
}
