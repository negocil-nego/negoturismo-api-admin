package com.negocil.negoturismo.admin.feature.tour_guide.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class TouristAreaNotFoundException extends NotFoundException {
    public TouristAreaNotFoundException() {
        super("Not Found by tourist area");
    }

    public TouristAreaNotFoundException(String message) {
        super(message);
    }

    public TouristAreaNotFoundException(long id) {
        super(id);
    }

    public TouristAreaNotFoundException(UUID uuid) {
        super(uuid);
    }
}
