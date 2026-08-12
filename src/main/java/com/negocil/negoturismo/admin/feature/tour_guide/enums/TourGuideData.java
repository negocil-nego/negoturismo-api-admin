package com.negocil.negoturismo.admin.feature.tour_guide.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TourGuideData {
    MATEUS_KALANDULA_GUIDE("mateuskalandula", "Bride Printing Library in London, took a 1914 Cicero translation and scrambled it to make dummy text for Letraset's Body Type sheets. It has survived not only many decades, but also the leap into electronic typesetting, remaining essentially unchanged."),
    JULIETA_BENGUELA_GUIDE("julietabenguela", "It was popularised thanks to these sheets and more recently with desktop publishing software like Aldus PageMaker and Microsoft Word including versions of Lorem Ipsum");

    private final String username;
    private final String description;
}
