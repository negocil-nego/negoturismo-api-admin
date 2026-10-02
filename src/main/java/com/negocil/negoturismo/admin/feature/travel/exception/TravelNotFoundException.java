package com.negocil.negoturismo.admin.feature.travel.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class TravelNotFoundException extends NotFoundException {
    public TravelNotFoundException() {
        super("Not Found by travel");
    }

    public TravelNotFoundException(long id) {
        super(id);
    }

    public TravelNotFoundException(UUID uuid) {
        super(uuid);
    }
}
