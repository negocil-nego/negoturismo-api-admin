package com.negocil.negoturismo.admin.shared.security.util;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public final class ExpiredGenerator {
    private static final Duration OTP_EXPIRATION = Duration.ofMinutes(3);
    private static final Duration UPDATE_DATA_EXPIRATION = Duration.ofMinutes(5);
    private static final Duration DELETE_ACCOUNT_EXPIRATION = Duration.ofMinutes(5);
    private static final Duration FORGET_PASSWORD_EXPIRATION = Duration.ofMinutes(30);
    private static final Duration JWT_EXPIRATION = Duration.ofHours(1);

    public static Instant otpExpired3Minutes() {
        Instant now = Instant.now();
        return now.plus(3, ChronoUnit.MINUTES);
    }

    public static Instant updateDataExpired5Minutes() {
        Instant now = Instant.now();
        return now.plus(5, ChronoUnit.MINUTES);
    }

    public static Instant deleteAccountExpired5Minutes() {
        Instant now = Instant.now();
        return now.plus(5, ChronoUnit.MINUTES);
    }

    public static Instant forgetPasswordExpired30Minutes() {
        Instant now = Instant.now();
        return now.plus(30, ChronoUnit.MINUTES);
    }

    public static Instant account1Hour() {
        Instant now = Instant.now();
        return account1Hour(now);
    }

    public static Instant account1Hour(Instant now) {
        return now.plus(1, ChronoUnit.HOURS);
    }

    public static Instant jwtExpired1Hour() {
        return Instant.now().plus(JWT_EXPIRATION);
    }

    public static Duration jwtExpiredDuration() {
        return JWT_EXPIRATION;
    }
}
