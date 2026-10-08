package com.negocil.negoturismo.admin.shared.full_search.algolia.product.dto;

import com.negocil.negoturismo.admin.shared.full_search.shared.contract.ISearchDocument;

import java.math.BigDecimal;

public record ProductSearchDocument(
        String objectID,
        String name,
        String description,
        BigDecimal price
) implements ISearchDocument {}
