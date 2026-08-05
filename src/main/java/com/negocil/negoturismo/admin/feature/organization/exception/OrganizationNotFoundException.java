package com.negocil.negoturismo.admin.feature.organization.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class OrganizationNotFoundException extends NotFoundException {
    public OrganizationNotFoundException() {
        super("Not Found by organization");
    }

    public OrganizationNotFoundException(String message) {
        super(message);
    }

    public OrganizationNotFoundException(long id) {
        super(id);
    }

    public OrganizationNotFoundException(UUID uuid) {
        super(uuid);
    }
}
