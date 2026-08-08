package com.negocil.negoturismo.admin.feature.role.util;

public final class RoleQuery {
    public static final String ROLE_SEARCH = """
        SELECT r.* FROM TB_ROLES r
        WHERE r.deleted_at IS NULL AND r.deleted_by IS NULL
        AND r.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(r.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String ROLE_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_ROLES r
        WHERE r.deleted_at IS NULL AND r.deleted_by IS NULL
        AND r.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
