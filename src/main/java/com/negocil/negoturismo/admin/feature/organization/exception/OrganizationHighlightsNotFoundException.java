package com.negocil.negoturismo.admin.feature.organization.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

public class OrganizationHighlightsNotFoundException extends NotFoundException {
    public OrganizationHighlightsNotFoundException() {
        super("Not Found by organization highlights");
    }

    public OrganizationHighlightsNotFoundException(String message) {
        super(message);
    }

    public OrganizationHighlightsNotFoundException(long id) {
        super(id);
    }
}
