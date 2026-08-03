package com.negocil.negoturismo.admin.feature.permission.dto.request;

import com.negocil.negoturismo.admin.feature.permission.enums.PermissionField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

@Data
@NoArgsConstructor
@Schema(description = "Filter and pagination parameters for listing permissions")
public class PermissionFilterPaginate {

    @Schema(description = "Field used to search/sort permissions", example = "CODE")
    private PermissionField field;

    @Schema(description = "Page number to return (zero-indexed)", example = "0", defaultValue = "0", minimum = "0")
    private int pageNumber = 0;

    @Schema(description = "Number of records per page", example = "10", defaultValue = "10", minimum = "1")
    private int pageSize = 10;

    @Schema(
            description = "Free-text search term to filter permissions by code, name or description",
            example = "create",
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
