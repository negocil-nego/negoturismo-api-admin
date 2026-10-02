package com.negocil.negoturismo.admin.feature.travel.util;

public final class TravelQuery {
    public static final String TRAVEL_SEARCH = """
        SELECT t.* FROM TB_TRAVELS t
        WHERE t.deleted_at IS NULL AND t.deleted_by IS NULL
        AND t.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(t.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String TRAVEL_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_TRAVELS t
        WHERE t.deleted_at IS NULL AND t.deleted_by IS NULL
        AND t.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
