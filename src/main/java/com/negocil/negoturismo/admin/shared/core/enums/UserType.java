package com.negocil.negoturismo.admin.shared.core.enums;

import lombok.Getter;

@Getter
public enum UserType {
    CLIENT("CLIENT"),
    ADMIN("ADMIN"),
    MANAGER("MANAGER");

    private final String value;

    UserType(String value) {
        this.value = value;
    }
}
