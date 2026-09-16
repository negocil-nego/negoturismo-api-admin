package com.negocil.negoturismo.admin.shared.user.util;

public final class UserQuery {
    public static final String USER_SEARCH = """
        SELECT u.* FROM TB_USERS u
        WHERE u.deleted_at IS NULL AND u.deleted_by IS NULL
        AND u.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(u.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String USER_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_USERS u
        WHERE u.deleted_at IS NULL AND u.deleted_by IS NULL
        AND u.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
