package com.negocil.negoturismo.admin.feature.tour_guide.dto.response;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Tourist area data returned to clients")
public record TouristAreaResponse(
        @Schema(description = "Unique identifier of the tourist area", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "Tourist area name", example = "Parque Nacional do Kissama")
        String name,

        @Schema(description = "State where the tourist area is located", example = "Bengo")
        String state,

        @Schema(description = "Address of the tourist area", example = "Estrada EN-100, Km 70")
        String address,

        @Schema(description = "Latitude coordinate", example = "-9.2833", nullable = true)
        Double latitude,

        @Schema(description = "Longitude coordinate", example = "13.1833", nullable = true)
        Double longitude
) {
    public static TouristAreaResponse of(TouristArea touristArea) {
        return new TouristAreaResponse(
                touristArea.getUuid(),
                touristArea.getName(),
                touristArea.getState(),
                touristArea.getAddress(),
                touristArea.getLatitude(),
                touristArea.getLongitude()
        );
    }
}
