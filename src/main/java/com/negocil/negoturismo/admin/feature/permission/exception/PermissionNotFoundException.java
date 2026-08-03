package com.negocil.negoturismo.admin.feature.permission.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class PermissionNotFoundException extends NotFoundException {
    public PermissionNotFoundException() {
        super("Not Found by permission");
    }

    public PermissionNotFoundException(long id) {
        super(id);
    }

    public PermissionNotFoundException(UUID uuid) {
        super(uuid);
    }
}
