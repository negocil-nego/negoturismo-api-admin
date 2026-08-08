package com.negocil.negoturismo.admin.feature.tour_guide.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TourGuideData {
    MATEUS_KALANDULA_GUIDE("mateuskalandula"),
    JULIETA_BENGUELA_GUIDE("julietabenguela");

    private final String username;
}
