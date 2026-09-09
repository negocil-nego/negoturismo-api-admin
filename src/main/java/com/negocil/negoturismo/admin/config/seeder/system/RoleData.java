package com.negocil.negoturismo.admin.config.seeder.system;

import com.negocil.negoturismo.admin.feature.role.model.Role;
import com.negocil.negoturismo.admin.shared.core.enums.RoleCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleData {
    ADMIN(
            Role.builder()
                    .code(RoleCode.ADMIN)
                    .name("Administrator")
                    .build()
    ),
    DEVELOPER(
            Role.builder()
                    .code(RoleCode.DEVELOPER)
                    .name("Developer")
                    .build()
    ),
    MANAGER(
            Role.builder()
                    .code(RoleCode.MANAGER)
                    .name("Manager")
                    .build()
    );

    private final Role role;
}
