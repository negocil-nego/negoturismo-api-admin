package com.negocil.negoturismo.admin.shared.core.util;

public final class MaskUtils {

    public static String email(String email) {
        if (email == null || email.isBlank()) return email;
        var at = email.indexOf('@');
        var local = at > 0 ? email.substring(0, at) : email;
        return local.charAt(0) + "******" + local.length() + "@secret.com";
    }

    public static String phone(String phone) {
        if (phone == null || phone.isBlank()) return phone;
        int keep = Math.min(3, phone.length());
        return phone.substring(0, keep) + "*".repeat(phone.length() - keep);
    }

    public static String username(String username) {
        if (username == null || username.isBlank()) return username;
        int keep = Math.min(3, username.length());
        return username.substring(0, keep) + "********" + username.length();
    }
}
