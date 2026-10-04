package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.product.model.ProductFile;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductFileData {
    EPIC_SANA_ROOM_SINGLE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SINGLE.getProduct())
                    .doc(DocumentFileData.ROOM_SINGLE_IMAGE.getDocumentFile())
                    .build()
    ),
    EPIC_SANA_ROOM_SUITE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SUITE.getProduct())
                    .doc(DocumentFileData.ROOM_SUITE_IMAGE.getDocumentFile())
                    .build()
    ),
    MIRAMAR_ROOM_DOUBLE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MIRAMAR_ROOM_DOUBLE.getProduct())
                    .doc(DocumentFileData.ROOM_DOUBLE_IMAGE.getDocumentFile())
                    .build()
    ),
    HUAMBO_ROOM_TWIN_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HUAMBO_ROOM_TWIN.getProduct())
                    .doc(DocumentFileData.ROOM_TWIN_IMAGE.getDocumentFile())
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_BAIA_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.QUARTO_SINGLE_DELUXE_HOTEL_BAIA_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_BAIA_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.QUARTO_CASAL_PREMIUM_HOTEL_BAIA_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_BAIA_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SUITE_FAMILIAR_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.SUITE_FAMILIAR_HOTEL_BAIA_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_BAIA_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.QUARTO_TWIN_EXECUTIVO_HOTEL_BAIA_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_BAIA_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.APARTAMENTO_T1_EXECUTIVO_HOTEL_BAIA_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_MILANO_RESORT_SPA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .doc(DocumentFileData.QUARTO_SINGLE_DELUXE_HOTEL_MILANO_RESORT_SPA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_MILANO_RESORT_SPA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .doc(DocumentFileData.QUARTO_CASAL_PREMIUM_HOTEL_MILANO_RESORT_SPA_PHOTO.getDocumentFile())
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_MILANO_RESORT_SPA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SUITE_FAMILIAR_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .doc(DocumentFileData.SUITE_FAMILIAR_HOTEL_MILANO_RESORT_SPA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_MILANO_RESORT_SPA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .doc(DocumentFileData.QUARTO_TWIN_EXECUTIVO_HOTEL_MILANO_RESORT_SPA_PHOTO.getDocumentFile())
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_MILANO_RESORT_SPA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .doc(DocumentFileData.APARTAMENTO_T1_EXECUTIVO_HOTEL_MILANO_RESORT_SPA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_KALANDULA_PALACE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_HOTEL_KALANDULA_PALACE.getProduct())
                    .doc(DocumentFileData.QUARTO_SINGLE_DELUXE_HOTEL_KALANDULA_PALACE_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_KALANDULA_PALACE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_HOTEL_KALANDULA_PALACE.getProduct())
                    .doc(DocumentFileData.QUARTO_CASAL_PREMIUM_HOTEL_KALANDULA_PALACE_PHOTO.getDocumentFile())
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_KALANDULA_PALACE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SUITE_FAMILIAR_HOTEL_KALANDULA_PALACE.getProduct())
                    .doc(DocumentFileData.SUITE_FAMILIAR_HOTEL_KALANDULA_PALACE_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_KALANDULA_PALACE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_HOTEL_KALANDULA_PALACE.getProduct())
                    .doc(DocumentFileData.QUARTO_TWIN_EXECUTIVO_HOTEL_KALANDULA_PALACE_PHOTO.getDocumentFile())
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_KALANDULA_PALACE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_HOTEL_KALANDULA_PALACE.getProduct())
                    .doc(DocumentFileData.APARTAMENTO_T1_EXECUTIVO_HOTEL_KALANDULA_PALACE_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_MIRAMAR_BUSINESS_HOTEL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .doc(DocumentFileData.QUARTO_SINGLE_DELUXE_MIRAMAR_BUSINESS_HOTEL_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_MIRAMAR_BUSINESS_HOTEL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .doc(DocumentFileData.QUARTO_CASAL_PREMIUM_MIRAMAR_BUSINESS_HOTEL_PHOTO.getDocumentFile())
                    .build()
    ),

    SUITE_FAMILIAR_MIRAMAR_BUSINESS_HOTEL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SUITE_FAMILIAR_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .doc(DocumentFileData.SUITE_FAMILIAR_MIRAMAR_BUSINESS_HOTEL_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .doc(DocumentFileData.QUARTO_TWIN_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL_PHOTO.getDocumentFile())
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .doc(DocumentFileData.APARTAMENTO_T1_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_CASCADE_CITY_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_HOTEL_CASCADE_CITY.getProduct())
                    .doc(DocumentFileData.QUARTO_SINGLE_DELUXE_HOTEL_CASCADE_CITY_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_CASCADE_CITY_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_HOTEL_CASCADE_CITY.getProduct())
                    .doc(DocumentFileData.QUARTO_CASAL_PREMIUM_HOTEL_CASCADE_CITY_PHOTO.getDocumentFile())
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_CASCADE_CITY_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SUITE_FAMILIAR_HOTEL_CASCADE_CITY.getProduct())
                    .doc(DocumentFileData.SUITE_FAMILIAR_HOTEL_CASCADE_CITY_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_CASCADE_CITY_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_HOTEL_CASCADE_CITY.getProduct())
                    .doc(DocumentFileData.QUARTO_TWIN_EXECUTIVO_HOTEL_CASCADE_CITY_PHOTO.getDocumentFile())
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_CASCADE_CITY_PHOTO(
            ProductFile.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_HOTEL_CASCADE_CITY.getProduct())
                    .doc(DocumentFileData.APARTAMENTO_T1_EXECUTIVO_HOTEL_CASCADE_CITY_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_VILA_HARMONY_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_STANDARD_POUSADA_VILA_HARMONY.getProduct())
                    .doc(DocumentFileData.QUARTO_STANDARD_POUSADA_VILA_HARMONY_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_VILA_HARMONY_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_FAMILIAR_POUSADA_VILA_HARMONY.getProduct())
                    .doc(DocumentFileData.QUARTO_FAMILIAR_POUSADA_VILA_HARMONY_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_VILA_HARMONY_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_POUSADA_VILA_HARMONY.getProduct())
                    .doc(DocumentFileData.QUARTO_COM_VARANDA_POUSADA_VILA_HARMONY_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_VILA_HARMONY_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_ECONOMICO_POUSADA_VILA_HARMONY.getProduct())
                    .doc(DocumentFileData.QUARTO_ECONOMICO_POUSADA_VILA_HARMONY_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_TWIN_POUSADA_VILA_HARMONY_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_TWIN_POUSADA_VILA_HARMONY.getProduct())
                    .doc(DocumentFileData.QUARTO_TWIN_POUSADA_VILA_HARMONY_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_BAIA_AZUL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_STANDARD_POUSADA_BAIA_AZUL.getProduct())
                    .doc(DocumentFileData.QUARTO_STANDARD_POUSADA_BAIA_AZUL_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_BAIA_AZUL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_FAMILIAR_POUSADA_BAIA_AZUL.getProduct())
                    .doc(DocumentFileData.QUARTO_FAMILIAR_POUSADA_BAIA_AZUL_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_BAIA_AZUL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_POUSADA_BAIA_AZUL.getProduct())
                    .doc(DocumentFileData.QUARTO_COM_VARANDA_POUSADA_BAIA_AZUL_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_BAIA_AZUL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_ECONOMICO_POUSADA_BAIA_AZUL.getProduct())
                    .doc(DocumentFileData.QUARTO_ECONOMICO_POUSADA_BAIA_AZUL_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_TWIN_POUSADA_BAIA_AZUL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_TWIN_POUSADA_BAIA_AZUL.getProduct())
                    .doc(DocumentFileData.QUARTO_TWIN_POUSADA_BAIA_AZUL_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_RECANTO_VERDE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_STANDARD_POUSADA_RECANTO_VERDE.getProduct())
                    .doc(DocumentFileData.QUARTO_STANDARD_POUSADA_RECANTO_VERDE_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_RECANTO_VERDE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_FAMILIAR_POUSADA_RECANTO_VERDE.getProduct())
                    .doc(DocumentFileData.QUARTO_FAMILIAR_POUSADA_RECANTO_VERDE_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_RECANTO_VERDE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_POUSADA_RECANTO_VERDE.getProduct())
                    .doc(DocumentFileData.QUARTO_COM_VARANDA_POUSADA_RECANTO_VERDE_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_RECANTO_VERDE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_ECONOMICO_POUSADA_RECANTO_VERDE.getProduct())
                    .doc(DocumentFileData.QUARTO_ECONOMICO_POUSADA_RECANTO_VERDE_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_TWIN_POUSADA_RECANTO_VERDE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_TWIN_POUSADA_RECANTO_VERDE.getProduct())
                    .doc(DocumentFileData.QUARTO_TWIN_POUSADA_RECANTO_VERDE_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_SAO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_STANDARD_POUSADA_SAO_KIZUA.getProduct())
                    .doc(DocumentFileData.QUARTO_STANDARD_POUSADA_SAO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_SAO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_FAMILIAR_POUSADA_SAO_KIZUA.getProduct())
                    .doc(DocumentFileData.QUARTO_FAMILIAR_POUSADA_SAO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_SAO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_POUSADA_SAO_KIZUA.getProduct())
                    .doc(DocumentFileData.QUARTO_COM_VARANDA_POUSADA_SAO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_SAO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_ECONOMICO_POUSADA_SAO_KIZUA.getProduct())
                    .doc(DocumentFileData.QUARTO_ECONOMICO_POUSADA_SAO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_TWIN_POUSADA_SAO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_TWIN_POUSADA_SAO_KIZUA.getProduct())
                    .doc(DocumentFileData.QUARTO_TWIN_POUSADA_SAO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_STANDARD_GUEST_HOUSE_MIRAMAR_INN_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_STANDARD_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .doc(DocumentFileData.QUARTO_STANDARD_GUEST_HOUSE_MIRAMAR_INN_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_FAMILIAR_GUEST_HOUSE_MIRAMAR_INN_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_FAMILIAR_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .doc(DocumentFileData.QUARTO_FAMILIAR_GUEST_HOUSE_MIRAMAR_INN_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_COM_VARANDA_GUEST_HOUSE_MIRAMAR_INN_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .doc(DocumentFileData.QUARTO_COM_VARANDA_GUEST_HOUSE_MIRAMAR_INN_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_ECONOMICO_GUEST_HOUSE_MIRAMAR_INN_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_ECONOMICO_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .doc(DocumentFileData.QUARTO_ECONOMICO_GUEST_HOUSE_MIRAMAR_INN_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_TWIN_GUEST_HOUSE_MIRAMAR_INN_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_TWIN_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .doc(DocumentFileData.QUARTO_TWIN_GUEST_HOUSE_MIRAMAR_INN_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_PROGRESSO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_PROGRESSO.getProduct())
                    .doc(DocumentFileData.QUARTO_SIMPLES_HOSPEDARIA_PROGRESSO_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_PROGRESSO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_PROGRESSO.getProduct())
                    .doc(DocumentFileData.QUARTO_SINGLE_HOSPEDARIA_PROGRESSO_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_PROGRESSO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_PROGRESSO.getProduct())
                    .doc(DocumentFileData.QUARTO_FAMILIAR_HOSPEDARIA_PROGRESSO_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_PROGRESSO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_PROGRESSO.getProduct())
                    .doc(DocumentFileData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_PROGRESSO_PHOTO.getDocumentFile())
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_PROGRESSO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_PROGRESSO.getProduct())
                    .doc(DocumentFileData.ESTADIA_PROLONGADA_HOSPEDARIA_PROGRESSO_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_KWANZA.getProduct())
                    .doc(DocumentFileData.QUARTO_SIMPLES_HOSPEDARIA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_KWANZA.getProduct())
                    .doc(DocumentFileData.QUARTO_SINGLE_HOSPEDARIA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_KWANZA.getProduct())
                    .doc(DocumentFileData.QUARTO_FAMILIAR_HOSPEDARIA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KWANZA.getProduct())
                    .doc(DocumentFileData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_KWANZA.getProduct())
                    .doc(DocumentFileData.ESTADIA_PROLONGADA_HOSPEDARIA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_KATANGA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_KATANGA.getProduct())
                    .doc(DocumentFileData.QUARTO_SIMPLES_HOSPEDARIA_KATANGA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_KATANGA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_KATANGA.getProduct())
                    .doc(DocumentFileData.QUARTO_SINGLE_HOSPEDARIA_KATANGA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_KATANGA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_KATANGA.getProduct())
                    .doc(DocumentFileData.QUARTO_FAMILIAR_HOSPEDARIA_KATANGA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KATANGA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KATANGA.getProduct())
                    .doc(DocumentFileData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KATANGA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_KATANGA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_KATANGA.getProduct())
                    .doc(DocumentFileData.ESTADIA_PROLONGADA_HOSPEDARIA_KATANGA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_NOVA_VIDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .doc(DocumentFileData.QUARTO_SIMPLES_HOSPEDARIA_NOVA_VIDA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_NOVA_VIDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .doc(DocumentFileData.QUARTO_SINGLE_HOSPEDARIA_NOVA_VIDA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_NOVA_VIDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .doc(DocumentFileData.QUARTO_FAMILIAR_HOSPEDARIA_NOVA_VIDA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_NOVA_VIDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .doc(DocumentFileData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_NOVA_VIDA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_NOVA_VIDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .doc(DocumentFileData.ESTADIA_PROLONGADA_HOSPEDARIA_NOVA_VIDA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_SAO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .doc(DocumentFileData.QUARTO_SIMPLES_HOSPEDARIA_SAO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_SAO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .doc(DocumentFileData.QUARTO_SINGLE_HOSPEDARIA_SAO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_SAO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .doc(DocumentFileData.QUARTO_FAMILIAR_HOSPEDARIA_SAO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_SAO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .doc(DocumentFileData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_SAO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_SAO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .doc(DocumentFileData.ESTADIA_PROLONGADA_HOSPEDARIA_SAO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_O_MUSQUETE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_O_MUSQUETE.getProduct())
                    .doc(DocumentFileData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_O_MUSQUETE_PHOTO.getDocumentFile())
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_O_MUSQUETE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_O_MUSQUETE.getProduct())
                    .doc(DocumentFileData.PRATO_DO_DIA_RESTAURANTE_O_MUSQUETE_PHOTO.getDocumentFile())
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_O_MUSQUETE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_O_MUSQUETE.getProduct())
                    .doc(DocumentFileData.BOWL_DO_CHEF_RESTAURANTE_O_MUSQUETE_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_O_MUSQUETE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_O_MUSQUETE.getProduct())
                    .doc(DocumentFileData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_O_MUSQUETE_PHOTO.getDocumentFile())
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_O_MUSQUETE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_O_MUSQUETE.getProduct())
                    .doc(DocumentFileData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_O_MUSQUETE_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_MAR_E_TERRA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .doc(DocumentFileData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_MAR_E_TERRA_PHOTO.getDocumentFile())
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_MAR_E_TERRA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .doc(DocumentFileData.PRATO_DO_DIA_RESTAURANTE_MAR_E_TERRA_PHOTO.getDocumentFile())
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_MAR_E_TERRA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .doc(DocumentFileData.BOWL_DO_CHEF_RESTAURANTE_MAR_E_TERRA_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_MAR_E_TERRA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .doc(DocumentFileData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_MAR_E_TERRA_PHOTO.getDocumentFile())
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_MAR_E_TERRA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .doc(DocumentFileData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_MAR_E_TERRA_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_KWANZA_LIVING_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .doc(DocumentFileData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_KWANZA_LIVING_PHOTO.getDocumentFile())
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_KWANZA_LIVING_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .doc(DocumentFileData.PRATO_DO_DIA_RESTAURANTE_KWANZA_LIVING_PHOTO.getDocumentFile())
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_KWANZA_LIVING_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .doc(DocumentFileData.BOWL_DO_CHEF_RESTAURANTE_KWANZA_LIVING_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_KWANZA_LIVING_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .doc(DocumentFileData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_KWANZA_LIVING_PHOTO.getDocumentFile())
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_KWANZA_LIVING_PHOTO(
            ProductFile.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .doc(DocumentFileData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_KWANZA_LIVING_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .doc(DocumentFileData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO_PHOTO.getDocumentFile())
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .doc(DocumentFileData.PRATO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO_PHOTO.getDocumentFile())
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .doc(DocumentFileData.BOWL_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .doc(DocumentFileData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO_PHOTO.getDocumentFile())
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_SABOR_ANGOLANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .doc(DocumentFileData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_SABOR_ANGOLANO_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_TALATONA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_TALATONA.getProduct())
                    .doc(DocumentFileData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_TALATONA_PHOTO.getDocumentFile())
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_TALATONA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_TALATONA.getProduct())
                    .doc(DocumentFileData.PRATO_DO_DIA_RESTAURANTE_TALATONA_PHOTO.getDocumentFile())
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_TALATONA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_TALATONA.getProduct())
                    .doc(DocumentFileData.BOWL_DO_CHEF_RESTAURANTE_TALATONA_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_TALATONA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_TALATONA.getProduct())
                    .doc(DocumentFileData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_TALATONA_PHOTO.getDocumentFile())
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_TALATONA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_TALATONA.getProduct())
                    .doc(DocumentFileData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_TALATONA_PHOTO.getDocumentFile())
                    .build()
    ),

    MUAMBA_DE_GALINHA_CANTINHO_DA_MAE_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .doc(DocumentFileData.MUAMBA_DE_GALINHA_CANTINHO_DA_MAE_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALULU_DE_PEIXE_CANTINHO_DA_MAE_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALULU_DE_PEIXE_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .doc(DocumentFileData.CALULU_DE_PEIXE_CANTINHO_DA_MAE_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_CANTINHO_DA_MAE_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .doc(DocumentFileData.FUNGE_COM_FEIJAO_E_OVO_CANTINHO_DA_MAE_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_CANTINHO_DA_MAE_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .doc(DocumentFileData.PEIXE_GRELHADO_DO_DIA_CANTINHO_DA_MAE_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_CANTINHO_DA_MAE_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .doc(DocumentFileData.ESPETOS_MISTOS_DO_KILAMBA_CANTINHO_DA_MAE_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    MUAMBA_DE_GALINHA_SABORES_DA_NOSSA_TERRA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_SABORES_DA_NOSSA_TERRA.getProduct())
                    .doc(DocumentFileData.MUAMBA_DE_GALINHA_SABORES_DA_NOSSA_TERRA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALULU_DE_PEIXE_SABORES_DA_NOSSA_TERRA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALULU_DE_PEIXE_SABORES_DA_NOSSA_TERRA.getProduct())
                    .doc(DocumentFileData.CALULU_DE_PEIXE_SABORES_DA_NOSSA_TERRA_PHOTO.getDocumentFile())
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_SABORES_DA_NOSSA_TERRA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_SABORES_DA_NOSSA_TERRA.getProduct())
                    .doc(DocumentFileData.FUNGE_COM_FEIJAO_E_OVO_SABORES_DA_NOSSA_TERRA_PHOTO.getDocumentFile())
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_SABORES_DA_NOSSA_TERRA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_SABORES_DA_NOSSA_TERRA.getProduct())
                    .doc(DocumentFileData.PEIXE_GRELHADO_DO_DIA_SABORES_DA_NOSSA_TERRA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_SABORES_DA_NOSSA_TERRA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_SABORES_DA_NOSSA_TERRA.getProduct())
                    .doc(DocumentFileData.ESPETOS_MISTOS_DO_KILAMBA_SABORES_DA_NOSSA_TERRA_PHOTO.getDocumentFile())
                    .build()
    ),

    MUAMBA_DE_GALINHA_TASCA_DO_MUAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_TASCA_DO_MUAMBA.getProduct())
                    .doc(DocumentFileData.MUAMBA_DE_GALINHA_TASCA_DO_MUAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALULU_DE_PEIXE_TASCA_DO_MUAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALULU_DE_PEIXE_TASCA_DO_MUAMBA.getProduct())
                    .doc(DocumentFileData.CALULU_DE_PEIXE_TASCA_DO_MUAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_TASCA_DO_MUAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_TASCA_DO_MUAMBA.getProduct())
                    .doc(DocumentFileData.FUNGE_COM_FEIJAO_E_OVO_TASCA_DO_MUAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_TASCA_DO_MUAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_TASCA_DO_MUAMBA.getProduct())
                    .doc(DocumentFileData.PEIXE_GRELHADO_DO_DIA_TASCA_DO_MUAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_TASCA_DO_MUAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_TASCA_DO_MUAMBA.getProduct())
                    .doc(DocumentFileData.ESPETOS_MISTOS_DO_KILAMBA_TASCA_DO_MUAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    MUAMBA_DE_GALINHA_COZINHA_DO_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_COZINHA_DO_KILAMBA.getProduct())
                    .doc(DocumentFileData.MUAMBA_DE_GALINHA_COZINHA_DO_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALULU_DE_PEIXE_COZINHA_DO_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALULU_DE_PEIXE_COZINHA_DO_KILAMBA.getProduct())
                    .doc(DocumentFileData.CALULU_DE_PEIXE_COZINHA_DO_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_COZINHA_DO_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_COZINHA_DO_KILAMBA.getProduct())
                    .doc(DocumentFileData.FUNGE_COM_FEIJAO_E_OVO_COZINHA_DO_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_COZINHA_DO_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_COZINHA_DO_KILAMBA.getProduct())
                    .doc(DocumentFileData.PEIXE_GRELHADO_DO_DIA_COZINHA_DO_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_COZINHA_DO_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_COZINHA_DO_KILAMBA.getProduct())
                    .doc(DocumentFileData.ESPETOS_MISTOS_DO_KILAMBA_COZINHA_DO_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    MUAMBA_DE_GALINHA_SOLAR_DO_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_SOLAR_DO_KWANZA.getProduct())
                    .doc(DocumentFileData.MUAMBA_DE_GALINHA_SOLAR_DO_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALULU_DE_PEIXE_SOLAR_DO_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALULU_DE_PEIXE_SOLAR_DO_KWANZA.getProduct())
                    .doc(DocumentFileData.CALULU_DE_PEIXE_SOLAR_DO_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_SOLAR_DO_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_SOLAR_DO_KWANZA.getProduct())
                    .doc(DocumentFileData.FUNGE_COM_FEIJAO_E_OVO_SOLAR_DO_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_SOLAR_DO_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_SOLAR_DO_KWANZA.getProduct())
                    .doc(DocumentFileData.PEIXE_GRELHADO_DO_DIA_SOLAR_DO_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_SOLAR_DO_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_SOLAR_DO_KWANZA.getProduct())
                    .doc(DocumentFileData.ESPETOS_MISTOS_DO_KILAMBA_SOLAR_DO_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_NAPOLI_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .doc(DocumentFileData.PIZZA_MARGHERITA_PIZZERIA_NAPOLI_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_NAPOLI_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .doc(DocumentFileData.PIZZA_PEPPERONI_PIZZERIA_NAPOLI_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_NAPOLI_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .doc(DocumentFileData.PIZZA_PORTUGUESA_PIZZERIA_NAPOLI_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_NAPOLI_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .doc(DocumentFileData.PIZZA_VEGETARIANA_PIZZERIA_NAPOLI_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_NAPOLI_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .doc(DocumentFileData.CALZONE_RECHEADO_PIZZERIA_NAPOLI_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_FORNO_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .doc(DocumentFileData.PIZZA_MARGHERITA_PIZZERIA_FORNO_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_FORNO_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .doc(DocumentFileData.PIZZA_PEPPERONI_PIZZERIA_FORNO_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_FORNO_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .doc(DocumentFileData.PIZZA_PORTUGUESA_PIZZERIA_FORNO_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_FORNO_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .doc(DocumentFileData.PIZZA_VEGETARIANA_PIZZERIA_FORNO_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_FORNO_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .doc(DocumentFileData.CALZONE_RECHEADO_PIZZERIA_FORNO_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_MSLICE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_MSLICE.getProduct())
                    .doc(DocumentFileData.PIZZA_MARGHERITA_PIZZERIA_MSLICE_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_MSLICE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_MSLICE.getProduct())
                    .doc(DocumentFileData.PIZZA_PEPPERONI_PIZZERIA_MSLICE_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_MSLICE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_MSLICE.getProduct())
                    .doc(DocumentFileData.PIZZA_PORTUGUESA_PIZZERIA_MSLICE_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_MSLICE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_MSLICE.getProduct())
                    .doc(DocumentFileData.PIZZA_VEGETARIANA_PIZZERIA_MSLICE_PHOTO.getDocumentFile())
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_MSLICE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_MSLICE.getProduct())
                    .doc(DocumentFileData.CALZONE_RECHEADO_PIZZERIA_MSLICE_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_MANGUERINHA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_MANGUERINHA.getProduct())
                    .doc(DocumentFileData.PIZZA_MARGHERITA_PIZZERIA_MANGUERINHA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_MANGUERINHA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_MANGUERINHA.getProduct())
                    .doc(DocumentFileData.PIZZA_PEPPERONI_PIZZERIA_MANGUERINHA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_MANGUERINHA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_MANGUERINHA.getProduct())
                    .doc(DocumentFileData.PIZZA_PORTUGUESA_PIZZERIA_MANGUERINHA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_MANGUERINHA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_MANGUERINHA.getProduct())
                    .doc(DocumentFileData.PIZZA_VEGETARIANA_PIZZERIA_MANGUERINHA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_MANGUERINHA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_MANGUERINHA.getProduct())
                    .doc(DocumentFileData.CALZONE_RECHEADO_PIZZERIA_MANGUERINHA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_BELLA_VISTA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_BELLA_VISTA.getProduct())
                    .doc(DocumentFileData.PIZZA_MARGHERITA_PIZZERIA_BELLA_VISTA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_BELLA_VISTA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_BELLA_VISTA.getProduct())
                    .doc(DocumentFileData.PIZZA_PEPPERONI_PIZZERIA_BELLA_VISTA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_BELLA_VISTA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_BELLA_VISTA.getProduct())
                    .doc(DocumentFileData.PIZZA_PORTUGUESA_PIZZERIA_BELLA_VISTA_PHOTO.getDocumentFile())
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_BELLA_VISTA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_BELLA_VISTA.getProduct())
                    .doc(DocumentFileData.PIZZA_VEGETARIANA_PIZZERIA_BELLA_VISTA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_BELLA_VISTA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_BELLA_VISTA.getProduct())
                    .doc(DocumentFileData.CALZONE_RECHEADO_PIZZERIA_BELLA_VISTA_PHOTO.getDocumentFile())
                    .build()
    ),

    HAMBURGUER_CLASSICO_SNACK_BAR_O_PONTO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_SNACK_BAR_O_PONTO.getProduct())
                    .doc(DocumentFileData.HAMBURGUER_CLASSICO_SNACK_BAR_O_PONTO_PHOTO.getDocumentFile())
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_SNACK_BAR_O_PONTO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_SNACK_BAR_O_PONTO.getProduct())
                    .doc(DocumentFileData.CHEESEBURGER_ESPECIAL_SNACK_BAR_O_PONTO_PHOTO.getDocumentFile())
                    .build()
    ),

    BATATAS_FRITAS_SNACK_BAR_O_PONTO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BATATAS_FRITAS_SNACK_BAR_O_PONTO.getProduct())
                    .doc(DocumentFileData.BATATAS_FRITAS_SNACK_BAR_O_PONTO_PHOTO.getDocumentFile())
                    .build()
    ),

    WRAP_DE_FRANGO_SNACK_BAR_O_PONTO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.WRAP_DE_FRANGO_SNACK_BAR_O_PONTO.getProduct())
                    .doc(DocumentFileData.WRAP_DE_FRANGO_SNACK_BAR_O_PONTO_PHOTO.getDocumentFile())
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_SNACK_BAR_O_PONTO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_SNACK_BAR_O_PONTO.getProduct())
                    .doc(DocumentFileData.MILK_SHAKE_DE_CHOCOLATE_SNACK_BAR_O_PONTO_PHOTO.getDocumentFile())
                    .build()
    ),

    HAMBURGUER_CLASSICO_BURGER_STATION_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_BURGER_STATION_LUANDA.getProduct())
                    .doc(DocumentFileData.HAMBURGUER_CLASSICO_BURGER_STATION_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_BURGER_STATION_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_BURGER_STATION_LUANDA.getProduct())
                    .doc(DocumentFileData.CHEESEBURGER_ESPECIAL_BURGER_STATION_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    BATATAS_FRITAS_BURGER_STATION_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BATATAS_FRITAS_BURGER_STATION_LUANDA.getProduct())
                    .doc(DocumentFileData.BATATAS_FRITAS_BURGER_STATION_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    WRAP_DE_FRANGO_BURGER_STATION_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.WRAP_DE_FRANGO_BURGER_STATION_LUANDA.getProduct())
                    .doc(DocumentFileData.WRAP_DE_FRANGO_BURGER_STATION_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_BURGER_STATION_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_BURGER_STATION_LUANDA.getProduct())
                    .doc(DocumentFileData.MILK_SHAKE_DE_CHOCOLATE_BURGER_STATION_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    HAMBURGUER_CLASSICO_FAST_FOOD_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_FAST_FOOD_KWANZA.getProduct())
                    .doc(DocumentFileData.HAMBURGUER_CLASSICO_FAST_FOOD_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_FAST_FOOD_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_FAST_FOOD_KWANZA.getProduct())
                    .doc(DocumentFileData.CHEESEBURGER_ESPECIAL_FAST_FOOD_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    BATATAS_FRITAS_FAST_FOOD_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BATATAS_FRITAS_FAST_FOOD_KWANZA.getProduct())
                    .doc(DocumentFileData.BATATAS_FRITAS_FAST_FOOD_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    WRAP_DE_FRANGO_FAST_FOOD_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.WRAP_DE_FRANGO_FAST_FOOD_KWANZA.getProduct())
                    .doc(DocumentFileData.WRAP_DE_FRANGO_FAST_FOOD_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_FAST_FOOD_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_FAST_FOOD_KWANZA.getProduct())
                    .doc(DocumentFileData.MILK_SHAKE_DE_CHOCOLATE_FAST_FOOD_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    HAMBURGUER_CLASSICO_LANCHES_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_LANCHES_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.HAMBURGUER_CLASSICO_LANCHES_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_LANCHES_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_LANCHES_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.CHEESEBURGER_ESPECIAL_LANCHES_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    BATATAS_FRITAS_LANCHES_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BATATAS_FRITAS_LANCHES_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.BATATAS_FRITAS_LANCHES_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    WRAP_DE_FRANGO_LANCHES_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.WRAP_DE_FRANGO_LANCHES_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.WRAP_DE_FRANGO_LANCHES_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_LANCHES_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_LANCHES_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.MILK_SHAKE_DE_CHOCOLATE_LANCHES_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    HAMBURGUER_CLASSICO_FOOD_TRUCK_TAXI_AZUL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .doc(DocumentFileData.HAMBURGUER_CLASSICO_FOOD_TRUCK_TAXI_AZUL_PHOTO.getDocumentFile())
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_FOOD_TRUCK_TAXI_AZUL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .doc(DocumentFileData.CHEESEBURGER_ESPECIAL_FOOD_TRUCK_TAXI_AZUL_PHOTO.getDocumentFile())
                    .build()
    ),

    BATATAS_FRITAS_FOOD_TRUCK_TAXI_AZUL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BATATAS_FRITAS_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .doc(DocumentFileData.BATATAS_FRITAS_FOOD_TRUCK_TAXI_AZUL_PHOTO.getDocumentFile())
                    .build()
    ),

    WRAP_DE_FRANGO_FOOD_TRUCK_TAXI_AZUL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.WRAP_DE_FRANGO_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .doc(DocumentFileData.WRAP_DE_FRANGO_FOOD_TRUCK_TAXI_AZUL_PHOTO.getDocumentFile())
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_FOOD_TRUCK_TAXI_AZUL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .doc(DocumentFileData.MILK_SHAKE_DE_CHOCOLATE_FOOD_TRUCK_TAXI_AZUL_PHOTO.getDocumentFile())
                    .build()
    ),

    BIFE_GRELHADO_CHURRASQUEIRA_DO_ZE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BIFE_GRELHADO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .doc(DocumentFileData.BIFE_GRELHADO_CHURRASQUEIRA_DO_ZE_PHOTO.getDocumentFile())
                    .build()
    ),

    FRANGO_GRELHADO_CHURRASQUEIRA_DO_ZE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FRANGO_GRELHADO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .doc(DocumentFileData.FRANGO_GRELHADO_CHURRASQUEIRA_DO_ZE_PHOTO.getDocumentFile())
                    .build()
    ),

    COSTELETA_DE_PORCO_CHURRASQUEIRA_DO_ZE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .doc(DocumentFileData.COSTELETA_DE_PORCO_CHURRASQUEIRA_DO_ZE_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETO_MISTO_CHURRASQUEIRA_DO_ZE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETO_MISTO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .doc(DocumentFileData.ESPETO_MISTO_CHURRASQUEIRA_DO_ZE_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETO_DE_CAMARAO_CHURRASQUEIRA_DO_ZE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .doc(DocumentFileData.ESPETO_DE_CAMARAO_CHURRASQUEIRA_DO_ZE_PHOTO.getDocumentFile())
                    .build()
    ),

    BIFE_GRELHADO_GRELHADOS_MIUDOS_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BIFE_GRELHADO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .doc(DocumentFileData.BIFE_GRELHADO_GRELHADOS_MIUDOS_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    FRANGO_GRELHADO_GRELHADOS_MIUDOS_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FRANGO_GRELHADO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .doc(DocumentFileData.FRANGO_GRELHADO_GRELHADOS_MIUDOS_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    COSTELETA_DE_PORCO_GRELHADOS_MIUDOS_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .doc(DocumentFileData.COSTELETA_DE_PORCO_GRELHADOS_MIUDOS_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETO_MISTO_GRELHADOS_MIUDOS_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETO_MISTO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .doc(DocumentFileData.ESPETO_MISTO_GRELHADOS_MIUDOS_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETO_DE_CAMARAO_GRELHADOS_MIUDOS_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .doc(DocumentFileData.ESPETO_DE_CAMARAO_GRELHADOS_MIUDOS_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    BIFE_GRELHADO_ESPETOS_DA_BAIA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BIFE_GRELHADO_ESPETOS_DA_BAIA.getProduct())
                    .doc(DocumentFileData.BIFE_GRELHADO_ESPETOS_DA_BAIA_PHOTO.getDocumentFile())
                    .build()
    ),

    FRANGO_GRELHADO_ESPETOS_DA_BAIA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FRANGO_GRELHADO_ESPETOS_DA_BAIA.getProduct())
                    .doc(DocumentFileData.FRANGO_GRELHADO_ESPETOS_DA_BAIA_PHOTO.getDocumentFile())
                    .build()
    ),

    COSTELETA_DE_PORCO_ESPETOS_DA_BAIA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_ESPETOS_DA_BAIA.getProduct())
                    .doc(DocumentFileData.COSTELETA_DE_PORCO_ESPETOS_DA_BAIA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETO_MISTO_ESPETOS_DA_BAIA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETO_MISTO_ESPETOS_DA_BAIA.getProduct())
                    .doc(DocumentFileData.ESPETO_MISTO_ESPETOS_DA_BAIA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETO_DE_CAMARAO_ESPETOS_DA_BAIA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_ESPETOS_DA_BAIA.getProduct())
                    .doc(DocumentFileData.ESPETO_DE_CAMARAO_ESPETOS_DA_BAIA_PHOTO.getDocumentFile())
                    .build()
    ),

    BIFE_GRELHADO_CHURRASCO_KING_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BIFE_GRELHADO_CHURRASCO_KING.getProduct())
                    .doc(DocumentFileData.BIFE_GRELHADO_CHURRASCO_KING_PHOTO.getDocumentFile())
                    .build()
    ),

    FRANGO_GRELHADO_CHURRASCO_KING_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FRANGO_GRELHADO_CHURRASCO_KING.getProduct())
                    .doc(DocumentFileData.FRANGO_GRELHADO_CHURRASCO_KING_PHOTO.getDocumentFile())
                    .build()
    ),

    COSTELETA_DE_PORCO_CHURRASCO_KING_PHOTO(
            ProductFile.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_CHURRASCO_KING.getProduct())
                    .doc(DocumentFileData.COSTELETA_DE_PORCO_CHURRASCO_KING_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETO_MISTO_CHURRASCO_KING_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETO_MISTO_CHURRASCO_KING.getProduct())
                    .doc(DocumentFileData.ESPETO_MISTO_CHURRASCO_KING_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETO_DE_CAMARAO_CHURRASCO_KING_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_CHURRASCO_KING.getProduct())
                    .doc(DocumentFileData.ESPETO_DE_CAMARAO_CHURRASCO_KING_PHOTO.getDocumentFile())
                    .build()
    ),

    BIFE_GRELHADO_GRELHADO_DA_CASA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BIFE_GRELHADO_GRELHADO_DA_CASA.getProduct())
                    .doc(DocumentFileData.BIFE_GRELHADO_GRELHADO_DA_CASA_PHOTO.getDocumentFile())
                    .build()
    ),

    FRANGO_GRELHADO_GRELHADO_DA_CASA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FRANGO_GRELHADO_GRELHADO_DA_CASA.getProduct())
                    .doc(DocumentFileData.FRANGO_GRELHADO_GRELHADO_DA_CASA_PHOTO.getDocumentFile())
                    .build()
    ),

    COSTELETA_DE_PORCO_GRELHADO_DA_CASA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_GRELHADO_DA_CASA.getProduct())
                    .doc(DocumentFileData.COSTELETA_DE_PORCO_GRELHADO_DA_CASA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETO_MISTO_GRELHADO_DA_CASA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETO_MISTO_GRELHADO_DA_CASA.getProduct())
                    .doc(DocumentFileData.ESPETO_MISTO_GRELHADO_DA_CASA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPETO_DE_CAMARAO_GRELHADO_DA_CASA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_GRELHADO_DA_CASA.getProduct())
                    .doc(DocumentFileData.ESPETO_DE_CAMARAO_GRELHADO_DA_CASA_PHOTO.getDocumentFile())
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.ARROZ_DE_MARISCO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.CALULU_DE_CAMARAO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.CAMARAO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.POLVO_A_LAGAREIRO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DO_PORTO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_DO_PORTO.getProduct())
                    .doc(DocumentFileData.ARROZ_DE_MARISCO_MARISQUEIRA_DO_PORTO_PHOTO.getDocumentFile())
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DO_PORTO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_DO_PORTO.getProduct())
                    .doc(DocumentFileData.CALULU_DE_CAMARAO_MARISQUEIRA_DO_PORTO_PHOTO.getDocumentFile())
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_PORTO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_PORTO.getProduct())
                    .doc(DocumentFileData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_PORTO_PHOTO.getDocumentFile())
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DO_PORTO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_DO_PORTO.getProduct())
                    .doc(DocumentFileData.CAMARAO_GRELHADO_MARISQUEIRA_DO_PORTO_PHOTO.getDocumentFile())
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DO_PORTO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_DO_PORTO.getProduct())
                    .doc(DocumentFileData.POLVO_A_LAGAREIRO_MARISQUEIRA_DO_PORTO_PHOTO.getDocumentFile())
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_KILAMBA.getProduct())
                    .doc(DocumentFileData.ARROZ_DE_MARISCO_MARISQUEIRA_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_KILAMBA.getProduct())
                    .doc(DocumentFileData.CALULU_DE_CAMARAO_MARISQUEIRA_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_KILAMBA.getProduct())
                    .doc(DocumentFileData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_KILAMBA.getProduct())
                    .doc(DocumentFileData.CAMARAO_GRELHADO_MARISQUEIRA_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_KILAMBA.getProduct())
                    .doc(DocumentFileData.POLVO_A_LAGAREIRO_MARISQUEIRA_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DE_BENGUELA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .doc(DocumentFileData.ARROZ_DE_MARISCO_MARISQUEIRA_DE_BENGUELA_PHOTO.getDocumentFile())
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DE_BENGUELA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .doc(DocumentFileData.CALULU_DE_CAMARAO_MARISQUEIRA_DE_BENGUELA_PHOTO.getDocumentFile())
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DE_BENGUELA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .doc(DocumentFileData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DE_BENGUELA_PHOTO.getDocumentFile())
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DE_BENGUELA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .doc(DocumentFileData.CAMARAO_GRELHADO_MARISQUEIRA_DE_BENGUELA_PHOTO.getDocumentFile())
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DE_BENGUELA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .doc(DocumentFileData.POLVO_A_LAGAREIRO_MARISQUEIRA_DE_BENGUELA_PHOTO.getDocumentFile())
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DO_NAMIBE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .doc(DocumentFileData.ARROZ_DE_MARISCO_MARISQUEIRA_DO_NAMIBE_PHOTO.getDocumentFile())
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DO_NAMIBE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .doc(DocumentFileData.CALULU_DE_CAMARAO_MARISQUEIRA_DO_NAMIBE_PHOTO.getDocumentFile())
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_NAMIBE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .doc(DocumentFileData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_NAMIBE_PHOTO.getDocumentFile())
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DO_NAMIBE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .doc(DocumentFileData.CAMARAO_GRELHADO_MARISQUEIRA_DO_NAMIBE_PHOTO.getDocumentFile())
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DO_NAMIBE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .doc(DocumentFileData.POLVO_A_LAGAREIRO_MARISQUEIRA_DO_NAMIBE_PHOTO.getDocumentFile())
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_KIZUA.getProduct())
                    .doc(DocumentFileData.SASHIMI_DE_SALMAO_SUSHI_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_KIZUA.getProduct())
                    .doc(DocumentFileData.NIGIRI_MISTO_8_PECAS_SUSHI_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_KIZUA.getProduct())
                    .doc(DocumentFileData.TEMAKI_DE_SALMAO_SUSHI_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_KIZUA.getProduct())
                    .doc(DocumentFileData.HOT_ROLL_ESPECIAL_SUSHI_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_KIZUA.getProduct())
                    .doc(DocumentFileData.MENU_SUSHI_18_PECAS_SUSHI_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_BOM_DIA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_BOM_DIA.getProduct())
                    .doc(DocumentFileData.SASHIMI_DE_SALMAO_SUSHI_BOM_DIA_PHOTO.getDocumentFile())
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_BOM_DIA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_BOM_DIA.getProduct())
                    .doc(DocumentFileData.NIGIRI_MISTO_8_PECAS_SUSHI_BOM_DIA_PHOTO.getDocumentFile())
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_BOM_DIA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_BOM_DIA.getProduct())
                    .doc(DocumentFileData.TEMAKI_DE_SALMAO_SUSHI_BOM_DIA_PHOTO.getDocumentFile())
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_BOM_DIA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_BOM_DIA.getProduct())
                    .doc(DocumentFileData.HOT_ROLL_ESPECIAL_SUSHI_BOM_DIA_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_BOM_DIA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_BOM_DIA.getProduct())
                    .doc(DocumentFileData.MENU_SUSHI_18_PECAS_SUSHI_BOM_DIA_PHOTO.getDocumentFile())
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_TOKYO_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_TOKYO_LUANDA.getProduct())
                    .doc(DocumentFileData.SASHIMI_DE_SALMAO_SUSHI_TOKYO_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_TOKYO_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_TOKYO_LUANDA.getProduct())
                    .doc(DocumentFileData.NIGIRI_MISTO_8_PECAS_SUSHI_TOKYO_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_TOKYO_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_TOKYO_LUANDA.getProduct())
                    .doc(DocumentFileData.TEMAKI_DE_SALMAO_SUSHI_TOKYO_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_TOKYO_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_TOKYO_LUANDA.getProduct())
                    .doc(DocumentFileData.HOT_ROLL_ESPECIAL_SUSHI_TOKYO_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_TOKYO_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_TOKYO_LUANDA.getProduct())
                    .doc(DocumentFileData.MENU_SUSHI_18_PECAS_SUSHI_TOKYO_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_SAKURA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_SAKURA.getProduct())
                    .doc(DocumentFileData.SASHIMI_DE_SALMAO_SUSHI_SAKURA_PHOTO.getDocumentFile())
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_SAKURA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_SAKURA.getProduct())
                    .doc(DocumentFileData.NIGIRI_MISTO_8_PECAS_SUSHI_SAKURA_PHOTO.getDocumentFile())
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_SAKURA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_SAKURA.getProduct())
                    .doc(DocumentFileData.TEMAKI_DE_SALMAO_SUSHI_SAKURA_PHOTO.getDocumentFile())
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_SAKURA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_SAKURA.getProduct())
                    .doc(DocumentFileData.HOT_ROLL_ESPECIAL_SUSHI_SAKURA_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_SAKURA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_SAKURA.getProduct())
                    .doc(DocumentFileData.MENU_SUSHI_18_PECAS_SUSHI_SAKURA_PHOTO.getDocumentFile())
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_MANGA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_MANGA.getProduct())
                    .doc(DocumentFileData.SASHIMI_DE_SALMAO_SUSHI_MANGA_PHOTO.getDocumentFile())
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_MANGA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_MANGA.getProduct())
                    .doc(DocumentFileData.NIGIRI_MISTO_8_PECAS_SUSHI_MANGA_PHOTO.getDocumentFile())
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_MANGA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_MANGA.getProduct())
                    .doc(DocumentFileData.TEMAKI_DE_SALMAO_SUSHI_MANGA_PHOTO.getDocumentFile())
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_MANGA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_MANGA.getProduct())
                    .doc(DocumentFileData.HOT_ROLL_ESPECIAL_SUSHI_MANGA_PHOTO.getDocumentFile())
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_MANGA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_MANGA.getProduct())
                    .doc(DocumentFileData.MENU_SUSHI_18_PECAS_SUSHI_MANGA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPRESSO_CAFE_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPRESSO_CAFE_KWANZA.getProduct())
                    .doc(DocumentFileData.ESPRESSO_CAFE_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    CAPPUCCINO_CAFE_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAPPUCCINO_CAFE_KWANZA.getProduct())
                    .doc(DocumentFileData.CAPPUCCINO_CAFE_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    LATTE_CAFE_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.LATTE_CAFE_KWANZA.getProduct())
                    .doc(DocumentFileData.LATTE_CAFE_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_KWANZA.getProduct())
                    .doc(DocumentFileData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SANDES_DE_ATUM_CAFE_KWANZA.getProduct())
                    .doc(DocumentFileData.SANDES_DE_ATUM_CAFE_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPRESSO_CAFE_BOSSA_NOVA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPRESSO_CAFE_BOSSA_NOVA.getProduct())
                    .doc(DocumentFileData.ESPRESSO_CAFE_BOSSA_NOVA_PHOTO.getDocumentFile())
                    .build()
    ),

    CAPPUCCINO_CAFE_BOSSA_NOVA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAPPUCCINO_CAFE_BOSSA_NOVA.getProduct())
                    .doc(DocumentFileData.CAPPUCCINO_CAFE_BOSSA_NOVA_PHOTO.getDocumentFile())
                    .build()
    ),

    LATTE_CAFE_BOSSA_NOVA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.LATTE_CAFE_BOSSA_NOVA.getProduct())
                    .doc(DocumentFileData.LATTE_CAFE_BOSSA_NOVA_PHOTO.getDocumentFile())
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_BOSSA_NOVA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_BOSSA_NOVA.getProduct())
                    .doc(DocumentFileData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_BOSSA_NOVA_PHOTO.getDocumentFile())
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_BOSSA_NOVA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SANDES_DE_ATUM_CAFE_BOSSA_NOVA.getProduct())
                    .doc(DocumentFileData.SANDES_DE_ATUM_CAFE_BOSSA_NOVA_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPRESSO_CAFE_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPRESSO_CAFE_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.ESPRESSO_CAFE_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    CAPPUCCINO_CAFE_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAPPUCCINO_CAFE_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.CAPPUCCINO_CAFE_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    LATTE_CAFE_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.LATTE_CAFE_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.LATTE_CAFE_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SANDES_DE_ATUM_CAFE_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.SANDES_DE_ATUM_CAFE_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPRESSO_CAFE_PAO_QUENTE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPRESSO_CAFE_PAO_QUENTE.getProduct())
                    .doc(DocumentFileData.ESPRESSO_CAFE_PAO_QUENTE_PHOTO.getDocumentFile())
                    .build()
    ),

    CAPPUCCINO_CAFE_PAO_QUENTE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAPPUCCINO_CAFE_PAO_QUENTE.getProduct())
                    .doc(DocumentFileData.CAPPUCCINO_CAFE_PAO_QUENTE_PHOTO.getDocumentFile())
                    .build()
    ),

    LATTE_CAFE_PAO_QUENTE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.LATTE_CAFE_PAO_QUENTE.getProduct())
                    .doc(DocumentFileData.LATTE_CAFE_PAO_QUENTE_PHOTO.getDocumentFile())
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_PAO_QUENTE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_PAO_QUENTE.getProduct())
                    .doc(DocumentFileData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_PAO_QUENTE_PHOTO.getDocumentFile())
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_PAO_QUENTE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SANDES_DE_ATUM_CAFE_PAO_QUENTE.getProduct())
                    .doc(DocumentFileData.SANDES_DE_ATUM_CAFE_PAO_QUENTE_PHOTO.getDocumentFile())
                    .build()
    ),

    ESPRESSO_COFFEE_STOP_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESPRESSO_COFFEE_STOP_ANGOLA.getProduct())
                    .doc(DocumentFileData.ESPRESSO_COFFEE_STOP_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    CAPPUCCINO_COFFEE_STOP_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAPPUCCINO_COFFEE_STOP_ANGOLA.getProduct())
                    .doc(DocumentFileData.CAPPUCCINO_COFFEE_STOP_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    LATTE_COFFEE_STOP_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.LATTE_COFFEE_STOP_ANGOLA.getProduct())
                    .doc(DocumentFileData.LATTE_COFFEE_STOP_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_COFFEE_STOP_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_COFFEE_STOP_ANGOLA.getProduct())
                    .doc(DocumentFileData.FATIA_DE_BOLO_DE_CHOCOLATE_COFFEE_STOP_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    SANDES_DE_ATUM_COFFEE_STOP_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SANDES_DE_ATUM_COFFEE_STOP_ANGOLA.getProduct())
                    .doc(DocumentFileData.SANDES_DE_ATUM_COFFEE_STOP_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    CAIPIRINHA_BAR_222_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAIPIRINHA_BAR_222.getProduct())
                    .doc(DocumentFileData.CAIPIRINHA_BAR_222_PHOTO.getDocumentFile())
                    .build()
    ),

    GIN_TONICA_BAR_222_PHOTO(
            ProductFile.builder()
                    .product(ProductData.GIN_TONICA_BAR_222.getProduct())
                    .doc(DocumentFileData.GIN_TONICA_BAR_222_PHOTO.getDocumentFile())
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_222_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_BAR_222.getProduct())
                    .doc(DocumentFileData.CERVEJA_ARTESANAL_BAR_222_PHOTO.getDocumentFile())
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_222_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PETISCOS_DO_DIA_BAR_222.getProduct())
                    .doc(DocumentFileData.PETISCOS_DO_DIA_BAR_222_PHOTO.getDocumentFile())
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_222_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_BAR_222.getProduct())
                    .doc(DocumentFileData.TAPA_DE_CAMARAO_BAR_222_PHOTO.getDocumentFile())
                    .build()
    ),

    CAIPIRINHA_BAR_TROPICAL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAIPIRINHA_BAR_TROPICAL.getProduct())
                    .doc(DocumentFileData.CAIPIRINHA_BAR_TROPICAL_PHOTO.getDocumentFile())
                    .build()
    ),

    GIN_TONICA_BAR_TROPICAL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.GIN_TONICA_BAR_TROPICAL.getProduct())
                    .doc(DocumentFileData.GIN_TONICA_BAR_TROPICAL_PHOTO.getDocumentFile())
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_TROPICAL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_BAR_TROPICAL.getProduct())
                    .doc(DocumentFileData.CERVEJA_ARTESANAL_BAR_TROPICAL_PHOTO.getDocumentFile())
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_TROPICAL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PETISCOS_DO_DIA_BAR_TROPICAL.getProduct())
                    .doc(DocumentFileData.PETISCOS_DO_DIA_BAR_TROPICAL_PHOTO.getDocumentFile())
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_TROPICAL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_BAR_TROPICAL.getProduct())
                    .doc(DocumentFileData.TAPA_DE_CAMARAO_BAR_TROPICAL_PHOTO.getDocumentFile())
                    .build()
    ),

    CAIPIRINHA_BAR_DO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAIPIRINHA_BAR_DO_KIZUA.getProduct())
                    .doc(DocumentFileData.CAIPIRINHA_BAR_DO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    GIN_TONICA_BAR_DO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.GIN_TONICA_BAR_DO_KIZUA.getProduct())
                    .doc(DocumentFileData.GIN_TONICA_BAR_DO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_DO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_BAR_DO_KIZUA.getProduct())
                    .doc(DocumentFileData.CERVEJA_ARTESANAL_BAR_DO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_DO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PETISCOS_DO_DIA_BAR_DO_KIZUA.getProduct())
                    .doc(DocumentFileData.PETISCOS_DO_DIA_BAR_DO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_DO_KIZUA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_BAR_DO_KIZUA.getProduct())
                    .doc(DocumentFileData.TAPA_DE_CAMARAO_BAR_DO_KIZUA_PHOTO.getDocumentFile())
                    .build()
    ),

    CAIPIRINHA_PUB_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAIPIRINHA_PUB_KILAMBA.getProduct())
                    .doc(DocumentFileData.CAIPIRINHA_PUB_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    GIN_TONICA_PUB_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.GIN_TONICA_PUB_KILAMBA.getProduct())
                    .doc(DocumentFileData.GIN_TONICA_PUB_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    CERVEJA_ARTESANAL_PUB_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_PUB_KILAMBA.getProduct())
                    .doc(DocumentFileData.CERVEJA_ARTESANAL_PUB_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    PETISCOS_DO_DIA_PUB_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PETISCOS_DO_DIA_PUB_KILAMBA.getProduct())
                    .doc(DocumentFileData.PETISCOS_DO_DIA_PUB_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    TAPA_DE_CAMARAO_PUB_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_PUB_KILAMBA.getProduct())
                    .doc(DocumentFileData.TAPA_DE_CAMARAO_PUB_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    CAIPIRINHA_BAR_ESQUINA_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CAIPIRINHA_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.CAIPIRINHA_BAR_ESQUINA_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    GIN_TONICA_BAR_ESQUINA_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.GIN_TONICA_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.GIN_TONICA_BAR_ESQUINA_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_ESQUINA_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.CERVEJA_ARTESANAL_BAR_ESQUINA_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_ESQUINA_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PETISCOS_DO_DIA_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.PETISCOS_DO_DIA_BAR_ESQUINA_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_ESQUINA_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.TAPA_DE_CAMARAO_BAR_ESQUINA_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KWANZA.getProduct())
                    .doc(DocumentFileData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KWANZA.getProduct())
                    .doc(DocumentFileData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_KWANZA.getProduct())
                    .doc(DocumentFileData.SOPA_DO_DIA_SELF_SERVICE_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_KWANZA.getProduct())
                    .doc(DocumentFileData.SALADA_DO_BUFFET_SELF_SERVICE_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_KWANZA.getProduct())
                    .doc(DocumentFileData.SOBREMESA_DO_BUFFET_SELF_SERVICE_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_ZE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_ZE.getProduct())
                    .doc(DocumentFileData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_ZE_PHOTO.getDocumentFile())
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_ZE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_ZE.getProduct())
                    .doc(DocumentFileData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_ZE_PHOTO.getDocumentFile())
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_DO_ZE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_DO_ZE.getProduct())
                    .doc(DocumentFileData.SOPA_DO_DIA_SELF_SERVICE_DO_ZE_PHOTO.getDocumentFile())
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_DO_ZE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_DO_ZE.getProduct())
                    .doc(DocumentFileData.SALADA_DO_BUFFET_SELF_SERVICE_DO_ZE_PHOTO.getDocumentFile())
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_ZE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_ZE.getProduct())
                    .doc(DocumentFileData.SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_ZE_PHOTO.getDocumentFile())
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KILAMBA.getProduct())
                    .doc(DocumentFileData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KILAMBA.getProduct())
                    .doc(DocumentFileData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_KILAMBA.getProduct())
                    .doc(DocumentFileData.SOPA_DO_DIA_SELF_SERVICE_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_KILAMBA.getProduct())
                    .doc(DocumentFileData.SALADA_DO_BUFFET_SELF_SERVICE_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_KILAMBA.getProduct())
                    .doc(DocumentFileData.SOBREMESA_DO_BUFFET_SELF_SERVICE_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_CENTRAL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_CENTRAL.getProduct())
                    .doc(DocumentFileData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_CENTRAL_PHOTO.getDocumentFile())
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_CENTRAL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_CENTRAL.getProduct())
                    .doc(DocumentFileData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_CENTRAL_PHOTO.getDocumentFile())
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_CENTRAL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_CENTRAL.getProduct())
                    .doc(DocumentFileData.SOPA_DO_DIA_SELF_SERVICE_CENTRAL_PHOTO.getDocumentFile())
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_CENTRAL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_CENTRAL.getProduct())
                    .doc(DocumentFileData.SALADA_DO_BUFFET_SELF_SERVICE_CENTRAL_PHOTO.getDocumentFile())
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_CENTRAL_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_CENTRAL.getProduct())
                    .doc(DocumentFileData.SOBREMESA_DO_BUFFET_SELF_SERVICE_CENTRAL_PHOTO.getDocumentFile())
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.SOPA_DO_DIA_SELF_SERVICE_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.SALADA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    SALADA_DE_QUINOA_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SALADA_DE_QUINOA_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .doc(DocumentFileData.SALADA_DE_QUINOA_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO.getDocumentFile())
                    .build()
    ),

    TOFU_GRELHADO_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TOFU_GRELHADO_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .doc(DocumentFileData.TOFU_GRELHADO_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO.getDocumentFile())
                    .build()
    ),

    LEGUMES_ASSADOS_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.LEGUMES_ASSADOS_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .doc(DocumentFileData.LEGUMES_ASSADOS_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO.getDocumentFile())
                    .build()
    ),

    BOWL_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .doc(DocumentFileData.BOWL_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO.getDocumentFile())
                    .build()
    ),

    CURRY_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .doc(DocumentFileData.CURRY_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO.getDocumentFile())
                    .build()
    ),

    SALADA_DE_QUINOA_VEGGIE_HOUSE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SALADA_DE_QUINOA_VEGGIE_HOUSE_LUANDA.getProduct())
                    .doc(DocumentFileData.SALADA_DE_QUINOA_VEGGIE_HOUSE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    TOFU_GRELHADO_VEGGIE_HOUSE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TOFU_GRELHADO_VEGGIE_HOUSE_LUANDA.getProduct())
                    .doc(DocumentFileData.TOFU_GRELHADO_VEGGIE_HOUSE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    LEGUMES_ASSADOS_VEGGIE_HOUSE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.LEGUMES_ASSADOS_VEGGIE_HOUSE_LUANDA.getProduct())
                    .doc(DocumentFileData.LEGUMES_ASSADOS_VEGGIE_HOUSE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    BOWL_DE_LEGUMES_VEGGIE_HOUSE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_VEGGIE_HOUSE_LUANDA.getProduct())
                    .doc(DocumentFileData.BOWL_DE_LEGUMES_VEGGIE_HOUSE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    CURRY_DE_LEGUMES_VEGGIE_HOUSE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_VEGGIE_HOUSE_LUANDA.getProduct())
                    .doc(DocumentFileData.CURRY_DE_LEGUMES_VEGGIE_HOUSE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    SALADA_DE_QUINOA_COZINHA_VERDE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SALADA_DE_QUINOA_COZINHA_VERDE.getProduct())
                    .doc(DocumentFileData.SALADA_DE_QUINOA_COZINHA_VERDE_PHOTO.getDocumentFile())
                    .build()
    ),

    TOFU_GRELHADO_COZINHA_VERDE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TOFU_GRELHADO_COZINHA_VERDE.getProduct())
                    .doc(DocumentFileData.TOFU_GRELHADO_COZINHA_VERDE_PHOTO.getDocumentFile())
                    .build()
    ),

    LEGUMES_ASSADOS_COZINHA_VERDE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.LEGUMES_ASSADOS_COZINHA_VERDE.getProduct())
                    .doc(DocumentFileData.LEGUMES_ASSADOS_COZINHA_VERDE_PHOTO.getDocumentFile())
                    .build()
    ),

    BOWL_DE_LEGUMES_COZINHA_VERDE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_COZINHA_VERDE.getProduct())
                    .doc(DocumentFileData.BOWL_DE_LEGUMES_COZINHA_VERDE_PHOTO.getDocumentFile())
                    .build()
    ),

    CURRY_DE_LEGUMES_COZINHA_VERDE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_COZINHA_VERDE.getProduct())
                    .doc(DocumentFileData.CURRY_DE_LEGUMES_COZINHA_VERDE_PHOTO.getDocumentFile())
                    .build()
    ),

    SALADA_DE_QUINOA_BI_VEGETARIANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SALADA_DE_QUINOA_BI_VEGETARIANO.getProduct())
                    .doc(DocumentFileData.SALADA_DE_QUINOA_BI_VEGETARIANO_PHOTO.getDocumentFile())
                    .build()
    ),

    TOFU_GRELHADO_BI_VEGETARIANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TOFU_GRELHADO_BI_VEGETARIANO.getProduct())
                    .doc(DocumentFileData.TOFU_GRELHADO_BI_VEGETARIANO_PHOTO.getDocumentFile())
                    .build()
    ),

    LEGUMES_ASSADOS_BI_VEGETARIANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.LEGUMES_ASSADOS_BI_VEGETARIANO.getProduct())
                    .doc(DocumentFileData.LEGUMES_ASSADOS_BI_VEGETARIANO_PHOTO.getDocumentFile())
                    .build()
    ),

    BOWL_DE_LEGUMES_BI_VEGETARIANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_BI_VEGETARIANO.getProduct())
                    .doc(DocumentFileData.BOWL_DE_LEGUMES_BI_VEGETARIANO_PHOTO.getDocumentFile())
                    .build()
    ),

    CURRY_DE_LEGUMES_BI_VEGETARIANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_BI_VEGETARIANO.getProduct())
                    .doc(DocumentFileData.CURRY_DE_LEGUMES_BI_VEGETARIANO_PHOTO.getDocumentFile())
                    .build()
    ),

    SALADA_DE_QUINOA_SABOR_VEGETARIANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SALADA_DE_QUINOA_SABOR_VEGETARIANO.getProduct())
                    .doc(DocumentFileData.SALADA_DE_QUINOA_SABOR_VEGETARIANO_PHOTO.getDocumentFile())
                    .build()
    ),

    TOFU_GRELHADO_SABOR_VEGETARIANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TOFU_GRELHADO_SABOR_VEGETARIANO.getProduct())
                    .doc(DocumentFileData.TOFU_GRELHADO_SABOR_VEGETARIANO_PHOTO.getDocumentFile())
                    .build()
    ),

    LEGUMES_ASSADOS_SABOR_VEGETARIANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.LEGUMES_ASSADOS_SABOR_VEGETARIANO.getProduct())
                    .doc(DocumentFileData.LEGUMES_ASSADOS_SABOR_VEGETARIANO_PHOTO.getDocumentFile())
                    .build()
    ),

    BOWL_DE_LEGUMES_SABOR_VEGETARIANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_SABOR_VEGETARIANO.getProduct())
                    .doc(DocumentFileData.BOWL_DE_LEGUMES_SABOR_VEGETARIANO_PHOTO.getDocumentFile())
                    .build()
    ),

    CURRY_DE_LEGUMES_SABOR_VEGETARIANO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_SABOR_VEGETARIANO.getProduct())
                    .doc(DocumentFileData.CURRY_DE_LEGUMES_SABOR_VEGETARIANO_PHOTO.getDocumentFile())
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_PAO_QUENTE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PAO_DE_FORMA_PADARIA_PAO_QUENTE.getProduct())
                    .doc(DocumentFileData.PAO_DE_FORMA_PADARIA_PAO_QUENTE_PHOTO.getDocumentFile())
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_PAO_QUENTE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PADARIA_PAO_QUENTE.getProduct())
                    .doc(DocumentFileData.CROISSANT_DE_MANTEIGA_PADARIA_PAO_QUENTE_PHOTO.getDocumentFile())
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_PAO_QUENTE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PASTEL_DE_NATA_PADARIA_PAO_QUENTE.getProduct())
                    .doc(DocumentFileData.PASTEL_DE_NATA_PADARIA_PAO_QUENTE_PHOTO.getDocumentFile())
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_PAO_QUENTE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PADARIA_PAO_QUENTE.getProduct())
                    .doc(DocumentFileData.BOLO_DE_CHOCOLATE_PADARIA_PAO_QUENTE_PHOTO.getDocumentFile())
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_PAO_QUENTE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PADARIA_PAO_QUENTE.getProduct())
                    .doc(DocumentFileData.PAO_DOCE_TRADICIONAL_PADARIA_PAO_QUENTE_PHOTO.getDocumentFile())
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PAO_DE_FORMA_PADARIA_KWANZA.getProduct())
                    .doc(DocumentFileData.PAO_DE_FORMA_PADARIA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PADARIA_KWANZA.getProduct())
                    .doc(DocumentFileData.CROISSANT_DE_MANTEIGA_PADARIA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PASTEL_DE_NATA_PADARIA_KWANZA.getProduct())
                    .doc(DocumentFileData.PASTEL_DE_NATA_PADARIA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PADARIA_KWANZA.getProduct())
                    .doc(DocumentFileData.BOLO_DE_CHOCOLATE_PADARIA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PADARIA_KWANZA.getProduct())
                    .doc(DocumentFileData.PAO_DOCE_TRADICIONAL_PADARIA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    PAO_DE_FORMA_PASTELARIA_DOCE_MANJAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PAO_DE_FORMA_PASTELARIA_DOCE_MANJAR.getProduct())
                    .doc(DocumentFileData.PAO_DE_FORMA_PASTELARIA_DOCE_MANJAR_PHOTO.getDocumentFile())
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PASTELARIA_DOCE_MANJAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PASTELARIA_DOCE_MANJAR.getProduct())
                    .doc(DocumentFileData.CROISSANT_DE_MANTEIGA_PASTELARIA_DOCE_MANJAR_PHOTO.getDocumentFile())
                    .build()
    ),

    PASTEL_DE_NATA_PASTELARIA_DOCE_MANJAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PASTEL_DE_NATA_PASTELARIA_DOCE_MANJAR.getProduct())
                    .doc(DocumentFileData.PASTEL_DE_NATA_PASTELARIA_DOCE_MANJAR_PHOTO.getDocumentFile())
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PASTELARIA_DOCE_MANJAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PASTELARIA_DOCE_MANJAR.getProduct())
                    .doc(DocumentFileData.BOLO_DE_CHOCOLATE_PASTELARIA_DOCE_MANJAR_PHOTO.getDocumentFile())
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PASTELARIA_DOCE_MANJAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PASTELARIA_DOCE_MANJAR.getProduct())
                    .doc(DocumentFileData.PAO_DOCE_TRADICIONAL_PASTELARIA_DOCE_MANJAR_PHOTO.getDocumentFile())
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PAO_DE_FORMA_PADARIA_KILAMBA.getProduct())
                    .doc(DocumentFileData.PAO_DE_FORMA_PADARIA_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PADARIA_KILAMBA.getProduct())
                    .doc(DocumentFileData.CROISSANT_DE_MANTEIGA_PADARIA_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PASTEL_DE_NATA_PADARIA_KILAMBA.getProduct())
                    .doc(DocumentFileData.PASTEL_DE_NATA_PADARIA_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PADARIA_KILAMBA.getProduct())
                    .doc(DocumentFileData.BOLO_DE_CHOCOLATE_PADARIA_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_KILAMBA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PADARIA_KILAMBA.getProduct())
                    .doc(DocumentFileData.PAO_DOCE_TRADICIONAL_PADARIA_KILAMBA_PHOTO.getDocumentFile())
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_MANACA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PAO_DE_FORMA_PADARIA_MANACA.getProduct())
                    .doc(DocumentFileData.PAO_DE_FORMA_PADARIA_MANACA_PHOTO.getDocumentFile())
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_MANACA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PADARIA_MANACA.getProduct())
                    .doc(DocumentFileData.CROISSANT_DE_MANTEIGA_PADARIA_MANACA_PHOTO.getDocumentFile())
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_MANACA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PASTEL_DE_NATA_PADARIA_MANACA.getProduct())
                    .doc(DocumentFileData.PASTEL_DE_NATA_PADARIA_MANACA_PHOTO.getDocumentFile())
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_MANACA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PADARIA_MANACA.getProduct())
                    .doc(DocumentFileData.BOLO_DE_CHOCOLATE_PADARIA_MANACA_PHOTO.getDocumentFile())
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_MANACA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PADARIA_MANACA.getProduct())
                    .doc(DocumentFileData.PAO_DOCE_TRADICIONAL_PADARIA_MANACA_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LISBOA_LINHAS_AEREAS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_LINHAS_AEREAS_KWANZA.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LISBOA_LINHAS_AEREAS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_HUAMBO_LINHAS_AEREAS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_LINHAS_AEREAS_KWANZA.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_HUAMBO_LINHAS_AEREAS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LUBANGO_LINHAS_AEREAS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_LINHAS_AEREAS_KWANZA.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LUBANGO_LINHAS_AEREAS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_LINHAS_AEREAS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_LINHAS_AEREAS_KWANZA.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_SAO_PAULO_LINHAS_AEREAS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LONDRES_LINHAS_AEREAS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_LINHAS_AEREAS_KWANZA.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LONDRES_LINHAS_AEREAS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LISBOA_ANGOLA_EXPRESS_AIR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_ANGOLA_EXPRESS_AIR.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LISBOA_ANGOLA_EXPRESS_AIR_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_HUAMBO_ANGOLA_EXPRESS_AIR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_ANGOLA_EXPRESS_AIR.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_HUAMBO_ANGOLA_EXPRESS_AIR_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LUBANGO_ANGOLA_EXPRESS_AIR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_ANGOLA_EXPRESS_AIR.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LUBANGO_ANGOLA_EXPRESS_AIR_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_ANGOLA_EXPRESS_AIR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_ANGOLA_EXPRESS_AIR.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_SAO_PAULO_ANGOLA_EXPRESS_AIR_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LONDRES_ANGOLA_EXPRESS_AIR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_ANGOLA_EXPRESS_AIR.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LONDRES_ANGOLA_EXPRESS_AIR_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LISBOA_SKY_ANGOLA_AIRLINES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_SKY_ANGOLA_AIRLINES.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LISBOA_SKY_ANGOLA_AIRLINES_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_HUAMBO_SKY_ANGOLA_AIRLINES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_SKY_ANGOLA_AIRLINES.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_HUAMBO_SKY_ANGOLA_AIRLINES_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LUBANGO_SKY_ANGOLA_AIRLINES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_SKY_ANGOLA_AIRLINES.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LUBANGO_SKY_ANGOLA_AIRLINES_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_SKY_ANGOLA_AIRLINES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_SKY_ANGOLA_AIRLINES.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_SAO_PAULO_SKY_ANGOLA_AIRLINES_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LONDRES_SKY_ANGOLA_AIRLINES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_SKY_ANGOLA_AIRLINES.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LONDRES_SKY_ANGOLA_AIRLINES_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LISBOA_KUBINGA_AIR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_KUBINGA_AIR.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LISBOA_KUBINGA_AIR_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_HUAMBO_KUBINGA_AIR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_KUBINGA_AIR.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_HUAMBO_KUBINGA_AIR_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LUBANGO_KUBINGA_AIR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_KUBINGA_AIR.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LUBANGO_KUBINGA_AIR_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_KUBINGA_AIR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_KUBINGA_AIR.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_SAO_PAULO_KUBINGA_AIR_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LONDRES_KUBINGA_AIR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_KUBINGA_AIR.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LONDRES_KUBINGA_AIR_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LISBOA_ROYAL_WINGS_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_ROYAL_WINGS_ANGOLA.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LISBOA_ROYAL_WINGS_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_HUAMBO_ROYAL_WINGS_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_ROYAL_WINGS_ANGOLA.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_HUAMBO_ROYAL_WINGS_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LUBANGO_ROYAL_WINGS_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_ROYAL_WINGS_ANGOLA.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LUBANGO_ROYAL_WINGS_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_ROYAL_WINGS_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_ROYAL_WINGS_ANGOLA.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_SAO_PAULO_ROYAL_WINGS_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    VOO_LUANDA_LONDRES_ROYAL_WINGS_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_ROYAL_WINGS_ANGOLA.getProduct())
                    .doc(DocumentFileData.VOO_LUANDA_LONDRES_ROYAL_WINGS_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_AGENCIA_DE_VIAGENS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .doc(DocumentFileData.PACOTE_LUANDA_NAMIBE_AGENCIA_DE_VIAGENS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    SAFARIR_EM_BENGUELA_AGENCIA_DE_VIAGENS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .doc(DocumentFileData.SAFARIR_EM_BENGUELA_AGENCIA_DE_VIAGENS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_AGENCIA_DE_VIAGENS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .doc(DocumentFileData.ROTA_DA_SERRA_DA_LEBA_AGENCIA_DE_VIAGENS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    EXCURSAO_AS_ILHAS_AGENCIA_DE_VIAGENS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .doc(DocumentFileData.EXCURSAO_AS_ILHAS_AGENCIA_DE_VIAGENS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AGENCIA_DE_VIAGENS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .doc(DocumentFileData.CITY_TOUR_EM_LUANDA_AGENCIA_DE_VIAGENS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_AVENTURA_VIAGENS_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_AVENTURA_VIAGENS.getProduct())
                    .doc(DocumentFileData.PACOTE_LUANDA_NAMIBE_AVENTURA_VIAGENS_PHOTO.getDocumentFile())
                    .build()
    ),

    SAFARIR_EM_BENGUELA_AVENTURA_VIAGENS_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_AVENTURA_VIAGENS.getProduct())
                    .doc(DocumentFileData.SAFARIR_EM_BENGUELA_AVENTURA_VIAGENS_PHOTO.getDocumentFile())
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_AVENTURA_VIAGENS_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_AVENTURA_VIAGENS.getProduct())
                    .doc(DocumentFileData.ROTA_DA_SERRA_DA_LEBA_AVENTURA_VIAGENS_PHOTO.getDocumentFile())
                    .build()
    ),

    EXCURSAO_AS_ILHAS_AVENTURA_VIAGENS_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_AVENTURA_VIAGENS.getProduct())
                    .doc(DocumentFileData.EXCURSAO_AS_ILHAS_AVENTURA_VIAGENS_PHOTO.getDocumentFile())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AVENTURA_VIAGENS_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_AVENTURA_VIAGENS.getProduct())
                    .doc(DocumentFileData.CITY_TOUR_EM_LUANDA_AVENTURA_VIAGENS_PHOTO.getDocumentFile())
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_TRAVEL_HOUSE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_TRAVEL_HOUSE_LUANDA.getProduct())
                    .doc(DocumentFileData.PACOTE_LUANDA_NAMIBE_TRAVEL_HOUSE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    SAFARIR_EM_BENGUELA_TRAVEL_HOUSE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_TRAVEL_HOUSE_LUANDA.getProduct())
                    .doc(DocumentFileData.SAFARIR_EM_BENGUELA_TRAVEL_HOUSE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_TRAVEL_HOUSE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_TRAVEL_HOUSE_LUANDA.getProduct())
                    .doc(DocumentFileData.ROTA_DA_SERRA_DA_LEBA_TRAVEL_HOUSE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    EXCURSAO_AS_ILHAS_TRAVEL_HOUSE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_TRAVEL_HOUSE_LUANDA.getProduct())
                    .doc(DocumentFileData.EXCURSAO_AS_ILHAS_TRAVEL_HOUSE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_TRAVEL_HOUSE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_TRAVEL_HOUSE_LUANDA.getProduct())
                    .doc(DocumentFileData.CITY_TOUR_EM_LUANDA_TRAVEL_HOUSE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_GLOBETROTTER_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_GLOBETROTTER_ANGOLA.getProduct())
                    .doc(DocumentFileData.PACOTE_LUANDA_NAMIBE_GLOBETROTTER_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    SAFARIR_EM_BENGUELA_GLOBETROTTER_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_GLOBETROTTER_ANGOLA.getProduct())
                    .doc(DocumentFileData.SAFARIR_EM_BENGUELA_GLOBETROTTER_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_GLOBETROTTER_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_GLOBETROTTER_ANGOLA.getProduct())
                    .doc(DocumentFileData.ROTA_DA_SERRA_DA_LEBA_GLOBETROTTER_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    EXCURSAO_AS_ILHAS_GLOBETROTTER_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_GLOBETROTTER_ANGOLA.getProduct())
                    .doc(DocumentFileData.EXCURSAO_AS_ILHAS_GLOBETROTTER_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_GLOBETROTTER_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_GLOBETROTTER_ANGOLA.getProduct())
                    .doc(DocumentFileData.CITY_TOUR_EM_LUANDA_GLOBETROTTER_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_SAFARIR_VIAGENS_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_SAFARIR_VIAGENS.getProduct())
                    .doc(DocumentFileData.PACOTE_LUANDA_NAMIBE_SAFARIR_VIAGENS_PHOTO.getDocumentFile())
                    .build()
    ),

    SAFARIR_EM_BENGUELA_SAFARIR_VIAGENS_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_SAFARIR_VIAGENS.getProduct())
                    .doc(DocumentFileData.SAFARIR_EM_BENGUELA_SAFARIR_VIAGENS_PHOTO.getDocumentFile())
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_SAFARIR_VIAGENS_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_SAFARIR_VIAGENS.getProduct())
                    .doc(DocumentFileData.ROTA_DA_SERRA_DA_LEBA_SAFARIR_VIAGENS_PHOTO.getDocumentFile())
                    .build()
    ),

    EXCURSAO_AS_ILHAS_SAFARIR_VIAGENS_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_SAFARIR_VIAGENS.getProduct())
                    .doc(DocumentFileData.EXCURSAO_AS_ILHAS_SAFARIR_VIAGENS_PHOTO.getDocumentFile())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_SAFARIR_VIAGENS_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_SAFARIR_VIAGENS.getProduct())
                    .doc(DocumentFileData.CITY_TOUR_EM_LUANDA_SAFARIR_VIAGENS_PHOTO.getDocumentFile())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_OPERADORA_TURISTICA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .doc(DocumentFileData.CITY_TOUR_EM_LUANDA_OPERADORA_TURISTICA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_OPERADORA_TURISTICA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .doc(DocumentFileData.VISITA_A_SERRA_DA_LEBA_OPERADORA_TURISTICA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_OPERADORA_TURISTICA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .doc(DocumentFileData.EXPEDICAO_A_FOZ_DO_KWANZA_OPERADORA_TURISTICA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_OPERADORA_TURISTICA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .doc(DocumentFileData.TOUR_GASTRONOMICO_NO_MIRAMAR_OPERADORA_TURISTICA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    PASSEIO_PELA_FALESIA_OPERADORA_TURISTICA_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .doc(DocumentFileData.PASSEIO_PELA_FALESIA_OPERADORA_TURISTICA_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AVENTURA_GUIDES_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .doc(DocumentFileData.CITY_TOUR_EM_LUANDA_AVENTURA_GUIDES_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_AVENTURA_GUIDES_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .doc(DocumentFileData.VISITA_A_SERRA_DA_LEBA_AVENTURA_GUIDES_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_AVENTURA_GUIDES_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .doc(DocumentFileData.EXPEDICAO_A_FOZ_DO_KWANZA_AVENTURA_GUIDES_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_AVENTURA_GUIDES_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .doc(DocumentFileData.TOUR_GASTRONOMICO_NO_MIRAMAR_AVENTURA_GUIDES_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    PASSEIO_PELA_FALESIA_AVENTURA_GUIDES_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .doc(DocumentFileData.PASSEIO_PELA_FALESIA_AVENTURA_GUIDES_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_TURISTAS_LUANDA_GUIDES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_TURISTAS_LUANDA_GUIDES.getProduct())
                    .doc(DocumentFileData.CITY_TOUR_EM_LUANDA_TURISTAS_LUANDA_GUIDES_PHOTO.getDocumentFile())
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_TURISTAS_LUANDA_GUIDES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_TURISTAS_LUANDA_GUIDES.getProduct())
                    .doc(DocumentFileData.VISITA_A_SERRA_DA_LEBA_TURISTAS_LUANDA_GUIDES_PHOTO.getDocumentFile())
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_TURISTAS_LUANDA_GUIDES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_TURISTAS_LUANDA_GUIDES.getProduct())
                    .doc(DocumentFileData.EXPEDICAO_A_FOZ_DO_KWANZA_TURISTAS_LUANDA_GUIDES_PHOTO.getDocumentFile())
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_TURISTAS_LUANDA_GUIDES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_TURISTAS_LUANDA_GUIDES.getProduct())
                    .doc(DocumentFileData.TOUR_GASTRONOMICO_NO_MIRAMAR_TURISTAS_LUANDA_GUIDES_PHOTO.getDocumentFile())
                    .build()
    ),

    PASSEIO_PELA_FALESIA_TURISTAS_LUANDA_GUIDES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_TURISTAS_LUANDA_GUIDES.getProduct())
                    .doc(DocumentFileData.PASSEIO_PELA_FALESIA_TURISTAS_LUANDA_GUIDES_PHOTO.getDocumentFile())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_EXPEDICOES_KALANDULA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_EXPEDICOES_KALANDULA.getProduct())
                    .doc(DocumentFileData.CITY_TOUR_EM_LUANDA_EXPEDICOES_KALANDULA_PHOTO.getDocumentFile())
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_EXPEDICOES_KALANDULA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_EXPEDICOES_KALANDULA.getProduct())
                    .doc(DocumentFileData.VISITA_A_SERRA_DA_LEBA_EXPEDICOES_KALANDULA_PHOTO.getDocumentFile())
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_EXPEDICOES_KALANDULA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_EXPEDICOES_KALANDULA.getProduct())
                    .doc(DocumentFileData.EXPEDICAO_A_FOZ_DO_KWANZA_EXPEDICOES_KALANDULA_PHOTO.getDocumentFile())
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_EXPEDICOES_KALANDULA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_EXPEDICOES_KALANDULA.getProduct())
                    .doc(DocumentFileData.TOUR_GASTRONOMICO_NO_MIRAMAR_EXPEDICOES_KALANDULA_PHOTO.getDocumentFile())
                    .build()
    ),

    PASSEIO_PELA_FALESIA_EXPEDICOES_KALANDULA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_EXPEDICOES_KALANDULA.getProduct())
                    .doc(DocumentFileData.PASSEIO_PELA_FALESIA_EXPEDICOES_KALANDULA_PHOTO.getDocumentFile())
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_GUIA_TOURS_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_GUIA_TOURS_MIRAMAR.getProduct())
                    .doc(DocumentFileData.CITY_TOUR_EM_LUANDA_GUIA_TOURS_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_GUIA_TOURS_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_GUIA_TOURS_MIRAMAR.getProduct())
                    .doc(DocumentFileData.VISITA_A_SERRA_DA_LEBA_GUIA_TOURS_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_GUIA_TOURS_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_GUIA_TOURS_MIRAMAR.getProduct())
                    .doc(DocumentFileData.EXPEDICAO_A_FOZ_DO_KWANZA_GUIA_TOURS_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_GUIA_TOURS_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_GUIA_TOURS_MIRAMAR.getProduct())
                    .doc(DocumentFileData.TOUR_GASTRONOMICO_NO_MIRAMAR_GUIA_TOURS_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    PASSEIO_PELA_FALESIA_GUIA_TOURS_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_GUIA_TOURS_MIRAMAR.getProduct())
                    .doc(DocumentFileData.PASSEIO_PELA_FALESIA_GUIA_TOURS_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_INTERPRETES_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_INTERPRETES_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_ESPANHOL_INTERPRETES_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_FRANCES_INTERPRETES_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_INTERPRETES_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_FRANCES_INTERPRETES_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_INGLES_INTERPRETES_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_INTERPRETES_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_INGLES_INTERPRETES_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    GUIA_DE_CONFERENCIA_INTERPRETES_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_INTERPRETES_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.GUIA_DE_CONFERENCIA_INTERPRETES_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_INTERPRETES_DE_LUANDA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_INTERPRETES_DE_LUANDA.getProduct())
                    .doc(DocumentFileData.TRADUCAO_DE_DOCUMENTOS_INTERPRETES_DE_LUANDA_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_GLOBAL_VOICES_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_GLOBAL_VOICES_ANGOLA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_ESPANHOL_GLOBAL_VOICES_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_FRANCES_GLOBAL_VOICES_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_GLOBAL_VOICES_ANGOLA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_FRANCES_GLOBAL_VOICES_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_INGLES_GLOBAL_VOICES_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_GLOBAL_VOICES_ANGOLA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_INGLES_GLOBAL_VOICES_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    GUIA_DE_CONFERENCIA_GLOBAL_VOICES_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_GLOBAL_VOICES_ANGOLA.getProduct())
                    .doc(DocumentFileData.GUIA_DE_CONFERENCIA_GLOBAL_VOICES_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_GLOBAL_VOICES_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_GLOBAL_VOICES_ANGOLA.getProduct())
                    .doc(DocumentFileData.TRADUCAO_DE_DOCUMENTOS_GLOBAL_VOICES_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_ESPANHOL_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_FRANCES_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_FRANCES_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_INGLES_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_INGLES_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO.getDocumentFile())
                    .build()
    ),

    GUIA_DE_CONFERENCIA_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .doc(DocumentFileData.GUIA_DE_CONFERENCIA_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO.getDocumentFile())
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .doc(DocumentFileData.TRADUCAO_DE_DOCUMENTOS_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_INTERPRETE_PRO_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_INTERPRETE_PRO_ANGOLA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_ESPANHOL_INTERPRETE_PRO_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_FRANCES_INTERPRETE_PRO_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_INTERPRETE_PRO_ANGOLA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_FRANCES_INTERPRETE_PRO_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_INGLES_INTERPRETE_PRO_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_INTERPRETE_PRO_ANGOLA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_INGLES_INTERPRETE_PRO_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    GUIA_DE_CONFERENCIA_INTERPRETE_PRO_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_INTERPRETE_PRO_ANGOLA.getProduct())
                    .doc(DocumentFileData.GUIA_DE_CONFERENCIA_INTERPRETE_PRO_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_INTERPRETE_PRO_ANGOLA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_INTERPRETE_PRO_ANGOLA.getProduct())
                    .doc(DocumentFileData.TRADUCAO_DE_DOCUMENTOS_INTERPRETE_PRO_ANGOLA_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_IDIOMAS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_IDIOMAS_KWANZA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_ESPANHOL_IDIOMAS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_FRANCES_IDIOMAS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_IDIOMAS_KWANZA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_FRANCES_IDIOMAS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    INTERPRETE_DE_INGLES_IDIOMAS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_IDIOMAS_KWANZA.getProduct())
                    .doc(DocumentFileData.INTERPRETE_DE_INGLES_IDIOMAS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    GUIA_DE_CONFERENCIA_IDIOMAS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_IDIOMAS_KWANZA.getProduct())
                    .doc(DocumentFileData.GUIA_DE_CONFERENCIA_IDIOMAS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_IDIOMAS_KWANZA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_IDIOMAS_KWANZA.getProduct())
                    .doc(DocumentFileData.TRADUCAO_DE_DOCUMENTOS_IDIOMAS_KWANZA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_TWIN_DELUXE_EPICSANA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_TWIN_DELUXE_EPICSANA.getProduct())
                    .doc(DocumentFileData.QUARTO_TWIN_DELUXE_EPICSANA_PHOTO.getDocumentFile())
                    .build()
    ),

    APARTAMENTO_FAMILIAR_EPICSANA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.APARTAMENTO_FAMILIAR_EPICSANA.getProduct())
                    .doc(DocumentFileData.APARTAMENTO_FAMILIAR_EPICSANA_PHOTO.getDocumentFile())
                    .build()
    ),

    PACOTE_DUAS_NOITES_EPICSANA_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PACOTE_DUAS_NOITES_EPICSANA.getProduct())
                    .doc(DocumentFileData.PACOTE_DUAS_NOITES_EPICSANA_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_INDIVIDUAL_EXECUTIVO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_INDIVIDUAL_EXECUTIVO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.QUARTO_INDIVIDUAL_EXECUTIVO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_FAMILIAR_COM_VARANDA_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_FAMILIAR_COM_VARANDA_MIRAMAR.getProduct())
                    .doc(DocumentFileData.QUARTO_FAMILIAR_COM_VARANDA_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    SUITE_MIRAMAR_COM_VISTA_PARA_O_MAR_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SUITE_MIRAMAR_COM_VISTA_PARA_O_MAR_MIRAMAR.getProduct())
                    .doc(DocumentFileData.SUITE_MIRAMAR_COM_VISTA_PARA_O_MAR_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    ESTADIA_MENSAL_COM_DESCONTO_MIRAMAR_PHOTO(
            ProductFile.builder()
                    .product(ProductData.ESTADIA_MENSAL_COM_DESCONTO_MIRAMAR.getProduct())
                    .doc(DocumentFileData.ESTADIA_MENSAL_COM_DESCONTO_MIRAMAR_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_INDIVIDUAL_SIMPLES_HUAMBO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_INDIVIDUAL_SIMPLES_HUAMBO.getProduct())
                    .doc(DocumentFileData.QUARTO_INDIVIDUAL_SIMPLES_HUAMBO_PHOTO.getDocumentFile())
                    .build()
    ),

    QUARTO_CASAL_COM_BANHEIRA_HUAMBO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.QUARTO_CASAL_COM_BANHEIRA_HUAMBO.getProduct())
                    .doc(DocumentFileData.QUARTO_CASAL_COM_BANHEIRA_HUAMBO_PHOTO.getDocumentFile())
                    .build()
    ),

    PENSAO_COMPLETA_POR_DIA_HUAMBO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.PENSAO_COMPLETA_POR_DIA_HUAMBO.getProduct())
                    .doc(DocumentFileData.PENSAO_COMPLETA_POR_DIA_HUAMBO_PHOTO.getDocumentFile())
                    .build()
    ),

    SALA_DE_CONFERENCIAS_POR_HORA_HUAMBO_PHOTO(
            ProductFile.builder()
                    .product(ProductData.SALA_DE_CONFERENCIAS_POR_HORA_HUAMBO.getProduct())
                    .doc(DocumentFileData.SALA_DE_CONFERENCIAS_POR_HORA_HUAMBO_PHOTO.getDocumentFile())
                    .build()
    );

    private final ProductFile productFile;
}
