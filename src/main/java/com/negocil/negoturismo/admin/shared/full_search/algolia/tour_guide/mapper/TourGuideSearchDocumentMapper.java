package com.negocil.negoturismo.admin.shared.full_search.algolia.tour_guide.mapper;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import com.negocil.negoturismo.admin.shared.full_search.algolia.tour_guide.dto.TourGuideSearchDocument;

public final class TourGuideSearchDocumentMapper {

    private TourGuideSearchDocumentMapper() {}

    public static TourGuideSearchDocument toDocument(TourGuide tourGuide) {
        return new TourGuideSearchDocument(
                String.valueOf(tourGuide.getUuid()),
                tourGuide.getSlug(),
                tourGuide.getConcat(),
                tourGuide.getDescription()
        );
    }
}
