package com.negocil.negoturismo.admin.feature.socialnetwork.dto.response;

import com.negocil.negoturismo.admin.feature.socialnetwork.model.SocialNetwork;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Social network data returned to admins")
public record SocialNetworkResponse(
        @Schema(description = "Unique identifier of the social network")
        UUID uuid,

        @Schema(description = "WhatsApp contact")
        String whatsapp,

        @Schema(description = "Instagram profile")
        String instagram,

        @Schema(description = "TikTok profile")
        String tiktok,

        @Schema(description = "Facebook profile")
        String facebook,

        @Schema(description = "YouTube channel")
        String youtube,

        @Schema(description = "LinkedIn profile")
        String linkedin,

        @Schema(description = "Telegram contact")
        String telegram,

        @Schema(description = "Associated user name")
        String userName
) {
    public static SocialNetworkResponse of(SocialNetwork socialNetwork) {
        var user = socialNetwork.getUser();
        return new SocialNetworkResponse(
                socialNetwork.getUuid(),
                socialNetwork.getWhatsapp(),
                socialNetwork.getInstagram(),
                socialNetwork.getTiktok(),
                socialNetwork.getFacebook(),
                socialNetwork.getYoutube(),
                socialNetwork.getLinkedin(),
                socialNetwork.getTelegram(),
                user != null ? user.getName() : null
        );
    }
}
