package com.negocil.negoturismo.admin.shared.core.exception;

import java.util.UUID;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super("Not Found");
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(long id) {
        super("Not found register by id %s".formatted(id));
    }

    public NotFoundException(UUID uuid) {
        super("Not found register by uuid %s".formatted(uuid));
    }
}
