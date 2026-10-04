package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.config.seeder.system.CategoryData;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationCategory;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrganizationCategoryData {
    EPIC_SANA_HOTEL(
            OrganizationCategory.builder()
                    .category(CategoryData.HOTEL.getCategory())
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .build()
    ),

    EPIC_SANA_ACCOMMODATION(
            OrganizationCategory.builder()
                    .category(CategoryData.ACCOMMODATION.getCategory())
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .build()
    ),

    MIRAMAR_GUESTHOUSE(
            OrganizationCategory.builder()
                    .category(CategoryData.GUESTHOUSE.getCategory())
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .build()
    ),

    MIRAMAR_ACCOMMODATION(
            OrganizationCategory.builder()
                    .category(CategoryData.ACCOMMODATION.getCategory())
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .build()
    ),

    HUAMBO_GUESTHOUSE(
            OrganizationCategory.builder()
                    .category(CategoryData.GUESTHOUSE.getCategory())
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .build()
    ),

    HUAMBO_ACCOMMODATION(
            OrganizationCategory.builder()
                    .category(CategoryData.ACCOMMODATION.getCategory())
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .build()
    ),

    HOTEL_BAIA_DE_LUANDA_HOTEL(
            OrganizationCategory.builder()
                    .category(CategoryData.HOTEL.getCategory())
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    HOTEL_BAIA_DE_LUANDA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    HOTEL_MILANO_RESORT_SPA_HOTEL(
            OrganizationCategory.builder()
                    .category(CategoryData.HOTEL.getCategory())
                    .organization(OrganizationData.HOTEL_MILANO_RESORT_SPA.getOrganization())
                    .build()
    ),

    HOTEL_KALANDULA_PALACE_HOTEL(
            OrganizationCategory.builder()
                    .category(CategoryData.HOTEL.getCategory())
                    .organization(OrganizationData.HOTEL_KALANDULA_PALACE.getOrganization())
                    .build()
    ),

    MIRAMAR_BUSINESS_HOTEL_HOTEL(
            OrganizationCategory.builder()
                    .category(CategoryData.HOTEL.getCategory())
                    .organization(OrganizationData.MIRAMAR_BUSINESS_HOTEL.getOrganization())
                    .build()
    ),

    MIRAMAR_BUSINESS_HOTEL_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.MIRAMAR_BUSINESS_HOTEL.getOrganization())
                    .build()
    ),

    HOTEL_CASCADE_CITY_HOTEL(
            OrganizationCategory.builder()
                    .category(CategoryData.HOTEL.getCategory())
                    .organization(OrganizationData.HOTEL_CASCADE_CITY.getOrganization())
                    .build()
    ),

    HOTEL_CASCADE_CITY_SELF_SERVICE(
            OrganizationCategory.builder()
                    .category(CategoryData.SELF_SERVICE.getCategory())
                    .organization(OrganizationData.HOTEL_CASCADE_CITY.getOrganization())
                    .build()
    ),

    POUSADA_VILA_HARMONY_GUESTHOUSE(
            OrganizationCategory.builder()
                    .category(CategoryData.GUESTHOUSE.getCategory())
                    .organization(OrganizationData.POUSADA_VILA_HARMONY.getOrganization())
                    .build()
    ),

    POUSADA_VILA_HARMONY_ACCOMMODATION(
            OrganizationCategory.builder()
                    .category(CategoryData.ACCOMMODATION.getCategory())
                    .organization(OrganizationData.POUSADA_VILA_HARMONY.getOrganization())
                    .build()
    ),

    POUSADA_BAIA_AZUL_GUESTHOUSE(
            OrganizationCategory.builder()
                    .category(CategoryData.GUESTHOUSE.getCategory())
                    .organization(OrganizationData.POUSADA_BAIA_AZUL.getOrganization())
                    .build()
    ),

    POUSADA_RECANTO_VERDE_GUESTHOUSE(
            OrganizationCategory.builder()
                    .category(CategoryData.GUESTHOUSE.getCategory())
                    .organization(OrganizationData.POUSADA_RECANTO_VERDE.getOrganization())
                    .build()
    ),

    POUSADA_RECANTO_VERDE_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.POUSADA_RECANTO_VERDE.getOrganization())
                    .build()
    ),

    POUSADA_SAO_KIZUA_GUESTHOUSE(
            OrganizationCategory.builder()
                    .category(CategoryData.GUESTHOUSE.getCategory())
                    .organization(OrganizationData.POUSADA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    GUEST_HOUSE_MIRAMAR_INN_GUESTHOUSE(
            OrganizationCategory.builder()
                    .category(CategoryData.GUESTHOUSE.getCategory())
                    .organization(OrganizationData.GUEST_HOUSE_MIRAMAR_INN.getOrganization())
                    .build()
    ),

    GUEST_HOUSE_MIRAMAR_INN_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.GUEST_HOUSE_MIRAMAR_INN.getOrganization())
                    .build()
    ),

    HOSPEDARIA_PROGRESSO_ACCOMMODATION(
            OrganizationCategory.builder()
                    .category(CategoryData.ACCOMMODATION.getCategory())
                    .organization(OrganizationData.HOSPEDARIA_PROGRESSO.getOrganization())
                    .build()
    ),

    HOSPEDARIA_KWANZA_ACCOMMODATION(
            OrganizationCategory.builder()
                    .category(CategoryData.ACCOMMODATION.getCategory())
                    .organization(OrganizationData.HOSPEDARIA_KWANZA.getOrganization())
                    .build()
    ),

    HOSPEDARIA_KWANZA_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.HOSPEDARIA_KWANZA.getOrganization())
                    .build()
    ),

    HOSPEDARIA_KATANGA_ACCOMMODATION(
            OrganizationCategory.builder()
                    .category(CategoryData.ACCOMMODATION.getCategory())
                    .organization(OrganizationData.HOSPEDARIA_KATANGA.getOrganization())
                    .build()
    ),

    HOSPEDARIA_NOVA_VIDA_ACCOMMODATION(
            OrganizationCategory.builder()
                    .category(CategoryData.ACCOMMODATION.getCategory())
                    .organization(OrganizationData.HOSPEDARIA_NOVA_VIDA.getOrganization())
                    .build()
    ),

    HOSPEDARIA_NOVA_VIDA_BAKERY(
            OrganizationCategory.builder()
                    .category(CategoryData.BAKERY.getCategory())
                    .organization(OrganizationData.HOSPEDARIA_NOVA_VIDA.getOrganization())
                    .build()
    ),

    HOSPEDARIA_SAO_KIZUA_ACCOMMODATION(
            OrganizationCategory.builder()
                    .category(CategoryData.ACCOMMODATION.getCategory())
                    .organization(OrganizationData.HOSPEDARIA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    HOSPEDARIA_SAO_KIZUA_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.HOSPEDARIA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    RESTAURANTE_O_MUSQUETE_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.RESTAURANTE_O_MUSQUETE.getOrganization())
                    .build()
    ),

    RESTAURANTE_O_MUSQUETE_TRADITIONAL_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.TRADITIONAL_FOOD.getCategory())
                    .organization(OrganizationData.RESTAURANTE_O_MUSQUETE.getOrganization())
                    .build()
    ),

    RESTAURANTE_MAR_E_TERRA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .build()
    ),

    RESTAURANTE_MAR_E_TERRA_SEAFOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.SEAFOOD.getCategory())
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .build()
    ),

    RESTAURANTE_KWANZA_LIVING_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.RESTAURANTE_KWANZA_LIVING.getOrganization())
                    .build()
    ),

    RESTAURANTE_KWANZA_LIVING_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.RESTAURANTE_KWANZA_LIVING.getOrganization())
                    .build()
    ),

    RESTAURANTE_SABOR_ANGOLANO_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.RESTAURANTE_SABOR_ANGOLANO.getOrganization())
                    .build()
    ),

    RESTAURANTE_SABOR_ANGOLANO_TRADITIONAL_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.TRADITIONAL_FOOD.getCategory())
                    .organization(OrganizationData.RESTAURANTE_SABOR_ANGOLANO.getOrganization())
                    .build()
    ),

    RESTAURANTE_TALATONA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.RESTAURANTE_TALATONA.getOrganization())
                    .build()
    ),

    RESTAURANTE_TALATONA_VEGETARIAN(
            OrganizationCategory.builder()
                    .category(CategoryData.VEGETARIAN.getCategory())
                    .organization(OrganizationData.RESTAURANTE_TALATONA.getOrganization())
                    .build()
    ),

    CANTINHO_DA_MAE_ANGOLA_TRADITIONAL_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.TRADITIONAL_FOOD.getCategory())
                    .organization(OrganizationData.CANTINHO_DA_MAE_ANGOLA.getOrganization())
                    .build()
    ),

    SABORES_DA_NOSSA_TERRA_TRADITIONAL_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.TRADITIONAL_FOOD.getCategory())
                    .organization(OrganizationData.SABORES_DA_NOSSA_TERRA.getOrganization())
                    .build()
    ),

    TASCA_DO_MUAMBA_TRADITIONAL_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.TRADITIONAL_FOOD.getCategory())
                    .organization(OrganizationData.TASCA_DO_MUAMBA.getOrganization())
                    .build()
    ),

    TASCA_DO_MUAMBA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.TASCA_DO_MUAMBA.getOrganization())
                    .build()
    ),

    COZINHA_DO_KILAMBA_TRADITIONAL_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.TRADITIONAL_FOOD.getCategory())
                    .organization(OrganizationData.COZINHA_DO_KILAMBA.getOrganization())
                    .build()
    ),

    COZINHA_DO_KILAMBA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.COZINHA_DO_KILAMBA.getOrganization())
                    .build()
    ),

    SOLAR_DO_KWANZA_TRADITIONAL_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.TRADITIONAL_FOOD.getCategory())
                    .organization(OrganizationData.SOLAR_DO_KWANZA.getOrganization())
                    .build()
    ),

    SOLAR_DO_KWANZA_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.SOLAR_DO_KWANZA.getOrganization())
                    .build()
    ),

    PIZZERIA_NAPOLI_LUANDA_PIZZERIA(
            OrganizationCategory.builder()
                    .category(CategoryData.PIZZERIA.getCategory())
                    .organization(OrganizationData.PIZZERIA_NAPOLI_LUANDA.getOrganization())
                    .build()
    ),

    PIZZERIA_FORNO_ANGOLA_PIZZERIA(
            OrganizationCategory.builder()
                    .category(CategoryData.PIZZERIA.getCategory())
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .build()
    ),

    PIZZERIA_FORNO_ANGOLA_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .build()
    ),

    PIZZERIA_MSLICE_PIZZERIA(
            OrganizationCategory.builder()
                    .category(CategoryData.PIZZERIA.getCategory())
                    .organization(OrganizationData.PIZZERIA_MSLICE.getOrganization())
                    .build()
    ),

    PIZZERIA_MANGUERINHA_PIZZERIA(
            OrganizationCategory.builder()
                    .category(CategoryData.PIZZERIA.getCategory())
                    .organization(OrganizationData.PIZZERIA_MANGUERINHA.getOrganization())
                    .build()
    ),

    PIZZERIA_MANGUERINHA_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.PIZZERIA_MANGUERINHA.getOrganization())
                    .build()
    ),

    PIZZERIA_BELLA_VISTA_PIZZERIA(
            OrganizationCategory.builder()
                    .category(CategoryData.PIZZERIA.getCategory())
                    .organization(OrganizationData.PIZZERIA_BELLA_VISTA.getOrganization())
                    .build()
    ),

    SNACK_BAR_O_PONTO_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.SNACK_BAR_O_PONTO.getOrganization())
                    .build()
    ),

    BURGER_STATION_LUANDA_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.BURGER_STATION_LUANDA.getOrganization())
                    .build()
    ),

    FAST_FOOD_KWANZA_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.FAST_FOOD_KWANZA.getOrganization())
                    .build()
    ),

    FAST_FOOD_KWANZA_BAKERY(
            OrganizationCategory.builder()
                    .category(CategoryData.BAKERY.getCategory())
                    .organization(OrganizationData.FAST_FOOD_KWANZA.getOrganization())
                    .build()
    ),

    LANCHES_DO_MIRAMAR_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.LANCHES_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    LANCHES_DO_MIRAMAR_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.LANCHES_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    FOOD_TRUCK_TAXI_AZUL_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.FOOD_TRUCK_TAXI_AZUL.getOrganization())
                    .build()
    ),

    CHURRASQUEIRA_DO_ZE_GRILL(
            OrganizationCategory.builder()
                    .category(CategoryData.GRILL.getCategory())
                    .organization(OrganizationData.CHURRASQUEIRA_DO_ZE.getOrganization())
                    .build()
    ),

    CHURRASQUEIRA_DO_ZE_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.CHURRASQUEIRA_DO_ZE.getOrganization())
                    .build()
    ),

    GRELHADOS_MIUDOS_KIZUA_GRILL(
            OrganizationCategory.builder()
                    .category(CategoryData.GRILL.getCategory())
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .build()
    ),

    GRELHADOS_MIUDOS_KIZUA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .build()
    ),

    ESPETOS_DA_BAIA_GRILL(
            OrganizationCategory.builder()
                    .category(CategoryData.GRILL.getCategory())
                    .organization(OrganizationData.ESPETOS_DA_BAIA.getOrganization())
                    .build()
    ),

    ESPETOS_DA_BAIA_SEAFOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.SEAFOOD.getCategory())
                    .organization(OrganizationData.ESPETOS_DA_BAIA.getOrganization())
                    .build()
    ),

    ESPETOS_DA_BAIA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.ESPETOS_DA_BAIA.getOrganization())
                    .build()
    ),

    CHURRASCO_KING_GRILL(
            OrganizationCategory.builder()
                    .category(CategoryData.GRILL.getCategory())
                    .organization(OrganizationData.CHURRASCO_KING.getOrganization())
                    .build()
    ),

    CHURRASCO_KING_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.CHURRASCO_KING.getOrganization())
                    .build()
    ),

    GRELHADO_DA_CASA_GRILL(
            OrganizationCategory.builder()
                    .category(CategoryData.GRILL.getCategory())
                    .organization(OrganizationData.GRELHADO_DA_CASA.getOrganization())
                    .build()
    ),

    GRELHADO_DA_CASA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.GRELHADO_DA_CASA.getOrganization())
                    .build()
    ),

    MARISQUEIRA_BAIA_DE_LUANDA_SEAFOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.SEAFOOD.getCategory())
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    MARISQUEIRA_BAIA_DE_LUANDA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    MARISQUEIRA_DO_PORTO_SEAFOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.SEAFOOD.getCategory())
                    .organization(OrganizationData.MARISQUEIRA_DO_PORTO.getOrganization())
                    .build()
    ),

    MARISQUEIRA_DO_PORTO_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.MARISQUEIRA_DO_PORTO.getOrganization())
                    .build()
    ),

    MARISQUEIRA_KILAMBA_SEAFOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.SEAFOOD.getCategory())
                    .organization(OrganizationData.MARISQUEIRA_KILAMBA.getOrganization())
                    .build()
    ),

    MARISQUEIRA_KILAMBA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.MARISQUEIRA_KILAMBA.getOrganization())
                    .build()
    ),

    MARISQUEIRA_DE_BENGUELA_SEAFOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.SEAFOOD.getCategory())
                    .organization(OrganizationData.MARISQUEIRA_DE_BENGUELA.getOrganization())
                    .build()
    ),

    MARISQUEIRA_DE_BENGUELA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.MARISQUEIRA_DE_BENGUELA.getOrganization())
                    .build()
    ),

    MARISQUEIRA_DO_NAMIBE_SEAFOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.SEAFOOD.getCategory())
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .build()
    ),

    MARISQUEIRA_DO_NAMIBE_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .build()
    ),

    MARISQUEIRA_DO_NAMIBE_GRILL(
            OrganizationCategory.builder()
                    .category(CategoryData.GRILL.getCategory())
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .build()
    ),

    SUSHI_KIZUA_SUSHI(
            OrganizationCategory.builder()
                    .category(CategoryData.SUSHI.getCategory())
                    .organization(OrganizationData.SUSHI_KIZUA.getOrganization())
                    .build()
    ),

    SUSHI_KIZUA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.SUSHI_KIZUA.getOrganization())
                    .build()
    ),

    SUSHI_BOM_DIA_SUSHI(
            OrganizationCategory.builder()
                    .category(CategoryData.SUSHI.getCategory())
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .build()
    ),

    SUSHI_BOM_DIA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .build()
    ),

    SUSHI_BOM_DIA_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .build()
    ),

    SUSHI_TOKYO_LUANDA_SUSHI(
            OrganizationCategory.builder()
                    .category(CategoryData.SUSHI.getCategory())
                    .organization(OrganizationData.SUSHI_TOKYO_LUANDA.getOrganization())
                    .build()
    ),

    SUSHI_TOKYO_LUANDA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.SUSHI_TOKYO_LUANDA.getOrganization())
                    .build()
    ),

    SUSHI_SAKURA_SUSHI(
            OrganizationCategory.builder()
                    .category(CategoryData.SUSHI.getCategory())
                    .organization(OrganizationData.SUSHI_SAKURA.getOrganization())
                    .build()
    ),

    SUSHI_SAKURA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.SUSHI_SAKURA.getOrganization())
                    .build()
    ),

    SUSHI_MANGA_SUSHI(
            OrganizationCategory.builder()
                    .category(CategoryData.SUSHI.getCategory())
                    .organization(OrganizationData.SUSHI_MANGA.getOrganization())
                    .build()
    ),

    SUSHI_MANGA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.SUSHI_MANGA.getOrganization())
                    .build()
    ),

    CAFE_KWANZA_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .build()
    ),

    CAFE_KWANZA_BAKERY(
            OrganizationCategory.builder()
                    .category(CategoryData.BAKERY.getCategory())
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .build()
    ),

    CAFE_BOSSA_NOVA_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.CAFE_BOSSA_NOVA.getOrganization())
                    .build()
    ),

    CAFE_BOSSA_NOVA_BAKERY(
            OrganizationCategory.builder()
                    .category(CategoryData.BAKERY.getCategory())
                    .organization(OrganizationData.CAFE_BOSSA_NOVA.getOrganization())
                    .build()
    ),

    CAFE_DO_MIRAMAR_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.CAFE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    CAFE_DO_MIRAMAR_BAKERY(
            OrganizationCategory.builder()
                    .category(CategoryData.BAKERY.getCategory())
                    .organization(OrganizationData.CAFE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    CAFE_PAO_QUENTE_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.CAFE_PAO_QUENTE.getOrganization())
                    .build()
    ),

    CAFE_PAO_QUENTE_BAKERY(
            OrganizationCategory.builder()
                    .category(CategoryData.BAKERY.getCategory())
                    .organization(OrganizationData.CAFE_PAO_QUENTE.getOrganization())
                    .build()
    ),

    CAFE_PAO_QUENTE_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.CAFE_PAO_QUENTE.getOrganization())
                    .build()
    ),

    COFFEE_STOP_ANGOLA_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.COFFEE_STOP_ANGOLA.getOrganization())
                    .build()
    ),

    COFFEE_STOP_ANGOLA_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.COFFEE_STOP_ANGOLA.getOrganization())
                    .build()
    ),

    BAR_222_BAR(
            OrganizationCategory.builder()
                    .category(CategoryData.BAR.getCategory())
                    .organization(OrganizationData.BAR_222.getOrganization())
                    .build()
    ),

    BAR_222_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.BAR_222.getOrganization())
                    .build()
    ),

    BAR_TROPICAL_BAR(
            OrganizationCategory.builder()
                    .category(CategoryData.BAR.getCategory())
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .build()
    ),

    BAR_TROPICAL_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .build()
    ),

    BAR_DO_KIZUA_BAR(
            OrganizationCategory.builder()
                    .category(CategoryData.BAR.getCategory())
                    .organization(OrganizationData.BAR_DO_KIZUA.getOrganization())
                    .build()
    ),

    BAR_DO_KIZUA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.BAR_DO_KIZUA.getOrganization())
                    .build()
    ),

    PUB_KILAMBA_BAR(
            OrganizationCategory.builder()
                    .category(CategoryData.BAR.getCategory())
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .build()
    ),

    PUB_KILAMBA_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .build()
    ),

    PUB_KILAMBA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .build()
    ),

    BAR_ESQUINA_DO_MIRAMAR_BAR(
            OrganizationCategory.builder()
                    .category(CategoryData.BAR.getCategory())
                    .organization(OrganizationData.BAR_ESQUINA_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    BAR_ESQUINA_DO_MIRAMAR_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.BAR_ESQUINA_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    SELF_SERVICE_KWANZA_SELF_SERVICE(
            OrganizationCategory.builder()
                    .category(CategoryData.SELF_SERVICE.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .build()
    ),

    SELF_SERVICE_KWANZA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .build()
    ),

    SELF_SERVICE_KWANZA_TRADITIONAL_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.TRADITIONAL_FOOD.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .build()
    ),

    SELF_SERVICE_DO_ZE_SELF_SERVICE(
            OrganizationCategory.builder()
                    .category(CategoryData.SELF_SERVICE.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_DO_ZE.getOrganization())
                    .build()
    ),

    SELF_SERVICE_DO_ZE_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_DO_ZE.getOrganization())
                    .build()
    ),

    SELF_SERVICE_KILAMBA_SELF_SERVICE(
            OrganizationCategory.builder()
                    .category(CategoryData.SELF_SERVICE.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .build()
    ),

    SELF_SERVICE_KILAMBA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .build()
    ),

    SELF_SERVICE_KILAMBA_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .build()
    ),

    SELF_SERVICE_CENTRAL_SELF_SERVICE(
            OrganizationCategory.builder()
                    .category(CategoryData.SELF_SERVICE.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_CENTRAL.getOrganization())
                    .build()
    ),

    SELF_SERVICE_CENTRAL_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_CENTRAL.getOrganization())
                    .build()
    ),

    SELF_SERVICE_DO_MIRAMAR_SELF_SERVICE(
            OrganizationCategory.builder()
                    .category(CategoryData.SELF_SERVICE.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    SELF_SERVICE_DO_MIRAMAR_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.SELF_SERVICE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    RESTAURANTE_VEGETARIANO_RAIZES_VEGETARIAN(
            OrganizationCategory.builder()
                    .category(CategoryData.VEGETARIAN.getCategory())
                    .organization(OrganizationData.RESTAURANTE_VEGETARIANO_RAIZES.getOrganization())
                    .build()
    ),

    RESTAURANTE_VEGETARIANO_RAIZES_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.RESTAURANTE_VEGETARIANO_RAIZES.getOrganization())
                    .build()
    ),

    VEGGIE_HOUSE_LUANDA_VEGETARIAN(
            OrganizationCategory.builder()
                    .category(CategoryData.VEGETARIAN.getCategory())
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    VEGGIE_HOUSE_LUANDA_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    COZINHA_VERDE_VEGETARIAN(
            OrganizationCategory.builder()
                    .category(CategoryData.VEGETARIAN.getCategory())
                    .organization(OrganizationData.COZINHA_VERDE.getOrganization())
                    .build()
    ),

    COZINHA_VERDE_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.COZINHA_VERDE.getOrganization())
                    .build()
    ),

    COZINHA_VERDE_TRADITIONAL_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.TRADITIONAL_FOOD.getCategory())
                    .organization(OrganizationData.COZINHA_VERDE.getOrganization())
                    .build()
    ),

    BI_VEGETARIANO_VEGETARIAN(
            OrganizationCategory.builder()
                    .category(CategoryData.VEGETARIAN.getCategory())
                    .organization(OrganizationData.BI_VEGETARIANO.getOrganization())
                    .build()
    ),

    BI_VEGETARIANO_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.BI_VEGETARIANO.getOrganization())
                    .build()
    ),

    SABOR_VEGETARIANO_VEGETARIAN(
            OrganizationCategory.builder()
                    .category(CategoryData.VEGETARIAN.getCategory())
                    .organization(OrganizationData.SABOR_VEGETARIANO.getOrganization())
                    .build()
    ),

    SABOR_VEGETARIANO_RESTAURANT(
            OrganizationCategory.builder()
                    .category(CategoryData.RESTAURANT.getCategory())
                    .organization(OrganizationData.SABOR_VEGETARIANO.getOrganization())
                    .build()
    ),

    SABOR_VEGETARIANO_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.SABOR_VEGETARIANO.getOrganization())
                    .build()
    ),

    PADARIA_PAO_QUENTE_BAKERY(
            OrganizationCategory.builder()
                    .category(CategoryData.BAKERY.getCategory())
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .build()
    ),

    PADARIA_PAO_QUENTE_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .build()
    ),

    PADARIA_KWANZA_BAKERY(
            OrganizationCategory.builder()
                    .category(CategoryData.BAKERY.getCategory())
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .build()
    ),

    PADARIA_KWANZA_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .build()
    ),

    PADARIA_KWANZA_FAST_FOOD(
            OrganizationCategory.builder()
                    .category(CategoryData.FAST_FOOD.getCategory())
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .build()
    ),

    PASTELARIA_DOCE_MANJAR_BAKERY(
            OrganizationCategory.builder()
                    .category(CategoryData.BAKERY.getCategory())
                    .organization(OrganizationData.PASTELARIA_DOCE_MANJAR.getOrganization())
                    .build()
    ),

    PASTELARIA_DOCE_MANJAR_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.PASTELARIA_DOCE_MANJAR.getOrganization())
                    .build()
    ),

    PADARIA_KILAMBA_BAKERY(
            OrganizationCategory.builder()
                    .category(CategoryData.BAKERY.getCategory())
                    .organization(OrganizationData.PADARIA_KILAMBA.getOrganization())
                    .build()
    ),

    PADARIA_KILAMBA_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.PADARIA_KILAMBA.getOrganization())
                    .build()
    ),

    PADARIA_MANACA_BAKERY(
            OrganizationCategory.builder()
                    .category(CategoryData.BAKERY.getCategory())
                    .organization(OrganizationData.PADARIA_MANACA.getOrganization())
                    .build()
    ),

    PADARIA_MANACA_CAFE(
            OrganizationCategory.builder()
                    .category(CategoryData.CAFE.getCategory())
                    .organization(OrganizationData.PADARIA_MANACA.getOrganization())
                    .build()
    ),

    LINHAS_AEREAS_KWANZA_FLIGHTS(
            OrganizationCategory.builder()
                    .category(CategoryData.FLIGHTS.getCategory())
                    .organization(OrganizationData.LINHAS_AEREAS_KWANZA.getOrganization())
                    .build()
    ),

    LINHAS_AEREAS_KWANZA_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.LINHAS_AEREAS_KWANZA.getOrganization())
                    .build()
    ),

    ANGOLA_EXPRESS_AIR_FLIGHTS(
            OrganizationCategory.builder()
                    .category(CategoryData.FLIGHTS.getCategory())
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .build()
    ),

    ANGOLA_EXPRESS_AIR_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .build()
    ),

    SKY_ANGOLA_AIRLINES_FLIGHTS(
            OrganizationCategory.builder()
                    .category(CategoryData.FLIGHTS.getCategory())
                    .organization(OrganizationData.SKY_ANGOLA_AIRLINES.getOrganization())
                    .build()
    ),

    SKY_ANGOLA_AIRLINES_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.SKY_ANGOLA_AIRLINES.getOrganization())
                    .build()
    ),

    KUBINGA_AIR_FLIGHTS(
            OrganizationCategory.builder()
                    .category(CategoryData.FLIGHTS.getCategory())
                    .organization(OrganizationData.KUBINGA_AIR.getOrganization())
                    .build()
    ),

    KUBINGA_AIR_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.KUBINGA_AIR.getOrganization())
                    .build()
    ),

    ROYAL_WINGS_ANGOLA_FLIGHTS(
            OrganizationCategory.builder()
                    .category(CategoryData.FLIGHTS.getCategory())
                    .organization(OrganizationData.ROYAL_WINGS_ANGOLA.getOrganization())
                    .build()
    ),

    ROYAL_WINGS_ANGOLA_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.ROYAL_WINGS_ANGOLA.getOrganization())
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_FLIGHTS(
            OrganizationCategory.builder()
                    .category(CategoryData.FLIGHTS.getCategory())
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_TOUR_GUIDE(
            OrganizationCategory.builder()
                    .category(CategoryData.TOUR_GUIDE.getCategory())
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .build()
    ),

    AVENTURA_VIAGENS_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .build()
    ),

    AVENTURA_VIAGENS_FLIGHTS(
            OrganizationCategory.builder()
                    .category(CategoryData.FLIGHTS.getCategory())
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .build()
    ),

    AVENTURA_VIAGENS_TOUR_GUIDE(
            OrganizationCategory.builder()
                    .category(CategoryData.TOUR_GUIDE.getCategory())
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .build()
    ),

    TRAVEL_HOUSE_LUANDA_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.TRAVEL_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    TRAVEL_HOUSE_LUANDA_FLIGHTS(
            OrganizationCategory.builder()
                    .category(CategoryData.FLIGHTS.getCategory())
                    .organization(OrganizationData.TRAVEL_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    GLOBETROTTER_ANGOLA_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.GLOBETROTTER_ANGOLA.getOrganization())
                    .build()
    ),

    GLOBETROTTER_ANGOLA_TOUR_GUIDE(
            OrganizationCategory.builder()
                    .category(CategoryData.TOUR_GUIDE.getCategory())
                    .organization(OrganizationData.GLOBETROTTER_ANGOLA.getOrganization())
                    .build()
    ),

    SAFARIR_VIAGENS_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.SAFARIR_VIAGENS.getOrganization())
                    .build()
    ),

    SAFARIR_VIAGENS_TOUR_GUIDE(
            OrganizationCategory.builder()
                    .category(CategoryData.TOUR_GUIDE.getCategory())
                    .organization(OrganizationData.SAFARIR_VIAGENS.getOrganization())
                    .build()
    ),

    OPERADORA_TURISTICA_KWANZA_TOUR_GUIDE(
            OrganizationCategory.builder()
                    .category(CategoryData.TOUR_GUIDE.getCategory())
                    .organization(OrganizationData.OPERADORA_TURISTICA_KWANZA.getOrganization())
                    .build()
    ),

    OPERADORA_TURISTICA_KWANZA_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.OPERADORA_TURISTICA_KWANZA.getOrganization())
                    .build()
    ),

    AVENTURA_GUIDES_ANGOLA_TOUR_GUIDE(
            OrganizationCategory.builder()
                    .category(CategoryData.TOUR_GUIDE.getCategory())
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .build()
    ),

    AVENTURA_GUIDES_ANGOLA_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .build()
    ),

    TURISTAS_LUANDA_GUIDES_TOUR_GUIDE(
            OrganizationCategory.builder()
                    .category(CategoryData.TOUR_GUIDE.getCategory())
                    .organization(OrganizationData.TURISTAS_LUANDA_GUIDES.getOrganization())
                    .build()
    ),

    EXPEDICOES_KALANDULA_TOUR_GUIDE(
            OrganizationCategory.builder()
                    .category(CategoryData.TOUR_GUIDE.getCategory())
                    .organization(OrganizationData.EXPEDICOES_KALANDULA.getOrganization())
                    .build()
    ),

    EXPEDICOES_KALANDULA_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.EXPEDICOES_KALANDULA.getOrganization())
                    .build()
    ),

    GUIA_TOURS_MIRAMAR_TOUR_GUIDE(
            OrganizationCategory.builder()
                    .category(CategoryData.TOUR_GUIDE.getCategory())
                    .organization(OrganizationData.GUIA_TOURS_MIRAMAR.getOrganization())
                    .build()
    ),

    GUIA_TOURS_MIRAMAR_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.GUIA_TOURS_MIRAMAR.getOrganization())
                    .build()
    ),

    INTERPRETES_DE_LUANDA_INTERPRETER(
            OrganizationCategory.builder()
                    .category(CategoryData.INTERPRETER.getCategory())
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .build()
    ),

    INTERPRETES_DE_LUANDA_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .build()
    ),

    GLOBAL_VOICES_ANGOLA_INTERPRETER(
            OrganizationCategory.builder()
                    .category(CategoryData.INTERPRETER.getCategory())
                    .organization(OrganizationData.GLOBAL_VOICES_ANGOLA.getOrganization())
                    .build()
    ),

    GLOBAL_VOICES_ANGOLA_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.GLOBAL_VOICES_ANGOLA.getOrganization())
                    .build()
    ),

    TRADUCAO_E_INTERPRETE_SERVICES_INTERPRETER(
            OrganizationCategory.builder()
                    .category(CategoryData.INTERPRETER.getCategory())
                    .organization(OrganizationData.TRADUCAO_E_INTERPRETE_SERVICES.getOrganization())
                    .build()
    ),

    TRADUCAO_E_INTERPRETE_SERVICES_TRAVEL_AGENCIES(
            OrganizationCategory.builder()
                    .category(CategoryData.TRAVEL_AGENCIES.getCategory())
                    .organization(OrganizationData.TRADUCAO_E_INTERPRETE_SERVICES.getOrganization())
                    .build()
    ),

    INTERPRETE_PRO_ANGOLA_INTERPRETER(
            OrganizationCategory.builder()
                    .category(CategoryData.INTERPRETER.getCategory())
                    .organization(OrganizationData.INTERPRETE_PRO_ANGOLA.getOrganization())
                    .build()
    ),

    IDIOMAS_KWANZA_INTERPRETER(
            OrganizationCategory.builder()
                    .category(CategoryData.INTERPRETER.getCategory())
                    .organization(OrganizationData.IDIOMAS_KWANZA.getOrganization())
                    .build()
    );

    private final OrganizationCategory organizationCategory;
}
