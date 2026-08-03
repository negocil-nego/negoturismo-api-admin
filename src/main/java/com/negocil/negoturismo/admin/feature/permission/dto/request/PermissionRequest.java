package com.negocil.negoturismo.admin.feature.permission.dto.request;

import com.negocil.negoturismo.admin.feature.permission.model.Permission;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "Request payload for creating or updating a permission")
public record PermissionRequest(
        @Schema(description = "Unique code for the permission", example = "CREATE_USER", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 100)
        @NotBlank
        @Size(max = 100)
        String code,

        @Schema(description = "Permission name", example = "Create User", requiredMode = Schema.RequiredMode.NOT_REQUIRED, maxLength = 255)
        @Size(max = 255)
        String name,

        @Schema(description = "Permission description", example = "Allows creating new users", requiredMode = Schema.RequiredMode.NOT_REQUIRED, maxLength = 500)
        @Size(max = 500)
        String description
) {
    public Permission toModel() {
        return Permission.builder()
                .code(code)
                .name(name)
                .description(description)
                .build();
    }
}
