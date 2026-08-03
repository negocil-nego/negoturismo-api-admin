package com.negocil.negoturismo.admin.shared.core.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

@Data
@NoArgsConstructor
@Schema(description = "Pagination DTO")
public class PaginateRequest {
    @Schema(description = "Page number to return (zero-indexed)", example = "0", defaultValue = "0", minimum = "0")
    protected int pageNumber = 0;

    @Schema(description = "Number of records per page", example = "10", defaultValue = "10", minimum = "1")
    protected int pageSize = 10;

    public PageRequest toRequest() {
        return PageRequest.of(
                Optional.of(pageNumber).orElse(0),
                Optional.of(pageSize).orElse(10)
        );
    }
}
