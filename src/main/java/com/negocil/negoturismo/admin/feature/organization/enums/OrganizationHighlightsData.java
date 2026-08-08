package com.negocil.negoturismo.admin.feature.organization.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public enum OrganizationHighlightsData {
    EPIC_SANA_HIGHLIGHT(
            "Hotel Epic Sana Luanda",
            OrganizationHighlightsStatus.ACTIVE,
            Instant.parse("2026-01-01T00:00:00Z"),
            Instant.parse("2027-12-31T23:59:59Z")
    ),
    MIRAMAR_HIGHLIGHT(
            "Pensão Residencial Miramar",
            OrganizationHighlightsStatus.ACTIVE,
            Instant.parse("2026-01-01T00:00:00Z"),
            Instant.parse("2027-12-31T23:59:59Z")
    );

    private final String organizationName;
    private final OrganizationHighlightsStatus status;
    private final Instant startedAt;
    private final Instant completedAt;
}
