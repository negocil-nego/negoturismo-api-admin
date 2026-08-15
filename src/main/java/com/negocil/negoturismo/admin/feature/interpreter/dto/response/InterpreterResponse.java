package com.negocil.negoturismo.admin.feature.interpreter.dto.response;

import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Interpreter data returned to clients")
public record InterpreterResponse(
        @Schema(description = "Unique identifier of the interpreter", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "UUID of the associated user", example = "550e8400-e29b-41d4-a716-446655440001")
        UUID userUuid,

        @Schema(description = "Email address of the interpreter", example = "interpreter@example.com")
        String email,

        @Schema(description = "WhatsApp contact number of the interpreter", example = "+244923456789")
        String whatsapp,

        @Schema(description = "Photo URL of the interpreter", example = "https://cdn.negocil.com/interpreters/photo.png")
        String photo,

        @Schema(description = "Video URL of the interpreter", example = "https://cdn.negocil.com/interpreters/video.mp4")
        String video
) {
    public static InterpreterResponse of(Interpreter interpreter) {
        return new InterpreterResponse(
                interpreter.getUuid(),
                interpreter.getUser() != null ? interpreter.getUser().getUuid() : null,
                interpreter.getEmail(),
                interpreter.getWhatsapp(),
                interpreter.getPhoto(),
                interpreter.getVideo()
        );
    }
}
