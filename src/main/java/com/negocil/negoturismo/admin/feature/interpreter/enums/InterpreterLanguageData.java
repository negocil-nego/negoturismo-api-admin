package com.negocil.negoturismo.admin.feature.interpreter.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InterpreterLanguageData {
    ANA_ENGLISH("anasilva", CountryLanguage.ENGLISH),
    CARLOS_FRENCH("carlosndalu", CountryLanguage.FRENCH);

    private final String username;
    private final CountryLanguage language;
}
