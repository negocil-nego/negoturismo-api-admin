package com.negocil.negoturismo.admin.feature.role.dto.request;

import com.negocil.negoturismo.admin.feature.role.enums.RoleField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

@Data
@NoArgsConstructor
@Schema(description = "Filter and pagination parameters for listing roles")
public class RoleFilterPaginate {

    @Schema(description = "Field used to search/sort roles", example = "CODE")
    private RoleField field;

    @Schema(description = "Page number to return (zero-indexed)", example = "0", defaultValue = "0", minimum = "0")
    private int pageNumber = 0;

    @Schema(description = "Number of records per page", example = "10", defaultValue = "10", minimum = "1")
    private int pageSize = 10;

    @Schema(
            description = "Free-text search term to filter roles by code or name",
            example = "admin",
            nullable = true
    )
    private String search;

    public PageRequest toRequest() {
        return PageRequest.of(
                Optional.of(pageNumber).orElse(0),
                Optional.of(pageSize).orElse(30)
        );
    }
}
