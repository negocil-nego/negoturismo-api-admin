package com.negocil.negoturismo.admin.feature.category.model;

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
                    .description("Estabelecimento destinado à hospedagem, oferecendo acomodações, conforto e diversos serviços aos hóspedes.")
                    .build()
    ),

    GUESTHOUSE(
            Category.builder()
                    .name("Pousada")
                    .icon(HugeiconNamed.GUESTHOUSE.getWeb())
                    .description("Hospedagem turística de pequeno porte, com ambiente acolhedor e atendimento mais personalizado.")
                    .build()
    ),

    ACCOMMODATION(
            Category.builder()
                    .name("Hospedaria")
                    .icon(HugeiconNamed.HOTEL_02.getWeb())
                    .description("Local de hospedagem simples e econômica para estadias temporárias, podendo incluir serviços básicos.")
                    .build()
    ),

    TRAVEL_AGENCIES(
            Category.builder()
                    .name("Agências de viagens")
                    .icon(HugeiconNamed.HOTEL_02.getWeb())
                    .description("Empresas especializadas na organização de viagens, reservas de passagens e pacotes turísticos.")
                    .build()
    );

    private final Category category;
}
