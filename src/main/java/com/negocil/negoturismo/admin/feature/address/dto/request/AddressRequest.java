package com.negocil.negoturismo.admin.feature.address.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record AddressRequest(
        @Schema(description = "Latitude coordinate", example = "-8.8399")
        BigDecimal latitude,

        @Schema(description = "Longitude coordinate", example = "13.2894")
        BigDecimal longitude,

        @Schema(description = "State/Province", example = "Luanda")
        @NotBlank
        @Size(max = 100)
        String state,

        @Schema(description = "Municipality", example = "Ingombota")
        @NotBlank
        @Size(max = 100)
        String municipality,

        @Schema(description = "Full address", example = "Rua da Missão, 45, Ingombota, Luanda")
        @NotBlank
        @Size(max = 255)
        String address,

        @Schema(description = "Url map location", example = "https://maps.google.com/...")
        String mapUrl
) {
}
