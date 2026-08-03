package com.negocil.negoturismo.admin.feature.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserEmailNotFoundException extends UserNotFoundException {
    public UserEmailNotFoundException() {
        super("User not found by email");
    }

    public UserEmailNotFoundException(String email) {
        super("User not found by email %s".formatted(email));
    }
}
