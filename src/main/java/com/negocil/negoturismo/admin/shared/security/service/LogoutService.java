package com.negocil.negoturismo.admin.shared.security.service;

import com.negocil.negoturismo.admin.shared.core.i18n.I18n;
import com.negocil.negoturismo.admin.shared.security.util.CookieUtils;
import com.negocil.negoturismo.admin.shared.user.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LogoutService {
    private final UserService userService;
    private final I18n i18n;

    @Transactional
    public String logout(String subject, HttpServletResponse response) {
        var user = userService.findByUsernameOrEmail(subject);
        userService.invalidateTokens(user);
        response.addHeader(HttpHeaders.SET_COOKIE, CookieUtils.clearTokenCookie().toString());
        response.addHeader(HttpHeaders.SET_COOKIE, CookieUtils.clearStatusCookie().toString());
        return i18n.get(user, "security.logout.success");
    }
}