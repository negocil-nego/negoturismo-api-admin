package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.organization.model.OrganizationFile;
import com.negocil.negoturismo.admin.shared.document_file.enums.DocumentFileData;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrganizationFileData {
    EPIC_SANA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .doc(DocumentFileData.EPIC_SANA_IMAGE.getDocumentFile())
                    .build()
    ),
    EPIC_SANA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .doc(DocumentFileData.EPIC_SANA_LOGO.getDocumentFile())
                    .build()
    ),
    EPIC_SANA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .doc(DocumentFileData.EPIC_SANA_VIDEO.getDocumentFile())
                    .build()
    ),
    MIRAMAR_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .doc(DocumentFileData.MIRAMAR_IMAGE.getDocumentFile())
                    .build()
    ),
    MIRAMAR_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .doc(DocumentFileData.MIRAMAR_LOGO.getDocumentFile())
                    .build()
    ),
    MIRAMAR_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .doc(DocumentFileData.MIRAMAR_VIDEO.getDocumentFile())
                    .build()
    ),
    HUAMBO_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .doc(DocumentFileData.HUAMBO_IMAGE.getDocumentFile())
                    .build()
    ),
    HUAMBO_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .doc(DocumentFileData.HUAMBO_LOGO.getDocumentFile())
                    .build()
    ),
    HUAMBO_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .doc(DocumentFileData.HUAMBO_VIDEO.getDocumentFile())
                    .build()
    );

    private final OrganizationFile organizationFile;
}
