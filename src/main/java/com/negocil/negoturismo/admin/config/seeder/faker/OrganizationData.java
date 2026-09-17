package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public enum OrganizationData {
    EPIC_SANA(
            Organization.builder()
                    .name("Hotel Epic Sana Luanda")
                    .slug("hotel-epic-sana-luanda")
                    .email("geral@epicsanaluanda.com")
                    .phone("(+244)922345678")
                    .description("Hotel de 5 estrelas de luxo em Luanda, com spa, restaurantes e acomodações de excelência.")
                    .address("Rua da Missão, Luanda")
                    .rating(5)
                    .image("https://images.unsplash.com/photo-1566073771259-6a8506099945?w=800")
                    .logo("https://images.unsplash.com/photo-1542314831-068cd1dbfeeb?w=400")
                    .video("https://videos.pexels.com/video-files/3297319/3297319-uhd_2560_1440_25fps.mp4")
                    .imageBanner("https://images.unsplash.com/photo-1566073771259-6a8506099945?w=1600")
                    .website("https://www.epicsanaluanda.com")
                    .dateFounded(LocalDate.of(2012, 9, 1))
                    .user(UserData.EPIC_SANA_OWNER.getUser())
                    .build()
    ),
    MIRAMAR(
            Organization.builder()
                    .name("Pensão Residencial Miramar")
                    .slug("pensao-residencial-miramar")
                    .email("contacto@pensaomiramar.com")
                    .phone("(+244)922345679")
                    .description("Pensão acolhedora com ambiente familiar, quartos confortáveis e excelente vista sobre a baía.")
                    .address("Bairro do Miramar, Luanda")
                    .rating(4)
                    .image("https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?w=800")
                    .logo("https://images.unsplash.com/photo-1571896349842-33c89424de2d?w=400")
                    .video("https://videos.pexels.com/video-files/3378359/3378359-uhd_2560_1440_25fps.mp4")
                    .imageBanner("https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?w=1600")
                    .website("https://www.pensaomiramar.ao")
                    .dateFounded(LocalDate.of(2016, 5, 20))
                    .user(UserData.MIRAMAR_OWNER.getUser())
                    .build()
    ),
    HUAMBO(
            Organization.builder()
                    .name("Hospedaria Central do Huambo")
                    .slug("hospedaria-central-do-huambo")
                    .email("info@hospedariahuambo.com")
                    .phone("(+244)922345680")
                    .description("Acomodação simples, confortável e económica no centro do Huambo.")
                    .address("Avenida da Independência, Huambo")
                    .rating(4)
                    .image("https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?w=800")
                    .logo("https://images.unsplash.com/photo-1596394516093-501ba68a0ba6?w=400")
                    .video("https://videos.pexels.com/video-files/3571264/3571264-uhd_2560_1440_30fps.mp4")
                    .imageBanner("https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?w=1600")
                    .website("https://www.hospedariahuambo.ao")
                    .dateFounded(LocalDate.of(2018, 11, 10))
                    .user(UserData.HUAMBO_OWNER.getUser())
                    .build()
    );

    private final Organization organization;
}
