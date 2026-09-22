package com.negocil.negoturismo.admin.shared.security.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.Instant;

@Schema(description = "JWT token issued after admin authentication")
public record IssuedToken(
        @Schema(description = "JWT access token", example = "eyJhbGciOiJIUzI1NiJ9...")
        String token,

        @Schema(description = "Token expiration timestamp", example = "2026-09-22T12:00:00Z")
        Instant expiresAt
) {
}
