package com.negocil.negoturismo.admin.shared.security.service;

import com.negocil.negoturismo.admin.shared.core.exception.UnauthorizedException;
import com.negocil.negoturismo.admin.shared.core.i18n.I18n;
import com.negocil.negoturismo.admin.shared.security.dto.request.LoginRequest;
import com.negocil.negoturismo.admin.shared.security.dto.response.IssuedToken;
import com.negocil.negoturismo.admin.shared.user.enums.UserStatus;
import com.negocil.negoturismo.admin.shared.user.exception.UserBlockedStatusException;
import com.negocil.negoturismo.admin.shared.user.exception.UserNotFoundException;
import com.negocil.negoturismo.admin.shared.user.service.LoginLogService;
import com.negocil.negoturismo.admin.shared.user.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final AuthenticationManager authenticationManager;
    private final LoginLogService loginLogService;
    private final TokenService tokenService;
    private final UserService userService;
    private final I18n i18n;

    public IssuedToken login(LoginRequest request, HttpServletResponse response, HttpServletRequest httpRequest) {
        var ipAddress = clientIp(httpRequest);
        var userAgent = httpRequest.getHeader("User-Agent");

        try {
            var user = userService.findByUsernameOrEmail(request.username());

            if (user.getStatus() == UserStatus.BLOCKED) {
                loginLogService.blocked(user, request.username(), ipAddress, userAgent);
                throw new UserBlockedStatusException(i18n.get(user, "exception.user.status.blocked"));
            }

            var auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.username(), request.password()));
            var issued = tokenService.generateToken(auth, response, user.getStatus());
            userService.updateTokensInvalidatedAt(user, issued.expiresAt());
            loginLogService.success(user, request.username(), ipAddress, userAgent);
            return issued;
        } catch (UserNotFoundException e) {
            loginLogService.failed(request.username(), "USER_NOT_FOUND", ipAddress, userAgent);
            throw e;
        } catch (AuthenticationException e) {
            loginLogService.failed(request.username(), "INVALID_CREDENTIALS", ipAddress, userAgent);
            throw new UnauthorizedException(i18n.get("exception.auth.invalid_credentials"));
        }
    }

    private String clientIp(HttpServletRequest request) {
        var forwarded = request.getHeader("X-Forwarded-For");
        if (forwarded != null && !forwarded.isBlank()) {
            return forwarded.split(",")[0].trim();
        }
        return request.getRemoteAddr();
    }
}
