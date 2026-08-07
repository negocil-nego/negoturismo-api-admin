package com.negocil.negoturismo.admin.feature.permission.util;

public final class PermissionQuery {
    public static final String PERMISSION_SEARCH = """
        SELECT p.* FROM TB_PERMISSIONS p
        WHERE p.deleted_at IS NULL AND p.deleted_by IS NULL
        AND p.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(p.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String PERMISSION_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_PERMISSIONS p
        WHERE p.deleted_at IS NULL AND p.deleted_by IS NULL
        AND p.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
