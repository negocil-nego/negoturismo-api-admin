package com.negocil.negoturismo.admin.feature.interpreter.dto.response;

import com.negocil.negoturismo.admin.feature.interpreter.model.InterpreterLanguage;
import com.negocil.negoturismo.admin.shared.core.dto.response.PaginateResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@NoArgsConstructor
@Schema(description = "Paginated response containing a list of interpreter languages")
public class InterpreterLanguagePaginate extends PaginateResponse<InterpreterLanguageResponse> {

    public InterpreterLanguagePaginate(
            List<InterpreterLanguageResponse> content,
            boolean empty,
            boolean first,
            boolean last,
            int number,
            int numberOfElements,
            int size,
            long totalElements,
            int totalPages
    ) {
        super(content, empty, first, last, number, numberOfElements, size, totalElements, totalPages);
    }

    public static InterpreterLanguagePaginate of(Page<InterpreterLanguage> page) {
        return new InterpreterLanguagePaginate(
                page.getContent().stream().map(InterpreterLanguageResponse::of).toList(),
                page.isEmpty(),
                page.isFirst(),
                page.isLast(),
                page.getNumber(),
                page.getNumberOfElements(),
                page.getSize(),
                page.getTotalElements(),
                page.getTotalPages()
        );
    }
}
