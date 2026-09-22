package com.negocil.negoturismo.admin.shared.security.controller;

import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import com.negocil.negoturismo.admin.shared.security.dto.request.LoginRequest;
import com.negocil.negoturismo.admin.shared.security.dto.response.IssuedToken;
import com.negocil.negoturismo.admin.shared.security.service.LoginService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.LOGIN)
@Tag(name = "Login", description = "Endpoints for admin authentication")
public class LoginController {
    private final LoginService loginService;

    @Operation(
            operationId = "loginAdmin",
            summary = "Login via JSON",
            description = "Authenticates the admin with username/email and password, returns a JWT token. The login attempt and device are recorded."
    )
    @PostMapping()
    public IssuedToken token(@RequestBody LoginRequest request, HttpServletResponse response, HttpServletRequest httpRequest) {
        return loginService.login(request, response, httpRequest);
    }
}
