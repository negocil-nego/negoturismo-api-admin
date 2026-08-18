package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuideTouristArea;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum TourGuideTouristAreaData {
    MATEUS_KALANDULA_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.MATEUS_KALANDULA_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.KALANDULA.getTouristArea())
                    .price(new BigDecimal("15000.00"))
                    .build()
    ),
    JULIETA_SERRA_LEBA_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.JULIETA_BENGUELA_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.SERRA_DA_LEBA.getTouristArea())
                    .price(new BigDecimal("20000.00"))
                    .build()
    );

    private final TourGuideTouristArea tourGuideTouristArea;
}
