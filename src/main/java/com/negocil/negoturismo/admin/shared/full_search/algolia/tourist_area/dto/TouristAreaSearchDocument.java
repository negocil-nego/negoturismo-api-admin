package com.negocil.negoturismo.admin.shared.full_search.algolia.tourist_area.dto;

import com.negocil.negoturismo.admin.shared.full_search.shared.contract.ISearchDocument;

public record TouristAreaSearchDocument(
        String objectID,
        String name,
        String state,
        String address,
        String province,
        String image
) implements ISearchDocument {}
