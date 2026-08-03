package com.negocil.negoturismo.admin.feature.permission.model;

import com.negocil.negoturismo.admin.shared.core.enums.PermissionCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PermissionData {
    CREATE_USER(PermissionCode.CREATE_USER, "Create User", "Permissão para criar usuários"),
    UPDATE_USER(PermissionCode.UPDATE_USER, "Update User", "Permissão para atualizar usuários"),
    DELETE_USER(PermissionCode.DELETE_USER, "Delete User", "Permissão para deletar usuários"),
    READ_USER(PermissionCode.READ_USER, "Read User", "Permissão para ler usuários"),

    CREATE_CATEGORY(PermissionCode.CREATE_CATEGORY, "Create Category", "Permissão para criar categorias"),
    UPDATE_CATEGORY(PermissionCode.UPDATE_CATEGORY, "Update Category", "Permissão para atualizar categorias"),
    DELETE_CATEGORY(PermissionCode.DELETE_CATEGORY, "Delete Category", "Permissão para deletar categorias"),
    READ_CATEGORY(PermissionCode.READ_CATEGORY, "Read Category", "Permissão para ler categorias"),

    CREATE_ROLE(PermissionCode.CREATE_ROLE, "Create Role", "Permissão para criar roles"),
    UPDATE_ROLE(PermissionCode.UPDATE_ROLE, "Update Role", "Permissão para atualizar roles"),
    DELETE_ROLE(PermissionCode.DELETE_ROLE, "Delete Role", "Permissão para deletar roles"),
    READ_ROLE(PermissionCode.READ_ROLE, "Read Role", "Permissão para ler roles"),

    CREATE_PERMISSION(PermissionCode.CREATE_PERMISSION, "Create Permission", "Permissão para criar permissões"),
    UPDATE_PERMISSION(PermissionCode.UPDATE_PERMISSION, "Update Permission", "Permissão para atualizar permissões"),
    DELETE_PERMISSION(PermissionCode.DELETE_PERMISSION, "Delete Permission", "Permissão para deletar permissões"),
    READ_PERMISSION(PermissionCode.READ_PERMISSION, "Read Permission", "Permissão para ler permissões");

    private final String code;
    private final String name;
    private final String description;

    public Permission getPermission() {
        return Permission.builder()
                .code(code)
                .name(name)
                .description(description)
                .build();
    }
}
