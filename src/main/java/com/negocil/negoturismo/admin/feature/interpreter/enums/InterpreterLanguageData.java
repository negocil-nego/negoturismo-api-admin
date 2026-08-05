package com.negocil.negoturismo.admin.feature.interpreter.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InterpreterLanguageData {
    ANA_ENGLISH("anasilva", "Inglês"),
    CARLOS_FRENCH("carlosndalu", "Francês");

    private final String username;
    private final String language;
}
