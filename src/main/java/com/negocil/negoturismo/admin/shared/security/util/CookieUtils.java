package com.negocil.negoturismo.admin.shared.security.util;

import org.springframework.http.ResponseCookie;

import java.time.Duration;

public final class CookieUtils {
    public static final String TOKEN_COOKIE = "token";
    public static final Duration TOKEN_MAX_AGE = ExpiredGenerator.jwtExpiredDuration();

    public static ResponseCookie tokenCookie(String token) {
        return ResponseCookie.from(TOKEN_COOKIE, token)
                .httpOnly(true)
                .secure(false)
                .path("/")
                .maxAge(TOKEN_MAX_AGE)
                .sameSite("Lax")
                .build();
    }

    public static ResponseCookie statusCookie(String status) {
        return ResponseCookie.from("status", status)
                .httpOnly(false)
                .secure(false)
                .path("/")
                .maxAge(TOKEN_MAX_AGE)
                .sameSite("Lax")
                .build();
    }

    public static ResponseCookie clearTokenCookie() {
        return ResponseCookie.from(TOKEN_COOKIE, "")
                .httpOnly(true)
                .secure(false)
                .path("/")
                .maxAge(0)
                .sameSite("Lax")
                .build();
    }

    public static ResponseCookie clearStatusCookie() {
        return ResponseCookie.from("status", "")
                .httpOnly(false)
                .secure(false)
                .path("/")
                .maxAge(0)
                .sameSite("Lax")
                .build();
    }
}
