package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.product.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum ProductData {
    EPIC_SANA_ROOM_SINGLE(
            Product.builder()
                    .name("Quarto Single Deluxe - Epic Sana")
                    .slug("quarto-single-deluxe-epic-sana")
                    .description("Quarto individual espaçoso com cama queen-size, ar condicionado, TV de ecrã plano e pequeno-almoço incluído.")
                    .image("https://images.unsplash.com/photo-1631049307264-da0ec9d70304?w=800")
                    .price(new BigDecimal("120000.00"))
                    .position(1)
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .build()
    ),
    EPIC_SANA_ROOM_SUITE(
            Product.builder()
                    .name("Suite Presidencial - Epic Sana")
                    .slug("suite-presidencial-epic-sana")
                    .description("Suite luxuosa com sala de estar independente, varanda privada com vista para a baía, jacuzzi e serviços VIP.")
                    .image("https://images.unsplash.com/photo-1578683010236-d716f9a3f461?w=800")
                    .price(new BigDecimal("450000.00"))
                    .position(2)
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .build()
    ),
    MIRAMAR_ROOM_DOUBLE(
            Product.builder()
                    .name("Quarto Casal Standard - Miramar")
                    .slug("quarto-casal-standard-miramar")
                    .description("Quarto de casal com vista para a cidade, ar condicionado e Wi-Fi gratuito.")
                    .image("https://images.unsplash.com/photo-1590490360182-c33d955f7e4d?w=800")
                    .price(new BigDecimal("45000.00"))
                    .position(1)
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .build()
    ),
    HUAMBO_ROOM_TWIN(
            Product.builder()
                    .name("Quarto Twin Simples - Huambo")
                    .slug("quarto-twin-simples-huambo")
                    .description("Quarto com duas camas individuais, ideal para estadias curtas de trabalho ou lazer.")
                    .image("https://images.unsplash.com/photo-1595576508898-0ad5c879a061?w=800")
                    .price(new BigDecimal("25000.00"))
                    .position(1)
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_BAIA_DE_LUANDA(
            Product.builder()
                    .name("Quarto Single Deluxe - Hotel Baía de Luanda")
                    .slug("quarto_single_deluxe_hotel_baia_de_luanda")
                    .description("Quarto individual com cama queen-size, ar condicionado, TV de ecrã plano e pequeno-almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/2020-09-24_21_06_04_A_bathroom_sink_and_toilet_in_a_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/1280px-thumbnail.jpg")
                    .price(new BigDecimal("55000.00"))
                    .position(1)
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_BAIA_DE_LUANDA(
            Product.builder()
                    .name("Quarto Casal Premium - Hotel Baía de Luanda")
                    .slug("quarto_casal_premium_hotel_baia_de_luanda")
                    .description("Quarto de casal com varanda privativa, roupa de cama em algodão egípcio e vista para a cidade.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/%22Calliope%22_bed_in_the_Celestial_Suites_room_of_the_Hotel_Astrodome_in_Houston%2C_Texas_LCCN2011631571.tif/lossy-page1-1280px-%22Calliope%22_bed_in_the_Celestial_Suites_room_of_the_Hotel_Astrodome_in_Houston%2C_Texas_LCCN2011631571.tif.jpg")
                    .price(new BigDecimal("78000.00"))
                    .position(2)
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_BAIA_DE_LUANDA(
            Product.builder()
                    .name("Suite Familiar - Hotel Baía de Luanda")
                    .slug("suite_familiar_hotel_baia_de_luanda")
                    .description("Suite com sala de estar, dois quartos comunicantes e serviço de quarto incluído para a família.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Canopy_bed_of_Amantaka_Suite_in_Amantaka_luxury_Resort_%26_Hotel_in_Luang_Prabang_Laos_5x4.jpg/1280px-Canopy_bed_of_Amantaka_Suite_in_Amantaka_luxury_Resort_%26_Hotel_in_Luang_Prabang_Laos_5x4.jpg")
                    .price(new BigDecimal("145000.00"))
                    .position(3)
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_BAIA_DE_LUANDA(
            Product.builder()
                    .name("Quarto Twin Executivo - Hotel Baía de Luanda")
                    .slug("quarto_twin_executivo_hotel_baia_de_luanda")
                    .description("Quarto com duas camas individuais, mesa de trabalho e acesso ao centro de negócios do hotel.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Accessible_room_at_Hotel_Spenerhaus_%283227740249%29.jpg/1280px-Accessible_room_at_Hotel_Spenerhaus_%283227740249%29.jpg")
                    .price(new BigDecimal("92000.00"))
                    .position(4)
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_BAIA_DE_LUANDA(
            Product.builder()
                    .name("Apartamento T1 Executivo - Hotel Baía de Luanda")
                    .slug("apartamento_t1_executivo_hotel_baia_de_luanda")
                    .description("Apartamento com cozinha equipada, sala e um quarto, ideal para estadias de trabalho prolongadas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Apartment_hotel_Nice.jpg/1280px-Apartment_hotel_Nice.jpg")
                    .price(new BigDecimal("120000.00"))
                    .position(5)
                    .organization(OrganizationData.HOTEL_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_MILANO_RESORT_SPA(
            Product.builder()
                    .name("Quarto Single Deluxe - Hotel Milano Resort & Spa")
                    .slug("quarto_single_deluxe_hotel_milano_resort_spa")
                    .description("Quarto individual com cama queen-size, ar condicionado, TV de ecrã plano e pequeno-almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/2020-09-24_21_06_58_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/1280px-2020-09-24_21_06_58_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg")
                    .price(new BigDecimal("55500.00"))
                    .position(1)
                    .organization(OrganizationData.HOTEL_MILANO_RESORT_SPA.getOrganization())
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_MILANO_RESORT_SPA(
            Product.builder()
                    .name("Quarto Casal Premium - Hotel Milano Resort & Spa")
                    .slug("quarto_casal_premium_hotel_milano_resort_spa")
                    .description("Quarto de casal com varanda privativa, roupa de cama em algodão egípcio e vista para a cidade.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Bed_in_hotel_room.jpg/1280px-Bed_in_hotel_room.jpg")
                    .price(new BigDecimal("78500.00"))
                    .position(2)
                    .organization(OrganizationData.HOTEL_MILANO_RESORT_SPA.getOrganization())
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_MILANO_RESORT_SPA(
            Product.builder()
                    .name("Suite Familiar - Hotel Milano Resort & Spa")
                    .slug("suite_familiar_hotel_milano_resort_spa")
                    .description("Suite com sala de estar, dois quartos comunicantes e serviço de quarto incluído para a família.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Casanova_Suite_Living_Room.jpg/1280px-Casanova_Suite_Living_Room.jpg")
                    .price(new BigDecimal("145500.00"))
                    .position(3)
                    .organization(OrganizationData.HOTEL_MILANO_RESORT_SPA.getOrganization())
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_MILANO_RESORT_SPA(
            Product.builder()
                    .name("Quarto Twin Executivo - Hotel Milano Resort & Spa")
                    .slug("quarto_twin_executivo_hotel_milano_resort_spa")
                    .description("Quarto com duas camas individuais, mesa de trabalho e acesso ao centro de negócios do hotel.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/At_Morocco_2023_32.jpg/1280px-At_Morocco_2023_32.jpg")
                    .price(new BigDecimal("92500.00"))
                    .position(4)
                    .organization(OrganizationData.HOTEL_MILANO_RESORT_SPA.getOrganization())
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_MILANO_RESORT_SPA(
            Product.builder()
                    .name("Apartamento T1 Executivo - Hotel Milano Resort & Spa")
                    .slug("apartamento_t1_executivo_hotel_milano_resort_spa")
                    .description("Apartamento com cozinha equipada, sala e um quarto, ideal para estadias de trabalho prolongadas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Broadview_Hotel_Douglas_Co_NE_west_facade.jpg/1280px-Broadview_Hotel_Douglas_Co_NE_west_facade.jpg")
                    .price(new BigDecimal("120500.00"))
                    .position(5)
                    .organization(OrganizationData.HOTEL_MILANO_RESORT_SPA.getOrganization())
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_KALANDULA_PALACE(
            Product.builder()
                    .name("Quarto Single Deluxe - Hotel Kalandula Palace")
                    .slug("quarto_single_deluxe_hotel_kalandula_palace")
                    .description("Quarto individual com cama queen-size, ar condicionado, TV de ecrã plano e pequeno-almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/2020-09-24_21_07_09_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/1280px-2020-09-24_21_07_09_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg")
                    .price(new BigDecimal("56000.00"))
                    .position(1)
                    .organization(OrganizationData.HOTEL_KALANDULA_PALACE.getOrganization())
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_KALANDULA_PALACE(
            Product.builder()
                    .name("Quarto Casal Premium - Hotel Kalandula Palace")
                    .slug("quarto_casal_premium_hotel_kalandula_palace")
                    .description("Quarto de casal com varanda privativa, roupa de cama em algodão egípcio e vista para a cidade.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Bed_in_hotel_room_2.jpg/1280px-Bed_in_hotel_room_2.jpg")
                    .price(new BigDecimal("79000.00"))
                    .position(2)
                    .organization(OrganizationData.HOTEL_KALANDULA_PALACE.getOrganization())
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_KALANDULA_PALACE(
            Product.builder()
                    .name("Suite Familiar - Hotel Kalandula Palace")
                    .slug("suite_familiar_hotel_kalandula_palace")
                    .description("Suite com sala de estar, dois quartos comunicantes e serviço de quarto incluído para a família.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Deluxe_Suite_Living_Room_%285547319695%29.jpg/1280px-Deluxe_Suite_Living_Room_%285547319695%29.jpg")
                    .price(new BigDecimal("146000.00"))
                    .position(3)
                    .organization(OrganizationData.HOTEL_KALANDULA_PALACE.getOrganization())
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_KALANDULA_PALACE(
            Product.builder()
                    .name("Quarto Twin Executivo - Hotel Kalandula Palace")
                    .slug("quarto_twin_executivo_hotel_kalandula_palace")
                    .description("Quarto com duas camas individuais, mesa de trabalho e acesso ao centro de negócios do hotel.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Comfort_Twin_Room_in_Triple_Configuration_%2821917602991%29.jpg/1280px-Comfort_Twin_Room_in_Triple_Configuration_%2821917602991%29.jpg")
                    .price(new BigDecimal("93000.00"))
                    .position(4)
                    .organization(OrganizationData.HOTEL_KALANDULA_PALACE.getOrganization())
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_KALANDULA_PALACE(
            Product.builder()
                    .name("Apartamento T1 Executivo - Hotel Kalandula Palace")
                    .slug("apartamento_t1_executivo_hotel_kalandula_palace")
                    .description("Apartamento com cozinha equipada, sala e um quarto, ideal para estadias de trabalho prolongadas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Holiday_Villa.jpg/1280px-Holiday_Villa.jpg")
                    .price(new BigDecimal("121000.00"))
                    .position(5)
                    .organization(OrganizationData.HOTEL_KALANDULA_PALACE.getOrganization())
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_MIRAMAR_BUSINESS_HOTEL(
            Product.builder()
                    .name("Quarto Single Deluxe - Miramar Business Hotel")
                    .slug("quarto_single_deluxe_miramar_business_hotel")
                    .description("Quarto individual com cama queen-size, ar condicionado, TV de ecrã plano e pequeno-almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/2020-09-24_21_07_24_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/1280px-2020-09-24_21_07_24_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg")
                    .price(new BigDecimal("56500.00"))
                    .position(1)
                    .organization(OrganizationData.MIRAMAR_BUSINESS_HOTEL.getOrganization())
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_MIRAMAR_BUSINESS_HOTEL(
            Product.builder()
                    .name("Quarto Casal Premium - Miramar Business Hotel")
                    .slug("quarto_casal_premium_miramar_business_hotel")
                    .description("Quarto de casal com varanda privativa, roupa de cama em algodão egípcio e vista para a cidade.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Bed_in_hotel_room_3.jpg/1280px-Bed_in_hotel_room_3.jpg")
                    .price(new BigDecimal("79500.00"))
                    .position(2)
                    .organization(OrganizationData.MIRAMAR_BUSINESS_HOTEL.getOrganization())
                    .build()
    ),

    SUITE_FAMILIAR_MIRAMAR_BUSINESS_HOTEL(
            Product.builder()
                    .name("Suite Familiar - Miramar Business Hotel")
                    .slug("suite_familiar_miramar_business_hotel")
                    .description("Suite com sala de estar, dois quartos comunicantes e serviço de quarto incluído para a família.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Deluxe_Suite_Living_Room_%285547902622%29.jpg/1280px-Deluxe_Suite_Living_Room_%285547902622%29.jpg")
                    .price(new BigDecimal("146500.00"))
                    .position(3)
                    .organization(OrganizationData.MIRAMAR_BUSINESS_HOTEL.getOrganization())
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL(
            Product.builder()
                    .name("Quarto Twin Executivo - Miramar Business Hotel")
                    .slug("quarto_twin_executivo_miramar_business_hotel")
                    .description("Quarto com duas camas individuais, mesa de trabalho e acesso ao centro de negócios do hotel.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Deluxe_Room_-_Twin_beds.jpg/1280px-Deluxe_Room_-_Twin_beds.jpg")
                    .price(new BigDecimal("93500.00"))
                    .position(4)
                    .organization(OrganizationData.MIRAMAR_BUSINESS_HOTEL.getOrganization())
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL(
            Product.builder()
                    .name("Apartamento T1 Executivo - Miramar Business Hotel")
                    .slug("apartamento_t1_executivo_miramar_business_hotel")
                    .description("Apartamento com cozinha equipada, sala e um quarto, ideal para estadias de trabalho prolongadas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Holiday_Villa_-_panoramio.jpg/1280px-Holiday_Villa_-_panoramio.jpg")
                    .price(new BigDecimal("121500.00"))
                    .position(5)
                    .organization(OrganizationData.MIRAMAR_BUSINESS_HOTEL.getOrganization())
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_CASCADE_CITY(
            Product.builder()
                    .name("Quarto Single Deluxe - Hotel Cascade City")
                    .slug("quarto_single_deluxe_hotel_cascade_city")
                    .description("Quarto individual com cama queen-size, ar condicionado, TV de ecrã plano e pequeno-almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Hotel_Porto_Santa_Maria%2C_Funchal%2C_Madeira.jpg/1280px-Hotel_Porto_Santa_Maria%2C_Funchal%2C_Madeira.jpg")
                    .price(new BigDecimal("57000.00"))
                    .position(1)
                    .organization(OrganizationData.HOTEL_CASCADE_CITY.getOrganization())
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_CASCADE_CITY(
            Product.builder()
                    .name("Quarto Casal Premium - Hotel Cascade City")
                    .slug("quarto_casal_premium_hotel_cascade_city")
                    .description("Quarto de casal com varanda privativa, roupa de cama em algodão egípcio e vista para a cidade.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Bed_in_hotel_room_4.jpg/1280px-Bed_in_hotel_room_4.jpg")
                    .price(new BigDecimal("80000.00"))
                    .position(2)
                    .organization(OrganizationData.HOTEL_CASCADE_CITY.getOrganization())
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_CASCADE_CITY(
            Product.builder()
                    .name("Suite Familiar - Hotel Cascade City")
                    .slug("suite_familiar_hotel_cascade_city")
                    .description("Suite com sala de estar, dois quartos comunicantes e serviço de quarto incluído para a família.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242119363%29.jpg/1280px-Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242119363%29.jpg")
                    .price(new BigDecimal("147000.00"))
                    .position(3)
                    .organization(OrganizationData.HOTEL_CASCADE_CITY.getOrganization())
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_CASCADE_CITY(
            Product.builder()
                    .name("Quarto Twin Executivo - Hotel Cascade City")
                    .slug("quarto_twin_executivo_hotel_cascade_city")
                    .description("Quarto com duas camas individuais, mesa de trabalho e acesso ao centro de negócios do hotel.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Forest_Of_Hope_Guest_House.jpg/1280px-Forest_Of_Hope_Guest_House.jpg")
                    .price(new BigDecimal("94000.00"))
                    .position(4)
                    .organization(OrganizationData.HOTEL_CASCADE_CITY.getOrganization())
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_CASCADE_CITY(
            Product.builder()
                    .name("Apartamento T1 Executivo - Hotel Cascade City")
                    .slug("apartamento_t1_executivo_hotel_cascade_city")
                    .description("Apartamento com cozinha equipada, sala e um quarto, ideal para estadias de trabalho prolongadas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Holiday_villa_in_Partina_-_panoramio.jpg/1280px-Holiday_villa_in_Partina_-_panoramio.jpg")
                    .price(new BigDecimal("122000.00"))
                    .position(5)
                    .organization(OrganizationData.HOTEL_CASCADE_CITY.getOrganization())
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_VILA_HARMONY(
            Product.builder()
                    .name("Quarto Standard - Pousada Vila Harmony")
                    .slug("quarto_standard_pousada_vila_harmony")
                    .description("Quarto simples com cama de casal, chuveiro quente, Wi-Fi gratuito e parque fechado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/American_homes_and_gardens_%281912%29_%2818128355536%29.jpg/1280px-American_homes_and_gardens_%281912%29_%2818128355536%29.jpg")
                    .price(new BigDecimal("28000.00"))
                    .position(1)
                    .organization(OrganizationData.POUSADA_VILA_HARMONY.getOrganization())
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_VILA_HARMONY(
            Product.builder()
                    .name("Quarto Familiar - Pousada Vila Harmony")
                    .slug("quarto_familiar_pousada_vila_harmony")
                    .description("Quarto amplo para três pessoas com cama adicional, berço disponível e pequeno-almoço caseiro.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/April_1967_OWNER%27S_BEDROOM_FROM_SOUTHWEST_-_Mar-a-Lago%2C_1100_South_Ocean_Boulevard%2C_Palm_Beach%2C_Palm_Beach_County%2C_FL_HABS_FLA%2C50-PALM%2C1-76.tif/lossy-page1-1280px-April_1967_OWNER%27S_BEDROOM_FROM_SOUTHWEST_-_Mar-a-Lago%2C_1100_South_Ocean_Boulevard%2C_Palm_Beach%2C_Palm_Beach_County%2C_FL_HABS_FLA%2C50-PALM%2C1-76.tif.jpg")
                    .price(new BigDecimal("42000.00"))
                    .position(2)
                    .organization(OrganizationData.POUSADA_VILA_HARMONY.getOrganization())
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_VILA_HARMONY(
            Product.builder()
                    .name("Quarto com Varanda - Pousada Vila Harmony")
                    .slug("quarto_com_varanda_pousada_vila_harmony")
                    .description("Quarto com varanda privativa virada para o interior do bairro e pequeno-almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/11_suiteon7th.jpg/1280px-11_suiteon7th.jpg")
                    .price(new BigDecimal("38000.00"))
                    .position(3)
                    .organization(OrganizationData.POUSADA_VILA_HARMONY.getOrganization())
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_VILA_HARMONY(
            Product.builder()
                    .name("Quarto Económico - Pousada Vila Harmony")
                    .slug("quarto_economico_pousada_vila_harmony")
                    .description("Opção económica com cama individual, mesa de estudo e serviços básicos incluídos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Belfast_Ibis_Hotel_-_Castle_Street_%285688450028%29.jpg/1280px-Belfast_Ibis_Hotel_-_Castle_Street_%285688450028%29.jpg")
                    .price(new BigDecimal("22000.00"))
                    .position(4)
                    .organization(OrganizationData.POUSADA_VILA_HARMONY.getOrganization())
                    .build()
    ),

    QUARTO_TWIN_POUSADA_VILA_HARMONY(
            Product.builder()
                    .name("Quarto Twin - Pousada Vila Harmony")
                    .slug("quarto_twin_pousada_vila_harmony")
                    .description("Quarto com duas camas individuais ideal para colegas em deslocação de serviço.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Ardtornish_House_-_interior%2C_view_of_billiard_room_flat_twin_bedroom.jpg/1280px-Ardtornish_House_-_interior%2C_view_of_billiard_room_flat_twin_bedroom.jpg")
                    .price(new BigDecimal("32000.00"))
                    .position(5)
                    .organization(OrganizationData.POUSADA_VILA_HARMONY.getOrganization())
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_BAIA_AZUL(
            Product.builder()
                    .name("Quarto Standard - Pousada Baía Azul")
                    .slug("quarto_standard_pousada_baia_azul")
                    .description("Quarto simples com cama de casal, chuveiro quente, Wi-Fi gratuito e parque fechado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Beauty_in_simplicity_-_Flickr_-_Ryan_Vaarsi.jpg/1280px-Beauty_in_simplicity_-_Flickr_-_Ryan_Vaarsi.jpg")
                    .price(new BigDecimal("28500.00"))
                    .position(1)
                    .organization(OrganizationData.POUSADA_BAIA_AZUL.getOrganization())
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_BAIA_AZUL(
            Product.builder()
                    .name("Quarto Familiar - Pousada Baía Azul")
                    .slug("quarto_familiar_pousada_baia_azul")
                    .description("Quarto amplo para três pessoas com cama adicional, berço disponível e pequeno-almoço caseiro.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Bridal_Tea_House_Hotel_-_Classic_Family_Room.jpg/1280px-Bridal_Tea_House_Hotel_-_Classic_Family_Room.jpg")
                    .price(new BigDecimal("42500.00"))
                    .position(2)
                    .organization(OrganizationData.POUSADA_BAIA_AZUL.getOrganization())
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_BAIA_AZUL(
            Product.builder()
                    .name("Quarto com Varanda - Pousada Baía Azul")
                    .slug("quarto_com_varanda_pousada_baia_azul")
                    .description("Quarto com varanda privativa virada para o interior do bairro e pequeno-almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Corner_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/1280px-Corner_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .price(new BigDecimal("38500.00"))
                    .position(3)
                    .organization(OrganizationData.POUSADA_BAIA_AZUL.getOrganization())
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_BAIA_AZUL(
            Product.builder()
                    .name("Quarto Económico - Pousada Baía Azul")
                    .slug("quarto_economico_pousada_baia_azul")
                    .description("Opção económica com cama individual, mesa de estudo e serviços básicos incluídos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Dining_Room_Fireplace%2C_The_Lodge_at_Bryce_Canyon%2C_Bryce_Canyon_National_Park%2C_Bryce_Canyon_City%2C_UT.jpg/1280px-Dining_Room_Fireplace%2C_The_Lodge_at_Bryce_Canyon%2C_Bryce_Canyon_National_Park%2C_Bryce_Canyon_City%2C_UT.jpg")
                    .price(new BigDecimal("22500.00"))
                    .position(4)
                    .organization(OrganizationData.POUSADA_BAIA_AZUL.getOrganization())
                    .build()
    ),

    QUARTO_TWIN_POUSADA_BAIA_AZUL(
            Product.builder()
                    .name("Quarto Twin - Pousada Baía Azul")
                    .slug("quarto_twin_pousada_baia_azul")
                    .description("Quarto com duas camas individuais ideal para colegas em deslocação de serviço.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Building_interior_Twin_Arrows_AZ_2026-04-06_09-44-47_1.jpg/1280px-Building_interior_Twin_Arrows_AZ_2026-04-06_09-44-47_1.jpg")
                    .price(new BigDecimal("32500.00"))
                    .position(5)
                    .organization(OrganizationData.POUSADA_BAIA_AZUL.getOrganization())
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_RECANTO_VERDE(
            Product.builder()
                    .name("Quarto Standard - Pousada Recanto Verde")
                    .slug("quarto_standard_pousada_recanto_verde")
                    .description("Quarto simples com cama de casal, chuveiro quente, Wi-Fi gratuito e parque fechado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Casa_de_Le%C3%B3n_Trotsky_2.jpg/1280px-Casa_de_Le%C3%B3n_Trotsky_2.jpg")
                    .price(new BigDecimal("29000.00"))
                    .position(1)
                    .organization(OrganizationData.POUSADA_RECANTO_VERDE.getOrganization())
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_RECANTO_VERDE(
            Product.builder()
                    .name("Quarto Familiar - Pousada Recanto Verde")
                    .slug("quarto_familiar_pousada_recanto_verde")
                    .description("Quarto amplo para três pessoas com cama adicional, berço disponível e pequeno-almoço caseiro.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Bridal_Tea_House_Hotel_-_Modern_Family_Room.jpg/1280px-Bridal_Tea_House_Hotel_-_Modern_Family_Room.jpg")
                    .price(new BigDecimal("43000.00"))
                    .position(2)
                    .organization(OrganizationData.POUSADA_RECANTO_VERDE.getOrganization())
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_RECANTO_VERDE(
            Product.builder()
                    .name("Quarto com Varanda - Pousada Recanto Verde")
                    .slug("quarto_com_varanda_pousada_recanto_verde")
                    .description("Quarto com varanda privativa virada para o interior do bairro e pequeno-almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Courtyard_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/1280px-Courtyard_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .price(new BigDecimal("39000.00"))
                    .position(3)
                    .organization(OrganizationData.POUSADA_RECANTO_VERDE.getOrganization())
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_RECANTO_VERDE(
            Product.builder()
                    .name("Quarto Económico - Pousada Recanto Verde")
                    .slug("quarto_economico_pousada_recanto_verde")
                    .description("Opção económica com cama individual, mesa de estudo e serviços básicos incluídos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/E5239-Zaragoza-Si-Usted-fuma.jpg/1280px-E5239-Zaragoza-Si-Usted-fuma.jpg")
                    .price(new BigDecimal("23000.00"))
                    .position(4)
                    .organization(OrganizationData.POUSADA_RECANTO_VERDE.getOrganization())
                    .build()
    ),

    QUARTO_TWIN_POUSADA_RECANTO_VERDE(
            Product.builder()
                    .name("Quarto Twin - Pousada Recanto Verde")
                    .slug("quarto_twin_pousada_recanto_verde")
                    .description("Quarto com duas camas individuais ideal para colegas em deslocação de serviço.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Collapsing_roof_Twin_Arrows_AZ_2026-04-06_09-43-16_1.jpg/1280px-Collapsing_roof_Twin_Arrows_AZ_2026-04-06_09-43-16_1.jpg")
                    .price(new BigDecimal("33000.00"))
                    .position(5)
                    .organization(OrganizationData.POUSADA_RECANTO_VERDE.getOrganization())
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_SAO_KIZUA(
            Product.builder()
                    .name("Quarto Standard - Pousada São Kizua")
                    .slug("quarto_standard_pousada_sao_kizua")
                    .description("Quarto simples com cama de casal, chuveiro quente, Wi-Fi gratuito e parque fechado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/EFTA00002045_-_Minimalist_bedroom_with_white_walls_light_wood_flooring_and_a_simple_wooden_desk_against_a_window_with_sheer_curtains_A_woven_basket_and_a_small_rug_add_texture_and_warmth_to_the_space.jpg/1280px-EFTA00002045_-_Minimalist_bedroom_with_white_walls_light_wood_flooring_and_a_simple_wooden_desk_against_a_window_with_sheer_curtains_A_woven_basket_and_a_small_rug_add_texture_and_warmth_to_the_space.jpg")
                    .price(new BigDecimal("29500.00"))
                    .position(1)
                    .organization(OrganizationData.POUSADA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_SAO_KIZUA(
            Product.builder()
                    .name("Quarto Familiar - Pousada São Kizua")
                    .slug("quarto_familiar_pousada_sao_kizua")
                    .description("Quarto amplo para três pessoas com cama adicional, berço disponível e pequeno-almoço caseiro.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Construction_continues_on_new_Army_hotel_in_Stuttgart_%284817870469%29.jpg/1280px-Construction_continues_on_new_Army_hotel_in_Stuttgart_%284817870469%29.jpg")
                    .price(new BigDecimal("43500.00"))
                    .position(2)
                    .organization(OrganizationData.POUSADA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_SAO_KIZUA(
            Product.builder()
                    .name("Quarto com Varanda - Pousada São Kizua")
                    .slug("quarto_com_varanda_pousada_sao_kizua")
                    .description("Quarto com varanda privativa virada para o interior do bairro e pequeno-almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/EFTA00002099_-_Cozy_bedroom_with_a_white_bed_wicker_chair_piled_with_clothes_and_a_large_window_leading_to_a_balcony.jpg/1280px-EFTA00002099_-_Cozy_bedroom_with_a_white_bed_wicker_chair_piled_with_clothes_and_a_large_window_leading_to_a_balcony.jpg")
                    .price(new BigDecimal("39500.00"))
                    .position(3)
                    .organization(OrganizationData.POUSADA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_SAO_KIZUA(
            Product.builder()
                    .name("Quarto Económico - Pousada São Kizua")
                    .slug("quarto_economico_pousada_sao_kizua")
                    .description("Opção económica com cama individual, mesa de estudo e serviços básicos incluídos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Hotel_Planet_Merah_%2830514742646%29.jpg/1280px-Hotel_Planet_Merah_%2830514742646%29.jpg")
                    .price(new BigDecimal("23500.00"))
                    .position(4)
                    .organization(OrganizationData.POUSADA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    QUARTO_TWIN_POUSADA_SAO_KIZUA(
            Product.builder()
                    .name("Quarto Twin - Pousada São Kizua")
                    .slug("quarto_twin_pousada_sao_kizua")
                    .description("Quarto com duas camas individuais ideal para colegas em deslocação de serviço.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Flickr_-_ronsaunders47_-_John_Lennon%27s_%22White_Room%22.jpg/1280px-Flickr_-_ronsaunders47_-_John_Lennon%27s_%22White_Room%22.jpg")
                    .price(new BigDecimal("33500.00"))
                    .position(5)
                    .organization(OrganizationData.POUSADA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    QUARTO_STANDARD_GUEST_HOUSE_MIRAMAR_INN(
            Product.builder()
                    .name("Quarto Standard - Guest House Miramar Inn")
                    .slug("quarto_standard_guest_house_miramar_inn")
                    .description("Quarto simples com cama de casal, chuveiro quente, Wi-Fi gratuito e parque fechado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Petit_Trianon_%2823676271953%29.jpg/1280px-Petit_Trianon_%2823676271953%29.jpg")
                    .price(new BigDecimal("30000.00"))
                    .position(1)
                    .organization(OrganizationData.GUEST_HOUSE_MIRAMAR_INN.getOrganization())
                    .build()
    ),

    QUARTO_FAMILIAR_GUEST_HOUSE_MIRAMAR_INN(
            Product.builder()
                    .name("Quarto Familiar - Guest House Miramar Inn")
                    .slug("quarto_familiar_guest_house_miramar_inn")
                    .description("Quarto amplo para três pessoas com cama adicional, berço disponível e pequeno-almoço caseiro.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Cozumel_Caribe_Hotel_Room_1973.jpg/1280px-Cozumel_Caribe_Hotel_Room_1973.jpg")
                    .price(new BigDecimal("44000.00"))
                    .position(2)
                    .organization(OrganizationData.GUEST_HOUSE_MIRAMAR_INN.getOrganization())
                    .build()
    ),

    QUARTO_COM_VARANDA_GUEST_HOUSE_MIRAMAR_INN(
            Product.builder()
                    .name("Quarto com Varanda - Guest House Miramar Inn")
                    .slug("quarto_com_varanda_guest_house_miramar_inn")
                    .description("Quarto com varanda privativa virada para o interior do bairro e pequeno-almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/1280px-Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .price(new BigDecimal("40000.00"))
                    .position(3)
                    .organization(OrganizationData.GUEST_HOUSE_MIRAMAR_INN.getOrganization())
                    .build()
    ),

    QUARTO_ECONOMICO_GUEST_HOUSE_MIRAMAR_INN(
            Product.builder()
                    .name("Quarto Económico - Guest House Miramar Inn")
                    .slug("quarto_economico_guest_house_miramar_inn")
                    .description("Opção económica com cama individual, mesa de estudo e serviços básicos incluídos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Hyderabad_Hotel_%2820_May_2016%29.jpg/1280px-Hyderabad_Hotel_%2820_May_2016%29.jpg")
                    .price(new BigDecimal("24000.00"))
                    .position(4)
                    .organization(OrganizationData.GUEST_HOUSE_MIRAMAR_INN.getOrganization())
                    .build()
    ),

    QUARTO_TWIN_GUEST_HOUSE_MIRAMAR_INN(
            Product.builder()
                    .name("Quarto Twin - Guest House Miramar Inn")
                    .slug("quarto_twin_guest_house_miramar_inn")
                    .description("Quarto com duas camas individuais ideal para colegas em deslocação de serviço.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Hotel_Pohjanhovi_Standard_Twin_bathroom_b.jpg/1280px-Hotel_Pohjanhovi_Standard_Twin_bathroom_b.jpg")
                    .price(new BigDecimal("34000.00"))
                    .position(5)
                    .organization(OrganizationData.GUEST_HOUSE_MIRAMAR_INN.getOrganization())
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_PROGRESSO(
            Product.builder()
                    .name("Quarto Simples - Hospedaria Progresso")
                    .slug("quarto_simples_hospedaria_progresso")
                    .description("Quarto simples com cama de casal, luz natural e zonas comuns sempre limpas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Art_Deco_facade_of_Pinnaroo_Institute_in_the_Murray_Mallee_South_Australia._%287524849558%29.jpg/1280px-Art_Deco_facade_of_Pinnaroo_Institute_in_the_Murray_Mallee_South_Australia._%287524849558%29.jpg")
                    .price(new BigDecimal("18000.00"))
                    .position(1)
                    .organization(OrganizationData.HOSPEDARIA_PROGRESSO.getOrganization())
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_PROGRESSO(
            Product.builder()
                    .name("Quarto Single - Hospedaria Progresso")
                    .slug("quarto_single_hospedaria_progresso")
                    .description("Quarto individual com cama de solteiro, ideal para viajantes solos e deslocações de trabalho.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/American_homes_and_gardens_%281905%29_%2817965027030%29.jpg/1280px-American_homes_and_gardens_%281905%29_%2817965027030%29.jpg")
                    .price(new BigDecimal("15000.00"))
                    .position(2)
                    .organization(OrganizationData.HOSPEDARIA_PROGRESSO.getOrganization())
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_PROGRESSO(
            Product.builder()
                    .name("Quarto Familiar - Hospedaria Progresso")
                    .slug("quarto_familiar_hospedaria_progresso")
                    .description("Quarto para três a quatro pessoas com camas adicionais e ventilação natural.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Aston_Kuta_Family_Room_%2811267223136%29.jpg/1280px-Aston_Kuta_Family_Room_%2811267223136%29.jpg")
                    .price(new BigDecimal("25000.00"))
                    .position(3)
                    .organization(OrganizationData.HOSPEDARIA_PROGRESSO.getOrganization())
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_PROGRESSO(
            Product.builder()
                    .name("Quarto com Banho Privativo - Hospedaria Progresso")
                    .slug("quarto_com_banho_privativo_hospedaria_progresso")
                    .description("Quarto com banho privativo, toalhas de algodão e água quente permanente.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_01.jpg/1280px-GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_01.jpg")
                    .price(new BigDecimal("20000.00"))
                    .position(4)
                    .organization(OrganizationData.HOSPEDARIA_PROGRESSO.getOrganization())
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_PROGRESSO(
            Product.builder()
                    .name("Estadia Prolongada - Hospedaria Progresso")
                    .slug("estadia_prolongada_hospedaria_progresso")
                    .description("Estadia a partir de 15 dias com desconto progressivo, limpeza diária e lavandaria.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/D%27Brickashaw_Ferguson_-_Jets_-_Sept_2009_%28cropped%29.jpg/1280px-D%27Brickashaw_Ferguson_-_Jets_-_Sept_2009_%28cropped%29.jpg")
                    .price(new BigDecimal("21000.00"))
                    .position(5)
                    .organization(OrganizationData.HOSPEDARIA_PROGRESSO.getOrganization())
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_KWANZA(
            Product.builder()
                    .name("Quarto Simples - Hospedaria Kwanza")
                    .slug("quarto_simples_hospedaria_kwanza")
                    .description("Quarto simples com cama de casal, luz natural e zonas comuns sempre limpas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Bulletin_of_the_State_Normal_School%2C_Fredericksburg%2C_Virginia%2C_June%2C_1917_%281917%29_%2814597260868%29.jpg/1280px-Bulletin_of_the_State_Normal_School%2C_Fredericksburg%2C_Virginia%2C_June%2C_1917_%281917%29_%2814597260868%29.jpg")
                    .price(new BigDecimal("18500.00"))
                    .position(1)
                    .organization(OrganizationData.HOSPEDARIA_KWANZA.getOrganization())
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_KWANZA(
            Product.builder()
                    .name("Quarto Single - Hospedaria Kwanza")
                    .slug("quarto_single_hospedaria_kwanza")
                    .description("Quarto individual com cama de solteiro, ideal para viajantes solos e deslocações de trabalho.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/American_homes_and_gardens_%281911%29_%2818126631076%29.jpg/1280px-American_homes_and_gardens_%281911%29_%2818126631076%29.jpg")
                    .price(new BigDecimal("15500.00"))
                    .position(2)
                    .organization(OrganizationData.HOSPEDARIA_KWANZA.getOrganization())
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_KWANZA(
            Product.builder()
                    .name("Quarto Familiar - Hospedaria Kwanza")
                    .slug("quarto_familiar_hospedaria_kwanza")
                    .description("Quarto para três a quatro pessoas com camas adicionais e ventilação natural.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Descendants_of_the_Willard_Family_pose_in_the_Willard_Hotel_Crystal_Room_after_the_renovation_in_1984._Washington%2C_D.C_LCCN2011631123.tif/lossy-page1-1280px-Descendants_of_the_Willard_Family_pose_in_the_Willard_Hotel_Crystal_Room_after_the_renovation_in_1984._Washington%2C_D.C_LCCN2011631123.tif.jpg")
                    .price(new BigDecimal("25500.00"))
                    .position(3)
                    .organization(OrganizationData.HOSPEDARIA_KWANZA.getOrganization())
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KWANZA(
            Product.builder()
                    .name("Quarto com Banho Privativo - Hospedaria Kwanza")
                    .slug("quarto_com_banho_privativo_hospedaria_kwanza")
                    .description("Quarto com banho privativo, toalhas de algodão e água quente permanente.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/GD_%E5%BB%A3%E6%9D%B1%E7%9C%81_Guangdong_DG_%E6%9D%B1%E8%8E%9E%E5%B8%82_DongGuan_%E5%AE%B6%E5%85%B7%E5%A4%A7%E9%81%93_Jiaju_Avenue_%E7%B2%B5%E9%BE%8D%E9%85%92%E5%BA%97_YueLong_Hotel_bathroom_December_2025_N13P_07.jpg/1280px-GD_%E5%BB%A3%E6%9D%B1%E7%9C%81_Guangdong_DG_%E6%9D%B1%E8%8E%9E%E5%B8%82_DongGuan_%E5%AE%B6%E5%85%B7%E5%A4%A7%E9%81%93_Jiaju_Avenue_%E7%B2%B5%E9%BE%8D%E9%85%92%E5%BA%97_YueLong_Hotel_bathroom_December_2025_N13P_07.jpg")
                    .price(new BigDecimal("20500.00"))
                    .position(4)
                    .organization(OrganizationData.HOSPEDARIA_KWANZA.getOrganization())
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_KWANZA(
            Product.builder()
                    .name("Estadia Prolongada - Hospedaria Kwanza")
                    .slug("estadia_prolongada_hospedaria_kwanza")
                    .description("Estadia a partir de 15 dias com desconto progressivo, limpeza diária e lavandaria.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Diary_of_a_refugee_%281910%29_%2814784387455%29.jpg/1280px-Diary_of_a_refugee_%281910%29_%2814784387455%29.jpg")
                    .price(new BigDecimal("21500.00"))
                    .position(5)
                    .organization(OrganizationData.HOSPEDARIA_KWANZA.getOrganization())
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_KATANGA(
            Product.builder()
                    .name("Quarto Simples - Hospedaria Katanga")
                    .slug("quarto_simples_hospedaria_katanga")
                    .description("Quarto simples com cama de casal, luz natural e zonas comuns sempre limpas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Eastnor_Castle_-_Eastnor_Lake_%2834052971815%29.jpg/1280px-Eastnor_Castle_-_Eastnor_Lake_%2834052971815%29.jpg")
                    .price(new BigDecimal("19000.00"))
                    .position(1)
                    .organization(OrganizationData.HOSPEDARIA_KATANGA.getOrganization())
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_KATANGA(
            Product.builder()
                    .name("Quarto Single - Hospedaria Katanga")
                    .slug("quarto_single_hospedaria_katanga")
                    .description("Quarto individual com cama de solteiro, ideal para viajantes solos e deslocações de trabalho.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Bulletin_%281910%29_%2814779645144%29.jpg/1280px-Bulletin_%281910%29_%2814779645144%29.jpg")
                    .price(new BigDecimal("16000.00"))
                    .position(2)
                    .organization(OrganizationData.HOSPEDARIA_KATANGA.getOrganization())
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_KATANGA(
            Product.builder()
                    .name("Quarto Familiar - Hospedaria Katanga")
                    .slug("quarto_familiar_hospedaria_katanga")
                    .description("Quarto para três a quatro pessoas com camas adicionais e ventilação natural.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Dining_room_at_Llanthony_Priory_hotel_-_geograph.org.uk_-_1767747.jpg/1280px-Dining_room_at_Llanthony_Priory_hotel_-_geograph.org.uk_-_1767747.jpg")
                    .price(new BigDecimal("26000.00"))
                    .position(3)
                    .organization(OrganizationData.HOSPEDARIA_KATANGA.getOrganization())
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KATANGA(
            Product.builder()
                    .name("Quarto com Banho Privativo - Hospedaria Katanga")
                    .slug("quarto_com_banho_privativo_hospedaria_katanga")
                    .description("Quarto com banho privativo, toalhas de algodão e água quente permanente.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/MC_%E6%BE%B3%E9%96%80_Macau_%E6%BE%B3%E9%96%80%E5%8D%8A%E5%B3%B6_Macao_Peninsula_%E5%BE%97%E5%8B%9D%E9%A6%AC%E8%B7%AF_2_Estrada_da_Vit%C3%B3ria_%E7%9A%87%E9%83%BD%E9%85%92%E5%BA%97_Royal_Macau_Hotel_hotel_%E6%B5%B4%E5%AE%A4_bathroom_%E6%B5%B4%E5%B8%98_shower_curtain_November_2024_R12S_01.jpg/1280px-thumbnail.jpg")
                    .price(new BigDecimal("21000.00"))
                    .position(4)
                    .organization(OrganizationData.HOSPEDARIA_KATANGA.getOrganization())
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_KATANGA(
            Product.builder()
                    .name("Estadia Prolongada - Hospedaria Katanga")
                    .slug("estadia_prolongada_hospedaria_katanga")
                    .description("Estadia a partir de 15 dias com desconto progressivo, limpeza diária e lavandaria.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Her_Majesty%27s_visit_to_the_Great_Britain_steam-ship_on_Tuesday_last_ILN_1845-0426-0001.jpg/1280px-Her_Majesty%27s_visit_to_the_Great_Britain_steam-ship_on_Tuesday_last_ILN_1845-0426-0001.jpg")
                    .price(new BigDecimal("22000.00"))
                    .position(5)
                    .organization(OrganizationData.HOSPEDARIA_KATANGA.getOrganization())
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_NOVA_VIDA(
            Product.builder()
                    .name("Quarto Simples - Hospedaria Nova Vida")
                    .slug("quarto_simples_hospedaria_nova_vida")
                    .description("Quarto simples com cama de casal, luz natural e zonas comuns sempre limpas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Eastnor_Castle_-_Eastnor_Lake_%2834052997115%29.jpg/1280px-Eastnor_Castle_-_Eastnor_Lake_%2834052997115%29.jpg")
                    .price(new BigDecimal("19500.00"))
                    .position(1)
                    .organization(OrganizationData.HOSPEDARIA_NOVA_VIDA.getOrganization())
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_NOVA_VIDA(
            Product.builder()
                    .name("Quarto Single - Hospedaria Nova Vida")
                    .slug("quarto_single_hospedaria_nova_vida")
                    .description("Quarto individual com cama de solteiro, ideal para viajantes solos e deslocações de trabalho.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/DSC_8565_A_luxurious_blue-themed_bedroom_with_draped_fabric_ceiling_chandelier_tufted_headboard_and_elegant_seating_opening_onto_a_sunny_patio_with_lounge_chairs.jpg/1280px-thumbnail.jpg")
                    .price(new BigDecimal("16500.00"))
                    .position(2)
                    .organization(OrganizationData.HOSPEDARIA_NOVA_VIDA.getOrganization())
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_NOVA_VIDA(
            Product.builder()
                    .name("Quarto Familiar - Hospedaria Nova Vida")
                    .slug("quarto_familiar_hospedaria_nova_vida")
                    .description("Quarto para três a quatro pessoas com camas adicionais e ventilação natural.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/Family_Room.jpg/1280px-Family_Room.jpg")
                    .price(new BigDecimal("26500.00"))
                    .position(3)
                    .organization(OrganizationData.HOSPEDARIA_NOVA_VIDA.getOrganization())
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_NOVA_VIDA(
            Product.builder()
                    .name("Quarto com Banho Privativo - Hospedaria Nova Vida")
                    .slug("quarto_com_banho_privativo_hospedaria_nova_vida")
                    .description("Quarto com banho privativo, toalhas de algodão e água quente permanente.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_02.jpg/1280px-GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_02.jpg")
                    .price(new BigDecimal("21500.00"))
                    .position(4)
                    .organization(OrganizationData.HOSPEDARIA_NOVA_VIDA.getOrganization())
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_NOVA_VIDA(
            Product.builder()
                    .name("Estadia Prolongada - Hospedaria Nova Vida")
                    .slug("estadia_prolongada_hospedaria_nova_vida")
                    .description("Estadia a partir de 15 dias com desconto progressivo, limpeza diária e lavandaria.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Letter_signed_Sara%2C_S.S._Arabic%2C_to_Ernst%2C_New_York_City%2C_June_23-24%2C_1927_-_DPLA_-_3b773a7162cb6ce318374acc38ec8f75_%28page_1%29.jpg/1280px-Letter_signed_Sara%2C_S.S._Arabic%2C_to_Ernst%2C_New_York_City%2C_June_23-24%2C_1927_-_DPLA_-_3b773a7162cb6ce318374acc38ec8f75_%28page_1%29.jpg")
                    .price(new BigDecimal("22500.00"))
                    .position(5)
                    .organization(OrganizationData.HOSPEDARIA_NOVA_VIDA.getOrganization())
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_SAO_KIZUA(
            Product.builder()
                    .name("Quarto Simples - Hospedaria São Kizua")
                    .slug("quarto_simples_hospedaria_sao_kizua")
                    .description("Quarto simples com cama de casal, luz natural e zonas comuns sempre limpas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Florists%27_review_%28microform%29_%281912%29_%2816479903227%29.jpg/1280px-Florists%27_review_%28microform%29_%281912%29_%2816479903227%29.jpg")
                    .price(new BigDecimal("20000.00"))
                    .position(1)
                    .organization(OrganizationData.HOSPEDARIA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_SAO_KIZUA(
            Product.builder()
                    .name("Quarto Single - Hospedaria São Kizua")
                    .slug("quarto_single_hospedaria_sao_kizua")
                    .description("Quarto individual com cama de solteiro, ideal para viajantes solos e deslocações de trabalho.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Florists%27_review_%28microform%29_%281912%29_%2816067218514%29.jpg/1280px-Florists%27_review_%28microform%29_%281912%29_%2816067218514%29.jpg")
                    .price(new BigDecimal("17000.00"))
                    .position(2)
                    .organization(OrganizationData.HOSPEDARIA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_SAO_KIZUA(
            Product.builder()
                    .name("Quarto Familiar - Hospedaria São Kizua")
                    .slug("quarto_familiar_hospedaria_sao_kizua")
                    .description("Quarto para três a quatro pessoas com camas adicionais e ventilação natural.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Family_Suite_-_Safari_room.jpg/1280px-Family_Suite_-_Safari_room.jpg")
                    .price(new BigDecimal("27000.00"))
                    .position(3)
                    .organization(OrganizationData.HOSPEDARIA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_SAO_KIZUA(
            Product.builder()
                    .name("Quarto com Banho Privativo - Hospedaria São Kizua")
                    .slug("quarto_com_banho_privativo_hospedaria_sao_kizua")
                    .description("Quarto com banho privativo, toalhas de algodão e água quente permanente.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/MC_%E6%BE%B3%E9%96%80_Macau_%E6%BE%B3%E9%96%80%E5%8D%8A%E5%B3%B6_Macao_Peninsula_%E5%BE%97%E5%8B%9D%E9%A6%AC%E8%B7%AF_2_Estrada_da_Vit%C3%B3ria_%E7%9A%87%E9%83%BD%E9%85%92%E5%BA%97_Royal_Macau_Hotel_hotel_%E6%B5%B4%E5%AE%A4_bathroom_%E6%B5%B4%E5%B8%98_shower_curtain_November_2024_R12S_02.jpg/1280px-thumbnail.jpg")
                    .price(new BigDecimal("22000.00"))
                    .position(4)
                    .organization(OrganizationData.HOSPEDARIA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_SAO_KIZUA(
            Product.builder()
                    .name("Estadia Prolongada - Hospedaria São Kizua")
                    .slug("estadia_prolongada_hospedaria_sao_kizua")
                    .description("Estadia a partir de 15 dias com desconto progressivo, limpeza diária e lavandaria.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Letter_signed_Sara%2C_Washington%2C_Conn.%2C_to_Ernst%2C_S.S._Paris%2C_March_13%2C_1929_-_DPLA_-_7d8d6b361bf6b1eb449e3afbfd3b270f_%28page_1%29.jpg/1280px-Letter_signed_Sara%2C_Washington%2C_Conn.%2C_to_Ernst%2C_S.S._Paris%2C_March_13%2C_1929_-_DPLA_-_7d8d6b361bf6b1eb449e3afbfd3b270f_%28page_1%29.jpg")
                    .price(new BigDecimal("23000.00"))
                    .position(5)
                    .organization(OrganizationData.HOSPEDARIA_SAO_KIZUA.getOrganization())
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_O_MUSQUETE(
            Product.builder()
                    .name("Menu Degustação do Chef - Restaurante O Musquete")
                    .slug("menu_degustacao_do_chef_restaurante_o_musquete")
                    .description("Menu de seis tempos com ingredientes da estação e harmonização de vinho angolano.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Asian_buffet_food_at_restaurant_Futo.jpg/1280px-Asian_buffet_food_at_restaurant_Futo.jpg")
                    .price(new BigDecimal("32000.00"))
                    .position(1)
                    .organization(OrganizationData.RESTAURANTE_O_MUSQUETE.getOrganization())
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_O_MUSQUETE(
            Product.builder()
                    .name("Prato do Dia - Restaurante O Musquete")
                    .slug("prato_do_dia_restaurante_o_musquete")
                    .description("Prato do dia servido ao almoço e ao jantar, com entrada e bebida incluídas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/A_W_A_Plate_Ad_Plate_Co_Fig_4_in_George_J_A_Skeen_Guide_to_Colombo_1898.jpg/1280px-A_W_A_Plate_Ad_Plate_Co_Fig_4_in_George_J_A_Skeen_Guide_to_Colombo_1898.jpg")
                    .price(new BigDecimal("9500.00"))
                    .position(2)
                    .organization(OrganizationData.RESTAURANTE_O_MUSQUETE.getOrganization())
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_O_MUSQUETE(
            Product.builder()
                    .name("Bowl do Chef - Restaurante O Musquete")
                    .slug("bowl_do_chef_restaurante_o_musquete")
                    .description("Bowl com cereais, legumes assados, proteína da casa e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Chiken_Steaks_in_Pakistan.jpg/1280px-Chiken_Steaks_in_Pakistan.jpg")
                    .price(new BigDecimal("7800.00"))
                    .position(3)
                    .organization(OrganizationData.RESTAURANTE_O_MUSQUETE.getOrganization())
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_O_MUSQUETE(
            Product.builder()
                    .name("Menu Executivo do Dia - Restaurante O Musquete")
                    .slug("menu_executivo_do_dia_restaurante_o_musquete")
                    .description("Refeição executiva de dois tempos com café e sumo natural incluídos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/1928-05-17_Paramount_Famous_Lasky_Corporation_West_Coast_Studios_Production_Department_Dinner_in_honor_or_New_York_executives_1.jpg/1280px-1928-05-17_Paramount_Famous_Lasky_Corporation_West_Coast_Studios_Production_Department_Dinner_in_honor_or_New_York_executives_1.jpg")
                    .price(new BigDecimal("14000.00"))
                    .position(4)
                    .organization(OrganizationData.RESTAURANTE_O_MUSQUETE.getOrganization())
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_O_MUSQUETE(
            Product.builder()
                    .name("Jantar Romântico para Dois - Restaurante O Musquete")
                    .slug("jantar_romantico_para_dois_restaurante_o_musquete")
                    .description("Jantar para dois com mesa reservada, velas, atenção dedicada e sobremesa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/DSCF0763_A_couple_seated_at_a_seaside_table_enjoying_an_evening_meal_and_drinks_while_watching_the_sunset_over_the_water.jpg/1280px-DSCF0763_A_couple_seated_at_a_seaside_table_enjoying_an_evening_meal_and_drinks_while_watching_the_sunset_over_the_water.jpg")
                    .price(new BigDecimal("45000.00"))
                    .position(5)
                    .organization(OrganizationData.RESTAURANTE_O_MUSQUETE.getOrganization())
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_MAR_E_TERRA(
            Product.builder()
                    .name("Menu Degustação do Chef - Restaurante Mar e Terra")
                    .slug("menu_degustacao_do_chef_restaurante_mar_e_terra")
                    .description("Menu de seis tempos com ingredientes da estação e harmonização de vinho angolano.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Elizabeth%27s_Restaurant_-_Food_and_Devices_-_New_Orleans_2016.jpg/1280px-Elizabeth%27s_Restaurant_-_Food_and_Devices_-_New_Orleans_2016.jpg")
                    .price(new BigDecimal("32500.00"))
                    .position(1)
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_MAR_E_TERRA(
            Product.builder()
                    .name("Prato do Dia - Restaurante Mar e Terra")
                    .slug("prato_do_dia_restaurante_mar_e_terra")
                    .description("Prato do dia servido ao almoço e ao jantar, com entrada e bebida incluídas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Daily_Colonist_%281896-07-24%29_%281896%29_%2814775700902%29.jpg/1280px-Daily_Colonist_%281896-07-24%29_%281896%29_%2814775700902%29.jpg")
                    .price(new BigDecimal("10000.00"))
                    .position(2)
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_MAR_E_TERRA(
            Product.builder()
                    .name("Bowl do Chef - Restaurante Mar e Terra")
                    .slug("bowl_do_chef_restaurante_mar_e_terra")
                    .description("Bowl com cereais, legumes assados, proteína da casa e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Floris_Claesz_van_Dijck_Stillleben_mit_K%C3%A4se.jpg/1280px-Floris_Claesz_van_Dijck_Stillleben_mit_K%C3%A4se.jpg")
                    .price(new BigDecimal("8300.00"))
                    .position(3)
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_MAR_E_TERRA(
            Product.builder()
                    .name("Menu Executivo do Dia - Restaurante Mar e Terra")
                    .slug("menu_executivo_do_dia_restaurante_mar_e_terra")
                    .description("Refeição executiva de dois tempos com café e sumo natural incluídos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.jpg/1280px-DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.jpg")
                    .price(new BigDecimal("14500.00"))
                    .position(4)
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_MAR_E_TERRA(
            Product.builder()
                    .name("Jantar Romântico para Dois - Restaurante Mar e Terra")
                    .slug("jantar_romantico_para_dois_restaurante_mar_e_terra")
                    .description("Jantar para dois com mesa reservada, velas, atenção dedicada e sobremesa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/The_hunter_and_the_trapper_in_North_America%3B_or%2C_Romantic_adventures_in_field_and_forest._From_the_French_of_B%C3%A9n%C3%A9dict_R%C3%A9voil_%281875%29_%2814563522488%29.jpg/1280px-The_hunter_and_the_trapper_in_North_America%3B_or%2C_Romantic_adventures_in_field_and_forest._From_the_French_of_B%C3%A9n%C3%A9dict_R%C3%A9voil_%281875%29_%2814563522488%29.jpg")
                    .price(new BigDecimal("45500.00"))
                    .position(5)
                    .organization(OrganizationData.RESTAURANTE_MAR_E_TERRA.getOrganization())
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_KWANZA_LIVING(
            Product.builder()
                    .name("Menu Degustação do Chef - Restaurante Kwanza Living")
                    .slug("menu_degustacao_do_chef_restaurante_kwanza_living")
                    .description("Menu de seis tempos com ingredientes da estação e harmonização de vinho angolano.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Elizabeth%27s_Restaurant_Shrimp_and_Grits_Plate_New_Orleans.jpg/1280px-Elizabeth%27s_Restaurant_Shrimp_and_Grits_Plate_New_Orleans.jpg")
                    .price(new BigDecimal("33000.00"))
                    .position(1)
                    .organization(OrganizationData.RESTAURANTE_KWANZA_LIVING.getOrganization())
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_KWANZA_LIVING(
            Product.builder()
                    .name("Prato do Dia - Restaurante Kwanza Living")
                    .slug("prato_do_dia_restaurante_kwanza_living")
                    .description("Prato do dia servido ao almoço e ao jantar, com entrada e bebida incluídas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Marjie%27s_Grill_New_Orleans_5_December_2018_05.jpg/1280px-Marjie%27s_Grill_New_Orleans_5_December_2018_05.jpg")
                    .price(new BigDecimal("10500.00"))
                    .position(2)
                    .organization(OrganizationData.RESTAURANTE_KWANZA_LIVING.getOrganization())
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_KWANZA_LIVING(
            Product.builder()
                    .name("Bowl do Chef - Restaurante Kwanza Living")
                    .slug("bowl_do_chef_restaurante_kwanza_living")
                    .description("Bowl com cereais, legumes assados, proteína da casa e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Floris_van_Dyck_002.jpg/1280px-Floris_van_Dyck_002.jpg")
                    .price(new BigDecimal("8800.00"))
                    .position(3)
                    .organization(OrganizationData.RESTAURANTE_KWANZA_LIVING.getOrganization())
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_KWANZA_LIVING(
            Product.builder()
                    .name("Menu Executivo do Dia - Restaurante Kwanza Living")
                    .slug("menu_executivo_do_dia_restaurante_kwanza_living")
                    .description("Refeição executiva de dois tempos com café e sumo natural incluídos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.tiff/lossy-page1-1280px-DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.tiff.jpg")
                    .price(new BigDecimal("15000.00"))
                    .position(4)
                    .organization(OrganizationData.RESTAURANTE_KWANZA_LIVING.getOrganization())
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_KWANZA_LIVING(
            Product.builder()
                    .name("Jantar Romântico para Dois - Restaurante Kwanza Living")
                    .slug("jantar_romantico_para_dois_restaurante_kwanza_living")
                    .description("Jantar para dois com mesa reservada, velas, atenção dedicada e sobremesa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Asian_restaurant_table_setting.jpeg/1280px-Asian_restaurant_table_setting.jpeg")
                    .price(new BigDecimal("46000.00"))
                    .position(5)
                    .organization(OrganizationData.RESTAURANTE_KWANZA_LIVING.getOrganization())
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO(
            Product.builder()
                    .name("Menu Degustação do Chef - Restaurante Sabor Angolano")
                    .slug("menu_degustacao_do_chef_restaurante_sabor_angolano")
                    .description("Menu de seis tempos com ingredientes da estação e harmonização de vinho angolano.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Ethiopian_vegetarian_food_plate_at_a_restaurant%2C_Paris%2C_December_2024.jpg/1280px-Ethiopian_vegetarian_food_plate_at_a_restaurant%2C_Paris%2C_December_2024.jpg")
                    .price(new BigDecimal("33500.00"))
                    .position(1)
                    .organization(OrganizationData.RESTAURANTE_SABOR_ANGOLANO.getOrganization())
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO(
            Product.builder()
                    .name("Prato do Dia - Restaurante Sabor Angolano")
                    .slug("prato_do_dia_restaurante_sabor_angolano")
                    .description("Prato do dia servido ao almoço e ao jantar, com entrada e bebida incluídas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Plate%2C_oval_%28AM_1986.88-2%29.jpg/1280px-Plate%2C_oval_%28AM_1986.88-2%29.jpg")
                    .price(new BigDecimal("11000.00"))
                    .position(2)
                    .organization(OrganizationData.RESTAURANTE_SABOR_ANGOLANO.getOrganization())
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO(
            Product.builder()
                    .name("Bowl do Chef - Restaurante Sabor Angolano")
                    .slug("bowl_do_chef_restaurante_sabor_angolano")
                    .description("Bowl com cereais, legumes assados, proteína da casa e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/JBLM_culinary_arts_team_preps_for_%27Food_Super_Bowl%27_130201-A-OP586-086.jpg/1280px-JBLM_culinary_arts_team_preps_for_%27Food_Super_Bowl%27_130201-A-OP586-086.jpg")
                    .price(new BigDecimal("9300.00"))
                    .position(3)
                    .organization(OrganizationData.RESTAURANTE_SABOR_ANGOLANO.getOrganization())
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO(
            Product.builder()
                    .name("Menu Executivo do Dia - Restaurante Sabor Angolano")
                    .slug("menu_executivo_do_dia_restaurante_sabor_angolano")
                    .description("Refeição executiva de dois tempos com café e sumo natural incluídos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.jpg/1280px-EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.jpg")
                    .price(new BigDecimal("15500.00"))
                    .position(4)
                    .organization(OrganizationData.RESTAURANTE_SABOR_ANGOLANO.getOrganization())
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_SABOR_ANGOLANO(
            Product.builder()
                    .name("Jantar Romântico para Dois - Restaurante Sabor Angolano")
                    .slug("jantar_romantico_para_dois_restaurante_sabor_angolano")
                    .description("Jantar para dois com mesa reservada, velas, atenção dedicada e sobremesa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/BJ_%E5%8C%97%E4%BA%AC_Tour_Beijing_%E5%B5%97%E5%90%89%E5%BA%9C%E9%A4%90%E5%BB%B3_restaurant_Chinese_table_setting_Aug-2010.JPG/1280px-BJ_%E5%8C%97%E4%BA%AC_Tour_Beijing_%E5%B5%97%E5%90%89%E5%BA%9C%E9%A4%90%E5%BB%B3_restaurant_Chinese_table_setting_Aug-2010.JPG")
                    .price(new BigDecimal("46500.00"))
                    .position(5)
                    .organization(OrganizationData.RESTAURANTE_SABOR_ANGOLANO.getOrganization())
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_TALATONA(
            Product.builder()
                    .name("Menu Degustação do Chef - Restaurante Talatona")
                    .slug("menu_degustacao_do_chef_restaurante_talatona")
                    .description("Menu de seis tempos com ingredientes da estação e harmonização de vinho angolano.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Food_at_Mirage_Restaurant_Dhaka.JPG/1280px-Food_at_Mirage_Restaurant_Dhaka.JPG")
                    .price(new BigDecimal("34000.00"))
                    .position(1)
                    .organization(OrganizationData.RESTAURANTE_TALATONA.getOrganization())
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_TALATONA(
            Product.builder()
                    .name("Prato do Dia - Restaurante Talatona")
                    .slug("prato_do_dia_restaurante_talatona")
                    .description("Prato do dia servido ao almoço e ao jantar, com entrada e bebida incluídas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Plate%2C_oval_%28AM_1986.88-3%29.jpg/1280px-Plate%2C_oval_%28AM_1986.88-3%29.jpg")
                    .price(new BigDecimal("11500.00"))
                    .position(2)
                    .organization(OrganizationData.RESTAURANTE_TALATONA.getOrganization())
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_TALATONA(
            Product.builder()
                    .name("Bowl do Chef - Restaurante Talatona")
                    .slug("bowl_do_chef_restaurante_talatona")
                    .description("Bowl com cereais, legumes assados, proteína da casa e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Myanmar%E2%80%99s_Traditional_Food_-_Mohinga.jpg/1280px-Myanmar%E2%80%99s_Traditional_Food_-_Mohinga.jpg")
                    .price(new BigDecimal("9800.00"))
                    .position(3)
                    .organization(OrganizationData.RESTAURANTE_TALATONA.getOrganization())
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_TALATONA(
            Product.builder()
                    .name("Menu Executivo do Dia - Restaurante Talatona")
                    .slug("menu_executivo_do_dia_restaurante_talatona")
                    .description("Refeição executiva de dois tempos com café e sumo natural incluídos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.tiff/lossy-page1-1280px-EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.tiff.jpg")
                    .price(new BigDecimal("16000.00"))
                    .position(4)
                    .organization(OrganizationData.RESTAURANTE_TALATONA.getOrganization())
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_TALATONA(
            Product.builder()
                    .name("Jantar Romântico para Dois - Restaurante Talatona")
                    .slug("jantar_romantico_para_dois_restaurante_talatona")
                    .description("Jantar para dois com mesa reservada, velas, atenção dedicada e sobremesa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E4%BD%9B%E5%B1%B1_Foshan_%E9%A0%86%E5%BE%B7_Shunde_%E5%9B%9B%E5%AD%A3%E7%82%96%E6%B9%AF_Siji_Duntang_Chinese_Restaurant_table_cloth_setting_January_2024_R12S_02.jpg/1280px-GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E4%BD%9B%E5%B1%B1_Foshan_%E9%A0%86%E5%BE%B7_Shunde_%E5%9B%9B%E5%AD%A3%E7%82%96%E6%B9%AF_Siji_Duntang_Chinese_Restaurant_table_cloth_setting_January_2024_R12S_02.jpg")
                    .price(new BigDecimal("47000.00"))
                    .position(5)
                    .organization(OrganizationData.RESTAURANTE_TALATONA.getOrganization())
                    .build()
    ),

    MUAMBA_DE_GALINHA_CANTINHO_DA_MAE_ANGOLA(
            Product.builder()
                    .name("Muamba de Galinha - Cantinho da Mãe Angola")
                    .slug("muamba_de_galinha_cantinho_da_mae_angola")
                    .description("Muamba de galinha com funge, feijão e cozimento lento da cozinha caseira, servida com pirão tradicional.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/African_Chicken_Peanut_Stew_%2837673757141%29.jpg/1280px-African_Chicken_Peanut_Stew_%2837673757141%29.jpg")
                    .price(new BigDecimal("6500.00"))
                    .position(1)
                    .organization(OrganizationData.CANTINHO_DA_MAE_ANGOLA.getOrganization())
                    .build()
    ),

    CALULU_DE_PEIXE_CANTINHO_DA_MAE_ANGOLA(
            Product.builder()
                    .name("Calulu de Peixe - Cantinho da Mãe Angola")
                    .slug("calulu_de_peixe_cantinho_da_mae_angola")
                    .description("Calulu refogado com tomate e cebola, servido com funge e peixe frito do dia.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Haumania_liebrechtsiana_-_leaf_pouch_for_libok%C3%A9.jpg/1280px-Haumania_liebrechtsiana_-_leaf_pouch_for_libok%C3%A9.jpg")
                    .price(new BigDecimal("5500.00"))
                    .position(2)
                    .organization(OrganizationData.CANTINHO_DA_MAE_ANGOLA.getOrganization())
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_CANTINHO_DA_MAE_ANGOLA(
            Product.builder()
                    .name("Funge com Feijão e Ovo - Cantinho da Mãe Angola")
                    .slug("funge_com_feijao_e_ovo_cantinho_da_mae_angola")
                    .description("Funge de mandioca com feijão-verde, óleo de palma e ovo cozido.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Attieke_and_chicken.jpg/1280px-Attieke_and_chicken.jpg")
                    .price(new BigDecimal("3200.00"))
                    .position(3)
                    .organization(OrganizationData.CANTINHO_DA_MAE_ANGOLA.getOrganization())
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_CANTINHO_DA_MAE_ANGOLA(
            Product.builder()
                    .name("Peixe Grelhado do Dia - Cantinho da Mãe Angola")
                    .slug("peixe_grelhado_do_dia_cantinho_da_mae_angola")
                    .description("Peixe do dia grelhado no carvão, com arroz, salada e molho de limão de Benguela.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/2010-0117-Peru-piranha.jpg/1280px-2010-0117-Peru-piranha.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(4)
                    .organization(OrganizationData.CANTINHO_DA_MAE_ANGOLA.getOrganization())
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_CANTINHO_DA_MAE_ANGOLA(
            Product.builder()
                    .name("Espetos Mistos do Kilamba - Cantinho da Mãe Angola")
                    .slug("espetos_mistos_do_kilamba_cantinho_da_mae_angola")
                    .description("Espetos de carne, frango e gambas grelhados no carvão, servidos com molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Chenjeh.jpg/1280px-Chenjeh.jpg")
                    .price(new BigDecimal("4800.00"))
                    .position(5)
                    .organization(OrganizationData.CANTINHO_DA_MAE_ANGOLA.getOrganization())
                    .build()
    ),

    MUAMBA_DE_GALINHA_SABORES_DA_NOSSA_TERRA(
            Product.builder()
                    .name("Muamba de Galinha - Sabores da Nossa Terra")
                    .slug("muamba_de_galinha_sabores_da_nossa_terra")
                    .description("Muamba de galinha com funge, feijão e cozimento lento da cozinha caseira, servida com pirão tradicional.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Baganda_peanut_stew_%28Ekinyeebwa%29_01.jpg/1280px-Baganda_peanut_stew_%28Ekinyeebwa%29_01.jpg")
                    .price(new BigDecimal("7000.00"))
                    .position(1)
                    .organization(OrganizationData.SABORES_DA_NOSSA_TERRA.getOrganization())
                    .build()
    ),

    CALULU_DE_PEIXE_SABORES_DA_NOSSA_TERRA(
            Product.builder()
                    .name("Calulu de Peixe - Sabores da Nossa Terra")
                    .slug("calulu_de_peixe_sabores_da_nossa_terra")
                    .description("Calulu refogado com tomate e cebola, servido com funge e peixe frito do dia.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/01_Food_in_Gran_Canaria_-_fish_and_seafood_mixed_grill_plate.jpg/1280px-01_Food_in_Gran_Canaria_-_fish_and_seafood_mixed_grill_plate.jpg")
                    .price(new BigDecimal("6000.00"))
                    .position(2)
                    .organization(OrganizationData.SABORES_DA_NOSSA_TERRA.getOrganization())
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_SABORES_DA_NOSSA_TERRA(
            Product.builder()
                    .name("Funge com Feijão e Ovo - Sabores da Nossa Terra")
                    .slug("funge_com_feijao_e_ovo_sabores_da_nossa_terra")
                    .description("Funge de mandioca com feijão-verde, óleo de palma e ovo cozido.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Attieke_serves_with_fried_carp.jpg/1280px-Attieke_serves_with_fried_carp.jpg")
                    .price(new BigDecimal("3700.00"))
                    .position(3)
                    .organization(OrganizationData.SABORES_DA_NOSSA_TERRA.getOrganization())
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_SABORES_DA_NOSSA_TERRA(
            Product.builder()
                    .name("Peixe Grelhado do Dia - Sabores da Nossa Terra")
                    .slug("peixe_grelhado_do_dia_sabores_da_nossa_terra")
                    .description("Peixe do dia grelhado no carvão, com arroz, salada e molho de limão de Benguela.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/8862Binmaley_Dagupan_Road_Barangays_06.jpg/1280px-8862Binmaley_Dagupan_Road_Barangays_06.jpg")
                    .price(new BigDecimal("8000.00"))
                    .position(4)
                    .organization(OrganizationData.SABORES_DA_NOSSA_TERRA.getOrganization())
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_SABORES_DA_NOSSA_TERRA(
            Product.builder()
                    .name("Espetos Mistos do Kilamba - Sabores da Nossa Terra")
                    .slug("espetos_mistos_do_kilamba_sabores_da_nossa_terra")
                    .description("Espetos de carne, frango e gambas grelhados no carvão, servidos com molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/DFC_0330_Grilled_meat_skewers_topped_with_sliced_red_onion_chopped_herbs_and_a_sprinkle_of_seasoning_served_alongside_fresh_lettuce.jpg/1280px-DFC_0330_Grilled_meat_skewers_topped_with_sliced_red_onion_chopped_herbs_and_a_sprinkle_of_seasoning_served_alongside_fresh_lettuce.jpg")
                    .price(new BigDecimal("5300.00"))
                    .position(5)
                    .organization(OrganizationData.SABORES_DA_NOSSA_TERRA.getOrganization())
                    .build()
    ),

    MUAMBA_DE_GALINHA_TASCA_DO_MUAMBA(
            Product.builder()
                    .name("Muamba de Galinha - Tasca do Muamba")
                    .slug("muamba_de_galinha_tasca_do_muamba")
                    .description("Muamba de galinha com funge, feijão e cozimento lento da cozinha caseira, servida com pirão tradicional.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Baganda_peanut_stew_%28Ekinyeebwa%29_02.jpg/1280px-Baganda_peanut_stew_%28Ekinyeebwa%29_02.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(1)
                    .organization(OrganizationData.TASCA_DO_MUAMBA.getOrganization())
                    .build()
    ),

    CALULU_DE_PEIXE_TASCA_DO_MUAMBA(
            Product.builder()
                    .name("Calulu de Peixe - Tasca do Muamba")
                    .slug("calulu_de_peixe_tasca_do_muamba")
                    .description("Calulu refogado com tomate e cebola, servido com funge e peixe frito do dia.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/02_Grilled_fish_and_seafood_dinner_in_Canary_Islands_-_Gran_Canaria_restaurant%2C_marisco_mixto_a_la_parrilla.jpg/1280px-02_Grilled_fish_and_seafood_dinner_in_Canary_Islands_-_Gran_Canaria_restaurant%2C_marisco_mixto_a_la_parrilla.jpg")
                    .price(new BigDecimal("6500.00"))
                    .position(2)
                    .organization(OrganizationData.TASCA_DO_MUAMBA.getOrganization())
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_TASCA_DO_MUAMBA(
            Product.builder()
                    .name("Funge com Feijão e Ovo - Tasca do Muamba")
                    .slug("funge_com_feijao_e_ovo_tasca_do_muamba")
                    .description("Funge de mandioca com feijão-verde, óleo de palma e ovo cozido.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Atti%C3%A9k%C3%A9.jpg/1280px-Atti%C3%A9k%C3%A9.jpg")
                    .price(new BigDecimal("4200.00"))
                    .position(3)
                    .organization(OrganizationData.TASCA_DO_MUAMBA.getOrganization())
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_TASCA_DO_MUAMBA(
            Product.builder()
                    .name("Peixe Grelhado do Dia - Tasca do Muamba")
                    .slug("peixe_grelhado_do_dia_tasca_do_muamba")
                    .description("Peixe do dia grelhado no carvão, com arroz, salada e molho de limão de Benguela.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/8862Binmaley_Dagupan_Road_Barangays_07.jpg/1280px-8862Binmaley_Dagupan_Road_Barangays_07.jpg")
                    .price(new BigDecimal("8500.00"))
                    .position(4)
                    .organization(OrganizationData.TASCA_DO_MUAMBA.getOrganization())
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_TASCA_DO_MUAMBA(
            Product.builder()
                    .name("Espetos Mistos do Kilamba - Tasca do Muamba")
                    .slug("espetos_mistos_do_kilamba_tasca_do_muamba")
                    .description("Espetos de carne, frango e gambas grelhados no carvão, servidos com molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/DFC_1493_Hearty_plate_of_skewered_grilled_meat_and_veggies_draped_in_a_rich_tomato_sauce_served_with_golden_fries_and_a_side_of_coleslaw.jpg/1280px-DFC_1493_Hearty_plate_of_skewered_grilled_meat_and_veggies_draped_in_a_rich_tomato_sauce_served_with_golden_fries_and_a_side_of_coleslaw.jpg")
                    .price(new BigDecimal("5800.00"))
                    .position(5)
                    .organization(OrganizationData.TASCA_DO_MUAMBA.getOrganization())
                    .build()
    ),

    MUAMBA_DE_GALINHA_COZINHA_DO_KILAMBA(
            Product.builder()
                    .name("Muamba de Galinha - Cozinha do Kilamba")
                    .slug("muamba_de_galinha_cozinha_do_kilamba")
                    .description("Muamba de galinha com funge, feijão e cozimento lento da cozinha caseira, servida com pirão tradicional.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Baganda_peanut_stew_%28Ekinyeebwa%29_05.jpg/1280px-Baganda_peanut_stew_%28Ekinyeebwa%29_05.jpg")
                    .price(new BigDecimal("8000.00"))
                    .position(1)
                    .organization(OrganizationData.COZINHA_DO_KILAMBA.getOrganization())
                    .build()
    ),

    CALULU_DE_PEIXE_COZINHA_DO_KILAMBA(
            Product.builder()
                    .name("Calulu de Peixe - Cozinha do Kilamba")
                    .slug("calulu_de_peixe_cozinha_do_kilamba")
                    .description("Calulu refogado com tomate e cebola, servido com funge e peixe frito do dia.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Fish_seasoning_02.jpg/1280px-Fish_seasoning_02.jpg")
                    .price(new BigDecimal("7000.00"))
                    .position(2)
                    .organization(OrganizationData.COZINHA_DO_KILAMBA.getOrganization())
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_COZINHA_DO_KILAMBA(
            Product.builder()
                    .name("Funge com Feijão e Ovo - Cozinha do Kilamba")
                    .slug("funge_com_feijao_e_ovo_cozinha_do_kilamba")
                    .description("Funge de mandioca com feijão-verde, óleo de palma e ovo cozido.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Atti%C3%A9k%C3%A9_B%C3%A9nin.jpg/1280px-Atti%C3%A9k%C3%A9_B%C3%A9nin.jpg")
                    .price(new BigDecimal("4700.00"))
                    .position(3)
                    .organization(OrganizationData.COZINHA_DO_KILAMBA.getOrganization())
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_COZINHA_DO_KILAMBA(
            Product.builder()
                    .name("Peixe Grelhado do Dia - Cozinha do Kilamba")
                    .slug("peixe_grelhado_do_dia_cozinha_do_kilamba")
                    .description("Peixe do dia grelhado no carvão, com arroz, salada e molho de limão de Benguela.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/8862Binmaley_Dagupan_Road_Barangays_09.jpg/1280px-8862Binmaley_Dagupan_Road_Barangays_09.jpg")
                    .price(new BigDecimal("9000.00"))
                    .position(4)
                    .organization(OrganizationData.COZINHA_DO_KILAMBA.getOrganization())
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_COZINHA_DO_KILAMBA(
            Product.builder()
                    .name("Espetos Mistos do Kilamba - Cozinha do Kilamba")
                    .slug("espetos_mistos_do_kilamba_cozinha_do_kilamba")
                    .description("Espetos de carne, frango e gambas grelhados no carvão, servidos com molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/DFC_2095_Savory_grilled_pork_skewers_sizzling_and_caramelized_to_a_perfect_golden-brown.jpg/1280px-DFC_2095_Savory_grilled_pork_skewers_sizzling_and_caramelized_to_a_perfect_golden-brown.jpg")
                    .price(new BigDecimal("6300.00"))
                    .position(5)
                    .organization(OrganizationData.COZINHA_DO_KILAMBA.getOrganization())
                    .build()
    ),

    MUAMBA_DE_GALINHA_SOLAR_DO_KWANZA(
            Product.builder()
                    .name("Muamba de Galinha - Solar do Kwanza")
                    .slug("muamba_de_galinha_solar_do_kwanza")
                    .description("Muamba de galinha com funge, feijão e cozimento lento da cozinha caseira, servida com pirão tradicional.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Banku_and_groundnut_soup_01.jpg/1280px-Banku_and_groundnut_soup_01.jpg")
                    .price(new BigDecimal("8500.00"))
                    .position(1)
                    .organization(OrganizationData.SOLAR_DO_KWANZA.getOrganization())
                    .build()
    ),

    CALULU_DE_PEIXE_SOLAR_DO_KWANZA(
            Product.builder()
                    .name("Calulu de Peixe - Solar do Kwanza")
                    .slug("calulu_de_peixe_solar_do_kwanza")
                    .description("Calulu refogado com tomate e cebola, servido com funge e peixe frito do dia.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Fish_seasoning_11.jpg/1280px-Fish_seasoning_11.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(2)
                    .organization(OrganizationData.SOLAR_DO_KWANZA.getOrganization())
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_SOLAR_DO_KWANZA(
            Product.builder()
                    .name("Funge com Feijão e Ovo - Solar do Kwanza")
                    .slug("funge_com_feijao_e_ovo_solar_do_kwanza")
                    .description("Funge de mandioca com feijão-verde, óleo de palma e ovo cozido.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Cassava_Pone_in_a_dish.png/1280px-Cassava_Pone_in_a_dish.png")
                    .price(new BigDecimal("5200.00"))
                    .position(3)
                    .organization(OrganizationData.SOLAR_DO_KWANZA.getOrganization())
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_SOLAR_DO_KWANZA(
            Product.builder()
                    .name("Peixe Grelhado do Dia - Solar do Kwanza")
                    .slug("peixe_grelhado_do_dia_solar_do_kwanza")
                    .description("Peixe do dia grelhado no carvão, com arroz, salada e molho de limão de Benguela.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/8862Binmaley_Dagupan_Road_Barangays_53.jpg/1280px-8862Binmaley_Dagupan_Road_Barangays_53.jpg")
                    .price(new BigDecimal("9500.00"))
                    .position(4)
                    .organization(OrganizationData.SOLAR_DO_KWANZA.getOrganization())
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_SOLAR_DO_KWANZA(
            Product.builder()
                    .name("Espetos Mistos do Kilamba - Solar do Kwanza")
                    .slug("espetos_mistos_do_kilamba_solar_do_kwanza")
                    .description("Espetos de carne, frango e gambas grelhados no carvão, servidos com molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/DFC_4414_A_young_street_vendor_carefully_threads_colorful_skewers_of_grilled_meat_at_a_bustling_night_market.jpg/1280px-DFC_4414_A_young_street_vendor_carefully_threads_colorful_skewers_of_grilled_meat_at_a_bustling_night_market.jpg")
                    .price(new BigDecimal("6800.00"))
                    .position(5)
                    .organization(OrganizationData.SOLAR_DO_KWANZA.getOrganization())
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_NAPOLI_LUANDA(
            Product.builder()
                    .name("Pizza Margherita - Pizzeria Napoli Luanda")
                    .slug("pizza_margherita_pizzeria_napoli_luanda")
                    .description("Pizza margherita com molho de tomate italiano, muçarela de búfala e manjericão fresco.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Eq_it-na_pizza-margherita_sep2005_sml.jpg/1280px-Eq_it-na_pizza-margherita_sep2005_sml.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(1)
                    .organization(OrganizationData.PIZZERIA_NAPOLI_LUANDA.getOrganization())
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_NAPOLI_LUANDA(
            Product.builder()
                    .name("Pizza Pepperoni - Pizzeria Napoli Luanda")
                    .slug("pizza_pepperoni_pizzeria_napoli_luanda")
                    .description("Pizza pepperoni com molho de tomate, muçarela e rodelas de pepperoni picante.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/All_Good_pizza_%2838501728345%29.jpg/1280px-All_Good_pizza_%2838501728345%29.jpg")
                    .price(new BigDecimal("8900.00"))
                    .position(2)
                    .organization(OrganizationData.PIZZERIA_NAPOLI_LUANDA.getOrganization())
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_NAPOLI_LUANDA(
            Product.builder()
                    .name("Pizza Portuguesa - Pizzeria Napoli Luanda")
                    .slug("pizza_portuguesa_pizzeria_napoli_luanda")
                    .description("Pizza portuguesa com fiambre, ovos, cebola, azeitonas e pimentos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Brass_Funghi_%28quarter%29_-_Yeastie_Boys_Pizza_Club_2024-05-17.jpg/1280px-Brass_Funghi_%28quarter%29_-_Yeastie_Boys_Pizza_Club_2024-05-17.jpg")
                    .price(new BigDecimal("9500.00"))
                    .position(3)
                    .organization(OrganizationData.PIZZERIA_NAPOLI_LUANDA.getOrganization())
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_NAPOLI_LUANDA(
            Product.builder()
                    .name("Pizza Vegetariana - Pizzeria Napoli Luanda")
                    .slug("pizza_vegetariana_pizzeria_napoli_luanda")
                    .description("Pizza vegetariana com beringela, curgete, cogumelos, milho e ervas frescas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Kale_Pizza_from_Basil_Pizza_%26_Wine_Bar.jpg/1280px-Kale_Pizza_from_Basil_Pizza_%26_Wine_Bar.jpg")
                    .price(new BigDecimal("8200.00"))
                    .position(4)
                    .organization(OrganizationData.PIZZERIA_NAPOLI_LUANDA.getOrganization())
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_NAPOLI_LUANDA(
            Product.builder()
                    .name("Calzone Recheado - Pizzeria Napoli Luanda")
                    .slug("calzone_recheado_pizzeria_napoli_luanda")
                    .description("Calzone com recheio de muçarela, fiambre e tomate, servido com molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Calzone%2C_Italian_Pizzeria_and_Restaurant%2C_Live_Oak.jpg/1280px-Calzone%2C_Italian_Pizzeria_and_Restaurant%2C_Live_Oak.jpg")
                    .price(new BigDecimal("7800.00"))
                    .position(5)
                    .organization(OrganizationData.PIZZERIA_NAPOLI_LUANDA.getOrganization())
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_FORNO_ANGOLA(
            Product.builder()
                    .name("Pizza Margherita - Pizzeria Forno Angola")
                    .slug("pizza_margherita_pizzeria_forno_angola")
                    .description("Pizza margherita com molho de tomate italiano, muçarela de búfala e manjericão fresco.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Margherita_Originale.JPG/1280px-Margherita_Originale.JPG")
                    .price(new BigDecimal("8000.00"))
                    .position(1)
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_FORNO_ANGOLA(
            Product.builder()
                    .name("Pizza Pepperoni - Pizzeria Forno Angola")
                    .slug("pizza_pepperoni_pizzeria_forno_angola")
                    .description("Pizza pepperoni com molho de tomate, muçarela e rodelas de pepperoni picante.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Nanuet_Hotel_Pepperoni_Pizza.jpg/1280px-Nanuet_Hotel_Pepperoni_Pizza.jpg")
                    .price(new BigDecimal("9400.00"))
                    .position(2)
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_FORNO_ANGOLA(
            Product.builder()
                    .name("Pizza Portuguesa - Pizzeria Forno Angola")
                    .slug("pizza_portuguesa_pizzeria_forno_angola")
                    .description("Pizza portuguesa com fiambre, ovos, cebola, azeitonas e pimentos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Creative_capricciosa_pizza_on_the_rustic_table_with_tomato_and_green_paprika_in_the_restaurant._%2849446810177%29.jpg/1280px-Creative_capricciosa_pizza_on_the_rustic_table_with_tomato_and_green_paprika_in_the_restaurant._%2849446810177%29.jpg")
                    .price(new BigDecimal("10000.00"))
                    .position(3)
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_FORNO_ANGOLA(
            Product.builder()
                    .name("Pizza Vegetariana - Pizzeria Forno Angola")
                    .slug("pizza_vegetariana_pizzeria_forno_angola")
                    .description("Pizza vegetariana com beringela, curgete, cogumelos, milho e ervas frescas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Mysore_Style_Tawa_Pizza_with_higher_resolution.jpg/1280px-Mysore_Style_Tawa_Pizza_with_higher_resolution.jpg")
                    .price(new BigDecimal("8700.00"))
                    .position(4)
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_FORNO_ANGOLA(
            Product.builder()
                    .name("Calzone Recheado - Pizzeria Forno Angola")
                    .slug("calzone_recheado_pizzeria_forno_angola")
                    .description("Calzone com recheio de muçarela, fiambre e tomate, servido com molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Calzone_%283348696443%29.jpg/1280px-Calzone_%283348696443%29.jpg")
                    .price(new BigDecimal("8300.00"))
                    .position(5)
                    .organization(OrganizationData.PIZZERIA_FORNO_ANGOLA.getOrganization())
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_MSLICE(
            Product.builder()
                    .name("Pizza Margherita - Pizzeria Mslice")
                    .slug("pizza_margherita_pizzeria_mslice")
                    .description("Pizza margherita com molho de tomate italiano, muçarela de búfala e manjericão fresco.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Margherita_pizza_on_plate_2.jpg/1280px-Margherita_pizza_on_plate_2.jpg")
                    .price(new BigDecimal("8500.00"))
                    .position(1)
                    .organization(OrganizationData.PIZZERIA_MSLICE.getOrganization())
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_MSLICE(
            Product.builder()
                    .name("Pizza Pepperoni - Pizzeria Mslice")
                    .slug("pizza_pepperoni_pizzeria_mslice")
                    .description("Pizza pepperoni com molho de tomate, muçarela e rodelas de pepperoni picante.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Nice_pepperoni_pizza.jpg/1280px-Nice_pepperoni_pizza.jpg")
                    .price(new BigDecimal("9900.00"))
                    .position(2)
                    .organization(OrganizationData.PIZZERIA_MSLICE.getOrganization())
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_MSLICE(
            Product.builder()
                    .name("Pizza Portuguesa - Pizzeria Mslice")
                    .slug("pizza_portuguesa_pizzeria_mslice")
                    .description("Pizza portuguesa com fiambre, ovos, cebola, azeitonas e pimentos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Homemade_pizza_%2812%29.jpg/1280px-Homemade_pizza_%2812%29.jpg")
                    .price(new BigDecimal("10500.00"))
                    .position(3)
                    .organization(OrganizationData.PIZZERIA_MSLICE.getOrganization())
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_MSLICE(
            Product.builder()
                    .name("Pizza Vegetariana - Pizzeria Mslice")
                    .slug("pizza_vegetariana_pizzeria_mslice")
                    .description("Pizza vegetariana com beringela, curgete, cogumelos, milho e ervas frescas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Pizza_%2847955822167%29.jpg/1280px-Pizza_%2847955822167%29.jpg")
                    .price(new BigDecimal("9200.00"))
                    .position(4)
                    .organization(OrganizationData.PIZZERIA_MSLICE.getOrganization())
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_MSLICE(
            Product.builder()
                    .name("Calzone Recheado - Pizzeria Mslice")
                    .slug("calzone_recheado_pizzeria_mslice")
                    .description("Calzone com recheio de muçarela, fiambre e tomate, servido com molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Calzone_01.jpg/1280px-Calzone_01.jpg")
                    .price(new BigDecimal("8800.00"))
                    .position(5)
                    .organization(OrganizationData.PIZZERIA_MSLICE.getOrganization())
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_MANGUERINHA(
            Product.builder()
                    .name("Pizza Margherita - Pizzeria Manguerinha")
                    .slug("pizza_margherita_pizzeria_manguerinha")
                    .description("Pizza margherita com molho de tomate italiano, muçarela de búfala e manjericão fresco.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Pepperoni_pizza_%282%29.png/1280px-Pepperoni_pizza_%282%29.png")
                    .price(new BigDecimal("9000.00"))
                    .position(1)
                    .organization(OrganizationData.PIZZERIA_MANGUERINHA.getOrganization())
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_MANGUERINHA(
            Product.builder()
                    .name("Pizza Pepperoni - Pizzeria Manguerinha")
                    .slug("pizza_pepperoni_pizzeria_manguerinha")
                    .description("Pizza pepperoni com molho de tomate, muçarela e rodelas de pepperoni picante.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Pepperoni_pizza_%289519127849%29.jpg/1280px-Pepperoni_pizza_%289519127849%29.jpg")
                    .price(new BigDecimal("10400.00"))
                    .position(2)
                    .organization(OrganizationData.PIZZERIA_MANGUERINHA.getOrganization())
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_MANGUERINHA(
            Product.builder()
                    .name("Pizza Portuguesa - Pizzeria Manguerinha")
                    .slug("pizza_portuguesa_pizzeria_manguerinha")
                    .description("Pizza portuguesa com fiambre, ovos, cebola, azeitonas e pimentos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Pita-Bread-Pizza-2010.jpg/1280px-Pita-Bread-Pizza-2010.jpg")
                    .price(new BigDecimal("11000.00"))
                    .position(3)
                    .organization(OrganizationData.PIZZERIA_MANGUERINHA.getOrganization())
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_MANGUERINHA(
            Product.builder()
                    .name("Pizza Vegetariana - Pizzeria Manguerinha")
                    .slug("pizza_vegetariana_pizzeria_manguerinha")
                    .description("Pizza vegetariana com beringela, curgete, cogumelos, milho e ervas frescas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Pizza_%2847955824122%29.jpg/1280px-Pizza_%2847955824122%29.jpg")
                    .price(new BigDecimal("9700.00"))
                    .position(4)
                    .organization(OrganizationData.PIZZERIA_MANGUERINHA.getOrganization())
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_MANGUERINHA(
            Product.builder()
                    .name("Calzone Recheado - Pizzeria Manguerinha")
                    .slug("calzone_recheado_pizzeria_manguerinha")
                    .description("Calzone com recheio de muçarela, fiambre e tomate, servido com molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Calzone_Pugliese_Di_Cipolle_Sponsali.jpg/1280px-Calzone_Pugliese_Di_Cipolle_Sponsali.jpg")
                    .price(new BigDecimal("9300.00"))
                    .position(5)
                    .organization(OrganizationData.PIZZERIA_MANGUERINHA.getOrganization())
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_BELLA_VISTA(
            Product.builder()
                    .name("Pizza Margherita - Pizzeria Bella Vista")
                    .slug("pizza_margherita_pizzeria_bella_vista")
                    .description("Pizza margherita com molho de tomate italiano, muçarela de búfala e manjericão fresco.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Pepperoni_pizza_called_%22New_Jersey_Drive%22_from_Finnish_restaurant_Skiffer.jpg/1280px-Pepperoni_pizza_called_%22New_Jersey_Drive%22_from_Finnish_restaurant_Skiffer.jpg")
                    .price(new BigDecimal("9500.00"))
                    .position(1)
                    .organization(OrganizationData.PIZZERIA_BELLA_VISTA.getOrganization())
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_BELLA_VISTA(
            Product.builder()
                    .name("Pizza Pepperoni - Pizzeria Bella Vista")
                    .slug("pizza_pepperoni_pizzeria_bella_vista")
                    .description("Pizza pepperoni com molho de tomate, muçarela e rodelas de pepperoni picante.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Pepperoni_pizza_slice_on_a_red_plate.jpg/1280px-Pepperoni_pizza_slice_on_a_red_plate.jpg")
                    .price(new BigDecimal("10900.00"))
                    .position(2)
                    .organization(OrganizationData.PIZZERIA_BELLA_VISTA.getOrganization())
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_BELLA_VISTA(
            Product.builder()
                    .name("Pizza Portuguesa - Pizzeria Bella Vista")
                    .slug("pizza_portuguesa_pizzeria_bella_vista")
                    .description("Pizza portuguesa com fiambre, ovos, cebola, azeitonas e pimentos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Pizza_Capricciosa%2C_Mitchelli%27s_Pizza_Cafe%2C_2023_%2801%29.jpg/1280px-Pizza_Capricciosa%2C_Mitchelli%27s_Pizza_Cafe%2C_2023_%2801%29.jpg")
                    .price(new BigDecimal("11500.00"))
                    .position(3)
                    .organization(OrganizationData.PIZZERIA_BELLA_VISTA.getOrganization())
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_BELLA_VISTA(
            Product.builder()
                    .name("Pizza Vegetariana - Pizzeria Bella Vista")
                    .slug("pizza_vegetariana_pizzeria_bella_vista")
                    .description("Pizza vegetariana com beringela, curgete, cogumelos, milho e ervas frescas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Pizza_%2847955837793%29.jpg/1280px-Pizza_%2847955837793%29.jpg")
                    .price(new BigDecimal("10200.00"))
                    .position(4)
                    .organization(OrganizationData.PIZZERIA_BELLA_VISTA.getOrganization())
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_BELLA_VISTA(
            Product.builder()
                    .name("Calzone Recheado - Pizzeria Bella Vista")
                    .slug("calzone_recheado_pizzeria_bella_vista")
                    .description("Calzone com recheio de muçarela, fiambre e tomate, servido com molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Calzone_Soupi%C3%A9re_Normande_%28640x480%29.jpg/1280px-Calzone_Soupi%C3%A9re_Normande_%28640x480%29.jpg")
                    .price(new BigDecimal("9800.00"))
                    .position(5)
                    .organization(OrganizationData.PIZZERIA_BELLA_VISTA.getOrganization())
                    .build()
    ),

    HAMBURGUER_CLASSICO_SNACK_BAR_O_PONTO(
            Product.builder()
                    .name("Hambúrguer Clássico - Snack Bar O Ponto")
                    .slug("hamburguer_classico_snack_bar_o_ponto")
                    .description("Hambúrguer de 150 g de carne, queijo, alface, tomate e molho especial.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/A_big_Classic%2C_the_Flxible_bus_%282176172574%29.jpg/1280px-A_big_Classic%2C_the_Flxible_bus_%282176172574%29.jpg")
                    .price(new BigDecimal("3500.00"))
                    .position(1)
                    .organization(OrganizationData.SNACK_BAR_O_PONTO.getOrganization())
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_SNACK_BAR_O_PONTO(
            Product.builder()
                    .name("Cheeseburger Especial - Snack Bar O Ponto")
                    .slug("cheeseburger_especial_snack_bar_o_ponto")
                    .description("Cheeseburger com carne dupla, queijo cheddar, cebola caramelizada e bacon.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/7-Eleven_Cheeseburger_%2829692848751%29.jpg/1280px-7-Eleven_Cheeseburger_%2829692848751%29.jpg")
                    .price(new BigDecimal("4200.00"))
                    .position(2)
                    .organization(OrganizationData.SNACK_BAR_O_PONTO.getOrganization())
                    .build()
    ),

    BATATAS_FRITAS_SNACK_BAR_O_PONTO(
            Product.builder()
                    .name("Batatas Fritas - Snack Bar O Ponto")
                    .slug("batatas_fritas_snack_bar_o_ponto")
                    .description("Porção de batatas fritas crocantes com sal e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Burger_with_French_Fries.jpg/1280px-Burger_with_French_Fries.jpg")
                    .price(new BigDecimal("1800.00"))
                    .position(3)
                    .organization(OrganizationData.SNACK_BAR_O_PONTO.getOrganization())
                    .build()
    ),

    WRAP_DE_FRANGO_SNACK_BAR_O_PONTO(
            Product.builder()
                    .name("Wrap de Frango - Snack Bar O Ponto")
                    .slug("wrap_de_frango_snack_bar_o_ponto")
                    .description("Wrap de frango grelhado com salada, maionese picante e batata palha.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/-Egg_wrap_-Delicious_-Tempted_-Friends_-Fun_-Bike_Ride_-Golden_memories.jpg/1280px--Egg_wrap_-Delicious_-Tempted_-Friends_-Fun_-Bike_Ride_-Golden_memories.jpg")
                    .price(new BigDecimal("3200.00"))
                    .position(4)
                    .organization(OrganizationData.SNACK_BAR_O_PONTO.getOrganization())
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_SNACK_BAR_O_PONTO(
            Product.builder()
                    .name("Milk-shake de Chocolate - Snack Bar O Ponto")
                    .slug("milk_shake_de_chocolate_snack_bar_o_ponto")
                    .description("Milk-shake de chocolate com natas, servido bem frio em copo alto.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/2019_Take_Our_Daughters_and_Sons_to_Work_Day_%2820190425-OC-LSC-0307%29.jpg/1280px-2019_Take_Our_Daughters_and_Sons_to_Work_Day_%2820190425-OC-LSC-0307%29.jpg")
                    .price(new BigDecimal("2200.00"))
                    .position(5)
                    .organization(OrganizationData.SNACK_BAR_O_PONTO.getOrganization())
                    .build()
    ),

    HAMBURGUER_CLASSICO_BURGER_STATION_LUANDA(
            Product.builder()
                    .name("Hambúrguer Clássico - Burger Station Luanda")
                    .slug("hamburguer_classico_burger_station_luanda")
                    .description("Hambúrguer de 150 g de carne, queijo, alface, tomate e molho especial.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Andrews_classic_roadside_hamburgers_in_Dekalb_Hall_jeh.jpg/1280px-Andrews_classic_roadside_hamburgers_in_Dekalb_Hall_jeh.jpg")
                    .price(new BigDecimal("4000.00"))
                    .position(1)
                    .organization(OrganizationData.BURGER_STATION_LUANDA.getOrganization())
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_BURGER_STATION_LUANDA(
            Product.builder()
                    .name("Cheeseburger Especial - Burger Station Luanda")
                    .slug("cheeseburger_especial_burger_station_luanda")
                    .description("Cheeseburger com carne dupla, queijo cheddar, cebola caramelizada e bacon.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Avocado_bacon_cheeseburger_and_pineapple_smoothie.jpg/1280px-Avocado_bacon_cheeseburger_and_pineapple_smoothie.jpg")
                    .price(new BigDecimal("4700.00"))
                    .position(2)
                    .organization(OrganizationData.BURGER_STATION_LUANDA.getOrganization())
                    .build()
    ),

    BATATAS_FRITAS_BURGER_STATION_LUANDA(
            Product.builder()
                    .name("Batatas Fritas - Burger Station Luanda")
                    .slug("batatas_fritas_burger_station_luanda")
                    .description("Porção de batatas fritas crocantes com sal e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Fast_Food_in_Lusaka_10.jpg/1280px-Fast_Food_in_Lusaka_10.jpg")
                    .price(new BigDecimal("2300.00"))
                    .position(3)
                    .organization(OrganizationData.BURGER_STATION_LUANDA.getOrganization())
                    .build()
    ),

    WRAP_DE_FRANGO_BURGER_STATION_LUANDA(
            Product.builder()
                    .name("Wrap de Frango - Burger Station Luanda")
                    .slug("wrap_de_frango_burger_station_luanda")
                    .description("Wrap de frango grelhado com salada, maionese picante e batata palha.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/2017-05-28_AT_Wien_20_Brigittenau%2C_McDonald%27s_Rivergate%2C_Tomato_Salsa_Crispy_Chicken_Wrap_%2850776193102%29.jpg/1280px-2017-05-28_AT_Wien_20_Brigittenau%2C_McDonald%27s_Rivergate%2C_Tomato_Salsa_Crispy_Chicken_Wrap_%2850776193102%29.jpg")
                    .price(new BigDecimal("3700.00"))
                    .position(4)
                    .organization(OrganizationData.BURGER_STATION_LUANDA.getOrganization())
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_BURGER_STATION_LUANDA(
            Product.builder()
                    .name("Milk-shake de Chocolate - Burger Station Luanda")
                    .slug("milk_shake_de_chocolate_burger_station_luanda")
                    .description("Milk-shake de chocolate com natas, servido bem frio em copo alto.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Crowds_of_people_on_Santa_Monica_Beach%2C_ca.1900_%28CHS-820%29.jpg/1280px-Crowds_of_people_on_Santa_Monica_Beach%2C_ca.1900_%28CHS-820%29.jpg")
                    .price(new BigDecimal("2700.00"))
                    .position(5)
                    .organization(OrganizationData.BURGER_STATION_LUANDA.getOrganization())
                    .build()
    ),

    HAMBURGUER_CLASSICO_FAST_FOOD_KWANZA(
            Product.builder()
                    .name("Hambúrguer Clássico - Fast Food Kwanza")
                    .slug("hamburguer_classico_fast_food_kwanza")
                    .description("Hambúrguer de 150 g de carne, queijo, alface, tomate e molho especial.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Big_tower_hamburger.jpg/1280px-Big_tower_hamburger.jpg")
                    .price(new BigDecimal("4500.00"))
                    .position(1)
                    .organization(OrganizationData.FAST_FOOD_KWANZA.getOrganization())
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_FAST_FOOD_KWANZA(
            Product.builder()
                    .name("Cheeseburger Especial - Fast Food Kwanza")
                    .slug("cheeseburger_especial_fast_food_kwanza")
                    .description("Cheeseburger com carne dupla, queijo cheddar, cebola caramelizada e bacon.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/BK_Ultimate_Bacon_Cheeseburger.jpg/1280px-BK_Ultimate_Bacon_Cheeseburger.jpg")
                    .price(new BigDecimal("5200.00"))
                    .position(2)
                    .organization(OrganizationData.FAST_FOOD_KWANZA.getOrganization())
                    .build()
    ),

    BATATAS_FRITAS_FAST_FOOD_KWANZA(
            Product.builder()
                    .name("Batatas Fritas - Fast Food Kwanza")
                    .slug("batatas_fritas_fast_food_kwanza")
                    .description("Porção de batatas fritas crocantes com sal e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Fast_Food_in_Lusaka_11.jpg/1280px-Fast_Food_in_Lusaka_11.jpg")
                    .price(new BigDecimal("2800.00"))
                    .position(3)
                    .organization(OrganizationData.FAST_FOOD_KWANZA.getOrganization())
                    .build()
    ),

    WRAP_DE_FRANGO_FAST_FOOD_KWANZA(
            Product.builder()
                    .name("Wrap de Frango - Fast Food Kwanza")
                    .slug("wrap_de_frango_fast_food_kwanza")
                    .description("Wrap de frango grelhado com salada, maionese picante e batata palha.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/201906_Orlean%27s_Chicken_Wrap_from_Huatie_Group.jpg/1280px-201906_Orlean%27s_Chicken_Wrap_from_Huatie_Group.jpg")
                    .price(new BigDecimal("4200.00"))
                    .position(4)
                    .organization(OrganizationData.FAST_FOOD_KWANZA.getOrganization())
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_FAST_FOOD_KWANZA(
            Product.builder()
                    .name("Milk-shake de Chocolate - Fast Food Kwanza")
                    .slug("milk_shake_de_chocolate_fast_food_kwanza")
                    .description("Milk-shake de chocolate com natas, servido bem frio em copo alto.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/DFC_0816_A_close-up_of_a_hand_holding_a_plastic_cup_while_a_chocolatey_smoothie_is_poured_over_ice_from_a_blender.jpg/1280px-DFC_0816_A_close-up_of_a_hand_holding_a_plastic_cup_while_a_chocolatey_smoothie_is_poured_over_ice_from_a_blender.jpg")
                    .price(new BigDecimal("3200.00"))
                    .position(5)
                    .organization(OrganizationData.FAST_FOOD_KWANZA.getOrganization())
                    .build()
    ),

    HAMBURGUER_CLASSICO_LANCHES_DO_MIRAMAR(
            Product.builder()
                    .name("Hambúrguer Clássico - Lanches do Miramar")
                    .slug("hamburguer_classico_lanches_do_miramar")
                    .description("Hambúrguer de 150 g de carne, queijo, alface, tomate e molho especial.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Burger_Drwala_-_classic_version_in_McDonald%27s%2C_winter_2024_2025%2C_Gliwice%2C_Silesian_Voivodeship%2C_Poland%2C_January_2025.jpg/1280px-Burger_Drwala_-_classic_version_in_McDonald%27s%2C_winter_2024_2025%2C_Gliwice%2C_Silesian_Voivodeship%2C_Poland%2C_January_2025.jpg")
                    .price(new BigDecimal("5000.00"))
                    .position(1)
                    .organization(OrganizationData.LANCHES_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_LANCHES_DO_MIRAMAR(
            Product.builder()
                    .name("Cheeseburger Especial - Lanches do Miramar")
                    .slug("cheeseburger_especial_lanches_do_miramar")
                    .description("Cheeseburger com carne dupla, queijo cheddar, cebola caramelizada e bacon.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Bacon_Cheeseburger_at_Copped_Hall_open_day_event%2C_Essex%2C_England.jpg/1280px-Bacon_Cheeseburger_at_Copped_Hall_open_day_event%2C_Essex%2C_England.jpg")
                    .price(new BigDecimal("5700.00"))
                    .position(2)
                    .organization(OrganizationData.LANCHES_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    BATATAS_FRITAS_LANCHES_DO_MIRAMAR(
            Product.builder()
                    .name("Batatas Fritas - Lanches do Miramar")
                    .slug("batatas_fritas_lanches_do_miramar")
                    .description("Porção de batatas fritas crocantes com sal e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Fast_Food_in_Lusaka_12.jpg/1280px-Fast_Food_in_Lusaka_12.jpg")
                    .price(new BigDecimal("3300.00"))
                    .position(3)
                    .organization(OrganizationData.LANCHES_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    WRAP_DE_FRANGO_LANCHES_DO_MIRAMAR(
            Product.builder()
                    .name("Wrap de Frango - Lanches do Miramar")
                    .slug("wrap_de_frango_lanches_do_miramar")
                    .description("Wrap de frango grelhado com salada, maionese picante e batata palha.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Bacon-wrapped_Chicken_Breast2_%2810508582914%29.jpg/1280px-Bacon-wrapped_Chicken_Breast2_%2810508582914%29.jpg")
                    .price(new BigDecimal("4700.00"))
                    .position(4)
                    .organization(OrganizationData.LANCHES_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_LANCHES_DO_MIRAMAR(
            Product.builder()
                    .name("Milk-shake de Chocolate - Lanches do Miramar")
                    .slug("milk_shake_de_chocolate_lanches_do_miramar")
                    .description("Milk-shake de chocolate com natas, servido bem frio em copo alto.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/Double_the_Chill%2C_Double_the_Delight.jpg/1280px-Double_the_Chill%2C_Double_the_Delight.jpg")
                    .price(new BigDecimal("3700.00"))
                    .position(5)
                    .organization(OrganizationData.LANCHES_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    HAMBURGUER_CLASSICO_FOOD_TRUCK_TAXI_AZUL(
            Product.builder()
                    .name("Hambúrguer Clássico - Food Truck Táxi Azul")
                    .slug("hamburguer_classico_food_truck_taxi_azul")
                    .description("Hambúrguer de 150 g de carne, queijo, alface, tomate e molho especial.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Classic_Burger_-_Joe%27s_Burger_House_2024-07-07.jpg/1280px-Classic_Burger_-_Joe%27s_Burger_House_2024-07-07.jpg")
                    .price(new BigDecimal("5500.00"))
                    .position(1)
                    .organization(OrganizationData.FOOD_TRUCK_TAXI_AZUL.getOrganization())
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_FOOD_TRUCK_TAXI_AZUL(
            Product.builder()
                    .name("Cheeseburger Especial - Food Truck Táxi Azul")
                    .slug("cheeseburger_especial_food_truck_taxi_azul")
                    .description("Cheeseburger com carne dupla, queijo cheddar, cebola caramelizada e bacon.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Cheeseburger_-_BrewDog_Camden%2C_Camden_Town%2C_London.jpg/1280px-Cheeseburger_-_BrewDog_Camden%2C_Camden_Town%2C_London.jpg")
                    .price(new BigDecimal("6200.00"))
                    .position(2)
                    .organization(OrganizationData.FOOD_TRUCK_TAXI_AZUL.getOrganization())
                    .build()
    ),

    BATATAS_FRITAS_FOOD_TRUCK_TAXI_AZUL(
            Product.builder()
                    .name("Batatas Fritas - Food Truck Táxi Azul")
                    .slug("batatas_fritas_food_truck_taxi_azul")
                    .description("Porção de batatas fritas crocantes com sal e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Fast_food_01_ebru.jpg/1280px-Fast_food_01_ebru.jpg")
                    .price(new BigDecimal("3800.00"))
                    .position(3)
                    .organization(OrganizationData.FOOD_TRUCK_TAXI_AZUL.getOrganization())
                    .build()
    ),

    WRAP_DE_FRANGO_FOOD_TRUCK_TAXI_AZUL(
            Product.builder()
                    .name("Wrap de Frango - Food Truck Táxi Azul")
                    .slug("wrap_de_frango_food_truck_taxi_azul")
                    .description("Wrap de frango grelhado com salada, maionese picante e batata palha.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Bacon-wrapped_Chicken_Breast_%2810508565854%29.jpg/1280px-Bacon-wrapped_Chicken_Breast_%2810508565854%29.jpg")
                    .price(new BigDecimal("5200.00"))
                    .position(4)
                    .organization(OrganizationData.FOOD_TRUCK_TAXI_AZUL.getOrganization())
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_FOOD_TRUCK_TAXI_AZUL(
            Product.builder()
                    .name("Milk-shake de Chocolate - Food Truck Táxi Azul")
                    .slug("milk_shake_de_chocolate_food_truck_taxi_azul")
                    .description("Milk-shake de chocolate com natas, servido bem frio em copo alto.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/GLASS_OF_HAPPINESS.jpg/1280px-GLASS_OF_HAPPINESS.jpg")
                    .price(new BigDecimal("4200.00"))
                    .position(5)
                    .organization(OrganizationData.FOOD_TRUCK_TAXI_AZUL.getOrganization())
                    .build()
    ),

    BIFE_GRELHADO_CHURRASQUEIRA_DO_ZE(
            Product.builder()
                    .name("Bife Grelhado - Churrasqueira do Zé")
                    .slug("bife_grelhado_churrasqueira_do_ze")
                    .description("Bife de novilho grelhado no carvão, servido com batatas e salada verde.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Burger_and_fries_on_a_wooden_plate.jpg/1280px-Burger_and_fries_on_a_wooden_plate.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(1)
                    .organization(OrganizationData.CHURRASQUEIRA_DO_ZE.getOrganization())
                    .build()
    ),

    FRANGO_GRELHADO_CHURRASQUEIRA_DO_ZE(
            Product.builder()
                    .name("Frango Grelhado - Churrasqueira do Zé")
                    .slug("frango_grelhado_churrasqueira_do_ze")
                    .description("Frango grelhado com molho de alho, acompanhamento de arroz e legumes.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/Chicken_I_m_a_g_e.jpg/1280px-Chicken_I_m_a_g_e.jpg")
                    .price(new BigDecimal("5500.00"))
                    .position(2)
                    .organization(OrganizationData.CHURRASQUEIRA_DO_ZE.getOrganization())
                    .build()
    ),

    COSTELETA_DE_PORCO_CHURRASQUEIRA_DO_ZE(
            Product.builder()
                    .name("Costeleta de Porco - Churrasqueira do Zé")
                    .slug("costeleta_de_porco_churrasqueira_do_ze")
                    .description("Costeleta de porco grelhada com maçã assada e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/7323Cuisine_of_Bulacan_01.jpg/1280px-7323Cuisine_of_Bulacan_01.jpg")
                    .price(new BigDecimal("6500.00"))
                    .position(3)
                    .organization(OrganizationData.CHURRASQUEIRA_DO_ZE.getOrganization())
                    .build()
    ),

    ESPETO_MISTO_CHURRASQUEIRA_DO_ZE(
            Product.builder()
                    .name("Espeto Misto - Churrasqueira do Zé")
                    .slug("espeto_misto_churrasqueira_do_ze")
                    .description("Espeto misto de carne, frango e camarão com arroz e salada.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/DFC_3953_Skewered_pieces_of_fresh_squid_ready_for_grilling_at_a_busy_seafood_market.jpg/1280px-DFC_3953_Skewered_pieces_of_fresh_squid_ready_for_grilling_at_a_busy_seafood_market.jpg")
                    .price(new BigDecimal("6200.00"))
                    .position(4)
                    .organization(OrganizationData.CHURRASQUEIRA_DO_ZE.getOrganization())
                    .build()
    ),

    ESPETO_DE_CAMARAO_CHURRASQUEIRA_DO_ZE(
            Product.builder()
                    .name("Espeto de Camarão - Churrasqueira do Zé")
                    .slug("espeto_de_camarao_churrasqueira_do_ze")
                    .description("Espeto de camarão grelhado com limão, servidos com batatas fritas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Bacon_Wrapped_Shrimp_Skewers_at_The_Revel_Patio_Grill.jpg/1280px-Bacon_Wrapped_Shrimp_Skewers_at_The_Revel_Patio_Grill.jpg")
                    .price(new BigDecimal("8500.00"))
                    .position(5)
                    .organization(OrganizationData.CHURRASQUEIRA_DO_ZE.getOrganization())
                    .build()
    ),

    BIFE_GRELHADO_GRELHADOS_MIUDOS_KIZUA(
            Product.builder()
                    .name("Bife Grelhado - Grelhados Miúdos Kizua")
                    .slug("bife_grelhado_grelhados_miudos_kizua")
                    .description("Bife de novilho grelhado no carvão, servido com batatas e salada verde.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/DFC_2081_Juicy_grilled_steak_topped_with_herb_butter_served_with_fries_saut%C3%A9ed_green_beans_coleslaw_and_a_side_of_gravy.jpg/1280px-DFC_2081_Juicy_grilled_steak_topped_with_herb_butter_served_with_fries_saut%C3%A9ed_green_beans_coleslaw_and_a_side_of_gravy.jpg")
                    .price(new BigDecimal("8000.00"))
                    .position(1)
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .build()
    ),

    FRANGO_GRELHADO_GRELHADOS_MIUDOS_KIZUA(
            Product.builder()
                    .name("Frango Grelhado - Grelhados Miúdos Kizua")
                    .slug("frango_grelhado_grelhados_miudos_kizua")
                    .description("Frango grelhado com molho de alho, acompanhamento de arroz e legumes.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Grill_chicken.jpg/1280px-Grill_chicken.jpg")
                    .price(new BigDecimal("6000.00"))
                    .position(2)
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .build()
    ),

    COSTELETA_DE_PORCO_GRELHADOS_MIUDOS_KIZUA(
            Product.builder()
                    .name("Costeleta de Porco - Grelhados Miúdos Kizua")
                    .slug("costeleta_de_porco_grelhados_miudos_kizua")
                    .description("Costeleta de porco grelhada com maçã assada e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/7323Cuisine_of_Bulacan_02.jpg/1280px-7323Cuisine_of_Bulacan_02.jpg")
                    .price(new BigDecimal("7000.00"))
                    .position(3)
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .build()
    ),

    ESPETO_MISTO_GRELHADOS_MIUDOS_KIZUA(
            Product.builder()
                    .name("Espeto Misto - Grelhados Miúdos Kizua")
                    .slug("espeto_misto_grelhados_miudos_kizua")
                    .description("Espeto misto de carne, frango e camarão com arroz e salada.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/DFC_5241-_Colorful_skewers_of_steamed_and_grilled_dim_sum_-_bright_yellow_siu_mai%2C_green_vegetable_dumplings%2C_seaweed-wrapped_bites_and_savory_meat_balls_-_ready_to_enjoy_at_a_bustling_Thai_street_food_stall.jpg/1280px-thumbnail.jpg")
                    .price(new BigDecimal("6700.00"))
                    .position(4)
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .build()
    ),

    ESPETO_DE_CAMARAO_GRELHADOS_MIUDOS_KIZUA(
            Product.builder()
                    .name("Espeto de Camarão - Grelhados Miúdos Kizua")
                    .slug("espeto_de_camarao_grelhados_miudos_kizua")
                    .description("Espeto de camarão grelhado com limão, servidos com batatas fritas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Bread_in_the_Hellenic_Republic.jpg/1280px-Bread_in_the_Hellenic_Republic.jpg")
                    .price(new BigDecimal("9000.00"))
                    .position(5)
                    .organization(OrganizationData.GRELHADOS_MIUDOS_KIZUA.getOrganization())
                    .build()
    ),

    BIFE_GRELHADO_ESPETOS_DA_BAIA(
            Product.builder()
                    .name("Bife Grelhado - Espetos da Baía")
                    .slug("bife_grelhado_espetos_da_baia")
                    .description("Bife de novilho grelhado no carvão, servido com batatas e salada verde.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Entrec%C3%B4te_at_restaurant_Grill_it%21_Tapiola_Garden.jpg/1280px-Entrec%C3%B4te_at_restaurant_Grill_it%21_Tapiola_Garden.jpg")
                    .price(new BigDecimal("8500.00"))
                    .position(1)
                    .organization(OrganizationData.ESPETOS_DA_BAIA.getOrganization())
                    .build()
    ),

    FRANGO_GRELHADO_ESPETOS_DA_BAIA(
            Product.builder()
                    .name("Frango Grelhado - Espetos da Baía")
                    .slug("frango_grelhado_espetos_da_baia")
                    .description("Frango grelhado com molho de alho, acompanhamento de arroz e legumes.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Grilled_chicken_and_chips.jpg/1280px-Grilled_chicken_and_chips.jpg")
                    .price(new BigDecimal("6500.00"))
                    .position(2)
                    .organization(OrganizationData.ESPETOS_DA_BAIA.getOrganization())
                    .build()
    ),

    COSTELETA_DE_PORCO_ESPETOS_DA_BAIA(
            Product.builder()
                    .name("Costeleta de Porco - Espetos da Baía")
                    .slug("costeleta_de_porco_espetos_da_baia")
                    .description("Costeleta de porco grelhada com maçã assada e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/7323Cuisine_of_Bulacan_08.jpg/1280px-7323Cuisine_of_Bulacan_08.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(3)
                    .organization(OrganizationData.ESPETOS_DA_BAIA.getOrganization())
                    .build()
    ),

    ESPETO_MISTO_ESPETOS_DA_BAIA(
            Product.builder()
                    .name("Espeto Misto - Espetos da Baía")
                    .slug("espeto_misto_espetos_da_baia")
                    .description("Espeto misto de carne, frango e camarão com arroz e salada.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_%284340669590%29.jpg/1280px-Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_%284340669590%29.jpg")
                    .price(new BigDecimal("7200.00"))
                    .position(4)
                    .organization(OrganizationData.ESPETOS_DA_BAIA.getOrganization())
                    .build()
    ),

    ESPETO_DE_CAMARAO_ESPETOS_DA_BAIA(
            Product.builder()
                    .name("Espeto de Camarão - Espetos da Baía")
                    .slug("espeto_de_camarao_espetos_da_baia")
                    .description("Espeto de camarão grelhado com limão, servidos com batatas fritas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Brochette_de_la_mer_au_restaurant_Le_Saladier_%C3%A0_Villefranche-sur-Sa%C3%B4ne.JPG/1280px-Brochette_de_la_mer_au_restaurant_Le_Saladier_%C3%A0_Villefranche-sur-Sa%C3%B4ne.JPG")
                    .price(new BigDecimal("9500.00"))
                    .position(5)
                    .organization(OrganizationData.ESPETOS_DA_BAIA.getOrganization())
                    .build()
    ),

    BIFE_GRELHADO_CHURRASCO_KING(
            Product.builder()
                    .name("Bife Grelhado - Churrasco King")
                    .slug("bife_grelhado_churrasco_king")
                    .description("Bife de novilho grelhado no carvão, servido com batatas e salada verde.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Grilling_steak.jpg/1280px-Grilling_steak.jpg")
                    .price(new BigDecimal("9000.00"))
                    .position(1)
                    .organization(OrganizationData.CHURRASCO_KING.getOrganization())
                    .build()
    ),

    FRANGO_GRELHADO_CHURRASCO_KING(
            Product.builder()
                    .name("Frango Grelhado - Churrasco King")
                    .slug("frango_grelhado_churrasco_king")
                    .description("Frango grelhado com molho de alho, acompanhamento de arroz e legumes.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Grilled_chicken_and_fries.jpg/1280px-Grilled_chicken_and_fries.jpg")
                    .price(new BigDecimal("7000.00"))
                    .position(2)
                    .organization(OrganizationData.CHURRASCO_KING.getOrganization())
                    .build()
    ),

    COSTELETA_DE_PORCO_CHURRASCO_KING(
            Product.builder()
                    .name("Costeleta de Porco - Churrasco King")
                    .slug("costeleta_de_porco_churrasco_king")
                    .description("Costeleta de porco grelhada com maçã assada e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/7323Cuisine_of_Bulacan_09.jpg/1280px-7323Cuisine_of_Bulacan_09.jpg")
                    .price(new BigDecimal("8000.00"))
                    .position(3)
                    .organization(OrganizationData.CHURRASCO_KING.getOrganization())
                    .build()
    ),

    ESPETO_MISTO_CHURRASCO_KING(
            Product.builder()
                    .name("Espeto Misto - Churrasco King")
                    .slug("espeto_misto_churrasco_king")
                    .description("Espeto misto de carne, frango e camarão com arroz e salada.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_-_photo_by_Julia_%284340669958%29.jpg/1280px-Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_-_photo_by_Julia_%284340669958%29.jpg")
                    .price(new BigDecimal("7700.00"))
                    .position(4)
                    .organization(OrganizationData.CHURRASCO_KING.getOrganization())
                    .build()
    ),

    ESPETO_DE_CAMARAO_CHURRASCO_KING(
            Product.builder()
                    .name("Espeto de Camarão - Churrasco King")
                    .slug("espeto_de_camarao_churrasco_king")
                    .description("Espeto de camarão grelhado com limão, servidos com batatas fritas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Classic_Platter_for_2_-_Rosa%27s_Thai_2025-07-22.jpg/1280px-Classic_Platter_for_2_-_Rosa%27s_Thai_2025-07-22.jpg")
                    .price(new BigDecimal("10000.00"))
                    .position(5)
                    .organization(OrganizationData.CHURRASCO_KING.getOrganization())
                    .build()
    ),

    BIFE_GRELHADO_GRELHADO_DA_CASA(
            Product.builder()
                    .name("Bife Grelhado - Grelhado da Casa")
                    .slug("bife_grelhado_grelhado_da_casa")
                    .description("Bife de novilho grelhado no carvão, servido com batatas e salada verde.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Grilled_chicken_served_with_creamy_mashed_potatoes_and_fresh_vegetables_undefined.jpg/1280px-Grilled_chicken_served_with_creamy_mashed_potatoes_and_fresh_vegetables_undefined.jpg")
                    .price(new BigDecimal("9500.00"))
                    .position(1)
                    .organization(OrganizationData.GRELHADO_DA_CASA.getOrganization())
                    .build()
    ),

    FRANGO_GRELHADO_GRELHADO_DA_CASA(
            Product.builder()
                    .name("Frango Grelhado - Grelhado da Casa")
                    .slug("frango_grelhado_grelhado_da_casa")
                    .description("Frango grelhado com molho de alho, acompanhamento de arroz e legumes.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Grilled_chicken_with_fries.jpg/1280px-Grilled_chicken_with_fries.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(2)
                    .organization(OrganizationData.GRELHADO_DA_CASA.getOrganization())
                    .build()
    ),

    COSTELETA_DE_PORCO_GRELHADO_DA_CASA(
            Product.builder()
                    .name("Costeleta de Porco - Grelhado da Casa")
                    .slug("costeleta_de_porco_grelhado_da_casa")
                    .description("Costeleta de porco grelhada com maçã assada e molho da casa.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/7323Cuisine_of_Bulacan_10.jpg/1280px-7323Cuisine_of_Bulacan_10.jpg")
                    .price(new BigDecimal("8500.00"))
                    .position(3)
                    .organization(OrganizationData.GRELHADO_DA_CASA.getOrganization())
                    .build()
    ),

    ESPETO_MISTO_GRELHADO_DA_CASA(
            Product.builder()
                    .name("Espeto Misto - Grelhado da Casa")
                    .slug("espeto_misto_grelhado_da_casa")
                    .description("Espeto misto de carne, frango e camarão com arroz e salada.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Street_Foods_Chorizzo.jpg/1280px-Street_Foods_Chorizzo.jpg")
                    .price(new BigDecimal("8200.00"))
                    .position(4)
                    .organization(OrganizationData.GRELHADO_DA_CASA.getOrganization())
                    .build()
    ),

    ESPETO_DE_CAMARAO_GRELHADO_DA_CASA(
            Product.builder()
                    .name("Espeto de Camarão - Grelhado da Casa")
                    .slug("espeto_de_camarao_grelhado_da_casa")
                    .description("Espeto de camarão grelhado com limão, servidos com batatas fritas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/DFC_5231-_Skewered_sausages_and_fish_balls_grilling_and_bathing_in_a_savory_sauce_at_a_bustling_Thai_street_food_stall.jpg/1280px-DFC_5231-_Skewered_sausages_and_fish_balls_grilling_and_bathing_in_a_savory_sauce_at_a_bustling_Thai_street_food_stall.jpg")
                    .price(new BigDecimal("10500.00"))
                    .position(5)
                    .organization(OrganizationData.GRELHADO_DA_CASA.getOrganization())
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_BAIA_DE_LUANDA(
            Product.builder()
                    .name("Arroz de Marisco - Marisqueira Baía de Luanda")
                    .slug("arroz_de_marisco_marisqueira_baia_de_luanda")
                    .description("Arroz de marisco com camarão, lulas e ameiões, servido com salada verde.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6108_1.jpg/1280px-20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6108_1.jpg")
                    .price(new BigDecimal("15000.00"))
                    .position(1)
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_BAIA_DE_LUANDA(
            Product.builder()
                    .name("Calulu de Camarão - Marisqueira Baía de Luanda")
                    .slug("calulu_de_camarao_marisqueira_baia_de_luanda")
                    .description("Calulu de camarão com tomate, acompanhamento de pirão de farinha de mandioca.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Bangladeshi_Prawn_Curry.jpg/1280px-Bangladeshi_Prawn_Curry.jpg")
                    .price(new BigDecimal("12000.00"))
                    .position(2)
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA(
            Product.builder()
                    .name("Filete de Robalo Grelhado - Marisqueira Baía de Luanda")
                    .slug("filete_de_robalo_grelhado_marisqueira_baia_de_luanda")
                    .description("Filete de robalo grelhado no carvão com limão de Benguela e batatas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Auf_Holzbretter_genagelte_Lachsfilets_werden_am_offenen_Feuer_gegrillt%2C_Bonner_Weihnachtsmarkt_2025.jpg/1280px-Auf_Holzbretter_genagelte_Lachsfilets_werden_am_offenen_Feuer_gegrillt%2C_Bonner_Weihnachtsmarkt_2025.jpg")
                    .price(new BigDecimal("13500.00"))
                    .position(3)
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA(
            Product.builder()
                    .name("Camarão Grelhado - Marisqueira Baía de Luanda")
                    .slug("camarao_grelhado_marisqueira_baia_de_luanda")
                    .description("Camarão grelhado com alho e coentros, servido com arroz de coco.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/DZ6_0565_Sizzling_seafood_pad_thai_topped_with_a_whole_grilled_prawn_served_with_fresh_lime_and_scallions.jpg/1280px-DZ6_0565_Sizzling_seafood_pad_thai_topped_with_a_whole_grilled_prawn_served_with_fresh_lime_and_scallions.jpg")
                    .price(new BigDecimal("16000.00"))
                    .position(4)
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_BAIA_DE_LUANDA(
            Product.builder()
                    .name("Polvo à Lagareiro - Marisqueira Baía de Luanda")
                    .slug("polvo_a_lagareiro_marisqueira_baia_de_luanda")
                    .description("Polvo cozinhado na lagareiro com batata assada e azeite de alho.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Calamari_grillati.JPG/1280px-Calamari_grillati.JPG")
                    .price(new BigDecimal("14000.00"))
                    .position(5)
                    .organization(OrganizationData.MARISQUEIRA_BAIA_DE_LUANDA.getOrganization())
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DO_PORTO(
            Product.builder()
                    .name("Arroz de Marisco - Marisqueira do Porto")
                    .slug("arroz_de_marisco_marisqueira_do_porto")
                    .description("Arroz de marisco com camarão, lulas e ameiões, servido com salada verde.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6109.jpg/1280px-20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6109.jpg")
                    .price(new BigDecimal("15500.00"))
                    .position(1)
                    .organization(OrganizationData.MARISQUEIRA_DO_PORTO.getOrganization())
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DO_PORTO(
            Product.builder()
                    .name("Calulu de Camarão - Marisqueira do Porto")
                    .slug("calulu_de_camarao_marisqueira_do_porto")
                    .description("Calulu de camarão com tomate, acompanhamento de pirão de farinha de mandioca.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Bengali_Prawn_Curry.jpg/1280px-Bengali_Prawn_Curry.jpg")
                    .price(new BigDecimal("12500.00"))
                    .position(2)
                    .organization(OrganizationData.MARISQUEIRA_DO_PORTO.getOrganization())
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_PORTO(
            Product.builder()
                    .name("Filete de Robalo Grelhado - Marisqueira do Porto")
                    .slug("filete_de_robalo_grelhado_marisqueira_do_porto")
                    .description("Filete de robalo grelhado no carvão com limão de Benguela e batatas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Dinner_at_Bardsley%27s_2023-08-29.jpg/1280px-Dinner_at_Bardsley%27s_2023-08-29.jpg")
                    .price(new BigDecimal("14000.00"))
                    .position(3)
                    .organization(OrganizationData.MARISQUEIRA_DO_PORTO.getOrganization())
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DO_PORTO(
            Product.builder()
                    .name("Camarão Grelhado - Marisqueira do Porto")
                    .slug("camarao_grelhado_marisqueira_do_porto")
                    .description("Camarão grelhado com alho e coentros, servido com arroz de coco.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Grilled_Game_Meat_-_Prawns_-_Calamari_-_Frites_-_on_a_white_plate.jpg/1280px-Grilled_Game_Meat_-_Prawns_-_Calamari_-_Frites_-_on_a_white_plate.jpg")
                    .price(new BigDecimal("16500.00"))
                    .position(4)
                    .organization(OrganizationData.MARISQUEIRA_DO_PORTO.getOrganization())
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DO_PORTO(
            Product.builder()
                    .name("Polvo à Lagareiro - Marisqueira do Porto")
                    .slug("polvo_a_lagareiro_marisqueira_do_porto")
                    .description("Polvo cozinhado na lagareiro com batata assada e azeite de alho.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/DFC_0313_Skewered_grilled_baby_octopus_glistening_with_a_savory_glaze_and_served_on_a_bed_of_fresh_greens.jpg/1280px-DFC_0313_Skewered_grilled_baby_octopus_glistening_with_a_savory_glaze_and_served_on_a_bed_of_fresh_greens.jpg")
                    .price(new BigDecimal("14500.00"))
                    .position(5)
                    .organization(OrganizationData.MARISQUEIRA_DO_PORTO.getOrganization())
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_KILAMBA(
            Product.builder()
                    .name("Arroz de Marisco - Marisqueira Kilamba")
                    .slug("arroz_de_marisco_marisqueira_kilamba")
                    .description("Arroz de marisco com camarão, lulas e ameiões, servido com salada verde.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6110.jpg/1280px-20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6110.jpg")
                    .price(new BigDecimal("16000.00"))
                    .position(1)
                    .organization(OrganizationData.MARISQUEIRA_KILAMBA.getOrganization())
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_KILAMBA(
            Product.builder()
                    .name("Calulu de Camarão - Marisqueira Kilamba")
                    .slug("calulu_de_camarao_marisqueira_kilamba")
                    .description("Calulu de camarão com tomate, acompanhamento de pirão de farinha de mandioca.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Bengali_Shrimp_Curry.jpg/1280px-Bengali_Shrimp_Curry.jpg")
                    .price(new BigDecimal("13000.00"))
                    .position(2)
                    .organization(OrganizationData.MARISQUEIRA_KILAMBA.getOrganization())
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_KILAMBA(
            Product.builder()
                    .name("Filete de Robalo Grelhado - Marisqueira Kilamba")
                    .slug("filete_de_robalo_grelhado_marisqueira_kilamba")
                    .description("Filete de robalo grelhado no carvão com limão de Benguela e batatas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Fish_and_dill_for_2_-_Cha_Ca_La_Vong_VND120000_each.jpg/1280px-Fish_and_dill_for_2_-_Cha_Ca_La_Vong_VND120000_each.jpg")
                    .price(new BigDecimal("14500.00"))
                    .position(3)
                    .organization(OrganizationData.MARISQUEIRA_KILAMBA.getOrganization())
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_KILAMBA(
            Product.builder()
                    .name("Camarão Grelhado - Marisqueira Kilamba")
                    .slug("camarao_grelhado_marisqueira_kilamba")
                    .description("Camarão grelhado com alho e coentros, servido com arroz de coco.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Grilled_prawn_with_herb.jpg/1280px-Grilled_prawn_with_herb.jpg")
                    .price(new BigDecimal("17000.00"))
                    .position(4)
                    .organization(OrganizationData.MARISQUEIRA_KILAMBA.getOrganization())
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_KILAMBA(
            Product.builder()
                    .name("Polvo à Lagareiro - Marisqueira Kilamba")
                    .slug("polvo_a_lagareiro_marisqueira_kilamba")
                    .description("Polvo cozinhado na lagareiro com batata assada e azeite de alho.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/DSCF1107_Skewered_baby_octopus_grilled_to_a_golden_finish_ready_to_be_served_as_a_savory_street-food_snack.jpg/1280px-DSCF1107_Skewered_baby_octopus_grilled_to_a_golden_finish_ready_to_be_served_as_a_savory_street-food_snack.jpg")
                    .price(new BigDecimal("15000.00"))
                    .position(5)
                    .organization(OrganizationData.MARISQUEIRA_KILAMBA.getOrganization())
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DE_BENGUELA(
            Product.builder()
                    .name("Arroz de Marisco - Marisqueira de Benguela")
                    .slug("arroz_de_marisco_marisqueira_de_benguela")
                    .description("Arroz de marisco com camarão, lulas e ameiões, servido com salada verde.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Arroz_caldoso_con_mariscos.jpg/1280px-Arroz_caldoso_con_mariscos.jpg")
                    .price(new BigDecimal("16500.00"))
                    .position(1)
                    .organization(OrganizationData.MARISQUEIRA_DE_BENGUELA.getOrganization())
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DE_BENGUELA(
            Product.builder()
                    .name("Calulu de Camarão - Marisqueira de Benguela")
                    .slug("calulu_de_camarao_marisqueira_de_benguela")
                    .description("Calulu de camarão com tomate, acompanhamento de pirão de farinha de mandioca.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Cocunut_Prawn_Curry.JPG/1280px-Cocunut_Prawn_Curry.JPG")
                    .price(new BigDecimal("13500.00"))
                    .position(2)
                    .organization(OrganizationData.MARISQUEIRA_DE_BENGUELA.getOrganization())
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DE_BENGUELA(
            Product.builder()
                    .name("Filete de Robalo Grelhado - Marisqueira de Benguela")
                    .slug("filete_de_robalo_grelhado_marisqueira_de_benguela")
                    .description("Filete de robalo grelhado no carvão com limão de Benguela e batatas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Fish_and_dill_for_2_-_close-up_-_Cha_Ca_La_Vong_VND120000_each.jpg/1280px-Fish_and_dill_for_2_-_close-up_-_Cha_Ca_La_Vong_VND120000_each.jpg")
                    .price(new BigDecimal("15000.00"))
                    .position(3)
                    .organization(OrganizationData.MARISQUEIRA_DE_BENGUELA.getOrganization())
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DE_BENGUELA(
            Product.builder()
                    .name("Camarão Grelhado - Marisqueira de Benguela")
                    .slug("camarao_grelhado_marisqueira_de_benguela")
                    .description("Camarão grelhado com alho e coentros, servido com arroz de coco.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Jacob%27s_Restaurant_-_Jan_2019_-_Stierch_01.jpg/1280px-Jacob%27s_Restaurant_-_Jan_2019_-_Stierch_01.jpg")
                    .price(new BigDecimal("17500.00"))
                    .position(4)
                    .organization(OrganizationData.MARISQUEIRA_DE_BENGUELA.getOrganization())
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DE_BENGUELA(
            Product.builder()
                    .name("Polvo à Lagareiro - Marisqueira de Benguela")
                    .slug("polvo_a_lagareiro_marisqueira_de_benguela")
                    .description("Polvo cozinhado na lagareiro com batata assada e azeite de alho.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Grilled_octopus_2.jpg/1280px-Grilled_octopus_2.jpg")
                    .price(new BigDecimal("15500.00"))
                    .position(5)
                    .organization(OrganizationData.MARISQUEIRA_DE_BENGUELA.getOrganization())
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DO_NAMIBE(
            Product.builder()
                    .name("Arroz de Marisco - Marisqueira do Namibe")
                    .slug("arroz_de_marisco_marisqueira_do_namibe")
                    .description("Arroz de marisco com camarão, lulas e ameiões, servido com salada verde.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Arroz_de_marisco.jpg/1280px-Arroz_de_marisco.jpg")
                    .price(new BigDecimal("17000.00"))
                    .position(1)
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DO_NAMIBE(
            Product.builder()
                    .name("Calulu de Camarão - Marisqueira do Namibe")
                    .slug("calulu_de_camarao_marisqueira_do_namibe")
                    .description("Calulu de camarão com tomate, acompanhamento de pirão de farinha de mandioca.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Goan_Prawn_Curry-Goa_goa-IMG_07.jpg/1280px-Goan_Prawn_Curry-Goa_goa-IMG_07.jpg")
                    .price(new BigDecimal("14000.00"))
                    .position(2)
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_NAMIBE(
            Product.builder()
                    .name("Filete de Robalo Grelhado - Marisqueira do Namibe")
                    .slug("filete_de_robalo_grelhado_marisqueira_do_namibe")
                    .description("Filete de robalo grelhado no carvão com limão de Benguela e batatas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Fish_fillet_in_aluminum_tray.jpg/1280px-Fish_fillet_in_aluminum_tray.jpg")
                    .price(new BigDecimal("15500.00"))
                    .position(3)
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DO_NAMIBE(
            Product.builder()
                    .name("Camarão Grelhado - Marisqueira do Namibe")
                    .slug("camarao_grelhado_marisqueira_do_namibe")
                    .description("Camarão grelhado com alho e coentros, servido com arroz de coco.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Jumbo_karidesler.jpg/1280px-Jumbo_karidesler.jpg")
                    .price(new BigDecimal("18000.00"))
                    .position(4)
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DO_NAMIBE(
            Product.builder()
                    .name("Polvo à Lagareiro - Marisqueira do Namibe")
                    .slug("polvo_a_lagareiro_marisqueira_do_namibe")
                    .description("Polvo cozinhado na lagareiro com batata assada e azeite de alho.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Pulpitos_Turkey.jpg/1280px-Pulpitos_Turkey.jpg")
                    .price(new BigDecimal("16000.00"))
                    .position(5)
                    .organization(OrganizationData.MARISQUEIRA_DO_NAMIBE.getOrganization())
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_KIZUA(
            Product.builder()
                    .name("Sashimi de Salmão - Sushi Kizua")
                    .slug("sashimi_de_salmao_sushi_kizua")
                    .description("Fatias de salmão fresco servidas com wasabi, gergelim e soy gelado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/2024-02-10_Salmon_Sashimi_at_Restaurant_Uri_Buri_in_Acre_anagoria.jpg/1280px-2024-02-10_Salmon_Sashimi_at_Restaurant_Uri_Buri_in_Acre_anagoria.jpg")
                    .price(new BigDecimal("9500.00"))
                    .position(1)
                    .organization(OrganizationData.SUSHI_KIZUA.getOrganization())
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_KIZUA(
            Product.builder()
                    .name("Nigiri Misto 8 Peças - Sushi Kizua")
                    .slug("nigiri_misto_8_pecas_sushi_kizua")
                    .description("Selecção de oito nigiris com salmão, atum, camarão e polvo.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Awabi_Nigiri_DSC07593.jpg/1280px-Awabi_Nigiri_DSC07593.jpg")
                    .price(new BigDecimal("12500.00"))
                    .position(2)
                    .organization(OrganizationData.SUSHI_KIZUA.getOrganization())
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_KIZUA(
            Product.builder()
                    .name("Temaki de Salmão - Sushi Kizua")
                    .slug("temaki_de_salmao_sushi_kizua")
                    .description("Temaki de salmão, abacate, pepino e molhos da casa, enrolado à mão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Discounted_food_at_Japan_Centre%2C_Leicester_Square_2026-09-16.jpg/1280px-Discounted_food_at_Japan_Centre%2C_Leicester_Square_2026-09-16.jpg")
                    .price(new BigDecimal("6500.00"))
                    .position(3)
                    .organization(OrganizationData.SUSHI_KIZUA.getOrganization())
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_KIZUA(
            Product.builder()
                    .name("Hot Roll Especial - Sushi Kizua")
                    .slug("hot_roll_especial_sushi_kizua")
                    .description("Hot roll com camarão, abacate e cream cheese com molho picante.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/43_HOT_ROLL%2C_A_TWO-HIGH_REVERSING_MILL_THAT_PRODUCES_THE_LONGEST_COPPER_AND_ALLOY_STRIP_IN_THE_U.S._INDUSTRY._OVERALL_LENGTH_OF_THE_RUN-OUT_LINE_IS_300%27._-_American_Brass_Foundry_HAER_NY%2C15-BUF%2C25-19.tif/lossy-page1-1280px-thumbnail.tif.jpg")
                    .price(new BigDecimal("7800.00"))
                    .position(4)
                    .organization(OrganizationData.SUSHI_KIZUA.getOrganization())
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_KIZUA(
            Product.builder()
                    .name("Menu Sushi 18 Peças - Sushi Kizua")
                    .slug("menu_sushi_18_pecas_sushi_kizua")
                    .description("Selecção de 18 peças com nigiris, hossomakis, uramakis e sashimi.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Assorted_Sushi_Platter_from_Nobu.jpg/1280px-Assorted_Sushi_Platter_from_Nobu.jpg")
                    .price(new BigDecimal("22000.00"))
                    .position(5)
                    .organization(OrganizationData.SUSHI_KIZUA.getOrganization())
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_BOM_DIA(
            Product.builder()
                    .name("Sashimi de Salmão - Sushi Bom Dia")
                    .slug("sashimi_de_salmao_sushi_bom_dia")
                    .description("Fatias de salmão fresco servidas com wasabi, gergelim e soy gelado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Home-made_salmon_sashimi_%2815532557543%29.jpg/1280px-Home-made_salmon_sashimi_%2815532557543%29.jpg")
                    .price(new BigDecimal("10000.00"))
                    .position(1)
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_BOM_DIA(
            Product.builder()
                    .name("Nigiri Misto 8 Peças - Sushi Bom Dia")
                    .slug("nigiri_misto_8_pecas_sushi_bom_dia")
                    .description("Selecção de oito nigiris com salmão, atum, camarão e polvo.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Nigiri_Sushi%2C_Hosomaki_-_Uta_Sushi_Bar_%285049056668%29.jpg/1280px-Nigiri_Sushi%2C_Hosomaki_-_Uta_Sushi_Bar_%285049056668%29.jpg")
                    .price(new BigDecimal("13000.00"))
                    .position(2)
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_BOM_DIA(
            Product.builder()
                    .name("Temaki de Salmão - Sushi Bom Dia")
                    .slug("temaki_de_salmao_sushi_bom_dia")
                    .description("Temaki de salmão, abacate, pepino e molhos da casa, enrolado à mão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Eel_temaki_zushi_by_The_Wong_Family_Pictures.jpg/1280px-Eel_temaki_zushi_by_The_Wong_Family_Pictures.jpg")
                    .price(new BigDecimal("7000.00"))
                    .position(3)
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_BOM_DIA(
            Product.builder()
                    .name("Hot Roll Especial - Sushi Bom Dia")
                    .slug("hot_roll_especial_sushi_bom_dia")
                    .description("Hot roll com camarão, abacate e cream cheese com molho picante.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Ceviche_Hot_Roll.jpg/1280px-Ceviche_Hot_Roll.jpg")
                    .price(new BigDecimal("8300.00"))
                    .position(4)
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_BOM_DIA(
            Product.builder()
                    .name("Menu Sushi 18 Peças - Sushi Bom Dia")
                    .slug("menu_sushi_18_pecas_sushi_bom_dia")
                    .description("Selecção de 18 peças com nigiris, hossomakis, uramakis e sashimi.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Assorted_Western_sushi_%28%E7%9B%9B%E3%82%8A%E5%90%88%E3%82%8F%E3%81%9B%29.jpg/1280px-Assorted_Western_sushi_%28%E7%9B%9B%E3%82%8A%E5%90%88%E3%82%8F%E3%81%9B%29.jpg")
                    .price(new BigDecimal("22500.00"))
                    .position(5)
                    .organization(OrganizationData.SUSHI_BOM_DIA.getOrganization())
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_TOKYO_LUANDA(
            Product.builder()
                    .name("Sashimi de Salmão - Sushi Tokyo Luanda")
                    .slug("sashimi_de_salmao_sushi_tokyo_luanda")
                    .description("Fatias de salmão fresco servidas com wasabi, gergelim e soy gelado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Salmon_Sashimi_ingredients.png/1280px-Salmon_Sashimi_ingredients.png")
                    .price(new BigDecimal("10500.00"))
                    .position(1)
                    .organization(OrganizationData.SUSHI_TOKYO_LUANDA.getOrganization())
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_TOKYO_LUANDA(
            Product.builder()
                    .name("Nigiri Misto 8 Peças - Sushi Tokyo Luanda")
                    .slug("nigiri_misto_8_pecas_sushi_tokyo_luanda")
                    .description("Selecção de oito nigiris com salmão, atum, camarão e polvo.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Nigiri_Sushi_%2825966163204%29.jpg/1280px-Nigiri_Sushi_%2825966163204%29.jpg")
                    .price(new BigDecimal("13500.00"))
                    .position(2)
                    .organization(OrganizationData.SUSHI_TOKYO_LUANDA.getOrganization())
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_TOKYO_LUANDA(
            Product.builder()
                    .name("Temaki de Salmão - Sushi Tokyo Luanda")
                    .slug("temaki_de_salmao_sushi_tokyo_luanda")
                    .description("Temaki de salmão, abacate, pepino e molhos da casa, enrolado à mão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Fried_Banana_Temaki.jpg/1280px-Fried_Banana_Temaki.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(3)
                    .organization(OrganizationData.SUSHI_TOKYO_LUANDA.getOrganization())
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_TOKYO_LUANDA(
            Product.builder()
                    .name("Hot Roll Especial - Sushi Tokyo Luanda")
                    .slug("hot_roll_especial_sushi_tokyo_luanda")
                    .description("Hot roll com camarão, abacate e cream cheese com molho picante.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Deep-fried_Sushi_-_Hing_Wah_2025-08-23.jpg/1280px-Deep-fried_Sushi_-_Hing_Wah_2025-08-23.jpg")
                    .price(new BigDecimal("8800.00"))
                    .position(4)
                    .organization(OrganizationData.SUSHI_TOKYO_LUANDA.getOrganization())
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_TOKYO_LUANDA(
            Product.builder()
                    .name("Menu Sushi 18 Peças - Sushi Tokyo Luanda")
                    .slug("menu_sushi_18_pecas_sushi_tokyo_luanda")
                    .description("Selecção de 18 peças com nigiris, hossomakis, uramakis e sashimi.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Japanese_Sushi_platter.jpg/1280px-Japanese_Sushi_platter.jpg")
                    .price(new BigDecimal("23000.00"))
                    .position(5)
                    .organization(OrganizationData.SUSHI_TOKYO_LUANDA.getOrganization())
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_SAKURA(
            Product.builder()
                    .name("Sashimi de Salmão - Sushi Sakura")
                    .slug("sashimi_de_salmao_sushi_sakura")
                    .description("Fatias de salmão fresco servidas com wasabi, gergelim e soy gelado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Salmon_sashimi_appetizers.jpeg/1280px-Salmon_sashimi_appetizers.jpeg")
                    .price(new BigDecimal("11000.00"))
                    .position(1)
                    .organization(OrganizationData.SUSHI_SAKURA.getOrganization())
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_SAKURA(
            Product.builder()
                    .name("Nigiri Misto 8 Peças - Sushi Sakura")
                    .slug("nigiri_misto_8_pecas_sushi_sakura")
                    .description("Selecção de oito nigiris com salmão, atum, camarão e polvo.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Nigiri_Sushi_%2826478725732%29.jpg/1280px-Nigiri_Sushi_%2826478725732%29.jpg")
                    .price(new BigDecimal("14000.00"))
                    .position(2)
                    .organization(OrganizationData.SUSHI_SAKURA.getOrganization())
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_SAKURA(
            Product.builder()
                    .name("Temaki de Salmão - Sushi Sakura")
                    .slug("temaki_de_salmao_sushi_sakura")
                    .description("Temaki de salmão, abacate, pepino e molhos da casa, enrolado à mão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/HK_%E5%8C%97%E8%A7%92_North_Point_%E5%92%8C%E7%94%B0_Wada_Japanese_Restaurant_%E6%94%BE%E9%A1%8C_Buffet_dinner_%E6%97%A5%E5%BC%8F%E6%89%8B%E5%8D%B7_Temaki_Shushi_Nori_roll_rice_Mar-2013.JPG/1280px-HK_%E5%8C%97%E8%A7%92_North_Point_%E5%92%8C%E7%94%B0_Wada_Japanese_Restaurant_%E6%94%BE%E9%A1%8C_Buffet_dinner_%E6%97%A5%E5%BC%8F%E6%89%8B%E5%8D%B7_Temaki_Shushi_Nori_roll_rice_Mar-2013.JPG")
                    .price(new BigDecimal("8000.00"))
                    .position(3)
                    .organization(OrganizationData.SUSHI_SAKURA.getOrganization())
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_SAKURA(
            Product.builder()
                    .name("Hot Roll Especial - Sushi Sakura")
                    .slug("hot_roll_especial_sushi_sakura")
                    .description("Hot roll com camarão, abacate e cream cheese com molho picante.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Dynamite_roll.jpg/1280px-Dynamite_roll.jpg")
                    .price(new BigDecimal("9300.00"))
                    .position(4)
                    .organization(OrganizationData.SUSHI_SAKURA.getOrganization())
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_SAKURA(
            Product.builder()
                    .name("Menu Sushi 18 Peças - Sushi Sakura")
                    .slug("menu_sushi_18_pecas_sushi_sakura")
                    .description("Selecção de 18 peças com nigiris, hossomakis, uramakis e sashimi.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Mrs_Y%27s_Sushi_on_platters.jpg/1280px-Mrs_Y%27s_Sushi_on_platters.jpg")
                    .price(new BigDecimal("23500.00"))
                    .position(5)
                    .organization(OrganizationData.SUSHI_SAKURA.getOrganization())
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_MANGA(
            Product.builder()
                    .name("Sashimi de Salmão - Sushi Manga")
                    .slug("sashimi_de_salmao_sushi_manga")
                    .description("Fatias de salmão fresco servidas com wasabi, gergelim e soy gelado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Salmon_sashimi_fish.jpg/1280px-Salmon_sashimi_fish.jpg")
                    .price(new BigDecimal("11500.00"))
                    .position(1)
                    .organization(OrganizationData.SUSHI_MANGA.getOrganization())
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_MANGA(
            Product.builder()
                    .name("Nigiri Misto 8 Peças - Sushi Manga")
                    .slug("nigiri_misto_8_pecas_sushi_manga")
                    .description("Selecção de oito nigiris com salmão, atum, camarão e polvo.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Nigiri_Sushi_%2826478732232%29.jpg/1280px-Nigiri_Sushi_%2826478732232%29.jpg")
                    .price(new BigDecimal("14500.00"))
                    .position(2)
                    .organization(OrganizationData.SUSHI_MANGA.getOrganization())
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_MANGA(
            Product.builder()
                    .name("Temaki de Salmão - Sushi Manga")
                    .slug("temaki_de_salmao_sushi_manga")
                    .description("Temaki de salmão, abacate, pepino e molhos da casa, enrolado à mão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Ikura_temaki_zushi_by_Adonis_Chen_in_Taipei.jpg/1280px-Ikura_temaki_zushi_by_Adonis_Chen_in_Taipei.jpg")
                    .price(new BigDecimal("8500.00"))
                    .position(3)
                    .organization(OrganizationData.SUSHI_MANGA.getOrganization())
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_MANGA(
            Product.builder()
                    .name("Hot Roll Especial - Sushi Manga")
                    .slug("hot_roll_especial_sushi_manga")
                    .description("Hot roll com camarão, abacate e cream cheese com molho picante.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Fried_smoked_salmon_roll.jpg/1280px-Fried_smoked_salmon_roll.jpg")
                    .price(new BigDecimal("9800.00"))
                    .position(4)
                    .organization(OrganizationData.SUSHI_MANGA.getOrganization())
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_MANGA(
            Product.builder()
                    .name("Menu Sushi 18 Peças - Sushi Manga")
                    .slug("menu_sushi_18_pecas_sushi_manga")
                    .description("Selecção de 18 peças com nigiris, hossomakis, uramakis e sashimi.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Store_Bought_Sushi_Platter_with_Soy_Sauce.jpg/1280px-Store_Bought_Sushi_Platter_with_Soy_Sauce.jpg")
                    .price(new BigDecimal("24000.00"))
                    .position(5)
                    .organization(OrganizationData.SUSHI_MANGA.getOrganization())
                    .build()
    ),

    ESPRESSO_CAFE_KWANZA(
            Product.builder()
                    .name("Espresso - Café Kwanza")
                    .slug("espresso_cafe_kwanza")
                    .description("Café espresso de torra angolana, servido com uma dose de açúcar de cana.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/20221116_glass_coffee_cup_empty_Panewniki.jpg/1280px-20221116_glass_coffee_cup_empty_Panewniki.jpg")
                    .price(new BigDecimal("900.00"))
                    .position(1)
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .build()
    ),

    CAPPUCCINO_CAFE_KWANZA(
            Product.builder()
                    .name("Cappuccino - Café Kwanza")
                    .slug("cappuccino_cafe_kwanza")
                    .description("Cappuccino com leite vaporizado, espuma cremosa e canela por cima.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/A-cup-of-cappuccino-coffee-dar-es-salaam-cafe.jpg/1280px-A-cup-of-cappuccino-coffee-dar-es-salaam-cafe.jpg")
                    .price(new BigDecimal("1500.00"))
                    .position(2)
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .build()
    ),

    LATTE_CAFE_KWANZA(
            Product.builder()
                    .name("Latte - Café Kwanza")
                    .slug("latte_cafe_kwanza")
                    .description("Latte com leite vaporizado e arte feita à mão com o nome do cliente.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Aromas_Latte_art%2C_Noosa_Heads%2C_Queensland.jpg/1280px-Aromas_Latte_art%2C_Noosa_Heads%2C_Queensland.jpg")
                    .price(new BigDecimal("1800.00"))
                    .position(3)
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_KWANZA(
            Product.builder()
                    .name("Fatia de Bolo de Chocolate - Café Kwanza")
                    .slug("fatia_de_bolo_de_chocolate_cafe_kwanza")
                    .description("Fatia generosa de bolo de chocolate com ganache e natas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/1-2-3-4_cake_slice_with_chocolate_sour_cream_icing.JPG/1280px-1-2-3-4_cake_slice_with_chocolate_sour_cream_icing.JPG")
                    .price(new BigDecimal("2500.00"))
                    .position(4)
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_KWANZA(
            Product.builder()
                    .name("Sandes de Atum - Café Kwanza")
                    .slug("sandes_de_atum_cafe_kwanza")
                    .description("Sandes de pão integral com atum, cebola, pimento e maionese de limão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/BLT_sandwich_and_chips.jpg/1280px-BLT_sandwich_and_chips.jpg")
                    .price(new BigDecimal("3200.00"))
                    .position(5)
                    .organization(OrganizationData.CAFE_KWANZA.getOrganization())
                    .build()
    ),

    ESPRESSO_CAFE_BOSSA_NOVA(
            Product.builder()
                    .name("Espresso - Café Bossa Nova")
                    .slug("espresso_cafe_bossa_nova")
                    .description("Café espresso de torra angolana, servido com uma dose de açúcar de cana.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/20231223_una_tazza_di_bokeh_PD104696_1.jpg/1280px-20231223_una_tazza_di_bokeh_PD104696_1.jpg")
                    .price(new BigDecimal("1400.00"))
                    .position(1)
                    .organization(OrganizationData.CAFE_BOSSA_NOVA.getOrganization())
                    .build()
    ),

    CAPPUCCINO_CAFE_BOSSA_NOVA(
            Product.builder()
                    .name("Cappuccino - Café Bossa Nova")
                    .slug("cappuccino_cafe_bossa_nova")
                    .description("Cappuccino com leite vaporizado, espuma cremosa e canela por cima.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/A_cup_of_Cappuccino.jpg/1280px-A_cup_of_Cappuccino.jpg")
                    .price(new BigDecimal("2000.00"))
                    .position(2)
                    .organization(OrganizationData.CAFE_BOSSA_NOVA.getOrganization())
                    .build()
    ),

    LATTE_CAFE_BOSSA_NOVA(
            Product.builder()
                    .name("Latte - Café Bossa Nova")
                    .slug("latte_cafe_bossa_nova")
                    .description("Latte com leite vaporizado e arte feita à mão com o nome do cliente.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Cappuccino_with_latte_art_on_Coffee_Right_in_Brno%2C_Brno-City_District.jpg/1280px-Cappuccino_with_latte_art_on_Coffee_Right_in_Brno%2C_Brno-City_District.jpg")
                    .price(new BigDecimal("2300.00"))
                    .position(3)
                    .organization(OrganizationData.CAFE_BOSSA_NOVA.getOrganization())
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_BOSSA_NOVA(
            Product.builder()
                    .name("Fatia de Bolo de Chocolate - Café Bossa Nova")
                    .slug("fatia_de_bolo_de_chocolate_cafe_bossa_nova")
                    .description("Fatia generosa de bolo de chocolate com ganache e natas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/A_slice_of_white_chocolate_cake%2C_January_2009.jpg/1280px-A_slice_of_white_chocolate_cake%2C_January_2009.jpg")
                    .price(new BigDecimal("3000.00"))
                    .position(4)
                    .organization(OrganizationData.CAFE_BOSSA_NOVA.getOrganization())
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_BOSSA_NOVA(
            Product.builder()
                    .name("Sandes de Atum - Café Bossa Nova")
                    .slug("sandes_de_atum_cafe_bossa_nova")
                    .description("Sandes de pão integral com atum, cebola, pimento e maionese de limão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Cucumber_sandwich%2C_samosas%2C_potato_chips_and_cake_on_a_plate_-_20110622.jpg/1280px-Cucumber_sandwich%2C_samosas%2C_potato_chips_and_cake_on_a_plate_-_20110622.jpg")
                    .price(new BigDecimal("3700.00"))
                    .position(5)
                    .organization(OrganizationData.CAFE_BOSSA_NOVA.getOrganization())
                    .build()
    ),

    ESPRESSO_CAFE_DO_MIRAMAR(
            Product.builder()
                    .name("Espresso - Café do Miramar")
                    .slug("espresso_cafe_do_miramar")
                    .description("Café espresso de torra angolana, servido com uma dose de açúcar de cana.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/A_cup_of_Brazilian_espresso_with_Ukrainian_macaron.jpg/1280px-A_cup_of_Brazilian_espresso_with_Ukrainian_macaron.jpg")
                    .price(new BigDecimal("1900.00"))
                    .position(1)
                    .organization(OrganizationData.CAFE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    CAPPUCCINO_CAFE_DO_MIRAMAR(
            Product.builder()
                    .name("Cappuccino - Café do Miramar")
                    .slug("cappuccino_cafe_do_miramar")
                    .description("Cappuccino com leite vaporizado, espuma cremosa e canela por cima.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/A_cup_of_cappuccino_at_Indooroopilly_Shopping_Centre.JPG/1280px-A_cup_of_cappuccino_at_Indooroopilly_Shopping_Centre.JPG")
                    .price(new BigDecimal("2500.00"))
                    .position(2)
                    .organization(OrganizationData.CAFE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    LATTE_CAFE_DO_MIRAMAR(
            Product.builder()
                    .name("Latte - Café do Miramar")
                    .slug("latte_cafe_do_miramar")
                    .description("Latte com leite vaporizado e arte feita à mão com o nome do cliente.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Compass_Coffee_Lattes.jpg/1280px-Compass_Coffee_Lattes.jpg")
                    .price(new BigDecimal("2800.00"))
                    .position(3)
                    .organization(OrganizationData.CAFE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_DO_MIRAMAR(
            Product.builder()
                    .name("Fatia de Bolo de Chocolate - Café do Miramar")
                    .slug("fatia_de_bolo_de_chocolate_cafe_do_miramar")
                    .description("Fatia generosa de bolo de chocolate com ganache e natas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Almond%2C_Coconut%2C_Chocolate_cake_-_Lost_in_the_Lanes_2025-07-08.jpg/1280px-Almond%2C_Coconut%2C_Chocolate_cake_-_Lost_in_the_Lanes_2025-07-08.jpg")
                    .price(new BigDecimal("3500.00"))
                    .position(4)
                    .organization(OrganizationData.CAFE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_DO_MIRAMAR(
            Product.builder()
                    .name("Sandes de Atum - Café do Miramar")
                    .slug("sandes_de_atum_cafe_do_miramar")
                    .description("Sandes de pão integral com atum, cebola, pimento e maionese de limão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Grilled_cheese_sandwich_on_white_plate.jpg/1280px-Grilled_cheese_sandwich_on_white_plate.jpg")
                    .price(new BigDecimal("4200.00"))
                    .position(5)
                    .organization(OrganizationData.CAFE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    ESPRESSO_CAFE_PAO_QUENTE(
            Product.builder()
                    .name("Espresso - Café Pão Quente")
                    .slug("espresso_cafe_pao_quente")
                    .description("Café espresso de torra angolana, servido com uma dose de açúcar de cana.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/A_cup_of_espresso.jpg/1280px-A_cup_of_espresso.jpg")
                    .price(new BigDecimal("2400.00"))
                    .position(1)
                    .organization(OrganizationData.CAFE_PAO_QUENTE.getOrganization())
                    .build()
    ),

    CAPPUCCINO_CAFE_PAO_QUENTE(
            Product.builder()
                    .name("Cappuccino - Café Pão Quente")
                    .slug("cappuccino_cafe_pao_quente")
                    .description("Cappuccino com leite vaporizado, espuma cremosa e canela por cima.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/A_cup_of_cappuccino_at_Miettes_Bakery%2C_Graceville%2C_Queensland%2C_2023.jpg/1280px-A_cup_of_cappuccino_at_Miettes_Bakery%2C_Graceville%2C_Queensland%2C_2023.jpg")
                    .price(new BigDecimal("3000.00"))
                    .position(2)
                    .organization(OrganizationData.CAFE_PAO_QUENTE.getOrganization())
                    .build()
    ),

    LATTE_CAFE_PAO_QUENTE(
            Product.builder()
                    .name("Latte - Café Pão Quente")
                    .slug("latte_cafe_pao_quente")
                    .description("Latte com leite vaporizado e arte feita à mão com o nome do cliente.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Cup_of_coffee_with_latte_art_2016.jpg/1280px-Cup_of_coffee_with_latte_art_2016.jpg")
                    .price(new BigDecimal("3300.00"))
                    .position(3)
                    .organization(OrganizationData.CAFE_PAO_QUENTE.getOrganization())
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_PAO_QUENTE(
            Product.builder()
                    .name("Fatia de Bolo de Chocolate - Café Pão Quente")
                    .slug("fatia_de_bolo_de_chocolate_cafe_pao_quente")
                    .description("Fatia generosa de bolo de chocolate com ganache e natas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Baileys_Chocolate_Cake_-_Cafe_Coho_2026-01-08.jpg/1280px-Baileys_Chocolate_Cake_-_Cafe_Coho_2026-01-08.jpg")
                    .price(new BigDecimal("4000.00"))
                    .position(4)
                    .organization(OrganizationData.CAFE_PAO_QUENTE.getOrganization())
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_PAO_QUENTE(
            Product.builder()
                    .name("Sandes de Atum - Café Pão Quente")
                    .slug("sandes_de_atum_cafe_pao_quente")
                    .description("Sandes de pão integral com atum, cebola, pimento e maionese de limão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Plate%2C_Cape_Cod_Glass_Company%2C_c._1865%2C_cut_overlay_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08130.jpg/1280px-Plate%2C_Cape_Cod_Glass_Company%2C_c._1865%2C_cut_overlay_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08130.jpg")
                    .price(new BigDecimal("4700.00"))
                    .position(5)
                    .organization(OrganizationData.CAFE_PAO_QUENTE.getOrganization())
                    .build()
    ),

    ESPRESSO_COFFEE_STOP_ANGOLA(
            Product.builder()
                    .name("Espresso - Coffee Stop Angola")
                    .slug("espresso_coffee_stop_angola")
                    .description("Café espresso de torra angolana, servido com uma dose de açúcar de cana.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Coffecup_Moscow_20180622.jpg/1280px-Coffecup_Moscow_20180622.jpg")
                    .price(new BigDecimal("2900.00"))
                    .position(1)
                    .organization(OrganizationData.COFFEE_STOP_ANGOLA.getOrganization())
                    .build()
    ),

    CAPPUCCINO_COFFEE_STOP_ANGOLA(
            Product.builder()
                    .name("Cappuccino - Coffee Stop Angola")
                    .slug("cappuccino_coffee_stop_angola")
                    .description("Cappuccino com leite vaporizado, espuma cremosa e canela por cima.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/A_cup_of_cappuccino_at_Regatta_Hotel.JPG/1280px-A_cup_of_cappuccino_at_Regatta_Hotel.JPG")
                    .price(new BigDecimal("3500.00"))
                    .position(2)
                    .organization(OrganizationData.COFFEE_STOP_ANGOLA.getOrganization())
                    .build()
    ),

    LATTE_COFFEE_STOP_ANGOLA(
            Product.builder()
                    .name("Latte - Coffee Stop Angola")
                    .slug("latte_coffee_stop_angola")
                    .description("Latte com leite vaporizado e arte feita à mão com o nome do cliente.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Decaf_latte_-_Trading_Post_Coffee_Roasters_2025-03-09.jpg/1280px-Decaf_latte_-_Trading_Post_Coffee_Roasters_2025-03-09.jpg")
                    .price(new BigDecimal("3800.00"))
                    .position(3)
                    .organization(OrganizationData.COFFEE_STOP_ANGOLA.getOrganization())
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_COFFEE_STOP_ANGOLA(
            Product.builder()
                    .name("Fatia de Bolo de Chocolate - Coffee Stop Angola")
                    .slug("fatia_de_bolo_de_chocolate_coffee_stop_angola")
                    .description("Fatia generosa de bolo de chocolate com ganache e natas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Belgian_Chocolate_Fudge_Cake_-_Caff%C3%A8_Nero_2025-09-05.jpg/1280px-Belgian_Chocolate_Fudge_Cake_-_Caff%C3%A8_Nero_2025-09-05.jpg")
                    .price(new BigDecimal("4500.00"))
                    .position(4)
                    .organization(OrganizationData.COFFEE_STOP_ANGOLA.getOrganization())
                    .build()
    ),

    SANDES_DE_ATUM_COFFEE_STOP_ANGOLA(
            Product.builder()
                    .name("Sandes de Atum - Coffee Stop Angola")
                    .slug("sandes_de_atum_coffee_stop_angola")
                    .description("Sandes de pão integral com atum, cebola, pimento e maionese de limão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Plate%2C_attributed_to_the_Boston_%26_Sandwich_Glass_Company%2C_1828%2C_pressed_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08073.jpg/1280px-Plate%2C_attributed_to_the_Boston_%26_Sandwich_Glass_Company%2C_1828%2C_pressed_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08073.jpg")
                    .price(new BigDecimal("5200.00"))
                    .position(5)
                    .organization(OrganizationData.COFFEE_STOP_ANGOLA.getOrganization())
                    .build()
    ),

    CAIPIRINHA_BAR_222(
            Product.builder()
                    .name("Caipirinha - Bar 222")
                    .slug("caipirinha_bar_222")
                    .description("Caipirinha com cachaça de cana, limão-taiti e gelo picado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/15-09-26-RalfR-WLC-0048.jpg/1280px-15-09-26-RalfR-WLC-0048.jpg")
                    .price(new BigDecimal("3500.00"))
                    .position(1)
                    .organization(OrganizationData.BAR_222.getOrganization())
                    .build()
    ),

    GIN_TONICA_BAR_222(
            Product.builder()
                    .name("Gin & Tónica - Bar 222")
                    .slug("gin_tonica_bar_222")
                    .description("Gin com tónica premium, rodela de limão e ervas frescas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Beefeater_Zesty_Gin_%26_Tonic.jpg/1280px-Beefeater_Zesty_Gin_%26_Tonic.jpg")
                    .price(new BigDecimal("4200.00"))
                    .position(2)
                    .organization(OrganizationData.BAR_222.getOrganization())
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_222(
            Product.builder()
                    .name("Cerveja Artesanal - Bar 222")
                    .slug("cerveja_artesanal_bar_222")
                    .description("Cerveja artesanal local bem gelada, servida em copo de 500 ml.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/A_Butcher_Offering_a_Woman_a_Glass_of_Beer_%28SM_573%29.png/1280px-A_Butcher_Offering_a_Woman_a_Glass_of_Beer_%28SM_573%29.png")
                    .price(new BigDecimal("2800.00"))
                    .position(3)
                    .organization(OrganizationData.BAR_222.getOrganization())
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_222(
            Product.builder()
                    .name("Petiscos do Dia - Bar 222")
                    .slug("petiscos_do_dia_bar_222")
                    .description("Tábua de petiscos do dia com queijos, enchidos e azeitonas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Aceitunas_manzanilla_%28Espa%C3%B1a%29.jpg/1280px-Aceitunas_manzanilla_%28Espa%C3%B1a%29.jpg")
                    .price(new BigDecimal("6500.00"))
                    .position(4)
                    .organization(OrganizationData.BAR_222.getOrganization())
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_222(
            Product.builder()
                    .name("Tapa de Camarão - Bar 222")
                    .slug("tapa_de_camarao_bar_222")
                    .description("Tapa de camarão panado com molho de marisco e limão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Karidesli_antre.jpg/1280px-Karidesli_antre.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(5)
                    .organization(OrganizationData.BAR_222.getOrganization())
                    .build()
    ),

    CAIPIRINHA_BAR_TROPICAL(
            Product.builder()
                    .name("Caipirinha - Bar Tropical")
                    .slug("caipirinha_bar_tropical")
                    .description("Caipirinha com cachaça de cana, limão-taiti e gelo picado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Caipirinha_%2811386811374%29.jpg/1280px-Caipirinha_%2811386811374%29.jpg")
                    .price(new BigDecimal("4000.00"))
                    .position(1)
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .build()
    ),

    GIN_TONICA_BAR_TROPICAL(
            Product.builder()
                    .name("Gin & Tónica - Bar Tropical")
                    .slug("gin_tonica_bar_tropical")
                    .description("Gin com tónica premium, rodela de limão e ervas frescas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Crafter%27s_Gin_and_Tonic.jpg/1280px-Crafter%27s_Gin_and_Tonic.jpg")
                    .price(new BigDecimal("4700.00"))
                    .position(2)
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_TROPICAL(
            Product.builder()
                    .name("Cerveja Artesanal - Bar Tropical")
                    .slug("cerveja_artesanal_bar_tropical")
                    .description("Cerveja artesanal local bem gelada, servida em copo de 500 ml.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/A_glass_of_Stout_from_Cloudwater.jpg/1280px-A_glass_of_Stout_from_Cloudwater.jpg")
                    .price(new BigDecimal("3300.00"))
                    .position(3)
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_TROPICAL(
            Product.builder()
                    .name("Petiscos do Dia - Bar Tropical")
                    .slug("petiscos_do_dia_bar_tropical")
                    .description("Tábua de petiscos do dia com queijos, enchidos e azeitonas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Pinchos_de_tortilla_en_Barcelona.jpg/1280px-Pinchos_de_tortilla_en_Barcelona.jpg")
                    .price(new BigDecimal("7000.00"))
                    .position(4)
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_TROPICAL(
            Product.builder()
                    .name("Tapa de Camarão - Bar Tropical")
                    .slug("tapa_de_camarao_bar_tropical")
                    .description("Tapa de camarão panado com molho de marisco e limão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Malwani_Chicken_Thali.jpg/1280px-Malwani_Chicken_Thali.jpg")
                    .price(new BigDecimal("8000.00"))
                    .position(5)
                    .organization(OrganizationData.BAR_TROPICAL.getOrganization())
                    .build()
    ),

    CAIPIRINHA_BAR_DO_KIZUA(
            Product.builder()
                    .name("Caipirinha - Bar do Kizua")
                    .slug("caipirinha_bar_do_kizua")
                    .description("Caipirinha com cachaça de cana, limão-taiti e gelo picado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Caipirinha_and_Cacha%C3%A7a.jpg/1280px-Caipirinha_and_Cacha%C3%A7a.jpg")
                    .price(new BigDecimal("4500.00"))
                    .position(1)
                    .organization(OrganizationData.BAR_DO_KIZUA.getOrganization())
                    .build()
    ),

    GIN_TONICA_BAR_DO_KIZUA(
            Product.builder()
                    .name("Gin & Tónica - Bar do Kizua")
                    .slug("gin_tonica_bar_do_kizua")
                    .description("Gin com tónica premium, rodela de limão e ervas frescas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Crafter%27s_Gin_and_Tonic_on_a_balcony.jpg/1280px-Crafter%27s_Gin_and_Tonic_on_a_balcony.jpg")
                    .price(new BigDecimal("5200.00"))
                    .position(2)
                    .organization(OrganizationData.BAR_DO_KIZUA.getOrganization())
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_DO_KIZUA(
            Product.builder()
                    .name("Cerveja Artesanal - Bar do Kizua")
                    .slug("cerveja_artesanal_bar_do_kizua")
                    .description("Cerveja artesanal local bem gelada, servida em copo de 500 ml.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/BFB2_DSCN4836.jpg/1280px-BFB2_DSCN4836.jpg")
                    .price(new BigDecimal("3800.00"))
                    .position(3)
                    .organization(OrganizationData.BAR_DO_KIZUA.getOrganization())
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_DO_KIZUA(
            Product.builder()
                    .name("Petiscos do Dia - Bar do Kizua")
                    .slug("petiscos_do_dia_bar_do_kizua")
                    .description("Tábua de petiscos do dia com queijos, enchidos e azeitonas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Tapa_aceitunas.JPG/1280px-Tapa_aceitunas.JPG")
                    .price(new BigDecimal("7500.00"))
                    .position(4)
                    .organization(OrganizationData.BAR_DO_KIZUA.getOrganization())
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_DO_KIZUA(
            Product.builder()
                    .name("Tapa de Camarão - Bar do Kizua")
                    .slug("tapa_de_camarao_bar_do_kizua")
                    .description("Tapa de camarão panado com molho de marisco e limão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Seafood_salad_with_onions_and_coriander%2C_from_Turkey.jpg/1280px-Seafood_salad_with_onions_and_coriander%2C_from_Turkey.jpg")
                    .price(new BigDecimal("8500.00"))
                    .position(5)
                    .organization(OrganizationData.BAR_DO_KIZUA.getOrganization())
                    .build()
    ),

    CAIPIRINHA_PUB_KILAMBA(
            Product.builder()
                    .name("Caipirinha - Pub Kilamba")
                    .slug("caipirinha_pub_kilamba")
                    .description("Caipirinha com cachaça de cana, limão-taiti e gelo picado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Caipirinha_in_the_cocktail_shaker.jpg/1280px-Caipirinha_in_the_cocktail_shaker.jpg")
                    .price(new BigDecimal("5000.00"))
                    .position(1)
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .build()
    ),

    GIN_TONICA_PUB_KILAMBA(
            Product.builder()
                    .name("Gin & Tónica - Pub Kilamba")
                    .slug("gin_tonica_pub_kilamba")
                    .description("Gin com tónica premium, rodela de limão e ervas frescas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Gin_%26_tonic_from_Crafters_Aromatic_Flower_Gin.jpg/1280px-Gin_%26_tonic_from_Crafters_Aromatic_Flower_Gin.jpg")
                    .price(new BigDecimal("5700.00"))
                    .position(2)
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .build()
    ),

    CERVEJA_ARTESANAL_PUB_KILAMBA(
            Product.builder()
                    .name("Cerveja Artesanal - Pub Kilamba")
                    .slug("cerveja_artesanal_pub_kilamba")
                    .description("Cerveja artesanal local bem gelada, servida em copo de 500 ml.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Bottle_share_at_Pop%27n%27Hops%2C_Cardiff.jpg/1280px-Bottle_share_at_Pop%27n%27Hops%2C_Cardiff.jpg")
                    .price(new BigDecimal("4300.00"))
                    .position(3)
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .build()
    ),

    PETISCOS_DO_DIA_PUB_KILAMBA(
            Product.builder()
                    .name("Petiscos do Dia - Pub Kilamba")
                    .slug("petiscos_do_dia_pub_kilamba")
                    .description("Tábua de petiscos do dia com queijos, enchidos e azeitonas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Tapas_2012_094_Pulpitos.jpg/1280px-Tapas_2012_094_Pulpitos.jpg")
                    .price(new BigDecimal("8000.00"))
                    .position(4)
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .build()
    ),

    TAPA_DE_CAMARAO_PUB_KILAMBA(
            Product.builder()
                    .name("Tapa de Camarão - Pub Kilamba")
                    .slug("tapa_de_camarao_pub_kilamba")
                    .description("Tapa de camarão panado com molho de marisco e limão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/Shrimp_Appetizer.jpg/1280px-Shrimp_Appetizer.jpg")
                    .price(new BigDecimal("9000.00"))
                    .position(5)
                    .organization(OrganizationData.PUB_KILAMBA.getOrganization())
                    .build()
    ),

    CAIPIRINHA_BAR_ESQUINA_DO_MIRAMAR(
            Product.builder()
                    .name("Caipirinha - Bar Esquina do Miramar")
                    .slug("caipirinha_bar_esquina_do_miramar")
                    .description("Caipirinha com cachaça de cana, limão-taiti e gelo picado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Caipirinha_2.jpg/1280px-Caipirinha_2.jpg")
                    .price(new BigDecimal("5500.00"))
                    .position(1)
                    .organization(OrganizationData.BAR_ESQUINA_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    GIN_TONICA_BAR_ESQUINA_DO_MIRAMAR(
            Product.builder()
                    .name("Gin & Tónica - Bar Esquina do Miramar")
                    .slug("gin_tonica_bar_esquina_do_miramar")
                    .description("Gin com tónica premium, rodela de limão e ervas frescas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Gin_and_Tonic%2C_Howrah%2C_West_Bengal.jpg/1280px-Gin_and_Tonic%2C_Howrah%2C_West_Bengal.jpg")
                    .price(new BigDecimal("6200.00"))
                    .position(2)
                    .organization(OrganizationData.BAR_ESQUINA_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_ESQUINA_DO_MIRAMAR(
            Product.builder()
                    .name("Cerveja Artesanal - Bar Esquina do Miramar")
                    .slug("cerveja_artesanal_bar_esquina_do_miramar")
                    .description("Cerveja artesanal local bem gelada, servida em copo de 500 ml.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Craft_beer_and_non-alcoholic_cocktail_at_restaurant_Plaza.jpg/1280px-Craft_beer_and_non-alcoholic_cocktail_at_restaurant_Plaza.jpg")
                    .price(new BigDecimal("4800.00"))
                    .position(3)
                    .organization(OrganizationData.BAR_ESQUINA_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_ESQUINA_DO_MIRAMAR(
            Product.builder()
                    .name("Petiscos do Dia - Bar Esquina do Miramar")
                    .slug("petiscos_do_dia_bar_esquina_do_miramar")
                    .description("Tábua de petiscos do dia com queijos, enchidos e azeitonas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Tapas_Factory_Lindemannstra%C3%9Fe%2C_Dortmund.jpg/1280px-Tapas_Factory_Lindemannstra%C3%9Fe%2C_Dortmund.jpg")
                    .price(new BigDecimal("8500.00"))
                    .position(4)
                    .organization(OrganizationData.BAR_ESQUINA_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_ESQUINA_DO_MIRAMAR(
            Product.builder()
                    .name("Tapa de Camarão - Bar Esquina do Miramar")
                    .slug("tapa_de_camarao_bar_esquina_do_miramar")
                    .description("Tapa de camarão panado com molho de marisco e limão.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Starter_dish_in_Turkey.jpg/1280px-Starter_dish_in_Turkey.jpg")
                    .price(new BigDecimal("9500.00"))
                    .position(5)
                    .organization(OrganizationData.BAR_ESQUINA_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KWANZA(
            Product.builder()
                    .name("Buffet por Quilograma - Self-Service Kwanza")
                    .slug("buffet_por_quilograma_self_service_kwanza")
                    .description("Buffet com uma dezena de pratos servidos por quilograma, sem limite de repetição.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Buffet_lunch%2C_naan_and_salad_at_restaurant_Keitti%C3%B6mestari_in_November_2025.jpg/1280px-Buffet_lunch%2C_naan_and_salad_at_restaurant_Keitti%C3%B6mestari_in_November_2025.jpg")
                    .price(new BigDecimal("6500.00"))
                    .position(1)
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KWANZA(
            Product.builder()
                    .name("Prato do Dia Self-Service - Self-Service Kwanza")
                    .slug("prato_do_dia_self_service_self_service_kwanza")
                    .description("Prato do dia com duas entradas, prato principal e sobremesa incluídas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Chocolate_cake_and_tea_service.jpg/1280px-Chocolate_cake_and_tea_service.jpg")
                    .price(new BigDecimal("5500.00"))
                    .position(2)
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_KWANZA(
            Product.builder()
                    .name("Sopa do Dia - Self-Service Kwanza")
                    .slug("sopa_do_dia_self_service_kwanza")
                    .description("Sopa do dia servida com pão nas mesas do self-service.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Argentine_Homemade_Vegetable_Soup.jpg/1280px-Argentine_Homemade_Vegetable_Soup.jpg")
                    .price(new BigDecimal("2500.00"))
                    .position(3)
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_KWANZA(
            Product.builder()
                    .name("Salada do Buffet - Self-Service Kwanza")
                    .slug("salada_do_buffet_self_service_kwanza")
                    .description("Salada do buffet com folhas, legumes e molhos à escolha.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Circus_Circus_Reno_Buffet.jpg/1280px-Circus_Circus_Reno_Buffet.jpg")
                    .price(new BigDecimal("3200.00"))
                    .position(4)
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_KWANZA(
            Product.builder()
                    .name("Sobremesa do Buffet - Self-Service Kwanza")
                    .slug("sobremesa_do_buffet_self_service_kwanza")
                    .description("Sobremesa do buffet com frutas, mousse de chocolate e gelados.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/A_dessert_at_Windjammer_Buffet.jpg/1280px-A_dessert_at_Windjammer_Buffet.jpg")
                    .price(new BigDecimal("1800.00"))
                    .position(5)
                    .organization(OrganizationData.SELF_SERVICE_KWANZA.getOrganization())
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_ZE(
            Product.builder()
                    .name("Buffet por Quilograma - Self-Service do Zé")
                    .slug("buffet_por_quilograma_self_service_do_ze")
                    .description("Buffet com uma dezena de pratos servidos por quilograma, sem limite de repetição.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Buffet_lunch%2C_salad_and_bread_at_Antell_Martintalo_in_November_2022.jpg/1280px-Buffet_lunch%2C_salad_and_bread_at_Antell_Martintalo_in_November_2022.jpg")
                    .price(new BigDecimal("7000.00"))
                    .position(1)
                    .organization(OrganizationData.SELF_SERVICE_DO_ZE.getOrganization())
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_ZE(
            Product.builder()
                    .name("Prato do Dia Self-Service - Self-Service do Zé")
                    .slug("prato_do_dia_self_service_self_service_do_ze")
                    .description("Prato do dia com duas entradas, prato principal e sobremesa incluídas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Food_was_bad_silent_service_code.jpg/1280px-Food_was_bad_silent_service_code.jpg")
                    .price(new BigDecimal("6000.00"))
                    .position(2)
                    .organization(OrganizationData.SELF_SERVICE_DO_ZE.getOrganization())
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_DO_ZE(
            Product.builder()
                    .name("Sopa do Dia - Self-Service do Zé")
                    .slug("sopa_do_dia_self_service_do_ze")
                    .description("Sopa do dia servida com pão nas mesas do self-service.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Bowl_of_beef_soup%2C_01.jpg/1280px-Bowl_of_beef_soup%2C_01.jpg")
                    .price(new BigDecimal("3000.00"))
                    .position(3)
                    .organization(OrganizationData.SELF_SERVICE_DO_ZE.getOrganization())
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_DO_ZE(
            Product.builder()
                    .name("Salada do Buffet - Self-Service do Zé")
                    .slug("salada_do_buffet_self_service_do_ze")
                    .description("Salada do buffet com folhas, legumes e molhos à escolha.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Club_60_Supper_Club_Salad_Bar.jpg/1280px-Club_60_Supper_Club_Salad_Bar.jpg")
                    .price(new BigDecimal("3700.00"))
                    .position(4)
                    .organization(OrganizationData.SELF_SERVICE_DO_ZE.getOrganization())
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_ZE(
            Product.builder()
                    .name("Sobremesa do Buffet - Self-Service do Zé")
                    .slug("sobremesa_do_buffet_self_service_do_ze")
                    .description("Sobremesa do buffet com frutas, mousse de chocolate e gelados.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Bacchanal_Buffet_-_1.jpg/1280px-Bacchanal_Buffet_-_1.jpg")
                    .price(new BigDecimal("2300.00"))
                    .position(5)
                    .organization(OrganizationData.SELF_SERVICE_DO_ZE.getOrganization())
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KILAMBA(
            Product.builder()
                    .name("Buffet por Quilograma - Self-Service Kilamba")
                    .slug("buffet_por_quilograma_self_service_kilamba")
                    .description("Buffet com uma dezena de pratos servidos por quilograma, sem limite de repetição.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Buffet_lunch_and_soup_at_Fazer_F8_in_July_2023.jpg/1280px-Buffet_lunch_and_soup_at_Fazer_F8_in_July_2023.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(1)
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KILAMBA(
            Product.builder()
                    .name("Prato do Dia Self-Service - Self-Service Kilamba")
                    .slug("prato_do_dia_self_service_self_service_kilamba")
                    .description("Prato do dia com duas entradas, prato principal e sobremesa incluídas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Grow_Your_Own_Food_Art.IWMPST2893.jpg/1280px-Grow_Your_Own_Food_Art.IWMPST2893.jpg")
                    .price(new BigDecimal("6500.00"))
                    .position(2)
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_KILAMBA(
            Product.builder()
                    .name("Sopa do Dia - Self-Service Kilamba")
                    .slug("sopa_do_dia_self_service_kilamba")
                    .description("Sopa do dia servida com pão nas mesas do self-service.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Bowl_of_beef_soup%2C_02.jpg/1280px-Bowl_of_beef_soup%2C_02.jpg")
                    .price(new BigDecimal("3500.00"))
                    .position(3)
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_KILAMBA(
            Product.builder()
                    .name("Salada do Buffet - Self-Service Kilamba")
                    .slug("salada_do_buffet_self_service_kilamba")
                    .description("Salada do buffet com folhas, legumes e molhos à escolha.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Frankfurt%2C_Germany_-_REWE_salad_bar_1.jpg/1280px-Frankfurt%2C_Germany_-_REWE_salad_bar_1.jpg")
                    .price(new BigDecimal("4200.00"))
                    .position(4)
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_KILAMBA(
            Product.builder()
                    .name("Sobremesa do Buffet - Self-Service Kilamba")
                    .slug("sobremesa_do_buffet_self_service_kilamba")
                    .description("Sobremesa do buffet com frutas, mousse de chocolate e gelados.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Bacchanal_Buffet_at_Caesars_Palace.jpg/1280px-Bacchanal_Buffet_at_Caesars_Palace.jpg")
                    .price(new BigDecimal("2800.00"))
                    .position(5)
                    .organization(OrganizationData.SELF_SERVICE_KILAMBA.getOrganization())
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_CENTRAL(
            Product.builder()
                    .name("Buffet por Quilograma - Self-Service Central")
                    .slug("buffet_por_quilograma_self_service_central")
                    .description("Buffet com uma dezena de pratos servidos por quilograma, sem limite de repetição.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Buffet_lunch_at_Antell_Martintalo_in_August_2022.jpg/1280px-Buffet_lunch_at_Antell_Martintalo_in_August_2022.jpg")
                    .price(new BigDecimal("8000.00"))
                    .position(1)
                    .organization(OrganizationData.SELF_SERVICE_CENTRAL.getOrganization())
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_CENTRAL(
            Product.builder()
                    .name("Prato do Dia Self-Service - Self-Service Central")
                    .slug("prato_do_dia_self_service_self_service_central")
                    .description("Prato do dia com duas entradas, prato principal e sobremesa incluídas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Kekse_--_2021_--_9362.jpg/1280px-Kekse_--_2021_--_9362.jpg")
                    .price(new BigDecimal("7000.00"))
                    .position(2)
                    .organization(OrganizationData.SELF_SERVICE_CENTRAL.getOrganization())
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_CENTRAL(
            Product.builder()
                    .name("Sopa do Dia - Self-Service Central")
                    .slug("sopa_do_dia_self_service_central")
                    .description("Sopa do dia servida com pão nas mesas do self-service.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Bowl_of_beef_soup%2C_03.jpg/1280px-Bowl_of_beef_soup%2C_03.jpg")
                    .price(new BigDecimal("4000.00"))
                    .position(3)
                    .organization(OrganizationData.SELF_SERVICE_CENTRAL.getOrganization())
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_CENTRAL(
            Product.builder()
                    .name("Salada do Buffet - Self-Service Central")
                    .slug("salada_do_buffet_self_service_central")
                    .description("Salada do buffet com folhas, legumes e molhos à escolha.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Frankfurt%2C_Germany_-_REWE_salad_bar_2.jpg/1280px-Frankfurt%2C_Germany_-_REWE_salad_bar_2.jpg")
                    .price(new BigDecimal("4700.00"))
                    .position(4)
                    .organization(OrganizationData.SELF_SERVICE_CENTRAL.getOrganization())
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_CENTRAL(
            Product.builder()
                    .name("Sobremesa do Buffet - Self-Service Central")
                    .slug("sobremesa_do_buffet_self_service_central")
                    .description("Sobremesa do buffet com frutas, mousse de chocolate e gelados.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Buffet_lunch_and_dessert_at_restaurant_S%C3%A4vel.jpg/1280px-Buffet_lunch_and_dessert_at_restaurant_S%C3%A4vel.jpg")
                    .price(new BigDecimal("3300.00"))
                    .position(5)
                    .organization(OrganizationData.SELF_SERVICE_CENTRAL.getOrganization())
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_MIRAMAR(
            Product.builder()
                    .name("Buffet por Quilograma - Self-Service do Miramar")
                    .slug("buffet_por_quilograma_self_service_do_miramar")
                    .description("Buffet com uma dezena de pratos servidos por quilograma, sem limite de repetição.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Buffet_lunch_at_Antell_Martintalo_in_December_2023_close_up.jpg/1280px-Buffet_lunch_at_Antell_Martintalo_in_December_2023_close_up.jpg")
                    .price(new BigDecimal("8500.00"))
                    .position(1)
                    .organization(OrganizationData.SELF_SERVICE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_MIRAMAR(
            Product.builder()
                    .name("Prato do Dia Self-Service - Self-Service do Miramar")
                    .slug("prato_do_dia_self_service_self_service_do_miramar")
                    .description("Prato do dia com duas entradas, prato principal e sobremesa incluídas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Meal_at_a_Swedish_X2000_train_from_Lund_to_Stockholm_in_September_2024.jpg/1280px-Meal_at_a_Swedish_X2000_train_from_Lund_to_Stockholm_in_September_2024.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(2)
                    .organization(OrganizationData.SELF_SERVICE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_DO_MIRAMAR(
            Product.builder()
                    .name("Sopa do Dia - Self-Service do Miramar")
                    .slug("sopa_do_dia_self_service_do_miramar")
                    .description("Sopa do dia servida com pão nas mesas do self-service.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Bowl_of_beef_soup%2C_04.jpg/1280px-Bowl_of_beef_soup%2C_04.jpg")
                    .price(new BigDecimal("4500.00"))
                    .position(3)
                    .organization(OrganizationData.SELF_SERVICE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR(
            Product.builder()
                    .name("Salada do Buffet - Self-Service do Miramar")
                    .slug("salada_do_buffet_self_service_do_miramar")
                    .description("Salada do buffet com folhas, legumes e molhos à escolha.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Green_Salad_Bar_Corner_in_Clipper_Lounge.jpg/1280px-Green_Salad_Bar_Corner_in_Clipper_Lounge.jpg")
                    .price(new BigDecimal("5200.00"))
                    .position(4)
                    .organization(OrganizationData.SELF_SERVICE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR(
            Product.builder()
                    .name("Sobremesa do Buffet - Self-Service do Miramar")
                    .slug("sobremesa_do_buffet_self_service_do_miramar")
                    .description("Sobremesa do buffet com frutas, mousse de chocolate e gelados.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/DSC00631_The_Buffet_at_Bellagio.jpg/1280px-DSC00631_The_Buffet_at_Bellagio.jpg")
                    .price(new BigDecimal("3800.00"))
                    .position(5)
                    .organization(OrganizationData.SELF_SERVICE_DO_MIRAMAR.getOrganization())
                    .build()
    ),

    SALADA_DE_QUINOA_RESTAURANTE_VEGETARIANO_RAIZES(
            Product.builder()
                    .name("Salada de Quinoa - Restaurante Vegetariano Raízes")
                    .slug("salada_de_quinoa_restaurante_vegetariano_raizes")
                    .description("Salada de quinoa com legumes assados, espinafres e molho de tahini.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Healthy_quinoa_salad_with_dried_fruit.jpg/1280px-Healthy_quinoa_salad_with_dried_fruit.jpg")
                    .price(new BigDecimal("5200.00"))
                    .position(1)
                    .organization(OrganizationData.RESTAURANTE_VEGETARIANO_RAIZES.getOrganization())
                    .build()
    ),

    TOFU_GRELHADO_RESTAURANTE_VEGETARIANO_RAIZES(
            Product.builder()
                    .name("Tofu Grelhado - Restaurante Vegetariano Raízes")
                    .slug("tofu_grelhado_restaurante_vegetariano_raizes")
                    .description("Tofu grelhado com molho de soja e gengibre, servido com arroz integral.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Citrus-Tahini_Bowl_with_Grilled_Tofu_%26_Bok_Choy_%2813431238424%29.jpg/1280px-Citrus-Tahini_Bowl_with_Grilled_Tofu_%26_Bok_Choy_%2813431238424%29.jpg")
                    .price(new BigDecimal("4800.00"))
                    .position(2)
                    .organization(OrganizationData.RESTAURANTE_VEGETARIANO_RAIZES.getOrganization())
                    .build()
    ),

    LEGUMES_ASSADOS_RESTAURANTE_VEGETARIANO_RAIZES(
            Product.builder()
                    .name("Legumes Assados - Restaurante Vegetariano Raízes")
                    .slug("legumes_assados_restaurante_vegetariano_raizes")
                    .description("Legumes assados no forno com ervas, servidos com pão de forma.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c6/DFC_1025_A_plate_of_grilled_sausage_skewers_with_roasted_vegetables_golden_fries_and_a_side_of_coleslaw_with_dipping_sauce.jpg/1280px-DFC_1025_A_plate_of_grilled_sausage_skewers_with_roasted_vegetables_golden_fries_and_a_side_of_coleslaw_with_dipping_sauce.jpg")
                    .price(new BigDecimal("5500.00"))
                    .position(3)
                    .organization(OrganizationData.RESTAURANTE_VEGETARIANO_RAIZES.getOrganization())
                    .build()
    ),

    BOWL_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES(
            Product.builder()
                    .name("Bowl de Legumes - Restaurante Vegetariano Raízes")
                    .slug("bowl_de_legumes_restaurante_vegetariano_raizes")
                    .description("Bowl de legumes grelhados, grão-de-bico e molho de iogurte.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Alice_Muth_%281887-1952%29_in_The_Commercial_Appeal_of_Memphis%2C_Tennessee_on_October_4%2C_1946%2C_part_1.jpg/1280px-Alice_Muth_%281887-1952%29_in_The_Commercial_Appeal_of_Memphis%2C_Tennessee_on_October_4%2C_1946%2C_part_1.jpg")
                    .price(new BigDecimal("5000.00"))
                    .position(4)
                    .organization(OrganizationData.RESTAURANTE_VEGETARIANO_RAIZES.getOrganization())
                    .build()
    ),

    CURRY_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES(
            Product.builder()
                    .name("Curry de Legumes - Restaurante Vegetariano Raízes")
                    .slug("curry_de_legumes_restaurante_vegetariano_raizes")
                    .description("Curry de legumes com leite de coco e arroz basmati.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Aunt_Yoke_Ling%27s_Vegetable_Curry_%282874458745%29.jpg/1280px-Aunt_Yoke_Ling%27s_Vegetable_Curry_%282874458745%29.jpg")
                    .price(new BigDecimal("5300.00"))
                    .position(5)
                    .organization(OrganizationData.RESTAURANTE_VEGETARIANO_RAIZES.getOrganization())
                    .build()
    ),

    SALADA_DE_QUINOA_VEGGIE_HOUSE_LUANDA(
            Product.builder()
                    .name("Salada de Quinoa - Veggie House Luanda")
                    .slug("salada_de_quinoa_veggie_house_luanda")
                    .description("Salada de quinoa com legumes assados, espinafres e molho de tahini.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Liat_Portal_for_Foodie_Disorder_-_Quinoa%2C_Schnitzel_and_Israeli_Salad.jpg/1280px-Liat_Portal_for_Foodie_Disorder_-_Quinoa%2C_Schnitzel_and_Israeli_Salad.jpg")
                    .price(new BigDecimal("5700.00"))
                    .position(1)
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    TOFU_GRELHADO_VEGGIE_HOUSE_LUANDA(
            Product.builder()
                    .name("Tofu Grelhado - Veggie House Luanda")
                    .slug("tofu_grelhado_veggie_house_luanda")
                    .description("Tofu grelhado com molho de soja e gengibre, servido com arroz integral.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/DFC_3935_Skewered_street-food_assortment_-_grilled_meatballs_tofu_cubes_and_sausages_brushed_with_savory_sauce_and_garnished_with_fresh_cilantro.jpg/1280px-DFC_3935_Skewered_street-food_assortment_-_grilled_meatballs_tofu_cubes_and_sausages_brushed_with_savory_sauce_and_garnished_with_fresh_cilantro.jpg")
                    .price(new BigDecimal("5300.00"))
                    .position(2)
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    LEGUMES_ASSADOS_VEGGIE_HOUSE_LUANDA(
            Product.builder()
                    .name("Legumes Assados - Veggie House Luanda")
                    .slug("legumes_assados_veggie_house_luanda")
                    .description("Legumes assados no forno com ervas, servidos com pão de forma.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Egusi_soup_with_vegetables_and_dried_catfish%2C_prawns%2C_beef_and_roasted_cowskin.jpg/1280px-Egusi_soup_with_vegetables_and_dried_catfish%2C_prawns%2C_beef_and_roasted_cowskin.jpg")
                    .price(new BigDecimal("6000.00"))
                    .position(3)
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    BOWL_DE_LEGUMES_VEGGIE_HOUSE_LUANDA(
            Product.builder()
                    .name("Bowl de Legumes - Veggie House Luanda")
                    .slug("bowl_de_legumes_veggie_house_luanda")
                    .description("Bowl de legumes grelhados, grão-de-bico e molho de iogurte.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Asan_Tole_%2817211215463%29.jpg/1280px-Asan_Tole_%2817211215463%29.jpg")
                    .price(new BigDecimal("5500.00"))
                    .position(4)
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    CURRY_DE_LEGUMES_VEGGIE_HOUSE_LUANDA(
            Product.builder()
                    .name("Curry de Legumes - Veggie House Luanda")
                    .slug("curry_de_legumes_veggie_house_luanda")
                    .description("Curry de legumes com leite de coco e arroz basmati.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Bhaji_pav_2.jpg/1280px-Bhaji_pav_2.jpg")
                    .price(new BigDecimal("5800.00"))
                    .position(5)
                    .organization(OrganizationData.VEGGIE_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    SALADA_DE_QUINOA_COZINHA_VERDE(
            Product.builder()
                    .name("Salada de Quinoa - Cozinha Verde")
                    .slug("salada_de_quinoa_cozinha_verde")
                    .description("Salada de quinoa com legumes assados, espinafres e molho de tahini.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Grilled_Brie_with_Ginger_Horseradish_Baste_%26_Fruit_Nut_ToFu_Honey_Drizzle_Yogurt_%26_Bugles_%28147934104%29.jpg/1280px-Grilled_Brie_with_Ginger_Horseradish_Baste_%26_Fruit_Nut_ToFu_Honey_Drizzle_Yogurt_%26_Bugles_%28147934104%29.jpg")
                    .price(new BigDecimal("6200.00"))
                    .position(1)
                    .organization(OrganizationData.COZINHA_VERDE.getOrganization())
                    .build()
    ),

    TOFU_GRELHADO_COZINHA_VERDE(
            Product.builder()
                    .name("Tofu Grelhado - Cozinha Verde")
                    .slug("tofu_grelhado_cozinha_verde")
                    .description("Tofu grelhado com molho de soja e gengibre, servido com arroz integral.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Grilled_Tofu_Bars.jpg/1280px-Grilled_Tofu_Bars.jpg")
                    .price(new BigDecimal("5800.00"))
                    .position(2)
                    .organization(OrganizationData.COZINHA_VERDE.getOrganization())
                    .build()
    ),

    LEGUMES_ASSADOS_COZINHA_VERDE(
            Product.builder()
                    .name("Legumes Assados - Cozinha Verde")
                    .slug("legumes_assados_cozinha_verde")
                    .description("Legumes assados no forno com ervas, servidos com pão de forma.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Horka_Litinova_Panev_Tofu_Zlaty_Klas_2025.jpg/1280px-Horka_Litinova_Panev_Tofu_Zlaty_Klas_2025.jpg")
                    .price(new BigDecimal("6500.00"))
                    .position(3)
                    .organization(OrganizationData.COZINHA_VERDE.getOrganization())
                    .build()
    ),

    BOWL_DE_LEGUMES_COZINHA_VERDE(
            Product.builder()
                    .name("Bowl de Legumes - Cozinha Verde")
                    .slug("bowl_de_legumes_cozinha_verde")
                    .description("Bowl de legumes grelhados, grão-de-bico e molho de iogurte.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Liat_Portal_for_Foodie_Disorder_-_Roasted_chicken_with_cauliflower_broccoli_potatoes_rice_and_salad.jpg/1280px-Liat_Portal_for_Foodie_Disorder_-_Roasted_chicken_with_cauliflower_broccoli_potatoes_rice_and_salad.jpg")
                    .price(new BigDecimal("6000.00"))
                    .position(4)
                    .organization(OrganizationData.COZINHA_VERDE.getOrganization())
                    .build()
    ),

    CURRY_DE_LEGUMES_COZINHA_VERDE(
            Product.builder()
                    .name("Curry de Legumes - Cozinha Verde")
                    .slug("curry_de_legumes_cozinha_verde")
                    .description("Curry de legumes com leite de coco e arroz basmati.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Cabbage_with_Potatoes_Curry_-_Kolkata_2011-03-05_1911.JPG/1280px-Cabbage_with_Potatoes_Curry_-_Kolkata_2011-03-05_1911.JPG")
                    .price(new BigDecimal("6300.00"))
                    .position(5)
                    .organization(OrganizationData.COZINHA_VERDE.getOrganization())
                    .build()
    ),

    SALADA_DE_QUINOA_BI_VEGETARIANO(
            Product.builder()
                    .name("Salada de Quinoa - Bi Vegetariano")
                    .slug("salada_de_quinoa_bi_vegetariano")
                    .description("Salada de quinoa com legumes assados, espinafres e molho de tahini.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Grilled_tofu_vegetariana_arepa_with_sweet_plantains%2C_black_beans%2C_ajo_alio%2C_avocado.jpg/1280px-Grilled_tofu_vegetariana_arepa_with_sweet_plantains%2C_black_beans%2C_ajo_alio%2C_avocado.jpg")
                    .price(new BigDecimal("6700.00"))
                    .position(1)
                    .organization(OrganizationData.BI_VEGETARIANO.getOrganization())
                    .build()
    ),

    TOFU_GRELHADO_BI_VEGETARIANO(
            Product.builder()
                    .name("Tofu Grelhado - Bi Vegetariano")
                    .slug("tofu_grelhado_bi_vegetariano")
                    .description("Tofu grelhado com molho de soja e gengibre, servido com arroz integral.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Grilled_tofu_with_steamed_chard_and_spicy_mango_sauce_%283252903983%29.jpg/1280px-Grilled_tofu_with_steamed_chard_and_spicy_mango_sauce_%283252903983%29.jpg")
                    .price(new BigDecimal("6300.00"))
                    .position(2)
                    .organization(OrganizationData.BI_VEGETARIANO.getOrganization())
                    .build()
    ),

    LEGUMES_ASSADOS_BI_VEGETARIANO(
            Product.builder()
                    .name("Legumes Assados - Bi Vegetariano")
                    .slug("legumes_assados_bi_vegetariano")
                    .description("Legumes assados no forno com ervas, servidos com pão de forma.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Liat_Portal_for_Foodie_Disorder_-_Grilled_Chicken_with_Roasted_Vegetables.jpg/1280px-Liat_Portal_for_Foodie_Disorder_-_Grilled_Chicken_with_Roasted_Vegetables.jpg")
                    .price(new BigDecimal("7000.00"))
                    .position(3)
                    .organization(OrganizationData.BI_VEGETARIANO.getOrganization())
                    .build()
    ),

    BOWL_DE_LEGUMES_BI_VEGETARIANO(
            Product.builder()
                    .name("Bowl de Legumes - Bi Vegetariano")
                    .slug("bowl_de_legumes_bi_vegetariano")
                    .description("Bowl de legumes grelhados, grão-de-bico e molho de iogurte.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Manns%27_superior_seeds_%2815767651344%29.jpg/1280px-Manns%27_superior_seeds_%2815767651344%29.jpg")
                    .price(new BigDecimal("6500.00"))
                    .position(4)
                    .organization(OrganizationData.BI_VEGETARIANO.getOrganization())
                    .build()
    ),

    CURRY_DE_LEGUMES_BI_VEGETARIANO(
            Product.builder()
                    .name("Curry de Legumes - Bi Vegetariano")
                    .slug("curry_de_legumes_bi_vegetariano")
                    .description("Curry de legumes com leite de coco e arroz basmati.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Marlar_hin_%28garland_dish%29.jpg/1280px-Marlar_hin_%28garland_dish%29.jpg")
                    .price(new BigDecimal("6800.00"))
                    .position(5)
                    .organization(OrganizationData.BI_VEGETARIANO.getOrganization())
                    .build()
    ),

    SALADA_DE_QUINOA_SABOR_VEGETARIANO(
            Product.builder()
                    .name("Salada de Quinoa - Sabor Vegetariano")
                    .slug("salada_de_quinoa_sabor_vegetariano")
                    .description("Salada de quinoa com legumes assados, espinafres e molho de tahini.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Tofu_Benedict_-_Moksha_Caff%C3%A8_2026-05-03.jpg/1280px-Tofu_Benedict_-_Moksha_Caff%C3%A8_2026-05-03.jpg")
                    .price(new BigDecimal("7200.00"))
                    .position(1)
                    .organization(OrganizationData.SABOR_VEGETARIANO.getOrganization())
                    .build()
    ),

    TOFU_GRELHADO_SABOR_VEGETARIANO(
            Product.builder()
                    .name("Tofu Grelhado - Sabor Vegetariano")
                    .slug("tofu_grelhado_sabor_vegetariano")
                    .description("Tofu grelhado com molho de soja e gengibre, servido com arroz integral.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Grilled_Veggie_Tofu_Paneer_Sandwich_with_Mango_Chutney_%284918261643%29.jpg/1280px-Grilled_Veggie_Tofu_Paneer_Sandwich_with_Mango_Chutney_%284918261643%29.jpg")
                    .price(new BigDecimal("6800.00"))
                    .position(2)
                    .organization(OrganizationData.SABOR_VEGETARIANO.getOrganization())
                    .build()
    ),

    LEGUMES_ASSADOS_SABOR_VEGETARIANO(
            Product.builder()
                    .name("Legumes Assados - Sabor Vegetariano")
                    .slug("legumes_assados_sabor_vegetariano")
                    .description("Legumes assados no forno com ervas, servidos com pão de forma.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Liat_Portal_for_Foodie_Disorder_-_Home_Cooked_Chicken_and_Roasted_Vegetables.jpg/1280px-Liat_Portal_for_Foodie_Disorder_-_Home_Cooked_Chicken_and_Roasted_Vegetables.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(3)
                    .organization(OrganizationData.SABOR_VEGETARIANO.getOrganization())
                    .build()
    ),

    BOWL_DE_LEGUMES_SABOR_VEGETARIANO(
            Product.builder()
                    .name("Bowl de Legumes - Sabor Vegetariano")
                    .slug("bowl_de_legumes_sabor_vegetariano")
                    .description("Bowl de legumes grelhados, grão-de-bico e molho de iogurte.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Mother_Earth%27s_Children_p.67.jpg/1280px-Mother_Earth%27s_Children_p.67.jpg")
                    .price(new BigDecimal("7000.00"))
                    .position(4)
                    .organization(OrganizationData.SABOR_VEGETARIANO.getOrganization())
                    .build()
    ),

    CURRY_DE_LEGUMES_SABOR_VEGETARIANO(
            Product.builder()
                    .name("Curry de Legumes - Sabor Vegetariano")
                    .slug("curry_de_legumes_sabor_vegetariano")
                    .description("Curry de legumes com leite de coco e arroz basmati.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Midnight_curry_emits_great_aroma_and_ready_to_eat.jpg/1280px-Midnight_curry_emits_great_aroma_and_ready_to_eat.jpg")
                    .price(new BigDecimal("7300.00"))
                    .position(5)
                    .organization(OrganizationData.SABOR_VEGETARIANO.getOrganization())
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_PAO_QUENTE(
            Product.builder()
                    .name("Pão de Forma - Padaria Pão Quente")
                    .slug("pao_de_forma_padaria_pao_quente")
                    .description("Pão de forma tradicional, feito com farinha de trigo e fermento natural.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Beer_bread_-_loaf_sliced_in_half.jpg/1280px-Beer_bread_-_loaf_sliced_in_half.jpg")
                    .price(new BigDecimal("1200.00"))
                    .position(1)
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_PAO_QUENTE(
            Product.builder()
                    .name("Croissant de Manteiga - Padaria Pão Quente")
                    .slug("croissant_de_manteiga_padaria_pao_quente")
                    .description("Croissant folhado com manteiga francesa, crocante e leve.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/20231022_101836_Croissant_supr%C3%AAme.jpg/1280px-20231022_101836_Croissant_supr%C3%AAme.jpg")
                    .price(new BigDecimal("1500.00"))
                    .position(2)
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_PAO_QUENTE(
            Product.builder()
                    .name("Pastel de Nata - Padaria Pão Quente")
                    .slug("pastel_de_nata_padaria_pao_quente")
                    .description("Pastel de nata com massa folhada, creme de ovos e canela.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/A_cup_of_Ovaltine_a_piece_of_egg_tart_and_coconut_tart.jpg/1280px-A_cup_of_Ovaltine_a_piece_of_egg_tart_and_coconut_tart.jpg")
                    .price(new BigDecimal("900.00"))
                    .position(3)
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_PAO_QUENTE(
            Product.builder()
                    .name("Bolo de Chocolate - Padaria Pão Quente")
                    .slug("bolo_de_chocolate_padaria_pao_quente")
                    .description("Bolo de chocolate húmido, com cobertura de ganache e recheio de natas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/BAILEYS_CHOCOLATE_CAKE_-_Trading_Post_Coffee_Roasters_2025-11-25.jpg/1280px-BAILEYS_CHOCOLATE_CAKE_-_Trading_Post_Coffee_Roasters_2025-11-25.jpg")
                    .price(new BigDecimal("6500.00"))
                    .position(4)
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_PAO_QUENTE(
            Product.builder()
                    .name("Pão Doce Tradicional - Padaria Pão Quente")
                    .slug("pao_doce_tradicional_padaria_pao_quente")
                    .description("Pão doce tradicional com coco e canela por cima.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Baker_Beach_2.jpg/1280px-Baker_Beach_2.jpg")
                    .price(new BigDecimal("700.00"))
                    .position(5)
                    .organization(OrganizationData.PADARIA_PAO_QUENTE.getOrganization())
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_KWANZA(
            Product.builder()
                    .name("Pão de Forma - Padaria Kwanza")
                    .slug("pao_de_forma_padaria_kwanza")
                    .description("Pão de forma tradicional, feito com farinha de trigo e fermento natural.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Bread_in_red_bowl_atop_easter_eggs_and_loaf_of_bread_in_background.jpg/1280px-Bread_in_red_bowl_atop_easter_eggs_and_loaf_of_bread_in_background.jpg")
                    .price(new BigDecimal("1700.00"))
                    .position(1)
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_KWANZA(
            Product.builder()
                    .name("Croissant de Manteiga - Padaria Kwanza")
                    .slug("croissant_de_manteiga_padaria_kwanza")
                    .description("Croissant folhado com manteiga francesa, crocante e leve.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Baklava_croissant.jpg/1280px-Baklava_croissant.jpg")
                    .price(new BigDecimal("2000.00"))
                    .position(2)
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_KWANZA(
            Product.builder()
                    .name("Pastel de Nata - Padaria Kwanza")
                    .slug("pastel_de_nata_padaria_kwanza")
                    .description("Pastel de nata com massa folhada, creme de ovos e canela.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Apple_Crumble_%26_Custard_Tart_-_Caff%C3%A8_Nero_2025-09-14.jpg/1280px-Apple_Crumble_%26_Custard_Tart_-_Caff%C3%A8_Nero_2025-09-14.jpg")
                    .price(new BigDecimal("1400.00"))
                    .position(3)
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_KWANZA(
            Product.builder()
                    .name("Bolo de Chocolate - Padaria Kwanza")
                    .slug("bolo_de_chocolate_padaria_kwanza")
                    .description("Bolo de chocolate húmido, com cobertura de ganache e recheio de natas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Bolo_de_chocolate_em_Mogi_das_Cruzes.jpg/1280px-Bolo_de_chocolate_em_Mogi_das_Cruzes.jpg")
                    .price(new BigDecimal("7000.00"))
                    .position(4)
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_KWANZA(
            Product.builder()
                    .name("Pão Doce Tradicional - Padaria Kwanza")
                    .slug("pao_doce_tradicional_padaria_kwanza")
                    .description("Pão doce tradicional com coco e canela por cima.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Baker_New_Ulm_1974.jpg/1280px-Baker_New_Ulm_1974.jpg")
                    .price(new BigDecimal("1200.00"))
                    .position(5)
                    .organization(OrganizationData.PADARIA_KWANZA.getOrganization())
                    .build()
    ),

    PAO_DE_FORMA_PASTELARIA_DOCE_MANJAR(
            Product.builder()
                    .name("Pão de Forma - Pastelaria Doce Manjar")
                    .slug("pao_de_forma_pastelaria_doce_manjar")
                    .description("Pão de forma tradicional, feito com farinha de trigo e fermento natural.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Bread_slicing_machine_Foodtech_Br%C3%B8dskj%C3%A6remaskin_EXTRA_COOP_Norway_2017-11-02_bag_on_sliced_bread.jpg/1280px-Bread_slicing_machine_Foodtech_Br%C3%B8dskj%C3%A6remaskin_EXTRA_COOP_Norway_2017-11-02_bag_on_sliced_bread.jpg")
                    .price(new BigDecimal("2200.00"))
                    .position(1)
                    .organization(OrganizationData.PASTELARIA_DOCE_MANJAR.getOrganization())
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PASTELARIA_DOCE_MANJAR(
            Product.builder()
                    .name("Croissant de Manteiga - Pastelaria Doce Manjar")
                    .slug("croissant_de_manteiga_pastelaria_doce_manjar")
                    .description("Croissant folhado com manteiga francesa, crocante e leve.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Bungeo-ppang-shaped_croissant_%2831976973836%29.jpg/1280px-Bungeo-ppang-shaped_croissant_%2831976973836%29.jpg")
                    .price(new BigDecimal("2500.00"))
                    .position(2)
                    .organization(OrganizationData.PASTELARIA_DOCE_MANJAR.getOrganization())
                    .build()
    ),

    PASTEL_DE_NATA_PASTELARIA_DOCE_MANJAR(
            Product.builder()
                    .name("Pastel de Nata - Pastelaria Doce Manjar")
                    .slug("pastel_de_nata_pastelaria_doce_manjar")
                    .description("Pastel de nata com massa folhada, creme de ovos e canela.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Coffee_and_custard_tart_at_House_of_Morocco%2C_King%27s_Cross%2C_London_%2840750148283%29.jpg/1280px-Coffee_and_custard_tart_at_House_of_Morocco%2C_King%27s_Cross%2C_London_%2840750148283%29.jpg")
                    .price(new BigDecimal("1900.00"))
                    .position(3)
                    .organization(OrganizationData.PASTELARIA_DOCE_MANJAR.getOrganization())
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PASTELARIA_DOCE_MANJAR(
            Product.builder()
                    .name("Bolo de Chocolate - Pastelaria Doce Manjar")
                    .slug("bolo_de_chocolate_pastelaria_doce_manjar")
                    .description("Bolo de chocolate húmido, com cobertura de ganache e recheio de natas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Chocolate_Cake_2.jpg/1280px-Chocolate_Cake_2.jpg")
                    .price(new BigDecimal("7500.00"))
                    .position(4)
                    .organization(OrganizationData.PASTELARIA_DOCE_MANJAR.getOrganization())
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PASTELARIA_DOCE_MANJAR(
            Product.builder()
                    .name("Pão Doce Tradicional - Pastelaria Doce Manjar")
                    .slug("pao_doce_tradicional_pastelaria_doce_manjar")
                    .description("Pão doce tradicional com coco e canela por cima.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Bread_rolls_%285959537370%29.jpg/1280px-Bread_rolls_%285959537370%29.jpg")
                    .price(new BigDecimal("1700.00"))
                    .position(5)
                    .organization(OrganizationData.PASTELARIA_DOCE_MANJAR.getOrganization())
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_KILAMBA(
            Product.builder()
                    .name("Pão de Forma - Padaria Kilamba")
                    .slug("pao_de_forma_padaria_kilamba")
                    .description("Pão de forma tradicional, feito com farinha de trigo e fermento natural.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Breads_of_Russia.jpg/1280px-Breads_of_Russia.jpg")
                    .price(new BigDecimal("2700.00"))
                    .position(1)
                    .organization(OrganizationData.PADARIA_KILAMBA.getOrganization())
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_KILAMBA(
            Product.builder()
                    .name("Croissant de Manteiga - Padaria Kilamba")
                    .slug("croissant_de_manteiga_padaria_kilamba")
                    .description("Croissant folhado com manteiga francesa, crocante e leve.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Croissant%2C_cross_section.jpg/1280px-Croissant%2C_cross_section.jpg")
                    .price(new BigDecimal("3000.00"))
                    .position(2)
                    .organization(OrganizationData.PADARIA_KILAMBA.getOrganization())
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_KILAMBA(
            Product.builder()
                    .name("Pastel de Nata - Padaria Kilamba")
                    .slug("pastel_de_nata_padaria_kilamba")
                    .description("Pastel de nata com massa folhada, creme de ovos e canela.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Custard_tart_emerging_from_wrapper.jpg/1280px-Custard_tart_emerging_from_wrapper.jpg")
                    .price(new BigDecimal("2400.00"))
                    .position(3)
                    .organization(OrganizationData.PADARIA_KILAMBA.getOrganization())
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_KILAMBA(
            Product.builder()
                    .name("Bolo de Chocolate - Padaria Kilamba")
                    .slug("bolo_de_chocolate_padaria_kilamba")
                    .description("Bolo de chocolate húmido, com cobertura de ganache e recheio de natas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Chocolate_Cake_with_a_Decadent_Ganache.jpg/1280px-Chocolate_Cake_with_a_Decadent_Ganache.jpg")
                    .price(new BigDecimal("8000.00"))
                    .position(4)
                    .organization(OrganizationData.PADARIA_KILAMBA.getOrganization())
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_KILAMBA(
            Product.builder()
                    .name("Pão Doce Tradicional - Padaria Kilamba")
                    .slug("pao_doce_tradicional_padaria_kilamba")
                    .description("Pão doce tradicional com coco e canela por cima.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Bread_rolls_%285959538820%29.jpg/1280px-Bread_rolls_%285959538820%29.jpg")
                    .price(new BigDecimal("2200.00"))
                    .position(5)
                    .organization(OrganizationData.PADARIA_KILAMBA.getOrganization())
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_MANACA(
            Product.builder()
                    .name("Pão de Forma - Padaria Manacá")
                    .slug("pao_de_forma_padaria_manaca")
                    .description("Pão de forma tradicional, feito com farinha de trigo e fermento natural.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Fresh_made_bread_05.jpg/1280px-Fresh_made_bread_05.jpg")
                    .price(new BigDecimal("3200.00"))
                    .position(1)
                    .organization(OrganizationData.PADARIA_MANACA.getOrganization())
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_MANACA(
            Product.builder()
                    .name("Croissant de Manteiga - Padaria Manacá")
                    .slug("croissant_de_manteiga_padaria_manaca")
                    .description("Croissant folhado com manteiga francesa, crocante e leve.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Croissant%2C_whole.jpg/1280px-Croissant%2C_whole.jpg")
                    .price(new BigDecimal("3500.00"))
                    .position(2)
                    .organization(OrganizationData.PADARIA_MANACA.getOrganization())
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_MANACA(
            Product.builder()
                    .name("Pastel de Nata - Padaria Manacá")
                    .slug("pastel_de_nata_padaria_manaca")
                    .description("Pastel de nata com massa folhada, creme de ovos e canela.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Egg_Tart_at_Grain_Express%2C_Centro_Whitehorse%2C_Box_Hill%2C_2007.jpg/1280px-Egg_Tart_at_Grain_Express%2C_Centro_Whitehorse%2C_Box_Hill%2C_2007.jpg")
                    .price(new BigDecimal("2900.00"))
                    .position(3)
                    .organization(OrganizationData.PADARIA_MANACA.getOrganization())
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_MANACA(
            Product.builder()
                    .name("Bolo de Chocolate - Padaria Manacá")
                    .slug("bolo_de_chocolate_padaria_manaca")
                    .description("Bolo de chocolate húmido, com cobertura de ganache e recheio de natas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Chocolate_Cake_with_almonds.jpg/1280px-Chocolate_Cake_with_almonds.jpg")
                    .price(new BigDecimal("8500.00"))
                    .position(4)
                    .organization(OrganizationData.PADARIA_MANACA.getOrganization())
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_MANACA(
            Product.builder()
                    .name("Pão Doce Tradicional - Padaria Manacá")
                    .slug("pao_doce_tradicional_padaria_manaca")
                    .description("Pão doce tradicional com coco e canela por cima.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Bread_rolls_%285959546878%29.jpg/1280px-Bread_rolls_%285959546878%29.jpg")
                    .price(new BigDecimal("2700.00"))
                    .position(5)
                    .organization(OrganizationData.PADARIA_MANACA.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LISBOA_LINHAS_AEREAS_KWANZA(
            Product.builder()
                    .name("Voo Luanda-Lisboa - Linhas Aéreas Kwanza")
                    .slug("voo_luanda_lisboa_linhas_aereas_kwanza")
                    .description("Bilhete aéreo Luanda-Lisboa, ida e volta, com 23 kg de bagagem de mão incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Airplane_Beech_1900D_%282082947662%29.jpg/1280px-Airplane_Beech_1900D_%282082947662%29.jpg")
                    .price(new BigDecimal("480000.00"))
                    .position(1)
                    .organization(OrganizationData.LINHAS_AEREAS_KWANZA.getOrganization())
                    .build()
    ),

    VOO_LUANDA_HUAMBO_LINHAS_AEREAS_KWANZA(
            Product.builder()
                    .name("Voo Luanda-Huambo - Linhas Aéreas Kwanza")
                    .slug("voo_luanda_huambo_linhas_aereas_kwanza")
                    .description("Voo doméstico Luanda-Huambo com partida diária pela manhã e bagagem incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Aeroplane_interior_02.jpg/1280px-Aeroplane_interior_02.jpg")
                    .price(new BigDecimal("95000.00"))
                    .position(2)
                    .organization(OrganizationData.LINHAS_AEREAS_KWANZA.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LUBANGO_LINHAS_AEREAS_KWANZA(
            Product.builder()
                    .name("Voo Luanda-Lubango - Linhas Aéreas Kwanza")
                    .slug("voo_luanda_lubango_linhas_aereas_kwanza")
                    .description("Bilhete Luanda-Lubango com horário flexível e check-in feito no aeroporto.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/Boarding_Gate_Sepinggan_International_Airport_%281%29.jpg/1280px-Boarding_Gate_Sepinggan_International_Airport_%281%29.jpg")
                    .price(new BigDecimal("110000.00"))
                    .position(3)
                    .organization(OrganizationData.LINHAS_AEREAS_KWANZA.getOrganization())
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_LINHAS_AEREAS_KWANZA(
            Product.builder()
                    .name("Voo Luanda-São Paulo - Linhas Aéreas Kwanza")
                    .slug("voo_luanda_sao_paulo_linhas_aereas_kwanza")
                    .description("Bilhete internacional Luanda-São Paulo, com uma escala e bagagem despachada incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/A-4C_Skyhawk_from_VSF-1_in_flight_over_the_Med_c1968.jpg/1280px-A-4C_Skyhawk_from_VSF-1_in_flight_over_the_Med_c1968.jpg")
                    .price(new BigDecimal("620000.00"))
                    .position(4)
                    .organization(OrganizationData.LINHAS_AEREAS_KWANZA.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LONDRES_LINHAS_AEREAS_KWANZA(
            Product.builder()
                    .name("Voo Luanda-Londres - Linhas Aéreas Kwanza")
                    .slug("voo_luanda_londres_linhas_aereas_kwanza")
                    .description("Bilhete Luanda-Londres com conexões e serviço de bordo completo.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/47_Airport_departures_board_free_photo_-_Melbourne_Airport_timetable_-_Creative_Commons_Attribution.jpg/1280px-47_Airport_departures_board_free_photo_-_Melbourne_Airport_timetable_-_Creative_Commons_Attribution.jpg")
                    .price(new BigDecimal("890000.00"))
                    .position(5)
                    .organization(OrganizationData.LINHAS_AEREAS_KWANZA.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LISBOA_ANGOLA_EXPRESS_AIR(
            Product.builder()
                    .name("Voo Luanda-Lisboa - Angola Express Air")
                    .slug("voo_luanda_lisboa_angola_express_air")
                    .description("Bilhete aéreo Luanda-Lisboa, ida e volta, com 23 kg de bagagem de mão incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Airplane_Window_%28Unsplash%29.jpg/1280px-Airplane_Window_%28Unsplash%29.jpg")
                    .price(new BigDecimal("480500.00"))
                    .position(1)
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .build()
    ),

    VOO_LUANDA_HUAMBO_ANGOLA_EXPRESS_AIR(
            Product.builder()
                    .name("Voo Luanda-Huambo - Angola Express Air")
                    .slug("voo_luanda_huambo_angola_express_air")
                    .description("Voo doméstico Luanda-Huambo com partida diária pela manhã e bagagem incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/EBACE_2019%2C_Le_Grand-Saconnex_%28EB190620%29.jpg/1280px-EBACE_2019%2C_Le_Grand-Saconnex_%28EB190620%29.jpg")
                    .price(new BigDecimal("95500.00"))
                    .position(2)
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LUBANGO_ANGOLA_EXPRESS_AIR(
            Product.builder()
                    .name("Voo Luanda-Lubango - Angola Express Air")
                    .slug("voo_luanda_lubango_angola_express_air")
                    .description("Bilhete Luanda-Lubango com horário flexível e check-in feito no aeroporto.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Boarding_Gate_Sepinggan_International_Airport_%282%29.jpg/1280px-Boarding_Gate_Sepinggan_International_Airport_%282%29.jpg")
                    .price(new BigDecimal("110500.00"))
                    .position(3)
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_ANGOLA_EXPRESS_AIR(
            Product.builder()
                    .name("Voo Luanda-São Paulo - Angola Express Air")
                    .slug("voo_luanda_sao_paulo_angola_express_air")
                    .description("Bilhete internacional Luanda-São Paulo, com uma escala e bagagem despachada incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/A-4C_Skyhawk_of_VA-192_in_flight_in_1964.jpg/1280px-A-4C_Skyhawk_of_VA-192_in_flight_in_1964.jpg")
                    .price(new BigDecimal("620500.00"))
                    .position(4)
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LONDRES_ANGOLA_EXPRESS_AIR(
            Product.builder()
                    .name("Voo Luanda-Londres - Angola Express Air")
                    .slug("voo_luanda_londres_angola_express_air")
                    .description("Bilhete Luanda-Londres com conexões e serviço de bordo completo.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Brisbane_Airport_Domestic_Terminal_flights_departures_board%2C_June_2022.jpg/1280px-Brisbane_Airport_Domestic_Terminal_flights_departures_board%2C_June_2022.jpg")
                    .price(new BigDecimal("890500.00"))
                    .position(5)
                    .organization(OrganizationData.ANGOLA_EXPRESS_AIR.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LISBOA_SKY_ANGOLA_AIRLINES(
            Product.builder()
                    .name("Voo Luanda-Lisboa - Sky Angola Airlines")
                    .slug("voo_luanda_lisboa_sky_angola_airlines")
                    .description("Bilhete aéreo Luanda-Lisboa, ida e volta, com 23 kg de bagagem de mão incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Airplanes_at_CPH_3.jpg/1280px-Airplanes_at_CPH_3.jpg")
                    .price(new BigDecimal("481000.00"))
                    .position(1)
                    .organization(OrganizationData.SKY_ANGOLA_AIRLINES.getOrganization())
                    .build()
    ),

    VOO_LUANDA_HUAMBO_SKY_ANGOLA_AIRLINES(
            Product.builder()
                    .name("Voo Luanda-Huambo - Sky Angola Airlines")
                    .slug("voo_luanda_huambo_sky_angola_airlines")
                    .description("Voo doméstico Luanda-Huambo com partida diária pela manhã e bagagem incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Economy_class_interior_of_B-6528_%2820230329094242%29.jpg/1280px-Economy_class_interior_of_B-6528_%2820230329094242%29.jpg")
                    .price(new BigDecimal("96000.00"))
                    .position(2)
                    .organization(OrganizationData.SKY_ANGOLA_AIRLINES.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LUBANGO_SKY_ANGOLA_AIRLINES(
            Product.builder()
                    .name("Voo Luanda-Lubango - Sky Angola Airlines")
                    .slug("voo_luanda_lubango_sky_angola_airlines")
                    .description("Bilhete Luanda-Lubango com horário flexível e check-in feito no aeroporto.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Boarding_Gate_at_Samos_International_Airport.jpg/1280px-Boarding_Gate_at_Samos_International_Airport.jpg")
                    .price(new BigDecimal("111000.00"))
                    .position(3)
                    .organization(OrganizationData.SKY_ANGOLA_AIRLINES.getOrganization())
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_SKY_ANGOLA_AIRLINES(
            Product.builder()
                    .name("Voo Luanda-São Paulo - Sky Angola Airlines")
                    .slug("voo_luanda_sao_paulo_sky_angola_airlines")
                    .description("Bilhete internacional Luanda-São Paulo, com uma escala e bagagem despachada incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/A_wing_tip_of_an_airplane_%2840118125441%29.jpg/1280px-A_wing_tip_of_an_airplane_%2840118125441%29.jpg")
                    .price(new BigDecimal("621000.00"))
                    .position(4)
                    .organization(OrganizationData.SKY_ANGOLA_AIRLINES.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LONDRES_SKY_ANGOLA_AIRLINES(
            Product.builder()
                    .name("Voo Luanda-Londres - Sky Angola Airlines")
                    .slug("voo_luanda_londres_sky_angola_airlines")
                    .description("Bilhete Luanda-Londres com conexões e serviço de bordo completo.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Departure_Board_at_Christchurch_airport.jpg/1280px-Departure_Board_at_Christchurch_airport.jpg")
                    .price(new BigDecimal("891000.00"))
                    .position(5)
                    .organization(OrganizationData.SKY_ANGOLA_AIRLINES.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LISBOA_KUBINGA_AIR(
            Product.builder()
                    .name("Voo Luanda-Lisboa - Kubinga Air")
                    .slug("voo_luanda_lisboa_kubinga_air")
                    .description("Bilhete aéreo Luanda-Lisboa, ida e volta, com 23 kg de bagagem de mão incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Bristol_Runway.jpg/1280px-Bristol_Runway.jpg")
                    .price(new BigDecimal("481500.00"))
                    .position(1)
                    .organization(OrganizationData.KUBINGA_AIR.getOrganization())
                    .build()
    ),

    VOO_LUANDA_HUAMBO_KUBINGA_AIR(
            Product.builder()
                    .name("Voo Luanda-Huambo - Kubinga Air")
                    .slug("voo_luanda_huambo_kubinga_air")
                    .description("Voo doméstico Luanda-Huambo com partida diária pela manhã e bagagem incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Foggy_airplane_cabin.jpg/1280px-Foggy_airplane_cabin.jpg")
                    .price(new BigDecimal("96500.00"))
                    .position(2)
                    .organization(OrganizationData.KUBINGA_AIR.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LUBANGO_KUBINGA_AIR(
            Product.builder()
                    .name("Voo Luanda-Lubango - Kubinga Air")
                    .slug("voo_luanda_lubango_kubinga_air")
                    .description("Bilhete Luanda-Lubango com horário flexível e check-in feito no aeroporto.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Boarding_at_gate_G12_San_Francisco_International_Airport.jpg/1280px-Boarding_at_gate_G12_San_Francisco_International_Airport.jpg")
                    .price(new BigDecimal("111500.00"))
                    .position(3)
                    .organization(OrganizationData.KUBINGA_AIR.getOrganization())
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_KUBINGA_AIR(
            Product.builder()
                    .name("Voo Luanda-São Paulo - Kubinga Air")
                    .slug("voo_luanda_sao_paulo_kubinga_air")
                    .description("Bilhete internacional Luanda-São Paulo, com uma escala e bagagem despachada incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Above_the_Clouds_-_A_Glimpse_of_Heaven.jpg/1280px-Above_the_Clouds_-_A_Glimpse_of_Heaven.jpg")
                    .price(new BigDecimal("621500.00"))
                    .position(4)
                    .organization(OrganizationData.KUBINGA_AIR.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LONDRES_KUBINGA_AIR(
            Product.builder()
                    .name("Voo Luanda-Londres - Kubinga Air")
                    .slug("voo_luanda_londres_kubinga_air")
                    .description("Bilhete Luanda-Londres com conexões e serviço de bordo completo.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Departure_Board_at_ORD.jpg/1280px-Departure_Board_at_ORD.jpg")
                    .price(new BigDecimal("891500.00"))
                    .position(5)
                    .organization(OrganizationData.KUBINGA_AIR.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LISBOA_ROYAL_WINGS_ANGOLA(
            Product.builder()
                    .name("Voo Luanda-Lisboa - Royal Wings Angola")
                    .slug("voo_luanda_lisboa_royal_wings_angola")
                    .description("Bilhete aéreo Luanda-Lisboa, ida e volta, com 23 kg de bagagem de mão incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Kursi-Jendela_Penumpang_Pesawat.jpg/1280px-Kursi-Jendela_Penumpang_Pesawat.jpg")
                    .price(new BigDecimal("482000.00"))
                    .position(1)
                    .organization(OrganizationData.ROYAL_WINGS_ANGOLA.getOrganization())
                    .build()
    ),

    VOO_LUANDA_HUAMBO_ROYAL_WINGS_ANGOLA(
            Product.builder()
                    .name("Voo Luanda-Huambo - Royal Wings Angola")
                    .slug("voo_luanda_huambo_royal_wings_angola")
                    .description("Voo doméstico Luanda-Huambo com partida diária pela manhã e bagagem incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/GULFSTREAM_G-1_AIRPLANE_INTERIOR_-_NARA_-_17422746.jpg/1280px-GULFSTREAM_G-1_AIRPLANE_INTERIOR_-_NARA_-_17422746.jpg")
                    .price(new BigDecimal("97000.00"))
                    .position(2)
                    .organization(OrganizationData.ROYAL_WINGS_ANGOLA.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LUBANGO_ROYAL_WINGS_ANGOLA(
            Product.builder()
                    .name("Voo Luanda-Lubango - Royal Wings Angola")
                    .slug("voo_luanda_lubango_royal_wings_angola")
                    .description("Bilhete Luanda-Lubango com horário flexível e check-in feito no aeroporto.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Boarding_gate_97_at_Urumqi_International_Airport.jpg/1280px-Boarding_gate_97_at_Urumqi_International_Airport.jpg")
                    .price(new BigDecimal("112000.00"))
                    .position(3)
                    .organization(OrganizationData.ROYAL_WINGS_ANGOLA.getOrganization())
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_ROYAL_WINGS_ANGOLA(
            Product.builder()
                    .name("Voo Luanda-São Paulo - Royal Wings Angola")
                    .slug("voo_luanda_sao_paulo_royal_wings_angola")
                    .description("Bilhete internacional Luanda-São Paulo, com uma escala e bagagem despachada incluída.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Airplane_wing_sky_and_clouds.jpg/1280px-Airplane_wing_sky_and_clouds.jpg")
                    .price(new BigDecimal("622000.00"))
                    .position(4)
                    .organization(OrganizationData.ROYAL_WINGS_ANGOLA.getOrganization())
                    .build()
    ),

    VOO_LUANDA_LONDRES_ROYAL_WINGS_ANGOLA(
            Product.builder()
                    .name("Voo Luanda-Londres - Royal Wings Angola")
                    .slug("voo_luanda_londres_royal_wings_angola")
                    .description("Bilhete Luanda-Londres com conexões e serviço de bordo completo.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Departure_and_arrival_board_at_Lakselv_Airport.jpg/1280px-Departure_and_arrival_board_at_Lakselv_Airport.jpg")
                    .price(new BigDecimal("892000.00"))
                    .position(5)
                    .organization(OrganizationData.ROYAL_WINGS_ANGOLA.getOrganization())
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_AGENCIA_DE_VIAGENS_KWANZA(
            Product.builder()
                    .name("Pacote Luanda-Namibe - Agência de Viagens Kwanza")
                    .slug("pacote_luanda_namibe_agencia_de_viagens_kwanza")
                    .description("Pacote de dois dias para o deserto do Namibe com transporte, alojamento e guia.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/267_of_%27%28A_Noble_Life._By_the_author_of_%E2%80%9CJohn_Halifax%E2%80%9D_%28Dinah_Maria_Mulock%2C_afterwards_Craik%29.%29%27_%2811057815893%29.jpg/1280px-267_of_%27%28A_Noble_Life._By_the_author_of_%E2%80%9CJohn_Halifax%E2%80%9D_%28Dinah_Maria_Mulock%2C_afterwards_Craik%29.%29%27_%2811057815893%29.jpg")
                    .price(new BigDecimal("380000.00"))
                    .position(1)
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .build()
    ),

    SAFARIR_EM_BENGUELA_AGENCIA_DE_VIAGENS_KWANZA(
            Product.builder()
                    .name("Safarir em Benguela - Agência de Viagens Kwanza")
                    .slug("safarir_em_benguela_agencia_de_viagens_kwanza")
                    .description("Safarir de três dias na Baía dos Tigres com camp e guia especializado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Arriving_on_Scheveningen_beach_-_DPLA_-_b72b64566b67f5123a11ca276437c5f5.jpg/1280px-Arriving_on_Scheveningen_beach_-_DPLA_-_b72b64566b67f5123a11ca276437c5f5.jpg")
                    .price(new BigDecimal("650000.00"))
                    .position(2)
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_AGENCIA_DE_VIAGENS_KWANZA(
            Product.builder()
                    .name("Rota da Serra da Leba - Agência de Viagens Kwanza")
                    .slug("rota_da_serra_da_leba_agencia_de_viagens_kwanza")
                    .description("Excursão de um dia pela Rota da Serra da Leba com paragem no miradouro principal.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/A_trip_to_the_Little_Atlas_Mountains.jpg/1280px-A_trip_to_the_Little_Atlas_Mountains.jpg")
                    .price(new BigDecimal("290000.00"))
                    .position(3)
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .build()
    ),

    EXCURSAO_AS_ILHAS_AGENCIA_DE_VIAGENS_KWANZA(
            Product.builder()
                    .name("Excursão às Ilhas - Agência de Viagens Kwanza")
                    .slug("excursao_as_ilhas_agencia_de_viagens_kwanza")
                    .description("Excursão de um dia às ilhas do estuário de Luanda com almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Dolphin_Tour_with_Lagoon_Pontoon.jpg/1280px-Dolphin_Tour_with_Lagoon_Pontoon.jpg")
                    .price(new BigDecimal("120000.00"))
                    .position(4)
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AGENCIA_DE_VIAGENS_KWANZA(
            Product.builder()
                    .name("City Tour em Luanda - Agência de Viagens Kwanza")
                    .slug("city_tour_em_luanda_agencia_de_viagens_kwanza")
                    .description("City tour de três horas pelos principais pontos de interesse de Luanda.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/City_Sightseeing_Belfast_tour_bus_on_the_Clifton_Road_-_geograph.org.uk_-_4566846.jpg/1280px-City_Sightseeing_Belfast_tour_bus_on_the_Clifton_Road_-_geograph.org.uk_-_4566846.jpg")
                    .price(new BigDecimal("45000.00"))
                    .position(5)
                    .organization(OrganizationData.AGENCIA_DE_VIAGENS_KWANZA.getOrganization())
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_AVENTURA_VIAGENS(
            Product.builder()
                    .name("Pacote Luanda-Namibe - Aventura Viagens")
                    .slug("pacote_luanda_namibe_aventura_viagens")
                    .description("Pacote de dois dias para o deserto do Namibe com transporte, alojamento e guia.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Camel_Ride_during_the_Desert_Safari_Tour.jpg/1280px-Camel_Ride_during_the_Desert_Safari_Tour.jpg")
                    .price(new BigDecimal("380500.00"))
                    .position(1)
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .build()
    ),

    SAFARIR_EM_BENGUELA_AVENTURA_VIAGENS(
            Product.builder()
                    .name("Safarir em Benguela - Aventura Viagens")
                    .slug("safarir_em_benguela_aventura_viagens")
                    .description("Safarir de três dias na Baía dos Tigres com camp e guia especializado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/BeachClub.jpg/1280px-BeachClub.jpg")
                    .price(new BigDecimal("650500.00"))
                    .position(2)
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_AVENTURA_VIAGENS(
            Product.builder()
                    .name("Rota da Serra da Leba - Aventura Viagens")
                    .slug("rota_da_serra_da_leba_aventura_viagens")
                    .description("Excursão de um dia pela Rota da Serra da Leba com paragem no miradouro principal.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Mountain_Road_Trip_%28Unsplash%29.jpg/1280px-Mountain_Road_Trip_%28Unsplash%29.jpg")
                    .price(new BigDecimal("290500.00"))
                    .position(3)
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .build()
    ),

    EXCURSAO_AS_ILHAS_AVENTURA_VIAGENS(
            Product.builder()
                    .name("Excursão às Ilhas - Aventura Viagens")
                    .slug("excursao_as_ilhas_aventura_viagens")
                    .description("Excursão de um dia às ilhas do estuário de Luanda com almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/El_Gouna_Hill_Villas_R10.jpg/1280px-El_Gouna_Hill_Villas_R10.jpg")
                    .price(new BigDecimal("120500.00"))
                    .position(4)
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AVENTURA_VIAGENS(
            Product.builder()
                    .name("City Tour em Luanda - Aventura Viagens")
                    .slug("city_tour_em_luanda_aventura_viagens")
                    .description("City tour de três horas pelos principais pontos de interesse de Luanda.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/City_Sightseeing_Oxford_tour_bus_%26_tower_of_Sa%C3%AFd_Business_School_-_geograph.org.uk_-_3036207.jpg/1280px-City_Sightseeing_Oxford_tour_bus_%26_tower_of_Sa%C3%AFd_Business_School_-_geograph.org.uk_-_3036207.jpg")
                    .price(new BigDecimal("45500.00"))
                    .position(5)
                    .organization(OrganizationData.AVENTURA_VIAGENS.getOrganization())
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_TRAVEL_HOUSE_LUANDA(
            Product.builder()
                    .name("Pacote Luanda-Namibe - Travel House Luanda")
                    .slug("pacote_luanda_namibe_travel_house_luanda")
                    .description("Pacote de dois dias para o deserto do Namibe com transporte, alojamento e guia.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/DOHA_SAFARI.jpg/1280px-DOHA_SAFARI.jpg")
                    .price(new BigDecimal("381000.00"))
                    .position(1)
                    .organization(OrganizationData.TRAVEL_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    SAFARIR_EM_BENGUELA_TRAVEL_HOUSE_LUANDA(
            Product.builder()
                    .name("Safarir em Benguela - Travel House Luanda")
                    .slug("safarir_em_benguela_travel_house_luanda")
                    .description("Safarir de três dias na Baía dos Tigres com camp e guia especializado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2823938738774%29.jpg/1280px-Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2823938738774%29.jpg")
                    .price(new BigDecimal("651000.00"))
                    .position(2)
                    .organization(OrganizationData.TRAVEL_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_TRAVEL_HOUSE_LUANDA(
            Product.builder()
                    .name("Rota da Serra da Leba - Travel House Luanda")
                    .slug("rota_da_serra_da_leba_travel_house_luanda")
                    .description("Excursão de um dia pela Rota da Serra da Leba com paragem no miradouro principal.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Mountain_road_trip_and_hike_%2815186281254%29.jpg/1280px-Mountain_road_trip_and_hike_%2815186281254%29.jpg")
                    .price(new BigDecimal("291000.00"))
                    .position(3)
                    .organization(OrganizationData.TRAVEL_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    EXCURSAO_AS_ILHAS_TRAVEL_HOUSE_LUANDA(
            Product.builder()
                    .name("Excursão às Ilhas - Travel House Luanda")
                    .slug("excursao_as_ilhas_travel_house_luanda")
                    .description("Excursão de um dia às ilhas do estuário de Luanda com almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Enjoying_the_River_-_geograph.org.uk_-_1389596.jpg/1280px-Enjoying_the_River_-_geograph.org.uk_-_1389596.jpg")
                    .price(new BigDecimal("121000.00"))
                    .position(4)
                    .organization(OrganizationData.TRAVEL_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_TRAVEL_HOUSE_LUANDA(
            Product.builder()
                    .name("City Tour em Luanda - Travel House Luanda")
                    .slug("city_tour_em_luanda_travel_house_luanda")
                    .description("City tour de três horas pelos principais pontos de interesse de Luanda.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/City_Tour_Bus_in_Harmoni.jpg/1280px-City_Tour_Bus_in_Harmoni.jpg")
                    .price(new BigDecimal("46000.00"))
                    .position(5)
                    .organization(OrganizationData.TRAVEL_HOUSE_LUANDA.getOrganization())
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_GLOBETROTTER_ANGOLA(
            Product.builder()
                    .name("Pacote Luanda-Namibe - Globetrotter Angola")
                    .slug("pacote_luanda_namibe_globetrotter_angola")
                    .description("Pacote de dois dias para o deserto do Namibe com transporte, alojamento e guia.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Dubai_Safari.jpg/1280px-Dubai_Safari.jpg")
                    .price(new BigDecimal("381500.00"))
                    .position(1)
                    .organization(OrganizationData.GLOBETROTTER_ANGOLA.getOrganization())
                    .build()
    ),

    SAFARIR_EM_BENGUELA_GLOBETROTTER_ANGOLA(
            Product.builder()
                    .name("Safarir em Benguela - Globetrotter Angola")
                    .slug("safarir_em_benguela_globetrotter_angola")
                    .description("Safarir de três dias na Baía dos Tigres com camp e guia especializado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824271381310%29.jpg/1280px-Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824271381310%29.jpg")
                    .price(new BigDecimal("651500.00"))
                    .position(2)
                    .organization(OrganizationData.GLOBETROTTER_ANGOLA.getOrganization())
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_GLOBETROTTER_ANGOLA(
            Product.builder()
                    .name("Rota da Serra da Leba - Globetrotter Angola")
                    .slug("rota_da_serra_da_leba_globetrotter_angola")
                    .description("Excursão de um dia pela Rota da Serra da Leba com paragem no miradouro principal.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Mountain_road_trip_and_hike_%2815186775433%29.jpg/1280px-Mountain_road_trip_and_hike_%2815186775433%29.jpg")
                    .price(new BigDecimal("291500.00"))
                    .position(3)
                    .organization(OrganizationData.GLOBETROTTER_ANGOLA.getOrganization())
                    .build()
    ),

    EXCURSAO_AS_ILHAS_GLOBETROTTER_ANGOLA(
            Product.builder()
                    .name("Excursão às Ilhas - Globetrotter Angola")
                    .slug("excursao_as_ilhas_globetrotter_angola")
                    .description("Excursão de um dia às ilhas do estuário de Luanda com almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Florida_Tour%2C_August_2006_%2818961050419%29.jpg/1280px-Florida_Tour%2C_August_2006_%2818961050419%29.jpg")
                    .price(new BigDecimal("121500.00"))
                    .position(4)
                    .organization(OrganizationData.GLOBETROTTER_ANGOLA.getOrganization())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_GLOBETROTTER_ANGOLA(
            Product.builder()
                    .name("City Tour em Luanda - Globetrotter Angola")
                    .slug("city_tour_em_luanda_globetrotter_angola")
                    .description("City tour de três horas pelos principais pontos de interesse de Luanda.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/City_Tour_bus_Gda%C5%84sk.jpg/1280px-City_Tour_bus_Gda%C5%84sk.jpg")
                    .price(new BigDecimal("46500.00"))
                    .position(5)
                    .organization(OrganizationData.GLOBETROTTER_ANGOLA.getOrganization())
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_SAFARIR_VIAGENS(
            Product.builder()
                    .name("Pacote Luanda-Namibe - Safarir Viagens")
                    .slug("pacote_luanda_namibe_safarir_viagens")
                    .description("Pacote de dois dias para o deserto do Namibe com transporte, alojamento e guia.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/K.K._Oestere._Arm%C3%A9e%2C_Haus-Uniform._K.K_%3DLomb._Venet._Adel._Leibgarde_%28NYPL_b14896507-91065%29.tiff/lossy-page1-1280px-K.K._Oestere._Arm%C3%A9e%2C_Haus-Uniform._K.K_%3DLomb._Venet._Adel._Leibgarde_%28NYPL_b14896507-91065%29.tiff.jpg")
                    .price(new BigDecimal("382000.00"))
                    .position(1)
                    .organization(OrganizationData.SAFARIR_VIAGENS.getOrganization())
                    .build()
    ),

    SAFARIR_EM_BENGUELA_SAFARIR_VIAGENS(
            Product.builder()
                    .name("Safarir em Benguela - Safarir Viagens")
                    .slug("safarir_em_benguela_safarir_viagens")
                    .description("Safarir de três dias na Baía dos Tigres com camp e guia especializado.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824484623391%29.jpg/1280px-Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824484623391%29.jpg")
                    .price(new BigDecimal("652000.00"))
                    .position(2)
                    .organization(OrganizationData.SAFARIR_VIAGENS.getOrganization())
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_SAFARIR_VIAGENS(
            Product.builder()
                    .name("Rota da Serra da Leba - Safarir Viagens")
                    .slug("rota_da_serra_da_leba_safarir_viagens")
                    .description("Excursão de um dia pela Rota da Serra da Leba com paragem no miradouro principal.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Mountain_road_trip_and_hike_%2815806235385%29.jpg/1280px-Mountain_road_trip_and_hike_%2815806235385%29.jpg")
                    .price(new BigDecimal("292000.00"))
                    .position(3)
                    .organization(OrganizationData.SAFARIR_VIAGENS.getOrganization())
                    .build()
    ),

    EXCURSAO_AS_ILHAS_SAFARIR_VIAGENS(
            Product.builder()
                    .name("Excursão às Ilhas - Safarir Viagens")
                    .slug("excursao_as_ilhas_safarir_viagens")
                    .description("Excursão de um dia às ilhas do estuário de Luanda com almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Island_J%C3%B6kuls%C3%A1rl%C3%B3n_03.JPG/1280px-Island_J%C3%B6kuls%C3%A1rl%C3%B3n_03.JPG")
                    .price(new BigDecimal("122000.00"))
                    .position(4)
                    .organization(OrganizationData.SAFARIR_VIAGENS.getOrganization())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_SAFARIR_VIAGENS(
            Product.builder()
                    .name("City Tour em Luanda - Safarir Viagens")
                    .slug("city_tour_em_luanda_safarir_viagens")
                    .description("City tour de três horas pelos principais pontos de interesse de Luanda.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/City_tour%2C_Wroclaw_%28P1180439%29.jpg/1280px-City_tour%2C_Wroclaw_%28P1180439%29.jpg")
                    .price(new BigDecimal("47000.00"))
                    .position(5)
                    .organization(OrganizationData.SAFARIR_VIAGENS.getOrganization())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_OPERADORA_TURISTICA_KWANZA(
            Product.builder()
                    .name("City Tour em Luanda - Operadora Turística Kwanza")
                    .slug("city_tour_em_luanda_operadora_turistica_kwanza")
                    .description("Visita guiada a pé pelos bairros históricos de Luanda com guia falante de várias línguas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/City_Walk%2C_Leeds_-_geograph.org.uk_-_5205737.jpg/1280px-City_Walk%2C_Leeds_-_geograph.org.uk_-_5205737.jpg")
                    .price(new BigDecimal("25000.00"))
                    .position(1)
                    .organization(OrganizationData.OPERADORA_TURISTICA_KWANZA.getOrganization())
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_OPERADORA_TURISTICA_KWANZA(
            Product.builder()
                    .name("Visita à Serra da Leba - Operadora Turística Kwanza")
                    .slug("visita_a_serra_da_leba_operadora_turistica_kwanza")
                    .description("Visita guiada ao miradouro da Serra da Leba com subida panorâmica.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Biei.Shirahige-Falls2022.JPG/1280px-Biei.Shirahige-Falls2022.JPG")
                    .price(new BigDecimal("45000.00"))
                    .position(2)
                    .organization(OrganizationData.OPERADORA_TURISTICA_KWANZA.getOrganization())
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_OPERADORA_TURISTICA_KWANZA(
            Product.builder()
                    .name("Expedição à Foz do Kwanza - Operadora Turística Kwanza")
                    .slug("expedicao_a_foz_do_kwanza_operadora_turistica_kwanza")
                    .description("Expedição de dia inteiro à foz do Kwanza com barco, guia e almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Ford_A9633_NLGRF_photo_contact_sheet_%281976-05-03%29%28Gerald_Ford_Library%29.jpg/1280px-Ford_A9633_NLGRF_photo_contact_sheet_%281976-05-03%29%28Gerald_Ford_Library%29.jpg")
                    .price(new BigDecimal("65000.00"))
                    .position(3)
                    .organization(OrganizationData.OPERADORA_TURISTICA_KWANZA.getOrganization())
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_OPERADORA_TURISTICA_KWANZA(
            Product.builder()
                    .name("Tour Gastronómico no Miramar - Operadora Turística Kwanza")
                    .slug("tour_gastronomico_no_miramar_operadora_turistica_kwanza")
                    .description("Roteiro gastronómico pelo mercado e pelos restaurantes do bairro do Miramar.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/20180413_190254Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/1280px-20180413_190254Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .price(new BigDecimal("22000.00"))
                    .position(4)
                    .organization(OrganizationData.OPERADORA_TURISTICA_KWANZA.getOrganization())
                    .build()
    ),

    PASSEIO_PELA_FALESIA_OPERADORA_TURISTICA_KWANZA(
            Product.builder()
                    .name("Passeio pela Falésia - Operadora Turística Kwanza")
                    .slug("passeio_pela_falesia_operadora_turistica_kwanza")
                    .description("Passeio guiado pela costa, com pausa para o pôr do sol e lanche de pescadores.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Dorset_Coastal_Path%2C_Gad_Cliff_-_geograph.org.uk_-_79141.jpg/1280px-Dorset_Coastal_Path%2C_Gad_Cliff_-_geograph.org.uk_-_79141.jpg")
                    .price(new BigDecimal("38000.00"))
                    .position(5)
                    .organization(OrganizationData.OPERADORA_TURISTICA_KWANZA.getOrganization())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AVENTURA_GUIDES_ANGOLA(
            Product.builder()
                    .name("City Tour em Luanda - Aventura Guides Angola")
                    .slug("city_tour_em_luanda_aventura_guides_angola")
                    .description("Visita guiada a pé pelos bairros históricos de Luanda com guia falante de várias línguas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/City_Walk%2C_Leeds_-_geograph.org.uk_-_5205758.jpg/1280px-City_Walk%2C_Leeds_-_geograph.org.uk_-_5205758.jpg")
                    .price(new BigDecimal("25500.00"))
                    .position(1)
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_AVENTURA_GUIDES_ANGOLA(
            Product.builder()
                    .name("Visita à Serra da Leba - Aventura Guides Angola")
                    .slug("visita_a_serra_da_leba_aventura_guides_angola")
                    .description("Visita guiada ao miradouro da Serra da Leba com subida panorâmica.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Samoa_waterfall_scenery.jpg/1280px-Samoa_waterfall_scenery.jpg")
                    .price(new BigDecimal("45500.00"))
                    .position(2)
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_AVENTURA_GUIDES_ANGOLA(
            Product.builder()
                    .name("Expedição à Foz do Kwanza - Aventura Guides Angola")
                    .slug("expedicao_a_foz_do_kwanza_aventura_guides_angola")
                    .description("Expedição de dia inteiro à foz do Kwanza com barco, guia e almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Jim_Corebtt_National_Park_India.jpg/1280px-Jim_Corebtt_National_Park_India.jpg")
                    .price(new BigDecimal("65500.00"))
                    .position(3)
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_AVENTURA_GUIDES_ANGOLA(
            Product.builder()
                    .name("Tour Gastronómico no Miramar - Aventura Guides Angola")
                    .slug("tour_gastronomico_no_miramar_aventura_guides_angola")
                    .description("Roteiro gastronómico pelo mercado e pelos restaurantes do bairro do Miramar.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/20180413_190302Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/1280px-20180413_190302Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .price(new BigDecimal("22500.00"))
                    .position(4)
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .build()
    ),

    PASSEIO_PELA_FALESIA_AVENTURA_GUIDES_ANGOLA(
            Product.builder()
                    .name("Passeio pela Falésia - Aventura Guides Angola")
                    .slug("passeio_pela_falesia_aventura_guides_angola")
                    .description("Passeio guiado pela costa, com pausa para o pôr do sol e lanche de pescadores.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Hartland_Quay_Cliff_Walk_16%2C_Coastal_scene_-_geograph.org.uk_-_8315968.jpg/1280px-Hartland_Quay_Cliff_Walk_16%2C_Coastal_scene_-_geograph.org.uk_-_8315968.jpg")
                    .price(new BigDecimal("38500.00"))
                    .position(5)
                    .organization(OrganizationData.AVENTURA_GUIDES_ANGOLA.getOrganization())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_TURISTAS_LUANDA_GUIDES(
            Product.builder()
                    .name("City Tour em Luanda - Turistas Luanda Guides")
                    .slug("city_tour_em_luanda_turistas_luanda_guides")
                    .description("Visita guiada a pé pelos bairros históricos de Luanda com guia falante de várias línguas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/City_Walk_Meraas-Float4.jpg/1280px-City_Walk_Meraas-Float4.jpg")
                    .price(new BigDecimal("26000.00"))
                    .position(1)
                    .organization(OrganizationData.TURISTAS_LUANDA_GUIDES.getOrganization())
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_TURISTAS_LUANDA_GUIDES(
            Product.builder()
                    .name("Visita à Serra da Leba - Turistas Luanda Guides")
                    .slug("visita_a_serra_da_leba_turistas_luanda_guides")
                    .description("Visita guiada ao miradouro da Serra da Leba com subida panorâmica.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Shirahige-no-taki_Shirogane_Onsen_Biei_Hokkaido_Japan01s3.jpg/1280px-Shirahige-no-taki_Shirogane_Onsen_Biei_Hokkaido_Japan01s3.jpg")
                    .price(new BigDecimal("46000.00"))
                    .position(2)
                    .organization(OrganizationData.TURISTAS_LUANDA_GUIDES.getOrganization())
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_TURISTAS_LUANDA_GUIDES(
            Product.builder()
                    .name("Expedição à Foz do Kwanza - Turistas Luanda Guides")
                    .slug("expedicao_a_foz_do_kwanza_turistas_luanda_guides")
                    .description("Expedição de dia inteiro à foz do Kwanza com barco, guia e almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Makhtesh_Ramon_Crater%2C_peak_of_Mount_Negev_in_Israel%27s_Negev_desert%2C_some_85km_south_of_Beersheba._Activities_like_Jeep_4X4_tours%2C_hiking%2C_cycling%2C_RZRs%2C_ATVs_trips%2C_abseiling%2C_hot_air_balloons_%26_camel_Safari.jpg/1280px-thumbnail.jpg")
                    .price(new BigDecimal("66000.00"))
                    .position(3)
                    .organization(OrganizationData.TURISTAS_LUANDA_GUIDES.getOrganization())
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_TURISTAS_LUANDA_GUIDES(
            Product.builder()
                    .name("Tour Gastronómico no Miramar - Turistas Luanda Guides")
                    .slug("tour_gastronomico_no_miramar_turistas_luanda_guides")
                    .description("Roteiro gastronómico pelo mercado e pelos restaurantes do bairro do Miramar.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/20180413_190400Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market.jpg/1280px-20180413_190400Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market.jpg")
                    .price(new BigDecimal("23000.00"))
                    .position(4)
                    .organization(OrganizationData.TURISTAS_LUANDA_GUIDES.getOrganization())
                    .build()
    ),

    PASSEIO_PELA_FALESIA_TURISTAS_LUANDA_GUIDES(
            Product.builder()
                    .name("Passeio pela Falésia - Turistas Luanda Guides")
                    .slug("passeio_pela_falesia_turistas_luanda_guides")
                    .description("Passeio guiado pela costa, com pausa para o pôr do sol e lanche de pescadores.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Hartland_Quay_Cliff_Walk_26%2C_Coastal_scene_-_geograph.org.uk_-_8315997.jpg/1280px-Hartland_Quay_Cliff_Walk_26%2C_Coastal_scene_-_geograph.org.uk_-_8315997.jpg")
                    .price(new BigDecimal("39000.00"))
                    .position(5)
                    .organization(OrganizationData.TURISTAS_LUANDA_GUIDES.getOrganization())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_EXPEDICOES_KALANDULA(
            Product.builder()
                    .name("City Tour em Luanda - Expedições Kalandula")
                    .slug("city_tour_em_luanda_expedicoes_kalandula")
                    .description("Visita guiada a pé pelos bairros históricos de Luanda com guia falante de várias línguas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/City_Walk_Orlando_07.jpg/1280px-City_Walk_Orlando_07.jpg")
                    .price(new BigDecimal("26500.00"))
                    .position(1)
                    .organization(OrganizationData.EXPEDICOES_KALANDULA.getOrganization())
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_EXPEDICOES_KALANDULA(
            Product.builder()
                    .name("Visita à Serra da Leba - Expedições Kalandula")
                    .slug("visita_a_serra_da_leba_expedicoes_kalandula")
                    .description("Visita guiada ao miradouro da Serra da Leba com subida panorâmica.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Shirahige_Falls%2C_Biei_River%2C_Hokkaido%2C_Japan.jpg/1280px-Shirahige_Falls%2C_Biei_River%2C_Hokkaido%2C_Japan.jpg")
                    .price(new BigDecimal("46500.00"))
                    .position(2)
                    .organization(OrganizationData.EXPEDICOES_KALANDULA.getOrganization())
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_EXPEDICOES_KALANDULA(
            Product.builder()
                    .name("Expedição à Foz do Kwanza - Expedições Kalandula")
                    .slug("expedicao_a_foz_do_kwanza_expedicoes_kalandula")
                    .description("Expedição de dia inteiro à foz do Kwanza com barco, guia e almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Outlaw_Trail%2C_Sedona_6-24-22_-_Explored_-_Flickr_-_Sharon_Mollerus.jpg/1280px-Outlaw_Trail%2C_Sedona_6-24-22_-_Explored_-_Flickr_-_Sharon_Mollerus.jpg")
                    .price(new BigDecimal("66500.00"))
                    .position(3)
                    .organization(OrganizationData.EXPEDICOES_KALANDULA.getOrganization())
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_EXPEDICOES_KALANDULA(
            Product.builder()
                    .name("Tour Gastronómico no Miramar - Expedições Kalandula")
                    .slug("tour_gastronomico_no_miramar_expedicoes_kalandula")
                    .description("Roteiro gastronómico pelo mercado e pelos restaurantes do bairro do Miramar.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/20180413_194910Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/1280px-20180413_194910Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .price(new BigDecimal("23500.00"))
                    .position(4)
                    .organization(OrganizationData.EXPEDICOES_KALANDULA.getOrganization())
                    .build()
    ),

    PASSEIO_PELA_FALESIA_EXPEDICOES_KALANDULA(
            Product.builder()
                    .name("Passeio pela Falésia - Expedições Kalandula")
                    .slug("passeio_pela_falesia_expedicoes_kalandula")
                    .description("Passeio guiado pela costa, com pausa para o pôr do sol e lanche de pescadores.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Hartland_Quay_Cliff_Walk_28%2C_Coastal_scene_-_geograph.org.uk_-_8316000.jpg/1280px-Hartland_Quay_Cliff_Walk_28%2C_Coastal_scene_-_geograph.org.uk_-_8316000.jpg")
                    .price(new BigDecimal("39500.00"))
                    .position(5)
                    .organization(OrganizationData.EXPEDICOES_KALANDULA.getOrganization())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_GUIA_TOURS_MIRAMAR(
            Product.builder()
                    .name("City Tour em Luanda - Guia Tours Miramar")
                    .slug("city_tour_em_luanda_guia_tours_miramar")
                    .description("Visita guiada a pé pelos bairros históricos de Luanda com guia falante de várias línguas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Shirahige_Falls.jpg/1280px-Shirahige_Falls.jpg")
                    .price(new BigDecimal("27000.00"))
                    .position(1)
                    .organization(OrganizationData.GUIA_TOURS_MIRAMAR.getOrganization())
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_GUIA_TOURS_MIRAMAR(
            Product.builder()
                    .name("Visita à Serra da Leba - Guia Tours Miramar")
                    .slug("visita_a_serra_da_leba_guia_tours_miramar")
                    .description("Visita guiada ao miradouro da Serra da Leba com subida panorâmica.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Shirahige_Falls_20230712_01.jpg/1280px-Shirahige_Falls_20230712_01.jpg")
                    .price(new BigDecimal("47000.00"))
                    .position(2)
                    .organization(OrganizationData.GUIA_TOURS_MIRAMAR.getOrganization())
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_GUIA_TOURS_MIRAMAR(
            Product.builder()
                    .name("Expedição à Foz do Kwanza - Guia Tours Miramar")
                    .slug("expedicao_a_foz_do_kwanza_guia_tours_miramar")
                    .description("Expedição de dia inteiro à foz do Kwanza com barco, guia e almoço incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Punta_Cana_Just_Safari_-_Jeep_Tour.jpg/1280px-Punta_Cana_Just_Safari_-_Jeep_Tour.jpg")
                    .price(new BigDecimal("67000.00"))
                    .position(3)
                    .organization(OrganizationData.GUIA_TOURS_MIRAMAR.getOrganization())
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_GUIA_TOURS_MIRAMAR(
            Product.builder()
                    .name("Tour Gastronómico no Miramar - Guia Tours Miramar")
                    .slug("tour_gastronomico_no_miramar_guia_tours_miramar")
                    .description("Roteiro gastronómico pelo mercado e pelos restaurantes do bairro do Miramar.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/20180413_195443Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/1280px-20180413_195443Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .price(new BigDecimal("24000.00"))
                    .position(4)
                    .organization(OrganizationData.GUIA_TOURS_MIRAMAR.getOrganization())
                    .build()
    ),

    PASSEIO_PELA_FALESIA_GUIA_TOURS_MIRAMAR(
            Product.builder()
                    .name("Passeio pela Falésia - Guia Tours Miramar")
                    .slug("passeio_pela_falesia_guia_tours_miramar")
                    .description("Passeio guiado pela costa, com pausa para o pôr do sol e lanche de pescadores.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Hartland_Quay_Cliff_Walk_35%2C_Coastal_scene_-_geograph.org.uk_-_8316011.jpg/1280px-Hartland_Quay_Cliff_Walk_35%2C_Coastal_scene_-_geograph.org.uk_-_8316011.jpg")
                    .price(new BigDecimal("40000.00"))
                    .position(5)
                    .organization(OrganizationData.GUIA_TOURS_MIRAMAR.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_INTERPRETES_DE_LUANDA(
            Product.builder()
                    .name("Intérprete de Espanhol - Intérpretes de Luanda")
                    .slug("interprete_de_espanhol_interpretes_de_luanda")
                    .description("Intérprete de espanhol para reuniões de negócios e visitas técnicas, com hora extra disponível.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Panorama%2C_Massachusetts_Agricultural_College_%281916%29.jpg/1280px-Panorama%2C_Massachusetts_Agricultural_College_%281916%29.jpg")
                    .price(new BigDecimal("25000.00"))
                    .position(1)
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_FRANCES_INTERPRETES_DE_LUANDA(
            Product.builder()
                    .name("Intérprete de Francês - Intérpretes de Luanda")
                    .slug("interprete_de_frances_interpretes_de_luanda")
                    .description("Intérprete de francês para negociações, com experiência nos sectores de petróleo e gás.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/European_Masters_in_Conference_Interpreting_%28EMCI%29.jpg/1280px-European_Masters_in_Conference_Interpreting_%28EMCI%29.jpg")
                    .price(new BigDecimal("28000.00"))
                    .position(2)
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_INGLES_INTERPRETES_DE_LUANDA(
            Product.builder()
                    .name("Intérprete de Inglês - Intérpretes de Luanda")
                    .slug("interprete_de_ingles_interpretes_de_luanda")
                    .description("Intérprete de inglês conferências, treinamentos e sessões comerciais.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/A_person_is_reaching_for_a_computer_mouse_while_headphones_lie_nearby_on_a_soft_surface.jpg/1280px-A_person_is_reaching_for_a_computer_mouse_while_headphones_lie_nearby_on_a_soft_surface.jpg")
                    .price(new BigDecimal("30000.00"))
                    .position(3)
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .build()
    ),

    GUIA_DE_CONFERENCIA_INTERPRETES_DE_LUANDA(
            Product.builder()
                    .name("Guia de Conferência - Intérpretes de Luanda")
                    .slug("guia_de_conferencia_interpretes_de_luanda")
                    .description("Intérprete simultâneo para conferências e eventos, com equipamento de som incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Secretary_Kerry_Walks_Through_the_Plaza_de_Armas_in_Old_Havana_%2820391450389%29.jpg/1280px-Secretary_Kerry_Walks_Through_the_Plaza_de_Armas_in_Old_Havana_%2820391450389%29.jpg")
                    .price(new BigDecimal("45000.00"))
                    .position(4)
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_INTERPRETES_DE_LUANDA(
            Product.builder()
                    .name("Tradução de Documentos - Intérpretes de Luanda")
                    .slug("traducao_de_documentos_interpretes_de_luanda")
                    .description("Tradução juramentada de documentos comerciais e técnicos, com entrega em 48 horas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176975.tif/lossy-page1-1280px-Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176975.tif.jpg")
                    .price(new BigDecimal("18000.00"))
                    .position(5)
                    .organization(OrganizationData.INTERPRETES_DE_LUANDA.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_GLOBAL_VOICES_ANGOLA(
            Product.builder()
                    .name("Intérprete de Espanhol - Global Voices Angola")
                    .slug("interprete_de_espanhol_global_voices_angola")
                    .description("Intérprete de espanhol para reuniões de negócios e visitas técnicas, com hora extra disponível.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Ajay_Piramal_at_Horasis_Global_India_Business_Meeting_2014.jpg/1280px-Ajay_Piramal_at_Horasis_Global_India_Business_Meeting_2014.jpg")
                    .price(new BigDecimal("25500.00"))
                    .position(1)
                    .organization(OrganizationData.GLOBAL_VOICES_ANGOLA.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_FRANCES_GLOBAL_VOICES_ANGOLA(
            Product.builder()
                    .name("Intérprete de Francês - Global Voices Angola")
                    .slug("interprete_de_frances_global_voices_angola")
                    .description("Intérprete de francês para negociações, com experiência nos sectores de petróleo e gás.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Interpreter_and_Nez_Perce_Indians%2C_by_J._W._Hansard.png/1280px-Interpreter_and_Nez_Perce_Indians%2C_by_J._W._Hansard.png")
                    .price(new BigDecimal("28500.00"))
                    .position(2)
                    .organization(OrganizationData.GLOBAL_VOICES_ANGOLA.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_INGLES_GLOBAL_VOICES_ANGOLA(
            Product.builder()
                    .name("Intérprete de Inglês - Global Voices Angola")
                    .slug("interprete_de_ingles_global_voices_angola")
                    .description("Intérprete de inglês conferências, treinamentos e sessões comerciais.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Abandoned_headphones_%28Unsplash%29.jpg/1280px-Abandoned_headphones_%28Unsplash%29.jpg")
                    .price(new BigDecimal("30500.00"))
                    .position(3)
                    .organization(OrganizationData.GLOBAL_VOICES_ANGOLA.getOrganization())
                    .build()
    ),

    GUIA_DE_CONFERENCIA_GLOBAL_VOICES_ANGOLA(
            Product.builder()
                    .name("Guia de Conferência - Global Voices Angola")
                    .slug("guia_de_conferencia_global_voices_angola")
                    .description("Intérprete simultâneo para conferências e eventos, com equipamento de som incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/IM_L7_GIMS_2024_1X7A2003.jpg/1280px-IM_L7_GIMS_2024_1X7A2003.jpg")
                    .price(new BigDecimal("45500.00"))
                    .position(4)
                    .organization(OrganizationData.GLOBAL_VOICES_ANGOLA.getOrganization())
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_GLOBAL_VOICES_ANGOLA(
            Product.builder()
                    .name("Tradução de Documentos - Global Voices Angola")
                    .slug("traducao_de_documentos_global_voices_angola")
                    .description("Tradução juramentada de documentos comerciais e técnicos, com entrega em 48 horas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/INTERIOR_DETAIL_VIEW_OF_THE_STATE_FORESTER%27S_OFFICE%2C_VIEW_LOOKING_NORTHWEST_AT_HIS_DESK._-_Oregon_State_Forester%27s_Office_Complex%2C_2600_State_Street%2C_Salem%2C_Marion%2C_OR_HABS_OR-186-29.tif/lossy-page1-1280px-thumbnail.tif.jpg")
                    .price(new BigDecimal("18500.00"))
                    .position(5)
                    .organization(OrganizationData.GLOBAL_VOICES_ANGOLA.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_TRADUCAO_E_INTERPRETE_SERVICES(
            Product.builder()
                    .name("Intérprete de Espanhol - Tradução e Intérprete Services")
                    .slug("interprete_de_espanhol_traducao_e_interprete_services")
                    .description("Intérprete de espanhol para reuniões de negócios e visitas técnicas, com hora extra disponível.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Alan_Hassenfeld%2C_Chairman_Hasbro_USA%2C_at_the_Horasis_Global_China_Business_Meeting_2013.jpg/1280px-Alan_Hassenfeld%2C_Chairman_Hasbro_USA%2C_at_the_Horasis_Global_China_Business_Meeting_2013.jpg")
                    .price(new BigDecimal("26000.00"))
                    .position(1)
                    .organization(OrganizationData.TRADUCAO_E_INTERPRETE_SERVICES.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_FRANCES_TRADUCAO_E_INTERPRETE_SERVICES(
            Product.builder()
                    .name("Intérprete de Francês - Tradução e Intérprete Services")
                    .slug("interprete_de_frances_traducao_e_interprete_services")
                    .description("Intérprete de francês para negociações, com experiência nos sectores de petróleo e gás.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Interpreters_%2801113764%29_%289840785866%29.jpg/1280px-Interpreters_%2801113764%29_%289840785866%29.jpg")
                    .price(new BigDecimal("29000.00"))
                    .position(2)
                    .organization(OrganizationData.TRADUCAO_E_INTERPRETE_SERVICES.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_INGLES_TRADUCAO_E_INTERPRETE_SERVICES(
            Product.builder()
                    .name("Intérprete de Inglês - Tradução e Intérprete Services")
                    .slug("interprete_de_ingles_traducao_e_interprete_services")
                    .description("Intérprete de inglês conferências, treinamentos e sessões comerciais.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Brown_headphones_iPad_%28Unsplash%29.jpg/1280px-Brown_headphones_iPad_%28Unsplash%29.jpg")
                    .price(new BigDecimal("31000.00"))
                    .position(3)
                    .organization(OrganizationData.TRADUCAO_E_INTERPRETE_SERVICES.getOrganization())
                    .build()
    ),

    GUIA_DE_CONFERENCIA_TRADUCAO_E_INTERPRETE_SERVICES(
            Product.builder()
                    .name("Guia de Conferência - Tradução e Intérprete Services")
                    .slug("guia_de_conferencia_traducao_e_interprete_services")
                    .description("Intérprete simultâneo para conferências e eventos, com equipamento de som incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/IM_L7_GIMS_2024_1X7A2005.jpg/1280px-IM_L7_GIMS_2024_1X7A2005.jpg")
                    .price(new BigDecimal("46000.00"))
                    .position(4)
                    .organization(OrganizationData.TRADUCAO_E_INTERPRETE_SERVICES.getOrganization())
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_TRADUCAO_E_INTERPRETE_SERVICES(
            Product.builder()
                    .name("Tradução de Documentos - Tradução e Intérprete Services")
                    .slug("traducao_de_documentos_traducao_e_interprete_services")
                    .description("Tradução juramentada de documentos comerciais e técnicos, com entrega em 48 horas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.jpg/1280px-Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.jpg")
                    .price(new BigDecimal("19000.00"))
                    .position(5)
                    .organization(OrganizationData.TRADUCAO_E_INTERPRETE_SERVICES.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_INTERPRETE_PRO_ANGOLA(
            Product.builder()
                    .name("Intérprete de Espanhol - Intérprete Pro Angola")
                    .slug("interprete_de_espanhol_interprete_pro_angola")
                    .description("Intérprete de espanhol para reuniões de negócios e visitas técnicas, com hora extra disponível.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Antonio_Esc%C3%A1mez_%28Horasis_Global_India_Business_Meeting_2010%29.jpg/1280px-Antonio_Esc%C3%A1mez_%28Horasis_Global_India_Business_Meeting_2010%29.jpg")
                    .price(new BigDecimal("26500.00"))
                    .position(1)
                    .organization(OrganizationData.INTERPRETE_PRO_ANGOLA.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_FRANCES_INTERPRETE_PRO_ANGOLA(
            Product.builder()
                    .name("Intérprete de Francês - Intérprete Pro Angola")
                    .slug("interprete_de_frances_interprete_pro_angola")
                    .description("Intérprete de francês para negociações, com experiência nos sectores de petróleo e gás.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Turkish_Language_Interpreter_Umair_Ahsan%2C_Translator_terc%C3%BCman_%C3%A7evirmen_Teacher_in_Lahore_Pakistan.jpg/1280px-Turkish_Language_Interpreter_Umair_Ahsan%2C_Translator_terc%C3%BCman_%C3%A7evirmen_Teacher_in_Lahore_Pakistan.jpg")
                    .price(new BigDecimal("29500.00"))
                    .position(2)
                    .organization(OrganizationData.INTERPRETE_PRO_ANGOLA.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_INGLES_INTERPRETE_PRO_ANGOLA(
            Product.builder()
                    .name("Intérprete de Inglês - Intérprete Pro Angola")
                    .slug("interprete_de_ingles_interprete_pro_angola")
                    .description("Intérprete de inglês conferências, treinamentos e sessões comerciais.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Desk-music-headphones-earphones_%2824243083451%29.jpg/1280px-Desk-music-headphones-earphones_%2824243083451%29.jpg")
                    .price(new BigDecimal("31500.00"))
                    .position(3)
                    .organization(OrganizationData.INTERPRETE_PRO_ANGOLA.getOrganization())
                    .build()
    ),

    GUIA_DE_CONFERENCIA_INTERPRETE_PRO_ANGOLA(
            Product.builder()
                    .name("Guia de Conferência - Intérprete Pro Angola")
                    .slug("guia_de_conferencia_interprete_pro_angola")
                    .description("Intérprete simultâneo para conferências e eventos, com equipamento de som incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/IM_L7_GIMS_2024_1X7A2240.jpg/1280px-IM_L7_GIMS_2024_1X7A2240.jpg")
                    .price(new BigDecimal("46500.00"))
                    .position(4)
                    .organization(OrganizationData.INTERPRETE_PRO_ANGOLA.getOrganization())
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_INTERPRETE_PRO_ANGOLA(
            Product.builder()
                    .name("Tradução de Documentos - Intérprete Pro Angola")
                    .slug("traducao_de_documentos_interprete_pro_angola")
                    .description("Tradução juramentada de documentos comerciais e técnicos, com entrega em 48 horas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.tif/lossy-page1-1280px-Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.tif.jpg")
                    .price(new BigDecimal("19500.00"))
                    .position(5)
                    .organization(OrganizationData.INTERPRETE_PRO_ANGOLA.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_IDIOMAS_KWANZA(
            Product.builder()
                    .name("Intérprete de Espanhol - Idiomas Kwanza")
                    .slug("interprete_de_espanhol_idiomas_kwanza")
                    .description("Intérprete de espanhol para reuniões de negócios e visitas técnicas, com hora extra disponível.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/David_Landsman_at_Horasis_Global_India_Business_Meeting_2014.jpg/1280px-David_Landsman_at_Horasis_Global_India_Business_Meeting_2014.jpg")
                    .price(new BigDecimal("27000.00"))
                    .position(1)
                    .organization(OrganizationData.IDIOMAS_KWANZA.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_FRANCES_IDIOMAS_KWANZA(
            Product.builder()
                    .name("Intérprete de Francês - Idiomas Kwanza")
                    .slug("interprete_de_frances_idiomas_kwanza")
                    .description("Intérprete de francês para negociações, com experiência nos sectores de petróleo e gás.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Gregory_Barker%2C_Minister_of_State_for_Energy_and_Climate_Change%2C_United_Kingdom%2C_keynoting_the_Global_India_Business_Meeting_%2814513453892%29.jpg/1280px-Gregory_Barker%2C_Minister_of_State_for_Energy_and_Climate_Change%2C_United_Kingdom%2C_keynoting_the_Global_India_Business_Meeting_%2814513453892%29.jpg")
                    .price(new BigDecimal("30000.00"))
                    .position(2)
                    .organization(OrganizationData.IDIOMAS_KWANZA.getOrganization())
                    .build()
    ),

    INTERPRETE_DE_INGLES_IDIOMAS_KWANZA(
            Product.builder()
                    .name("Intérprete de Inglês - Idiomas Kwanza")
                    .slug("interprete_de_ingles_idiomas_kwanza")
                    .description("Intérprete de inglês conferências, treinamentos e sessões comerciais.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Girl_in_headphones_%28cropped%29.jpg/1280px-Girl_in_headphones_%28cropped%29.jpg")
                    .price(new BigDecimal("32000.00"))
                    .position(3)
                    .organization(OrganizationData.IDIOMAS_KWANZA.getOrganization())
                    .build()
    ),

    GUIA_DE_CONFERENCIA_IDIOMAS_KWANZA(
            Product.builder()
                    .name("Guia de Conferência - Idiomas Kwanza")
                    .slug("guia_de_conferencia_idiomas_kwanza")
                    .description("Intérprete simultâneo para conferências e eventos, com equipamento de som incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/IM_L7_GIMS_2024_1X7A2241.jpg/1280px-IM_L7_GIMS_2024_1X7A2241.jpg")
                    .price(new BigDecimal("47000.00"))
                    .position(4)
                    .organization(OrganizationData.IDIOMAS_KWANZA.getOrganization())
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_IDIOMAS_KWANZA(
            Product.builder()
                    .name("Tradução de Documentos - Idiomas Kwanza")
                    .slug("traducao_de_documentos_idiomas_kwanza")
                    .description("Tradução juramentada de documentos comerciais e técnicos, com entrega em 48 horas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176976.tif/lossy-page1-1280px-Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176976.tif.jpg")
                    .price(new BigDecimal("20000.00"))
                    .position(5)
                    .organization(OrganizationData.IDIOMAS_KWANZA.getOrganization())
                    .build()
    ),

    QUARTO_TWIN_DELUXE_EPICSANA(
            Product.builder()
                    .name("Quarto Twin Deluxe - Luanda")
                    .slug("quarto_twin_deluxe_luanda")
                    .description("Quarto para duas pessoas com varanda privativa e vista para a baía.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Hotel_Sunroute_Ariake_Standard_Single_bedroom_20110603-001.jpg/1280px-Hotel_Sunroute_Ariake_Standard_Single_bedroom_20110603-001.jpg")
                    .price(new BigDecimal("135000.00"))
                    .position(3)
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .build()
    ),

    APARTAMENTO_FAMILIAR_EPICSANA(
            Product.builder()
                    .name("Apartamento Familiar - Luanda")
                    .slug("apartamento_familiar_luanda")
                    .description("Apartamento com sala, cozinha equipada e capacidade para quatro pessoas.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Bed_in_hotel_room_5.jpg/1280px-Bed_in_hotel_room_5.jpg")
                    .price(new BigDecimal("210000.00"))
                    .position(4)
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .build()
    ),

    PACOTE_DUAS_NOITES_EPICSANA(
            Product.builder()
                    .name("Pacote Duas Noites - Luanda")
                    .slug("pacote_duas_noites_luanda")
                    .description("Pacote de duas noites com pequeno-almoço, transferência de aeroporto e acesso ao lounge.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242121913%29.jpg/1280px-Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242121913%29.jpg")
                    .price(new BigDecimal("480000.00"))
                    .position(5)
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .build()
    ),

    QUARTO_INDIVIDUAL_EXECUTIVO_MIRAMAR(
            Product.builder()
                    .name("Quarto Individual Executivo - Miramar")
                    .slug("quarto_individual_executivo_miramar")
                    .description("Quarto individual com secretária, ar condicionado e Wi-Fi de alta velocidade.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Petit_Trianon_%2824007466150%29.jpg/1280px-Petit_Trianon_%2824007466150%29.jpg")
                    .price(new BigDecimal("38000.00"))
                    .position(2)
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .build()
    ),

    QUARTO_FAMILIAR_COM_VARANDA_MIRAMAR(
            Product.builder()
                    .name("Quarto Familiar com Varanda - Miramar")
                    .slug("quarto_familiar_com_varanda_miramar")
                    .description("Quarto para três pessoas com varanda sobre a cidade e breakfast incluído.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Drake_Hotel%2C_Chicago%2C_Illinois_%2842718090014%29.jpg/1280px-Drake_Hotel%2C_Chicago%2C_Illinois_%2842718090014%29.jpg")
                    .price(new BigDecimal("62000.00"))
                    .position(3)
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .build()
    ),

    SUITE_MIRAMAR_COM_VISTA_PARA_O_MAR_MIRAMAR(
            Product.builder()
                    .name("Suite Miramar com Vista para o Mar - Miramar")
                    .slug("suite_miramar_com_vista_para_o_mar_miramar")
                    .description("Suite com sala de estar e varanda virada para o Atlântico.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Fireplace%2C_Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/1280px-Fireplace%2C_Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .price(new BigDecimal("88000.00"))
                    .position(4)
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .build()
    ),

    ESTADIA_MENSAL_COM_DESCONTO_MIRAMAR(
            Product.builder()
                    .name("Estadia Mensal com Desconto - Miramar")
                    .slug("estadia_mensal_com_desconto_miramar")
                    .description("Alojamento mensal com limpeza semanal, utilitários e acesso ao terraço.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/IBIS_Hotel_Belfast_-_Castle_Street_%285676280619%29.jpg/1280px-IBIS_Hotel_Belfast_-_Castle_Street_%285676280619%29.jpg")
                    .price(new BigDecimal("900000.00"))
                    .position(5)
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .build()
    ),

    QUARTO_INDIVIDUAL_SIMPLES_HUAMBO(
            Product.builder()
                    .name("Quarto Individual Simples - Huambo")
                    .slug("quarto_individual_simples_huambo")
                    .description("Quarto individual com roupa de cama, mesa de estudo e aquecimento central.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Petit_Trianon_%2824194880042%29.jpg/1280px-Petit_Trianon_%2824194880042%29.jpg")
                    .price(new BigDecimal("18000.00"))
                    .position(2)
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .build()
    ),

    QUARTO_CASAL_COM_BANHEIRA_HUAMBO(
            Product.builder()
                    .name("Quarto Casal com Banheira - Huambo")
                    .slug("quarto_casal_com_banheira_huambo")
                    .description("Quarto de casal com banheira e água quente permanente.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Guest_room_with_one_bed%2C_Frye_Hotel%2C_Seattle%2C_circa_1923_%28MOHAI_8674%29.jpg/1280px-Guest_room_with_one_bed%2C_Frye_Hotel%2C_Seattle%2C_circa_1923_%28MOHAI_8674%29.jpg")
                    .price(new BigDecimal("32000.00"))
                    .position(3)
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .build()
    ),

    PENSAO_COMPLETA_POR_DIA_HUAMBO(
            Product.builder()
                    .name("Pensão Completa por Dia - Huambo")
                    .slug("pensao_completa_por_dia_huambo")
                    .description("Pensão com pequeno-almoço, jantar e lavandaria incluídos.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Fireplace%2C_George%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/1280px-Fireplace%2C_George%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .price(new BigDecimal("24000.00"))
                    .position(4)
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .build()
    ),

    SALA_DE_CONFERENCIAS_POR_HORA_HUAMBO(
            Product.builder()
                    .name("Sala de Conferências por Hora - Huambo")
                    .slug("sala_de_conferencias_por_hora_huambo")
                    .description("Sala equipada com projector, climatização e serviço de café.")
                    .image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Ibis_Budget_Potsdamer_Platz_%2820160415_225548%29.jpg/1280px-Ibis_Budget_Potsdamer_Platz_%2820160415_225548%29.jpg")
                    .price(new BigDecimal("15000.00"))
                    .position(5)
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .build()
    );

    private final Product product;
}
