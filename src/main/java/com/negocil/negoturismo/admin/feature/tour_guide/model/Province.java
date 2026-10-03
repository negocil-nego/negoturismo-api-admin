package com.negocil.negoturismo.admin.feature.tour_guide.model;

/**
 * Províncias de Angola usadas para localizar as áreas turísticas.
 */
public enum Province {
    BENGO("Bengo"),
    BENGUELA("Benguela"),
    BIE("Bié"),
    CABINDA("Cabinda"),
    CUANDO("Cuando"),
    CUBANGO("Cubango"),
    CUANZA_NORTE("Cuanza Norte"),
    CUANZA_SUL("Cuanza Sul"),
    CUNENE("Cunene"),
    HUAMBO("Huambo"),
    HUILA("Huíla"),
    ICOLO_E_BENGO("Icolo e Bengo"),
    LUANDA("Luanda"),
    LUNDA_NORTE("Lunda Norte"),
    LUNDA_SUL("Lunda Sul"),
    MALANJE("Malanje"),
    MOXICO("Moxico"),
    MOXICO_LESTE("Moxico Leste"),
    NAMIBE("Namibe"),
    UIGE("Uíge"),
    ZAIRE("Zaire");

    private final String nome;

    Province(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
