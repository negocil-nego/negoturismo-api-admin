package com.negocil.negoturismo.admin.shared.full_search.algolia.travel.dto;

import com.negocil.negoturismo.admin.shared.full_search.shared.contract.ISearchDocument;

public record TravelSearchDocument(
        String objectID,
        String city,
        String country,
        String description,
        String type
) implements ISearchDocument {}
