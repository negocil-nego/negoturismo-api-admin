package com.negocil.negoturismo.admin.shared.security.util;

import com.negocil.negoturismo.admin.shared.user.exception.UserUsernameNotFoundException;
import com.negocil.negoturismo.admin.shared.user.model.User;
import com.negocil.negoturismo.admin.shared.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RevokedTokenValidator implements OAuth2TokenValidator<Jwt> {
    private final UserService userService;

    @Override
    public OAuth2TokenValidatorResult validate(Jwt jwt) {
        try {
            var user = findBySubject(jwt.getSubject());
            var invalidatedAt = user.getTokensInvalidatedAt();
            if (invalidatedAt != null
                    && jwt.getExpiresAt() != null
                    && jwt.getExpiresAt().isAfter(invalidatedAt)) {
                return failure("Token revoked. Please log in again.");
            }
            return OAuth2TokenValidatorResult.success();
        } catch (Exception e) {
            return failure(e.getMessage());
        }
    }

    private User findBySubject(String subject) {
        try {
            return userService.findByUsername(subject);
        } catch (UserUsernameNotFoundException e) {
            return userService.findByEmail(subject);
        }
    }

    private OAuth2TokenValidatorResult failure(String message) {
        return OAuth2TokenValidatorResult.failure(new OAuth2Error("invalid_token", message, null));
    }
}
