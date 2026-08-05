package com.negocil.negoturismo.admin.feature.tour_guide.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TouristAreaData {
    KALANDULA(
            "Quedas de Kalandula",
            "Malanje",
            "Kalandula, Malanje"
    ),
    TUNDAVALA(
            "Fenda da Tundavala",
            "Huíla",
            "Lubango, Huíla"
    ),
    MIRADOURO_DA_LUA(
            "Miradouro da Lua",
            "Luanda",
            "Samba, Luanda"
    ),
    SERRA_DA_LEBA(
            "Serra da Leba",
            "Namibe",
            "Estrada Lubango-Namibe, Namibe"
    );

    private final String name;
    private final String state;
    private final String address;
}
