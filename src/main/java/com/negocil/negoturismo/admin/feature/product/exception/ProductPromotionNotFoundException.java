package com.negocil.negoturismo.admin.feature.product.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

public class ProductPromotionNotFoundException extends NotFoundException {
    public ProductPromotionNotFoundException() {
        super("Not Found by product promotion");
    }

    public ProductPromotionNotFoundException(String message) {
        super(message);
    }

    public ProductPromotionNotFoundException(long id) {
        super(id);
    }
}
