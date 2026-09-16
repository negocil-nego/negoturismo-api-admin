package com.negocil.negoturismo.admin.shared.user.exception;

import com.negocil.negoturismo.admin.shared.core.exception.ForbiddenException;

public class UserBlockedStatusException extends ForbiddenException {
    public UserBlockedStatusException(String message) {
        super(message);
    }
}
