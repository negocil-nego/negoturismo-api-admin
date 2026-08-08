package com.negocil.negoturismo.admin.feature.tour_guide.dto.response;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuideTouristArea;
import com.negocil.negoturismo.admin.shared.core.dto.response.PaginateResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@NoArgsConstructor
@Schema(description = "Paginated response containing a list of tour guide tourist area associations")
public class TourGuideTouristAreaPaginate extends PaginateResponse<TourGuideTouristAreaResponse> {

    public TourGuideTouristAreaPaginate(
            List<TourGuideTouristAreaResponse> content,
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

    public static TourGuideTouristAreaPaginate of(Page<TourGuideTouristArea> page) {
        return new TourGuideTouristAreaPaginate(
                page.getContent().stream().map(TourGuideTouristAreaResponse::of).toList(),
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
