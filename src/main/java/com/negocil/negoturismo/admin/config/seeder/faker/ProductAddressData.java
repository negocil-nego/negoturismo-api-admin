package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.address.enums.AddressData;
import com.negocil.negoturismo.admin.feature.product.model.ProductAddress;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductAddressData {
    PROD_ADDR_1(
            ProductAddress.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SINGLE.getProduct())
                    .address(AddressData.ADDRESS_1.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    PROD_ADDR_2(
            ProductAddress.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SUITE.getProduct())
                    .address(AddressData.ADDRESS_1.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    PROD_ADDR_3(
            ProductAddress.builder()
                    .product(ProductData.MIRAMAR_ROOM_DOUBLE.getProduct())
                    .address(AddressData.ADDRESS_2.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    PROD_ADDR_4(
            ProductAddress.builder()
                    .product(ProductData.HUAMBO_ROOM_TWIN.getProduct())
                    .address(AddressData.ADDRESS_3.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_BAIA_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_9.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_BAIA_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_9.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_BAIA_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SUITE_FAMILIAR_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_9.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_BAIA_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_9.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_BAIA_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_9.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_MILANO_RESORT_SPA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .address(AddressData.ADDRESS_10.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_MILANO_RESORT_SPA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .address(AddressData.ADDRESS_10.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_MILANO_RESORT_SPA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SUITE_FAMILIAR_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .address(AddressData.ADDRESS_10.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_MILANO_RESORT_SPA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .address(AddressData.ADDRESS_10.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_MILANO_RESORT_SPA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .address(AddressData.ADDRESS_10.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_KALANDULA_PALACE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_HOTEL_KALANDULA_PALACE.getProduct())
                    .address(AddressData.ADDRESS_11.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_KALANDULA_PALACE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_HOTEL_KALANDULA_PALACE.getProduct())
                    .address(AddressData.ADDRESS_11.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_KALANDULA_PALACE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SUITE_FAMILIAR_HOTEL_KALANDULA_PALACE.getProduct())
                    .address(AddressData.ADDRESS_11.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_KALANDULA_PALACE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_HOTEL_KALANDULA_PALACE.getProduct())
                    .address(AddressData.ADDRESS_11.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_KALANDULA_PALACE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_HOTEL_KALANDULA_PALACE.getProduct())
                    .address(AddressData.ADDRESS_11.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_MIRAMAR_BUSINESS_HOTEL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .address(AddressData.ADDRESS_12.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_MIRAMAR_BUSINESS_HOTEL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .address(AddressData.ADDRESS_12.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SUITE_FAMILIAR_MIRAMAR_BUSINESS_HOTEL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SUITE_FAMILIAR_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .address(AddressData.ADDRESS_12.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .address(AddressData.ADDRESS_12.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .address(AddressData.ADDRESS_12.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_CASCADE_CITY_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_HOTEL_CASCADE_CITY.getProduct())
                    .address(AddressData.ADDRESS_13.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_CASCADE_CITY_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_HOTEL_CASCADE_CITY.getProduct())
                    .address(AddressData.ADDRESS_13.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_CASCADE_CITY_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SUITE_FAMILIAR_HOTEL_CASCADE_CITY.getProduct())
                    .address(AddressData.ADDRESS_13.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_CASCADE_CITY_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_HOTEL_CASCADE_CITY.getProduct())
                    .address(AddressData.ADDRESS_13.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_CASCADE_CITY_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_HOTEL_CASCADE_CITY.getProduct())
                    .address(AddressData.ADDRESS_13.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_VILA_HARMONY_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_STANDARD_POUSADA_VILA_HARMONY.getProduct())
                    .address(AddressData.ADDRESS_14.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_VILA_HARMONY_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_FAMILIAR_POUSADA_VILA_HARMONY.getProduct())
                    .address(AddressData.ADDRESS_14.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_VILA_HARMONY_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_POUSADA_VILA_HARMONY.getProduct())
                    .address(AddressData.ADDRESS_14.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_VILA_HARMONY_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_ECONOMICO_POUSADA_VILA_HARMONY.getProduct())
                    .address(AddressData.ADDRESS_14.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_TWIN_POUSADA_VILA_HARMONY_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_TWIN_POUSADA_VILA_HARMONY.getProduct())
                    .address(AddressData.ADDRESS_14.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_BAIA_AZUL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_STANDARD_POUSADA_BAIA_AZUL.getProduct())
                    .address(AddressData.ADDRESS_15.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_BAIA_AZUL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_FAMILIAR_POUSADA_BAIA_AZUL.getProduct())
                    .address(AddressData.ADDRESS_15.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_BAIA_AZUL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_POUSADA_BAIA_AZUL.getProduct())
                    .address(AddressData.ADDRESS_15.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_BAIA_AZUL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_ECONOMICO_POUSADA_BAIA_AZUL.getProduct())
                    .address(AddressData.ADDRESS_15.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_TWIN_POUSADA_BAIA_AZUL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_TWIN_POUSADA_BAIA_AZUL.getProduct())
                    .address(AddressData.ADDRESS_15.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_RECANTO_VERDE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_STANDARD_POUSADA_RECANTO_VERDE.getProduct())
                    .address(AddressData.ADDRESS_16.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_RECANTO_VERDE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_FAMILIAR_POUSADA_RECANTO_VERDE.getProduct())
                    .address(AddressData.ADDRESS_16.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_RECANTO_VERDE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_POUSADA_RECANTO_VERDE.getProduct())
                    .address(AddressData.ADDRESS_16.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_RECANTO_VERDE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_ECONOMICO_POUSADA_RECANTO_VERDE.getProduct())
                    .address(AddressData.ADDRESS_16.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_TWIN_POUSADA_RECANTO_VERDE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_TWIN_POUSADA_RECANTO_VERDE.getProduct())
                    .address(AddressData.ADDRESS_16.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_SAO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_STANDARD_POUSADA_SAO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_17.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_SAO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_FAMILIAR_POUSADA_SAO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_17.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_SAO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_POUSADA_SAO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_17.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_SAO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_ECONOMICO_POUSADA_SAO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_17.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_TWIN_POUSADA_SAO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_TWIN_POUSADA_SAO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_17.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_STANDARD_GUEST_HOUSE_MIRAMAR_INN_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_STANDARD_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .address(AddressData.ADDRESS_18.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_FAMILIAR_GUEST_HOUSE_MIRAMAR_INN_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_FAMILIAR_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .address(AddressData.ADDRESS_18.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_COM_VARANDA_GUEST_HOUSE_MIRAMAR_INN_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .address(AddressData.ADDRESS_18.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_ECONOMICO_GUEST_HOUSE_MIRAMAR_INN_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_ECONOMICO_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .address(AddressData.ADDRESS_18.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_TWIN_GUEST_HOUSE_MIRAMAR_INN_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_TWIN_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .address(AddressData.ADDRESS_18.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_PROGRESSO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_PROGRESSO.getProduct())
                    .address(AddressData.ADDRESS_19.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_PROGRESSO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_PROGRESSO.getProduct())
                    .address(AddressData.ADDRESS_19.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_PROGRESSO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_PROGRESSO.getProduct())
                    .address(AddressData.ADDRESS_19.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_PROGRESSO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_PROGRESSO.getProduct())
                    .address(AddressData.ADDRESS_19.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_PROGRESSO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_PROGRESSO.getProduct())
                    .address(AddressData.ADDRESS_19.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_20.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_20.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_20.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_20.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_20.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_KATANGA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_KATANGA.getProduct())
                    .address(AddressData.ADDRESS_21.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_KATANGA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_KATANGA.getProduct())
                    .address(AddressData.ADDRESS_21.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_KATANGA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_KATANGA.getProduct())
                    .address(AddressData.ADDRESS_21.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KATANGA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KATANGA.getProduct())
                    .address(AddressData.ADDRESS_21.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_KATANGA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_KATANGA.getProduct())
                    .address(AddressData.ADDRESS_21.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_NOVA_VIDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .address(AddressData.ADDRESS_22.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_NOVA_VIDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .address(AddressData.ADDRESS_22.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_NOVA_VIDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .address(AddressData.ADDRESS_22.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_NOVA_VIDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .address(AddressData.ADDRESS_22.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_NOVA_VIDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .address(AddressData.ADDRESS_22.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_SAO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_23.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_SAO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_23.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_SAO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_23.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_SAO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_23.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_SAO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_23.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_O_MUSQUETE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_O_MUSQUETE.getProduct())
                    .address(AddressData.ADDRESS_24.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_O_MUSQUETE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_O_MUSQUETE.getProduct())
                    .address(AddressData.ADDRESS_24.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_O_MUSQUETE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_O_MUSQUETE.getProduct())
                    .address(AddressData.ADDRESS_24.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_O_MUSQUETE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_O_MUSQUETE.getProduct())
                    .address(AddressData.ADDRESS_24.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_O_MUSQUETE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_O_MUSQUETE.getProduct())
                    .address(AddressData.ADDRESS_24.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_MAR_E_TERRA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .address(AddressData.ADDRESS_25.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_MAR_E_TERRA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .address(AddressData.ADDRESS_25.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_MAR_E_TERRA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .address(AddressData.ADDRESS_25.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_MAR_E_TERRA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .address(AddressData.ADDRESS_25.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_MAR_E_TERRA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .address(AddressData.ADDRESS_25.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_KWANZA_LIVING_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .address(AddressData.ADDRESS_26.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_KWANZA_LIVING_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .address(AddressData.ADDRESS_26.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_KWANZA_LIVING_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .address(AddressData.ADDRESS_26.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_KWANZA_LIVING_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .address(AddressData.ADDRESS_26.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_KWANZA_LIVING_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .address(AddressData.ADDRESS_26.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .address(AddressData.ADDRESS_27.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .address(AddressData.ADDRESS_27.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .address(AddressData.ADDRESS_27.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .address(AddressData.ADDRESS_27.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_SABOR_ANGOLANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .address(AddressData.ADDRESS_27.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_TALATONA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_TALATONA.getProduct())
                    .address(AddressData.ADDRESS_28.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_TALATONA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_TALATONA.getProduct())
                    .address(AddressData.ADDRESS_28.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_TALATONA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_TALATONA.getProduct())
                    .address(AddressData.ADDRESS_28.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_TALATONA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_TALATONA.getProduct())
                    .address(AddressData.ADDRESS_28.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_TALATONA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_TALATONA.getProduct())
                    .address(AddressData.ADDRESS_28.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MUAMBA_DE_GALINHA_CANTINHO_DA_MAE_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_29.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALULU_DE_PEIXE_CANTINHO_DA_MAE_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALULU_DE_PEIXE_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_29.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_CANTINHO_DA_MAE_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_29.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_CANTINHO_DA_MAE_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_29.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_CANTINHO_DA_MAE_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_29.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MUAMBA_DE_GALINHA_SABORES_DA_NOSSA_TERRA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_SABORES_DA_NOSSA_TERRA.getProduct())
                    .address(AddressData.ADDRESS_30.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALULU_DE_PEIXE_SABORES_DA_NOSSA_TERRA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALULU_DE_PEIXE_SABORES_DA_NOSSA_TERRA.getProduct())
                    .address(AddressData.ADDRESS_30.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_SABORES_DA_NOSSA_TERRA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_SABORES_DA_NOSSA_TERRA.getProduct())
                    .address(AddressData.ADDRESS_30.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_SABORES_DA_NOSSA_TERRA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_SABORES_DA_NOSSA_TERRA.getProduct())
                    .address(AddressData.ADDRESS_30.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_SABORES_DA_NOSSA_TERRA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_SABORES_DA_NOSSA_TERRA.getProduct())
                    .address(AddressData.ADDRESS_30.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MUAMBA_DE_GALINHA_TASCA_DO_MUAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_TASCA_DO_MUAMBA.getProduct())
                    .address(AddressData.ADDRESS_31.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALULU_DE_PEIXE_TASCA_DO_MUAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALULU_DE_PEIXE_TASCA_DO_MUAMBA.getProduct())
                    .address(AddressData.ADDRESS_31.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_TASCA_DO_MUAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_TASCA_DO_MUAMBA.getProduct())
                    .address(AddressData.ADDRESS_31.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_TASCA_DO_MUAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_TASCA_DO_MUAMBA.getProduct())
                    .address(AddressData.ADDRESS_31.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_TASCA_DO_MUAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_TASCA_DO_MUAMBA.getProduct())
                    .address(AddressData.ADDRESS_31.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MUAMBA_DE_GALINHA_COZINHA_DO_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_COZINHA_DO_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_32.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALULU_DE_PEIXE_COZINHA_DO_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALULU_DE_PEIXE_COZINHA_DO_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_32.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_COZINHA_DO_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_COZINHA_DO_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_32.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_COZINHA_DO_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_COZINHA_DO_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_32.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_COZINHA_DO_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_COZINHA_DO_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_32.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MUAMBA_DE_GALINHA_SOLAR_DO_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_SOLAR_DO_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_33.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALULU_DE_PEIXE_SOLAR_DO_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALULU_DE_PEIXE_SOLAR_DO_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_33.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_SOLAR_DO_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_SOLAR_DO_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_33.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_SOLAR_DO_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_SOLAR_DO_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_33.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_SOLAR_DO_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_SOLAR_DO_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_33.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_NAPOLI_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_34.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_NAPOLI_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_34.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_NAPOLI_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_34.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_NAPOLI_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_34.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_NAPOLI_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_34.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_FORNO_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_35.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_FORNO_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_35.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_FORNO_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_35.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_FORNO_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_35.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_FORNO_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_35.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_MSLICE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_MSLICE.getProduct())
                    .address(AddressData.ADDRESS_36.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_MSLICE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_MSLICE.getProduct())
                    .address(AddressData.ADDRESS_36.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_MSLICE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_MSLICE.getProduct())
                    .address(AddressData.ADDRESS_36.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_MSLICE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_MSLICE.getProduct())
                    .address(AddressData.ADDRESS_36.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_MSLICE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_MSLICE.getProduct())
                    .address(AddressData.ADDRESS_36.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_MANGUERINHA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_MANGUERINHA.getProduct())
                    .address(AddressData.ADDRESS_37.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_MANGUERINHA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_MANGUERINHA.getProduct())
                    .address(AddressData.ADDRESS_37.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_MANGUERINHA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_MANGUERINHA.getProduct())
                    .address(AddressData.ADDRESS_37.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_MANGUERINHA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_MANGUERINHA.getProduct())
                    .address(AddressData.ADDRESS_37.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_MANGUERINHA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_MANGUERINHA.getProduct())
                    .address(AddressData.ADDRESS_37.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_BELLA_VISTA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_BELLA_VISTA.getProduct())
                    .address(AddressData.ADDRESS_38.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_BELLA_VISTA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_BELLA_VISTA.getProduct())
                    .address(AddressData.ADDRESS_38.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_BELLA_VISTA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_BELLA_VISTA.getProduct())
                    .address(AddressData.ADDRESS_38.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_BELLA_VISTA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_BELLA_VISTA.getProduct())
                    .address(AddressData.ADDRESS_38.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_BELLA_VISTA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_BELLA_VISTA.getProduct())
                    .address(AddressData.ADDRESS_38.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HAMBURGUER_CLASSICO_SNACK_BAR_O_PONTO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_SNACK_BAR_O_PONTO.getProduct())
                    .address(AddressData.ADDRESS_39.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_SNACK_BAR_O_PONTO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_SNACK_BAR_O_PONTO.getProduct())
                    .address(AddressData.ADDRESS_39.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BATATAS_FRITAS_SNACK_BAR_O_PONTO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BATATAS_FRITAS_SNACK_BAR_O_PONTO.getProduct())
                    .address(AddressData.ADDRESS_39.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    WRAP_DE_FRANGO_SNACK_BAR_O_PONTO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.WRAP_DE_FRANGO_SNACK_BAR_O_PONTO.getProduct())
                    .address(AddressData.ADDRESS_39.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_SNACK_BAR_O_PONTO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_SNACK_BAR_O_PONTO.getProduct())
                    .address(AddressData.ADDRESS_39.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HAMBURGUER_CLASSICO_BURGER_STATION_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_BURGER_STATION_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_40.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_BURGER_STATION_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_BURGER_STATION_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_40.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BATATAS_FRITAS_BURGER_STATION_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BATATAS_FRITAS_BURGER_STATION_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_40.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    WRAP_DE_FRANGO_BURGER_STATION_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.WRAP_DE_FRANGO_BURGER_STATION_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_40.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_BURGER_STATION_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_BURGER_STATION_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_40.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HAMBURGUER_CLASSICO_FAST_FOOD_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_FAST_FOOD_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_41.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_FAST_FOOD_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_FAST_FOOD_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_41.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BATATAS_FRITAS_FAST_FOOD_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BATATAS_FRITAS_FAST_FOOD_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_41.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    WRAP_DE_FRANGO_FAST_FOOD_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.WRAP_DE_FRANGO_FAST_FOOD_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_41.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_FAST_FOOD_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_FAST_FOOD_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_41.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HAMBURGUER_CLASSICO_LANCHES_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_LANCHES_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_42.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_LANCHES_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_LANCHES_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_42.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BATATAS_FRITAS_LANCHES_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BATATAS_FRITAS_LANCHES_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_42.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    WRAP_DE_FRANGO_LANCHES_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.WRAP_DE_FRANGO_LANCHES_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_42.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_LANCHES_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_LANCHES_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_42.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HAMBURGUER_CLASSICO_FOOD_TRUCK_TAXI_AZUL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .address(AddressData.ADDRESS_43.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_FOOD_TRUCK_TAXI_AZUL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .address(AddressData.ADDRESS_43.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BATATAS_FRITAS_FOOD_TRUCK_TAXI_AZUL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BATATAS_FRITAS_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .address(AddressData.ADDRESS_43.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    WRAP_DE_FRANGO_FOOD_TRUCK_TAXI_AZUL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.WRAP_DE_FRANGO_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .address(AddressData.ADDRESS_43.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_FOOD_TRUCK_TAXI_AZUL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .address(AddressData.ADDRESS_43.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BIFE_GRELHADO_CHURRASQUEIRA_DO_ZE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BIFE_GRELHADO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .address(AddressData.ADDRESS_44.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FRANGO_GRELHADO_CHURRASQUEIRA_DO_ZE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FRANGO_GRELHADO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .address(AddressData.ADDRESS_44.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    COSTELETA_DE_PORCO_CHURRASQUEIRA_DO_ZE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .address(AddressData.ADDRESS_44.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETO_MISTO_CHURRASQUEIRA_DO_ZE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETO_MISTO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .address(AddressData.ADDRESS_44.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETO_DE_CAMARAO_CHURRASQUEIRA_DO_ZE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .address(AddressData.ADDRESS_44.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BIFE_GRELHADO_GRELHADOS_MIUDOS_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BIFE_GRELHADO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_45.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FRANGO_GRELHADO_GRELHADOS_MIUDOS_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FRANGO_GRELHADO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_45.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    COSTELETA_DE_PORCO_GRELHADOS_MIUDOS_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_45.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETO_MISTO_GRELHADOS_MIUDOS_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETO_MISTO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_45.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETO_DE_CAMARAO_GRELHADOS_MIUDOS_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_45.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BIFE_GRELHADO_ESPETOS_DA_BAIA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BIFE_GRELHADO_ESPETOS_DA_BAIA.getProduct())
                    .address(AddressData.ADDRESS_46.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FRANGO_GRELHADO_ESPETOS_DA_BAIA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FRANGO_GRELHADO_ESPETOS_DA_BAIA.getProduct())
                    .address(AddressData.ADDRESS_46.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    COSTELETA_DE_PORCO_ESPETOS_DA_BAIA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_ESPETOS_DA_BAIA.getProduct())
                    .address(AddressData.ADDRESS_46.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETO_MISTO_ESPETOS_DA_BAIA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETO_MISTO_ESPETOS_DA_BAIA.getProduct())
                    .address(AddressData.ADDRESS_46.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETO_DE_CAMARAO_ESPETOS_DA_BAIA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_ESPETOS_DA_BAIA.getProduct())
                    .address(AddressData.ADDRESS_46.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BIFE_GRELHADO_CHURRASCO_KING_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BIFE_GRELHADO_CHURRASCO_KING.getProduct())
                    .address(AddressData.ADDRESS_47.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FRANGO_GRELHADO_CHURRASCO_KING_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FRANGO_GRELHADO_CHURRASCO_KING.getProduct())
                    .address(AddressData.ADDRESS_47.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    COSTELETA_DE_PORCO_CHURRASCO_KING_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_CHURRASCO_KING.getProduct())
                    .address(AddressData.ADDRESS_47.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETO_MISTO_CHURRASCO_KING_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETO_MISTO_CHURRASCO_KING.getProduct())
                    .address(AddressData.ADDRESS_47.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETO_DE_CAMARAO_CHURRASCO_KING_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_CHURRASCO_KING.getProduct())
                    .address(AddressData.ADDRESS_47.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BIFE_GRELHADO_GRELHADO_DA_CASA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BIFE_GRELHADO_GRELHADO_DA_CASA.getProduct())
                    .address(AddressData.ADDRESS_48.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FRANGO_GRELHADO_GRELHADO_DA_CASA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FRANGO_GRELHADO_GRELHADO_DA_CASA.getProduct())
                    .address(AddressData.ADDRESS_48.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    COSTELETA_DE_PORCO_GRELHADO_DA_CASA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_GRELHADO_DA_CASA.getProduct())
                    .address(AddressData.ADDRESS_48.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETO_MISTO_GRELHADO_DA_CASA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETO_MISTO_GRELHADO_DA_CASA.getProduct())
                    .address(AddressData.ADDRESS_48.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPETO_DE_CAMARAO_GRELHADO_DA_CASA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_GRELHADO_DA_CASA.getProduct())
                    .address(AddressData.ADDRESS_48.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_BAIA_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_49.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_BAIA_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_49.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_49.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_49.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_BAIA_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_49.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DO_PORTO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_DO_PORTO.getProduct())
                    .address(AddressData.ADDRESS_50.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DO_PORTO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_DO_PORTO.getProduct())
                    .address(AddressData.ADDRESS_50.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_PORTO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_PORTO.getProduct())
                    .address(AddressData.ADDRESS_50.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DO_PORTO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_DO_PORTO.getProduct())
                    .address(AddressData.ADDRESS_50.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DO_PORTO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_DO_PORTO.getProduct())
                    .address(AddressData.ADDRESS_50.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_51.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_51.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_51.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_51.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_51.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DE_BENGUELA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .address(AddressData.ADDRESS_52.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DE_BENGUELA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .address(AddressData.ADDRESS_52.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DE_BENGUELA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .address(AddressData.ADDRESS_52.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DE_BENGUELA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .address(AddressData.ADDRESS_52.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DE_BENGUELA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .address(AddressData.ADDRESS_52.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DO_NAMIBE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .address(AddressData.ADDRESS_53.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DO_NAMIBE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .address(AddressData.ADDRESS_53.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_NAMIBE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .address(AddressData.ADDRESS_53.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DO_NAMIBE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .address(AddressData.ADDRESS_53.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DO_NAMIBE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .address(AddressData.ADDRESS_53.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_54.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_54.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_54.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_54.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_54.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_BOM_DIA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_BOM_DIA.getProduct())
                    .address(AddressData.ADDRESS_55.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_BOM_DIA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_BOM_DIA.getProduct())
                    .address(AddressData.ADDRESS_55.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_BOM_DIA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_BOM_DIA.getProduct())
                    .address(AddressData.ADDRESS_55.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_BOM_DIA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_BOM_DIA.getProduct())
                    .address(AddressData.ADDRESS_55.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_BOM_DIA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_BOM_DIA.getProduct())
                    .address(AddressData.ADDRESS_55.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_TOKYO_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_TOKYO_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_56.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_TOKYO_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_TOKYO_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_56.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_TOKYO_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_TOKYO_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_56.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_TOKYO_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_TOKYO_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_56.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_TOKYO_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_TOKYO_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_56.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_SAKURA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_SAKURA.getProduct())
                    .address(AddressData.ADDRESS_57.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_SAKURA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_SAKURA.getProduct())
                    .address(AddressData.ADDRESS_57.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_SAKURA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_SAKURA.getProduct())
                    .address(AddressData.ADDRESS_57.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_SAKURA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_SAKURA.getProduct())
                    .address(AddressData.ADDRESS_57.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_SAKURA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_SAKURA.getProduct())
                    .address(AddressData.ADDRESS_57.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_MANGA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_MANGA.getProduct())
                    .address(AddressData.ADDRESS_58.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_MANGA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_MANGA.getProduct())
                    .address(AddressData.ADDRESS_58.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_MANGA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_MANGA.getProduct())
                    .address(AddressData.ADDRESS_58.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_MANGA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_MANGA.getProduct())
                    .address(AddressData.ADDRESS_58.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_MANGA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_MANGA.getProduct())
                    .address(AddressData.ADDRESS_58.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPRESSO_CAFE_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPRESSO_CAFE_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_59.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAPPUCCINO_CAFE_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAPPUCCINO_CAFE_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_59.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LATTE_CAFE_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.LATTE_CAFE_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_59.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_59.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SANDES_DE_ATUM_CAFE_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_59.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPRESSO_CAFE_BOSSA_NOVA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPRESSO_CAFE_BOSSA_NOVA.getProduct())
                    .address(AddressData.ADDRESS_60.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAPPUCCINO_CAFE_BOSSA_NOVA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAPPUCCINO_CAFE_BOSSA_NOVA.getProduct())
                    .address(AddressData.ADDRESS_60.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LATTE_CAFE_BOSSA_NOVA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.LATTE_CAFE_BOSSA_NOVA.getProduct())
                    .address(AddressData.ADDRESS_60.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_BOSSA_NOVA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_BOSSA_NOVA.getProduct())
                    .address(AddressData.ADDRESS_60.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_BOSSA_NOVA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SANDES_DE_ATUM_CAFE_BOSSA_NOVA.getProduct())
                    .address(AddressData.ADDRESS_60.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPRESSO_CAFE_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPRESSO_CAFE_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_61.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAPPUCCINO_CAFE_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAPPUCCINO_CAFE_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_61.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LATTE_CAFE_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.LATTE_CAFE_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_61.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_61.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SANDES_DE_ATUM_CAFE_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_61.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPRESSO_CAFE_PAO_QUENTE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPRESSO_CAFE_PAO_QUENTE.getProduct())
                    .address(AddressData.ADDRESS_62.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAPPUCCINO_CAFE_PAO_QUENTE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAPPUCCINO_CAFE_PAO_QUENTE.getProduct())
                    .address(AddressData.ADDRESS_62.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LATTE_CAFE_PAO_QUENTE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.LATTE_CAFE_PAO_QUENTE.getProduct())
                    .address(AddressData.ADDRESS_62.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_PAO_QUENTE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_PAO_QUENTE.getProduct())
                    .address(AddressData.ADDRESS_62.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_PAO_QUENTE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SANDES_DE_ATUM_CAFE_PAO_QUENTE.getProduct())
                    .address(AddressData.ADDRESS_62.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESPRESSO_COFFEE_STOP_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESPRESSO_COFFEE_STOP_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_63.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAPPUCCINO_COFFEE_STOP_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAPPUCCINO_COFFEE_STOP_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_63.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LATTE_COFFEE_STOP_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.LATTE_COFFEE_STOP_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_63.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_COFFEE_STOP_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_COFFEE_STOP_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_63.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SANDES_DE_ATUM_COFFEE_STOP_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SANDES_DE_ATUM_COFFEE_STOP_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_63.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAIPIRINHA_BAR_222_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAIPIRINHA_BAR_222.getProduct())
                    .address(AddressData.ADDRESS_64.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GIN_TONICA_BAR_222_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.GIN_TONICA_BAR_222.getProduct())
                    .address(AddressData.ADDRESS_64.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_222_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_BAR_222.getProduct())
                    .address(AddressData.ADDRESS_64.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_222_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PETISCOS_DO_DIA_BAR_222.getProduct())
                    .address(AddressData.ADDRESS_64.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_222_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_BAR_222.getProduct())
                    .address(AddressData.ADDRESS_64.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAIPIRINHA_BAR_TROPICAL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAIPIRINHA_BAR_TROPICAL.getProduct())
                    .address(AddressData.ADDRESS_65.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GIN_TONICA_BAR_TROPICAL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.GIN_TONICA_BAR_TROPICAL.getProduct())
                    .address(AddressData.ADDRESS_65.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_TROPICAL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_BAR_TROPICAL.getProduct())
                    .address(AddressData.ADDRESS_65.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_TROPICAL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PETISCOS_DO_DIA_BAR_TROPICAL.getProduct())
                    .address(AddressData.ADDRESS_65.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_TROPICAL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_BAR_TROPICAL.getProduct())
                    .address(AddressData.ADDRESS_65.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAIPIRINHA_BAR_DO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAIPIRINHA_BAR_DO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_66.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GIN_TONICA_BAR_DO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.GIN_TONICA_BAR_DO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_66.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_DO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_BAR_DO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_66.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_DO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PETISCOS_DO_DIA_BAR_DO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_66.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_DO_KIZUA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_BAR_DO_KIZUA.getProduct())
                    .address(AddressData.ADDRESS_66.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAIPIRINHA_PUB_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAIPIRINHA_PUB_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_67.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GIN_TONICA_PUB_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.GIN_TONICA_PUB_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_67.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CERVEJA_ARTESANAL_PUB_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_PUB_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_67.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PETISCOS_DO_DIA_PUB_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PETISCOS_DO_DIA_PUB_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_67.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TAPA_DE_CAMARAO_PUB_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_PUB_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_67.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CAIPIRINHA_BAR_ESQUINA_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CAIPIRINHA_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_68.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GIN_TONICA_BAR_ESQUINA_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.GIN_TONICA_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_68.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_ESQUINA_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_68.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_ESQUINA_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PETISCOS_DO_DIA_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_68.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_ESQUINA_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_68.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_69.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_69.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_69.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_69.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_69.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_ZE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_ZE.getProduct())
                    .address(AddressData.ADDRESS_70.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_ZE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_ZE.getProduct())
                    .address(AddressData.ADDRESS_70.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_DO_ZE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_DO_ZE.getProduct())
                    .address(AddressData.ADDRESS_70.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_DO_ZE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_DO_ZE.getProduct())
                    .address(AddressData.ADDRESS_70.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_ZE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_ZE.getProduct())
                    .address(AddressData.ADDRESS_70.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_71.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_71.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_71.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_71.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_71.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_CENTRAL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_CENTRAL.getProduct())
                    .address(AddressData.ADDRESS_72.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_CENTRAL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_CENTRAL.getProduct())
                    .address(AddressData.ADDRESS_72.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_CENTRAL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_CENTRAL.getProduct())
                    .address(AddressData.ADDRESS_72.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_CENTRAL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_CENTRAL.getProduct())
                    .address(AddressData.ADDRESS_72.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_CENTRAL_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_CENTRAL.getProduct())
                    .address(AddressData.ADDRESS_72.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_73.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_73.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_73.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_73.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_73.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SALADA_DE_QUINOA_RESTAURANTE_VEGETARIANO_RAIZES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SALADA_DE_QUINOA_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .address(AddressData.ADDRESS_74.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TOFU_GRELHADO_RESTAURANTE_VEGETARIANO_RAIZES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TOFU_GRELHADO_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .address(AddressData.ADDRESS_74.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LEGUMES_ASSADOS_RESTAURANTE_VEGETARIANO_RAIZES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.LEGUMES_ASSADOS_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .address(AddressData.ADDRESS_74.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOWL_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .address(AddressData.ADDRESS_74.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CURRY_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .address(AddressData.ADDRESS_74.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SALADA_DE_QUINOA_VEGGIE_HOUSE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SALADA_DE_QUINOA_VEGGIE_HOUSE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_75.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TOFU_GRELHADO_VEGGIE_HOUSE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TOFU_GRELHADO_VEGGIE_HOUSE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_75.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LEGUMES_ASSADOS_VEGGIE_HOUSE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.LEGUMES_ASSADOS_VEGGIE_HOUSE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_75.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOWL_DE_LEGUMES_VEGGIE_HOUSE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_VEGGIE_HOUSE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_75.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CURRY_DE_LEGUMES_VEGGIE_HOUSE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_VEGGIE_HOUSE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_75.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SALADA_DE_QUINOA_COZINHA_VERDE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SALADA_DE_QUINOA_COZINHA_VERDE.getProduct())
                    .address(AddressData.ADDRESS_76.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TOFU_GRELHADO_COZINHA_VERDE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TOFU_GRELHADO_COZINHA_VERDE.getProduct())
                    .address(AddressData.ADDRESS_76.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LEGUMES_ASSADOS_COZINHA_VERDE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.LEGUMES_ASSADOS_COZINHA_VERDE.getProduct())
                    .address(AddressData.ADDRESS_76.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOWL_DE_LEGUMES_COZINHA_VERDE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_COZINHA_VERDE.getProduct())
                    .address(AddressData.ADDRESS_76.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CURRY_DE_LEGUMES_COZINHA_VERDE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_COZINHA_VERDE.getProduct())
                    .address(AddressData.ADDRESS_76.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SALADA_DE_QUINOA_BI_VEGETARIANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SALADA_DE_QUINOA_BI_VEGETARIANO.getProduct())
                    .address(AddressData.ADDRESS_77.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TOFU_GRELHADO_BI_VEGETARIANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TOFU_GRELHADO_BI_VEGETARIANO.getProduct())
                    .address(AddressData.ADDRESS_77.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LEGUMES_ASSADOS_BI_VEGETARIANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.LEGUMES_ASSADOS_BI_VEGETARIANO.getProduct())
                    .address(AddressData.ADDRESS_77.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOWL_DE_LEGUMES_BI_VEGETARIANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_BI_VEGETARIANO.getProduct())
                    .address(AddressData.ADDRESS_77.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CURRY_DE_LEGUMES_BI_VEGETARIANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_BI_VEGETARIANO.getProduct())
                    .address(AddressData.ADDRESS_77.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SALADA_DE_QUINOA_SABOR_VEGETARIANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SALADA_DE_QUINOA_SABOR_VEGETARIANO.getProduct())
                    .address(AddressData.ADDRESS_78.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TOFU_GRELHADO_SABOR_VEGETARIANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TOFU_GRELHADO_SABOR_VEGETARIANO.getProduct())
                    .address(AddressData.ADDRESS_78.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    LEGUMES_ASSADOS_SABOR_VEGETARIANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.LEGUMES_ASSADOS_SABOR_VEGETARIANO.getProduct())
                    .address(AddressData.ADDRESS_78.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOWL_DE_LEGUMES_SABOR_VEGETARIANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_SABOR_VEGETARIANO.getProduct())
                    .address(AddressData.ADDRESS_78.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CURRY_DE_LEGUMES_SABOR_VEGETARIANO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_SABOR_VEGETARIANO.getProduct())
                    .address(AddressData.ADDRESS_78.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_PAO_QUENTE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PAO_DE_FORMA_PADARIA_PAO_QUENTE.getProduct())
                    .address(AddressData.ADDRESS_79.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_PAO_QUENTE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PADARIA_PAO_QUENTE.getProduct())
                    .address(AddressData.ADDRESS_79.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_PAO_QUENTE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PASTEL_DE_NATA_PADARIA_PAO_QUENTE.getProduct())
                    .address(AddressData.ADDRESS_79.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_PAO_QUENTE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PADARIA_PAO_QUENTE.getProduct())
                    .address(AddressData.ADDRESS_79.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_PAO_QUENTE_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PADARIA_PAO_QUENTE.getProduct())
                    .address(AddressData.ADDRESS_79.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PAO_DE_FORMA_PADARIA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_80.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PADARIA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_80.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PASTEL_DE_NATA_PADARIA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_80.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PADARIA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_80.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PADARIA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_80.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PAO_DE_FORMA_PASTELARIA_DOCE_MANJAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PAO_DE_FORMA_PASTELARIA_DOCE_MANJAR.getProduct())
                    .address(AddressData.ADDRESS_81.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PASTELARIA_DOCE_MANJAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PASTELARIA_DOCE_MANJAR.getProduct())
                    .address(AddressData.ADDRESS_81.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PASTEL_DE_NATA_PASTELARIA_DOCE_MANJAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PASTEL_DE_NATA_PASTELARIA_DOCE_MANJAR.getProduct())
                    .address(AddressData.ADDRESS_81.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PASTELARIA_DOCE_MANJAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PASTELARIA_DOCE_MANJAR.getProduct())
                    .address(AddressData.ADDRESS_81.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PASTELARIA_DOCE_MANJAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PASTELARIA_DOCE_MANJAR.getProduct())
                    .address(AddressData.ADDRESS_81.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PAO_DE_FORMA_PADARIA_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_82.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PADARIA_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_82.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PASTEL_DE_NATA_PADARIA_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_82.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PADARIA_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_82.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_KILAMBA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PADARIA_KILAMBA.getProduct())
                    .address(AddressData.ADDRESS_82.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_MANACA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PAO_DE_FORMA_PADARIA_MANACA.getProduct())
                    .address(AddressData.ADDRESS_83.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_MANACA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PADARIA_MANACA.getProduct())
                    .address(AddressData.ADDRESS_83.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_MANACA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PASTEL_DE_NATA_PADARIA_MANACA.getProduct())
                    .address(AddressData.ADDRESS_83.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_MANACA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PADARIA_MANACA.getProduct())
                    .address(AddressData.ADDRESS_83.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_MANACA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PADARIA_MANACA.getProduct())
                    .address(AddressData.ADDRESS_83.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LISBOA_LINHAS_AEREAS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_LINHAS_AEREAS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_84.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_HUAMBO_LINHAS_AEREAS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_LINHAS_AEREAS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_84.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LUBANGO_LINHAS_AEREAS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_LINHAS_AEREAS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_84.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_LINHAS_AEREAS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_LINHAS_AEREAS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_84.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LONDRES_LINHAS_AEREAS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_LINHAS_AEREAS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_84.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LISBOA_ANGOLA_EXPRESS_AIR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_ANGOLA_EXPRESS_AIR.getProduct())
                    .address(AddressData.ADDRESS_85.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_HUAMBO_ANGOLA_EXPRESS_AIR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_ANGOLA_EXPRESS_AIR.getProduct())
                    .address(AddressData.ADDRESS_85.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LUBANGO_ANGOLA_EXPRESS_AIR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_ANGOLA_EXPRESS_AIR.getProduct())
                    .address(AddressData.ADDRESS_85.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_ANGOLA_EXPRESS_AIR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_ANGOLA_EXPRESS_AIR.getProduct())
                    .address(AddressData.ADDRESS_85.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LONDRES_ANGOLA_EXPRESS_AIR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_ANGOLA_EXPRESS_AIR.getProduct())
                    .address(AddressData.ADDRESS_85.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LISBOA_SKY_ANGOLA_AIRLINES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_SKY_ANGOLA_AIRLINES.getProduct())
                    .address(AddressData.ADDRESS_86.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_HUAMBO_SKY_ANGOLA_AIRLINES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_SKY_ANGOLA_AIRLINES.getProduct())
                    .address(AddressData.ADDRESS_86.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LUBANGO_SKY_ANGOLA_AIRLINES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_SKY_ANGOLA_AIRLINES.getProduct())
                    .address(AddressData.ADDRESS_86.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_SKY_ANGOLA_AIRLINES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_SKY_ANGOLA_AIRLINES.getProduct())
                    .address(AddressData.ADDRESS_86.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LONDRES_SKY_ANGOLA_AIRLINES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_SKY_ANGOLA_AIRLINES.getProduct())
                    .address(AddressData.ADDRESS_86.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LISBOA_KUBINGA_AIR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_KUBINGA_AIR.getProduct())
                    .address(AddressData.ADDRESS_87.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_HUAMBO_KUBINGA_AIR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_KUBINGA_AIR.getProduct())
                    .address(AddressData.ADDRESS_87.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LUBANGO_KUBINGA_AIR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_KUBINGA_AIR.getProduct())
                    .address(AddressData.ADDRESS_87.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_KUBINGA_AIR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_KUBINGA_AIR.getProduct())
                    .address(AddressData.ADDRESS_87.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LONDRES_KUBINGA_AIR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_KUBINGA_AIR.getProduct())
                    .address(AddressData.ADDRESS_87.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LISBOA_ROYAL_WINGS_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_ROYAL_WINGS_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_88.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_HUAMBO_ROYAL_WINGS_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_ROYAL_WINGS_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_88.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LUBANGO_ROYAL_WINGS_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_ROYAL_WINGS_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_88.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_ROYAL_WINGS_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_ROYAL_WINGS_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_88.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VOO_LUANDA_LONDRES_ROYAL_WINGS_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_ROYAL_WINGS_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_88.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_AGENCIA_DE_VIAGENS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_89.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SAFARIR_EM_BENGUELA_AGENCIA_DE_VIAGENS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_89.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_AGENCIA_DE_VIAGENS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_89.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    EXCURSAO_AS_ILHAS_AGENCIA_DE_VIAGENS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_89.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AGENCIA_DE_VIAGENS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_89.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_AVENTURA_VIAGENS_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_AVENTURA_VIAGENS.getProduct())
                    .address(AddressData.ADDRESS_90.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SAFARIR_EM_BENGUELA_AVENTURA_VIAGENS_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_AVENTURA_VIAGENS.getProduct())
                    .address(AddressData.ADDRESS_90.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_AVENTURA_VIAGENS_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_AVENTURA_VIAGENS.getProduct())
                    .address(AddressData.ADDRESS_90.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    EXCURSAO_AS_ILHAS_AVENTURA_VIAGENS_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_AVENTURA_VIAGENS.getProduct())
                    .address(AddressData.ADDRESS_90.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AVENTURA_VIAGENS_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_AVENTURA_VIAGENS.getProduct())
                    .address(AddressData.ADDRESS_90.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_TRAVEL_HOUSE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_TRAVEL_HOUSE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_91.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SAFARIR_EM_BENGUELA_TRAVEL_HOUSE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_TRAVEL_HOUSE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_91.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_TRAVEL_HOUSE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_TRAVEL_HOUSE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_91.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    EXCURSAO_AS_ILHAS_TRAVEL_HOUSE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_TRAVEL_HOUSE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_91.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_TRAVEL_HOUSE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_TRAVEL_HOUSE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_91.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_GLOBETROTTER_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_GLOBETROTTER_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_92.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SAFARIR_EM_BENGUELA_GLOBETROTTER_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_GLOBETROTTER_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_92.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_GLOBETROTTER_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_GLOBETROTTER_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_92.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    EXCURSAO_AS_ILHAS_GLOBETROTTER_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_GLOBETROTTER_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_92.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_GLOBETROTTER_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_GLOBETROTTER_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_92.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_SAFARIR_VIAGENS_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_SAFARIR_VIAGENS.getProduct())
                    .address(AddressData.ADDRESS_93.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SAFARIR_EM_BENGUELA_SAFARIR_VIAGENS_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_SAFARIR_VIAGENS.getProduct())
                    .address(AddressData.ADDRESS_93.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_SAFARIR_VIAGENS_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_SAFARIR_VIAGENS.getProduct())
                    .address(AddressData.ADDRESS_93.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    EXCURSAO_AS_ILHAS_SAFARIR_VIAGENS_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_SAFARIR_VIAGENS.getProduct())
                    .address(AddressData.ADDRESS_93.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_SAFARIR_VIAGENS_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_SAFARIR_VIAGENS.getProduct())
                    .address(AddressData.ADDRESS_93.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_OPERADORA_TURISTICA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_94.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_OPERADORA_TURISTICA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_94.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_OPERADORA_TURISTICA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_94.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_OPERADORA_TURISTICA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_94.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PASSEIO_PELA_FALESIA_OPERADORA_TURISTICA_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_94.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AVENTURA_GUIDES_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_95.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_AVENTURA_GUIDES_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_95.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_AVENTURA_GUIDES_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_95.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_AVENTURA_GUIDES_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_95.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PASSEIO_PELA_FALESIA_AVENTURA_GUIDES_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_95.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_TURISTAS_LUANDA_GUIDES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_TURISTAS_LUANDA_GUIDES.getProduct())
                    .address(AddressData.ADDRESS_96.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_TURISTAS_LUANDA_GUIDES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_TURISTAS_LUANDA_GUIDES.getProduct())
                    .address(AddressData.ADDRESS_96.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_TURISTAS_LUANDA_GUIDES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_TURISTAS_LUANDA_GUIDES.getProduct())
                    .address(AddressData.ADDRESS_96.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_TURISTAS_LUANDA_GUIDES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_TURISTAS_LUANDA_GUIDES.getProduct())
                    .address(AddressData.ADDRESS_96.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PASSEIO_PELA_FALESIA_TURISTAS_LUANDA_GUIDES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_TURISTAS_LUANDA_GUIDES.getProduct())
                    .address(AddressData.ADDRESS_96.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_EXPEDICOES_KALANDULA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_EXPEDICOES_KALANDULA.getProduct())
                    .address(AddressData.ADDRESS_97.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_EXPEDICOES_KALANDULA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_EXPEDICOES_KALANDULA.getProduct())
                    .address(AddressData.ADDRESS_97.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_EXPEDICOES_KALANDULA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_EXPEDICOES_KALANDULA.getProduct())
                    .address(AddressData.ADDRESS_97.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_EXPEDICOES_KALANDULA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_EXPEDICOES_KALANDULA.getProduct())
                    .address(AddressData.ADDRESS_97.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PASSEIO_PELA_FALESIA_EXPEDICOES_KALANDULA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_EXPEDICOES_KALANDULA.getProduct())
                    .address(AddressData.ADDRESS_97.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_GUIA_TOURS_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_GUIA_TOURS_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_98.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_GUIA_TOURS_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_GUIA_TOURS_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_98.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_GUIA_TOURS_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_GUIA_TOURS_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_98.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_GUIA_TOURS_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_GUIA_TOURS_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_98.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PASSEIO_PELA_FALESIA_GUIA_TOURS_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_GUIA_TOURS_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_98.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_INTERPRETES_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_INTERPRETES_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_99.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_FRANCES_INTERPRETES_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_INTERPRETES_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_99.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_INGLES_INTERPRETES_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_INTERPRETES_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_99.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GUIA_DE_CONFERENCIA_INTERPRETES_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_INTERPRETES_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_99.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_INTERPRETES_DE_LUANDA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_INTERPRETES_DE_LUANDA.getProduct())
                    .address(AddressData.ADDRESS_99.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_GLOBAL_VOICES_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_GLOBAL_VOICES_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_100.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_FRANCES_GLOBAL_VOICES_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_GLOBAL_VOICES_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_100.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_INGLES_GLOBAL_VOICES_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_GLOBAL_VOICES_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_100.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GUIA_DE_CONFERENCIA_GLOBAL_VOICES_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_GLOBAL_VOICES_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_100.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_GLOBAL_VOICES_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_GLOBAL_VOICES_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_100.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_TRADUCAO_E_INTERPRETE_SERVICES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .address(AddressData.ADDRESS_101.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_FRANCES_TRADUCAO_E_INTERPRETE_SERVICES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .address(AddressData.ADDRESS_101.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_INGLES_TRADUCAO_E_INTERPRETE_SERVICES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .address(AddressData.ADDRESS_101.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GUIA_DE_CONFERENCIA_TRADUCAO_E_INTERPRETE_SERVICES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .address(AddressData.ADDRESS_101.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_TRADUCAO_E_INTERPRETE_SERVICES_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .address(AddressData.ADDRESS_101.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_INTERPRETE_PRO_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_INTERPRETE_PRO_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_102.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_FRANCES_INTERPRETE_PRO_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_INTERPRETE_PRO_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_102.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_INGLES_INTERPRETE_PRO_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_INTERPRETE_PRO_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_102.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GUIA_DE_CONFERENCIA_INTERPRETE_PRO_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_INTERPRETE_PRO_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_102.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_INTERPRETE_PRO_ANGOLA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_INTERPRETE_PRO_ANGOLA.getProduct())
                    .address(AddressData.ADDRESS_102.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_IDIOMAS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_IDIOMAS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_103.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_FRANCES_IDIOMAS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_IDIOMAS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_103.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    INTERPRETE_DE_INGLES_IDIOMAS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_IDIOMAS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_103.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    GUIA_DE_CONFERENCIA_IDIOMAS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_IDIOMAS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_103.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_IDIOMAS_KWANZA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_IDIOMAS_KWANZA.getProduct())
                    .address(AddressData.ADDRESS_103.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_TWIN_DELUXE_EPICSANA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_TWIN_DELUXE_EPICSANA.getProduct())
                    .address(AddressData.ADDRESS_1.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    APARTAMENTO_FAMILIAR_EPICSANA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.APARTAMENTO_FAMILIAR_EPICSANA.getProduct())
                    .address(AddressData.ADDRESS_1.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PACOTE_DUAS_NOITES_EPICSANA_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PACOTE_DUAS_NOITES_EPICSANA.getProduct())
                    .address(AddressData.ADDRESS_1.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_INDIVIDUAL_EXECUTIVO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_INDIVIDUAL_EXECUTIVO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_2.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_FAMILIAR_COM_VARANDA_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_FAMILIAR_COM_VARANDA_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_2.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SUITE_MIRAMAR_COM_VISTA_PARA_O_MAR_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SUITE_MIRAMAR_COM_VISTA_PARA_O_MAR_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_2.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    ESTADIA_MENSAL_COM_DESCONTO_MIRAMAR_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.ESTADIA_MENSAL_COM_DESCONTO_MIRAMAR.getProduct())
                    .address(AddressData.ADDRESS_2.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_INDIVIDUAL_SIMPLES_HUAMBO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_INDIVIDUAL_SIMPLES_HUAMBO.getProduct())
                    .address(AddressData.ADDRESS_3.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    QUARTO_CASAL_COM_BANHEIRA_HUAMBO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.QUARTO_CASAL_COM_BANHEIRA_HUAMBO.getProduct())
                    .address(AddressData.ADDRESS_3.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    PENSAO_COMPLETA_POR_DIA_HUAMBO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.PENSAO_COMPLETA_POR_DIA_HUAMBO.getProduct())
                    .address(AddressData.ADDRESS_3.getAddress())
                    .isPrincipal(true)
                    .build()
    ),

    SALA_DE_CONFERENCIAS_POR_HORA_HUAMBO_ADDRESS(
            ProductAddress.builder()
                    .product(ProductData.SALA_DE_CONFERENCIAS_POR_HORA_HUAMBO.getProduct())
                    .address(AddressData.ADDRESS_3.getAddress())
                    .isPrincipal(true)
                    .build()
    );

    private final ProductAddress productAddress;
}
