package com.negocil.negoturismo.admin.shared.security.service;

import com.negocil.negoturismo.admin.shared.security.dto.response.IssuedToken;
import com.negocil.negoturismo.admin.shared.security.util.CookieUtils;
import com.negocil.negoturismo.admin.shared.security.util.ExpiredGenerator;
import com.negocil.negoturismo.admin.shared.user.enums.UserStatus;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Collection;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class TokenService {
    private final JwtEncoder encoder;

    public IssuedToken generateToken(Authentication authentication, HttpServletResponse response, UserStatus status) {
        return issueAndStore(authentication.getName(), authentication.getAuthorities(), response, status);
    }

    public IssuedToken generateToken(UserDetails userDetails, HttpServletResponse response, UserStatus status) {
        return issueAndStore(userDetails.getUsername(), userDetails.getAuthorities(), response, status);
    }

    public void clearTokenCookie(HttpServletResponse response) {
        response.addHeader(HttpHeaders.SET_COOKIE, CookieUtils.clearTokenCookie().toString());
        response.addHeader(HttpHeaders.SET_COOKIE, CookieUtils.clearStatusCookie().toString());
    }

    private IssuedToken issueAndStore(String subject, Collection<? extends GrantedAuthority> authorities,
                                      HttpServletResponse response, UserStatus status) {
        var expiresAt = ExpiredGenerator.jwtExpired1Hour();
        var scope = extractScope(authorities);

        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuer("self")
                .issuedAt(Instant.now())
                .expiresAt(expiresAt)
                .subject(subject)
                .claim("scope", scope)
                .build();

        String token = encoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
        response.addHeader(HttpHeaders.SET_COOKIE, CookieUtils.tokenCookie(token).toString());
        response.addHeader(HttpHeaders.SET_COOKIE, CookieUtils.statusCookie(status.name()).toString());
        return new IssuedToken(token, expiresAt);
    }

    private String extractScope(Collection<? extends GrantedAuthority> authorities) {
        return authorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.joining(" "));
    }
}