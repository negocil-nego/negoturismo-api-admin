package com.negocil.negoturismo.admin.feature.organization.dto.response;

import com.negocil.negoturismo.admin.feature.organization.enums.OrganizationHighlightsStatus;
import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationHighlights;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.Instant;

@Schema(description = "Organization highlights data returned to clients")
public record OrganizationHighlightsResponse(
        @Schema(description = "Unique identifier", example = "1")
        Long id,

        @Schema(description = "Organization name", example = "Negocil")
        String organizationName,

        @Schema(description = "Organization email", example = "contact@negocil.com")
        String organizationEmail,

        @Schema(description = "Status of the highlight", example = "ACTIVE")
        OrganizationHighlightsStatus status,

        @Schema(description = "Start date and time", example = "2026-01-01T00:00:00Z")
        Instant startedAt,

        @Schema(description = "Completion date and time", example = "2026-12-31T23:59:59Z")
        Instant completedAt,

        @Schema(description = "Concatenated search field")
        String concat
) {
    public static OrganizationHighlightsResponse of(OrganizationHighlights highlights) {
        Organization org = highlights.getOrganization();
        return new OrganizationHighlightsResponse(
                highlights.getId(),
                org.getName(),
                org.getEmail(),
                highlights.getStatus(),
                highlights.getStartedAt(),
                highlights.getCompletedAt(),
                highlights.getConcat()
        );
    }
}
