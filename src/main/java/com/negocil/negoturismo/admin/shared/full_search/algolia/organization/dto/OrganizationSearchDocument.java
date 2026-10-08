package com.negocil.negoturismo.admin.shared.full_search.algolia.organization.dto;

import com.negocil.negoturismo.admin.shared.full_search.shared.contract.ISearchDocument;

public record OrganizationSearchDocument(
        String objectID,
        String name,
        String description,
        String address,
        Integer rating,
        String location
) implements ISearchDocument {}
