package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.address.model.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum AddressData {
    ADDRESS_1(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua da Missão, 45, Ingombota, Luanda")
                    .build()
    ),
    ADDRESS_2(
            Address.builder()
                    .latitude(new BigDecimal("-8.8410"))
                    .longitude(new BigDecimal("13.2343"))
                    .state("Luanda")
                    .municipality("Miramar")
                    .address("Bairro do Miramar, Av. 4 de Fevereiro, Luanda")
                    .build()
    ),
    ADDRESS_3(
            Address.builder()
                    .latitude(new BigDecimal("-12.7500"))
                    .longitude(new BigDecimal("15.7333"))
                    .state("Huambo")
                    .municipality("Centro")
                    .address("Avenida da Independência, 123, Centro, Huambo")
                    .build()
    ),
    ADDRESS_4(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua dos Enganos, 78, Maianga, Luanda")
                    .build()
    ),
    ADDRESS_5(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 200, Samba, Luanda")
                    .build()
    ),
    ADDRESS_6(
            Address.builder()
                    .latitude(new BigDecimal("-12.7450"))
                    .longitude(new BigDecimal("15.7400"))
                    .state("Huambo")
                    .municipality("Catalã")
                    .address("Rua do Catalã, 56, Catalã, Huambo")
                    .build()
    ),
    ADDRESS_7(
            Address.builder()
                    .latitude(new BigDecimal("-8.8200"))
                    .longitude(new BigDecimal("13.2600"))
                    .state("Luanda")
                    .municipality("Viana")
                    .address("Estrada de Viana, km 15, Viana, Luanda")
                    .build()
    ),
    ADDRESS_8(
            Address.builder()
                    .latitude(new BigDecimal("-12.7600"))
                    .longitude(new BigDecimal("15.7200"))
                    .state("Huambo")
                    .municipality("Santo António")
                    .address("Rua de Santo António, 90, Santo António, Huambo")
                    .build()
    ),

    ADDRESS_9(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua da Baía, 12, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_10(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida Deolinda Rodrigues, 480, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_11(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua Rainha Ginga, 210, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_12(
            Address.builder()
                    .latitude(new BigDecimal("-8.8200"))
                    .longitude(new BigDecimal("13.2600"))
                    .state("Luanda")
                    .municipality("Viana")
                    .address("Estrada de Viana, km 12, Viana, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8200&mlon=13.2600#map=17/-8.8200/13.2600")
                    .build()
    ),

    ADDRESS_13(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.1800"))
                    .state("Luanda")
                    .municipality("Kilamba Kiaxi")
                    .address("Rua das Cascatas, 7, Kilamba Kiaxi, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.1800#map=17/-8.9200/13.1800")
                    .build()
    ),

    ADDRESS_14(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Avenida 4 de Fevereiro, 1180, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_15(
            Address.builder()
                    .latitude(new BigDecimal("-8.8700"))
                    .longitude(new BigDecimal("13.3300"))
                    .state("Luanda")
                    .municipality("Cacuaco")
                    .address("Rua dos Pescadores, 34, Cacuaco, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8700&mlon=13.3300#map=17/-8.8700/13.3300")
                    .build()
    ),

    ADDRESS_16(
            Address.builder()
                    .latitude(new BigDecimal("-8.8700"))
                    .longitude(new BigDecimal("13.2500"))
                    .state("Luanda")
                    .municipality("Benfica")
                    .address("Rua do Bonsucesso, 88, Benfica, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8700&mlon=13.2500#map=17/-8.8700/13.2500")
                    .build()
    ),

    ADDRESS_17(
            Address.builder()
                    .latitude(new BigDecimal("-8.8800"))
                    .longitude(new BigDecimal("13.2800"))
                    .state("Luanda")
                    .municipality("Cazenga")
                    .address("Rua Kizua, 21, Cazenga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8800&mlon=13.2800#map=17/-8.8800/13.2800")
                    .build()
    ),

    ADDRESS_18(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 145, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_19(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Avenida Alexandre Herculano, 45, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_20(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua dos Enganos, 130, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_21(
            Address.builder()
                    .latitude(new BigDecimal("-8.8200"))
                    .longitude(new BigDecimal("13.2600"))
                    .state("Luanda")
                    .municipality("Viana")
                    .address("Estrada de Viana, km 18, Viana, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8200&mlon=13.2600#map=17/-8.8200/13.2600")
                    .build()
    ),

    ADDRESS_22(
            Address.builder()
                    .latitude(new BigDecimal("-8.8667"))
                    .longitude(new BigDecimal("13.6333"))
                    .state("Bengo")
                    .municipality("Caxito")
                    .address("Rua da Independência, 90, Caxito, Bengo")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8667&mlon=13.6333#map=17/-8.8667/13.6333")
                    .build()
    ),

    ADDRESS_23(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida 4 de Fevereiro, 2205, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_24(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua Amílcar Cabral, 76, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_25(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 210, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_26(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Avenida de Angola, 320, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_27(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Rua Amílcar Cabral, 410, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_28(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida 4 de Fevereiro, 1890, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_29(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 320, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_30(
            Address.builder()
                    .latitude(new BigDecimal("-8.8200"))
                    .longitude(new BigDecimal("13.2600"))
                    .state("Luanda")
                    .municipality("Viana")
                    .address("Estrada de Viana, km 9, Viana, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8200&mlon=13.2600#map=17/-8.8200/13.2600")
                    .build()
    ),

    ADDRESS_31(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Rua Sassouco, 15, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_32(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.1800"))
                    .state("Luanda")
                    .municipality("Kilamba Kiaxi")
                    .address("Avenida Kilamba, 25, Kilamba Kiaxi, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.1800#map=17/-8.9200/13.1800")
                    .build()
    ),

    ADDRESS_33(
            Address.builder()
                    .latitude(new BigDecimal("-8.8700"))
                    .longitude(new BigDecimal("13.3300"))
                    .state("Luanda")
                    .municipality("Cacuaco")
                    .address("Rua dos Pescadores, 88, Cacuaco, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8700&mlon=13.3300#map=17/-8.8700/13.3300")
                    .build()
    ),

    ADDRESS_34(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua Amílcar Cabral, 210, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_35(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 55, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_36(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua Rainha Ginga, 88, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_37(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida 4 de Fevereiro, 2750, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_38(
            Address.builder()
                    .latitude(new BigDecimal("-8.8700"))
                    .longitude(new BigDecimal("13.2500"))
                    .state("Luanda")
                    .municipality("Benfica")
                    .address("Rua do Bonsucesso, 140, Benfica, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8700&mlon=13.2500#map=17/-8.8700/13.2500")
                    .build()
    ),

    ADDRESS_39(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Avenida 4 de Fevereiro, 1320, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_40(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 88, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_41(
            Address.builder()
                    .latitude(new BigDecimal("-8.8200"))
                    .longitude(new BigDecimal("13.2600"))
                    .state("Luanda")
                    .municipality("Viana")
                    .address("Estrada de Viana, km 14, Viana, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8200&mlon=13.2600#map=17/-8.8200/13.2600")
                    .build()
    ),

    ADDRESS_42(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Avenida 4 de Fevereiro, 620, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_43(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.1800"))
                    .state("Luanda")
                    .municipality("Kilamba Kiaxi")
                    .address("Avenida dos Presidentes, 30, Kilamba Kiaxi, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.1800#map=17/-8.9200/13.1800")
                    .build()
    ),

    ADDRESS_44(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 175, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_45(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua Kizua, 55, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_46(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Avenida 4 de Fevereiro, 1420, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_47(
            Address.builder()
                    .latitude(new BigDecimal("-8.8200"))
                    .longitude(new BigDecimal("13.2600"))
                    .state("Luanda")
                    .municipality("Viana")
                    .address("Estrada de Viana, km 16, Viana, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8200&mlon=13.2600#map=17/-8.8200/13.2600")
                    .build()
    ),

    ADDRESS_48(
            Address.builder()
                    .latitude(new BigDecimal("-8.8700"))
                    .longitude(new BigDecimal("13.2500"))
                    .state("Luanda")
                    .municipality("Benfica")
                    .address("Rua do Bonsucesso, 60, Benfica, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8700&mlon=13.2500#map=17/-8.8700/13.2500")
                    .build()
    ),

    ADDRESS_49(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua Alexandre Herculano, 15, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_50(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 5, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_51(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida dos Presidentes, 60, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_52(
            Address.builder()
                    .latitude(new BigDecimal("-12.5783"))
                    .longitude(new BigDecimal("13.9433"))
                    .state("Benguela")
                    .municipality("Benguela")
                    .address("Rua 4 de Janeiro, 45, Benguela, Benguela")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-12.5783&mlon=13.9433#map=17/-12.5783/13.9433")
                    .build()
    ),

    ADDRESS_53(
            Address.builder()
                    .latitude(new BigDecimal("-15.1961"))
                    .longitude(new BigDecimal("12.1528"))
                    .state("Namibe")
                    .municipality("Mocamedes")
                    .address("Avenida 4 de Fevereiro, 30, Mocamedes, Namibe")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-15.1961&mlon=12.1528#map=17/-15.1961/12.1528")
                    .build()
    ),

    ADDRESS_54(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua Kizua, 12, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_55(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 62, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_56(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua Amílcar Cabral, 340, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_57(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida Deolinda Rodrigues, 210, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_58(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Rua Sassouco, 90, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_59(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua Rainha Ginga, 25, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_60(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 30, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_61(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Avenida 4 de Fevereiro, 40, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_62(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Avenida 4 de Fevereiro, 1500, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_63(
            Address.builder()
                    .latitude(new BigDecimal("-8.8200"))
                    .longitude(new BigDecimal("13.2600"))
                    .state("Luanda")
                    .municipality("Viana")
                    .address("Estrada de Viana, km 11, Viana, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8200&mlon=13.2600#map=17/-8.8200/13.2600")
                    .build()
    ),

    ADDRESS_64(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua Amílcar Cabral, 222, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_65(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 122, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_66(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua Kizua, 30, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_67(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida dos Presidentes, 12, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_68(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Avenida 4 de Fevereiro, 1600, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_69(
            Address.builder()
                    .latitude(new BigDecimal("-8.8200"))
                    .longitude(new BigDecimal("13.2600"))
                    .state("Luanda")
                    .municipality("Viana")
                    .address("Estrada de Viana, km 10, Viana, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8200&mlon=13.2600#map=17/-8.8200/13.2600")
                    .build()
    ),

    ADDRESS_70(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 100, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_71(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida Deolinda Rodrigues, 30, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_72(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua da Missão, 20, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_73(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Avenida 4 de Fevereiro, 55, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_74(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua Alexandre Herculano, 70, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_75(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua Rainha Ginga, 300, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_76(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 260, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_77(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida 4 de Fevereiro, 3050, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_78(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Avenida 4 de Fevereiro, 1700, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_79(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 18, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_80(
            Address.builder()
                    .latitude(new BigDecimal("-8.8200"))
                    .longitude(new BigDecimal("13.2600"))
                    .state("Luanda")
                    .municipality("Viana")
                    .address("Estrada de Viana, km 8, Viana, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8200&mlon=13.2600#map=17/-8.8200/13.2600")
                    .build()
    ),

    ADDRESS_81(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua da Missão, 12, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_82(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida dos Presidentes, 8, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_83(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Avenida 4 de Fevereiro, 1850, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_84(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Avenida 4 de Fevereiro, 1550, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_85(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Avenida 4 de Fevereiro, 1456, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_86(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida dos Presidentes, 45, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_87(
            Address.builder()
                    .latitude(new BigDecimal("-8.8200"))
                    .longitude(new BigDecimal("13.2600"))
                    .state("Luanda")
                    .municipality("Viana")
                    .address("Estrada de Viana, km 20, Viana, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8200&mlon=13.2600#map=17/-8.8200/13.2600")
                    .build()
    ),

    ADDRESS_88(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua Rainha Ginga, 45, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_89(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua da Missão, 30, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_90(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 190, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_91(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Avenida de Angola, 145, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_92(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida Deolinda Rodrigues, 55, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_93(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Avenida 4 de Fevereiro, 1900, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_94(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Avenida 4 de Fevereiro, 1100, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_95(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 205, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_96(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua Rainha Ginga, 200, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_97(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida Deolinda Rodrigues, 120, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_98(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Avenida 4 de Fevereiro, 70, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    ),

    ADDRESS_99(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua Amílcar Cabral, 500, Ingombota, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8399&mlon=13.2894#map=17/-8.8399/13.2894")
                    .build()
    ),

    ADDRESS_100(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 215, Samba, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8500&mlon=13.2400#map=17/-8.8500/13.2400")
                    .build()
    ),

    ADDRESS_101(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Avenida de Angola, 210, Maianga, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8350&mlon=13.2700#map=17/-8.8350/13.2700")
                    .build()
    ),

    ADDRESS_102(
            Address.builder()
                    .latitude(new BigDecimal("-8.9200"))
                    .longitude(new BigDecimal("13.2000"))
                    .state("Luanda")
                    .municipality("Talatona")
                    .address("Avenida Deolinda Rodrigues, 400, Talatona, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.9200&mlon=13.2000#map=17/-8.9200/13.2000")
                    .build()
    ),

    ADDRESS_103(
            Address.builder()
                    .latitude(new BigDecimal("-8.8100"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Rangel")
                    .address("Rua Sassouco, 25, Rangel, Luanda")
                    .mapUrl("https://www.openstreetmap.org/?mlat=-8.8100&mlon=13.2400#map=17/-8.8100/13.2400")
                    .build()
    );

    private final Address address;
}
