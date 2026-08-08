package com.negocil.negoturismo.admin.feature.organization.util;

public final class OrganizationQuery {
    public static final String ORGANIZATION_SEARCH = """
        SELECT o.* FROM TB_ORGANIZATIONS o
        WHERE o.deleted_at IS NULL AND o.deleted_by IS NULL
        AND o.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(o.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String ORGANIZATION_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_ORGANIZATIONS o
        WHERE o.deleted_at IS NULL AND o.deleted_by IS NULL
        AND o.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
