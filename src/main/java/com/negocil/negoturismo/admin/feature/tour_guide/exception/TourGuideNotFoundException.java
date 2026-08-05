package com.negocil.negoturismo.admin.feature.tour_guide.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class TourGuideNotFoundException extends NotFoundException {
    public TourGuideNotFoundException() {
        super("Not Found by tour guide");
    }

    public TourGuideNotFoundException(String message) {
        super(message);
    }

    public TourGuideNotFoundException(long id) {
        super(id);
    }

    public TourGuideNotFoundException(UUID uuid) {
        super(uuid);
    }
}
