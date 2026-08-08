package com.negocil.negoturismo.admin.feature.category.enums;

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

    FLIGHTS(
            Category.builder()
                    .name("Voos")
                    .icon(HugeiconNamed.FLIGHTS.getWeb())
                    .categoryGroup(CategoryGroup.TRAVEL)
                    .description("Seja os voos destinados para Angola e marca a sua viagem.")
                    .build()
    ),

    TRAVEL_AGENCIES(
            Category.builder()
                    .name("Agências de viagens")
                    .icon(HugeiconNamed.TRAVEL_AGENCIES.getWeb())
                    .categoryGroup(CategoryGroup.TRAVEL)
                    .description("Empresas especializadas na organização de viagens, reservas de passagens e pacotes turísticos.")
                    .build()
    ),

    TOUR_GUIDE(
            Category.builder()
                    .name("Guia de Turismo")
                    .icon(HugeiconNamed.TOUR_GUIDE.getWeb())
                    .categoryGroup(CategoryGroup.TOUR_GUIDE_OR_INTERPRETER)
                    .description("Profissional credenciado encarregado de acompanhar, orientar e transmitir informações a pessoas ou grupos em itinerários turísticos.")
                    .build()
    ),

    INTERPRETER(
            Category.builder()
                    .name("Intérprete de Viagem")
                    .icon(HugeiconNamed.INTERPRETER.getWeb())
                    .categoryGroup(CategoryGroup.TOUR_GUIDE_OR_INTERPRETER)
                    .description("Profissional especializado na tradução e facilitação de comunicação intercultural e linguística para turistas.")
                    .build()
    );

    private final Category category;
}