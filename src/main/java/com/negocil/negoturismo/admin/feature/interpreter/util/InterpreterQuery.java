package com.negocil.negoturismo.admin.feature.interpreter.util;

public final class InterpreterQuery {
    public static final String INTERPRETER_SEARCH = """
        SELECT il.* FROM TB_INTERPRETERS il
        WHERE il.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(il.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String INTERPRETER_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_INTERPRETERS il
        WHERE il.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
