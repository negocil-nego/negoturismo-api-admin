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
            "https://images.unsplash.com/photo-1566073771259-6a8506099945?w=800",
            "https://images.unsplash.com/photo-1542314831-068cd1dbfeeb?w=400",
            "https://videos.pexels.com/video-files/3297319/3297319-uhd_2560_1440_25fps.mp4",
            "epicsana_owner"
    ),
    MIRAMAR(
            "Pensão Residencial Miramar",
            "pensao-residencial-miramar",
            "contacto@pensaomiramar.com",
            "+244922345679",
            "Pensão acolhedora com ambiente familiar, quartos confortáveis e excelente vista sobre a baía.",
            "Bairro do Miramar, Luanda",
            "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?w=800",
            "https://images.unsplash.com/photo-1571896349842-33c89424de2d?w=400",
            "https://videos.pexels.com/video-files/3378359/3378359-uhd_2560_1440_25fps.mp4",
            "pensao_miramar_owner"
    ),
    HUAMBO(
            "Hospedaria Central do Huambo",
            "hospedaria-central-do-huambo",
            "info@hospedariahuambo.com",
            "+244922345680",
            "Acomodação simples, confortável e económica no centro do Huambo.",
            "Avenida da Independência, Huambo",
            "https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?w=800",
            "https://images.unsplash.com/photo-1596394516093-501ba68a0ba6?w=400",
            "https://videos.pexels.com/video-files/3571264/3571264-uhd_2560_1440_30fps.mp4",
            "hospedaria_huambo_owner"
    );

    private final String name;
    private final String slug;
    private final String email;
    private final String phone;
    private final String description;
    private final String address;
    private final String image;
    private final String logo;
    private final String video;
    private final String ownerUsername;
}
