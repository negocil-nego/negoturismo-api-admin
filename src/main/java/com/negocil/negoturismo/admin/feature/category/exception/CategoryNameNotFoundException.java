package com.negocil.negoturismo.admin.feature.category.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CategoryNameNotFoundException extends CategoryNotFoundException {
    public CategoryNameNotFoundException() {
        super("Category not found by name");
    }

    public CategoryNameNotFoundException(String username) {
        super("Category not found by name %s".formatted(username));
    }
}
