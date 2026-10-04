package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.organization.model.OrganizationFile;
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
    ),

    HOTEL_BAIA_DE_LUANDA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .doc(DocumentFileData.HOTEL_BAIA_DE_LUANDA_IMAGE.getDocumentFile())
                    .build()
    ),

    HOTEL_BAIA_DE_LUANDA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .doc(DocumentFileData.HOTEL_BAIA_DE_LUANDA_LOGO.getDocumentFile())
                    .build()
    ),

    HOTEL_BAIA_DE_LUANDA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .doc(DocumentFileData.HOTEL_BAIA_DE_LUANDA_VIDEO.getDocumentFile())
                    .build()
    ),

    HOTEL_MILANO_RESORT_SPA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOTEL_MILANO_RESORT_SPA.getOrganization())
                    .doc(DocumentFileData.HOTEL_MILANO_RESORT_SPA_IMAGE.getDocumentFile())
                    .build()
    ),

    HOTEL_MILANO_RESORT_SPA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOTEL_MILANO_RESORT_SPA.getOrganization())
                    .doc(DocumentFileData.HOTEL_MILANO_RESORT_SPA_LOGO.getDocumentFile())
                    .build()
    ),

    HOTEL_KALANDULA_PALACE_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOTEL_KALANDULA_PALACE.getOrganization())
                    .doc(DocumentFileData.HOTEL_KALANDULA_PALACE_IMAGE.getDocumentFile())
                    .build()
    ),

    HOTEL_KALANDULA_PALACE_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOTEL_KALANDULA_PALACE.getOrganization())
                    .doc(DocumentFileData.HOTEL_KALANDULA_PALACE_LOGO.getDocumentFile())
                    .build()
    ),

    MIRAMAR_BUSINESS_HOTEL_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.MIRAMAR_BUSINESS_HOTEL.getOrganization())
                    .doc(DocumentFileData.MIRAMAR_BUSINESS_HOTEL_IMAGE.getDocumentFile())
                    .build()
    ),

    MIRAMAR_BUSINESS_HOTEL_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.MIRAMAR_BUSINESS_HOTEL.getOrganization())
                    .doc(DocumentFileData.MIRAMAR_BUSINESS_HOTEL_LOGO.getDocumentFile())
                    .build()
    ),

    HOTEL_CASCADE_CITY_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOTEL_CASCADE_CITY.getOrganization())
                    .doc(DocumentFileData.HOTEL_CASCADE_CITY_IMAGE.getDocumentFile())
                    .build()
    ),

    HOTEL_CASCADE_CITY_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOTEL_CASCADE_CITY.getOrganization())
                    .doc(DocumentFileData.HOTEL_CASCADE_CITY_LOGO.getDocumentFile())
                    .build()
    ),

    POUSADA_VILA_HARMONY_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.POUSADA_VILA_HARMONY.getOrganization())
                    .doc(DocumentFileData.POUSADA_VILA_HARMONY_IMAGE.getDocumentFile())
                    .build()
    ),

    POUSADA_VILA_HARMONY_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.POUSADA_VILA_HARMONY.getOrganization())
                    .doc(DocumentFileData.POUSADA_VILA_HARMONY_LOGO.getDocumentFile())
                    .build()
    ),

    POUSADA_VILA_HARMONY_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.POUSADA_VILA_HARMONY.getOrganization())
                    .doc(DocumentFileData.POUSADA_VILA_HARMONY_VIDEO.getDocumentFile())
                    .build()
    ),

    POUSADA_BAIA_AZUL_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.POUSADA_BAIA_AZUL.getOrganization())
                    .doc(DocumentFileData.POUSADA_BAIA_AZUL_IMAGE.getDocumentFile())
                    .build()
    ),

    POUSADA_BAIA_AZUL_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.POUSADA_BAIA_AZUL.getOrganization())
                    .doc(DocumentFileData.POUSADA_BAIA_AZUL_LOGO.getDocumentFile())
                    .build()
    ),

    POUSADA_RECANTO_VERDE_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.POUSADA_RECANTO_VERDE.getOrganization())
                    .doc(DocumentFileData.POUSADA_RECANTO_VERDE_IMAGE.getDocumentFile())
                    .build()
    ),

    POUSADA_RECANTO_VERDE_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.POUSADA_RECANTO_VERDE.getOrganization())
                    .doc(DocumentFileData.POUSADA_RECANTO_VERDE_LOGO.getDocumentFile())
                    .build()
    ),

    POUSADA_SAO_KIZUA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.POUSADA_SAO_KIZUA.getOrganization())
                    .doc(DocumentFileData.POUSADA_SAO_KIZUA_IMAGE.getDocumentFile())
                    .build()
    ),

    POUSADA_SAO_KIZUA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.POUSADA_SAO_KIZUA.getOrganization())
                    .doc(DocumentFileData.POUSADA_SAO_KIZUA_LOGO.getDocumentFile())
                    .build()
    ),

    GUEST_HOUSE_MIRAMAR_INN_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.GUEST_HOUSE_MIRAMAR_INN.getOrganization())
                    .doc(DocumentFileData.GUEST_HOUSE_MIRAMAR_INN_IMAGE.getDocumentFile())
                    .build()
    ),

    GUEST_HOUSE_MIRAMAR_INN_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.GUEST_HOUSE_MIRAMAR_INN.getOrganization())
                    .doc(DocumentFileData.GUEST_HOUSE_MIRAMAR_INN_LOGO.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_PROGRESSO_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_PROGRESSO.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_PROGRESSO_IMAGE.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_PROGRESSO_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_PROGRESSO.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_PROGRESSO_LOGO.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_PROGRESSO_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_PROGRESSO.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_PROGRESSO_VIDEO.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_KWANZA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_KWANZA.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_KWANZA_IMAGE.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_KWANZA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_KWANZA.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_KWANZA_LOGO.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_KWANZA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_KWANZA.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_KWANZA_VIDEO.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_KATANGA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_KATANGA.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_KATANGA_IMAGE.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_KATANGA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_KATANGA.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_KATANGA_LOGO.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_NOVA_VIDA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_NOVA_VIDA.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_NOVA_VIDA_IMAGE.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_NOVA_VIDA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_NOVA_VIDA.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_NOVA_VIDA_LOGO.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_SAO_KIZUA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_SAO_KIZUA.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_SAO_KIZUA_IMAGE.getDocumentFile())
                    .build()
    ),

    HOSPEDARIA_SAO_KIZUA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.HOSPEDARIA_SAO_KIZUA.getOrganization())
                    .doc(DocumentFileData.HOSPEDARIA_SAO_KIZUA_LOGO.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_O_MUSQUETE_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_O_MUSQUETE.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_O_MUSQUETE_IMAGE.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_O_MUSQUETE_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_O_MUSQUETE.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_O_MUSQUETE_LOGO.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_O_MUSQUETE_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_O_MUSQUETE.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_O_MUSQUETE_VIDEO.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_MAR_E_TERRA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_MAR_E_TERRA_IMAGE.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_MAR_E_TERRA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_MAR_E_TERRA_LOGO.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_MAR_E_TERRA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_MAR_E_TERRA_VIDEO.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_KWANZA_LIVING_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_KWANZA_LIVING.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_KWANZA_LIVING_IMAGE.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_KWANZA_LIVING_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_KWANZA_LIVING.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_KWANZA_LIVING_LOGO.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_SABOR_ANGOLANO_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_SABOR_ANGOLANO.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_SABOR_ANGOLANO_IMAGE.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_SABOR_ANGOLANO_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_SABOR_ANGOLANO.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_SABOR_ANGOLANO_LOGO.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_TALATONA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_TALATONA.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_TALATONA_IMAGE.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_TALATONA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_TALATONA.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_TALATONA_LOGO.getDocumentFile())
                    .build()
    ),

    CANTINHO_DA_MAE_ANGOLA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.CANTINHO_DA_MAE_ANGOLA.getOrganization())
                    .doc(DocumentFileData.CANTINHO_DA_MAE_ANGOLA_IMAGE.getDocumentFile())
                    .build()
    ),

    CANTINHO_DA_MAE_ANGOLA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.CANTINHO_DA_MAE_ANGOLA.getOrganization())
                    .doc(DocumentFileData.CANTINHO_DA_MAE_ANGOLA_LOGO.getDocumentFile())
                    .build()
    ),

    CANTINHO_DA_MAE_ANGOLA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.CANTINHO_DA_MAE_ANGOLA.getOrganization())
                    .doc(DocumentFileData.CANTINHO_DA_MAE_ANGOLA_VIDEO.getDocumentFile())
                    .build()
    ),

    SABORES_DA_NOSSA_TERRA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SABORES_DA_NOSSA_TERRA.getOrganization())
                    .doc(DocumentFileData.SABORES_DA_NOSSA_TERRA_IMAGE.getDocumentFile())
                    .build()
    ),

    SABORES_DA_NOSSA_TERRA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SABORES_DA_NOSSA_TERRA.getOrganization())
                    .doc(DocumentFileData.SABORES_DA_NOSSA_TERRA_LOGO.getDocumentFile())
                    .build()
    ),

    SABORES_DA_NOSSA_TERRA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SABORES_DA_NOSSA_TERRA.getOrganization())
                    .doc(DocumentFileData.SABORES_DA_NOSSA_TERRA_VIDEO.getDocumentFile())
                    .build()
    ),

    TASCA_DO_MUAMBA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.TASCA_DO_MUAMBA.getOrganization())
                    .doc(DocumentFileData.TASCA_DO_MUAMBA_IMAGE.getDocumentFile())
                    .build()
    ),

    TASCA_DO_MUAMBA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.TASCA_DO_MUAMBA.getOrganization())
                    .doc(DocumentFileData.TASCA_DO_MUAMBA_LOGO.getDocumentFile())
                    .build()
    ),

    COZINHA_DO_KILAMBA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.COZINHA_DO_KILAMBA.getOrganization())
                    .doc(DocumentFileData.COZINHA_DO_KILAMBA_IMAGE.getDocumentFile())
                    .build()
    ),

    COZINHA_DO_KILAMBA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.COZINHA_DO_KILAMBA.getOrganization())
                    .doc(DocumentFileData.COZINHA_DO_KILAMBA_LOGO.getDocumentFile())
                    .build()
    ),

    SOLAR_DO_KWANZA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SOLAR_DO_KWANZA.getOrganization())
                    .doc(DocumentFileData.SOLAR_DO_KWANZA_IMAGE.getDocumentFile())
                    .build()
    ),

    SOLAR_DO_KWANZA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SOLAR_DO_KWANZA.getOrganization())
                    .doc(DocumentFileData.SOLAR_DO_KWANZA_LOGO.getDocumentFile())
                    .build()
    ),

    PIZZERIA_NAPOLI_LUANDA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_NAPOLI_LUANDA.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_NAPOLI_LUANDA_IMAGE.getDocumentFile())
                    .build()
    ),

    PIZZERIA_NAPOLI_LUANDA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_NAPOLI_LUANDA.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_NAPOLI_LUANDA_LOGO.getDocumentFile())
                    .build()
    ),

    PIZZERIA_NAPOLI_LUANDA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_NAPOLI_LUANDA.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_NAPOLI_LUANDA_VIDEO.getDocumentFile())
                    .build()
    ),

    PIZZERIA_FORNO_ANGOLA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_FORNO_ANGOLA_IMAGE.getDocumentFile())
                    .build()
    ),

    PIZZERIA_FORNO_ANGOLA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_FORNO_ANGOLA_LOGO.getDocumentFile())
                    .build()
    ),

    PIZZERIA_FORNO_ANGOLA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_FORNO_ANGOLA_VIDEO.getDocumentFile())
                    .build()
    ),

    PIZZERIA_MSLICE_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_MSLICE.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_MSLICE_IMAGE.getDocumentFile())
                    .build()
    ),

    PIZZERIA_MSLICE_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_MSLICE.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_MSLICE_LOGO.getDocumentFile())
                    .build()
    ),

    PIZZERIA_MANGUERINHA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_MANGUERINHA.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_MANGUERINHA_IMAGE.getDocumentFile())
                    .build()
    ),

    PIZZERIA_MANGUERINHA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_MANGUERINHA.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_MANGUERINHA_LOGO.getDocumentFile())
                    .build()
    ),

    PIZZERIA_BELLA_VISTA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_BELLA_VISTA.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_BELLA_VISTA_IMAGE.getDocumentFile())
                    .build()
    ),

    PIZZERIA_BELLA_VISTA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PIZZERIA_BELLA_VISTA.getOrganization())
                    .doc(DocumentFileData.PIZZERIA_BELLA_VISTA_LOGO.getDocumentFile())
                    .build()
    ),

    SNACK_BAR_O_PONTO_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SNACK_BAR_O_PONTO.getOrganization())
                    .doc(DocumentFileData.SNACK_BAR_O_PONTO_IMAGE.getDocumentFile())
                    .build()
    ),

    SNACK_BAR_O_PONTO_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SNACK_BAR_O_PONTO.getOrganization())
                    .doc(DocumentFileData.SNACK_BAR_O_PONTO_LOGO.getDocumentFile())
                    .build()
    ),

    SNACK_BAR_O_PONTO_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SNACK_BAR_O_PONTO.getOrganization())
                    .doc(DocumentFileData.SNACK_BAR_O_PONTO_VIDEO.getDocumentFile())
                    .build()
    ),

    BURGER_STATION_LUANDA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.BURGER_STATION_LUANDA.getOrganization())
                    .doc(DocumentFileData.BURGER_STATION_LUANDA_IMAGE.getDocumentFile())
                    .build()
    ),

    BURGER_STATION_LUANDA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.BURGER_STATION_LUANDA.getOrganization())
                    .doc(DocumentFileData.BURGER_STATION_LUANDA_LOGO.getDocumentFile())
                    .build()
    ),

    BURGER_STATION_LUANDA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.BURGER_STATION_LUANDA.getOrganization())
                    .doc(DocumentFileData.BURGER_STATION_LUANDA_VIDEO.getDocumentFile())
                    .build()
    ),

    FAST_FOOD_KWANZA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.FAST_FOOD_KWANZA.getOrganization())
                    .doc(DocumentFileData.FAST_FOOD_KWANZA_IMAGE.getDocumentFile())
                    .build()
    ),

    FAST_FOOD_KWANZA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.FAST_FOOD_KWANZA.getOrganization())
                    .doc(DocumentFileData.FAST_FOOD_KWANZA_LOGO.getDocumentFile())
                    .build()
    ),

    LANCHES_DO_MIRAMAR_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.LANCHES_DO_MIRAMAR.getOrganization())
                    .doc(DocumentFileData.LANCHES_DO_MIRAMAR_IMAGE.getDocumentFile())
                    .build()
    ),

    LANCHES_DO_MIRAMAR_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.LANCHES_DO_MIRAMAR.getOrganization())
                    .doc(DocumentFileData.LANCHES_DO_MIRAMAR_LOGO.getDocumentFile())
                    .build()
    ),

    FOOD_TRUCK_TAXI_AZUL_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.FOOD_TRUCK_TAXI_AZUL.getOrganization())
                    .doc(DocumentFileData.FOOD_TRUCK_TAXI_AZUL_IMAGE.getDocumentFile())
                    .build()
    ),

    FOOD_TRUCK_TAXI_AZUL_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.FOOD_TRUCK_TAXI_AZUL.getOrganization())
                    .doc(DocumentFileData.FOOD_TRUCK_TAXI_AZUL_LOGO.getDocumentFile())
                    .build()
    ),

    CHURRASQUEIRA_DO_ZE_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.CHURRASQUEIRA_DO_ZE.getOrganization())
                    .doc(DocumentFileData.CHURRASQUEIRA_DO_ZE_IMAGE.getDocumentFile())
                    .build()
    ),

    CHURRASQUEIRA_DO_ZE_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.CHURRASQUEIRA_DO_ZE.getOrganization())
                    .doc(DocumentFileData.CHURRASQUEIRA_DO_ZE_LOGO.getDocumentFile())
                    .build()
    ),

    CHURRASQUEIRA_DO_ZE_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.CHURRASQUEIRA_DO_ZE.getOrganization())
                    .doc(DocumentFileData.CHURRASQUEIRA_DO_ZE_VIDEO.getDocumentFile())
                    .build()
    ),

    GRELHADOS_MIUDOS_KIZUA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .doc(DocumentFileData.GRELHADOS_MIUDOS_KIZUA_IMAGE.getDocumentFile())
                    .build()
    ),

    GRELHADOS_MIUDOS_KIZUA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .doc(DocumentFileData.GRELHADOS_MIUDOS_KIZUA_LOGO.getDocumentFile())
                    .build()
    ),

    GRELHADOS_MIUDOS_KIZUA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .doc(DocumentFileData.GRELHADOS_MIUDOS_KIZUA_VIDEO.getDocumentFile())
                    .build()
    ),

    ESPETOS_DA_BAIA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.ESPETOS_DA_BAIA.getOrganization())
                    .doc(DocumentFileData.ESPETOS_DA_BAIA_IMAGE.getDocumentFile())
                    .build()
    ),

    ESPETOS_DA_BAIA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.ESPETOS_DA_BAIA.getOrganization())
                    .doc(DocumentFileData.ESPETOS_DA_BAIA_LOGO.getDocumentFile())
                    .build()
    ),

    CHURRASCO_KING_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.CHURRASCO_KING.getOrganization())
                    .doc(DocumentFileData.CHURRASCO_KING_IMAGE.getDocumentFile())
                    .build()
    ),

    CHURRASCO_KING_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.CHURRASCO_KING.getOrganization())
                    .doc(DocumentFileData.CHURRASCO_KING_LOGO.getDocumentFile())
                    .build()
    ),

    GRELHADO_DA_CASA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.GRELHADO_DA_CASA.getOrganization())
                    .doc(DocumentFileData.GRELHADO_DA_CASA_IMAGE.getDocumentFile())
                    .build()
    ),

    GRELHADO_DA_CASA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.GRELHADO_DA_CASA.getOrganization())
                    .doc(DocumentFileData.GRELHADO_DA_CASA_LOGO.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_BAIA_DE_LUANDA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_BAIA_DE_LUANDA_IMAGE.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_BAIA_DE_LUANDA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_BAIA_DE_LUANDA_LOGO.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_BAIA_DE_LUANDA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_BAIA_DE_LUANDA_VIDEO.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_DO_PORTO_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_DO_PORTO.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_DO_PORTO_IMAGE.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_DO_PORTO_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_DO_PORTO.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_DO_PORTO_LOGO.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_DO_PORTO_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_DO_PORTO.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_DO_PORTO_VIDEO.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_KILAMBA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_KILAMBA.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_KILAMBA_IMAGE.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_KILAMBA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_KILAMBA.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_KILAMBA_LOGO.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_DE_BENGUELA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_DE_BENGUELA.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_DE_BENGUELA_IMAGE.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_DE_BENGUELA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_DE_BENGUELA.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_DE_BENGUELA_LOGO.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_DO_NAMIBE_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_DO_NAMIBE_IMAGE.getDocumentFile())
                    .build()
    ),

    MARISQUEIRA_DO_NAMIBE_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .doc(DocumentFileData.MARISQUEIRA_DO_NAMIBE_LOGO.getDocumentFile())
                    .build()
    ),

    SUSHI_KIZUA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_KIZUA.getOrganization())
                    .doc(DocumentFileData.SUSHI_KIZUA_IMAGE.getDocumentFile())
                    .build()
    ),

    SUSHI_KIZUA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_KIZUA.getOrganization())
                    .doc(DocumentFileData.SUSHI_KIZUA_LOGO.getDocumentFile())
                    .build()
    ),

    SUSHI_KIZUA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_KIZUA.getOrganization())
                    .doc(DocumentFileData.SUSHI_KIZUA_VIDEO.getDocumentFile())
                    .build()
    ),

    SUSHI_BOM_DIA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .doc(DocumentFileData.SUSHI_BOM_DIA_IMAGE.getDocumentFile())
                    .build()
    ),

    SUSHI_BOM_DIA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .doc(DocumentFileData.SUSHI_BOM_DIA_LOGO.getDocumentFile())
                    .build()
    ),

    SUSHI_BOM_DIA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .doc(DocumentFileData.SUSHI_BOM_DIA_VIDEO.getDocumentFile())
                    .build()
    ),

    SUSHI_TOKYO_LUANDA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_TOKYO_LUANDA.getOrganization())
                    .doc(DocumentFileData.SUSHI_TOKYO_LUANDA_IMAGE.getDocumentFile())
                    .build()
    ),

    SUSHI_TOKYO_LUANDA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_TOKYO_LUANDA.getOrganization())
                    .doc(DocumentFileData.SUSHI_TOKYO_LUANDA_LOGO.getDocumentFile())
                    .build()
    ),

    SUSHI_SAKURA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_SAKURA.getOrganization())
                    .doc(DocumentFileData.SUSHI_SAKURA_IMAGE.getDocumentFile())
                    .build()
    ),

    SUSHI_SAKURA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_SAKURA.getOrganization())
                    .doc(DocumentFileData.SUSHI_SAKURA_LOGO.getDocumentFile())
                    .build()
    ),

    SUSHI_MANGA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_MANGA.getOrganization())
                    .doc(DocumentFileData.SUSHI_MANGA_IMAGE.getDocumentFile())
                    .build()
    ),

    SUSHI_MANGA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SUSHI_MANGA.getOrganization())
                    .doc(DocumentFileData.SUSHI_MANGA_LOGO.getDocumentFile())
                    .build()
    ),

    CAFE_KWANZA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .doc(DocumentFileData.CAFE_KWANZA_IMAGE.getDocumentFile())
                    .build()
    ),

    CAFE_KWANZA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .doc(DocumentFileData.CAFE_KWANZA_LOGO.getDocumentFile())
                    .build()
    ),

    CAFE_KWANZA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .doc(DocumentFileData.CAFE_KWANZA_VIDEO.getDocumentFile())
                    .build()
    ),

    CAFE_BOSSA_NOVA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.CAFE_BOSSA_NOVA.getOrganization())
                    .doc(DocumentFileData.CAFE_BOSSA_NOVA_IMAGE.getDocumentFile())
                    .build()
    ),

    CAFE_BOSSA_NOVA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.CAFE_BOSSA_NOVA.getOrganization())
                    .doc(DocumentFileData.CAFE_BOSSA_NOVA_LOGO.getDocumentFile())
                    .build()
    ),

    CAFE_BOSSA_NOVA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.CAFE_BOSSA_NOVA.getOrganization())
                    .doc(DocumentFileData.CAFE_BOSSA_NOVA_VIDEO.getDocumentFile())
                    .build()
    ),

    CAFE_DO_MIRAMAR_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.CAFE_DO_MIRAMAR.getOrganization())
                    .doc(DocumentFileData.CAFE_DO_MIRAMAR_IMAGE.getDocumentFile())
                    .build()
    ),

    CAFE_DO_MIRAMAR_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.CAFE_DO_MIRAMAR.getOrganization())
                    .doc(DocumentFileData.CAFE_DO_MIRAMAR_LOGO.getDocumentFile())
                    .build()
    ),

    CAFE_PAO_QUENTE_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.CAFE_PAO_QUENTE.getOrganization())
                    .doc(DocumentFileData.CAFE_PAO_QUENTE_IMAGE.getDocumentFile())
                    .build()
    ),

    CAFE_PAO_QUENTE_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.CAFE_PAO_QUENTE.getOrganization())
                    .doc(DocumentFileData.CAFE_PAO_QUENTE_LOGO.getDocumentFile())
                    .build()
    ),

    COFFEE_STOP_ANGOLA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.COFFEE_STOP_ANGOLA.getOrganization())
                    .doc(DocumentFileData.COFFEE_STOP_ANGOLA_IMAGE.getDocumentFile())
                    .build()
    ),

    COFFEE_STOP_ANGOLA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.COFFEE_STOP_ANGOLA.getOrganization())
                    .doc(DocumentFileData.COFFEE_STOP_ANGOLA_LOGO.getDocumentFile())
                    .build()
    ),

    BAR_222_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.BAR_222.getOrganization())
                    .doc(DocumentFileData.BAR_222_IMAGE.getDocumentFile())
                    .build()
    ),

    BAR_222_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.BAR_222.getOrganization())
                    .doc(DocumentFileData.BAR_222_LOGO.getDocumentFile())
                    .build()
    ),

    BAR_222_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.BAR_222.getOrganization())
                    .doc(DocumentFileData.BAR_222_VIDEO.getDocumentFile())
                    .build()
    ),

    BAR_TROPICAL_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .doc(DocumentFileData.BAR_TROPICAL_IMAGE.getDocumentFile())
                    .build()
    ),

    BAR_TROPICAL_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .doc(DocumentFileData.BAR_TROPICAL_LOGO.getDocumentFile())
                    .build()
    ),

    BAR_TROPICAL_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .doc(DocumentFileData.BAR_TROPICAL_VIDEO.getDocumentFile())
                    .build()
    ),

    BAR_DO_KIZUA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.BAR_DO_KIZUA.getOrganization())
                    .doc(DocumentFileData.BAR_DO_KIZUA_IMAGE.getDocumentFile())
                    .build()
    ),

    BAR_DO_KIZUA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.BAR_DO_KIZUA.getOrganization())
                    .doc(DocumentFileData.BAR_DO_KIZUA_LOGO.getDocumentFile())
                    .build()
    ),

    PUB_KILAMBA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .doc(DocumentFileData.PUB_KILAMBA_IMAGE.getDocumentFile())
                    .build()
    ),

    PUB_KILAMBA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .doc(DocumentFileData.PUB_KILAMBA_LOGO.getDocumentFile())
                    .build()
    ),

    BAR_ESQUINA_DO_MIRAMAR_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.BAR_ESQUINA_DO_MIRAMAR.getOrganization())
                    .doc(DocumentFileData.BAR_ESQUINA_DO_MIRAMAR_IMAGE.getDocumentFile())
                    .build()
    ),

    BAR_ESQUINA_DO_MIRAMAR_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.BAR_ESQUINA_DO_MIRAMAR.getOrganization())
                    .doc(DocumentFileData.BAR_ESQUINA_DO_MIRAMAR_LOGO.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_KWANZA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_KWANZA_IMAGE.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_KWANZA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_KWANZA_LOGO.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_KWANZA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_KWANZA_VIDEO.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_DO_ZE_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_DO_ZE.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_DO_ZE_IMAGE.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_DO_ZE_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_DO_ZE.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_DO_ZE_LOGO.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_DO_ZE_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_DO_ZE.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_DO_ZE_VIDEO.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_KILAMBA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_KILAMBA_IMAGE.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_KILAMBA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_KILAMBA_LOGO.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_CENTRAL_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_CENTRAL.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_CENTRAL_IMAGE.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_CENTRAL_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_CENTRAL.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_CENTRAL_LOGO.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_DO_MIRAMAR_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_DO_MIRAMAR.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_DO_MIRAMAR_IMAGE.getDocumentFile())
                    .build()
    ),

    SELF_SERVICE_DO_MIRAMAR_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SELF_SERVICE_DO_MIRAMAR.getOrganization())
                    .doc(DocumentFileData.SELF_SERVICE_DO_MIRAMAR_LOGO.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_VEGETARIANO_RAIZES_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_VEGETARIANO_RAIZES.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_VEGETARIANO_RAIZES_IMAGE.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_VEGETARIANO_RAIZES_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_VEGETARIANO_RAIZES.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_VEGETARIANO_RAIZES_LOGO.getDocumentFile())
                    .build()
    ),

    RESTAURANTE_VEGETARIANO_RAIZES_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.RESTAURANTE_VEGETARIANO_RAIZES.getOrganization())
                    .doc(DocumentFileData.RESTAURANTE_VEGETARIANO_RAIZES_VIDEO.getDocumentFile())
                    .build()
    ),

    VEGGIE_HOUSE_LUANDA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .doc(DocumentFileData.VEGGIE_HOUSE_LUANDA_IMAGE.getDocumentFile())
                    .build()
    ),

    VEGGIE_HOUSE_LUANDA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .doc(DocumentFileData.VEGGIE_HOUSE_LUANDA_LOGO.getDocumentFile())
                    .build()
    ),

    VEGGIE_HOUSE_LUANDA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .doc(DocumentFileData.VEGGIE_HOUSE_LUANDA_VIDEO.getDocumentFile())
                    .build()
    ),

    COZINHA_VERDE_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.COZINHA_VERDE.getOrganization())
                    .doc(DocumentFileData.COZINHA_VERDE_IMAGE.getDocumentFile())
                    .build()
    ),

    COZINHA_VERDE_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.COZINHA_VERDE.getOrganization())
                    .doc(DocumentFileData.COZINHA_VERDE_LOGO.getDocumentFile())
                    .build()
    ),

    BI_VEGETARIANO_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.BI_VEGETARIANO.getOrganization())
                    .doc(DocumentFileData.BI_VEGETARIANO_IMAGE.getDocumentFile())
                    .build()
    ),

    BI_VEGETARIANO_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.BI_VEGETARIANO.getOrganization())
                    .doc(DocumentFileData.BI_VEGETARIANO_LOGO.getDocumentFile())
                    .build()
    ),

    SABOR_VEGETARIANO_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SABOR_VEGETARIANO.getOrganization())
                    .doc(DocumentFileData.SABOR_VEGETARIANO_IMAGE.getDocumentFile())
                    .build()
    ),

    SABOR_VEGETARIANO_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SABOR_VEGETARIANO.getOrganization())
                    .doc(DocumentFileData.SABOR_VEGETARIANO_LOGO.getDocumentFile())
                    .build()
    ),

    PADARIA_PAO_QUENTE_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .doc(DocumentFileData.PADARIA_PAO_QUENTE_IMAGE.getDocumentFile())
                    .build()
    ),

    PADARIA_PAO_QUENTE_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .doc(DocumentFileData.PADARIA_PAO_QUENTE_LOGO.getDocumentFile())
                    .build()
    ),

    PADARIA_PAO_QUENTE_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .doc(DocumentFileData.PADARIA_PAO_QUENTE_VIDEO.getDocumentFile())
                    .build()
    ),

    PADARIA_KWANZA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .doc(DocumentFileData.PADARIA_KWANZA_IMAGE.getDocumentFile())
                    .build()
    ),

    PADARIA_KWANZA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .doc(DocumentFileData.PADARIA_KWANZA_LOGO.getDocumentFile())
                    .build()
    ),

    PADARIA_KWANZA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .doc(DocumentFileData.PADARIA_KWANZA_VIDEO.getDocumentFile())
                    .build()
    ),

    PASTELARIA_DOCE_MANJAR_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.PASTELARIA_DOCE_MANJAR.getOrganization())
                    .doc(DocumentFileData.PASTELARIA_DOCE_MANJAR_IMAGE.getDocumentFile())
                    .build()
    ),

    PASTELARIA_DOCE_MANJAR_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PASTELARIA_DOCE_MANJAR.getOrganization())
                    .doc(DocumentFileData.PASTELARIA_DOCE_MANJAR_LOGO.getDocumentFile())
                    .build()
    ),

    PADARIA_KILAMBA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.PADARIA_KILAMBA.getOrganization())
                    .doc(DocumentFileData.PADARIA_KILAMBA_IMAGE.getDocumentFile())
                    .build()
    ),

    PADARIA_KILAMBA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PADARIA_KILAMBA.getOrganization())
                    .doc(DocumentFileData.PADARIA_KILAMBA_LOGO.getDocumentFile())
                    .build()
    ),

    PADARIA_MANACA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.PADARIA_MANACA.getOrganization())
                    .doc(DocumentFileData.PADARIA_MANACA_IMAGE.getDocumentFile())
                    .build()
    ),

    PADARIA_MANACA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.PADARIA_MANACA.getOrganization())
                    .doc(DocumentFileData.PADARIA_MANACA_LOGO.getDocumentFile())
                    .build()
    ),

    LINHAS_AEREAS_KWANZA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.LINHAS_AEREAS_KWANZA.getOrganization())
                    .doc(DocumentFileData.LINHAS_AEREAS_KWANZA_IMAGE.getDocumentFile())
                    .build()
    ),

    LINHAS_AEREAS_KWANZA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.LINHAS_AEREAS_KWANZA.getOrganization())
                    .doc(DocumentFileData.LINHAS_AEREAS_KWANZA_LOGO.getDocumentFile())
                    .build()
    ),

    LINHAS_AEREAS_KWANZA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.LINHAS_AEREAS_KWANZA.getOrganization())
                    .doc(DocumentFileData.LINHAS_AEREAS_KWANZA_VIDEO.getDocumentFile())
                    .build()
    ),

    ANGOLA_EXPRESS_AIR_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .doc(DocumentFileData.ANGOLA_EXPRESS_AIR_IMAGE.getDocumentFile())
                    .build()
    ),

    ANGOLA_EXPRESS_AIR_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .doc(DocumentFileData.ANGOLA_EXPRESS_AIR_LOGO.getDocumentFile())
                    .build()
    ),

    ANGOLA_EXPRESS_AIR_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .doc(DocumentFileData.ANGOLA_EXPRESS_AIR_VIDEO.getDocumentFile())
                    .build()
    ),

    SKY_ANGOLA_AIRLINES_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SKY_ANGOLA_AIRLINES.getOrganization())
                    .doc(DocumentFileData.SKY_ANGOLA_AIRLINES_IMAGE.getDocumentFile())
                    .build()
    ),

    SKY_ANGOLA_AIRLINES_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SKY_ANGOLA_AIRLINES.getOrganization())
                    .doc(DocumentFileData.SKY_ANGOLA_AIRLINES_LOGO.getDocumentFile())
                    .build()
    ),

    KUBINGA_AIR_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.KUBINGA_AIR.getOrganization())
                    .doc(DocumentFileData.KUBINGA_AIR_IMAGE.getDocumentFile())
                    .build()
    ),

    KUBINGA_AIR_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.KUBINGA_AIR.getOrganization())
                    .doc(DocumentFileData.KUBINGA_AIR_LOGO.getDocumentFile())
                    .build()
    ),

    ROYAL_WINGS_ANGOLA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.ROYAL_WINGS_ANGOLA.getOrganization())
                    .doc(DocumentFileData.ROYAL_WINGS_ANGOLA_IMAGE.getDocumentFile())
                    .build()
    ),

    ROYAL_WINGS_ANGOLA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.ROYAL_WINGS_ANGOLA.getOrganization())
                    .doc(DocumentFileData.ROYAL_WINGS_ANGOLA_LOGO.getDocumentFile())
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .doc(DocumentFileData.AGENCIA_DE_VIAGENS_KWANZA_IMAGE.getDocumentFile())
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .doc(DocumentFileData.AGENCIA_DE_VIAGENS_KWANZA_LOGO.getDocumentFile())
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .doc(DocumentFileData.AGENCIA_DE_VIAGENS_KWANZA_VIDEO.getDocumentFile())
                    .build()
    ),

    AVENTURA_VIAGENS_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .doc(DocumentFileData.AVENTURA_VIAGENS_IMAGE.getDocumentFile())
                    .build()
    ),

    AVENTURA_VIAGENS_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .doc(DocumentFileData.AVENTURA_VIAGENS_LOGO.getDocumentFile())
                    .build()
    ),

    AVENTURA_VIAGENS_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .doc(DocumentFileData.AVENTURA_VIAGENS_VIDEO.getDocumentFile())
                    .build()
    ),

    TRAVEL_HOUSE_LUANDA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.TRAVEL_HOUSE_LUANDA.getOrganization())
                    .doc(DocumentFileData.TRAVEL_HOUSE_LUANDA_IMAGE.getDocumentFile())
                    .build()
    ),

    TRAVEL_HOUSE_LUANDA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.TRAVEL_HOUSE_LUANDA.getOrganization())
                    .doc(DocumentFileData.TRAVEL_HOUSE_LUANDA_LOGO.getDocumentFile())
                    .build()
    ),

    GLOBETROTTER_ANGOLA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.GLOBETROTTER_ANGOLA.getOrganization())
                    .doc(DocumentFileData.GLOBETROTTER_ANGOLA_IMAGE.getDocumentFile())
                    .build()
    ),

    GLOBETROTTER_ANGOLA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.GLOBETROTTER_ANGOLA.getOrganization())
                    .doc(DocumentFileData.GLOBETROTTER_ANGOLA_LOGO.getDocumentFile())
                    .build()
    ),

    SAFARIR_VIAGENS_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.SAFARIR_VIAGENS.getOrganization())
                    .doc(DocumentFileData.SAFARIR_VIAGENS_IMAGE.getDocumentFile())
                    .build()
    ),

    SAFARIR_VIAGENS_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.SAFARIR_VIAGENS.getOrganization())
                    .doc(DocumentFileData.SAFARIR_VIAGENS_LOGO.getDocumentFile())
                    .build()
    ),

    OPERADORA_TURISTICA_KWANZA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.OPERADORA_TURISTICA_KWANZA.getOrganization())
                    .doc(DocumentFileData.OPERADORA_TURISTICA_KWANZA_IMAGE.getDocumentFile())
                    .build()
    ),

    OPERADORA_TURISTICA_KWANZA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.OPERADORA_TURISTICA_KWANZA.getOrganization())
                    .doc(DocumentFileData.OPERADORA_TURISTICA_KWANZA_LOGO.getDocumentFile())
                    .build()
    ),

    OPERADORA_TURISTICA_KWANZA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.OPERADORA_TURISTICA_KWANZA.getOrganization())
                    .doc(DocumentFileData.OPERADORA_TURISTICA_KWANZA_VIDEO.getDocumentFile())
                    .build()
    ),

    AVENTURA_GUIDES_ANGOLA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .doc(DocumentFileData.AVENTURA_GUIDES_ANGOLA_IMAGE.getDocumentFile())
                    .build()
    ),

    AVENTURA_GUIDES_ANGOLA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .doc(DocumentFileData.AVENTURA_GUIDES_ANGOLA_LOGO.getDocumentFile())
                    .build()
    ),

    AVENTURA_GUIDES_ANGOLA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .doc(DocumentFileData.AVENTURA_GUIDES_ANGOLA_VIDEO.getDocumentFile())
                    .build()
    ),

    TURISTAS_LUANDA_GUIDES_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.TURISTAS_LUANDA_GUIDES.getOrganization())
                    .doc(DocumentFileData.TURISTAS_LUANDA_GUIDES_IMAGE.getDocumentFile())
                    .build()
    ),

    TURISTAS_LUANDA_GUIDES_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.TURISTAS_LUANDA_GUIDES.getOrganization())
                    .doc(DocumentFileData.TURISTAS_LUANDA_GUIDES_LOGO.getDocumentFile())
                    .build()
    ),

    EXPEDICOES_KALANDULA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.EXPEDICOES_KALANDULA.getOrganization())
                    .doc(DocumentFileData.EXPEDICOES_KALANDULA_IMAGE.getDocumentFile())
                    .build()
    ),

    EXPEDICOES_KALANDULA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.EXPEDICOES_KALANDULA.getOrganization())
                    .doc(DocumentFileData.EXPEDICOES_KALANDULA_LOGO.getDocumentFile())
                    .build()
    ),

    GUIA_TOURS_MIRAMAR_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.GUIA_TOURS_MIRAMAR.getOrganization())
                    .doc(DocumentFileData.GUIA_TOURS_MIRAMAR_IMAGE.getDocumentFile())
                    .build()
    ),

    GUIA_TOURS_MIRAMAR_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.GUIA_TOURS_MIRAMAR.getOrganization())
                    .doc(DocumentFileData.GUIA_TOURS_MIRAMAR_LOGO.getDocumentFile())
                    .build()
    ),

    INTERPRETES_DE_LUANDA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .doc(DocumentFileData.INTERPRETES_DE_LUANDA_IMAGE.getDocumentFile())
                    .build()
    ),

    INTERPRETES_DE_LUANDA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .doc(DocumentFileData.INTERPRETES_DE_LUANDA_LOGO.getDocumentFile())
                    .build()
    ),

    INTERPRETES_DE_LUANDA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .doc(DocumentFileData.INTERPRETES_DE_LUANDA_VIDEO.getDocumentFile())
                    .build()
    ),

    GLOBAL_VOICES_ANGOLA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.GLOBAL_VOICES_ANGOLA.getOrganization())
                    .doc(DocumentFileData.GLOBAL_VOICES_ANGOLA_IMAGE.getDocumentFile())
                    .build()
    ),

    GLOBAL_VOICES_ANGOLA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.GLOBAL_VOICES_ANGOLA.getOrganization())
                    .doc(DocumentFileData.GLOBAL_VOICES_ANGOLA_LOGO.getDocumentFile())
                    .build()
    ),

    GLOBAL_VOICES_ANGOLA_VIDEO(
            OrganizationFile.builder()
                    .organization(OrganizationData.GLOBAL_VOICES_ANGOLA.getOrganization())
                    .doc(DocumentFileData.GLOBAL_VOICES_ANGOLA_VIDEO.getDocumentFile())
                    .build()
    ),

    TRADUCAO_E_INTERPRETE_SERVICES_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.TRADUCAO_E_INTERPRETE_SERVICES.getOrganization())
                    .doc(DocumentFileData.TRADUCAO_E_INTERPRETE_SERVICES_IMAGE.getDocumentFile())
                    .build()
    ),

    TRADUCAO_E_INTERPRETE_SERVICES_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.TRADUCAO_E_INTERPRETE_SERVICES.getOrganization())
                    .doc(DocumentFileData.TRADUCAO_E_INTERPRETE_SERVICES_LOGO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_PRO_ANGOLA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.INTERPRETE_PRO_ANGOLA.getOrganization())
                    .doc(DocumentFileData.INTERPRETE_PRO_ANGOLA_IMAGE.getDocumentFile())
                    .build()
    ),

    INTERPRETE_PRO_ANGOLA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.INTERPRETE_PRO_ANGOLA.getOrganization())
                    .doc(DocumentFileData.INTERPRETE_PRO_ANGOLA_LOGO.getDocumentFile())
                    .build()
    ),

    IDIOMAS_KWANZA_IMAGE(
            OrganizationFile.builder()
                    .organization(OrganizationData.IDIOMAS_KWANZA.getOrganization())
                    .doc(DocumentFileData.IDIOMAS_KWANZA_IMAGE.getDocumentFile())
                    .build()
    ),

    IDIOMAS_KWANZA_LOGO(
            OrganizationFile.builder()
                    .organization(OrganizationData.IDIOMAS_KWANZA.getOrganization())
                    .doc(DocumentFileData.IDIOMAS_KWANZA_LOGO.getDocumentFile())
                    .build()
    );

    private final OrganizationFile organizationFile;
}
