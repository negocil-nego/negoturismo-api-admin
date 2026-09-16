package com.negocil.negoturismo.admin.shared.user.dto.request;

import com.negocil.negoturismo.admin.shared.user.model.User;
import com.negocil.negoturismo.admin.shared.user.enums.UserStatus;
import com.negocil.negoturismo.admin.shared.user.enums.UserType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Schema(description = "Request payload for creating or updating a user")
public record UserRequest(
        @Schema(description = "User full name", example = "John Doe", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 255)
        @NotBlank
        @Size(max = 255)
        String name,

        @Schema(description = "Username for login", example = "johndoe", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 100)
        @NotBlank
        @Size(max = 100)
        String username,

        @Schema(description = "User email address", example = "john@example.com", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotBlank
        @Email
        String email,

        @Schema(description = "Phone number with optional country code", example = "+351912345678", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @Pattern(regexp = "^\\+?[0-9]{7,15}$", message = "Phone invalid")
        @Size(max = 15)
        String phone,

        @Schema(description = "User password", example = "password123", requiredMode = Schema.RequiredMode.REQUIRED, minLength = 6)
        @NotBlank
        @Size(min = 6)
        String password,

        @Schema(description = "User birthday", example = "1990-01-15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        LocalDate birthday,

        @Schema(description = "User type", example = "CLIENT", requiredMode = Schema.RequiredMode.NOT_REQUIRED, allowableValues = {"CLIENT", "ADMIN", "MANAGER"})
        UserType type,

        @Schema(description = "User status", example = "PENDING", requiredMode = Schema.RequiredMode.NOT_REQUIRED, allowableValues = {"ACTIVE", "INACTIVE", "PENDING", "BLOCKED"})
        UserStatus status,

        @Schema(description = "Logo URL or path", example = "logo.png", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        String logo
) {
    public User toModel() {
        return User.builder()
                .name(name)
                .username(username)
                .email(email)
                .phone(phone)
                .password(password)
                .birthday(birthday)
                .type(type)
                .status(status)
                .logo(logo)
                .build();
    }
}
