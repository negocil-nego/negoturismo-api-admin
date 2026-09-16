package com.negocil.negoturismo.admin.shared.security.controller;

import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import com.negocil.negoturismo.admin.shared.security.service.LogoutService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.LOGOUT)
@Tag(name = "Logout", description = "Endpoints to end the admin session")
public class LogoutController {
    private final LogoutService logoutService;

    @PostMapping()
    @Operation(
            operationId = "logoutAdmin",
            summary = "Logout",
            description = "Clears the authentication cookies and revokes the current JWT."
    )
    public String logout(@AuthenticationPrincipal Jwt jwt, HttpServletResponse response) {
        return logoutService.logout(jwt.getSubject(), response);
    }
}