package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.config.seeder.system.TouristAreaData;
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
    ),

    TERESA_KIALA_TUNDAVALA_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.TERESA_KIALA_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.TUNDAVALA.getTouristArea())
                    .price(new BigDecimal("12000.00"))
                    .build()
    ),

    HUGO_BENGUELA_AVENIDA_4_DE_FEVEREIRO_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.HUGO_BENGUELA_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.AVENIDA_4_DE_FEVEREIRO.getTouristArea())
                    .price(new BigDecimal("10000.00"))
                    .build()
    ),

    OLGA_MINGAS_MUSEU_DA_MOEDA_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.OLGA_MINGAS_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.MUSEU_DA_MOEDA.getTouristArea())
                    .price(new BigDecimal("10000.00"))
                    .build()
    ),

    LOURENCO_MINGAS_FORTALESA_DE_SAO_MIGUEL_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.LOURENCO_MINGAS_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.FORTALESA_DE_SAO_MIGUEL.getTouristArea())
                    .price(new BigDecimal("15000.00"))
                    .build()
    ),

    REGINA_KAMBUE_ILHA_DO_MUSSULO_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.REGINA_KAMBUE_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.ILHA_DO_MUSSULO.getTouristArea())
                    .price(new BigDecimal("18000.00"))
                    .build()
    ),

    ISRAEL_KAMBALE_MIRADOURO_DA_LUA_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.ISRAEL_KAMBALE_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.MIRADOURO_DA_LUA.getTouristArea())
                    .price(new BigDecimal("15000.00"))
                    .build()
    ),

    PALMIRA_NETO_PALACIO_DE_FERRO_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.PALMIRA_NETO_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.PALACIO_DE_FERRO.getTouristArea())
                    .price(new BigDecimal("10000.00"))
                    .build()
    ),

    BELMIRO_NETO_SANGANO_BEACH_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.BELMIRO_NETO_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.SANGANO_BEACH.getTouristArea())
                    .price(new BigDecimal("20000.00"))
                    .build()
    ),

    ESTER_KIALA_MUSEU_OF_AGOSTHINO_NETO_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.ESTER_KIALA_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.MUSEU_OF_AGOSTHINO_NETO.getTouristArea())
                    .price(new BigDecimal("12000.00"))
                    .build()
    ),

    OSVALDO_KIALA_MUSEU_NACIONAL_DA_ESCRAVATURA_ASSIGNMENT(
            TourGuideTouristArea.builder()
                    .tourGuide(TourGuideData.OSVALDO_KIALA_GUIDE.getTourGuide())
                    .touristArea(TouristAreaData.MUSEU_NACIONAL_DA_ESCRAVATURA.getTouristArea())
                    .price(new BigDecimal("25000.00"))
                    .build()
    );

    private final TourGuideTouristArea tourGuideTouristArea;
}
