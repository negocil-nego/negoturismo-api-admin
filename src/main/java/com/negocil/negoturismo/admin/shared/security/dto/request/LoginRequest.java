package com.negocil.negoturismo.admin.shared.security.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Admin authentication data")
public record LoginRequest(
        @Schema(description = "Username or email", example = "admin@email.com")
        String username,

        @Schema(description = "User password", example = "password123")
        String password
) {
}
