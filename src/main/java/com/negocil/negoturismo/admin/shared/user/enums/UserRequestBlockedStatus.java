package com.negocil.negoturismo.admin.shared.user.enums;

import lombok.Getter;

@Getter
public enum UserRequestBlockedStatus {
    PENDING("PENDING"),
    APPROVED("APPROVED"),
    REJECTED("REJECTED");

    private final String value;

    UserRequestBlockedStatus(String value) {
        this.value = value;
    }
}
