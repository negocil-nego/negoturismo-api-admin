package com.negocil.negoturismo.admin.feature.category.dto.response;

import com.negocil.negoturismo.admin.feature.category.model.Category;
import com.negocil.negoturismo.admin.shared.core.dto.response.PaginateResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@NoArgsConstructor
@Schema(description = "Paginated response containing a list of categories")
public class CategoryPaginate extends PaginateResponse<CategoryResponse> {

    public CategoryPaginate(
            List<CategoryResponse> content,
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

    public static CategoryPaginate of(Page<Category> page) {
        return new CategoryPaginate(
                page.getContent().stream().map(CategoryResponse::of).toList(),
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