package com.negocil.negoturismo.admin.feature.role.model;

import com.negocil.negoturismo.admin.shared.core.enums.RoleCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleData {
    ADMIN(RoleCode.ADMIN, "Administrator"),
    DEVELOPER(RoleCode.DEVELOPER, "Developer"),
    MANAGER(RoleCode.MANAGER, "Manager");

    private final String code;
    private final String name;

    public Role getRole() {
        return Role.builder()
                .code(code)
                .name(name)
                .build();
    }
}
