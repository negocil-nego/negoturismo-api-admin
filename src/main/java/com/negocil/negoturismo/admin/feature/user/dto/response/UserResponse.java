package com.negocil.negoturismo.admin.feature.user.dto.response;

import com.negocil.negoturismo.admin.feature.user.model.User;
import com.negocil.negoturismo.admin.shared.core.enums.UserStatus;
import com.negocil.negoturismo.admin.shared.core.enums.UserType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;
import java.util.UUID;

@Schema(description = "User data returned to clients")
public record UserResponse(
        @Schema(description = "Unique identifier of the user", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "User full name", example = "John Doe")
        String name,

        @Schema(description = "Username for login", example = "johndoe")
        String username,

        @Schema(description = "User email address", example = "john@example.com")
        String email,

        @Schema(description = "Phone number", example = "+351912345678")
        String phone,

        @Schema(description = "User birthday", example = "1990-01-15")
        LocalDate birthday,

        @Schema(description = "User type", example = "CLIENT")
        UserType type,

        @Schema(description = "User status", example = "PENDING")
        UserStatus status,

        @Schema(description = "Logo URL or path", example = "logo.png")
        String logo
) {
    public static UserResponse of(User user) {
        return new UserResponse(
                user.getUuid(),
                user.getName(),
                user.getUsername(),
                user.getEmail(),
                user.getPhone(),
                user.getBirthday(),
                user.getType(),
                user.getStatus(),
                user.getLogo()
        );
    }
}
