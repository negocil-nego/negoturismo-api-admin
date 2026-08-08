package com.negocil.negoturismo.admin.feature.organization.dto.response;

import com.negocil.negoturismo.admin.feature.organization.model.OrganizationHighlights;
import com.negocil.negoturismo.admin.shared.core.dto.response.PaginateResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@NoArgsConstructor
@Schema(description = "Paginated response containing a list of organization highlights")
public class OrganizationHighlightsPaginate extends PaginateResponse<OrganizationHighlightsResponse> {

    public OrganizationHighlightsPaginate(
            List<OrganizationHighlightsResponse> content,
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

    public static OrganizationHighlightsPaginate of(Page<OrganizationHighlights> page) {
        return new OrganizationHighlightsPaginate(
                page.getContent().stream().map(OrganizationHighlightsResponse::of).toList(),
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
