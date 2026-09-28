package com.negocil.negoturismo.admin.config.seeder.system;

import com.negocil.negoturismo.admin.feature.category.enums.CategoryGroup;
import com.negocil.negoturismo.admin.feature.category.model.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CategoryData {
    HOTEL(
            Category.builder()
                    .name("Hotel")
                    .icon("hgi hgi-stroke hgi-rounded hgi-hotel-02")
                    .categoryGroup(CategoryGroup.HOSTING)
                    .description("Estabelecimento destinado à hospedagem, oferecendo acomodações, conforto e diversos serviços aos hóspedes.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Fhotel.png?alt=media&token=c2573828-895a-4a44-9e5e-b0fc99ac073e")
                    .build()
    ),

    GUESTHOUSE(
            Category.builder()
                    .name("Pousada")
                    .icon("hgi hgi-stroke hgi-rounded hgi-bed-double")
                    .categoryGroup(CategoryGroup.HOSTING)
                    .description("Hospedagem turística de pequeno porte, com ambiente acolhedor e atendimento mais personalizado.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Fpousado.png?alt=media&token=1b0065b3-23c5-4ab1-859f-b88234c065a8")
                    .build()
    ),

    ACCOMMODATION(
            Category.builder()
                    .name("Hospedaria")
                    .icon("hgi hgi-stroke hgi-rounded hgi-building-06")
                    .categoryGroup(CategoryGroup.HOSTING)
                    .description("Local de hospedagem simples e econômica para estadias temporárias, podendo incluir serviços básicos.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Fhospedaria.png?alt=media&token=f1b0e653-b016-4454-8301-d229ce371509")
                    .build()
    ),

    RESTAURANT(
            Category.builder()
                    .name("Restaurante")
                    .icon("hgi hgi-stroke hgi-rounded hgi-restaurant-01")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimento dedicado à preparação e serviço de refeições, com ementa variada e serviço à mesa.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Frestaurante.png?alt=media&token=271b30ae-3870-43a6-8eeb-0c6add976d61")
                    .build()
    ),

    TRADITIONAL_FOOD(
            Category.builder()
                    .name("Comida Tradicional")
                    .icon("hgi hgi-stroke hgi-rounded hgi-dish-01")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Restaurantes especializados em gastronomia típica, com pratos da culinária local e regional.")
                    .build()
    ),

    PIZZERIA(
            Category.builder()
                    .name("Pizzaria")
                    .icon("hgi hgi-stroke hgi-rounded hgi-pizza-02")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimento especializado em pizzas artesanais e outros pratos de inspiração italiana.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Fcomida_tradicional.png?alt=media&token=3de35e27-2f4e-4431-93c3-e7d458793bbb")
                    .build()
    ),

    FAST_FOOD(
            Category.builder()
                    .name("Comida Rápida")
                    .icon("hgi hgi-stroke hgi-rounded hgi-cafe")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimentos de refeições rápidas, incluindo hamburguerias, lanchonetes e take-away.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Fcomida_rapida.png?alt=media&token=9e5f26d9-54d5-4a0a-a2b8-866e365aaf41")
                    .build()
    ),

    GRILL(
            Category.builder()
                    .name("Churrasco e Grelhados")
                    .icon("hgi hgi-stroke hgi-rounded hgi-bbq-grill")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Casas especializadas em grelhados, churrasco e carnes no carvão ou na brasa.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Fchurrasco_grelhado.png?alt=media&token=9bdc0664-05fa-420e-b6bd-2d5c7ffdd1eb")
                    .build()
    ),

    SEAFOOD(
            Category.builder()
                    .name("Marisqueira")
                    .icon("hgi hgi-stroke hgi-rounded hgi-prawn")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Restaurante focado em mariscos, peixes e frutos do mar frescos.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Fmarisqueira.png?alt=media&token=efc326bb-bd3e-4a91-8a5e-c9d9448acaeb")
                    .build()
    ),

    SUSHI(
            Category.builder()
                    .name("Restaurante de Sushi")
                    .icon("hgi hgi-stroke hgi-rounded hgi-sushi-03")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimento especializado em gastronomia japonesa, com sushi, sashimi e pratos orientais.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Frestaurante_sushi.png?alt=media&token=6072be99-abf6-4745-9052-3c40823cf51e")
                    .build()
    ),

    CAFE(
            Category.builder()
                    .name("Café")
                    .icon("hgi hgi-stroke hgi-rounded hgi-coffee-01")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Espaço acolhedor para refeições ligeiras, bebidas, cafés e sobremesas.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Fcafe.png?alt=media&token=08286169-344f-4574-bc6f-c0c4ec4959ca")
                    .build()
    ),

    BAR(
            Category.builder()
                    .name("Bar")
                    .icon("hgi hgi-stroke hgi-rounded hgi-drink")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimento de bebidas e petiscos, com ambiente descontraído e opções de música.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Fbar.png?alt=media&token=7484cabc-484b-4e09-9e01-c74725208187")
                    .build()
    ),

    SELF_SERVICE(
            Category.builder()
                    .name("Restaurante Self-Service")
                    .icon("hgi hgi-stroke hgi-rounded hgi-dish-01")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Restaurante ao balcão onde o cliente se serve diretamente, com pagamento por peso ou fixo.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Frestaurante_self_service.png?alt=media&token=af82cf1b-cbfe-499c-971b-56d04e6f820f")
                    .build()
    ),

    VEGETARIAN(
            Category.builder()
                    .name("Restaurante Vegetariano")
                    .icon("hgi hgi-stroke hgi-rounded hgi-restaurant-table")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Restaurante focado em pratos vegetarianos e veganos, com ingredientes naturais e saudáveis.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Frestaurante_vegetariano.png?alt=media&token=4ca8fab8-b189-4a1d-9563-92b6a34765c5")
                    .build()
    ),

    BAKERY(
            Category.builder()
                    .name("Padaria e Pastelaria")
                    .icon("hgi hgi-stroke hgi-rounded hgi-bread-04")
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimento de pães, bolos, doces e refeições ligeiras, com produção própria.")
                    .image("https://firebasestorage.googleapis.com/v0/b/negoturismo-6d989.firebasestorage.app/o/categoreis%2Fpadaria_pastelaria.png?alt=media&token=ea65b855-f3cb-4cc1-a2de-e56c950482dc")
                    .build()
    ),

    FLIGHTS(
            Category.builder()
                    .name("Voos")
                    .icon("hgi hgi-stroke hgi-rounded hgi-airplane-01")
                    .categoryGroup(CategoryGroup.TOURISM)
                    .description("Seja os voos destinados para Angola e marca a sua viagem.")
                    .image("")
                    .build()
    ),

    TRAVEL_AGENCIES(
            Category.builder()
                    .name("Agências de viagens")
                    .icon("hgi hgi-stroke hgi-rounded hgi-travel-bag")
                    .categoryGroup(CategoryGroup.TOURISM)
                    .description("Empresas especializadas na organização de viagens, reservas de passagens e pacotes turísticos.")
                    .image("")
                    .build()
    ),

    TOUR_GUIDE(
            Category.builder()
                    .name("Guia de Turismo")
                    .icon("hgi hgi-stroke hgi-rounded hgi-location-user-04")
                    .categoryGroup(CategoryGroup.TOURISM)
                    .description("Profissional credenciado encarregado de acompanhar, orientar e transmitir informações a pessoas ou grupos em itinerários turísticos.")
                    .image("")
                    .build()
    ),

    INTERPRETER(
            Category.builder()
                    .name("Intérprete de Viagem")
                    .icon("hgi hgi-stroke hgi-rounded hgi-bubble-chat-translate")
                    .categoryGroup(CategoryGroup.INTERPRETER)
                    .description("Professional especializado na tradução e facilitação de comunicação intercultural e linguística para turistas.")
                    .image("")
                    .build()
    );

    private final Category category;
}