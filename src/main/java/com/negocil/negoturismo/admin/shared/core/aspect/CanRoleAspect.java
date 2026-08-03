package com.negocil.negoturismo.admin.shared.core.aspect;

import com.negocil.negoturismo.admin.shared.core.annotation.CanRole;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Aspect
@Component
@RequiredArgsConstructor
public class CanRoleAspect {

    @Before("@annotation(canRole)")
    public void checkRole(JoinPoint joinPoint, CanRole canRole) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            throw new AuthenticationCredentialsNotFoundException("User is not authenticated");
        }

        String requiredRole = canRole.value();
        UUID userId = extractUserId(authentication);

        boolean hasRole = true;

        if (!hasRole) {
            throw new AccessDeniedException("User does not have the required role: " + requiredRole);
        }
    }

    private UUID extractUserId(Authentication authentication) {
        throw new AccessDeniedException("Unable to resolve authenticated user");
    }
}
