package com.negocil.negoturismo.admin.config.seeder.system;

import com.negocil.negoturismo.admin.feature.category.enums.CategoryGroup;
import com.negocil.negoturismo.admin.feature.category.model.Category;
import com.negocil.negoturismo.admin.shared.core.enums.HugeiconNamed;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CategoryData {
    HOTEL(
            Category.builder()
                    .name("Hotel")
                    .icon(HugeiconNamed.HOTEL_01.getWeb())
                    .categoryGroup(CategoryGroup.HOSTING)
                    .description("Estabelecimento destinado à hospedagem, oferecendo acomodações, conforto e diversos serviços aos hóspedes.")
                    .build()
    ),

    GUESTHOUSE(
            Category.builder()
                    .name("Pousada")
                    .icon(HugeiconNamed.GUESTHOUSE.getWeb())
                    .categoryGroup(CategoryGroup.HOSTING)
                    .description("Hospedagem turística de pequeno porte, com ambiente acolhedor e atendimento mais personalizado.")
                    .build()
    ),

    ACCOMMODATION(
            Category.builder()
                    .name("Hospedaria")
                    .icon(HugeiconNamed.HOTEL_02.getWeb())
                    .categoryGroup(CategoryGroup.HOSTING)
                    .description("Local de hospedagem simples e econômica para estadias temporárias, podendo incluir serviços básicos.")
                    .build()
    ),

    RESTAURANT(
            Category.builder()
                    .name("Restaurante")
                    .icon(HugeiconNamed.RESTAURANT.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimento dedicado à preparação e serviço de refeições, com ementa variada e serviço à mesa.")
                    .build()
    ),

    TRADITIONAL_FOOD(
            Category.builder()
                    .name("Comida Tradicional")
                    .icon(HugeiconNamed.RESTAURANT_02.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Restaurantes especializados em gastronomia típica, com pratos da culinária local e regional.")
                    .build()
    ),

    PIZZERIA(
            Category.builder()
                    .name("Pizzaria")
                    .icon(HugeiconNamed.PIZZA_01.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimento especializado em pizzas artesanais e outros pratos de inspiração italiana.")
                    .build()
    ),

    FAST_FOOD(
            Category.builder()
                    .name("Comida Rápida")
                    .icon(HugeiconNamed.HAMBURGER_01.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimentos de refeições rápidas, incluindo hamburguerias, lanchonetes e take-away.")
                    .build()
    ),

    GRILL(
            Category.builder()
                    .name("Churrasco e Grelhados")
                    .icon(HugeiconNamed.BBQ_GRILL.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Casas especializadas em grelhados, churrasco e carnes no carvão ou na brasa.")
                    .build()
    ),

    SEAFOOD(
            Category.builder()
                    .name("Marisqueira")
                    .icon(HugeiconNamed.SHELLFISH.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Restaurante focado em mariscos, peixes e frutos do mar frescos.")
                    .build()
    ),

    SUSHI(
            Category.builder()
                    .name("Restaurante de Sushi")
                    .icon(HugeiconNamed.SUSHI_01.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimento especializado em gastronomia japonesa, com sushi, sashimi e pratos orientais.")
                    .build()
    ),

    CAFE(
            Category.builder()
                    .name("Café")
                    .icon(HugeiconNamed.CAFE.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Espaço acolhedor para refeições ligeiras, bebidas, cafés e sobremesas.")
                    .build()
    ),

    BAR(
            Category.builder()
                    .name("Bar")
                    .icon(HugeiconNamed.DRINK.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimento de bebidas e petiscos, com ambiente descontraído e opções de música.")
                    .build()
    ),

    SELF_SERVICE(
            Category.builder()
                    .name("Restaurante Self-Service")
                    .icon(HugeiconNamed.RICE_BOWL_01.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Restaurante ao balcão onde o cliente se serve diretamente, com pagamento por peso ou fixo.")
                    .build()
    ),

    VEGETARIAN(
            Category.builder()
                    .name("Restaurante Vegetariano")
                    .icon(HugeiconNamed.VEGETARIAN_FOOD.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Restaurante focado em pratos vegetarianos e veganos, com ingredientes naturais e saudáveis.")
                    .build()
    ),

    BAKERY(
            Category.builder()
                    .name("Padaria e Pastelaria")
                    .icon(HugeiconNamed.CHEF_HAT.getWeb())
                    .categoryGroup(CategoryGroup.RESTAURANT)
                    .description("Estabelecimento de pães, bolos, doces e refeições ligeiras, com produção própria.")
                    .build()
    ),

    FLIGHTS(
            Category.builder()
                    .name("Voos")
                    .icon(HugeiconNamed.FLIGHTS.getWeb())
                    .categoryGroup(CategoryGroup.TOURISM)
                    .description("Seja os voos destinados para Angola e marca a sua viagem.")
                    .build()
    ),

    TRAVEL_AGENCIES(
            Category.builder()
                    .name("Agências de viagens")
                    .icon(HugeiconNamed.TRAVEL_AGENCIES.getWeb())
                    .categoryGroup(CategoryGroup.TOURISM)
                    .description("Empresas especializadas na organização de viagens, reservas de passagens e pacotes turísticos.")
                    .build()
    ),

    TOUR_GUIDE(
            Category.builder()
                    .name("Guia de Turismo")
                    .icon(HugeiconNamed.TOUR_GUIDE.getWeb())
                    .categoryGroup(CategoryGroup.TOURISM)
                    .description("Profissional credenciado encarregado de acompanhar, orientar e transmitir informações a pessoas ou grupos em itinerários turísticos.")
                    .build()
    ),

    INTERPRETER(
            Category.builder()
                    .name("Intérprete de Viagem")
                    .icon(HugeiconNamed.INTERPRETER.getWeb())
                    .categoryGroup(CategoryGroup.INTERPRETER)
                    .description("Profissional especializado na tradução e facilitação de comunicação intercultural e linguística para turistas.")
                    .build()
    );

    private final Category category;
}