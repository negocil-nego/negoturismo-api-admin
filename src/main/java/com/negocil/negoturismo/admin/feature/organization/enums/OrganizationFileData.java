package com.negocil.negoturismo.admin.feature.organization.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrganizationFileData {
    EPIC_SANA_IMAGE(
            "Hotel Epic Sana Luanda",
            "Fachada Hotel Epic Sana"
    ),
    EPIC_SANA_LOGO(
            "Hotel Epic Sana Luanda",
            "Logotipo Hotel Epic Sana"
    ),
    EPIC_SANA_VIDEO(
            "Hotel Epic Sana Luanda",
            "Vídeo Hotel Epic Sana"
    ),
    MIRAMAR_IMAGE(
            "Pensão Residencial Miramar",
            "Fachada Pensão Residencial Miramar"
    ),
    MIRAMAR_LOGO(
            "Pensão Residencial Miramar",
            "Logotipo Pensão Residencial Miramar"
    ),
    MIRAMAR_VIDEO(
            "Pensão Residencial Miramar",
            "Vídeo Pensão Residencial Miramar"
    ),
    HUAMBO_IMAGE(
            "Hospedaria Central do Huambo",
            "Fachada Hospedaria Central do Huambo"
    ),
    HUAMBO_LOGO(
            "Hospedaria Central do Huambo",
            "Logotipo Hospedaria Central do Huambo"
    ),
    HUAMBO_VIDEO(
            "Hospedaria Central do Huambo",
            "Vídeo Hospedaria Central do Huambo"
    );

    private final String organizationName;
    private final String documentFileTitle;
}
