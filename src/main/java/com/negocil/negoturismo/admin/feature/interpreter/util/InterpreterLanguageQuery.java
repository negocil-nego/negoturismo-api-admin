package com.negocil.negoturismo.admin.feature.interpreter.util;

public final class InterpreterLanguageQuery {
    public static final String INTERPRETER_LANGUAGE_SEARCH = """
        SELECT il.* FROM TB_INTERPRETER_LANGUAGES il
        WHERE il.search_vector @@ to_tsquery('portuguese', :query)
        ORDER BY ts_rank(il.search_vector, to_tsquery('portuguese', :query)) DESC
    """;
    public static final String INTERPRETER_LANGUAGE_SEARCH_COUNT = """
        SELECT COUNT(*) FROM TB_INTERPRETER_LANGUAGES il
        WHERE il.search_vector @@ to_tsquery('portuguese', :query)
    """;
}
