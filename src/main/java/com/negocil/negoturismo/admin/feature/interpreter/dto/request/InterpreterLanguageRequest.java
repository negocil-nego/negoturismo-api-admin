package com.negocil.negoturismo.admin.feature.interpreter.dto.request;

import com.negocil.negoturismo.admin.feature.interpreter.model.InterpreterLanguage;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Schema(description = "Request payload for creating or updating an interpreter language")
public record InterpreterLanguageRequest(
        @Schema(description = "UUID of the interpreter", example = "550e8400-e29b-41d4-a716-446655440000", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        UUID interpreterUuid,

        @Schema(description = "Language name", example = "Spanish", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 100)
        @NotBlank
        String language
) {
    public InterpreterLanguage toModel() {
        return InterpreterLanguage.builder()
                .language(language)
                .build();
    }
}
