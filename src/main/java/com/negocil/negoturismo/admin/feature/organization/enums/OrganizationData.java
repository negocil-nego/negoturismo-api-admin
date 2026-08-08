package com.negocil.negoturismo.admin.feature.organization.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrganizationData {
    EPIC_SANA(
            "Hotel Epic Sana Luanda",
            "hotel-epic-sana-luanda",
            "geral@epicsanaluanda.com",
            "+244922345678",
            "Hotel de 5 estrelas de luxo em Luanda, com spa, restaurantes e acomodações de excelência.",
            "Rua da Missão, Luanda",
            "epicsana_owner"
    ),
    MIRAMAR(
            "Pensão Residencial Miramar",
            "pensao-residencial-miramar",
            "contacto@pensaomiramar.com",
            "+244922345679",
            "Pensão acolhedora com ambiente familiar, quartos confortáveis e excelente vista sobre a baía.",
            "Bairro do Miramar, Luanda",
            "pensao_miramar_owner"
    ),
    HUAMBO(
            "Hospedaria Central do Huambo",
            "hospedaria-central-do-huambo",
            "info@hospedariahuambo.com",
            "+244922345680",
            "Acomodação simples, confortável e económica no centro do Huambo.",
            "Avenida da Independência, Huambo",
            "hospedaria_huambo_owner"
    );

    private final String name;
    private final String slug;
    private final String email;
    private final String phone;
    private final String description;
    private final String address;
    private final String ownerUsername;
}
