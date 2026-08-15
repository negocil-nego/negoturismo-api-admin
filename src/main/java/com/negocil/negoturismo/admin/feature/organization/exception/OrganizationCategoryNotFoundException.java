package com.negocil.negoturismo.admin.feature.organization.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

public class OrganizationCategoryNotFoundException extends NotFoundException {
    public OrganizationCategoryNotFoundException() {
        super("Not Found by organization category");
    }

    public OrganizationCategoryNotFoundException(String message) {
        super(message);
    }

    public OrganizationCategoryNotFoundException(long id) {
        super(id);
    }
}
