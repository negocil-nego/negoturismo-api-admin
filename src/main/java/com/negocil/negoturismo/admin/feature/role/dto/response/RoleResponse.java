package com.negocil.negoturismo.admin.feature.role.dto.response;

import com.negocil.negoturismo.admin.feature.role.model.Role;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Set;
import java.util.UUID;

@Schema(description = "Role data returned to clients")
public record RoleResponse(
        @Schema(description = "Unique identifier of the role", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "Unique code for the role", example = "ADMIN")
        String code,

        @Schema(description = "Role name", example = "Administrator")
        String name,

        @Schema(description = "Role description", example = "System administrator", nullable = true)
        String description,

        @Schema(description = "Set of permission UUIDs assigned to this role")
        Set<UUID> permissionUuids
) {
    public static RoleResponse of(Role role) {
        return new RoleResponse(
                role.getUuid(),
                role.getCode(),
                role.getName(),
                role.getDescription(),
                role.getPermissions() != null
                        ? role.getPermissions().stream().map(p -> p.getUuid()).collect(java.util.stream.Collectors.toSet())
                        : java.util.Set.of()
        );
    }
}
