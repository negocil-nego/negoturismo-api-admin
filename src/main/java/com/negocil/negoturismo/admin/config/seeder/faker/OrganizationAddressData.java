package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.organization.model.OrganizationAddress;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrganizationAddressData {
    ORG_ADDR_1(
            OrganizationAddress.builder()
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .address(AddressData.ADDRESS_1.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    ORG_ADDR_2(
            OrganizationAddress.builder()
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .address(AddressData.ADDRESS_4.getAddress())
                    .isPrincipal(false)
                    .build()
    ),
    ORG_ADDR_3(
            OrganizationAddress.builder()
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .address(AddressData.ADDRESS_2.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    ORG_ADDR_4(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .address(AddressData.ADDRESS_3.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    ORG_ADDR_5(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .address(AddressData.ADDRESS_6.getAddress())
                    .isPrincipal(false)
                    .build()
    ),
    ORG_ADDR_6(
            OrganizationAddress.builder()
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .address(AddressData.ADDRESS_5.getAddress())
                    .isPrincipal(false)
                    .build()
    ),

    HOTEL_BAIA_DE_LUANDA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .address(AddressData.ADDRESS_9.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOTEL_MILANO_RESORT_SPA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HOTEL_MILANO_RESORT_SPA.getOrganization())
                    .address(AddressData.ADDRESS_10.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOTEL_KALANDULA_PALACE_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HOTEL_KALANDULA_PALACE.getOrganization())
                    .address(AddressData.ADDRESS_11.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MIRAMAR_BUSINESS_HOTEL_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.MIRAMAR_BUSINESS_HOTEL.getOrganization())
                    .address(AddressData.ADDRESS_12.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOTEL_CASCADE_CITY_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HOTEL_CASCADE_CITY.getOrganization())
                    .address(AddressData.ADDRESS_13.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    POUSADA_VILA_HARMONY_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.POUSADA_VILA_HARMONY.getOrganization())
                    .address(AddressData.ADDRESS_14.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    POUSADA_BAIA_AZUL_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.POUSADA_BAIA_AZUL.getOrganization())
                    .address(AddressData.ADDRESS_15.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    POUSADA_RECANTO_VERDE_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.POUSADA_RECANTO_VERDE.getOrganization())
                    .address(AddressData.ADDRESS_16.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    POUSADA_SAO_KIZUA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.POUSADA_SAO_KIZUA.getOrganization())
                    .address(AddressData.ADDRESS_17.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GUEST_HOUSE_MIRAMAR_INN_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.GUEST_HOUSE_MIRAMAR_INN.getOrganization())
                    .address(AddressData.ADDRESS_18.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOSPEDARIA_PROGRESSO_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HOSPEDARIA_PROGRESSO.getOrganization())
                    .address(AddressData.ADDRESS_19.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOSPEDARIA_KWANZA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HOSPEDARIA_KWANZA.getOrganization())
                    .address(AddressData.ADDRESS_20.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOSPEDARIA_KATANGA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HOSPEDARIA_KATANGA.getOrganization())
                    .address(AddressData.ADDRESS_21.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOSPEDARIA_NOVA_VIDA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HOSPEDARIA_NOVA_VIDA.getOrganization())
                    .address(AddressData.ADDRESS_22.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOSPEDARIA_SAO_KIZUA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HOSPEDARIA_SAO_KIZUA.getOrganization())
                    .address(AddressData.ADDRESS_23.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    RESTAURANTE_O_MUSQUETE_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.RESTAURANTE_O_MUSQUETE.getOrganization())
                    .address(AddressData.ADDRESS_24.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    RESTAURANTE_MAR_E_TERRA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .address(AddressData.ADDRESS_25.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    RESTAURANTE_KWANZA_LIVING_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.RESTAURANTE_KWANZA_LIVING.getOrganization())
                    .address(AddressData.ADDRESS_26.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    RESTAURANTE_SABOR_ANGOLANO_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.RESTAURANTE_SABOR_ANGOLANO.getOrganization())
                    .address(AddressData.ADDRESS_27.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    RESTAURANTE_TALATONA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.RESTAURANTE_TALATONA.getOrganization())
                    .address(AddressData.ADDRESS_28.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CANTINHO_DA_MAE_ANGOLA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.CANTINHO_DA_MAE_ANGOLA.getOrganization())
                    .address(AddressData.ADDRESS_29.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SABORES_DA_NOSSA_TERRA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SABORES_DA_NOSSA_TERRA.getOrganization())
                    .address(AddressData.ADDRESS_30.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TASCA_DO_MUAMBA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.TASCA_DO_MUAMBA.getOrganization())
                    .address(AddressData.ADDRESS_31.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    COZINHA_DO_KILAMBA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.COZINHA_DO_KILAMBA.getOrganization())
                    .address(AddressData.ADDRESS_32.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SOLAR_DO_KWANZA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SOLAR_DO_KWANZA.getOrganization())
                    .address(AddressData.ADDRESS_33.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZERIA_NAPOLI_LUANDA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.PIZZERIA_NAPOLI_LUANDA.getOrganization())
                    .address(AddressData.ADDRESS_34.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZERIA_FORNO_ANGOLA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .address(AddressData.ADDRESS_35.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZERIA_MSLICE_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.PIZZERIA_MSLICE.getOrganization())
                    .address(AddressData.ADDRESS_36.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZERIA_MANGUERINHA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.PIZZERIA_MANGUERINHA.getOrganization())
                    .address(AddressData.ADDRESS_37.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZERIA_BELLA_VISTA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.PIZZERIA_BELLA_VISTA.getOrganization())
                    .address(AddressData.ADDRESS_38.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SNACK_BAR_O_PONTO_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SNACK_BAR_O_PONTO.getOrganization())
                    .address(AddressData.ADDRESS_39.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BURGER_STATION_LUANDA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.BURGER_STATION_LUANDA.getOrganization())
                    .address(AddressData.ADDRESS_40.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FAST_FOOD_KWANZA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.FAST_FOOD_KWANZA.getOrganization())
                    .address(AddressData.ADDRESS_41.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LANCHES_DO_MIRAMAR_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.LANCHES_DO_MIRAMAR.getOrganization())
                    .address(AddressData.ADDRESS_42.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FOOD_TRUCK_TAXI_AZUL_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.FOOD_TRUCK_TAXI_AZUL.getOrganization())
                    .address(AddressData.ADDRESS_43.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CHURRASQUEIRA_DO_ZE_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.CHURRASQUEIRA_DO_ZE.getOrganization())
                    .address(AddressData.ADDRESS_44.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GRELHADOS_MIUDOS_KIZUA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .address(AddressData.ADDRESS_45.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETOS_DA_BAIA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.ESPETOS_DA_BAIA.getOrganization())
                    .address(AddressData.ADDRESS_46.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CHURRASCO_KING_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.CHURRASCO_KING.getOrganization())
                    .address(AddressData.ADDRESS_47.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GRELHADO_DA_CASA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.GRELHADO_DA_CASA.getOrganization())
                    .address(AddressData.ADDRESS_48.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MARISQUEIRA_BAIA_DE_LUANDA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .address(AddressData.ADDRESS_49.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MARISQUEIRA_DO_PORTO_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.MARISQUEIRA_DO_PORTO.getOrganization())
                    .address(AddressData.ADDRESS_50.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MARISQUEIRA_KILAMBA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.MARISQUEIRA_KILAMBA.getOrganization())
                    .address(AddressData.ADDRESS_51.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MARISQUEIRA_DE_BENGUELA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.MARISQUEIRA_DE_BENGUELA.getOrganization())
                    .address(AddressData.ADDRESS_52.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MARISQUEIRA_DO_NAMIBE_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .address(AddressData.ADDRESS_53.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SUSHI_KIZUA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SUSHI_KIZUA.getOrganization())
                    .address(AddressData.ADDRESS_54.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SUSHI_BOM_DIA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .address(AddressData.ADDRESS_55.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SUSHI_TOKYO_LUANDA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SUSHI_TOKYO_LUANDA.getOrganization())
                    .address(AddressData.ADDRESS_56.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SUSHI_SAKURA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SUSHI_SAKURA.getOrganization())
                    .address(AddressData.ADDRESS_57.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SUSHI_MANGA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SUSHI_MANGA.getOrganization())
                    .address(AddressData.ADDRESS_58.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAFE_KWANZA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .address(AddressData.ADDRESS_59.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAFE_BOSSA_NOVA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.CAFE_BOSSA_NOVA.getOrganization())
                    .address(AddressData.ADDRESS_60.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAFE_DO_MIRAMAR_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.CAFE_DO_MIRAMAR.getOrganization())
                    .address(AddressData.ADDRESS_61.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAFE_PAO_QUENTE_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.CAFE_PAO_QUENTE.getOrganization())
                    .address(AddressData.ADDRESS_62.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    COFFEE_STOP_ANGOLA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.COFFEE_STOP_ANGOLA.getOrganization())
                    .address(AddressData.ADDRESS_63.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BAR_222_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.BAR_222.getOrganization())
                    .address(AddressData.ADDRESS_64.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BAR_TROPICAL_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .address(AddressData.ADDRESS_65.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BAR_DO_KIZUA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.BAR_DO_KIZUA.getOrganization())
                    .address(AddressData.ADDRESS_66.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PUB_KILAMBA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .address(AddressData.ADDRESS_67.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BAR_ESQUINA_DO_MIRAMAR_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.BAR_ESQUINA_DO_MIRAMAR.getOrganization())
                    .address(AddressData.ADDRESS_68.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SELF_SERVICE_KWANZA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .address(AddressData.ADDRESS_69.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SELF_SERVICE_DO_ZE_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SELF_SERVICE_DO_ZE.getOrganization())
                    .address(AddressData.ADDRESS_70.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SELF_SERVICE_KILAMBA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .address(AddressData.ADDRESS_71.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SELF_SERVICE_CENTRAL_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SELF_SERVICE_CENTRAL.getOrganization())
                    .address(AddressData.ADDRESS_72.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SELF_SERVICE_DO_MIRAMAR_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SELF_SERVICE_DO_MIRAMAR.getOrganization())
                    .address(AddressData.ADDRESS_73.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    RESTAURANTE_VEGETARIANO_RAIZES_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.RESTAURANTE_VEGETARIANO_RAIZES.getOrganization())
                    .address(AddressData.ADDRESS_74.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VEGGIE_HOUSE_LUANDA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .address(AddressData.ADDRESS_75.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    COZINHA_VERDE_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.COZINHA_VERDE.getOrganization())
                    .address(AddressData.ADDRESS_76.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BI_VEGETARIANO_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.BI_VEGETARIANO.getOrganization())
                    .address(AddressData.ADDRESS_77.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SABOR_VEGETARIANO_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SABOR_VEGETARIANO.getOrganization())
                    .address(AddressData.ADDRESS_78.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PADARIA_PAO_QUENTE_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .address(AddressData.ADDRESS_79.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PADARIA_KWANZA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .address(AddressData.ADDRESS_80.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PASTELARIA_DOCE_MANJAR_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.PASTELARIA_DOCE_MANJAR.getOrganization())
                    .address(AddressData.ADDRESS_81.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PADARIA_KILAMBA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.PADARIA_KILAMBA.getOrganization())
                    .address(AddressData.ADDRESS_82.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PADARIA_MANACA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.PADARIA_MANACA.getOrganization())
                    .address(AddressData.ADDRESS_83.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LINHAS_AEREAS_KWANZA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.LINHAS_AEREAS_KWANZA.getOrganization())
                    .address(AddressData.ADDRESS_84.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ANGOLA_EXPRESS_AIR_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .address(AddressData.ADDRESS_85.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SKY_ANGOLA_AIRLINES_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SKY_ANGOLA_AIRLINES.getOrganization())
                    .address(AddressData.ADDRESS_86.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    KUBINGA_AIR_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.KUBINGA_AIR.getOrganization())
                    .address(AddressData.ADDRESS_87.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ROYAL_WINGS_ANGOLA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.ROYAL_WINGS_ANGOLA.getOrganization())
                    .address(AddressData.ADDRESS_88.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .address(AddressData.ADDRESS_89.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    AVENTURA_VIAGENS_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .address(AddressData.ADDRESS_90.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TRAVEL_HOUSE_LUANDA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.TRAVEL_HOUSE_LUANDA.getOrganization())
                    .address(AddressData.ADDRESS_91.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GLOBETROTTER_ANGOLA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.GLOBETROTTER_ANGOLA.getOrganization())
                    .address(AddressData.ADDRESS_92.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SAFARIR_VIAGENS_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.SAFARIR_VIAGENS.getOrganization())
                    .address(AddressData.ADDRESS_93.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    OPERADORA_TURISTICA_KWANZA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.OPERADORA_TURISTICA_KWANZA.getOrganization())
                    .address(AddressData.ADDRESS_94.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    AVENTURA_GUIDES_ANGOLA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .address(AddressData.ADDRESS_95.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TURISTAS_LUANDA_GUIDES_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.TURISTAS_LUANDA_GUIDES.getOrganization())
                    .address(AddressData.ADDRESS_96.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    EXPEDICOES_KALANDULA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.EXPEDICOES_KALANDULA.getOrganization())
                    .address(AddressData.ADDRESS_97.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GUIA_TOURS_MIRAMAR_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.GUIA_TOURS_MIRAMAR.getOrganization())
                    .address(AddressData.ADDRESS_98.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETES_DE_LUANDA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .address(AddressData.ADDRESS_99.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GLOBAL_VOICES_ANGOLA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.GLOBAL_VOICES_ANGOLA.getOrganization())
                    .address(AddressData.ADDRESS_100.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TRADUCAO_E_INTERPRETE_SERVICES_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.TRADUCAO_E_INTERPRETE_SERVICES.getOrganization())
                    .address(AddressData.ADDRESS_101.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_PRO_ANGOLA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.INTERPRETE_PRO_ANGOLA.getOrganization())
                    .address(AddressData.ADDRESS_102.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    IDIOMAS_KWANZA_ADDRESS(
            OrganizationAddress.builder()
                    .organization(OrganizationData.IDIOMAS_KWANZA.getOrganization())
                    .address(AddressData.ADDRESS_103.getAddress())
                    .isPrincipal(true)
                    .build()
    );

    private final OrganizationAddress organizationAddress;
}
