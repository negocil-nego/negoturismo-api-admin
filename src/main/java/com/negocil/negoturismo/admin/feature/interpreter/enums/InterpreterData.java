package com.negocil.negoturismo.admin.feature.interpreter.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InterpreterData {
    ANA_SILVA_INTERPRETER("anasilva", "ana.silva@negoturismo.com", "+244923456789", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's", "https://cdn.negocil.com/interpreters/anasilva.png", "https://cdn.negocil.com/interpreters/anasilva.mp4"),
    CARLOS_NDALU_INTERPRETER("carlosndalu", "carlos.ndalu@negoturismo.com", "+244912345678", " standard dummy text ever since 1966, when designers at Letraset and James Mosley, the librarian at St", "https://cdn.negocil.com/interpreters/carlosndalu.png", "https://cdn.negocil.com/interpreters/carlosndalu.mp4");

    private final String username;
    private final String email;
    private final String whatsapp;
    private final String description;
    private final String photo;
    private final String video;
}
