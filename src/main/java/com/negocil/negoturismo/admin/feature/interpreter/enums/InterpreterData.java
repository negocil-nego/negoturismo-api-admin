package com.negocil.negoturismo.admin.feature.interpreter.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InterpreterData {
    ANA_SILVA_INTERPRETER("anasilva", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's"),
    CARLOS_NDALU_INTERPRETER("carlosndalu", " standard dummy text ever since 1966, when designers at Letraset and James Mosley, the librarian at St");

    private final String username;
    private final String description;
}
