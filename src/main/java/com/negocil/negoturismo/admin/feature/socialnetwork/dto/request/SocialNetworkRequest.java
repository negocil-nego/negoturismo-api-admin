package com.negocil.negoturismo.admin.feature.socialnetwork.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record SocialNetworkRequest(
        @Schema(description = "Associated user UUID", example = "550e8400-e29b-41d4-a716-446655440000")
        @NotNull
        UUID userUuid,

        @Schema(description = "WhatsApp contact", example = "+244923456789")
        @Size(max = 100)
        String whatsapp,

        @Schema(description = "Instagram profile", example = "https://instagram.com/user")
        @Size(max = 255)
        String instagram,

        @Schema(description = "TikTok profile", example = "https://tiktok.com/@user")
        @Size(max = 255)
        String tiktok,

        @Schema(description = "Facebook profile", example = "https://facebook.com/user")
        @Size(max = 255)
        String facebook,

        @Schema(description = "YouTube channel", example = "https://youtube.com/@user")
        @Size(max = 255)
        String youtube,

        @Schema(description = "LinkedIn profile", example = "https://linkedin.com/in/user")
        @Size(max = 255)
        String linkedin,

        @Schema(description = "Telegram contact", example = "@user")
        @Size(max = 100)
        String telegram
) {
}
