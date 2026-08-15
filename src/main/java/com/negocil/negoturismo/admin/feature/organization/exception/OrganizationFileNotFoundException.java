package com.negocil.negoturismo.admin.feature.organization.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

public class OrganizationFileNotFoundException extends NotFoundException {
    public OrganizationFileNotFoundException() {
        super("Not Found by organization file");
    }

    public OrganizationFileNotFoundException(String message) {
        super(message);
    }

    public OrganizationFileNotFoundException(long id) {
        super(id);
    }
}
