package com.negocil.negoturismo.admin.feature.product.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class ProductNotFoundException extends NotFoundException {
    public ProductNotFoundException() {
        super("Not Found by product");
    }

    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException(long id) {
        super(id);
    }

    public ProductNotFoundException(UUID uuid) {
        super(uuid);
    }
}
