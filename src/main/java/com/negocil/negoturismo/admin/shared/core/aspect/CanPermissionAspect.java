package com.negocil.negoturismo.admin.shared.core.aspect;

import com.negocil.negoturismo.admin.shared.core.annotation.CanPermission;
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
public class CanPermissionAspect {
    //private final UserPermissionService userPermissionService;

    @Before("@annotation(canPermission)")
    public void checkPermission(JoinPoint joinPoint, CanPermission canPermission) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            throw new AuthenticationCredentialsNotFoundException("User is not authenticated");
        }

        String requiredPermission = canPermission.value();
        UUID userId = extractUserId(authentication);

        boolean hasPermission = true;

        if (!hasPermission) {
            throw new AccessDeniedException("User does not have the required permission: " + requiredPermission);
        }
    }

    private UUID extractUserId(Authentication authentication) {

        throw new AccessDeniedException("Unable to resolve authenticated user");
    }
}