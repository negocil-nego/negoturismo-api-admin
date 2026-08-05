package com.negocil.negoturismo.admin.feature.tour_guide.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum TourGuideTouristAreaData {
    MATEUS_KALANDULA_ASSIGNMENT("mateuskalandula", "Quedas de Kalandula", new BigDecimal("15000.00")),
    JULIETA_SERRA_LEBA_ASSIGNMENT("julietabenguela", "Serra da Leba", new BigDecimal("20000.00"));

    private final String guideUsername;
    private final String touristAreaName;
    private final BigDecimal price;
}
