package com.negocil.negoturismo.admin.feature.organization.dto.request;

import com.negocil.negoturismo.admin.feature.organization.enums.OrganizationField;
import com.negocil.negoturismo.admin.shared.core.dto.request.PaginateRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Filter and pagination parameters for listing organizations")
public class OrganizationFilterPaginate extends PaginateRequest {
    @Schema(description = "Field used to search/sort organizations", example = "NAME")
    private OrganizationField field;

    @Schema(
            description = "Free-text search term to filter organizations by name, email, phone, description or address",
            example = "negocil",
            nullable = true
    )
    private String search;
}
