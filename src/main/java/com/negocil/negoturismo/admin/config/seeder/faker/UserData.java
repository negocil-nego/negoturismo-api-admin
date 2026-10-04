package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.shared.user.enums.UserStatus;
import com.negocil.negoturismo.admin.shared.user.enums.UserType;
import com.negocil.negoturismo.admin.shared.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public enum UserData {
    ANA_SILVA(
            User.builder()
                    .name("Ana Silva")
                    .username("anasilva")
                    .email("ana.silva@negoturismo.com")
                    .phone("(+244)923456789")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/A_candid_girl_multitasking_%2815564777093%29.jpg/1280px-A_candid_girl_multitasking_%2815564777093%29.jpg")
                    .birthday(LocalDate.of(1992, 5, 12))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    CARLOS_NDALU(
            User.builder()
                    .name("Carlos Ndalu")
                    .username("carlosndalu")
                    .email("carlos.ndalu@negoturismo.com")
                    .phone("(+244)912345678")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/0032_IMG_0282.jpg/1280px-0032_IMG_0282.jpg")
                    .birthday(LocalDate.of(1988, 8, 24))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    MATEUS_KALANDULA(
            User.builder()
                    .name("Mateus Kalandula")
                    .username("mateuskalandula")
                    .email("mateus.kalandula@negoturismo.com")
                    .phone("(+244)933456789")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/03_StefanoCorso_191221.jpg/1280px-03_StefanoCorso_191221.jpg")
                    .birthday(LocalDate.of(1990, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    JULIETA_BENGUELA(
            User.builder()
                    .name("Julieta Benguela")
                    .username("julietabenguela")
                    .email("julieta.benguela@negoturismo.com")
                    .phone("(+244)943456789")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Adina_bar-shalom.jpg/1280px-Adina_bar-shalom.jpg")
                    .birthday(LocalDate.of(1995, 10, 15))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    EPIC_SANA_OWNER(
            User.builder()
                    .name("Epic Sana Owner")
                    .username("epicsana_owner")
                    .email("epicsana@negoturismo.com")
                    .phone("(+244)922345678")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/2019_hume_portrait.jpg/1280px-2019_hume_portrait.jpg")
                    .birthday(LocalDate.of(1980, 2, 2))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    MIRAMAR_OWNER(
            User.builder()
                    .name("Pensão Miramar Owner")
                    .username("pensao_miramar_owner")
                    .email("miramar@negoturismo.com")
                    .phone("(+244)922345679")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/%24UBZ_.jpg/1280px-%24UBZ_.jpg")
                    .birthday(LocalDate.of(1985, 3, 3))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    HUAMBO_OWNER(
            User.builder()
                    .name("Hospedaria Huambo Owner")
                    .username("hospedaria_huambo_owner")
                    .email("huambo@negoturismo.com")
                    .phone("(+244)922345680")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/2022-09-17_Andreaestra%C3%9Fe_Karstadt_Hannover%2C_Wir_machen_Stadt%2C_Alexander_Angelis%2C_Architekt_und_Initiator_CORE_Oldenburg.jpg/1280px-2022-09-17_Andreaestra%C3%9Fe_Karstadt_Hannover%2C_Wir_machen_Stadt%2C_Alexander_Angelis%2C_Architekt_und_Initiator_CORE_Oldenburg.jpg")
                    .birthday(LocalDate.of(1978, 4, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    HOTEL_BAIA_DE_LUANDA_OWNER(
            User.builder()
                    .name("António Kiluanje")
                    .username("hotel_baia_de_luanda_owner")
                    .email("contato@hotebaialuanda.ao")
                    .phone("(+244)924000000")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/2022-11-15_J%C3%BCrgen_Friede_Skulptur_Florale_Lichtfontaine_%282018%29%2C_Wikipedia_Hannover.jpg/1280px-2022-11-15_J%C3%BCrgen_Friede_Skulptur_Florale_Lichtfontaine_%282018%29%2C_Wikipedia_Hannover.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    HOTEL_MILANO_RESORT_SPA_OWNER(
            User.builder()
                    .name("Joaquim Kiala Neto")
                    .username("hotel_milano_resort_spa_owner")
                    .email("contato@miloresortspa.ao")
                    .phone("(+244)924000001")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/2017-08-12_Michel_de_la_Cheneli%C3%A8re.jpg/1280px-2017-08-12_Michel_de_la_Cheneli%C3%A8re.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    HOTEL_KALANDULA_PALACE_OWNER(
            User.builder()
                    .name("Manuel Kiala Cabral")
                    .username("hotel_kalandula_palace_owner")
                    .email("contato@kalandulapalace.ao")
                    .phone("(+244)924000002")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Keef_Trouble_01.jpg/1280px-Keef_Trouble_01.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    MIRAMAR_BUSINESS_HOTEL_OWNER(
            User.builder()
                    .name("Fernando Paulo Domingos")
                    .username("miramar_business_hotel_owner")
                    .email("contato@miramarbusiness.ao")
                    .phone("(+244)924000003")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/20ottobr_2021.jpg/1280px-20ottobr_2021.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    HOTEL_CASCADE_CITY_OWNER(
            User.builder()
                    .name("Armando Sebastião")
                    .username("hotel_cascade_city_owner")
                    .email("contato@cascadecityhotel.ao")
                    .phone("(+244)924000004")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/220404-EMERIGE-Benoist_APPARU-0219-2.jpg/1280px-220404-EMERIGE-Benoist_APPARU-0219-2.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    POUSADA_VILA_HARMONY_OWNER(
            User.builder()
                    .name("Isabel Nzinga Kambeu")
                    .username("pousada_vila_harmony_owner")
                    .email("contato@vilaharmony.ao")
                    .phone("(+244)924000005")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/00000PORTRAIT_00000_BURST20190711153456770.jpg/1280px-00000PORTRAIT_00000_BURST20190711153456770.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    POUSADA_BAIA_AZUL_OWNER(
            User.builder()
                    .name("Lurdes Benguela Neto")
                    .username("pousada_baia_azul_owner")
                    .email("contato@pousadabaiaazul.ao")
                    .phone("(+244)924000006")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c6/Alina_L._Romanowski%2C_U.S._Ambassador.jpg/1280px-Alina_L._Romanowski%2C_U.S._Ambassador.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    POUSADA_RECANTO_VERDE_OWNER(
            User.builder()
                    .name("Marta Kiala Domingos")
                    .username("pousada_recanto_verde_owner")
                    .email("contato@pousadarecantoverde.ao")
                    .phone("(+244)924000007")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/8300_sincadena.jpg/1280px-8300_sincadena.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    POUSADA_SAO_KIZUA_OWNER(
            User.builder()
                    .name("Joana Benguela Paulo")
                    .username("pousada_sao_kizua_owner")
                    .email("contato@pousadasaokizua.ao")
                    .phone("(+244)924000008")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Aida_Keykhaii.jpg/1280px-Aida_Keykhaii.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    GUEST_HOUSE_MIRAMAR_INN_OWNER(
            User.builder()
                    .name("Domingos Kambue Mingas")
                    .username("guest_house_miramar_inn_owner")
                    .email("contato@miramarinn.ao")
                    .phone("(+244)924000009")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/2015-07-22_Event_Drones_and_Aerial_Observation_New_Technologies_for_Property_Rights%2C_Human_Rights%2C_and_Global_Development_%2819330821924%29.jpg/1280px-2015-07-22_Event_Drones_and_Aerial_Observation_New_Technologies_for_Property_Rights%2C_Human_Rights%2C_and_Global_Development_%2819330821924%29.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    HOSPEDARIA_PROGRESSO_OWNER(
            User.builder()
                    .name("Sónia Mingas Kiala")
                    .username("hospedaria_progresso_owner")
                    .email("contato@hospedariaprogresso.ao")
                    .phone("(+244)924000010")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/%22Anas%C3%ADn_Moan%C3%ADna%2C_11.05.20%2C_Radolfzell%2C_Deutschland.jpg%22.jpg/1280px-%22Anas%C3%ADn_Moan%C3%ADna%2C_11.05.20%2C_Radolfzell%2C_Deutschland.jpg%22.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    HOSPEDARIA_KWANZA_OWNER(
            User.builder()
                    .name("Deolinda Kiala Cabral")
                    .username("hospedaria_kwanza_owner")
                    .email("contato@hospedariakwanza.ao")
                    .phone("(+244)924000011")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Aleksandra_Blinnikka_ja_Blanesin_treenileiri.jpg/1280px-Aleksandra_Blinnikka_ja_Blanesin_treenileiri.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    HOSPEDARIA_KATANGA_OWNER(
            User.builder()
                    .name("Nelson Baptista Domingos")
                    .username("hospedaria_katanga_owner")
                    .email("contato@hospedariakatanga.ao")
                    .phone("(+244)924000012")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/2019_Jan_14_-_Prayagraj_Kumbh_Mela_-_Sitting_Baba.jpg/1280px-2019_Jan_14_-_Prayagraj_Kumbh_Mela_-_Sitting_Baba.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    HOSPEDARIA_NOVA_VIDA_OWNER(
            User.builder()
                    .name("Eugénio Nzinga Paulo")
                    .username("hospedaria_nova_vida_owner")
                    .email("contato@hospedarianovavida.ao")
                    .phone("(+244)924000013")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/2022-08-17_Andreaesta%C3%9Fe_Karstadt_Hannover%2C_Wir_machen_Stadt%2C_Moderator_Jan_Egge_Sedelies.jpg/1280px-2022-08-17_Andreaesta%C3%9Fe_Karstadt_Hannover%2C_Wir_machen_Stadt%2C_Moderator_Jan_Egge_Sedelies.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    HOSPEDARIA_SAO_KIZUA_OWNER(
            User.builder()
                    .name("Esperança Mingas Neto")
                    .username("hospedaria_sao_kizua_owner")
                    .email("contato@hospedariasaokizua.ao")
                    .phone("(+244)924000014")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/0146Baliuag_San_Rafael_Bulacan_36.jpg/1280px-0146Baliuag_San_Rafael_Bulacan_36.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    RESTAURANTE_O_MUSQUETE_OWNER(
            User.builder()
                    .name("Teixeira Kiala Domingos")
                    .username("restaurante_o_musquete_owner")
                    .email("contato@omusquete.ao")
                    .phone("(+244)924000015")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/08_St%C3%A9phane_Dupont_02-2019.jpg/1280px-08_St%C3%A9phane_Dupont_02-2019.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    RESTAURANTE_MAR_E_TERRA_OWNER(
            User.builder()
                    .name("Carlos Mingas Baptista")
                    .username("restaurante_mar_e_terra_owner")
                    .email("contato@marterra.ao")
                    .phone("(+244)924000016")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/197A0366.jpg/1280px-197A0366.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    RESTAURANTE_KWANZA_LIVING_OWNER(
            User.builder()
                    .name("Paulo Cabral Mingas")
                    .username("restaurante_kwanza_living_owner")
                    .email("contato@kwanzaliving.ao")
                    .phone("(+244)924000017")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/135A9739.jpg/1280px-135A9739.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    RESTAURANTE_SABOR_ANGOLANO_OWNER(
            User.builder()
                    .name("Julieta Benguela Kambeu")
                    .username("restaurante_sabor_angolano_owner")
                    .email("contato@saborangolano.ao")
                    .phone("(+244)924000018")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/01_Elena_Folk.jpg/1280px-01_Elena_Folk.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    RESTAURANTE_TALATONA_OWNER(
            User.builder()
                    .name("Mateus Kalandula Neto")
                    .username("restaurante_talatona_owner")
                    .email("contato@restaurantetalatona.ao")
                    .phone("(+244)924000019")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/20190611235311_IMG_6325_copy.jpg/1280px-20190611235311_IMG_6325_copy.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    CANTINHO_DA_MAE_ANGOLA_OWNER(
            User.builder()
                    .name("Lurdes Benguela Kiala")
                    .username("cantinho_da_mae_angola_owner")
                    .email("contato@cantinhodamae.ao")
                    .phone("(+244)924000020")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/2022-10-06_Kerstin_Berghoff-Ising%2C_Vorstand_der_Sparkasse_Hannover.jpg/1280px-2022-10-06_Kerstin_Berghoff-Ising%2C_Vorstand_der_Sparkasse_Hannover.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SABORES_DA_NOSSA_TERRA_OWNER(
            User.builder()
                    .name("Mateus Kalandula Kambeu")
                    .username("sabores_da_nossa_terra_owner")
                    .email("contato@saboresdataterra.ao")
                    .phone("(+244)924000021")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/2010-06-26_Warszawa.JPG/1280px-2010-06-26_Warszawa.JPG")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    TASCA_DO_MUAMBA_OWNER(
            User.builder()
                    .name("Isabel Nzinga Mingas")
                    .username("tasca_do_muamba_owner")
                    .email("contato@tascamuamba.ao")
                    .phone("(+244)924000022")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/A.fedorska.jpg/1280px-A.fedorska.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    COZINHA_DO_KILAMBA_OWNER(
            User.builder()
                    .name("Manuel Kiala Nzinga")
                    .username("cozinha_do_kilamba_owner")
                    .email("contato@cozinhadokilamba.ao")
                    .phone("(+244)924000023")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/07_%CE%9B%CE%91%CE%96%CE%91%CE%A1%CE%9F%CE%A3_%CE%A3%CE%A0%CE%A5%CE%A1%CE%99%CE%94%CE%97%CE%A3.jpg/1280px-07_%CE%9B%CE%91%CE%96%CE%91%CE%A1%CE%9F%CE%A3_%CE%A3%CE%A0%CE%A5%CE%A1%CE%99%CE%94%CE%97%CE%A3.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SOLAR_DO_KWANZA_OWNER(
            User.builder()
                    .name("Joana Benguela Mingas")
                    .username("solar_do_kwanza_owner")
                    .email("contato@solardokwanza.ao")
                    .phone("(+244)924000024")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/01_portrait_motion_blur_experimental_digital_photography_by_Rick_Doble.jpg/1280px-01_portrait_motion_blur_experimental_digital_photography_by_Rick_Doble.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PIZZERIA_NAPOLI_LUANDA_OWNER(
            User.builder()
                    .name("Ana Kiala Domingos")
                    .username("pizzeria_napoli_luanda_owner")
                    .email("contato@pizzerianapoli.ao")
                    .phone("(+244)924000025")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/A_tourist_woman_portrait_%2834873116772%29.jpg/1280px-A_tourist_woman_portrait_%2834873116772%29.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PIZZERIA_FORNO_ANGOLA_OWNER(
            User.builder()
                    .name("Rui Cachoeira Neto")
                    .username("pizzeria_forno_angola_owner")
                    .email("contato@fornoangola.ao")
                    .phone("(+244)924000026")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/19760005_copie.jpg/1280px-19760005_copie.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PIZZERIA_MSLICE_OWNER(
            User.builder()
                    .name("Sónia Mingas Kambeu")
                    .username("pizzeria_mslice_owner")
                    .email("contato@pizzeriamslice.ao")
                    .phone("(+244)924000027")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/2nd_March_Anti-troika_demonstration_%22And_my_future%3F%22_%288522641946%29.jpg/1280px-2nd_March_Anti-troika_demonstration_%22And_my_future%3F%22_%288522641946%29.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PIZZERIA_MANGUERINHA_OWNER(
            User.builder()
                    .name("Nelson Baptista Kiala")
                    .username("pizzeria_manguerinha_owner")
                    .email("contato@pizzeriamanguerinha.ao")
                    .phone("(+244)924000028")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/2023-03-23_Michael_Schefers_bei_Wikipedia_Hannover.jpg/1280px-2023-03-23_Michael_Schefers_bei_Wikipedia_Hannover.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PIZZERIA_BELLA_VISTA_OWNER(
            User.builder()
                    .name("Helena Mingas Cabral")
                    .username("pizzeria_bella_vista_owner")
                    .email("contato@pizzeriabellavista.ao")
                    .phone("(+244)924000029")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/20130620_Ursula_Karlowski_0479.JPG/1280px-20130620_Ursula_Karlowski_0479.JPG")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SNACK_BAR_O_PONTO_OWNER(
            User.builder()
                    .name("Adão Kambale Neto")
                    .username("snack_bar_o_ponto_owner")
                    .email("contato@snackbaroponto.ao")
                    .phone("(+244)924000030")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/1600x360_atelier_francoise_petrovitch_c_herve_plumet_f73fd.jpg/1280px-1600x360_atelier_francoise_petrovitch_c_herve_plumet_f73fd.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    BURGER_STATION_LUANDA_OWNER(
            User.builder()
                    .name("Marta Kiala Domingos")
                    .username("burger_station_luanda_owner")
                    .email("contato@burgerstation.ao")
                    .phone("(+244)924000031")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/20011013200kNR_Brigitte.jpg/1280px-20011013200kNR_Brigitte.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    FAST_FOOD_KWANZA_OWNER(
            User.builder()
                    .name("Filipe Neto Mingas")
                    .username("fast_food_kwanza_owner")
                    .email("contato@fastfoodkwanza.ao")
                    .phone("(+244)924000032")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/2019-07-25Iguazu.jpg/1280px-2019-07-25Iguazu.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    LANCHES_DO_MIRAMAR_OWNER(
            User.builder()
                    .name("Esperança Mingas Kambeu")
                    .username("lanches_do_miramar_owner")
                    .email("contato@lanchesdomiramar.ao")
                    .phone("(+244)924000033")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/Alex003_%2853353920236%29.jpg/1280px-Alex003_%2853353920236%29.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    FOOD_TRUCK_TAXI_AZUL_OWNER(
            User.builder()
                    .name("Paula Sebastião Neto")
                    .username("food_truck_taxi_azul_owner")
                    .email("contato@taxiazulfoodtruck.ao")
                    .phone("(+244)924000034")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/AAR700118-Edit.jpg/1280px-AAR700118-Edit.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    CHURRASQUEIRA_DO_ZE_OWNER(
            User.builder()
                    .name("Carlos Mingas Paulo")
                    .username("churrasqueira_do_ze_owner")
                    .email("contato@churrasqueiradoze.ao")
                    .phone("(+244)924000035")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/140128-D-BW835-504_%2812191133205%29.jpg/1280px-140128-D-BW835-504_%2812191133205%29.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    GRELHADOS_MIUDOS_KIZUA_OWNER(
            User.builder()
                    .name("Joaquim Kiala Cabral")
                    .username("grelhados_miudos_kizua_owner")
                    .email("contato@grelhoskizua.ao")
                    .phone("(+244)924000036")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/20170718085740_illustration_x4_colored.jpg/1280px-20170718085740_illustration_x4_colored.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    ESPETOS_DA_BAIA_OWNER(
            User.builder()
                    .name("António Kiluanje Kambeu")
                    .username("espetos_da_baia_owner")
                    .email("contato@espetosdabaia.ao")
                    .phone("(+244)924000037")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/20190422_Odon_Noblia_2.jpg/1280px-20190422_Odon_Noblia_2.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    CHURRASCO_KING_OWNER(
            User.builder()
                    .name("Nelson Baptista Mingas")
                    .username("churrasco_king_owner")
                    .email("contato@churrascoking.ao")
                    .phone("(+244)924000038")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/2015_Chipotle_MLS_Homegrow_%289%29.jpg/1280px-2015_Chipotle_MLS_Homegrow_%289%29.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    GRELHADO_DA_CASA_OWNER(
            User.builder()
                    .name("Teixeira Kiala Benedo")
                    .username("grelhado_da_casa_owner")
                    .email("contato@grelhadodacasa.ao")
                    .phone("(+244)924000039")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/160419_Giom_Bruere_portrait_2.jpg/1280px-160419_Giom_Bruere_portrait_2.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    MARISQUEIRA_BAIA_DE_LUANDA_OWNER(
            User.builder()
                    .name("Cristina Neto Kiala")
                    .username("marisqueira_baia_de_luanda_owner")
                    .email("contato@marisqueirabaia.ao")
                    .phone("(+244)924000040")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/2022-11-15_Christine_Preitauer_GF_vom_KreHtiv_Netzwerk_Hannover_e.V.jpg/1280px-2022-11-15_Christine_Preitauer_GF_vom_KreHtiv_Netzwerk_Hannover_e.V.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    MARISQUEIRA_DO_PORTO_OWNER(
            User.builder()
                    .name("Domingos Kambue Paulo")
                    .username("marisqueira_do_porto_owner")
                    .email("contato@marisqueiradoporto.ao")
                    .phone("(+244)924000041")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/20181016_McComasD_DJA_002w.jpg/1280px-20181016_McComasD_DJA_002w.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    MARISQUEIRA_KILAMBA_OWNER(
            User.builder()
                    .name("Lurdes Benguela Mingas")
                    .username("marisqueira_kilamba_owner")
                    .email("contato@marisqueirakilamba.ao")
                    .phone("(+244)924000042")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Adriana_Balaguer_Actriz_1.jpg/1280px-Adriana_Balaguer_Actriz_1.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    MARISQUEIRA_DE_BENGUELA_OWNER(
            User.builder()
                    .name("Paula Sebastião Kambeu")
                    .username("marisqueira_de_benguela_owner")
                    .email("contato@marisqueirabenguela.ao")
                    .phone("(+244)924000043")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Akha_laos_11_03a.jpg/1280px-Akha_laos_11_03a.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    MARISQUEIRA_DO_NAMIBE_OWNER(
            User.builder()
                    .name("Filipe Neto Kambeu")
                    .username("marisqueira_do_namibe_owner")
                    .email("contato@marisqueiranamibe.ao")
                    .phone("(+244)924000044")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/2015.10.27_045b_Glencoe.jpg/1280px-2015.10.27_045b_Glencoe.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SUSHI_KIZUA_OWNER(
            User.builder()
                    .name("Helena Mingas Neto")
                    .username("sushi_kizua_owner")
                    .email("contato@sushikizua.ao")
                    .phone("(+244)924000045")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/A_very_quiet_Woman_%282861590061%29.jpg/1280px-A_very_quiet_Woman_%282861590061%29.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SUSHI_BOM_DIA_OWNER(
            User.builder()
                    .name("Rui Cachoeira Kambeu")
                    .username("sushi_bom_dia_owner")
                    .email("contato@sushibomdia.ao")
                    .phone("(+244)924000046")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/1._John_Greening_high_res_%28photographer_Adrian_Bullers%29.jpg/1280px-1._John_Greening_high_res_%28photographer_Adrian_Bullers%29.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SUSHI_TOKYO_LUANDA_OWNER(
            User.builder()
                    .name("Sónia Mingas Benedo")
                    .username("sushi_tokyo_luanda_owner")
                    .email("contato@sushitokyoluanda.ao")
                    .phone("(+244)924000047")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/15.03.11_MAI.Repros.Ursula_van_Diemen.jpg/1280px-15.03.11_MAI.Repros.Ursula_van_Diemen.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SUSHI_SAKURA_OWNER(
            User.builder()
                    .name("Ana Kiala Mingas")
                    .username("sushi_sakura_owner")
                    .email("contato@sushisakura.ao")
                    .phone("(+244)924000048")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Alexandra_Wachter.jpg/1280px-Alexandra_Wachter.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SUSHI_MANGA_OWNER(
            User.builder()
                    .name("Marta Kiala Kambeu")
                    .username("sushi_manga_owner")
                    .email("contato@sushimanga.ao")
                    .phone("(+244)924000049")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/8K0A6896.jpg/1280px-8K0A6896.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    CAFE_KWANZA_OWNER(
            User.builder()
                    .name("Joana Benguela Mingas")
                    .username("cafe_kwanza_owner")
                    .email("contato@cafekwanza.ao")
                    .phone("(+244)924000050")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/2019-04-13_Miller-159-Edit.jpg/1280px-2019-04-13_Miller-159-Edit.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    CAFE_BOSSA_NOVA_OWNER(
            User.builder()
                    .name("Carlos Mingas Kambeu")
                    .username("cafe_bossa_nova_owner")
                    .email("contato@cafebossanova.ao")
                    .phone("(+244)924000051")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/2016_artist_Chang_Chen-Yu_portrait.jpg/1280px-2016_artist_Chang_Chen-Yu_portrait.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    CAFE_DO_MIRAMAR_OWNER(
            User.builder()
                    .name("Cristina Neto Kiala")
                    .username("cafe_do_miramar_owner")
                    .email("contato@cafedomiramar.ao")
                    .phone("(+244)924000052")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/Allef_Vinicius_2017-04-21_%28Unsplash_TIs6u5Pl-Wc%29.jpg/1280px-Allef_Vinicius_2017-04-21_%28Unsplash_TIs6u5Pl-Wc%29.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    CAFE_PAO_QUENTE_OWNER(
            User.builder()
                    .name("Teixeira Kiala Kambeu")
                    .username("cafe_pao_quente_owner")
                    .email("contato@cafepaoquente.ao")
                    .phone("(+244)924000053")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/180612_Dr_Finian_Tan_Portrait_00022.jpg/1280px-180612_Dr_Finian_Tan_Portrait_00022.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    COFFEE_STOP_ANGOLA_OWNER(
            User.builder()
                    .name("Filipe Neto Mingas")
                    .username("coffee_stop_angola_owner")
                    .email("contato@coffeestopangola.ao")
                    .phone("(+244)924000054")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/01_FEDERICO_BARDAZZI.jpg/1280px-01_FEDERICO_BARDAZZI.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    BAR_222_OWNER(
            User.builder()
                    .name("Adão Kambale Kiala")
                    .username("bar_222_owner")
                    .email("contato@bar222.ao")
                    .phone("(+244)924000055")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/20160121_134134_HDR.jpg/1280px-20160121_134134_HDR.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    BAR_TROPICAL_OWNER(
            User.builder()
                    .name("Domingos Kambue Mingas")
                    .username("bar_tropical_owner")
                    .email("contato@bartropical.ao")
                    .phone("(+244)924000056")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/200831_EPFL_David_Suter_Portrait_cut.jpg/1280px-200831_EPFL_David_Suter_Portrait_cut.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    BAR_DO_KIZUA_OWNER(
            User.builder()
                    .name("Nelson Baptista Kiala")
                    .username("bar_do_kizua_owner")
                    .email("contato@bardokizua.ao")
                    .phone("(+244)924000057")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/035-darrenhull-BC3C5161.jpg/1280px-035-darrenhull-BC3C5161.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PUB_KILAMBA_OWNER(
            User.builder()
                    .name("Paula Sebastião Mingas")
                    .username("pub_kilamba_owner")
                    .email("contato@pubkilamba.ao")
                    .phone("(+244)924000058")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Alejandra_Paredones_.jpg/1280px-Alejandra_Paredones_.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    BAR_ESQUINA_DO_MIRAMAR_OWNER(
            User.builder()
                    .name("Rui Cachoeira Neto")
                    .username("bar_esquina_do_miramar_owner")
                    .email("contato@baresticado.ao")
                    .phone("(+244)924000059")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/2019_Feb_04_-_Kumbh_Mela_-_Portrait_15.jpg/1280px-2019_Feb_04_-_Kumbh_Mela_-_Portrait_15.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SELF_SERVICE_KWANZA_OWNER(
            User.builder()
                    .name("Manuel Kiala Benedo")
                    .username("self_service_kwanza_owner")
                    .email("contato@selfservicekwanza.ao")
                    .phone("(+244)924000060")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/17.03.16_mh_Simec_Newport_263.jpg/1280px-17.03.16_mh_Simec_Newport_263.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SELF_SERVICE_DO_ZE_OWNER(
            User.builder()
                    .name("Isabel Nzinga Mingas")
                    .username("self_service_do_ze_owner")
                    .email("contato@selfservicedoze.ao")
                    .phone("(+244)924000061")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/1/15/Albulena_Haxhiu.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SELF_SERVICE_KILAMBA_OWNER(
            User.builder()
                    .name("Sónia Mingas Kiala")
                    .username("self_service_kilamba_owner")
                    .email("contato@selfservicekilamba.ao")
                    .phone("(+244)924000062")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Amanda_Candido.jpg/1280px-Amanda_Candido.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SELF_SERVICE_CENTRAL_OWNER(
            User.builder()
                    .name("Carlos Mingas Neto")
                    .username("self_service_central_owner")
                    .email("contato@selfservicecentral.ao")
                    .phone("(+244)924000063")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/1DX_5471.jpg/1280px-1DX_5471.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SELF_SERVICE_DO_MIRAMAR_OWNER(
            User.builder()
                    .name("Lurdes Benguela Kambeu")
                    .username("self_service_do_miramar_owner")
                    .email("contato@selfservicedomiramar.ao")
                    .phone("(+244)924000064")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/A_photographer_with_a_beautiful_smile_%2812722249134%29.jpg/1280px-A_photographer_with_a_beautiful_smile_%2812722249134%29.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    RESTAURANTE_VEGETARIANO_RAIZES_OWNER(
            User.builder()
                    .name("Esperança Mingas Neto")
                    .username("restaurante_vegetariano_raizes_owner")
                    .email("contato@restaurantaraizes.ao")
                    .phone("(+244)924000065")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/A_woman_with_personnality_%28396421310%29.jpg/1280px-A_woman_with_personnality_%28396421310%29.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    VEGGIE_HOUSE_LUANDA_OWNER(
            User.builder()
                    .name("Helena Mingas Kiala")
                    .username("veggie_house_luanda_owner")
                    .email("contato@veggiehouseluanda.ao")
                    .phone("(+244)924000066")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Alla_Efimova_photographed_by_Simon_Rogghe.jpg/1280px-Alla_Efimova_photographed_by_Simon_Rogghe.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    COZINHA_VERDE_OWNER(
            User.builder()
                    .name("Joana Benguela Neto")
                    .username("cozinha_verde_owner")
                    .email("contato@cozinhaverde.ao")
                    .phone("(+244)924000067")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/A_%288158631384%29.jpg/1280px-A_%288158631384%29.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    BI_VEGETARIANO_OWNER(
            User.builder()
                    .name("Ana Kiala Mingas")
                    .username("bi_vegetariano_owner")
                    .email("contato@bivegetariano.ao")
                    .phone("(+244)924000068")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Alex_Deam_portrait_2025_2.jpg/1280px-Alex_Deam_portrait_2025_2.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SABOR_VEGETARIANO_OWNER(
            User.builder()
                    .name("Marta Kiala Mingas")
                    .username("sabor_vegetariano_owner")
                    .email("contato@saborvegetariano.ao")
                    .phone("(+244)924000069")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Aleksandra_G%C4%85sowska_pisarka.jpg/1280px-Aleksandra_G%C4%85sowska_pisarka.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PADARIA_PAO_QUENTE_OWNER(
            User.builder()
                    .name("Teixeira Kiala Mingas")
                    .username("padaria_pao_quente_owner")
                    .email("contato@padariapaoquente.ao")
                    .phone("(+244)924000070")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/00995b307bce4dd232b30f08fa789470_original.4503248.jpg/1280px-00995b307bce4dd232b30f08fa789470_original.4503248.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PADARIA_KWANZA_OWNER(
            User.builder()
                    .name("Adão Kambale Cabral")
                    .username("padaria_kwanza_owner")
                    .email("contato@padariakwanza.ao")
                    .phone("(+244)924000071")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/2023-03-23_Martin_Seeger_Kiosk_Toto_Lotto_Engelbosteler_Damm.jpg/1280px-2023-03-23_Martin_Seeger_Kiosk_Toto_Lotto_Engelbosteler_Damm.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PASTELARIA_DOCE_MANJAR_OWNER(
            User.builder()
                    .name("Cristina Neto Mingas")
                    .username("pastelaria_doce_manjar_owner")
                    .email("contato@docemanjar.ao")
                    .phone("(+244)924000072")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/1880-ri-147-Angelika_Beer_Piraten.jpg/1280px-1880-ri-147-Angelika_Beer_Piraten.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PADARIA_KILAMBA_OWNER(
            User.builder()
                    .name("Paula Sebastião Kiala")
                    .username("padaria_kilamba_owner")
                    .email("contato@padariakilamba.ao")
                    .phone("(+244)924000073")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c6/Adri_Lima_em_mar%C3%A7o_de_2022.jpg/1280px-Adri_Lima_em_mar%C3%A7o_de_2022.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PADARIA_MANACA_OWNER(
            User.builder()
                    .name("Rui Cachoeira Mingas")
                    .username("padaria_manaca_owner")
                    .email("contato@padariamanaca.ao")
                    .phone("(+244)924000074")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/2024-03-02_Aufhof_Hannover%2C_Artist_and_Designer_Sebastian_Peetz.jpg/1280px-2024-03-02_Aufhof_Hannover%2C_Artist_and_Designer_Sebastian_Peetz.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    LINHAS_AEREAS_KWANZA_OWNER(
            User.builder()
                    .name("Armando Sebastião Kiala")
                    .username("linhas_aereas_kwanza_owner")
                    .email("contato@linhasaereaskwanza.ao")
                    .phone("(+244)924000075")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/1_chan_sek_keong_2012.jpg/1280px-1_chan_sek_keong_2012.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    ANGOLA_EXPRESS_AIR_OWNER(
            User.builder()
                    .name("Joaquim Kiala Mingas")
                    .username("angola_express_air_owner")
                    .email("contato@angolaexpressair.ao")
                    .phone("(+244)924000076")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/01AR700074-Edit.jpg/1280px-01AR700074-Edit.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SKY_ANGOLA_AIRLINES_OWNER(
            User.builder()
                    .name("Nelson Baptista Kambeu")
                    .username("sky_angola_airlines_owner")
                    .email("contato@skyangolaair.ao")
                    .phone("(+244)924000077")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/2022-12-16_Heiko_Heybey%2C_Initiator_der_Leinewelle_in_Hannover.jpg/1280px-2022-12-16_Heiko_Heybey%2C_Initiator_der_Leinewelle_in_Hannover.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    KUBINGA_AIR_OWNER(
            User.builder()
                    .name("Filipe Neto Kambeu")
                    .username("kubinga_air_owner")
                    .email("contato@kubingaair.ao")
                    .phone("(+244)924000078")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/0D6A8876.jpg/1280px-0D6A8876.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    ROYAL_WINGS_ANGOLA_OWNER(
            User.builder()
                    .name("Sónia Mingas Cabral")
                    .username("royal_wings_angola_owner")
                    .email("contato@royalwingsangola.ao")
                    .phone("(+244)924000079")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Alexandra_Duvivier_2.jpg/1280px-Alexandra_Duvivier_2.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_OWNER(
            User.builder()
                    .name("Domingos Kambue Cabral")
                    .username("agencia_de_viagens_kwanza_owner")
                    .email("contato@agenciakwanza.ao")
                    .phone("(+244)924000080")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/2024-02-20Aufhof%2C_Hans-Achim_K%C3%B6rber%2C_Leiter_der_Stadtdenkmalpflege_Hannover.jpg/1280px-2024-02-20Aufhof%2C_Hans-Achim_K%C3%B6rber%2C_Leiter_der_Stadtdenkmalpflege_Hannover.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    AVENTURA_VIAGENS_OWNER(
            User.builder()
                    .name("Deolinda Kiala Mingas")
                    .username("aventura_viagens_owner")
                    .email("contato@aventuraviagens.ao")
                    .phone("(+244)924000081")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/A_woman_in_Burkina_Faso.jpg/1280px-A_woman_in_Burkina_Faso.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    TRAVEL_HOUSE_LUANDA_OWNER(
            User.builder()
                    .name("Cristina Neto Cabral")
                    .username("travel_house_luanda_owner")
                    .email("contato@travelhouseluanda.ao")
                    .phone("(+244)924000082")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/f/fd/Alexis_Ren.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    GLOBETROTTER_ANGOLA_OWNER(
            User.builder()
                    .name("Manuel Kiala Mingas")
                    .username("globetrotter_angola_owner")
                    .email("contato@globetrotterangola.ao")
                    .phone("(+244)924000083")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/20170312_OKKO_Herlyn.jpg/1280px-20170312_OKKO_Herlyn.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SAFARIR_VIAGENS_OWNER(
            User.builder()
                    .name("Esperança Mingas Kiala")
                    .username("safarir_viagens_owner")
                    .email("contato@safarirviagens.ao")
                    .phone("(+244)924000084")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Aishwarya_Tipnis.jpg/1280px-Aishwarya_Tipnis.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    OPERADORA_TURISTICA_KWANZA_OWNER(
            User.builder()
                    .name("Armando Sebastião Mingas")
                    .username("operadora_turistica_kwanza_owner")
                    .email("contato@operatoraturisticakwanza.ao")
                    .phone("(+244)924000085")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/2014TeenFilmmaker-027_%2812797062354%29.jpg/1280px-2014TeenFilmmaker-027_%2812797062354%29.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    AVENTURA_GUIDES_ANGOLA_OWNER(
            User.builder()
                    .name("Ana Kiala Mingas")
                    .username("aventura_guides_angola_owner")
                    .email("contato@aventuraguides.ao")
                    .phone("(+244)924000086")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/13072020_-_Hannah_Neumann_by_Lennart_Kleinschmidt.jpg/1280px-13072020_-_Hannah_Neumann_by_Lennart_Kleinschmidt.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    TURISTAS_LUANDA_GUIDES_OWNER(
            User.builder()
                    .name("Paula Sebastião Mingas")
                    .username("turistas_luanda_guides_owner")
                    .email("contato@turistasluandaguides.ao")
                    .phone("(+244)924000087")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/171288_1853787145370_1261557584_32235470_1188496_o.jpg/1280px-171288_1853787145370_1261557584_32235470_1188496_o.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    EXPEDICOES_KALANDULA_OWNER(
            User.builder()
                    .name("Joaquim Kiala Mingas")
                    .username("expedicoes_kalandula_owner")
                    .email("contato@expedicoeskalandula.ao")
                    .phone("(+244)924000088")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/03_-_Paulo_Roberto_Pereira_2015.jpg/1280px-03_-_Paulo_Roberto_Pereira_2015.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    GUIA_TOURS_MIRAMAR_OWNER(
            User.builder()
                    .name("Helena Mingas Kiala")
                    .username("guia_tours_miramar_owner")
                    .email("contato@guiatoursmiramar.ao")
                    .phone("(+244)924000089")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/3149_Ethiopie_ethnie_Mursi.JPG/1280px-3149_Ethiopie_ethnie_Mursi.JPG")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    INTERPRETES_DE_LUANDA_OWNER(
            User.builder()
                    .name("Marta Kiala Mingas")
                    .username("interpretes_de_luanda_owner")
                    .email("contato@interpretesdeluanda.ao")
                    .phone("(+244)924000090")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/20170910_233547_MG_8540-8.jpg/1280px-20170910_233547_MG_8540-8.jpg")
                    .birthday(LocalDate.of(1972, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    GLOBAL_VOICES_ANGOLA_OWNER(
            User.builder()
                    .name("Carlos Mingas Benedo")
                    .username("global_voices_angola_owner")
                    .email("contato@globalvoices.ao")
                    .phone("(+244)924000091")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/160601.portrait-gabor-markus.jpg/1280px-160601.portrait-gabor-markus.jpg")
                    .birthday(LocalDate.of(1973, 2, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    TRADUCAO_E_INTERPRETE_SERVICES_OWNER(
            User.builder()
                    .name("Rui Cachoeira Mingas")
                    .username("traducao_e_interprete_services_owner")
                    .email("contato@traducaointerprete.ao")
                    .phone("(+244)924000092")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/2019_Simon_Margetts_Heavyweight_champion.jpg/1280px-2019_Simon_Margetts_Heavyweight_champion.jpg")
                    .birthday(LocalDate.of(1974, 3, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    INTERPRETE_PRO_ANGOLA_OWNER(
            User.builder()
                    .name("Sónia Mingas Kambeu")
                    .username("interprete_pro_angola_owner")
                    .email("contato@interpretepro.ao")
                    .phone("(+244)924000093")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/6U8A7838.jpg/1280px-6U8A7838.jpg")
                    .birthday(LocalDate.of(1975, 4, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    IDIOMAS_KWANZA_OWNER(
            User.builder()
                    .name("Nelson Baptista Cabral")
                    .username("idiomas_kwanza_owner")
                    .email("contato@idiomaskwanza.ao")
                    .phone("(+244)924000094")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/1frederico_capraro_neto.jpg/1280px-1frederico_capraro_neto.jpg")
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    NEUSA_KALUNGA(
            User.builder()
                    .name("Neusa Kalunga")
                    .username("neusakalunga")
                    .email("neusa.kalunga@negoturismo.com")
                    .phone("(+244)95000001")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/A_Portrait_%2827588622660%29.jpg/1280px-A_Portrait_%2827588622660%29.jpg")
                    .birthday(LocalDate.of(1987, 6, 8))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    LISANDRO_KAMBALE(
            User.builder()
                    .name("Lisandro Kambale")
                    .username("lisandrokambale")
                    .email("lisandro.kambale@negoturismo.com")
                    .phone("(+244)95000002")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/2019_E_CLUA.jpg/1280px-2019_E_CLUA.jpg")
                    .birthday(LocalDate.of(1990, 11, 15))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    IVONE_BENGUELA(
            User.builder()
                    .name("Ivone Benguela")
                    .username("ivonebenguela")
                    .email("ivone.benguela@negoturismo.com")
                    .phone("(+244)95000003")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/000_Galina_Ch.jpg/1280px-000_Galina_Ch.jpg")
                    .birthday(LocalDate.of(1993, 4, 22))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    ILIDIO_MINGAS(
            User.builder()
                    .name("Ilídio Mingas")
                    .username("ilidiomingas")
                    .email("ilidio.mingas@negoturismo.com")
                    .phone("(+244)95000004")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/20170907-JM_Fernandes-127.jpg/1280px-20170907-JM_Fernandes-127.jpg")
                    .birthday(LocalDate.of(1996, 9, 2))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    CELESTINE_KIALA(
            User.builder()
                    .name("Celestine Kiala")
                    .username("celestinekiala")
                    .email("celestine.kiala@negoturismo.com")
                    .phone("(+244)95000005")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/A_beautiful_photographer_%2810501871315%29.jpg/1280px-A_beautiful_photographer_%2810501871315%29.jpg")
                    .birthday(LocalDate.of(1984, 2, 9))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SEBASTIAO_NETO_CABRAL(
            User.builder()
                    .name("Sebastião Neto Cabral")
                    .username("sebastiaocabral")
                    .email("sebastiao.cabral@negoturismo.com")
                    .phone("(+244)95000006")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/01P9113971.jpg/1280px-01P9113971.jpg")
                    .birthday(LocalDate.of(1987, 7, 16))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    EDUARDA_MINGAS(
            User.builder()
                    .name("Eduarda Mingas")
                    .username("eduardamingas")
                    .email("eduarda.mingas@negoturismo.com")
                    .phone("(+244)95000007")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/2017-06-25_Angela_Marquardt_by_Olaf_Kosinsky-1.jpg/1280px-2017-06-25_Angela_Marquardt_by_Olaf_Kosinsky-1.jpg")
                    .birthday(LocalDate.of(1990, 12, 23))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    NUNO_KIALA_MINGAS(
            User.builder()
                    .name("Nuno Kiala Mingas")
                    .username("nunomingas")
                    .email("nuno.mingas@negoturismo.com")
                    .phone("(+244)95000008")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/11819_Rahmatullah_Tuhin.jpg/1280px-11819_Rahmatullah_Tuhin.jpg")
                    .birthday(LocalDate.of(1993, 5, 3))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    FILOMENA_NETO(
            User.builder()
                    .name("Filomena Neto")
                    .username("filomenaneto")
                    .email("filomena.neto@negoturismo.com")
                    .phone("(+244)95000009")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Amal_Umar%2C_Husna_Adam_Annuree_and_others_in_a_traditional_event_in_kaduna.jpg/1280px-Amal_Umar%2C_Husna_Adam_Annuree_and_others_in_a_traditional_event_in_kaduna.jpg")
                    .birthday(LocalDate.of(1996, 10, 10))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    QUINTINO_KAMBUE_NETO(
            User.builder()
                    .name("Quintino Kambue Neto")
                    .username("quintinoneto")
                    .email("quintino.neto@negoturismo.com")
                    .phone("(+244)95000010")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/2024_Ryan_Forbes_5x7.jpg/1280px-2024_Ryan_Forbes_5x7.jpg")
                    .birthday(LocalDate.of(1984, 3, 17))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    GRACA_KAMBUE(
            User.builder()
                    .name("Graça Kambue")
                    .username("gracakambue")
                    .email("graca.kambue@negoturismo.com")
                    .phone("(+244)95000011")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Adele_Fasick_%28cropped%29.jpg/1280px-Adele_Fasick_%28cropped%29.jpg")
                    .birthday(LocalDate.of(1987, 8, 24))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    ULISSES_BENGUELA(
            User.builder()
                    .name("Ulisses Benguela")
                    .username("ulissesbenguela")
                    .email("ulisses.benguela@negoturismo.com")
                    .phone("(+244)95000012")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/2007-03-08-RG-Headshot.jpg/1280px-2007-03-08-RG-Headshot.jpg")
                    .birthday(LocalDate.of(1990, 1, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    TERESA_KIALA(
            User.builder()
                    .name("Teresa Kiala")
                    .username("teresakiala")
                    .email("teresa.kiala@negoturismo.com")
                    .phone("(+244)95000013")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/A_Ukrainian_woman_at_a_Ukrainian_folk_entertainment_called_Kolyada.jpg/1280px-A_Ukrainian_woman_at_a_Ukrainian_folk_entertainment_called_Kolyada.jpg")
                    .birthday(LocalDate.of(1993, 6, 11))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    HUGO_BENGUELA(
            User.builder()
                    .name("Hugo Benguela")
                    .username("hugobenguela")
                    .email("hugo.benguela@negoturismo.com")
                    .phone("(+244)95000014")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/2024-04-12_Aufhof_Dr._Simon_Gottschalk_vom_L3S_bei_Wikipedia_Hannover.jpg/1280px-2024-04-12_Aufhof_Dr._Simon_Gottschalk_vom_L3S_bei_Wikipedia_Hannover.jpg")
                    .birthday(LocalDate.of(1996, 11, 18))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    OLGA_MINGAS(
            User.builder()
                    .name("Olga Mingas")
                    .username("olgamingas")
                    .email("olga.mingas@negoturismo.com")
                    .phone("(+244)95000015")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Aline_Coutrot.jpg/1280px-Aline_Coutrot.jpg")
                    .birthday(LocalDate.of(1984, 4, 25))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    LOURENCO_MINGAS(
            User.builder()
                    .name("Lourenço Mingas")
                    .username("lourencomingas")
                    .email("lourenco.mingas@negoturismo.com")
                    .phone("(+244)95000016")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/2018_06_20_ANDRE_feugere_music_03.jpg/1280px-2018_06_20_ANDRE_feugere_music_03.jpg")
                    .birthday(LocalDate.of(1987, 9, 5))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    REGINA_KAMBUE(
            User.builder()
                    .name("Regina Kambue")
                    .username("reginakambue")
                    .email("regina.kambue@negoturismo.com")
                    .phone("(+244)95000017")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/ADE_LIZ_PHOTO.jpg/1280px-ADE_LIZ_PHOTO.jpg")
                    .birthday(LocalDate.of(1990, 2, 12))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    ISRAEL_KAMBALE(
            User.builder()
                    .name("Israel Kambale")
                    .username("israelkambale")
                    .email("israel.kambale@negoturismo.com")
                    .phone("(+244)95000018")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/2022-11-08_Galerie_Jaeschke_Kunstpreis_Deutschland%2C_Antonio_Arias.jpg/1280px-2022-11-08_Galerie_Jaeschke_Kunstpreis_Deutschland%2C_Antonio_Arias.jpg")
                    .birthday(LocalDate.of(1993, 7, 19))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    PALMIRA_NETO(
            User.builder()
                    .name("Palmira Neto")
                    .username("palmiraneto")
                    .email("palmira.neto@negoturismo.com")
                    .phone("(+244)95000019")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Liu_Wen_Milan_Fashion_Week_Autumn_Winter_2019.jpg/1280px-Liu_Wen_Milan_Fashion_Week_Autumn_Winter_2019.jpg")
                    .birthday(LocalDate.of(1996, 12, 26))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    BELMIRO_NETO(
            User.builder()
                    .name("Belmiro Neto")
                    .username("belmironeto")
                    .email("belmiro.neto@negoturismo.com")
                    .phone("(+244)95000020")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/1812_Putih.jpg/1280px-1812_Putih.jpg")
                    .birthday(LocalDate.of(1984, 5, 6))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    ESTER_KIALA(
            User.builder()
                    .name("Ester Kiala")
                    .username("esterkiala")
                    .email("ester.kiala@negoturismo.com")
                    .phone("(+244)95000021")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/A_beautiful_Woman_%28106326063%29.jpg/1280px-A_beautiful_Woman_%28106326063%29.jpg")
                    .birthday(LocalDate.of(1987, 10, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    OSVALDO_KIALA(
            User.builder()
                    .name("Osvaldo Kiala")
                    .username("osvaldokiala")
                    .email("osvaldo.kiala@negoturismo.com")
                    .phone("(+244)95000022")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/15_0310_Hep_on_the_Hill-117_%2816615766787%29.jpg/1280px-15_0310_Hep_on_the_Hill-117_%2816615766787%29.jpg")
                    .birthday(LocalDate.of(1990, 3, 20))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    MIRELA_KIALA(
            User.builder()
                    .name("Mirela Kiala")
                    .username("mirelakiala")
                    .email("mirela.kiala@negoturismo.com")
                    .phone("(+244)95000023")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Aleksandra_Blinnikka_in_Tour_de_Laru.jpg/1280px-Aleksandra_Blinnikka_in_Tour_de_Laru.jpg")
                    .birthday(LocalDate.of(1993, 8, 27))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    SARA_BENGUELA(
            User.builder()
                    .name("Sara Benguela")
                    .username("sarabenguela")
                    .email("sara.benguela@negoturismo.com")
                    .phone("(+244)95000024")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Alexandre_Duvivier.jpg/1280px-Alexandre_Duvivier.jpg")
                    .birthday(LocalDate.of(1996, 1, 7))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),

    BRUNO_MINGAS(
            User.builder()
                    .name("Bruno Mingas")
                    .username("brunomingas")
                    .email("bruno.mingas@negoturismo.com")
                    .phone("(+244)95000025")
                    .password("123456")
                    .logo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/%28c%29_www.stefanjoham.com-2052.jpg/1280px-%28c%29_www.stefanjoham.com-2052.jpg")
                    .birthday(LocalDate.of(1984, 6, 14))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    );

    private final User user;
}
