package com.negocil.negoturismo.admin.feature.tour_guide.util;

public final class TouristAreaQuery {
    public static final String TOURIST_AREA_SEARCH = """
        SELECT ta.* FROM TB_TOURIST_AREAS ta
        WHERE ta.deleted_at IS NULL AND ta.deleted_by IS NULL
        AND ta.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(ta.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String TOURIST_AREA_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_TOURIST_AREAS ta
        WHERE ta.deleted_at IS NULL AND ta.deleted_by IS NULL
        AND ta.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
