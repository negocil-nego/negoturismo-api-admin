package com.negocil.negoturismo.admin.feature.category.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class CategoryNotFoundException extends NotFoundException {
    public CategoryNotFoundException() {
        super("Not Found by category");
    }

    public CategoryNotFoundException(String message) {
        super(message);
    }

    public CategoryNotFoundException(long id) {
        super(id);
    }

    public CategoryNotFoundException(UUID uuid) {
        super(uuid);
    }
}
