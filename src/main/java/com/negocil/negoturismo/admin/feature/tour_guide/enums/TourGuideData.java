package com.negocil.negoturismo.admin.feature.tour_guide.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TourGuideData {
    MATEUS_KALANDULA_GUIDE("mateuskalandula", "mateus.kalandula@negoturismo.com", "+244933456789", "Bride Printing Library in London, took a 1914 Cicero translation and scrambled it to make dummy text for Letraset's Body Type sheets. It has survived not only many decades, but also the leap into electronic typesetting, remaining essentially unchanged.", "https://cdn.negocil.com/tour-guides/mateuskalandula.png", "https://cdn.negocil.com/tour-guides/mateuskalandula.mp4"),
    JULIETA_BENGUELA_GUIDE("julietabenguela", "julieta.benguela@negoturismo.com", "+244943456789", "It was popularised thanks to these sheets and more recently with desktop publishing software like Aldus PageMaker and Microsoft Word including versions of Lorem Ipsum", "https://cdn.negocil.com/tour-guides/julietabenguela.png", "https://cdn.negocil.com/tour-guides/julietabenguela.mp4");

    private final String username;
    private final String email;
    private final String whatsapp;
    private final String description;
    private final String photo;
    private final String video;
}
