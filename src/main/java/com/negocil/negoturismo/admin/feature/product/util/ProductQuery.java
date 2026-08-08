package com.negocil.negoturismo.admin.feature.product.util;

public final class ProductQuery {
    public static final String PRODUCT_SEARCH = """
        SELECT p.* FROM TB_PRODUCTS p
        WHERE p.deleted_at IS NULL AND p.deleted_by IS NULL
        AND p.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(p.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String PRODUCT_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_PRODUCTS p
        WHERE p.deleted_at IS NULL AND p.deleted_by IS NULL
        AND p.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
