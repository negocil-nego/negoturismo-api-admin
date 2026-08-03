package com.negocil.negoturismo.admin.feature.user.dto.response;

import com.negocil.negoturismo.admin.feature.user.model.User;
import com.negocil.negoturismo.admin.shared.core.dto.response.PaginateResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@NoArgsConstructor
@Schema(description = "Paginated response containing a list of users")
public class UserPaginate extends PaginateResponse<UserResponse> {

    public UserPaginate(
            List<UserResponse> content,
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

    public static UserPaginate of(Page<User> page) {
        return new UserPaginate(
                page.getContent().stream().map(UserResponse::of).toList(),
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
