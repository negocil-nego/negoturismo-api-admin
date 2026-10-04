package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TourGuideData {
    MATEUS_KALANDULA_GUIDE(
            TourGuide.builder()
                    .user(UserData.MATEUS_KALANDULA.getUser())
                    .email("mateus.kalandula@negoturismo.com")
                    .whatsapp("(+244)933456789")
                    .description("Guia turístico com 15 anos de experiência na região do Huambo e nas rotas da Serra da Leba.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/07-susa-cenab.jpg/1280px-07-susa-cenab.jpg")
                    .video("https://archive.org/download/youtube-Wjvo1k7YWRM/Wjvo1k7YWRM.mp4")
                    .build()
    ),
    JULIETA_BENGUELA_GUIDE(
            TourGuide.builder()
                    .user(UserData.JULIETA_BENGUELA.getUser())
                    .email("julieta.benguela@negoturismo.com")
                    .whatsapp("(+244)943456789")
                    .description("Guia turística com 6 anos de experiência em passeios urbanos, museus e zonas históricas de Luanda.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/20140815_183905_Richtone%28HDR%29.jpg/1280px-20140815_183905_Richtone%28HDR%29.jpg")
                    .video("https://archive.org/download/youtube-Wd8z3fdtfac/Wd8z3fdtfac.mp4")
                    .build()
    ),

    TERESA_KIALA_GUIDE(
            TourGuide.builder()
                    .user(UserData.TERESA_KIALA.getUser())
                    .email("teresa.kiala@negoturismo.com")
                    .whatsapp("(+244)97000001")
                    .description("Guia turístico com 13 anos de experiência, especializado nas rotas de Huambo e Lubango e no conhecimento da região de Huambo.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/ALISA.jpg/1280px-ALISA.jpg")
                    .video("https://archive.org/download/youtube-D5r1CZi9k-U/D5r1CZi9k-U.mp4")
                    .build()
    ),

    HUGO_BENGUELA_GUIDE(
            TourGuide.builder()
                    .user(UserData.HUGO_BENGUELA.getUser())
                    .email("hugo.benguela@negoturismo.com")
                    .whatsapp("(+244)97000002")
                    .description("Guia turístico com 9 anos de experiência, especializado nas rotas de Luanda e arredores e no conhecimento da região de Luanda.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/2023-02-27_Freundeskreis_Hannover.jpg/1280px-2023-02-27_Freundeskreis_Hannover.jpg")
                    .video("https://archive.org/download/youtube-DhUFplCV-bY/DhUFplCV-bY.mp4")
                    .build()
    ),

    OLGA_MINGAS_GUIDE(
            TourGuide.builder()
                    .user(UserData.OLGA_MINGAS.getUser())
                    .email("olga.mingas@negoturismo.com")
                    .whatsapp("(+244)97000003")
                    .description("Guia turístico com 16 anos de experiência, especializado nas rotas de Huambo, Benguela e Namibe e no conhecimento da região de Benguela.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/5/54/140315_%EA%B9%80%EC%86%8C%EC%A0%95_%ED%8C%AC%EB%AF%B8%ED%8C%85_%283%29.jpg/1280px-140315_%EA%B9%80%EC%86%8C%EC%A0%95_%ED%8C%AC%EB%AF%B8%ED%8C%85_%283%29.jpg")
                    .video("https://archive.org/download/youtube-XSKT4k6Kr34/XSKT4k6Kr34.mp4")
                    .build()
    ),

    LOURENCO_MINGAS_GUIDE(
            TourGuide.builder()
                    .user(UserData.LOURENCO_MINGAS.getUser())
                    .email("lourenco.mingas@negoturismo.com")
                    .whatsapp("(+244)97000004")
                    .description("Guia turístico com 11 anos de experiência, especializado nas rotas de Soyo, Cabinda e Zaire e no conhecimento da região de Soyo.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/2018_PM_crop_photo_1.jpg/1280px-2018_PM_crop_photo_1.jpg")
                    .video("https://archive.org/download/youtube-VMGlWsta38Y/VMGlWsta38Y.mp4")
                    .build()
    ),

    REGINA_KAMBUE_GUIDE(
            TourGuide.builder()
                    .user(UserData.REGINA_KAMBUE.getUser())
                    .email("regina.kambue@negoturismo.com")
                    .whatsapp("(+244)97000005")
                    .description("Guia turístico com 7 anos de experiência, especializado nas rotas de Luanda, Menongue e Saurimo e no conhecimento da região de Luanda.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Alex_Okoroji_Sitting.jpg/1280px-Alex_Okoroji_Sitting.jpg")
                    .video("https://archive.org/download/youtube-5UjXZLZcoN8/5UjXZLZcoN8.mp4")
                    .build()
    ),

    ISRAEL_KAMBALE_GUIDE(
            TourGuide.builder()
                    .user(UserData.ISRAEL_KAMBALE.getUser())
                    .email("israel.kambale@negoturismo.com")
                    .whatsapp("(+244)97000006")
                    .description("Guia turístico com 18 anos de experiência, especializado nas rotas de Serra da Leba e Lubango e no conhecimento da região de Lubango.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/2022-10-31-Thomas-Kilian-Berlin.jpg/1280px-2022-10-31-Thomas-Kilian-Berlin.jpg")
                    .video("https://archive.org/download/Q8acBSLKakjQvL2nT/Q8acBSLKakjQvL2nT.mp4")
                    .build()
    ),

    PALMIRA_NETO_GUIDE(
            TourGuide.builder()
                    .user(UserData.PALMIRA_NETO.getUser())
                    .email("palmira.neto@negoturismo.com")
                    .whatsapp("(+244)97000007")
                    .description("Guia turístico com 12 anos de experiência, especializado nas rotas de Ilha do Luanda e Cabo Ledo e no conhecimento da região de Luanda.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Love_is_in_the_Air_%28Unsplash%29.jpg/1280px-Love_is_in_the_Air_%28Unsplash%29.jpg")
                    .video("https://archive.org/download/factvwi-Talking_Fitchburg_Daily_Headlines_9-12-23/Talking_Fitchburg_Daily_Headlines_9-12-23.mp4")
                    .build()
    ),

    BELMIRO_NETO_GUIDE(
            TourGuide.builder()
                    .user(UserData.BELMIRO_NETO.getUser())
                    .email("belmiro.neto@negoturismo.com")
                    .whatsapp("(+244)97000008")
                    .description("Guia turístico com 20 anos de experiência, especializado nas rotas de Kwanza Sul e Huambo e no conhecimento da região de Sumbe.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/20191224_133037.pfv.jpg/1280px-20191224_133037.pfv.jpg")
                    .video("https://archive.org/download/npmma-Morning_Show_with_Mary_Jacobson_October_6th_2022_-_Suzanne_DeWitt_Hall/Morning_Show_with_Mary_Jacobson_October_6th_2022_-_Suzanne_DeWitt_Hall.mp4")
                    .build()
    ),

    ESTER_KIALA_GUIDE(
            TourGuide.builder()
                    .user(UserData.ESTER_KIALA.getUser())
                    .email("ester.kiala@negoturismo.com")
                    .whatsapp("(+244)97000009")
                    .description("Guia turístico com 8 anos de experiência, especializado nas rotas de Caxito, Kissama e Benguela e no conhecimento da região de Benguela.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Alison_Garner_-_Headshot.jpg/1280px-Alison_Garner_-_Headshot.jpg")
                    .video("https://archive.org/download/RochesterIndymedia-JeremyScahillAtNazarethCollegeApril8th2011Part1145/RochesterIndymedia-JeremyScahillAtNazarethCollegeApril8th2011Part1145_512kb.mp4")
                    .build()
    ),

    OSVALDO_KIALA_GUIDE(
            TourGuide.builder()
                    .user(UserData.OSVALDO_KIALA.getUser())
                    .email("osvaldo.kiala@negoturismo.com")
                    .whatsapp("(+244)97000010")
                    .description("Guia turístico com 15 anos de experiência, especializado nas rotas de Cuando Cubango e Namibe e no conhecimento da região de Menongue.")
                    .photo("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/1477_0004im_2006-12-07.jpg/1280px-1477_0004im_2006-12-07.jpg")
                    .video("https://archive.org/download/youtube-4TCBzrPADJw/4TCBzrPADJw.mp4")
                    .build()
    );

    private final TourGuide tourGuide;
}
