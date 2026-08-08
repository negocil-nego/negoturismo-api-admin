package com.negocil.negoturismo.admin.feature.interpreter.dto.response;

import com.negocil.negoturismo.admin.feature.interpreter.model.InterpreterLanguage;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Interpreter language data returned to clients")
public record InterpreterLanguageResponse(
        @Schema(description = "Unique identifier of the interpreter language", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "UUID of the interpreter", example = "550e8400-e29b-41d4-a716-446655440001")
        UUID interpreterUuid,

        @Schema(description = "Language name", example = "Spanish")
        String language,

        @Schema(description = "Computed concatenation of interpreter name and language", example = "John Doe - Spanish")
        String concat
) {
    public static InterpreterLanguageResponse of(InterpreterLanguage interpreterLanguage) {
        return new InterpreterLanguageResponse(
                interpreterLanguage.getUuid(),
                interpreterLanguage.getInterpreter().getUuid(),
                interpreterLanguage.getLanguage(),
                interpreterLanguage.getConcat()
        );
    }
}
