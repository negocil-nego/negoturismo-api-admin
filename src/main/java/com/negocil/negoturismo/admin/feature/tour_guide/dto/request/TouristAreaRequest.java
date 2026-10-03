package com.negocil.negoturismo.admin.feature.tour_guide.dto.request;

import com.negocil.negoturismo.admin.feature.tour_guide.model.Province;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Schema(description = "Request payload for creating or updating a tourist area")
public record TouristAreaRequest(
        @Schema(description = "Tourist area name", example = "Parque Nacional do Kissama", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 255)
        @NotBlank
        String name,

        @Schema(description = "State where the tourist area is located", example = "Bengo", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 255)
        @NotBlank
        String state,

        @Schema(description = "Address of the tourist area", example = "Estrada EN-100, Km 70", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 255)
        @NotBlank
        String address,

        @Schema(description = "Province where the tourist area is located", example = "LUANDA", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        Province province,

        @Schema(description = "Latitude coordinate", example = "-9.2833", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        Double latitude,

        @Schema(description = "Longitude coordinate", example = "13.1833", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        Double longitude
) {
    public TouristArea toModel() {
        return TouristArea.builder()
                .name(name)
                .state(state)
                .address(address)
                .province(province)
                .latitude(latitude)
                .longitude(longitude)
                .build();
    }
}
