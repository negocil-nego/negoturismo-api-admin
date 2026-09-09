package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InterpreterData {
    ANA_SILVA_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.ANA_SILVA.getUser())
                    .email("ana.silva@negoturismo.com")
                    .whatsapp("+244923456789")
                    .description("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's")
                    .photo("https://cdn.negocil.com/interpreters/anasilva.png")
                    .video("https://cdn.negocil.com/interpreters/anasilva.mp4")
                    .build()
    ),
    CARLOS_NDALU_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.CARLOS_NDALU.getUser())
                    .email("carlos.ndalu@negoturismo.com")
                    .whatsapp("+244912345678")
                    .description(" standard dummy text ever since 1966, when designers at Letraset and James Mosley, the librarian at St")
                    .photo("https://cdn.negocil.com/interpreters/carlosndalu.png")
                    .video("https://cdn.negocil.com/interpreters/carlosndalu.mp4")
                    .build()
    );

    private final Interpreter interpreter;
}
