package com.negocil.negoturismo.admin.shared.core.util;

import java.util.Map;

public final class UserAgentParser {
    private static final Map<String, String> OS_KEYWORDS = Map.of(
            "Windows", "Windows",
            "Android", "Android",
            "iPhone", "iOS",
            "iPad", "iOS",
            "Mac OS", "Mac OS",
            "Linux", "Linux"
    );

    private static final Map<String, String> BROWSER_KEYWORDS = Map.of(
            "Edg", "Edge",
            "OPR", "Opera",
            "Chrome", "Chrome",
            "Firefox", "Firefox",
            "Safari", "Safari"
    );

    public record DeviceInfo(String deviceType, String browser, String operatingSystem) {
    }

    public static DeviceInfo parse(String userAgent) {
        if (userAgent == null || userAgent.isBlank()) {
            return new DeviceInfo("desktop", "unknown", "unknown");
        }
        return new DeviceInfo(parseDeviceType(userAgent), parseBrowser(userAgent), parseOs(userAgent));
    }

    private static String parseDeviceType(String ua) {
        if (ua.contains("iPad") || ua.contains("Tablet")) return "tablet";
        if (ua.contains("Mobile") || ua.contains("Android")) return "mobile";
        return "desktop";
    }

    private static String parseBrowser(String ua) {
        return BROWSER_KEYWORDS.entrySet().stream()
                .filter(e -> ua.contains(e.getKey()))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse("unknown");
    }

    private static String parseOs(String ua) {
        return OS_KEYWORDS.entrySet().stream()
                .filter(e -> ua.contains(e.getKey()))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse("unknown");
    }
}
