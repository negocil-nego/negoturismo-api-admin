package com.negocil.negoturismo.admin.feature.interpreter.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class InterpreterLanguageNotFoundException extends NotFoundException {
    public InterpreterLanguageNotFoundException() {
        super("Not Found by interpreter language");
    }

    public InterpreterLanguageNotFoundException(String message) {
        super(message);
    }

    public InterpreterLanguageNotFoundException(long id) {
        super(id);
    }

    public InterpreterLanguageNotFoundException(UUID uuid) {
        super(uuid);
    }
}
