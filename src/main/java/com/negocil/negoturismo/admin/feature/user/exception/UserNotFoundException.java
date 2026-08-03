package com.negocil.negoturismo.admin.feature.user.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException() {
        super("Not Found by user");
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(long id) {
        super(id);
    }

    public UserNotFoundException(UUID uuid) {
        super(uuid);
    }
}
