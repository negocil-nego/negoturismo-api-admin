package com.negocil.negoturismo.admin.shared.full_search.algolia.tour_guide.dto;

import com.negocil.negoturismo.admin.shared.full_search.shared.contract.ISearchDocument;

public record TourGuideSearchDocument(
        String objectID,
        String slug,
        String concat,
        String description
) implements ISearchDocument {}
