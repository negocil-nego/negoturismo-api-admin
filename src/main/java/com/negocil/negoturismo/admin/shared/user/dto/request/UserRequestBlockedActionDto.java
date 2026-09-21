package com.negocil.negoturismo.admin.shared.user.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Approve or reject user unlock request")
public record UserRequestBlockedActionDto(
        @Schema(description = "Admin response comment", example = "Account unlocked after review")
        String responseComment
) {
}
