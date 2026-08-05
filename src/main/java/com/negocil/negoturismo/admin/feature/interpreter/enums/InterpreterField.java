package com.negocil.negoturismo.admin.feature.interpreter.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum InterpreterField {
    ALL("ALL"),
    LANGUAGE("LANGUAGE");

    private final String value;

    InterpreterField(String value) {
        this.value = value;
    }

    public static InterpreterField fromValue(String value) {
        return Arrays.stream(values())
                .filter(it -> it.getValue().equals(value))
                .findFirst()
                .orElseGet(() -> ALL);
    }
}
