package com.negocil.negoturismo.admin.feature.category.util;

public final class CategoryQuery {
    public static final String CATEGORY_SEARCH = """
        SELECT c.* FROM TB_CATEGORIES c
        WHERE c.deleted_at IS NULL AND c.deleted_by IS NULL
        AND c.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(c.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String CATEGORY_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_CATEGORIES c
        WHERE c.deleted_at IS NULL AND c.deleted_by IS NULL
        AND c.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
