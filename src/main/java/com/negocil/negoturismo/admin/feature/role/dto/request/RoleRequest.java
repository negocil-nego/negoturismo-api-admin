package com.negocil.negoturismo.admin.feature.role.dto.request;

import com.negocil.negoturismo.admin.feature.role.model.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Set;
import java.util.UUID;

@Schema(description = "Request payload for creating or updating a role")
public record RoleRequest(
        @Schema(description = "Unique code for the role", example = "ADMIN", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 100)
        @NotBlank
        @Size(max = 100)
        String code,

        @Schema(description = "Role name", example = "Administrator", requiredMode = Schema.RequiredMode.NOT_REQUIRED, maxLength = 255)
        @Size(max = 255)
        String name,

        @Schema(description = "Set of permission UUIDs to assign to this role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        Set<UUID> permissionUuids
) {
    public Role toModel() {
        return Role.builder()
                .code(code)
                .name(name)
                .build();
    }
}
