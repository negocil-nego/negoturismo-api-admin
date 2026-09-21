package com.negocil.negoturismo.admin.shared.user.dto.response;

import com.negocil.negoturismo.admin.shared.user.enums.UserRequestBlockedStatus;
import com.negocil.negoturismo.admin.shared.user.model.UserRequestBlocked;

import java.time.Instant;
import java.util.UUID;

public record UserRequestBlockedResponse(
        UUID uuid,
        String userName,
        String userEmail,
        String userPhone,
        String comment,
        UserRequestBlockedStatus status,
        String responseComment,
        Instant createdAt
) {
    public static UserRequestBlockedResponse of(UserRequestBlocked model) {
        return new UserRequestBlockedResponse(
                model.getUuid(),
                model.getUser().getName(),
                model.getUser().getEmail(),
                model.getUser().getPhone(),
                model.getComment(),
                model.getStatus(),
                model.getResponseComment(),
                model.getCreatedAt()
        );
    }
}
