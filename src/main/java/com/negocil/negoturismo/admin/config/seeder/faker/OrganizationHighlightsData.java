package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.organization.enums.OrganizationHighlightsStatus;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationHighlights;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public enum OrganizationHighlightsData {
    EPIC_SANA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .description("O hotel de luxo mais conceituado de Luanda, com vistas deslumbrantes sobre a baía e serviços premium.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),
    MIRAMAR_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .description("Acolhimento familiar com conforto e economia, ideal para quem busca uma estadia agradável em Luanda.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    );

    private final OrganizationHighlights organizationHighlights;
}
