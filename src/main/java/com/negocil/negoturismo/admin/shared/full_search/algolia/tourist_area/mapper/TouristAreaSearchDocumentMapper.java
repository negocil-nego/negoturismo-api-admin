package com.negocil.negoturismo.admin.shared.full_search.algolia.tourist_area.mapper;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.shared.full_search.algolia.tourist_area.dto.TouristAreaSearchDocument;

public final class TouristAreaSearchDocumentMapper {

    private TouristAreaSearchDocumentMapper() {}

    public static TouristAreaSearchDocument toDocument(TouristArea touristArea) {
        return new TouristAreaSearchDocument(
                String.valueOf(touristArea.getUuid()),
                touristArea.getName(),
                touristArea.getState(),
                touristArea.getAddress(),
                touristArea.getProvince() != null ? touristArea.getProvince().name() : null,
                touristArea.getImage()
        );
    }
}
