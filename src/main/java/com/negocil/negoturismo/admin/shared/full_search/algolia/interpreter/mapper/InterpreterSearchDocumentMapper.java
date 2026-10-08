package com.negocil.negoturismo.admin.shared.full_search.algolia.interpreter.mapper;

import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import com.negocil.negoturismo.admin.shared.full_search.algolia.interpreter.dto.InterpreterSearchDocument;

public final class InterpreterSearchDocumentMapper {

    private InterpreterSearchDocumentMapper() {}

    public static InterpreterSearchDocument toDocument(Interpreter interpreter) {
        return new InterpreterSearchDocument(
                String.valueOf(interpreter.getUuid()),
                interpreter.getSlug(),
                interpreter.getConcat(),
                interpreter.getDescription()
        );
    }
}
