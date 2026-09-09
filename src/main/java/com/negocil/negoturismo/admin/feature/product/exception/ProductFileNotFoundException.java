package com.negocil.negoturismo.admin.feature.product.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

public class ProductFileNotFoundException extends NotFoundException {
    public ProductFileNotFoundException() {
        super("Not Found by product file");
    }

    public ProductFileNotFoundException(String message) {
        super(message);
    }

    public ProductFileNotFoundException(long id) {
        super(id);
    }
}
