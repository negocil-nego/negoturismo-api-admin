package com.negocil.negoturismo.admin.feature.role.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class RoleNotFoundException extends NotFoundException {
    public RoleNotFoundException() {
        super("Not Found by role");
    }

    public RoleNotFoundException(long id) {
        super(id);
    }

    public RoleNotFoundException(UUID uuid) {
        super(uuid);
    }
}
