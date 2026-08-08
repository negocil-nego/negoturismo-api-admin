package com.negocil.negoturismo.admin.feature.organization.util;

public final class OrganizationHighlightsQuery {
    public static final String ORGANIZATION_HIGHLIGHTS_SEARCH = """
        SELECT oh.* FROM TB_ORGANIZATION_HIGHLIGHTS oh
        WHERE oh.status = 'ACTIVE' AND oh.started_at <= CURRENT_TIMESTAMP AND oh.completed_at >= CURRENT_TIMESTAMP
        AND oh.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(oh.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String ORGANIZATION_HIGHLIGHTS_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_ORGANIZATION_HIGHLIGHTS oh
        WHERE oh.status = 'ACTIVE' AND oh.started_at <= CURRENT_TIMESTAMP AND oh.completed_at >= CURRENT_TIMESTAMP
        AND oh.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
