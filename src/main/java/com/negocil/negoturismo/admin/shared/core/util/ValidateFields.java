package com.negocil.negoturismo.admin.shared.core.util;

public final class ValidateFields {
    public static final int DESCRIPTION_SIZE_MAX = 2000;
    public static final int DESCRIPTION_SIZE_MIN = 1;
    public static final String REGEX_PHONE = "^(?=.{1,15}$)\\(\\+\\d{1,3}\\)\\d+$";
}
