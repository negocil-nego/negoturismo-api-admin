package com.negocil.negoturismo.admin.feature.organization.dto.request;

import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

@Schema(description = "Request payload for creating or updating an organization")
public record OrganizationRequest(
        @Schema(description = "Organization name", example = "Negocil", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 100)
        @NotBlank
        @Size(max = 100)
        String name,

        @Schema(description = "Organization email", example = "contact@negocil.com", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 100)
        @NotBlank
        @Size(max = 100)
        @Email
        String email,

        @Schema(description = "Organization phone number", example = "+244923456789", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 15)
        @NotBlank
        @Pattern(regexp = "^\\+?[0-9]{7,15}$", message = "Phone invalid")
        @Size(max = 15)
        String phone,

        @Schema(description = "Organization description", example = "Empresa de turismo em Angola", requiredMode = Schema.RequiredMode.NOT_REQUIRED, minLength = 50, maxLength = 500)
        @Size(max = 500)
        String description,

        @Schema(description = "Organization address", example = "Luanda, Angola", requiredMode = Schema.RequiredMode.NOT_REQUIRED, maxLength = 255)
        @Size(max = 255)
        String address,

        @Schema(description = "Organization rating", example = "4", requiredMode = Schema.RequiredMode.NOT_REQUIRED, minimum = "0", maximum = "5")
        @Min(0)
        @Max(5)
        @PositiveOrZero
        Integer rating,

        @Schema(description = "Organization image URL", example = "https://example.com/image.jpg", requiredMode = Schema.RequiredMode.NOT_REQUIRED, maxLength = 2048)
        @Size(max = 2048)
        String image,

        @Schema(description = "Organization logo URL", example = "https://example.com/logo.png", requiredMode = Schema.RequiredMode.NOT_REQUIRED, maxLength = 2048)
        @Size(max = 2048)
        String logo,

        @Schema(description = "Organization video URL", example = "https://example.com/video.mp4", requiredMode = Schema.RequiredMode.NOT_REQUIRED, maxLength = 2048)
        @Size(max = 2048)
        String video
) {
    public Organization toModel() {
        return Organization.builder()
                .name(name)
                .email(email)
                .phone(phone)
                .description(description)
                .address(address)
                .rating(rating)
                .image(image)
                .logo(logo)
                .video(video)
                .build();
    }
}
