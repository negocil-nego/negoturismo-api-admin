package com.negocil.negoturismo.admin.feature.address.dto.response;

import com.negocil.negoturismo.admin.feature.address.model.Address;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.UUID;

@Schema(description = "Address data returned to clients")
public record AddressResponse(
        @Schema(description = "Unique identifier of the address", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "Latitude coordinate", example = "-8.8399")
        BigDecimal latitude,

        @Schema(description = "Longitude coordinate", example = "13.2894")
        BigDecimal longitude,

        @Schema(description = "State/Province", example = "Luanda")
        String state,

        @Schema(description = "Municipality", example = "Ingombota")
        String municipality,

        @Schema(description = "Full address", example = "Rua da Missão, 45, Ingombota, Luanda")
        String address,

        @Schema(description = "Whether this is the principal address", example = "true")
        Boolean isPrincipal,

        @Schema(description = "Url map location [Google Map, OpenMap]", example = "true")
        String mapUrl
) {
    public static AddressResponse of(Address address, Boolean isPrincipal) {
        return new AddressResponse(
                address.getUuid(),
                address.getLatitude(),
                address.getLongitude(),
                address.getState(),
                address.getMunicipality(),
                address.getAddress(),
                isPrincipal,
                address.getMapUrl()
        );
    }

    public static AddressResponse ofPrincipal(Address address) {
        return of(address, Boolean.TRUE);
    }
}
