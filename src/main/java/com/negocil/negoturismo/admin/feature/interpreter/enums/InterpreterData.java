package com.negocil.negoturismo.admin.feature.interpreter.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InterpreterData {
    ANA_SILVA_INTERPRETER("anasilva"),
    CARLOS_NDALU_INTERPRETER("carlosndalu");

    private final String username;
}
