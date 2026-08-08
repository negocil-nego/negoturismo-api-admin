package com.negocil.negoturismo.admin.feature.interpreter.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class InterpreterNotFoundException extends NotFoundException {
    public InterpreterNotFoundException() {
        super("Not Found by interpreter");
    }

    public InterpreterNotFoundException(String message) {
        super(message);
    }

    public InterpreterNotFoundException(long id) {
        super(id);
    }

    public InterpreterNotFoundException(UUID uuid) {
        super(uuid);
    }
}
