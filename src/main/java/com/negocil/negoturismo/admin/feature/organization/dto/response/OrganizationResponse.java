package com.negocil.negoturismo.admin.feature.organization.dto.response;

import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Organization data returned to clients")
public record OrganizationResponse(
        @Schema(description = "Unique identifier of the organization", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "Organization name", example = "Negocil")
        String name,

        @Schema(description = "URL-friendly slug generated from the organization name", example = "negocil")
        String slug,

        @Schema(description = "Organization email", example = "contact@negocil.com")
        String email,

        @Schema(description = "Organization phone number", example = "+244923456789")
        String phone,

        @Schema(description = "Organization description", example = "Empresa de turismo em Angola")
        String description,

        @Schema(description = "Organization address", example = "Luanda, Angola")
        String address,

        @Schema(description = "Organization rating", example = "4")
        Integer rating,

        @Schema(description = "Organization image URL", example = "https://example.com/image.jpg", nullable = true)
        String image,

        @Schema(description = "Organization logo URL", example = "https://example.com/logo.png", nullable = true)
        String logo,

        @Schema(description = "Organization video URL", example = "https://example.com/video.mp4", nullable = true)
        String video
) {
    public static OrganizationResponse of(Organization organization) {
        return new OrganizationResponse(
                organization.getUuid(),
                organization.getName(),
                organization.getSlug(),
                organization.getEmail(),
                organization.getPhone(),
                organization.getDescription(),
                organization.getAddress(),
                organization.getRating(),
                organization.getImage(),
                organization.getLogo(),
                organization.getVideo()
        );
    }
}
