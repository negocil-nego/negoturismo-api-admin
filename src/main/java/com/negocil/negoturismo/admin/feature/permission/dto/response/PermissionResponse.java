package com.negocil.negoturismo.admin.feature.permission.dto.response;

import com.negocil.negoturismo.admin.feature.permission.model.Permission;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Permission data returned to clients")
public record PermissionResponse(
        @Schema(description = "Unique identifier of the permission", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "Unique code for the permission", example = "CREATE_USER")
        String code,

        @Schema(description = "Permission name", example = "Create User")
        String name,

        @Schema(description = "Permission description", example = "Allows creating new users")
        String description
) {
    public static PermissionResponse of(Permission permission) {
        return new PermissionResponse(
                permission.getUuid(),
                permission.getCode(),
                permission.getName(),
                permission.getDescription()
        );
    }
}
