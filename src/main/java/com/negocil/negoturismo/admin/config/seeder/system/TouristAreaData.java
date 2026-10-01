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
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Fkalandula%2F1.png?alt=media&token=58be226d-7bdc-461b-a9df-640ec3114896")
                    .build()
    ),
    TUNDAVALA(
            TouristArea.builder()
                    .name("Fenda da Tundavala")
                    .state("Huíla")
                    .address("Lubango, Huíla")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Ftundavala%2F2.png?alt=media&token=7e40936a-9262-4cea-a2e8-362301051c6a")
                    .build()
    ),
    MIRADOURO_DA_LUA(
            TouristArea.builder()
                    .name("Miradouro da Lua")
                    .state("Luanda")
                    .address("Samba, Luanda")
                    .latitude(-9.22111)
                    .longitude(13.08972)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Fmirador-lua%2F1.png?alt=media&token=28eff5c2-0b77-446b-9b42-af7daddc03b1")
                    .build()
    ),
    SERRA_DA_LEBA(
            TouristArea.builder()
                    .name("Serra da Leba")
                    .state("Namibe")
                    .address("Estrada Lubango-Namibe, Namibe")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Fserra-leba%2F1.png?alt=media&token=9bb5895a-cdcd-479f-96c6-8ecd40ba551b")
                    .build()
    ),
    ILHA_DO_MUSSULO(
            TouristArea.builder()
                    .name("Ilha do Mussulo")
                    .state("Luanda")
                    .address("Belas, Luanda")
                    .latitude(-8.894216354547256)
                    .longitude(13.12505243558659)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Fmussulo%2F1.png?alt=media&token=dbc20a41-34f3-4f36-b913-b009a40ebac9")
                    .build()
    ),
    FORTALESA_DE_SAO_MIGUEL(
            TouristArea.builder()
                    .name("Fortaleza de São Miguel")
                    .state("Luanda")
                    .address("Ingombota, Luanda")
                    .latitude(-8.80786)
                    .longitude(13.22322)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Ffortaleza-sao-miguel%2F1.png?alt=media&token=47e34d23-e9dc-4361-96a0-a5b9abe99104")
                    .build()
    ),
    SANGANO_BEACH(
            TouristArea.builder()
                    .name("Sangano Beach")
                    .state("Luanda")
                    .address("Sangano, Luanda")
                    .latitude(-9.55242)
                    .longitude(13.20112)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Fsangano-beach%2F1.png?alt=media&token=fecbd639-5937-4699-9016-26bf1fbaa26f")
                    .build()
    ),
    MUSEU_DA_MOEDA(
            TouristArea.builder()
                    .name("Museu da Moeda")
                    .state("Luanda")
                    .address("Avenida 4 de Fevereiro, Luanda")
                    .latitude(-8.81090)
                    .longitude(13.23340)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Fmuseu-moeda%2F1.png?alt=media&token=1d50d3ec-6b70-4f93-8e3d-512e6db812e8")
                    .build()
    ),
    MUSEU_OF_AGOSTHINO_NETO(
            TouristArea.builder()
                    .name("Museu of Agostinho Neto")
                    .state("Luanda")
                    .address("Praia do Bispo, Luanda")
                    .latitude(-8.82361)
                    .longitude(13.21895)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Fmuseu-agostinho-neto%2F1.png?alt=media&token=bc0073d8-3fe9-485b-8f55-edc7e8b7586c")
                    .build()
    ),
    AVENIDA_4_DE_FEVEREIRO(
            TouristArea.builder()
                    .name("Avenida 4 de Fevereiro")
                    .state("Luanda")
                    .address("Ingombota, Luanda")
                    .latitude(-8.81100)
                    .longitude(13.23400)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Favenida-4-de-fevereiro%2F1.png?alt=media&token=dcd2330f-b55b-4e60-aaa0-5d8d1569f7d5")
                    .build()
    ),
    PALACIO_DE_FERRO(
            TouristArea.builder()
                    .name("Palacio de Ferro")
                    .state("Luanda")
                    .address("Cidade Alta, Luanda")
                    .latitude(-8.81215)
                    .longitude(13.23571)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Fpalacio-de-ferro%2F1.png?alt=media&token=1f33f940-03a7-47a3-80cf-a94f37d1bee5")
                    .build()
    ),
    MUSEU_NACIONAL_DA_ESCRAVATURA(
            TouristArea.builder()
                    .name("Museu Nacional da Escravatura")
                    .state("Luanda")
                    .address("Morro da Cruz, Belas")
                    .latitude(-8.95887)
                    .longitude(13.10496)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Fmuseu-escravatura%2F1.png?alt=media&token=2a3b0a32-8a23-4dd7-badf-fa803308bc05")
                    .build()
    ),
    IGREJA_DE_NOSSENHORA_DOS_REMEDIOS(
            TouristArea.builder()
                    .name("Igreja de Nossa Senhora dos Remédios")
                    .state("Luanda")
                    .address("Baixa de Luanda, Luanda")
                    .latitude(-8.81361)
                    .longitude(13.22972)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Figreja-nossa-senhora-remedios%2F1.png?alt=media&token=95e88c61-c5e8-4e62-ad4a-d9dc4d133b6d")
                    .build()
    ),
    MUSEU_NACIONAL_DE_ANTROPOLOGIA(
            TouristArea.builder()
                    .name("Museu Nacional de Antropologia")
                    .state("Luanda")
                    .address("Coqueiros, Luanda")
                    .latitude(-8.81358)
                    .longitude(13.22780)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Fmuseu-antropologia-angola%2F1.png?alt=media&token=227b9b98-1ff4-4456-bd23-13800cef0aa9")
                    .build()
    ),
    MONUMENTO_DO_SOLDADO_DESCONHECIDO(
            TouristArea.builder()
                    .name("Monumento do Soldado Desconhecido")
                    .state("Luanda")
                    .address("Avenida 4 de Fevereiro, Luanda")
                    .latitude(-8.81170)
                    .longitude(13.23037)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Fmonumento-do-soldado-desconhecido%2F1.png?alt=media&token=aae6b16c-8c81-4fe8-b9a3-070007da137e")
                    .build()
    ),
    ESTACAO_CENTRAL_DE_LUANDA(
            TouristArea.builder()
                    .name("Estacao Central de Luanda")
                    .state("Luanda")
                    .address("Largo Engenheiro Pedro Folque, Luanda")
                    .latitude(-8.80527)
                    .longitude(13.24435)
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/tourism-area%2Festacao-ferro-de-luanda%2F1.png?alt=media&token=e700a950-a780-4dc8-9856-48ccd7306786")
                    .build()
    );

    private final TouristArea touristArea;
}
