package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.product.enums.ProductPromotionStatus;
import com.negocil.negoturismo.admin.feature.product.model.ProductPromotion;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public enum ProductPromotionData {
    ROOM_SINGLE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SINGLE.getProduct())
                    .description("Oferta especial: 20% de desconto no quarto deluxe com pequeno-almoço incluído.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(150.00)
                    .newPrice(120.00)
                    .build()
    ),
    ROOM_DOUBLE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MIRAMAR_ROOM_DOUBLE.getProduct())
                    .description("Promoção de verão: reserve por 3 noites e ganhe 1 noite grátis.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(200.00)
                    .newPrice(160.00)
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_BAIA_DE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .description("Desconto de 10% na reserva de Quarto Single Deluxe - Hotel Baía de Luanda com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(68750.00)
                    .newPrice(55000.00)
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_BAIA_DE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SUITE_FAMILIAR_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .description("Desconto de 20% na reserva de Suite Familiar - Hotel Baía de Luanda com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(181250.00)
                    .newPrice(145000.00)
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_BAIA_DE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_HOTEL_BAIA_DE_LUANDA.getProduct())
                    .description("Desconto de 10% na reserva de Apartamento T1 Executivo - Hotel Baía de Luanda com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(150000.00)
                    .newPrice(120000.00)
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_MILANO_RESORT_SPA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .description("Desconto de 20% na reserva de Quarto Casal Premium - Hotel Milano Resort & Spa com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(98125.00)
                    .newPrice(78500.00)
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_MILANO_RESORT_SPA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_HOTEL_MILANO_RESORT_SPA.getProduct())
                    .description("Desconto de 10% na reserva de Quarto Twin Executivo - Hotel Milano Resort & Spa com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(115625.00)
                    .newPrice(92500.00)
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_KALANDULA_PALACE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_HOTEL_KALANDULA_PALACE.getProduct())
                    .description("Desconto de 20% na reserva de Quarto Single Deluxe - Hotel Kalandula Palace com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(70000.00)
                    .newPrice(56000.00)
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_KALANDULA_PALACE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SUITE_FAMILIAR_HOTEL_KALANDULA_PALACE.getProduct())
                    .description("Desconto de 10% na reserva de Suite Familiar - Hotel Kalandula Palace com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(182500.00)
                    .newPrice(146000.00)
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_KALANDULA_PALACE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_HOTEL_KALANDULA_PALACE.getProduct())
                    .description("Desconto de 20% na reserva de Apartamento T1 Executivo - Hotel Kalandula Palace com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(151250.00)
                    .newPrice(121000.00)
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_MIRAMAR_BUSINESS_HOTEL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_CASAL_PREMIUM_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .description("Desconto de 10% na reserva de Quarto Casal Premium - Miramar Business Hotel com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(99375.00)
                    .newPrice(79500.00)
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_TWIN_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL.getProduct())
                    .description("Desconto de 20% na reserva de Quarto Twin Executivo - Miramar Business Hotel com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(116875.00)
                    .newPrice(93500.00)
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_CASCADE_CITY_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_SINGLE_DELUXE_HOTEL_CASCADE_CITY.getProduct())
                    .description("Desconto de 10% na reserva de Quarto Single Deluxe - Hotel Cascade City com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(71250.00)
                    .newPrice(57000.00)
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_CASCADE_CITY_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SUITE_FAMILIAR_HOTEL_CASCADE_CITY.getProduct())
                    .description("Desconto de 20% na reserva de Suite Familiar - Hotel Cascade City com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(183750.00)
                    .newPrice(147000.00)
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_CASCADE_CITY_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.APARTAMENTO_T1_EXECUTIVO_HOTEL_CASCADE_CITY.getProduct())
                    .description("Desconto de 10% na reserva de Apartamento T1 Executivo - Hotel Cascade City com cancelamento gratuito até 48 horas antes da chegada.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(152500.00)
                    .newPrice(122000.00)
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_VILA_HARMONY_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_FAMILIAR_POUSADA_VILA_HARMONY.getProduct())
                    .description("Promoção de 15% em Quarto Familiar - Pousada Vila Harmony para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(52500.00)
                    .newPrice(42000.00)
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_VILA_HARMONY_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_ECONOMICO_POUSADA_VILA_HARMONY.getProduct())
                    .description("Promoção de 25% em Quarto Económico - Pousada Vila Harmony para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(27500.00)
                    .newPrice(22000.00)
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_BAIA_AZUL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_STANDARD_POUSADA_BAIA_AZUL.getProduct())
                    .description("Promoção de 15% em Quarto Standard - Pousada Baía Azul para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(35625.00)
                    .newPrice(28500.00)
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_BAIA_AZUL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_POUSADA_BAIA_AZUL.getProduct())
                    .description("Promoção de 25% em Quarto com Varanda - Pousada Baía Azul para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(48125.00)
                    .newPrice(38500.00)
                    .build()
    ),

    QUARTO_TWIN_POUSADA_BAIA_AZUL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_TWIN_POUSADA_BAIA_AZUL.getProduct())
                    .description("Promoção de 15% em Quarto Twin - Pousada Baía Azul para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(40625.00)
                    .newPrice(32500.00)
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_RECANTO_VERDE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_FAMILIAR_POUSADA_RECANTO_VERDE.getProduct())
                    .description("Promoção de 25% em Quarto Familiar - Pousada Recanto Verde para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(53750.00)
                    .newPrice(43000.00)
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_RECANTO_VERDE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_ECONOMICO_POUSADA_RECANTO_VERDE.getProduct())
                    .description("Promoção de 15% em Quarto Económico - Pousada Recanto Verde para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(28750.00)
                    .newPrice(23000.00)
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_SAO_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_STANDARD_POUSADA_SAO_KIZUA.getProduct())
                    .description("Promoção de 25% em Quarto Standard - Pousada São Kizua para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(36875.00)
                    .newPrice(29500.00)
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_SAO_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_COM_VARANDA_POUSADA_SAO_KIZUA.getProduct())
                    .description("Promoção de 15% em Quarto com Varanda - Pousada São Kizua para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(49375.00)
                    .newPrice(39500.00)
                    .build()
    ),

    QUARTO_TWIN_POUSADA_SAO_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_TWIN_POUSADA_SAO_KIZUA.getProduct())
                    .description("Promoção de 25% em Quarto Twin - Pousada São Kizua para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(41875.00)
                    .newPrice(33500.00)
                    .build()
    ),

    QUARTO_FAMILIAR_GUEST_HOUSE_MIRAMAR_INN_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_FAMILIAR_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .description("Promoção de 15% em Quarto Familiar - Guest House Miramar Inn para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(55000.00)
                    .newPrice(44000.00)
                    .build()
    ),

    QUARTO_ECONOMICO_GUEST_HOUSE_MIRAMAR_INN_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_ECONOMICO_GUEST_HOUSE_MIRAMAR_INN.getProduct())
                    .description("Promoção de 25% em Quarto Económico - Guest House Miramar Inn para estadias de duas ou mais noites, sujeito a disponibilidade.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(30000.00)
                    .newPrice(24000.00)
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_PROGRESSO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_PROGRESSO.getProduct())
                    .description("Desconto de 10% em Quarto Simples - Hospedaria Progresso para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(22500.00)
                    .newPrice(18000.00)
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_PROGRESSO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_PROGRESSO.getProduct())
                    .description("Desconto de 20% em Quarto Familiar - Hospedaria Progresso para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(31250.00)
                    .newPrice(25000.00)
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_PROGRESSO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_PROGRESSO.getProduct())
                    .description("Desconto de 10% em Estadia Prolongada - Hospedaria Progresso para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(26250.00)
                    .newPrice(21000.00)
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_KWANZA.getProduct())
                    .description("Desconto de 20% em Quarto Single - Hospedaria Kwanza para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(19375.00)
                    .newPrice(15500.00)
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KWANZA.getProduct())
                    .description("Desconto de 10% em Quarto com Banho Privativo - Hospedaria Kwanza para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(25625.00)
                    .newPrice(20500.00)
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_KATANGA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_KATANGA.getProduct())
                    .description("Desconto de 20% em Quarto Simples - Hospedaria Katanga para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(23750.00)
                    .newPrice(19000.00)
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_KATANGA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_KATANGA.getProduct())
                    .description("Desconto de 10% em Quarto Familiar - Hospedaria Katanga para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(32500.00)
                    .newPrice(26000.00)
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_KATANGA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_KATANGA.getProduct())
                    .description("Desconto de 20% em Estadia Prolongada - Hospedaria Katanga para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(27500.00)
                    .newPrice(22000.00)
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_NOVA_VIDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_SINGLE_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .description("Desconto de 10% em Quarto Single - Hospedaria Nova Vida para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(20625.00)
                    .newPrice(16500.00)
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_NOVA_VIDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_NOVA_VIDA.getProduct())
                    .description("Desconto de 20% em Quarto com Banho Privativo - Hospedaria Nova Vida para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(26875.00)
                    .newPrice(21500.00)
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_SAO_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_SIMPLES_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .description("Desconto de 10% em Quarto Simples - Hospedaria São Kizua para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(25000.00)
                    .newPrice(20000.00)
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_SAO_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_FAMILIAR_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .description("Desconto de 20% em Quarto Familiar - Hospedaria São Kizua para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(33750.00)
                    .newPrice(27000.00)
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_SAO_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESTADIA_PROLONGADA_HOSPEDARIA_SAO_KIZUA.getProduct())
                    .description("Desconto de 10% em Estadia Prolongada - Hospedaria São Kizua para clientes que reservem directamente no balcão.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(28750.00)
                    .newPrice(23000.00)
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_O_MUSQUETE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_O_MUSQUETE.getProduct())
                    .description("Desconto de 15% em Prato do Dia - Restaurante O Musquete nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(11875.00)
                    .newPrice(9500.00)
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_O_MUSQUETE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_O_MUSQUETE.getProduct())
                    .description("Desconto de 25% em Menu Executivo do Dia - Restaurante O Musquete nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(17500.00)
                    .newPrice(14000.00)
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_MAR_E_TERRA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .description("Desconto de 15% em Menu Degustação do Chef - Restaurante Mar e Terra nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(40625.00)
                    .newPrice(32500.00)
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_MAR_E_TERRA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .description("Desconto de 25% em Bowl do Chef - Restaurante Mar e Terra nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10375.00)
                    .newPrice(8300.00)
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_MAR_E_TERRA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_MAR_E_TERRA.getProduct())
                    .description("Desconto de 15% em Jantar Romântico para Dois - Restaurante Mar e Terra nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(56875.00)
                    .newPrice(45500.00)
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_KWANZA_LIVING_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .description("Desconto de 25% em Prato do Dia - Restaurante Kwanza Living nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(13125.00)
                    .newPrice(10500.00)
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_KWANZA_LIVING_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_KWANZA_LIVING.getProduct())
                    .description("Desconto de 15% em Menu Executivo do Dia - Restaurante Kwanza Living nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(18750.00)
                    .newPrice(15000.00)
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .description("Desconto de 25% em Menu Degustação do Chef - Restaurante Sabor Angolano nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(41875.00)
                    .newPrice(33500.00)
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BOWL_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .description("Desconto de 15% em Bowl do Chef - Restaurante Sabor Angolano nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(11625.00)
                    .newPrice(9300.00)
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_SABOR_ANGOLANO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_SABOR_ANGOLANO.getProduct())
                    .description("Desconto de 25% em Jantar Romântico para Dois - Restaurante Sabor Angolano nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(58125.00)
                    .newPrice(46500.00)
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_TALATONA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PRATO_DO_DIA_RESTAURANTE_TALATONA.getProduct())
                    .description("Desconto de 15% em Prato do Dia - Restaurante Talatona nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(14375.00)
                    .newPrice(11500.00)
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_TALATONA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MENU_EXECUTIVO_DO_DIA_RESTAURANTE_TALATONA.getProduct())
                    .description("Desconto de 25% em Menu Executivo do Dia - Restaurante Talatona nas horas de maior movimento, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(20000.00)
                    .newPrice(16000.00)
                    .build()
    ),

    MUAMBA_DE_GALINHA_CANTINHO_DA_MAE_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .description("Desconto de 10% em Muamba de Galinha - Cantinho da Mãe Angola ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8125.00)
                    .newPrice(6500.00)
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_CANTINHO_DA_MAE_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .description("Desconto de 20% em Funge com Feijão e Ovo - Cantinho da Mãe Angola ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4000.00)
                    .newPrice(3200.00)
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_CANTINHO_DA_MAE_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_CANTINHO_DA_MAE_ANGOLA.getProduct())
                    .description("Desconto de 10% em Espetos Mistos do Kilamba - Cantinho da Mãe Angola ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(6000.00)
                    .newPrice(4800.00)
                    .build()
    ),

    CALULU_DE_PEIXE_SABORES_DA_NOSSA_TERRA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CALULU_DE_PEIXE_SABORES_DA_NOSSA_TERRA.getProduct())
                    .description("Desconto de 20% em Calulu de Peixe - Sabores da Nossa Terra ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(7500.00)
                    .newPrice(6000.00)
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_SABORES_DA_NOSSA_TERRA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_SABORES_DA_NOSSA_TERRA.getProduct())
                    .description("Desconto de 10% em Peixe Grelhado do Dia - Sabores da Nossa Terra ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10000.00)
                    .newPrice(8000.00)
                    .build()
    ),

    MUAMBA_DE_GALINHA_TASCA_DO_MUAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_TASCA_DO_MUAMBA.getProduct())
                    .description("Desconto de 20% em Muamba de Galinha - Tasca do Muamba ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(9375.00)
                    .newPrice(7500.00)
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_TASCA_DO_MUAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_TASCA_DO_MUAMBA.getProduct())
                    .description("Desconto de 10% em Funge com Feijão e Ovo - Tasca do Muamba ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5250.00)
                    .newPrice(4200.00)
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_TASCA_DO_MUAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_TASCA_DO_MUAMBA.getProduct())
                    .description("Desconto de 20% em Espetos Mistos do Kilamba - Tasca do Muamba ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(7250.00)
                    .newPrice(5800.00)
                    .build()
    ),

    CALULU_DE_PEIXE_COZINHA_DO_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CALULU_DE_PEIXE_COZINHA_DO_KILAMBA.getProduct())
                    .description("Desconto de 10% em Calulu de Peixe - Cozinha do Kilamba ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8750.00)
                    .newPrice(7000.00)
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_COZINHA_DO_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PEIXE_GRELHADO_DO_DIA_COZINHA_DO_KILAMBA.getProduct())
                    .description("Desconto de 20% em Peixe Grelhado do Dia - Cozinha do Kilamba ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(11250.00)
                    .newPrice(9000.00)
                    .build()
    ),

    MUAMBA_DE_GALINHA_SOLAR_DO_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MUAMBA_DE_GALINHA_SOLAR_DO_KWANZA.getProduct())
                    .description("Desconto de 10% em Muamba de Galinha - Solar do Kwanza ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10625.00)
                    .newPrice(8500.00)
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_SOLAR_DO_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.FUNGE_COM_FEIJAO_E_OVO_SOLAR_DO_KWANZA.getProduct())
                    .description("Desconto de 20% em Funge com Feijão e Ovo - Solar do Kwanza ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(6500.00)
                    .newPrice(5200.00)
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_SOLAR_DO_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESPETOS_MISTOS_DO_KILAMBA_SOLAR_DO_KWANZA.getProduct())
                    .description("Desconto de 10% em Espetos Mistos do Kilamba - Solar do Kwanza ao almoço, de segunda a sexta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8500.00)
                    .newPrice(6800.00)
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_NAPOLI_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .description("Desconto de 15% em Pizza Pepperoni - Pizzeria Napoli Luanda nas entregas ao domicílio dentro de Ingombota.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(11125.00)
                    .newPrice(8900.00)
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_NAPOLI_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_NAPOLI_LUANDA.getProduct())
                    .description("Desconto de 25% em Pizza Vegetariana - Pizzeria Napoli Luanda nas entregas ao domicílio dentro de Ingombota.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10250.00)
                    .newPrice(8200.00)
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_FORNO_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .description("Desconto de 15% em Pizza Margherita - Pizzeria Forno Angola nas entregas ao domicílio dentro de Samba.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10000.00)
                    .newPrice(8000.00)
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_FORNO_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .description("Desconto de 25% em Pizza Portuguesa - Pizzeria Forno Angola nas entregas ao domicílio dentro de Samba.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(12500.00)
                    .newPrice(10000.00)
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_FORNO_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_FORNO_ANGOLA.getProduct())
                    .description("Desconto de 15% em Calzone Recheado - Pizzeria Forno Angola nas entregas ao domicílio dentro de Samba.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10375.00)
                    .newPrice(8300.00)
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_MSLICE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_MSLICE.getProduct())
                    .description("Desconto de 25% em Pizza Pepperoni - Pizzeria Mslice nas entregas ao domicílio dentro de Maianga.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(12375.00)
                    .newPrice(9900.00)
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_MSLICE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_MSLICE.getProduct())
                    .description("Desconto de 15% em Pizza Vegetariana - Pizzeria Mslice nas entregas ao domicílio dentro de Maianga.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(11500.00)
                    .newPrice(9200.00)
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_MANGUERINHA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PIZZA_MARGHERITA_PIZZERIA_MANGUERINHA.getProduct())
                    .description("Desconto de 25% em Pizza Margherita - Pizzeria Manguerinha nas entregas ao domicílio dentro de Talatona.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(11250.00)
                    .newPrice(9000.00)
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_MANGUERINHA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PIZZA_PORTUGUESA_PIZZERIA_MANGUERINHA.getProduct())
                    .description("Desconto de 15% em Pizza Portuguesa - Pizzeria Manguerinha nas entregas ao domicílio dentro de Talatona.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(13750.00)
                    .newPrice(11000.00)
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_MANGUERINHA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CALZONE_RECHEADO_PIZZERIA_MANGUERINHA.getProduct())
                    .description("Desconto de 25% em Calzone Recheado - Pizzeria Manguerinha nas entregas ao domicílio dentro de Talatona.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(11625.00)
                    .newPrice(9300.00)
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_BELLA_VISTA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PIZZA_PEPPERONI_PIZZERIA_BELLA_VISTA.getProduct())
                    .description("Desconto de 15% em Pizza Pepperoni - Pizzeria Bella Vista nas entregas ao domicílio dentro de Benfica.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(13625.00)
                    .newPrice(10900.00)
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_BELLA_VISTA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PIZZA_VEGETARIANA_PIZZERIA_BELLA_VISTA.getProduct())
                    .description("Desconto de 25% em Pizza Vegetariana - Pizzeria Bella Vista nas entregas ao domicílio dentro de Benfica.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(12750.00)
                    .newPrice(10200.00)
                    .build()
    ),

    HAMBURGUER_CLASSICO_SNACK_BAR_O_PONTO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_SNACK_BAR_O_PONTO.getProduct())
                    .description("Desconto de 10% em Hambúrguer Clássico - Snack Bar O Ponto em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4375.00)
                    .newPrice(3500.00)
                    .build()
    ),

    BATATAS_FRITAS_SNACK_BAR_O_PONTO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BATATAS_FRITAS_SNACK_BAR_O_PONTO.getProduct())
                    .description("Desconto de 20% em Batatas Fritas - Snack Bar O Ponto em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(2250.00)
                    .newPrice(1800.00)
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_SNACK_BAR_O_PONTO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_SNACK_BAR_O_PONTO.getProduct())
                    .description("Desconto de 10% em Milk-shake de Chocolate - Snack Bar O Ponto em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(2750.00)
                    .newPrice(2200.00)
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_BURGER_STATION_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_BURGER_STATION_LUANDA.getProduct())
                    .description("Desconto de 20% em Cheeseburger Especial - Burger Station Luanda em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5875.00)
                    .newPrice(4700.00)
                    .build()
    ),

    WRAP_DE_FRANGO_BURGER_STATION_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.WRAP_DE_FRANGO_BURGER_STATION_LUANDA.getProduct())
                    .description("Desconto de 10% em Wrap de Frango - Burger Station Luanda em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4625.00)
                    .newPrice(3700.00)
                    .build()
    ),

    HAMBURGUER_CLASSICO_FAST_FOOD_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_FAST_FOOD_KWANZA.getProduct())
                    .description("Desconto de 20% em Hambúrguer Clássico - Fast Food Kwanza em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5625.00)
                    .newPrice(4500.00)
                    .build()
    ),

    BATATAS_FRITAS_FAST_FOOD_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BATATAS_FRITAS_FAST_FOOD_KWANZA.getProduct())
                    .description("Desconto de 10% em Batatas Fritas - Fast Food Kwanza em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(3500.00)
                    .newPrice(2800.00)
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_FAST_FOOD_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_FAST_FOOD_KWANZA.getProduct())
                    .description("Desconto de 20% em Milk-shake de Chocolate - Fast Food Kwanza em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4000.00)
                    .newPrice(3200.00)
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_LANCHES_DO_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CHEESEBURGER_ESPECIAL_LANCHES_DO_MIRAMAR.getProduct())
                    .description("Desconto de 10% em Cheeseburger Especial - Lanches do Miramar em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(7125.00)
                    .newPrice(5700.00)
                    .build()
    ),

    WRAP_DE_FRANGO_LANCHES_DO_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.WRAP_DE_FRANGO_LANCHES_DO_MIRAMAR.getProduct())
                    .description("Desconto de 20% em Wrap de Frango - Lanches do Miramar em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5875.00)
                    .newPrice(4700.00)
                    .build()
    ),

    HAMBURGUER_CLASSICO_FOOD_TRUCK_TAXI_AZUL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.HAMBURGUER_CLASSICO_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .description("Desconto de 10% em Hambúrguer Clássico - Food Truck Táxi Azul em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(6875.00)
                    .newPrice(5500.00)
                    .build()
    ),

    BATATAS_FRITAS_FOOD_TRUCK_TAXI_AZUL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BATATAS_FRITAS_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .description("Desconto de 20% em Batatas Fritas - Food Truck Táxi Azul em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4750.00)
                    .newPrice(3800.00)
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_FOOD_TRUCK_TAXI_AZUL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MILK_SHAKE_DE_CHOCOLATE_FOOD_TRUCK_TAXI_AZUL.getProduct())
                    .description("Desconto de 10% em Milk-shake de Chocolate - Food Truck Táxi Azul em pedidos acima de 8.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5250.00)
                    .newPrice(4200.00)
                    .build()
    ),

    FRANGO_GRELHADO_CHURRASQUEIRA_DO_ZE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.FRANGO_GRELHADO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .description("Desconto de 15% em Frango Grelhado - Churrasqueira do Zé nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(6875.00)
                    .newPrice(5500.00)
                    .build()
    ),

    ESPETO_MISTO_CHURRASQUEIRA_DO_ZE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESPETO_MISTO_CHURRASQUEIRA_DO_ZE.getProduct())
                    .description("Desconto de 25% em Espeto Misto - Churrasqueira do Zé nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(7750.00)
                    .newPrice(6200.00)
                    .build()
    ),

    BIFE_GRELHADO_GRELHADOS_MIUDOS_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BIFE_GRELHADO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .description("Desconto de 15% em Bife Grelhado - Grelhados Miúdos Kizua nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10000.00)
                    .newPrice(8000.00)
                    .build()
    ),

    COSTELETA_DE_PORCO_GRELHADOS_MIUDOS_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .description("Desconto de 25% em Costeleta de Porco - Grelhados Miúdos Kizua nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8750.00)
                    .newPrice(7000.00)
                    .build()
    ),

    ESPETO_DE_CAMARAO_GRELHADOS_MIUDOS_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_GRELHADOS_MIUDOS_KIZUA.getProduct())
                    .description("Desconto de 15% em Espeto de Camarão - Grelhados Miúdos Kizua nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(11250.00)
                    .newPrice(9000.00)
                    .build()
    ),

    FRANGO_GRELHADO_ESPETOS_DA_BAIA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.FRANGO_GRELHADO_ESPETOS_DA_BAIA.getProduct())
                    .description("Desconto de 25% em Frango Grelhado - Espetos da Baía nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8125.00)
                    .newPrice(6500.00)
                    .build()
    ),

    ESPETO_MISTO_ESPETOS_DA_BAIA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESPETO_MISTO_ESPETOS_DA_BAIA.getProduct())
                    .description("Desconto de 15% em Espeto Misto - Espetos da Baía nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(9000.00)
                    .newPrice(7200.00)
                    .build()
    ),

    BIFE_GRELHADO_CHURRASCO_KING_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BIFE_GRELHADO_CHURRASCO_KING.getProduct())
                    .description("Desconto de 25% em Bife Grelhado - Churrasco King nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(11250.00)
                    .newPrice(9000.00)
                    .build()
    ),

    COSTELETA_DE_PORCO_CHURRASCO_KING_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.COSTELETA_DE_PORCO_CHURRASCO_KING.getProduct())
                    .description("Desconto de 15% em Costeleta de Porco - Churrasco King nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10000.00)
                    .newPrice(8000.00)
                    .build()
    ),

    ESPETO_DE_CAMARAO_CHURRASCO_KING_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESPETO_DE_CAMARAO_CHURRASCO_KING.getProduct())
                    .description("Desconto de 25% em Espeto de Camarão - Churrasco King nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(12500.00)
                    .newPrice(10000.00)
                    .build()
    ),

    FRANGO_GRELHADO_GRELHADO_DA_CASA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.FRANGO_GRELHADO_GRELHADO_DA_CASA.getProduct())
                    .description("Desconto de 15% em Frango Grelhado - Grelhado da Casa nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(9375.00)
                    .newPrice(7500.00)
                    .build()
    ),

    ESPETO_MISTO_GRELHADO_DA_CASA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESPETO_MISTO_GRELHADO_DA_CASA.getProduct())
                    .description("Desconto de 25% em Espeto Misto - Grelhado da Casa nas encomendas para grupos com mais de quatro pessoas.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10250.00)
                    .newPrice(8200.00)
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_BAIA_DE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .description("Desconto de 10% em Arroz de Marisco - Marisqueira Baía de Luanda nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(18750.00)
                    .newPrice(15000.00)
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .description("Desconto de 20% em Filete de Robalo Grelhado - Marisqueira Baía de Luanda nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(16875.00)
                    .newPrice(13500.00)
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_BAIA_DE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_BAIA_DE_LUANDA.getProduct())
                    .description("Desconto de 10% em Polvo à Lagareiro - Marisqueira Baía de Luanda nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(17500.00)
                    .newPrice(14000.00)
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DO_PORTO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_DO_PORTO.getProduct())
                    .description("Desconto de 20% em Calulu de Camarão - Marisqueira do Porto nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(15625.00)
                    .newPrice(12500.00)
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DO_PORTO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_DO_PORTO.getProduct())
                    .description("Desconto de 10% em Camarão Grelhado - Marisqueira do Porto nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(20625.00)
                    .newPrice(16500.00)
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_KILAMBA.getProduct())
                    .description("Desconto de 20% em Arroz de Marisco - Marisqueira Kilamba nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(20000.00)
                    .newPrice(16000.00)
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_KILAMBA.getProduct())
                    .description("Desconto de 10% em Filete de Robalo Grelhado - Marisqueira Kilamba nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(18125.00)
                    .newPrice(14500.00)
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_KILAMBA.getProduct())
                    .description("Desconto de 20% em Polvo à Lagareiro - Marisqueira Kilamba nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(18750.00)
                    .newPrice(15000.00)
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DE_BENGUELA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CALULU_DE_CAMARAO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .description("Desconto de 10% em Calulu de Camarão - Marisqueira de Benguela nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(16875.00)
                    .newPrice(13500.00)
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DE_BENGUELA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CAMARAO_GRELHADO_MARISQUEIRA_DE_BENGUELA.getProduct())
                    .description("Desconto de 20% em Camarão Grelhado - Marisqueira de Benguela nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(21875.00)
                    .newPrice(17500.00)
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DO_NAMIBE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ARROZ_DE_MARISCO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .description("Desconto de 10% em Arroz de Marisco - Marisqueira do Namibe nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(21250.00)
                    .newPrice(17000.00)
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_NAMIBE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .description("Desconto de 20% em Filete de Robalo Grelhado - Marisqueira do Namibe nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(19375.00)
                    .newPrice(15500.00)
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DO_NAMIBE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.POLVO_A_LAGAREIRO_MARISQUEIRA_DO_NAMIBE.getProduct())
                    .description("Desconto de 10% em Polvo à Lagareiro - Marisqueira do Namibe nos pratos de peixe de segunda a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(20000.00)
                    .newPrice(16000.00)
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_KIZUA.getProduct())
                    .description("Desconto de 15% em Nigiri Misto 8 Peças - Sushi Kizua no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(15625.00)
                    .newPrice(12500.00)
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_KIZUA.getProduct())
                    .description("Desconto de 25% em Hot Roll Especial - Sushi Kizua no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(9750.00)
                    .newPrice(7800.00)
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_BOM_DIA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_BOM_DIA.getProduct())
                    .description("Desconto de 15% em Sashimi de Salmão - Sushi Bom Dia no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(12500.00)
                    .newPrice(10000.00)
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_BOM_DIA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_BOM_DIA.getProduct())
                    .description("Desconto de 25% em Temaki de Salmão - Sushi Bom Dia no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8750.00)
                    .newPrice(7000.00)
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_BOM_DIA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_BOM_DIA.getProduct())
                    .description("Desconto de 15% em Menu Sushi 18 Peças - Sushi Bom Dia no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(28125.00)
                    .newPrice(22500.00)
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_TOKYO_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_TOKYO_LUANDA.getProduct())
                    .description("Desconto de 25% em Nigiri Misto 8 Peças - Sushi Tokyo Luanda no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(16875.00)
                    .newPrice(13500.00)
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_TOKYO_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_TOKYO_LUANDA.getProduct())
                    .description("Desconto de 15% em Hot Roll Especial - Sushi Tokyo Luanda no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(11000.00)
                    .newPrice(8800.00)
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_SAKURA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SASHIMI_DE_SALMAO_SUSHI_SAKURA.getProduct())
                    .description("Desconto de 25% em Sashimi de Salmão - Sushi Sakura no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(13750.00)
                    .newPrice(11000.00)
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_SAKURA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TEMAKI_DE_SALMAO_SUSHI_SAKURA.getProduct())
                    .description("Desconto de 15% em Temaki de Salmão - Sushi Sakura no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10000.00)
                    .newPrice(8000.00)
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_SAKURA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.MENU_SUSHI_18_PECAS_SUSHI_SAKURA.getProduct())
                    .description("Desconto de 25% em Menu Sushi 18 Peças - Sushi Sakura no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(29375.00)
                    .newPrice(23500.00)
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_MANGA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.NIGIRI_MISTO_8_PECAS_SUSHI_MANGA.getProduct())
                    .description("Desconto de 15% em Nigiri Misto 8 Peças - Sushi Manga no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(18125.00)
                    .newPrice(14500.00)
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_MANGA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.HOT_ROLL_ESPECIAL_SUSHI_MANGA.getProduct())
                    .description("Desconto de 25% em Hot Roll Especial - Sushi Manga no jantar de terça a quinta-feira.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(12250.00)
                    .newPrice(9800.00)
                    .build()
    ),

    ESPRESSO_CAFE_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESPRESSO_CAFE_KWANZA.getProduct())
                    .description("Desconto de 10% em Espresso - Café Kwanza ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(1125.00)
                    .newPrice(900.00)
                    .build()
    ),

    LATTE_CAFE_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.LATTE_CAFE_KWANZA.getProduct())
                    .description("Desconto de 20% em Latte - Café Kwanza ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(2250.00)
                    .newPrice(1800.00)
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SANDES_DE_ATUM_CAFE_KWANZA.getProduct())
                    .description("Desconto de 10% em Sandes de Atum - Café Kwanza ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4000.00)
                    .newPrice(3200.00)
                    .build()
    ),

    CAPPUCCINO_CAFE_BOSSA_NOVA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CAPPUCCINO_CAFE_BOSSA_NOVA.getProduct())
                    .description("Desconto de 20% em Cappuccino - Café Bossa Nova ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(2500.00)
                    .newPrice(2000.00)
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_BOSSA_NOVA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_BOSSA_NOVA.getProduct())
                    .description("Desconto de 10% em Fatia de Bolo de Chocolate - Café Bossa Nova ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(3750.00)
                    .newPrice(3000.00)
                    .build()
    ),

    ESPRESSO_CAFE_DO_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESPRESSO_CAFE_DO_MIRAMAR.getProduct())
                    .description("Desconto de 20% em Espresso - Café do Miramar ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(2375.00)
                    .newPrice(1900.00)
                    .build()
    ),

    LATTE_CAFE_DO_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.LATTE_CAFE_DO_MIRAMAR.getProduct())
                    .description("Desconto de 10% em Latte - Café do Miramar ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(3500.00)
                    .newPrice(2800.00)
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_DO_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SANDES_DE_ATUM_CAFE_DO_MIRAMAR.getProduct())
                    .description("Desconto de 20% em Sandes de Atum - Café do Miramar ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5250.00)
                    .newPrice(4200.00)
                    .build()
    ),

    CAPPUCCINO_CAFE_PAO_QUENTE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CAPPUCCINO_CAFE_PAO_QUENTE.getProduct())
                    .description("Desconto de 10% em Cappuccino - Café Pão Quente ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(3750.00)
                    .newPrice(3000.00)
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_PAO_QUENTE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_PAO_QUENTE.getProduct())
                    .description("Desconto de 20% em Fatia de Bolo de Chocolate - Café Pão Quente ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5000.00)
                    .newPrice(4000.00)
                    .build()
    ),

    ESPRESSO_COFFEE_STOP_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ESPRESSO_COFFEE_STOP_ANGOLA.getProduct())
                    .description("Desconto de 10% em Espresso - Coffee Stop Angola ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(3625.00)
                    .newPrice(2900.00)
                    .build()
    ),

    LATTE_COFFEE_STOP_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.LATTE_COFFEE_STOP_ANGOLA.getProduct())
                    .description("Desconto de 20% em Latte - Coffee Stop Angola ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4750.00)
                    .newPrice(3800.00)
                    .build()
    ),

    SANDES_DE_ATUM_COFFEE_STOP_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SANDES_DE_ATUM_COFFEE_STOP_ANGOLA.getProduct())
                    .description("Desconto de 10% em Sandes de Atum - Coffee Stop Angola ao comprar duas bebidas em conjunto.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(6500.00)
                    .newPrice(5200.00)
                    .build()
    ),

    GIN_TONICA_BAR_222_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.GIN_TONICA_BAR_222.getProduct())
                    .description("Desconto de 15% em Gin & Tónica - Bar 222 todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5250.00)
                    .newPrice(4200.00)
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_222_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PETISCOS_DO_DIA_BAR_222.getProduct())
                    .description("Desconto de 25% em Petiscos do Dia - Bar 222 todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8125.00)
                    .newPrice(6500.00)
                    .build()
    ),

    CAIPIRINHA_BAR_TROPICAL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CAIPIRINHA_BAR_TROPICAL.getProduct())
                    .description("Desconto de 15% em Caipirinha - Bar Tropical todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5000.00)
                    .newPrice(4000.00)
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_TROPICAL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_BAR_TROPICAL.getProduct())
                    .description("Desconto de 25% em Cerveja Artesanal - Bar Tropical todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4125.00)
                    .newPrice(3300.00)
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_TROPICAL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_BAR_TROPICAL.getProduct())
                    .description("Desconto de 15% em Tapa de Camarão - Bar Tropical todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10000.00)
                    .newPrice(8000.00)
                    .build()
    ),

    GIN_TONICA_BAR_DO_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.GIN_TONICA_BAR_DO_KIZUA.getProduct())
                    .description("Desconto de 25% em Gin & Tónica - Bar do Kizua todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(6500.00)
                    .newPrice(5200.00)
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_DO_KIZUA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PETISCOS_DO_DIA_BAR_DO_KIZUA.getProduct())
                    .description("Desconto de 15% em Petiscos do Dia - Bar do Kizua todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(9375.00)
                    .newPrice(7500.00)
                    .build()
    ),

    CAIPIRINHA_PUB_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CAIPIRINHA_PUB_KILAMBA.getProduct())
                    .description("Desconto de 25% em Caipirinha - Pub Kilamba todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(6250.00)
                    .newPrice(5000.00)
                    .build()
    ),

    CERVEJA_ARTESANAL_PUB_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CERVEJA_ARTESANAL_PUB_KILAMBA.getProduct())
                    .description("Desconto de 15% em Cerveja Artesanal - Pub Kilamba todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5375.00)
                    .newPrice(4300.00)
                    .build()
    ),

    TAPA_DE_CAMARAO_PUB_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TAPA_DE_CAMARAO_PUB_KILAMBA.getProduct())
                    .description("Desconto de 25% em Tapa de Camarão - Pub Kilamba todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(11250.00)
                    .newPrice(9000.00)
                    .build()
    ),

    GIN_TONICA_BAR_ESQUINA_DO_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.GIN_TONICA_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .description("Desconto de 15% em Gin & Tónica - Bar Esquina do Miramar todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(7750.00)
                    .newPrice(6200.00)
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_ESQUINA_DO_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PETISCOS_DO_DIA_BAR_ESQUINA_DO_MIRAMAR.getProduct())
                    .description("Desconto de 25% em Petiscos do Dia - Bar Esquina do Miramar todos os dias entre as 17h e as 20h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10625.00)
                    .newPrice(8500.00)
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KWANZA.getProduct())
                    .description("Desconto de 10% em Buffet por Quilograma - Self-Service Kwanza para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8125.00)
                    .newPrice(6500.00)
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_KWANZA.getProduct())
                    .description("Desconto de 20% em Sopa do Dia - Self-Service Kwanza para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(3125.00)
                    .newPrice(2500.00)
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_KWANZA.getProduct())
                    .description("Desconto de 10% em Sobremesa do Buffet - Self-Service Kwanza para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(2250.00)
                    .newPrice(1800.00)
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_ZE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_ZE.getProduct())
                    .description("Desconto de 20% em Prato do Dia Self-Service - Self-Service do Zé para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(7500.00)
                    .newPrice(6000.00)
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_DO_ZE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_DO_ZE.getProduct())
                    .description("Desconto de 10% em Salada do Buffet - Self-Service do Zé para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4625.00)
                    .newPrice(3700.00)
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KILAMBA.getProduct())
                    .description("Desconto de 20% em Buffet por Quilograma - Self-Service Kilamba para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(9375.00)
                    .newPrice(7500.00)
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_KILAMBA.getProduct())
                    .description("Desconto de 10% em Sopa do Dia - Self-Service Kilamba para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4375.00)
                    .newPrice(3500.00)
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_KILAMBA.getProduct())
                    .description("Desconto de 20% em Sobremesa do Buffet - Self-Service Kilamba para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(3500.00)
                    .newPrice(2800.00)
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_CENTRAL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_CENTRAL.getProduct())
                    .description("Desconto de 10% em Prato do Dia Self-Service - Self-Service Central para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8750.00)
                    .newPrice(7000.00)
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_CENTRAL_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SALADA_DO_BUFFET_SELF_SERVICE_CENTRAL.getProduct())
                    .description("Desconto de 20% em Salada do Buffet - Self-Service Central para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5875.00)
                    .newPrice(4700.00)
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .description("Desconto de 10% em Buffet por Quilograma - Self-Service do Miramar para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10625.00)
                    .newPrice(8500.00)
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_DO_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SOPA_DO_DIA_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .description("Desconto de 20% em Sopa do Dia - Self-Service do Miramar para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(5625.00)
                    .newPrice(4500.00)
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR.getProduct())
                    .description("Desconto de 10% em Sobremesa do Buffet - Self-Service do Miramar para clientes que sentam ao self-service entre as 12h e as 15h.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4750.00)
                    .newPrice(3800.00)
                    .build()
    ),

    TOFU_GRELHADO_RESTAURANTE_VEGETARIANO_RAIZES_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TOFU_GRELHADO_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .description("Desconto de 15% em Tofu Grelhado - Restaurante Vegetariano Raízes às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(6000.00)
                    .newPrice(4800.00)
                    .build()
    ),

    BOWL_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES.getProduct())
                    .description("Desconto de 25% em Bowl de Legumes - Restaurante Vegetariano Raízes às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(6250.00)
                    .newPrice(5000.00)
                    .build()
    ),

    SALADA_DE_QUINOA_VEGGIE_HOUSE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SALADA_DE_QUINOA_VEGGIE_HOUSE_LUANDA.getProduct())
                    .description("Desconto de 15% em Salada de Quinoa - Veggie House Luanda às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(7125.00)
                    .newPrice(5700.00)
                    .build()
    ),

    LEGUMES_ASSADOS_VEGGIE_HOUSE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.LEGUMES_ASSADOS_VEGGIE_HOUSE_LUANDA.getProduct())
                    .description("Desconto de 25% em Legumes Assados - Veggie House Luanda às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(7500.00)
                    .newPrice(6000.00)
                    .build()
    ),

    CURRY_DE_LEGUMES_VEGGIE_HOUSE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_VEGGIE_HOUSE_LUANDA.getProduct())
                    .description("Desconto de 15% em Curry de Legumes - Veggie House Luanda às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(7250.00)
                    .newPrice(5800.00)
                    .build()
    ),

    TOFU_GRELHADO_COZINHA_VERDE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TOFU_GRELHADO_COZINHA_VERDE.getProduct())
                    .description("Desconto de 25% em Tofu Grelhado - Cozinha Verde às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(7250.00)
                    .newPrice(5800.00)
                    .build()
    ),

    BOWL_DE_LEGUMES_COZINHA_VERDE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_COZINHA_VERDE.getProduct())
                    .description("Desconto de 15% em Bowl de Legumes - Cozinha Verde às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(7500.00)
                    .newPrice(6000.00)
                    .build()
    ),

    SALADA_DE_QUINOA_BI_VEGETARIANO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SALADA_DE_QUINOA_BI_VEGETARIANO.getProduct())
                    .description("Desconto de 25% em Salada de Quinoa - Bi Vegetariano às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8375.00)
                    .newPrice(6700.00)
                    .build()
    ),

    LEGUMES_ASSADOS_BI_VEGETARIANO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.LEGUMES_ASSADOS_BI_VEGETARIANO.getProduct())
                    .description("Desconto de 15% em Legumes Assados - Bi Vegetariano às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8750.00)
                    .newPrice(7000.00)
                    .build()
    ),

    CURRY_DE_LEGUMES_BI_VEGETARIANO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CURRY_DE_LEGUMES_BI_VEGETARIANO.getProduct())
                    .description("Desconto de 25% em Curry de Legumes - Bi Vegetariano às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8500.00)
                    .newPrice(6800.00)
                    .build()
    ),

    TOFU_GRELHADO_SABOR_VEGETARIANO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TOFU_GRELHADO_SABOR_VEGETARIANO.getProduct())
                    .description("Desconto de 15% em Tofu Grelhado - Sabor Vegetariano às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8500.00)
                    .newPrice(6800.00)
                    .build()
    ),

    BOWL_DE_LEGUMES_SABOR_VEGETARIANO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BOWL_DE_LEGUMES_SABOR_VEGETARIANO.getProduct())
                    .description("Desconto de 25% em Bowl de Legumes - Sabor Vegetariano às segundas-feiras, dia vegetariano da semana.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8750.00)
                    .newPrice(7000.00)
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_PAO_QUENTE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PAO_DE_FORMA_PADARIA_PAO_QUENTE.getProduct())
                    .description("Desconto de 10% em Pão de Forma - Padaria Pão Quente em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(1500.00)
                    .newPrice(1200.00)
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_PAO_QUENTE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PASTEL_DE_NATA_PADARIA_PAO_QUENTE.getProduct())
                    .description("Desconto de 20% em Pastel de Nata - Padaria Pão Quente em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(1125.00)
                    .newPrice(900.00)
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_PAO_QUENTE_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PADARIA_PAO_QUENTE.getProduct())
                    .description("Desconto de 10% em Pão Doce Tradicional - Padaria Pão Quente em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(875.00)
                    .newPrice(700.00)
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PADARIA_KWANZA.getProduct())
                    .description("Desconto de 20% em Croissant de Manteiga - Padaria Kwanza em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(2500.00)
                    .newPrice(2000.00)
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PADARIA_KWANZA.getProduct())
                    .description("Desconto de 10% em Bolo de Chocolate - Padaria Kwanza em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(8750.00)
                    .newPrice(7000.00)
                    .build()
    ),

    PAO_DE_FORMA_PASTELARIA_DOCE_MANJAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PAO_DE_FORMA_PASTELARIA_DOCE_MANJAR.getProduct())
                    .description("Desconto de 20% em Pão de Forma - Pastelaria Doce Manjar em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(2750.00)
                    .newPrice(2200.00)
                    .build()
    ),

    PASTEL_DE_NATA_PASTELARIA_DOCE_MANJAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PASTEL_DE_NATA_PASTELARIA_DOCE_MANJAR.getProduct())
                    .description("Desconto de 10% em Pastel de Nata - Pastelaria Doce Manjar em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(2375.00)
                    .newPrice(1900.00)
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PASTELARIA_DOCE_MANJAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PASTELARIA_DOCE_MANJAR.getProduct())
                    .description("Desconto de 20% em Pão Doce Tradicional - Pastelaria Doce Manjar em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(2125.00)
                    .newPrice(1700.00)
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CROISSANT_DE_MANTEIGA_PADARIA_KILAMBA.getProduct())
                    .description("Desconto de 10% em Croissant de Manteiga - Padaria Kilamba em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(3750.00)
                    .newPrice(3000.00)
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_KILAMBA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.BOLO_DE_CHOCOLATE_PADARIA_KILAMBA.getProduct())
                    .description("Desconto de 20% em Bolo de Chocolate - Padaria Kilamba em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(10000.00)
                    .newPrice(8000.00)
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_MANACA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PAO_DE_FORMA_PADARIA_MANACA.getProduct())
                    .description("Desconto de 10% em Pão de Forma - Padaria Manacá em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(4000.00)
                    .newPrice(3200.00)
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_MANACA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PASTEL_DE_NATA_PADARIA_MANACA.getProduct())
                    .description("Desconto de 20% em Pastel de Nata - Padaria Manacá em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(3625.00)
                    .newPrice(2900.00)
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_MANACA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PAO_DOCE_TRADICIONAL_PADARIA_MANACA.getProduct())
                    .description("Desconto de 10% em Pão Doce Tradicional - Padaria Manacá em compras acima de 5.000 Kz.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(3375.00)
                    .newPrice(2700.00)
                    .build()
    ),

    VOO_LUANDA_HUAMBO_LINHAS_AEREAS_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_LINHAS_AEREAS_KWANZA.getProduct())
                    .description("Desconto de 15% em Voo Luanda-Huambo - Linhas Aéreas Kwanza nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(118750.00)
                    .newPrice(95000.00)
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_LINHAS_AEREAS_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_LINHAS_AEREAS_KWANZA.getProduct())
                    .description("Desconto de 25% em Voo Luanda-São Paulo - Linhas Aéreas Kwanza nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(775000.00)
                    .newPrice(620000.00)
                    .build()
    ),

    VOO_LUANDA_LISBOA_ANGOLA_EXPRESS_AIR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_ANGOLA_EXPRESS_AIR.getProduct())
                    .description("Desconto de 15% em Voo Luanda-Lisboa - Angola Express Air nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(600625.00)
                    .newPrice(480500.00)
                    .build()
    ),

    VOO_LUANDA_LUBANGO_ANGOLA_EXPRESS_AIR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_ANGOLA_EXPRESS_AIR.getProduct())
                    .description("Desconto de 25% em Voo Luanda-Lubango - Angola Express Air nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(138125.00)
                    .newPrice(110500.00)
                    .build()
    ),

    VOO_LUANDA_LONDRES_ANGOLA_EXPRESS_AIR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_ANGOLA_EXPRESS_AIR.getProduct())
                    .description("Desconto de 15% em Voo Luanda-Londres - Angola Express Air nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(1113125.00)
                    .newPrice(890500.00)
                    .build()
    ),

    VOO_LUANDA_HUAMBO_SKY_ANGOLA_AIRLINES_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_SKY_ANGOLA_AIRLINES.getProduct())
                    .description("Desconto de 25% em Voo Luanda-Huambo - Sky Angola Airlines nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(120000.00)
                    .newPrice(96000.00)
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_SKY_ANGOLA_AIRLINES_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_SKY_ANGOLA_AIRLINES.getProduct())
                    .description("Desconto de 15% em Voo Luanda-São Paulo - Sky Angola Airlines nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(776250.00)
                    .newPrice(621000.00)
                    .build()
    ),

    VOO_LUANDA_LISBOA_KUBINGA_AIR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_LISBOA_KUBINGA_AIR.getProduct())
                    .description("Desconto de 25% em Voo Luanda-Lisboa - Kubinga Air nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(601875.00)
                    .newPrice(481500.00)
                    .build()
    ),

    VOO_LUANDA_LUBANGO_KUBINGA_AIR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_LUBANGO_KUBINGA_AIR.getProduct())
                    .description("Desconto de 15% em Voo Luanda-Lubango - Kubinga Air nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(139375.00)
                    .newPrice(111500.00)
                    .build()
    ),

    VOO_LUANDA_LONDRES_KUBINGA_AIR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_LONDRES_KUBINGA_AIR.getProduct())
                    .description("Desconto de 25% em Voo Luanda-Londres - Kubinga Air nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(1114375.00)
                    .newPrice(891500.00)
                    .build()
    ),

    VOO_LUANDA_HUAMBO_ROYAL_WINGS_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_HUAMBO_ROYAL_WINGS_ANGOLA.getProduct())
                    .description("Desconto de 15% em Voo Luanda-Huambo - Royal Wings Angola nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(121250.00)
                    .newPrice(97000.00)
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_ROYAL_WINGS_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VOO_LUANDA_SAO_PAULO_ROYAL_WINGS_ANGOLA.getProduct())
                    .description("Desconto de 25% em Voo Luanda-São Paulo - Royal Wings Angola nas reservas feitas com 30 dias de antecedência.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(777500.00)
                    .newPrice(622000.00)
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_AGENCIA_DE_VIAGENS_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .description("Desconto de 10% em Pacote Luanda-Namibe - Agência de Viagens Kwanza nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(475000.00)
                    .newPrice(380000.00)
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_AGENCIA_DE_VIAGENS_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .description("Desconto de 20% em Rota da Serra da Leba - Agência de Viagens Kwanza nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(362500.00)
                    .newPrice(290000.00)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AGENCIA_DE_VIAGENS_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_AGENCIA_DE_VIAGENS_KWANZA.getProduct())
                    .description("Desconto de 10% em City Tour em Luanda - Agência de Viagens Kwanza nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(56250.00)
                    .newPrice(45000.00)
                    .build()
    ),

    SAFARIR_EM_BENGUELA_AVENTURA_VIAGENS_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_AVENTURA_VIAGENS.getProduct())
                    .description("Desconto de 20% em Safarir em Benguela - Aventura Viagens nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(813125.00)
                    .newPrice(650500.00)
                    .build()
    ),

    EXCURSAO_AS_ILHAS_AVENTURA_VIAGENS_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_AVENTURA_VIAGENS.getProduct())
                    .description("Desconto de 10% em Excursão às Ilhas - Aventura Viagens nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(150625.00)
                    .newPrice(120500.00)
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_TRAVEL_HOUSE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_TRAVEL_HOUSE_LUANDA.getProduct())
                    .description("Desconto de 20% em Pacote Luanda-Namibe - Travel House Luanda nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(476250.00)
                    .newPrice(381000.00)
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_TRAVEL_HOUSE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_TRAVEL_HOUSE_LUANDA.getProduct())
                    .description("Desconto de 10% em Rota da Serra da Leba - Travel House Luanda nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(363750.00)
                    .newPrice(291000.00)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_TRAVEL_HOUSE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_TRAVEL_HOUSE_LUANDA.getProduct())
                    .description("Desconto de 20% em City Tour em Luanda - Travel House Luanda nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(57500.00)
                    .newPrice(46000.00)
                    .build()
    ),

    SAFARIR_EM_BENGUELA_GLOBETROTTER_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SAFARIR_EM_BENGUELA_GLOBETROTTER_ANGOLA.getProduct())
                    .description("Desconto de 10% em Safarir em Benguela - Globetrotter Angola nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(814375.00)
                    .newPrice(651500.00)
                    .build()
    ),

    EXCURSAO_AS_ILHAS_GLOBETROTTER_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.EXCURSAO_AS_ILHAS_GLOBETROTTER_ANGOLA.getProduct())
                    .description("Desconto de 20% em Excursão às Ilhas - Globetrotter Angola nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(151875.00)
                    .newPrice(121500.00)
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_SAFARIR_VIAGENS_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PACOTE_LUANDA_NAMIBE_SAFARIR_VIAGENS.getProduct())
                    .description("Desconto de 10% em Pacote Luanda-Namibe - Safarir Viagens nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(477500.00)
                    .newPrice(382000.00)
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_SAFARIR_VIAGENS_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.ROTA_DA_SERRA_DA_LEBA_SAFARIR_VIAGENS.getProduct())
                    .description("Desconto de 20% em Rota da Serra da Leba - Safarir Viagens nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(365000.00)
                    .newPrice(292000.00)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_SAFARIR_VIAGENS_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_SAFARIR_VIAGENS.getProduct())
                    .description("Desconto de 10% em City Tour em Luanda - Safarir Viagens nas reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(58750.00)
                    .newPrice(47000.00)
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_OPERADORA_TURISTICA_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .description("Desconto de 15% em Visita à Serra da Leba - Operadora Turística Kwanza para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(56250.00)
                    .newPrice(45000.00)
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_OPERADORA_TURISTICA_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_OPERADORA_TURISTICA_KWANZA.getProduct())
                    .description("Desconto de 25% em Tour Gastronómico no Miramar - Operadora Turística Kwanza para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(27500.00)
                    .newPrice(22000.00)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AVENTURA_GUIDES_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .description("Desconto de 15% em City Tour em Luanda - Aventura Guides Angola para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(31875.00)
                    .newPrice(25500.00)
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_AVENTURA_GUIDES_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .description("Desconto de 25% em Expedição à Foz do Kwanza - Aventura Guides Angola para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(81875.00)
                    .newPrice(65500.00)
                    .build()
    ),

    PASSEIO_PELA_FALESIA_AVENTURA_GUIDES_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_AVENTURA_GUIDES_ANGOLA.getProduct())
                    .description("Desconto de 15% em Passeio pela Falésia - Aventura Guides Angola para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(48125.00)
                    .newPrice(38500.00)
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_TURISTAS_LUANDA_GUIDES_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_TURISTAS_LUANDA_GUIDES.getProduct())
                    .description("Desconto de 25% em Visita à Serra da Leba - Turistas Luanda Guides para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(57500.00)
                    .newPrice(46000.00)
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_TURISTAS_LUANDA_GUIDES_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_TURISTAS_LUANDA_GUIDES.getProduct())
                    .description("Desconto de 15% em Tour Gastronómico no Miramar - Turistas Luanda Guides para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(28750.00)
                    .newPrice(23000.00)
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_EXPEDICOES_KALANDULA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.CITY_TOUR_EM_LUANDA_EXPEDICOES_KALANDULA.getProduct())
                    .description("Desconto de 25% em City Tour em Luanda - Expedições Kalandula para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(33125.00)
                    .newPrice(26500.00)
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_EXPEDICOES_KALANDULA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.EXPEDICAO_A_FOZ_DO_KWANZA_EXPEDICOES_KALANDULA.getProduct())
                    .description("Desconto de 15% em Expedição à Foz do Kwanza - Expedições Kalandula para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(83125.00)
                    .newPrice(66500.00)
                    .build()
    ),

    PASSEIO_PELA_FALESIA_EXPEDICOES_KALANDULA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PASSEIO_PELA_FALESIA_EXPEDICOES_KALANDULA.getProduct())
                    .description("Desconto de 25% em Passeio pela Falésia - Expedições Kalandula para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(49375.00)
                    .newPrice(39500.00)
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_GUIA_TOURS_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.VISITA_A_SERRA_DA_LEBA_GUIA_TOURS_MIRAMAR.getProduct())
                    .description("Desconto de 15% em Visita à Serra da Leba - Guia Tours Miramar para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(58750.00)
                    .newPrice(47000.00)
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_GUIA_TOURS_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TOUR_GASTRONOMICO_NO_MIRAMAR_GUIA_TOURS_MIRAMAR.getProduct())
                    .description("Desconto de 25% em Tour Gastronómico no Miramar - Guia Tours Miramar para grupos com mais de quatro participantes.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(30000.00)
                    .newPrice(24000.00)
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_INTERPRETES_DE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_INTERPRETES_DE_LUANDA.getProduct())
                    .description("Desconto de 10% em Intérprete de Espanhol - Intérpretes de Luanda nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(31250.00)
                    .newPrice(25000.00)
                    .build()
    ),

    INTERPRETE_DE_INGLES_INTERPRETES_DE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_INTERPRETES_DE_LUANDA.getProduct())
                    .description("Desconto de 20% em Intérprete de Inglês - Intérpretes de Luanda nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(37500.00)
                    .newPrice(30000.00)
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_INTERPRETES_DE_LUANDA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_INTERPRETES_DE_LUANDA.getProduct())
                    .description("Desconto de 10% em Tradução de Documentos - Intérpretes de Luanda nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(22500.00)
                    .newPrice(18000.00)
                    .build()
    ),

    INTERPRETE_DE_FRANCES_GLOBAL_VOICES_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_GLOBAL_VOICES_ANGOLA.getProduct())
                    .description("Desconto de 20% em Intérprete de Francês - Global Voices Angola nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(35625.00)
                    .newPrice(28500.00)
                    .build()
    ),

    GUIA_DE_CONFERENCIA_GLOBAL_VOICES_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_GLOBAL_VOICES_ANGOLA.getProduct())
                    .description("Desconto de 10% em Guia de Conferência - Global Voices Angola nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(56875.00)
                    .newPrice(45500.00)
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_TRADUCAO_E_INTERPRETE_SERVICES_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .description("Desconto de 20% em Intérprete de Espanhol - Tradução e Intérprete Services nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(32500.00)
                    .newPrice(26000.00)
                    .build()
    ),

    INTERPRETE_DE_INGLES_TRADUCAO_E_INTERPRETE_SERVICES_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .description("Desconto de 10% em Intérprete de Inglês - Tradução e Intérprete Services nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(38750.00)
                    .newPrice(31000.00)
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_TRADUCAO_E_INTERPRETE_SERVICES_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_TRADUCAO_E_INTERPRETE_SERVICES.getProduct())
                    .description("Desconto de 20% em Tradução de Documentos - Tradução e Intérprete Services nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(23750.00)
                    .newPrice(19000.00)
                    .build()
    ),

    INTERPRETE_DE_FRANCES_INTERPRETE_PRO_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.INTERPRETE_DE_FRANCES_INTERPRETE_PRO_ANGOLA.getProduct())
                    .description("Desconto de 10% em Intérprete de Francês - Intérprete Pro Angola nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(36875.00)
                    .newPrice(29500.00)
                    .build()
    ),

    GUIA_DE_CONFERENCIA_INTERPRETE_PRO_ANGOLA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.GUIA_DE_CONFERENCIA_INTERPRETE_PRO_ANGOLA.getProduct())
                    .description("Desconto de 20% em Guia de Conferência - Intérprete Pro Angola nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(58125.00)
                    .newPrice(46500.00)
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_IDIOMAS_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.INTERPRETE_DE_ESPANHOL_IDIOMAS_KWANZA.getProduct())
                    .description("Desconto de 10% em Intérprete de Espanhol - Idiomas Kwanza nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(33750.00)
                    .newPrice(27000.00)
                    .build()
    ),

    INTERPRETE_DE_INGLES_IDIOMAS_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.INTERPRETE_DE_INGLES_IDIOMAS_KWANZA.getProduct())
                    .description("Desconto de 20% em Intérprete de Inglês - Idiomas Kwanza nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(40000.00)
                    .newPrice(32000.00)
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_IDIOMAS_KWANZA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.TRADUCAO_DE_DOCUMENTOS_IDIOMAS_KWANZA.getProduct())
                    .description("Desconto de 10% em Tradução de Documentos - Idiomas Kwanza nos contratos de tradução com mais de dez documentos.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(25000.00)
                    .newPrice(20000.00)
                    .build()
    ),

    APARTAMENTO_FAMILIAR_EPICSANA_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.APARTAMENTO_FAMILIAR_EPICSANA.getProduct())
                    .description("Desconto de 15% em Apartamento Familiar - Luanda para reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(262500.00)
                    .newPrice(210000.00)
                    .build()
    ),

    QUARTO_INDIVIDUAL_EXECUTIVO_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_INDIVIDUAL_EXECUTIVO_MIRAMAR.getProduct())
                    .description("Desconto de 10% em Quarto Individual Executivo - Miramar para reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(47500.00)
                    .newPrice(38000.00)
                    .build()
    ),

    SUITE_MIRAMAR_COM_VISTA_PARA_O_MAR_MIRAMAR_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.SUITE_MIRAMAR_COM_VISTA_PARA_O_MAR_MIRAMAR.getProduct())
                    .description("Desconto de 20% em Suite Miramar com Vista para o Mar - Miramar para reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(110000.00)
                    .newPrice(88000.00)
                    .build()
    ),

    QUARTO_INDIVIDUAL_SIMPLES_HUAMBO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.QUARTO_INDIVIDUAL_SIMPLES_HUAMBO.getProduct())
                    .description("Desconto de 10% em Quarto Individual Simples - Huambo para reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(22500.00)
                    .newPrice(18000.00)
                    .build()
    ),

    PENSAO_COMPLETA_POR_DIA_HUAMBO_PROMO(
            ProductPromotion.builder()
                    .product(ProductData.PENSAO_COMPLETA_POR_DIA_HUAMBO.getProduct())
                    .description("Desconto de 20% em Pensão Completa por Dia - Huambo para reservas confirmadas com sinal de 30%.")
                    .status(ProductPromotionStatus.ACTIVE)
                    .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                    .completedAt(Instant.parse("2027-12-31T23:59:59Z"))
                    .oldPrice(30000.00)
                    .newPrice(24000.00)
                    .build()
    );

    private final ProductPromotion productPromotion;
}
