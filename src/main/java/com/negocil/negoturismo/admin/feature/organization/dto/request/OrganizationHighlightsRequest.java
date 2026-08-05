package com.negocil.negoturismo.admin.feature.organization.dto.request;

import com.negocil.negoturismo.admin.feature.organization.enums.OrganizationHighlightsStatus;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationHighlights;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.UUID;

@Schema(description = "Request payload for creating or updating an organization highlight")
public record OrganizationHighlightsRequest(
        @Schema(description = "UUID of the organization", example = "550e8400-e29b-41d4-a716-446655440000", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        UUID organizationUuid,

        @Schema(description = "Highlight status", example = "PENDENT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        OrganizationHighlightsStatus status,

        @Schema(description = "Start date and time of the highlight", example = "2026-01-01T00:00:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        Instant startedAt,

        @Schema(description = "End date and time of the highlight", example = "2026-12-31T23:59:59Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        Instant completedAt
) {
    public OrganizationHighlights toModel() {
        return OrganizationHighlights.builder()
                .status(status != null ? status : OrganizationHighlightsStatus.PENDENT)
                .startedAt(startedAt)
                .completedAt(completedAt)
                .build();
    }
}
