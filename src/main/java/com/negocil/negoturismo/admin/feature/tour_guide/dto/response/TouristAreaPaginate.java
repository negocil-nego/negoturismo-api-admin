package com.negocil.negoturismo.admin.feature.tour_guide.dto.response;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.shared.core.dto.response.PaginateResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@NoArgsConstructor
@Schema(description = "Paginated response containing a list of tourist areas")
public class TouristAreaPaginate extends PaginateResponse<TouristAreaResponse> {

    public TouristAreaPaginate(
            List<TouristAreaResponse> content,
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

    public static TouristAreaPaginate of(Page<TouristArea> page) {
        return new TouristAreaPaginate(
                page.getContent().stream().map(TouristAreaResponse::of).toList(),
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
