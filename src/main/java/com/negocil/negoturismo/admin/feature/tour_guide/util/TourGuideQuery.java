package com.negocil.negoturismo.admin.feature.tour_guide.util;

public final class TourGuideQuery {
    public static final String TOUR_GUIDE_SEARCH = """
        SELECT tg.* FROM TB_TOUR_GUIDES tg
        WHERE tg.deleted_at IS NULL AND tg.deleted_by IS NULL
        AND tg.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(tg.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String TOUR_GUIDE_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_TOUR_GUIDES tg
        WHERE tg.deleted_at IS NULL AND tg.deleted_by IS NULL
        AND tg.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
