package com.negocil.negoturismo.admin.feature.product.util;

public final class ProductPromotionQuery {
    public static final String PRODUCT_PROMOTION_SEARCH = """
        SELECT pp.* FROM TB_PRODUCT_PROMOTIONS pp
        WHERE pp.status = 'ACTIVE' AND pp.started_at <= CURRENT_TIMESTAMP AND pp.completed_at >= CURRENT_TIMESTAMP
        AND pp.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(pp.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String PRODUCT_PROMOTION_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_PRODUCT_PROMOTIONS pp
        WHERE pp.status = 'ACTIVE' AND pp.started_at <= CURRENT_TIMESTAMP AND pp.completed_at >= CURRENT_TIMESTAMP
        AND pp.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
