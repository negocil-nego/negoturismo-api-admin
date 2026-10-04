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
    ),

    HOTEL_BAIA_DE_LUANDA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .description("Hotel de referência em Ingombota com serviço de excellence, spa e pequeno-almoço buffet incluído.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    HOTEL_KALANDULA_PALACE_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.HOTEL_KALANDULA_PALACE.getOrganization())
                    .description("Escolha preferida dos viajantes em Maianga pela vista para o mar e pelo atendimento permanente.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    HOTEL_CASCADE_CITY_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.HOTEL_CASCADE_CITY.getOrganization())
                    .description("Referência da hotelaria de Kilamba Kiaxi, com suites executives e localização privilegiada junto à baía.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    POUSADA_BAIA_AZUL_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.POUSADA_BAIA_AZUL.getOrganization())
                    .description("Opção de hospedagem em Cacuaco com excelente relação qualidade-preço e apoio dedicado.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    POUSADA_SAO_KIZUA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.POUSADA_SAO_KIZUA.getOrganization())
                    .description("Pousada de ambiente familiar em Cazenga com quartos aconchegantes e pequeno-almoço caseiro.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    HOSPEDARIA_PROGRESSO_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.HOSPEDARIA_PROGRESSO.getOrganization())
                    .description("Hospedaria económica em Ingombota com quartos limpos e serviço de limpeza diário.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    HOSPEDARIA_KATANGA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.HOSPEDARIA_KATANGA.getOrganization())
                    .description("Hospedaria com longa tradição em Viana, com preços especiais para estadias longas.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    HOSPEDARIA_SAO_KIZUA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.HOSPEDARIA_SAO_KIZUA.getOrganization())
                    .description("Opção de hospedagem simples e acessível em Talatona, ideal para viagens de trabalho.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    RESTAURANTE_MAR_E_TERRA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .description("Casa de comidas muito procurada em Samba, com reservas esgotadas todos os fins-de-semana.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    RESTAURANTE_SABOR_ANGOLANO_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.RESTAURANTE_SABOR_ANGOLANO.getOrganization())
                    .description("Restaurante de referência em Rangel com cozinha de autor e serviço de sala impecável.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    CANTINHO_DA_MAE_ANGOLA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.CANTINHO_DA_MAE_ANGOLA.getOrganization())
                    .description("Referência da gastronomia angolana em Samba, com receitas familiares servidas como antigamente.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    TASCA_DO_MUAMBA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.TASCA_DO_MUAMBA.getOrganization())
                    .description("Muito procurada por quem procura comida típica em Rangel, com uma forte clientela local.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    SOLAR_DO_KWANZA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.SOLAR_DO_KWANZA.getOrganization())
                    .description("Casa de comidas que recupera os sabores tradicionais de Angola em Cacuaco.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    PIZZERIA_FORNO_ANGOLA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .description("Uma das melhores pizzarias de Samba, com entrega rápida em todo o bairro.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    PIZZERIA_MANGUERINHA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.PIZZERIA_MANGUERINHA.getOrganization())
                    .description("Pizzaria muito procurada em Talatona, com massa fermentada diariamente no forno a lenha.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    SNACK_BAR_O_PONTO_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.SNACK_BAR_O_PONTO.getOrganization())
                    .description("Snack bar de Rangel com serviço rápido, preços acessíveis e entrega em 30 minutos.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    FAST_FOOD_KWANZA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.FAST_FOOD_KWANZA.getOrganization())
                    .description("Uma das melhores opções de fast food em Viana, com hambúrgueres preparados na hora.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    FOOD_TRUCK_TAXI_AZUL_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.FOOD_TRUCK_TAXI_AZUL.getOrganization())
                    .description("Preferido dos estudantes e das empresas de Kilamba Kiaxi pela rapidez e pela qualidade das porções.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    GRELHADOS_MIUDOS_KIZUA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .description("Referência dos grelhados em Maianga, com carne maturada na casa e serviço na mesa.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    CHURRASCO_KING_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.CHURRASCO_KING.getOrganization())
                    .description("Churrasqueira muito procurada em Viana pelo carvão, pelas quantidades e pelos preços acessíveis.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    MARISQUEIRA_BAIA_DE_LUANDA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .description("Marisqueira de referência em Ingombota, com peixe e camarão frescos todos os dias.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    MARISQUEIRA_KILAMBA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.MARISQUEIRA_KILAMBA.getOrganization())
                    .description("Um dos melhores lugares de marisco de Talatona, com forte reputação junto dos locais.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    MARISQUEIRA_DO_NAMIBE_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .description("Muito procurada em Mocamedes pelo arroz de marisco e pelo calulu de camarão.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    SUSHI_BOM_DIA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .description("Referência de gastronomia japonesa em Samba, com mesa de counter e reservas rápidas.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    SUSHI_SAKURA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.SUSHI_SAKURA.getOrganization())
                    .description("Sushi bar muito procurado em Talatona, com peixe preparado diariamente e sushi artesanal.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    CAFE_KWANZA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .description("Café muito procurado em Maianga para pequenos-almoços e reuniões, com Wi-Fi gratuito.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    CAFE_DO_MIRAMAR_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.CAFE_DO_MIRAMAR.getOrganization())
                    .description("Um dos cafés mais concorridos de Ingombota, com especialidades preparadas no dia.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    COFFEE_STOP_ANGOLA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.COFFEE_STOP_ANGOLA.getOrganization())
                    .description("Espaço acolhedor em Viana com café de torra local e bolos feitos todos os dias.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    BAR_TROPICAL_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .description("Um dos bares mais concorridos de Samba, com cocktails assinados e bebidas locais.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    PUB_KILAMBA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .description("Bar com muita animação em Talatona, com música ao vivo às sextas e sábados.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    SELF_SERVICE_KWANZA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .description("Self-service muito procurado em Viana, com buffet completo e preços por quilograma.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    SELF_SERVICE_KILAMBA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .description("Escolha de famílias em Talatona pela variedade do buffet e pelo ambiente familiar.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    SELF_SERVICE_DO_MIRAMAR_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.SELF_SERVICE_DO_MIRAMAR.getOrganization())
                    .description("Restaurante de buffet em Rangel com grande variedade de pratos e sobremesas.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    VEGGIE_HOUSE_LUANDA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .description("Opção vegetariana em Maianga com menu variado e preços acessíveis para todos os bolsos.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    BI_VEGETARIANO_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.BI_VEGETARIANO.getOrganization())
                    .description("Restaurante vegetariano de referência em Talatona, com ingredientes frescos e sazonais.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    PADARIA_PAO_QUENTE_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .description("Padaria muito procurada em Samba, com pão quente todos os dias de madrugada.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    PASTELARIA_DOCE_MANJAR_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.PASTELARIA_DOCE_MANJAR.getOrganization())
                    .description("Uma das melhores padarias de Ingombota, onde se encomendam os bolos de aniversário.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    PADARIA_MANACA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.PADARIA_MANACA.getOrganization())
                    .description("Referência da padaria em Rangel, com produtos feitos no dia e serviço rápido.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    ANGOLA_EXPRESS_AIR_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .description("Uma das companhias com mais voos internos a partir de Samba para as províncias.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    KUBINGA_AIR_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.KUBINGA_AIR.getOrganization())
                    .description("Companhia aérea muito procurada em Viana pela pontualidade e pelo atendimento a bordo.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .description("Agência de viagens muito procurada em Ingombota, com pacotes para todo o país e suporte 24 horas.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    TRAVEL_HOUSE_LUANDA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.TRAVEL_HOUSE_LUANDA.getOrganization())
                    .description("Escolha de quem viaja a partir de Maianga pela consultoria personalizada e pelos preços.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    SAFARIR_VIAGENS_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.SAFARIR_VIAGENS.getOrganization())
                    .description("Referência em Rangel na organização de viagens internas, com pacotes bem montados e guia local.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    AVENTURA_GUIDES_ANGOLA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .description("Referência em Samba nos passeios guiados, com grupos pequenos e guias experientes.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    EXPEDICOES_KALANDULA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.EXPEDICOES_KALANDULA.getOrganization())
                    .description("Operadora muito procurada em Talatona, com guias certificados e programas para todo o país.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    INTERPRETES_DE_LUANDA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .description("Agência de interpretação muito procurada em Ingombota, com línguas de vários idiomas.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    TRADUCAO_E_INTERPRETE_SERVICES_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.TRADUCAO_E_INTERPRETE_SERVICES.getOrganization())
                    .description("Escolha de empresas em Maianga pela rapidez de resposta e pelos profissionais certificados.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    ),

    IDIOMAS_KWANZA_HIGHLIGHT(
            OrganizationHighlights.builder()
                    .organization(OrganizationData.IDIOMAS_KWANZA.getOrganization())
                    .description("Referência em Rangel para interpretação de conferências e tradução juramentada.")
                    .status(OrganizationHighlightsStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .build()
    );

    private final OrganizationHighlights organizationHighlights;
}
