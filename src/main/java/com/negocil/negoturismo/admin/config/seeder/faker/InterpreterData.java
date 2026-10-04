package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InterpreterData {
    ANA_SILVA_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.ANA_SILVA.getUser())
                    .email("ana.silva@negoturismo.com")
                    .whatsapp("(+244)923456789")
                    .description("Intérprete de inglês com 12 anos de experiência em turismo e reuniões internacionais em Luanda.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/AH8A0024_copy.jpg/1280px-AH8A0024_copy.jpg")
                    .video("https://archive.org/download/youtube-Wjvo1k7YWRM/Wjvo1k7YWRM.mp4")
                    .build()
    ),
    CARLOS_NDALU_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.CARLOS_NDALU.getUser())
                    .email("carlos.ndalu@negoturismo.com")
                    .whatsapp("(+244)912345678")
                    .description("Intérprete de francês com 8 anos de experiência em turismo e apoio a viajantes em Luanda.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/09-1325-joseph_%28cropped%29.jpg/1280px-09-1325-joseph_%28cropped%29.jpg")
                    .video("https://archive.org/download/youtube-Wd8z3fdtfac/Wd8z3fdtfac.mp4")
                    .build()
    ),

    NEUSA_KALUNGA_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.NEUSA_KALUNGA.getUser())
                    .email("neusa.kalunga@negoturismo.com")
                    .whatsapp("(+244)96000001")
                    .description("Intérprete de português com 11 anos de experiência em turismo e reuniões internacionais, a trabalhar em Luanda.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/2022-10-06_Dr._Heike_Schmidt%2C_Chefredakteurin_der_Zeitschrift_nobilis.jpg/1280px-2022-10-06_Dr._Heike_Schmidt%2C_Chefredakteurin_der_Zeitschrift_nobilis.jpg")
                    .video("https://archive.org/download/youtube-Wjvo1k7YWRM/Wjvo1k7YWRM.mp4")
                    .build()
    ),

    LISANDRO_KAMBALE_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.LISANDRO_KAMBALE.getUser())
                    .email("lisandro.kambale@negoturismo.com")
                    .whatsapp("(+244)96000002")
                    .description("Intérprete de espanhol com 9 anos de experiência em turismo e reuniões internacionais, a trabalhar em Luanda.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/20191024_Michel_Dennemont.jpg/1280px-20191024_Michel_Dennemont.jpg")
                    .video("https://archive.org/download/youtube-m6Q4ug11tO8/m6Q4ug11tO8.mp4")
                    .build()
    ),

    IVONE_BENGUELA_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.IVONE_BENGUELA.getUser())
                    .email("ivone.benguela@negoturismo.com")
                    .whatsapp("(+244)96000003")
                    .description("Intérprete de alemão com 14 anos de experiência em turismo e reuniões internacionais, a trabalhar em Benguela.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/1_DSC_3470.jpg/1280px-1_DSC_3470.jpg")
                    .video("https://archive.org/download/youtube-JG0eyQd31aQ/JG0eyQd31aQ.mp4")
                    .build()
    ),

    ILIDIO_MINGAS_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.ILIDIO_MINGAS.getUser())
                    .email("ilidio.mingas@negoturismo.com")
                    .whatsapp("(+244)96000004")
                    .description("Intérprete de italiano com 17 anos de experiência em turismo e reuniões internacionais, a trabalhar em Huambo.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/20160428_JazzFest_Nth_Power_JS-2372.jpg/1280px-20160428_JazzFest_Nth_Power_JS-2372.jpg")
                    .video("https://archive.org/download/youtube-TP-DJj-PgPw/TP-DJj-PgPw.mp4")
                    .build()
    ),

    CELESTINE_KIALA_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.CELESTINE_KIALA.getUser())
                    .email("celestine.kiala@negoturismo.com")
                    .whatsapp("(+244)96000005")
                    .description("Intérprete de russo com 8 anos de experiência em turismo e reuniões internacionais, a trabalhar em Lubango.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/A_girl_tasting_the_sun_%28415742496%29.jpg/1280px-A_girl_tasting_the_sun_%28415742496%29.jpg")
                    .video("https://archive.org/download/youtube-LhCnoVPG40I/LhCnoVPG40I.mp4")
                    .build()
    ),

    SEBASTIAO_NETO_CABRAL_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.SEBASTIAO_NETO_CABRAL.getUser())
                    .email("sebastiao.neto.cabral@negoturismo.com")
                    .whatsapp("(+244)96000006")
                    .description("Intérprete de chinês com 21 anos de experiência em turismo e reuniões internacionais, a trabalhar em Luanda.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/07092022_Adrian_Mili%C4%87evi%C4%87.jpg/1280px-07092022_Adrian_Mili%C4%87evi%C4%87.jpg")
                    .video("https://archive.org/download/youtube-SYyt9ouGNw0/SYyt9ouGNw0.mp4")
                    .build()
    ),

    EDUARDA_MINGAS_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.EDUARDA_MINGAS.getUser())
                    .email("eduarda.mingas@negoturismo.com")
                    .whatsapp("(+244)96000007")
                    .description("Intérprete de árabe com 6 anos de experiência em turismo e reuniões internacionais, a trabalhar em Cabinda.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/20211020BrookeA-417-.jpg/1280px-20211020BrookeA-417-.jpg")
                    .video("https://archive.org/download/youtube-Bkw_wqDqz4U/Bkw_wqDqz4U.mp4")
                    .build()
    ),

    NUNO_KIALA_MINGAS_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.NUNO_KIALA_MINGAS.getUser())
                    .email("nuno.kiala.mingas@negoturismo.com")
                    .whatsapp("(+244)96000008")
                    .description("Intérprete de hindi com 12 anos de experiência em turismo e reuniões internacionais, a trabalhar em Soyo.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/130424.mbeyer-clausen.1827.jpg/1280px-130424.mbeyer-clausen.1827.jpg")
                    .video("https://archive.org/download/youtube-Wd8z3fdtfac/Wd8z3fdtfac.mp4")
                    .build()
    ),

    FILOMENA_NETO_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.FILOMENA_NETO.getUser())
                    .email("filomena.neto@negoturismo.com")
                    .whatsapp("(+244)96000009")
                    .description("Intérprete de lingala com 10 anos de experiência em turismo e reuniões internacionais, a trabalhar em Malanje.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/A_very_decided_woman_%2834776122%29.jpg/1280px-A_very_decided_woman_%2834776122%29.jpg")
                    .video("https://archive.org/download/youtube-tXidZ8ffSSs/tXidZ8ffSSs.mp4")
                    .build()
    ),

    QUINTINO_KAMBUE_NETO_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.QUINTINO_KAMBUE_NETO.getUser())
                    .email("quintino.kambue.neto@negoturismo.com")
                    .whatsapp("(+244)96000010")
                    .description("Intérprete de kinyarwanda com 15 anos de experiência em turismo e reuniões internacionais, a trabalhar em Namibe.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/0nMwE7tNZRQ.jpg/1280px-0nMwE7tNZRQ.jpg")
                    .video("https://archive.org/download/youtube-NYaaDjPfhhA/NYaaDjPfhhA.mp4")
                    .build()
    ),

    GRACA_KAMBUE_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.GRACA_KAMBUE.getUser())
                    .email("graca.kambue@negoturismo.com")
                    .whatsapp("(+244)96000011")
                    .description("Intérprete de tetum com 7 anos de experiência em turismo e reuniões internacionais, a trabalhar em Menongue.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/A_very_beautiful_and_expressive_face_and_eyes_expression_%2826552373382%29.jpg/1280px-A_very_beautiful_and_expressive_face_and_eyes_expression_%2826552373382%29.jpg")
                    .video("https://archive.org/download/youtube-T_UCBxqBSU4/T_UCBxqBSU4.mp4")
                    .build()
    ),

    ULISSES_BENGUELA_INTERPRETER(
            Interpreter.builder()
                    .user(UserData.ULISSES_BENGUELA.getUser())
                    .email("ulisses.benguela@negoturismo.com")
                    .whatsapp("(+244)96000012")
                    .description("Intérprete de swahili com 19 anos de experiência em turismo e reuniões internacionais, a trabalhar em Sumbe.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/20180530_David_Austin00343-Select-16-Edit-Output-1_-_Copy.jpg/1280px-20180530_David_Austin00343-Select-16-Edit-Output-1_-_Copy.jpg")
                    .video("https://archive.org/download/youtube-m5-IAKthL6c/m5-IAKthL6c.mp4")
                    .build()
    );

    private final Interpreter interpreter;
}
