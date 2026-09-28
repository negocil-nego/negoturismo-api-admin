package com.negocil.negoturismo.admin.config.seeder.system;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TouristAreaData {
    KALANDULA(
            TouristArea.builder()
                    .name("Quedas de Kalandula")
                    .state("Malanje")
                    .address("Kalandula, Malanje")
                    .build()
    ),
    TUNDAVALA(
            TouristArea.builder()
                    .name("Fenda da Tundavala")
                    .state("Huíla")
                    .address("Lubango, Huíla")
                    .build()
    ),
    MIRADOURO_DA_LUA(
            TouristArea.builder()
                    .name("Miradouro da Lua")
                    .state("Luanda")
                    .address("Samba, Luanda")
                    .latitude(-9.22111)
                    .longitude(13.08972)
                    .build()
    ),
    SERRA_DA_LEBA(
            TouristArea.builder()
                    .name("Serra da Leba")
                    .state("Namibe")
                    .address("Estrada Lubango-Namibe, Namibe")
                    .build()
    ),
    ILHA_DO_MUSSULO(
            TouristArea.builder()
                    .name("Ilha do Mussulo")
                    .state("Luanda")
                    .address("Belas, Luanda")
                    .latitude(-8.894216354547256)
                    .longitude(13.12505243558659)
                    .build()
    ),
    FORTALESA_DE_SAO_MIGUEL(
            TouristArea.builder()
                    .name("Fortaleza de São Miguel")
                    .state("Luanda")
                    .address("Ingombota, Luanda")
                    .latitude(-8.80786)
                    .longitude(13.22322)
                    .build()
    ),
    SANGANO_BEACH(
            TouristArea.builder()
                    .name("Sangano Beach")
                    .state("Luanda")
                    .address("Sangano, Luanda")
                    .latitude(-9.55242)
                    .longitude(13.20112)
                    .build()
    ),
    MUSEU_DA_MOEDA(
            TouristArea.builder()
                    .name("Museu da Moeda")
                    .state("Luanda")
                    .address("Avenida 4 de Fevereiro, Luanda")
                    .latitude(-8.81090)
                    .longitude(13.23340)
                    .build()
    ),
    MUSEU_OF_AGOSTHINO_NETO(
            TouristArea.builder()
                    .name("Museu of Agostinho Neto")
                    .state("Luanda")
                    .address("Praia do Bispo, Luanda")
                    .latitude(-8.82361)
                    .longitude(13.21895)
                    .build()
    ),
    AVENIDA_4_DE_FEVEREIRO(
            TouristArea.builder()
                    .name("Avenida 4 de Fevereiro")
                    .state("Luanda")
                    .address("Ingombota, Luanda")
                    .latitude(-8.81100)
                    .longitude(13.23400)
                    .build()
    ),
    PALACIO_DE_FERRO(
            TouristArea.builder()
                    .name("Palacio de Ferro")
                    .state("Luanda")
                    .address("Cidade Alta, Luanda")
                    .latitude(-8.81215)
                    .longitude(13.23571)
                    .build()
    ),
    MUSEU_NACIONAL_DA_ESCRAVATURA(
            TouristArea.builder()
                    .name("Museu Nacional da Escravatura")
                    .state("Luanda")
                    .address("Morro da Cruz, Belas")
                    .latitude(-8.95887)
                    .longitude(13.10496)
                    .build()
    ),
    IGREJA_DE_NOSSENHORA_DOS_REMEDIOS(
            TouristArea.builder()
                    .name("Igreja de Nossa Senhora dos Remédios")
                    .state("Luanda")
                    .address("Baixa de Luanda, Luanda")
                    .latitude(-8.81361)
                    .longitude(13.22972)
                    .build()
    ),
    CEMITERIO_DE_NAVIOS(
            TouristArea.builder()
                    .name("Cemitério de navios")
                    .state("Luanda")
                    .address("Praia de Santiago, Cacuaco, Luanda")
                    .latitude(-8.72000)
                    .longitude(13.29000)
                    .build()
    ),
    MUSEU_NACIONAL_DE_ANTROPOLOGIA(
            TouristArea.builder()
                    .name("Museu Nacional de Antropologia")
                    .state("Luanda")
                    .address("Coqueiros, Luanda")
                    .latitude(-8.81358)
                    .longitude(13.22780)
                    .build()
    ),
    IGREJA_DE_JESUS(
            TouristArea.builder()
                    .name("Igreja de Jesus")
                    .state("Luanda")
                    .address("Cidade Alta, Luanda")
                    .latitude(-8.81740)
                    .longitude(13.22420)
                    .build()
    ),
    MONUMENTO_DO_SOLDADO_DESCONHECIDO(
            TouristArea.builder()
                    .name("Monumento do Soldado Desconhecido")
                    .state("Luanda")
                    .address("Avenida 4 de Fevereiro, Luanda")
                    .latitude(-8.81170)
                    .longitude(13.23037)
                    .build()
    ),
    ESTACAO_CENTRAL_DE_LUANDA(
            TouristArea.builder()
                    .name("Estacao Central de Luanda")
                    .state("Luanda")
                    .address("Largo Engenheiro Pedro Folque, Luanda")
                    .latitude(-8.80527)
                    .longitude(13.24435)
                    .build()
    );

    private final TouristArea touristArea;
}
