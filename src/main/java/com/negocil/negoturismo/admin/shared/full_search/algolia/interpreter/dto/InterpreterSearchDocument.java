package com.negocil.negoturismo.admin.shared.full_search.algolia.interpreter.dto;

import com.negocil.negoturismo.admin.shared.full_search.shared.contract.ISearchDocument;

public record InterpreterSearchDocument(
        String objectID,
        String slug,
        String concat,
        String description
) implements ISearchDocument {}
