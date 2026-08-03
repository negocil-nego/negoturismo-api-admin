package com.negocil.negoturismo.admin.feature.role.dto.response;

import com.negocil.negoturismo.admin.feature.role.model.Role;
import com.negocil.negoturismo.admin.shared.core.dto.response.PaginateResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@NoArgsConstructor
@Schema(description = "Paginated response containing a list of roles")
public class RolePaginate extends PaginateResponse<RoleResponse> {

    public RolePaginate(
            List<RoleResponse> content,
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

    public static RolePaginate of(Page<Role> page) {
        return new RolePaginate(
                page.getContent().stream().map(RoleResponse::of).toList(),
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
