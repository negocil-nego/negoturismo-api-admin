package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TouristAreaData {
    KALANDULA(
            TouristArea.builder()
                    .name("Quedas de Kalandula")
                    .state("Malanje")
                    .address("Kalandula, Malanje")
                    .build()
    ),
    TUNDAVALA(
            TouristArea.builder()
                    .name("Fenda da Tundavala")
                    .state("Huíla")
                    .address("Lubango, Huíla")
                    .build()
    ),
    MIRADOURO_DA_LUA(
            TouristArea.builder()
                    .name("Miradouro da Lua")
                    .state("Luanda")
                    .address("Samba, Luanda")
                    .build()
    ),
    SERRA_DA_LEBA(
            TouristArea.builder()
                    .name("Serra da Leba")
                    .state("Namibe")
                    .address("Estrada Lubango-Namibe, Namibe")
                    .build()
    );

    private final TouristArea touristArea;
}
