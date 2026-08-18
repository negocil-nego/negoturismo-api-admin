package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TourGuideData {
    MATEUS_KALANDULA_GUIDE(
            TourGuide.builder()
                    .user(UserData.MATEUS_KALANDULA.getUser())
                    .email("mateus.kalandula@negoturismo.com")
                    .whatsapp("+244933456789")
                    .description("Bride Printing Library in London, took a 1914 Cicero translation and scrambled it to make dummy text for Letraset's Body Type sheets. It has survived not only many decades, but also the leap into electronic typesetting, remaining essentially unchanged.")
                    .photo("https://cdn.negocil.com/tour-guides/mateuskalandula.png")
                    .video("https://cdn.negocil.com/tour-guides/mateuskalandula.mp4")
                    .build()
    ),
    JULIETA_BENGUELA_GUIDE(
            TourGuide.builder()
                    .user(UserData.JULIETA_BENGUELA.getUser())
                    .email("julieta.benguela@negoturismo.com")
                    .whatsapp("+244943456789")
                    .description("It was popularised thanks to these sheets and more recently with desktop publishing software like Aldus PageMaker and Microsoft Word including versions of Lorem Ipsum")
                    .photo("https://cdn.negocil.com/tour-guides/julietabenguela.png")
                    .video("https://cdn.negocil.com/tour-guides/julietabenguela.mp4")
                    .build()
    );

    private final TourGuide tourGuide;
}
