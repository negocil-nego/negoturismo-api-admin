package com.negocil.negoturismo.admin.shared.core.util;

public final class StringUtils {
    public static String generateSlug(String input) {
        if (input == null || input.isBlank()) {
            return "";
        }

        return java.text.Normalizer.normalize(input, java.text.Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .toLowerCase()
                .trim()
                .replaceAll("[^a-z0-9\\s-]", "")
                .replaceAll("[\\s-]+", "_");
    }
}
