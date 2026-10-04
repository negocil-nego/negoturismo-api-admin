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
                    .birthday(LocalDate.of(1976, 5, 13))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    );

    private final User user;
}
