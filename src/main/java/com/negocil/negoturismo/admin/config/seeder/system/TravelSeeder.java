package com.negocil.negoturismo.admin.config.seeder.system;

import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.travel.enums.Country;
import com.negocil.negoturismo.admin.feature.travel.enums.TravelType;
import com.negocil.negoturismo.admin.feature.travel.model.Travel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public enum TravelSeeder {
    LUANDA_LUBANGO_FLIGHT(
            Travel.builder()
                    .city("Luanda")
                    .country(Country.ANGOLA)
                    .description("Voo direto entre Luanda e Lubango com partida pela manhã")
                    .type(TravelType.FLIGHT)
                    .departureTime(LocalDateTime.of(2026, 3, 1, 8, 30))
                    .estimatedCompletionTime(LocalDateTime.of(2026, 3, 1, 10, 15))
                    .organization(Organization.builder().name("Hotel Epic Sana Luanda").build())
                    .build()
    ),
    LUANDA_BENGUELA_FLIGHT(
            Travel.builder()
                    .city("Lisboa")
                    .country(Country.PORTUGAL)
                    .description("Voo para Benguela com ligação à costa marítima")
                    .type(TravelType.FLIGHT)
                    .departureTime(LocalDateTime.of(2026, 3, 5, 14, 0))
                    .estimatedCompletionTime(LocalDateTime.of(2026, 3, 5, 15, 40))
                    .organization(Organization.builder().name("Hotel Epic Sana Luanda").build())
                    .build()
    ),
    LUANDA_HUAMBO_INTERPROVINCIAL(
            Travel.builder()
                    .city("Moscove")
                    .country(Country.RUSSIA)
                    .description("Viagem interprovincial de Luanda ao Huambo por estrada")
                    .type(TravelType.INTERPROVINCIAL)
                    .departureTime(LocalDateTime.of(2026, 3, 10, 6, 0))
                    .estimatedCompletionTime(LocalDateTime.of(2026, 3, 10, 18, 30))
                    .organization(Organization.builder().name("Hospedaria Central do Huambo").build())
                    .build()
    ),
    HUAMBO_BIIE_INTERPROVINCIAL(
            Travel.builder()
                    .city("Huambo")
                    .country(Country.ANGOLA)
                    .description("Viagem interprovincial do Huambo até ao Bié")
                    .type(TravelType.INTERPROVINCIAL)
                    .departureTime(LocalDateTime.of(2026, 3, 12, 7, 15))
                    .estimatedCompletionTime(LocalDateTime.of(2026, 3, 12, 13, 45))
                    .organization(Organization.builder().name("Hospedaria Central do Huambo").build())
                    .build()
    ),
    MIRAMAR_NAMIBE_INTERPROVINCIAL(
            Travel.builder()
                    .city("Huambo")
                    .country(Country.ANGOLA)
                    .description("Viagem interprovincial de Luanda ao Namibe junto à Serra da Leba")
                    .type(TravelType.INTERPROVINCIAL)
                    .departureTime(LocalDateTime.of(2026, 3, 15, 5, 30))
                    .estimatedCompletionTime(LocalDateTime.of(2026, 3, 15, 19, 0))
                    .organization(Organization.builder().name("Pensão Residencial Miramar").build())
                    .build()
    ),
    LUANDA_LISBOA_FLIGHT(
            Travel.builder()
                    .city("Porto")
                    .country(Country.PORTUGAL)
                    .description("Voo internacional de Luanda para Lisboa")
                    .type(TravelType.FLIGHT)
                    .departureTime(LocalDateTime.of(2026, 4, 2, 22, 45))
                    .estimatedCompletionTime(LocalDateTime.of(2026, 4, 3, 9, 30))
                    .organization(Organization.builder().name("Hotel Epic Sana Luanda").build())
                    .build()
    ),
    LUANDA_SAO_PAULO_FLIGHT(
            Travel.builder()
                    .city("Luanda")
                    .country(Country.BRAZIL)
                    .description("Voo internacional de Luanda para São Paulo")
                    .type(TravelType.FLIGHT)
                    .departureTime(LocalDateTime.of(2026, 4, 8, 1, 20))
                    .estimatedCompletionTime(LocalDateTime.of(2026, 4, 8, 11, 55))
                    .organization(Organization.builder().name("Pensão Residencial Miramar").build())
                    .build()
    ),
    LUANDA_JOHANNESBURG_FLIGHT(
            Travel.builder()
                    .city("Pretória")
                    .country(Country.SOUTH_AFRICA)
                    .description("Voo internacional de Luanda para Johannesburg")
                    .type(TravelType.FLIGHT)
                    .departureTime(LocalDateTime.of(2026, 4, 14, 23, 10))
                    .estimatedCompletionTime(LocalDateTime.of(2026, 4, 15, 6, 40))
                    .organization(Organization.builder().name("Hotel Epic Sana Luanda").build())
                    .build()
    ),
    LUANDA_NAMIBE_FLIGHT(
            Travel.builder()
                    .city("Barcelona")
                    .country(Country.SPAIN)
                    .description("Voo doméstico de Luanda para o Namibe")
                    .type(TravelType.FLIGHT)
                    .departureTime(LocalDateTime.of(2026, 4, 20, 9, 0))
                    .estimatedCompletionTime(LocalDateTime.of(2026, 4, 20, 10, 50))
                    .organization(Organization.builder().name("Pensão Residencial Miramar").build())
                    .build()
    ),
    LUANDA_MAPUTO_FLIGHT(
            Travel.builder()
                    .city("Maputo")
                    .country(Country.MOZAMBIQUE)
                    .description("Voo internacional de Luanda para Maputo")
                    .type(TravelType.FLIGHT)
                    .departureTime(LocalDateTime.of(2026, 4, 25, 7, 45))
                    .estimatedCompletionTime(LocalDateTime.of(2026, 4, 25, 12, 5))
                    .organization(Organization.builder().name("Hospedaria Central do Huambo").build())
                    .build()
    );

    private final Travel travel;
}
