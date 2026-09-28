package com.negocil.negoturismo.admin.feature.tour_guide.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

public class TouristAreaFileNotFoundException extends NotFoundException {
    public TouristAreaFileNotFoundException() {
        super("Not Found by tourist area file");
    }

    public TouristAreaFileNotFoundException(String message) {
        super(message);
    }

    public TouristAreaFileNotFoundException(long id) {
        super(id);
    }
}
