package com.negocil.negoturismo.admin.feature.review.enums;

import com.negocil.negoturismo.admin.config.seeder.faker.UserData;
import com.negocil.negoturismo.admin.feature.review.model.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReviewData {
    REVIEW_1(
            Review.builder()
                    .user(UserData.ANA_SILVA.getUser())
                    .rating(5)
                    .content("Excelente hotel! Quartos luxuosos e atendimento impecável. Recomendo a suite presidencial.")
                    .build()
    ),
    REVIEW_2(
            Review.builder()
                    .user(UserData.CARLOS_NDALU.getUser())
                    .rating(4)
                    .content("Muito bom mas o pequeno-almoço poderia ter mais opções. Vista fantástica da baía.")
                    .build()
    ),
    REVIEW_3(
            Review.builder()
                    .user(UserData.MATEUS_KALANDULA.getUser())
                    .rating(5)
                    .content("Melhor hotel de Luanda sem dúvida. Spa incrível e funcionários muito atenciosos.")
                    .build()
    ),
    REVIEW_4(
            Review.builder()
                    .user(UserData.JULIETA_BENGUELA.getUser())
                    .rating(3)
                    .content("Bom custo-benefício. Quartos limpos mas o Wi-Fi é um pouco lento.")
                    .build()
    ),
    REVIEW_5(
            Review.builder()
                    .user(UserData.ANA_SILVA.getUser())
                    .rating(4)
                    .content("Pensão acolhedora com vista magnífica. Ambiente familiar e tranquilo.")
                    .build()
    ),
    REVIEW_6(
            Review.builder()
                    .user(UserData.CARLOS_NDALU.getUser())
                    .rating(5)
                    .content("Adorei a estadia! Quartos confortáveis e a vista para a baía é deslumbrante.")
                    .build()
    ),
    REVIEW_7(
            Review.builder()
                    .user(UserData.MATEUS_KALANDULA.getUser())
                    .rating(3)
                    .content("Simples mas funcional. Bom para quem viaja a trabalho. Preço justo.")
                    .build()
    ),
    REVIEW_8(
            Review.builder()
                    .user(UserData.JULIETA_BENGUELA.getUser())
                    .rating(4)
                    .content("Ótima localização no centro do Huambo. Quartos modestos mas limpos.")
                    .build()
    ),
    REVIEW_9(
            Review.builder()
                    .user(UserData.ANA_SILVA.getUser())
                    .rating(2)
                    .content("Esperava mais pela preço cobrado. O ar condicionado fez muito barulho.")
                    .build()
    ),
    REVIEW_10(
            Review.builder()
                    .user(UserData.CARLOS_NDALU.getUser())
                    .rating(4)
                    .content("Boa experiência no geral. Recomendo para quem visita Luanda.")
                    .build()
    );

    private final Review review;
}
