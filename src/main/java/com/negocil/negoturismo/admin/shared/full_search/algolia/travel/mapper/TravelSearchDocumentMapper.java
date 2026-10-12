package com.negocil.negoturismo.admin.shared.full_search.algolia.travel.mapper;

import com.negocil.negoturismo.admin.feature.travel.model.Travel;
import com.negocil.negoturismo.admin.shared.full_search.algolia.travel.dto.TravelSearchDocument;

public final class TravelSearchDocumentMapper {

    private TravelSearchDocumentMapper() {}

    public static TravelSearchDocument toDocument(Travel travel) {
        return new TravelSearchDocument(
                String.valueOf(travel.getUuid()),
                travel.getCity(),
                travel.getCountry() != null ? travel.getCountry().getName() : null,
                travel.getDescription(),
                travel.getType() != null ? travel.getType().getLabel() : null
        );
    }
}
