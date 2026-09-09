package com.negocil.negoturismo.admin.config.seeder.system;

import com.negocil.negoturismo.admin.feature.permission.model.Permission;
import com.negocil.negoturismo.admin.shared.core.enums.PermissionCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PermissionData {
    CREATE_USER(
            Permission.builder()
                    .code(PermissionCode.CREATE_USER)
                    .name("Create User")
                    .description("Permissão para criar usuários")
                    .build()
    ),
    UPDATE_USER(
            Permission.builder()
                    .code(PermissionCode.UPDATE_USER)
                    .name("Update User")
                    .description("Permissão para atualizar usuários")
                    .build()
    ),
    DELETE_USER(
            Permission.builder()
                    .code(PermissionCode.DELETE_USER)
                    .name("Delete User")
                    .description("Permissão para deletar usuários")
                    .build()
    ),
    READ_USER(
            Permission.builder()
                    .code(PermissionCode.READ_USER)
                    .name("Read User")
                    .description("Permissão para ler usuários")
                    .build()
    ),

    CREATE_CATEGORY(
            Permission.builder()
                    .code(PermissionCode.CREATE_CATEGORY)
                    .name("Create Category")
                    .description("Permissão para criar categorias")
                    .build()
    ),
    UPDATE_CATEGORY(
            Permission.builder()
                    .code(PermissionCode.UPDATE_CATEGORY)
                    .name("Update Category")
                    .description("Permissão para atualizar categorias")
                    .build()
    ),
    DELETE_CATEGORY(
            Permission.builder()
                    .code(PermissionCode.DELETE_CATEGORY)
                    .name("Delete Category")
                    .description("Permissão para deletar categorias")
                    .build()
    ),
    READ_CATEGORY(
            Permission.builder()
                    .code(PermissionCode.READ_CATEGORY)
                    .name("Read Category")
                    .description("Permissão para ler categorias")
                    .build()
    ),

    CREATE_ROLE(
            Permission.builder()
                    .code(PermissionCode.CREATE_ROLE)
                    .name("Create Role")
                    .description("Permissão para criar roles")
                    .build()
    ),
    UPDATE_ROLE(
            Permission.builder()
                    .code(PermissionCode.UPDATE_ROLE)
                    .name("Update Role")
                    .description("Permissão para atualizar roles")
                    .build()
    ),
    DELETE_ROLE(
            Permission.builder()
                    .code(PermissionCode.DELETE_ROLE)
                    .name("Delete Role")
                    .description("Permissão para deletar roles")
                    .build()
    ),
    READ_ROLE(
            Permission.builder()
                    .code(PermissionCode.READ_ROLE)
                    .name("Read Role")
                    .description("Permissão para ler roles")
                    .build()
    ),

    CREATE_PERMISSION(
            Permission.builder()
                    .code(PermissionCode.CREATE_PERMISSION)
                    .name("Create Permission")
                    .description("Permissão para criar permissões")
                    .build()
    ),
    UPDATE_PERMISSION(
            Permission.builder()
                    .code(PermissionCode.UPDATE_PERMISSION)
                    .name("Update Permission")
                    .description("Permissão para atualizar permissões")
                    .build()
    ),
    DELETE_PERMISSION(
            Permission.builder()
                    .code(PermissionCode.DELETE_PERMISSION)
                    .name("Delete Permission")
                    .description("Permissão para deletar permissões")
                    .build()
    ),
    READ_PERMISSION(
            Permission.builder()
                    .code(PermissionCode.READ_PERMISSION)
                    .name("Read Permission")
                    .description("Permissão para ler permissões")
                    .build()
    );

    private final Permission permission;
}
