package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.shared.document_file.enums.FileType;
import com.negocil.negoturismo.admin.shared.document_file.model.DocumentFile;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DocumentFileData {
    EPIC_SANA_IMAGE(
            DocumentFile.builder()
                    .title("Fachada Hotel Epic Sana")
                    .url("https://images.unsplash.com/photo-1566073771259-6a8506099945?w=800")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://images.unsplash.com/photo-1566073771259-6a8506099945?w=200")
                    .description("Fotografia da fachada do Hotel Epic Sana Luanda.")
                    .build()
    ),
    EPIC_SANA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Hotel Epic Sana")
                    .url("https://images.unsplash.com/photo-1542314831-068cd1dbfeeb?w=400")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://images.unsplash.com/photo-1542314831-068cd1dbfeeb?w=200")
                    .description("Logotipo oficial do Hotel Epic Sana Luanda.")
                    .build()
    ),
    EPIC_SANA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Hotel Epic Sana")
                    .url("https://archive.org/download/youtube-I3G0emePHQA/I3G0emePHQA.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://images.unsplash.com/photo-1566073771259-6a8506099945?w=200")
                    .description("Vídeo promocional do Hotel Epic Sana Luanda.")
                    .build()
    ),
    ROOM_SINGLE_IMAGE(
            DocumentFile.builder()
                    .title("Fotografia Quarto Single Deluxe")
                    .url("https://images.unsplash.com/photo-1631049307264-da0ec9d70304?w=800")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://images.unsplash.com/photo-1631049307264-da0ec9d70304?w=200")
                    .description("Fotografia do quarto single deluxe com cama queen-size.")
                    .build()
    ),
    ROOM_SUITE_IMAGE(
            DocumentFile.builder()
                    .title("Fotografia Suite Presidencial")
                    .url("https://images.unsplash.com/photo-1578683010236-d716f9a3f461?w=800")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://images.unsplash.com/photo-1578683010236-d716f9a3f461?w=200")
                    .description("Fotografia da suite presidencial com varanda privada.")
                    .build()
    ),
    MIRAMAR_IMAGE(
            DocumentFile.builder()
                    .title("Fachada Pensão Residencial Miramar")
                    .url("https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?w=800")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?w=200")
                    .description("Fotografia da fachada da Pensão Residencial Miramar.")
                    .build()
    ),
    MIRAMAR_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pensão Residencial Miramar")
                    .url("https://images.unsplash.com/photo-1571896349842-33c89424de2d?w=400")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://images.unsplash.com/photo-1571896349842-33c89424de2d?w=200")
                    .description("Logotipo oficial da Pensão Residencial Miramar.")
                    .build()
    ),
    MIRAMAR_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Pensão Residencial Miramar")
                    .url("https://archive.org/download/youtube-Vl5JuGXTIXQ/Dream_House_Hout_Bay_Bed_and_Breakfast_Accommodation_South_Africa_-_Africa_Travel_Channel-Vl5JuGXTIXQ.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?w=200")
                    .description("Vídeo promocional da Pensão Residencial Miramar.")
                    .build()
    ),
    ROOM_DOUBLE_IMAGE(
            DocumentFile.builder()
                    .title("Fotografia Quarto Casal Standard")
                    .url("https://images.unsplash.com/photo-1590490360182-c33d955f7e4d?w=800")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://images.unsplash.com/photo-1590490360182-c33d955f7e4d?w=200")
                    .description("Fotografia do quarto de casal standard com vista para a cidade.")
                    .build()
    ),
    HUAMBO_IMAGE(
            DocumentFile.builder()
                    .title("Fachada Hospedaria Central do Huambo")
                    .url("https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?w=800")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?w=200")
                    .description("Fotografia da fachada da Hospedaria Central do Huambo.")
                    .build()
    ),
    HUAMBO_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Hospedaria Central do Huambo")
                    .url("https://images.unsplash.com/photo-1596394516093-501ba68a0ba6?w=400")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://images.unsplash.com/photo-1596394516093-501ba68a0ba6?w=200")
                    .description("Logotipo oficial da Hospedaria Central do Huambo.")
                    .build()
    ),
    HUAMBO_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Hospedaria Central do Huambo")
                    .url("https://videos.pexels.com/video-files/3571264/3571264-uhd_2560_1440_30fps.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?w=200")
                    .description("Vídeo promocional da Hospedaria Central do Huambo.")
                    .build()
    ),
    ROOM_TWIN_IMAGE(
            DocumentFile.builder()
                    .title("Fotografia Quarto Twin Simples")
                    .url("https://images.unsplash.com/photo-1595576508898-0ad5c879a061?w=800")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://images.unsplash.com/photo-1595576508898-0ad5c879a061?w=200")
                    .description("Fotografia do quarto twin com duas camas individuais.")
                    .build()
    ),

    HOTEL_BAIA_DE_LUANDA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Hotel Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Auckland_City_-_7911092658.jpg/1280px-Auckland_City_-_7911092658.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Auckland_City_-_7911092658.jpg/480px-Auckland_City_-_7911092658.jpg")
                    .description("Fotografia principal de Hotel Baía de Luanda.")
                    .build()
    ),

    HOTEL_BAIA_DE_LUANDA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Hotel Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Boulevard_Hotel_%28Neon_sign%29%2C_Miami_Beach.jpg/1280px-Boulevard_Hotel_%28Neon_sign%29%2C_Miami_Beach.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Boulevard_Hotel_%28Neon_sign%29%2C_Miami_Beach.jpg/480px-Boulevard_Hotel_%28Neon_sign%29%2C_Miami_Beach.jpg")
                    .description("Logotipo oficial de Hotel Baía de Luanda.")
                    .build()
    ),

    HOTEL_BAIA_DE_LUANDA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Hotel Baía de Luanda")
                    .url("https://archive.org/download/youtube-6nQc5QPEP_U/6nQc5QPEP_U.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Auckland_City_-_7911092658.jpg/480px-Auckland_City_-_7911092658.jpg")
                    .description("Vídeo de apresentação de Hotel Baía de Luanda.")
                    .build()
    ),

    HOTEL_MILANO_RESORT_SPA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Hotel Milano Resort & Spa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Facade_of_Huntingtower_Hotel_-_geograph.org.uk_-_4004751.jpg/1280px-Facade_of_Huntingtower_Hotel_-_geograph.org.uk_-_4004751.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Facade_of_Huntingtower_Hotel_-_geograph.org.uk_-_4004751.jpg/480px-Facade_of_Huntingtower_Hotel_-_geograph.org.uk_-_4004751.jpg")
                    .description("Fotografia principal de Hotel Milano Resort & Spa.")
                    .build()
    ),

    HOTEL_MILANO_RESORT_SPA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Hotel Milano Resort & Spa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Facade_of_new_Hotel%2C_Woolwich_-_geograph.org.uk_-_3263847.jpg/1280px-Facade_of_new_Hotel%2C_Woolwich_-_geograph.org.uk_-_3263847.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Facade_of_new_Hotel%2C_Woolwich_-_geograph.org.uk_-_3263847.jpg/480px-Facade_of_new_Hotel%2C_Woolwich_-_geograph.org.uk_-_3263847.jpg")
                    .description("Logotipo oficial de Hotel Milano Resort & Spa.")
                    .build()
    ),

    HOTEL_KALANDULA_PALACE_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Hotel Kalandula Palace")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Fa%C3%A7ade_hoist_along_the_Andaz_Hotel_of_Singapore_at_sunset.jpg/1280px-Fa%C3%A7ade_hoist_along_the_Andaz_Hotel_of_Singapore_at_sunset.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Fa%C3%A7ade_hoist_along_the_Andaz_Hotel_of_Singapore_at_sunset.jpg/480px-Fa%C3%A7ade_hoist_along_the_Andaz_Hotel_of_Singapore_at_sunset.jpg")
                    .description("Fotografia principal de Hotel Kalandula Palace.")
                    .build()
    ),

    HOTEL_KALANDULA_PALACE_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Hotel Kalandula Palace")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/db/HARD_HOTEL_partial_view_of_the_text_ORCHARD_HOTEL_written_on_the_facade_of_the_building_in_Orchard_Road_Singapore.jpg/1280px-HARD_HOTEL_partial_view_of_the_text_ORCHARD_HOTEL_written_on_the_facade_of_the_building_in_Orchard_Road_Singapore.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/db/HARD_HOTEL_partial_view_of_the_text_ORCHARD_HOTEL_written_on_the_facade_of_the_building_in_Orchard_Road_Singapore.jpg/480px-HARD_HOTEL_partial_view_of_the_text_ORCHARD_HOTEL_written_on_the_facade_of_the_building_in_Orchard_Road_Singapore.jpg")
                    .description("Logotipo oficial de Hotel Kalandula Palace.")
                    .build()
    ),

    MIRAMAR_BUSINESS_HOTEL_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Miramar Business Hotel")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/H%C3%B4tel_Dumay_-_Cour_int%C3%A9rieure_et_facade_nord.jpg/1280px-H%C3%B4tel_Dumay_-_Cour_int%C3%A9rieure_et_facade_nord.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/H%C3%B4tel_Dumay_-_Cour_int%C3%A9rieure_et_facade_nord.jpg/480px-H%C3%B4tel_Dumay_-_Cour_int%C3%A9rieure_et_facade_nord.jpg")
                    .description("Fotografia principal de Miramar Business Hotel.")
                    .build()
    ),

    MIRAMAR_BUSINESS_HOTEL_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Miramar Business Hotel")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/H%C3%B4tel_Dumay_-_Cour_int%C3%A9rieure_et_facade_ouest.jpg/1280px-H%C3%B4tel_Dumay_-_Cour_int%C3%A9rieure_et_facade_ouest.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/H%C3%B4tel_Dumay_-_Cour_int%C3%A9rieure_et_facade_ouest.jpg/480px-H%C3%B4tel_Dumay_-_Cour_int%C3%A9rieure_et_facade_ouest.jpg")
                    .description("Logotipo oficial de Miramar Business Hotel.")
                    .build()
    ),

    HOTEL_CASCADE_CITY_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Hotel Cascade City")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Nottuln%2C_Hotel_Steverburg_--_2016_--_1486.jpg/1280px-Nottuln%2C_Hotel_Steverburg_--_2016_--_1486.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Nottuln%2C_Hotel_Steverburg_--_2016_--_1486.jpg/480px-Nottuln%2C_Hotel_Steverburg_--_2016_--_1486.jpg")
                    .description("Fotografia principal de Hotel Cascade City.")
                    .build()
    ),

    HOTEL_CASCADE_CITY_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Hotel Cascade City")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Shinola_Hotel_Rayl_Building_facade.jpg/1280px-Shinola_Hotel_Rayl_Building_facade.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Shinola_Hotel_Rayl_Building_facade.jpg/480px-Shinola_Hotel_Rayl_Building_facade.jpg")
                    .description("Logotipo oficial de Hotel Cascade City.")
                    .build()
    ),

    POUSADA_VILA_HARMONY_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Pousada Vila Harmony")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Amersham_Hill_Guest_House_-_geograph.org.uk_-_1483959.jpg/1280px-Amersham_Hill_Guest_House_-_geograph.org.uk_-_1483959.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Amersham_Hill_Guest_House_-_geograph.org.uk_-_1483959.jpg/480px-Amersham_Hill_Guest_House_-_geograph.org.uk_-_1483959.jpg")
                    .description("Fotografia principal de Pousada Vila Harmony.")
                    .build()
    ),

    POUSADA_VILA_HARMONY_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pousada Vila Harmony")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Colwyn_Guest_House_-_geograph.org.uk_-_2945245.jpg/1280px-Colwyn_Guest_House_-_geograph.org.uk_-_2945245.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Colwyn_Guest_House_-_geograph.org.uk_-_2945245.jpg/480px-Colwyn_Guest_House_-_geograph.org.uk_-_2945245.jpg")
                    .description("Logotipo oficial de Pousada Vila Harmony.")
                    .build()
    ),

    POUSADA_VILA_HARMONY_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Pousada Vila Harmony")
                    .url("https://archive.org/download/youtube-vT6qh72wCZk/vT6qh72wCZk.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Amersham_Hill_Guest_House_-_geograph.org.uk_-_1483959.jpg/480px-Amersham_Hill_Guest_House_-_geograph.org.uk_-_1483959.jpg")
                    .description("Vídeo de apresentação de Pousada Vila Harmony.")
                    .build()
    ),

    POUSADA_BAIA_AZUL_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Pousada Baía Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Former_guest_house_-_geograph.org.uk_-_6632565.jpg/1280px-Former_guest_house_-_geograph.org.uk_-_6632565.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Former_guest_house_-_geograph.org.uk_-_6632565.jpg/480px-Former_guest_house_-_geograph.org.uk_-_6632565.jpg")
                    .description("Fotografia principal de Pousada Baía Azul.")
                    .build()
    ),

    POUSADA_BAIA_AZUL_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pousada Baía Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Foundation_stone_of_Guest_house_building_of_Kapurthala_02.jpg/1280px-Foundation_stone_of_Guest_house_building_of_Kapurthala_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Foundation_stone_of_Guest_house_building_of_Kapurthala_02.jpg/480px-Foundation_stone_of_Guest_house_building_of_Kapurthala_02.jpg")
                    .description("Logotipo oficial de Pousada Baía Azul.")
                    .build()
    ),

    POUSADA_RECANTO_VERDE_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Pousada Recanto Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Guest_house_building_of_Kapurthala_01.jpg/1280px-Guest_house_building_of_Kapurthala_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Guest_house_building_of_Kapurthala_01.jpg/480px-Guest_house_building_of_Kapurthala_01.jpg")
                    .description("Fotografia principal de Pousada Recanto Verde.")
                    .build()
    ),

    POUSADA_RECANTO_VERDE_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pousada Recanto Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Lawn_Old_Guest_House_IITG_Oct24_A7CR_03198.jpg/1280px-Lawn_Old_Guest_House_IITG_Oct24_A7CR_03198.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Lawn_Old_Guest_House_IITG_Oct24_A7CR_03198.jpg/480px-Lawn_Old_Guest_House_IITG_Oct24_A7CR_03198.jpg")
                    .description("Logotipo oficial de Pousada Recanto Verde.")
                    .build()
    ),

    POUSADA_SAO_KIZUA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Pousada São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Outside_C.V.Raman_Guest_House_IIT_Mandi.jpg/1280px-Outside_C.V.Raman_Guest_House_IIT_Mandi.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Outside_C.V.Raman_Guest_House_IIT_Mandi.jpg/480px-Outside_C.V.Raman_Guest_House_IIT_Mandi.jpg")
                    .description("Fotografia principal de Pousada São Kizua.")
                    .build()
    ),

    POUSADA_SAO_KIZUA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pousada São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Pranjali_guest_house_old_building_in_Kolkata_01.jpg/1280px-Pranjali_guest_house_old_building_in_Kolkata_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Pranjali_guest_house_old_building_in_Kolkata_01.jpg/480px-Pranjali_guest_house_old_building_in_Kolkata_01.jpg")
                    .description("Logotipo oficial de Pousada São Kizua.")
                    .build()
    ),

    GUEST_HOUSE_MIRAMAR_INN_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Guest House Miramar Inn")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Pranjali_guest_house_old_building_in_Kolkata_03.jpg/1280px-Pranjali_guest_house_old_building_in_Kolkata_03.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Pranjali_guest_house_old_building_in_Kolkata_03.jpg/480px-Pranjali_guest_house_old_building_in_Kolkata_03.jpg")
                    .description("Fotografia principal de Guest House Miramar Inn.")
                    .build()
    ),

    GUEST_HOUSE_MIRAMAR_INN_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Guest House Miramar Inn")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Pranjali_guest_house_old_building_in_Kolkata_04.jpg/1280px-Pranjali_guest_house_old_building_in_Kolkata_04.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Pranjali_guest_house_old_building_in_Kolkata_04.jpg/480px-Pranjali_guest_house_old_building_in_Kolkata_04.jpg")
                    .description("Logotipo oficial de Guest House Miramar Inn.")
                    .build()
    ),

    HOSPEDARIA_PROGRESSO_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Hospedaria Progresso")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Beach_Street_hostel_01.jpg/1280px-Beach_Street_hostel_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Beach_Street_hostel_01.jpg/480px-Beach_Street_hostel_01.jpg")
                    .description("Fotografia principal de Hospedaria Progresso.")
                    .build()
    ),

    HOSPEDARIA_PROGRESSO_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Hospedaria Progresso")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Beach_Street_hostel_02.jpg/1280px-Beach_Street_hostel_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Beach_Street_hostel_02.jpg/480px-Beach_Street_hostel_02.jpg")
                    .description("Logotipo oficial de Hospedaria Progresso.")
                    .build()
    ),

    HOSPEDARIA_PROGRESSO_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Hospedaria Progresso")
                    .url("https://archive.org/download/Meiniger030212_201708/Meiniger_030212.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Beach_Street_hostel_01.jpg/480px-Beach_Street_hostel_01.jpg")
                    .description("Vídeo de apresentação de Hospedaria Progresso.")
                    .build()
    ),

    HOSPEDARIA_KWANZA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Hospedaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Beach_Street_hostel_04.jpg/1280px-Beach_Street_hostel_04.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Beach_Street_hostel_04.jpg/480px-Beach_Street_hostel_04.jpg")
                    .description("Fotografia principal de Hospedaria Kwanza.")
                    .build()
    ),

    HOSPEDARIA_KWANZA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Hospedaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Beach_Street_hostel_05.jpg/1280px-Beach_Street_hostel_05.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Beach_Street_hostel_05.jpg/480px-Beach_Street_hostel_05.jpg")
                    .description("Logotipo oficial de Hospedaria Kwanza.")
                    .build()
    ),

    HOSPEDARIA_KWANZA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Hospedaria Kwanza")
                    .url("https://archive.org/download/Meiniger030212/Meiniger_030212.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Beach_Street_hostel_04.jpg/480px-Beach_Street_hostel_04.jpg")
                    .description("Vídeo de apresentação de Hospedaria Kwanza.")
                    .build()
    ),

    HOSPEDARIA_KATANGA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Hospedaria Katanga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Black_Isle_Hostel_on_Academy_Street%2C_Inverness_-_geograph.org.uk_-_5853197.jpg/1280px-Black_Isle_Hostel_on_Academy_Street%2C_Inverness_-_geograph.org.uk_-_5853197.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Black_Isle_Hostel_on_Academy_Street%2C_Inverness_-_geograph.org.uk_-_5853197.jpg/480px-Black_Isle_Hostel_on_Academy_Street%2C_Inverness_-_geograph.org.uk_-_5853197.jpg")
                    .description("Fotografia principal de Hospedaria Katanga.")
                    .build()
    ),

    HOSPEDARIA_KATANGA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Hospedaria Katanga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Bryn_Gwynant_Youth_Hostel_main_building_-_geograph.org.uk_-_2086931.jpg/1280px-Bryn_Gwynant_Youth_Hostel_main_building_-_geograph.org.uk_-_2086931.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Bryn_Gwynant_Youth_Hostel_main_building_-_geograph.org.uk_-_2086931.jpg/480px-Bryn_Gwynant_Youth_Hostel_main_building_-_geograph.org.uk_-_2086931.jpg")
                    .description("Logotipo oficial de Hospedaria Katanga.")
                    .build()
    ),

    HOSPEDARIA_NOVA_VIDA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Hospedaria Nova Vida")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/Hostel_Building_of_IERCOO.jpg/1280px-Hostel_Building_of_IERCOO.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/Hostel_Building_of_IERCOO.jpg/480px-Hostel_Building_of_IERCOO.jpg")
                    .description("Fotografia principal de Hospedaria Nova Vida.")
                    .build()
    ),

    HOSPEDARIA_NOVA_VIDA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Hospedaria Nova Vida")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Hostel_Suomenlinna.jpg/1280px-Hostel_Suomenlinna.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Hostel_Suomenlinna.jpg/480px-Hostel_Suomenlinna.jpg")
                    .description("Logotipo oficial de Hospedaria Nova Vida.")
                    .build()
    ),

    HOSPEDARIA_SAO_KIZUA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Hospedaria São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/MVGR_Boys_hostel_building.jpg/1280px-MVGR_Boys_hostel_building.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/MVGR_Boys_hostel_building.jpg/480px-MVGR_Boys_hostel_building.jpg")
                    .description("Fotografia principal de Hospedaria São Kizua.")
                    .build()
    ),

    HOSPEDARIA_SAO_KIZUA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Hospedaria São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/MVGR_Boys_hostel_dining_Hall_building.jpg/1280px-MVGR_Boys_hostel_dining_Hall_building.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/MVGR_Boys_hostel_dining_Hall_building.jpg/480px-MVGR_Boys_hostel_dining_Hall_building.jpg")
                    .description("Logotipo oficial de Hospedaria São Kizua.")
                    .build()
    ),

    RESTAURANTE_O_MUSQUETE_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Restaurante O Musquete")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Arnaud%27s_restaurant%2C_New_Orleans%2C_interior_November_2013_-_Table_setting.jpg/1280px-Arnaud%27s_restaurant%2C_New_Orleans%2C_interior_November_2013_-_Table_setting.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Arnaud%27s_restaurant%2C_New_Orleans%2C_interior_November_2013_-_Table_setting.jpg/480px-Arnaud%27s_restaurant%2C_New_Orleans%2C_interior_November_2013_-_Table_setting.jpg")
                    .description("Fotografia principal de Restaurante O Musquete.")
                    .build()
    ),

    RESTAURANTE_O_MUSQUETE_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Restaurante O Musquete")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Empty_restaurant_interior_HC08164.jpg/1280px-Empty_restaurant_interior_HC08164.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Empty_restaurant_interior_HC08164.jpg/480px-Empty_restaurant_interior_HC08164.jpg")
                    .description("Logotipo oficial de Restaurante O Musquete.")
                    .build()
    ),

    RESTAURANTE_O_MUSQUETE_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Restaurante O Musquete")
                    .url("https://archive.org/download/tvc22on-Half_Hour_of_Flavor_S2_E2/Half_Hour_of_Flavor_S2_E2.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Arnaud%27s_restaurant%2C_New_Orleans%2C_interior_November_2013_-_Table_setting.jpg/480px-Arnaud%27s_restaurant%2C_New_Orleans%2C_interior_November_2013_-_Table_setting.jpg")
                    .description("Vídeo de apresentação de Restaurante O Musquete.")
                    .build()
    ),

    RESTAURANTE_MAR_E_TERRA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Restaurante Mar e Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/HK_SW_%E4%B8%8A%E7%92%B0_Sheung_Wan_%E6%98%9F%E6%9C%88%E6%A8%93_Sky_Cuisine_Restaurant_interior_tables_n_seats_March_2023_Px3_02.jpg/1280px-HK_SW_%E4%B8%8A%E7%92%B0_Sheung_Wan_%E6%98%9F%E6%9C%88%E6%A8%93_Sky_Cuisine_Restaurant_interior_tables_n_seats_March_2023_Px3_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/HK_SW_%E4%B8%8A%E7%92%B0_Sheung_Wan_%E6%98%9F%E6%9C%88%E6%A8%93_Sky_Cuisine_Restaurant_interior_tables_n_seats_March_2023_Px3_02.jpg/480px-HK_SW_%E4%B8%8A%E7%92%B0_Sheung_Wan_%E6%98%9F%E6%9C%88%E6%A8%93_Sky_Cuisine_Restaurant_interior_tables_n_seats_March_2023_Px3_02.jpg")
                    .description("Fotografia principal de Restaurante Mar e Terra.")
                    .build()
    ),

    RESTAURANTE_MAR_E_TERRA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Restaurante Mar e Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Interior%2C_Lil_Dizzy%27s_restaurant%2C_New_Orleans%2C_September_2012.jpg/1280px-Interior%2C_Lil_Dizzy%27s_restaurant%2C_New_Orleans%2C_September_2012.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Interior%2C_Lil_Dizzy%27s_restaurant%2C_New_Orleans%2C_September_2012.jpg/480px-Interior%2C_Lil_Dizzy%27s_restaurant%2C_New_Orleans%2C_September_2012.jpg")
                    .description("Logotipo oficial de Restaurante Mar e Terra.")
                    .build()
    ),

    RESTAURANTE_MAR_E_TERRA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Restaurante Mar e Terra")
                    .url("https://archive.org/download/detvde-DETV_presents_Reuben_s_Indian_Kitchen_-_Kheer_an_Indian_Rice_Pudding/DETV_presents_Reuben_s_Indian_Kitchen_-_Kheer_an_Indian_Rice_Pudding.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/HK_SW_%E4%B8%8A%E7%92%B0_Sheung_Wan_%E6%98%9F%E6%9C%88%E6%A8%93_Sky_Cuisine_Restaurant_interior_tables_n_seats_March_2023_Px3_02.jpg/480px-HK_SW_%E4%B8%8A%E7%92%B0_Sheung_Wan_%E6%98%9F%E6%9C%88%E6%A8%93_Sky_Cuisine_Restaurant_interior_tables_n_seats_March_2023_Px3_02.jpg")
                    .description("Vídeo de apresentação de Restaurante Mar e Terra.")
                    .build()
    ),

    RESTAURANTE_KWANZA_LIVING_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Restaurante Kwanza Living")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Restaurant_N%C3%A4sinneula.jpg/1280px-Restaurant_N%C3%A4sinneula.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Restaurant_N%C3%A4sinneula.jpg/480px-Restaurant_N%C3%A4sinneula.jpg")
                    .description("Fotografia principal de Restaurante Kwanza Living.")
                    .build()
    ),

    RESTAURANTE_KWANZA_LIVING_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Restaurante Kwanza Living")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_03.jpg/1280px-HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_03.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_03.jpg/480px-HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_03.jpg")
                    .description("Logotipo oficial de Restaurante Kwanza Living.")
                    .build()
    ),

    RESTAURANTE_SABOR_ANGOLANO_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Restaurante Sabor Angolano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_05.jpg/1280px-HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_05.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_05.jpg/480px-HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_05.jpg")
                    .description("Fotografia principal de Restaurante Sabor Angolano.")
                    .build()
    ),

    RESTAURANTE_SABOR_ANGOLANO_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Restaurante Sabor Angolano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_06.jpg/1280px-HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_06.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_06.jpg/480px-HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_06.jpg")
                    .description("Logotipo oficial de Restaurante Sabor Angolano.")
                    .build()
    ),

    RESTAURANTE_TALATONA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Restaurante Talatona")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_08.jpg/1280px-HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_08.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_08.jpg/480px-HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_08.jpg")
                    .description("Fotografia principal de Restaurante Talatona.")
                    .build()
    ),

    RESTAURANTE_TALATONA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Restaurante Talatona")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_09.jpg/1280px-HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_09.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_09.jpg/480px-HK_SKD_Sai_Kung_Po_Lam_MCP_One_Shopping_Mall_%E5%A4%A7%E5%BF%AB%E6%B4%BB_Fairwood_Restaurant_interior_furniture_tables_n_chairs_July_2026_N13P_09.jpg")
                    .description("Logotipo oficial de Restaurante Talatona.")
                    .build()
    ),

    CANTINHO_DA_MAE_ANGOLA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Cantinho da Mãe Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/African_restaurant_in_Manchester_UK.jpg/1280px-African_restaurant_in_Manchester_UK.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/African_restaurant_in_Manchester_UK.jpg/480px-African_restaurant_in_Manchester_UK.jpg")
                    .description("Fotografia principal de Cantinho da Mãe Angola.")
                    .build()
    ),

    CANTINHO_DA_MAE_ANGOLA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Cantinho da Mãe Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Beautiful_Nigerian_Restaurant.jpg/1280px-Beautiful_Nigerian_Restaurant.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Beautiful_Nigerian_Restaurant.jpg/480px-Beautiful_Nigerian_Restaurant.jpg")
                    .description("Logotipo oficial de Cantinho da Mãe Angola.")
                    .build()
    ),

    CANTINHO_DA_MAE_ANGOLA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Cantinho da Mãe Angola")
                    .url("https://archive.org/download/connections7thelongchainreel1/connections7thelongchainreel2-02.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/African_restaurant_in_Manchester_UK.jpg/480px-African_restaurant_in_Manchester_UK.jpg")
                    .description("Vídeo de apresentação de Cantinho da Mãe Angola.")
                    .build()
    ),

    SABORES_DA_NOSSA_TERRA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Sabores da Nossa Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Int%C3%A9rieur_d%27un_restaurant_%C3%A0_Man.jpg/1280px-Int%C3%A9rieur_d%27un_restaurant_%C3%A0_Man.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Int%C3%A9rieur_d%27un_restaurant_%C3%A0_Man.jpg/480px-Int%C3%A9rieur_d%27un_restaurant_%C3%A0_Man.jpg")
                    .description("Fotografia principal de Sabores da Nossa Terra.")
                    .build()
    ),

    SABORES_DA_NOSSA_TERRA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Sabores da Nossa Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Katkout_Restaurant%2C_Omdurman_-_%D9%85%D8%B7%D8%B9%D9%85_%D9%83%D8%AA%D9%83%D9%88%D8%AA_%2C_%D8%A7%D9%85%D8%AF%D8%B1%D9%85%D8%A7%D9%86.JPG/1280px-Katkout_Restaurant%2C_Omdurman_-_%D9%85%D8%B7%D8%B9%D9%85_%D9%83%D8%AA%D9%83%D9%88%D8%AA_%2C_%D8%A7%D9%85%D8%AF%D8%B1%D9%85%D8%A7%D9%86.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Katkout_Restaurant%2C_Omdurman_-_%D9%85%D8%B7%D8%B9%D9%85_%D9%83%D8%AA%D9%83%D9%88%D8%AA_%2C_%D8%A7%D9%85%D8%AF%D8%B1%D9%85%D8%A7%D9%86.JPG/480px-Katkout_Restaurant%2C_Omdurman_-_%D9%85%D8%B7%D8%B9%D9%85_%D9%83%D8%AA%D9%83%D9%88%D8%AA_%2C_%D8%A7%D9%85%D8%AF%D8%B1%D9%85%D8%A7%D9%86.JPG")
                    .description("Logotipo oficial de Sabores da Nossa Terra.")
                    .build()
    ),

    SABORES_DA_NOSSA_TERRA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Sabores da Nossa Terra")
                    .url("https://archive.org/download/xd-35284-food-and-drugs-vwr/XD35284+Food+And+Drugs_vwr.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Int%C3%A9rieur_d%27un_restaurant_%C3%A0_Man.jpg/480px-Int%C3%A9rieur_d%27un_restaurant_%C3%A0_Man.jpg")
                    .description("Vídeo de apresentação de Sabores da Nossa Terra.")
                    .build()
    ),

    TASCA_DO_MUAMBA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Tasca do Muamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/Restaurant_wall_art_Dakar_with_Senegalese_couscous_thi%C3%A8r%C3%A9_platter.jpg/1280px-Restaurant_wall_art_Dakar_with_Senegalese_couscous_thi%C3%A8r%C3%A9_platter.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/Restaurant_wall_art_Dakar_with_Senegalese_couscous_thi%C3%A8r%C3%A9_platter.jpg/480px-Restaurant_wall_art_Dakar_with_Senegalese_couscous_thi%C3%A8r%C3%A9_platter.jpg")
                    .description("Fotografia principal de Tasca do Muamba.")
                    .build()
    ),

    TASCA_DO_MUAMBA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Tasca do Muamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Uniondale%2C_the_old_mill_interior_of_restaurant.JPG/1280px-Uniondale%2C_the_old_mill_interior_of_restaurant.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Uniondale%2C_the_old_mill_interior_of_restaurant.JPG/480px-Uniondale%2C_the_old_mill_interior_of_restaurant.JPG")
                    .description("Logotipo oficial de Tasca do Muamba.")
                    .build()
    ),

    COZINHA_DO_KILAMBA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Cozinha do Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Wimpy_South_Africa_interior.jpg/1280px-Wimpy_South_Africa_interior.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Wimpy_South_Africa_interior.jpg/480px-Wimpy_South_Africa_interior.jpg")
                    .description("Fotografia principal de Cozinha do Kilamba.")
                    .build()
    ),

    COZINHA_DO_KILAMBA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Cozinha do Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Baganda_peanut_stew_%28Ekinyeebwa%29_03.jpg/1280px-Baganda_peanut_stew_%28Ekinyeebwa%29_03.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Baganda_peanut_stew_%28Ekinyeebwa%29_03.jpg/480px-Baganda_peanut_stew_%28Ekinyeebwa%29_03.jpg")
                    .description("Logotipo oficial de Cozinha do Kilamba.")
                    .build()
    ),

    SOLAR_DO_KWANZA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Solar do Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Baganda_peanut_stew_%28Ekinyeebwa%29_06.jpg/1280px-Baganda_peanut_stew_%28Ekinyeebwa%29_06.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Baganda_peanut_stew_%28Ekinyeebwa%29_06.jpg/480px-Baganda_peanut_stew_%28Ekinyeebwa%29_06.jpg")
                    .description("Fotografia principal de Solar do Kwanza.")
                    .build()
    ),

    SOLAR_DO_KWANZA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Solar do Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Baganda_peanut_stew_%28Ekinyeebwa%29_07.jpg/1280px-Baganda_peanut_stew_%28Ekinyeebwa%29_07.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Baganda_peanut_stew_%28Ekinyeebwa%29_07.jpg/480px-Baganda_peanut_stew_%28Ekinyeebwa%29_07.jpg")
                    .description("Logotipo oficial de Solar do Kwanza.")
                    .build()
    ),

    PIZZERIA_NAPOLI_LUANDA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Pizzeria Napoli Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/20090121_Pizzeria_Italia_Groningen_NL.jpg/1280px-20090121_Pizzeria_Italia_Groningen_NL.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/20090121_Pizzeria_Italia_Groningen_NL.jpg/480px-20090121_Pizzeria_Italia_Groningen_NL.jpg")
                    .description("Fotografia principal de Pizzeria Napoli Luanda.")
                    .build()
    ),

    PIZZERIA_NAPOLI_LUANDA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pizzeria Napoli Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Brozinni_Pizzeria_-_October_2023_-_Sarah_Stierch_03.jpg/1280px-Brozinni_Pizzeria_-_October_2023_-_Sarah_Stierch_03.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Brozinni_Pizzeria_-_October_2023_-_Sarah_Stierch_03.jpg/480px-Brozinni_Pizzeria_-_October_2023_-_Sarah_Stierch_03.jpg")
                    .description("Logotipo oficial de Pizzeria Napoli Luanda.")
                    .build()
    ),

    PIZZERIA_NAPOLI_LUANDA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Pizzeria Napoli Luanda")
                    .url("https://archive.org/download/stltvmo-Not_Your_Ordinary_Pizza_-_Press_Pizza_and_Pasta_on_In_The_Kitchen/Not_Your_Ordinary_Pizza_-_Press_Pizza_and_Pasta_on_In_The_Kitchen.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/20090121_Pizzeria_Italia_Groningen_NL.jpg/480px-20090121_Pizzeria_Italia_Groningen_NL.jpg")
                    .description("Vídeo de apresentação de Pizzeria Napoli Luanda.")
                    .build()
    ),

    PIZZERIA_FORNO_ANGOLA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Pizzeria Forno Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Cafe_Deco_Pizzeria_Interior_Photo.jpg/1280px-Cafe_Deco_Pizzeria_Interior_Photo.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Cafe_Deco_Pizzeria_Interior_Photo.jpg/480px-Cafe_Deco_Pizzeria_Interior_Photo.jpg")
                    .description("Fotografia principal de Pizzeria Forno Angola.")
                    .build()
    ),

    PIZZERIA_FORNO_ANGOLA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pizzeria Forno Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Ennis_-_3_Barrack_Street_-_Numero_Uno_Pizzeria_Interior_-_geograph.org.uk_-_3070065.jpg/1280px-Ennis_-_3_Barrack_Street_-_Numero_Uno_Pizzeria_Interior_-_geograph.org.uk_-_3070065.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Ennis_-_3_Barrack_Street_-_Numero_Uno_Pizzeria_Interior_-_geograph.org.uk_-_3070065.jpg/480px-Ennis_-_3_Barrack_Street_-_Numero_Uno_Pizzeria_Interior_-_geograph.org.uk_-_3070065.jpg")
                    .description("Logotipo oficial de Pizzeria Forno Angola.")
                    .build()
    ),

    PIZZERIA_FORNO_ANGOLA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Pizzeria Forno Angola")
                    .url("https://archive.org/download/youtube-fcIm3fuZOns/fcIm3fuZOns.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Cafe_Deco_Pizzeria_Interior_Photo.jpg/480px-Cafe_Deco_Pizzeria_Interior_Photo.jpg")
                    .description("Vídeo de apresentação de Pizzeria Forno Angola.")
                    .build()
    ),

    PIZZERIA_MSLICE_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Pizzeria Mslice")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Margherita_Pizza_of_The_Point_Pizza_and_Point.jpg/1280px-Margherita_Pizza_of_The_Point_Pizza_and_Point.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Margherita_Pizza_of_The_Point_Pizza_and_Point.jpg/480px-Margherita_Pizza_of_The_Point_Pizza_and_Point.jpg")
                    .description("Fotografia principal de Pizzeria Mslice.")
                    .build()
    ),

    PIZZERIA_MSLICE_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pizzeria Mslice")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Margherita_pizza_%285209912131%29.jpg/1280px-Margherita_pizza_%285209912131%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Margherita_pizza_%285209912131%29.jpg/480px-Margherita_pizza_%285209912131%29.jpg")
                    .description("Logotipo oficial de Pizzeria Mslice.")
                    .build()
    ),

    PIZZERIA_MANGUERINHA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Pizzeria Manguerinha")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Pepperoni_Pizza_-_Greggs_2024-03-16.jpg/1280px-Pepperoni_Pizza_-_Greggs_2024-03-16.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Pepperoni_Pizza_-_Greggs_2024-03-16.jpg/480px-Pepperoni_Pizza_-_Greggs_2024-03-16.jpg")
                    .description("Fotografia principal de Pizzeria Manguerinha.")
                    .build()
    ),

    PIZZERIA_MANGUERINHA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pizzeria Manguerinha")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Pepperoni_Pizza_from_Fellini%E2%80%99s_Pizza.jpg/1280px-Pepperoni_Pizza_from_Fellini%E2%80%99s_Pizza.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Pepperoni_Pizza_from_Fellini%E2%80%99s_Pizza.jpg/480px-Pepperoni_Pizza_from_Fellini%E2%80%99s_Pizza.jpg")
                    .description("Logotipo oficial de Pizzeria Manguerinha.")
                    .build()
    ),

    PIZZERIA_BELLA_VISTA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Pizzeria Bella Vista")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Pepperoni_pizza_2.jpg/1280px-Pepperoni_pizza_2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Pepperoni_pizza_2.jpg/480px-Pepperoni_pizza_2.jpg")
                    .description("Fotografia principal de Pizzeria Bella Vista.")
                    .build()
    ),

    PIZZERIA_BELLA_VISTA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pizzeria Bella Vista")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Pepperoni_pizza_3.jpg/1280px-Pepperoni_pizza_3.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Pepperoni_pizza_3.jpg/480px-Pepperoni_pizza_3.jpg")
                    .description("Logotipo oficial de Pizzeria Bella Vista.")
                    .build()
    ),

    SNACK_BAR_O_PONTO_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Snack Bar O Ponto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/A_Bojangles_fast_food_restaurant_in_Hiawassee%2C_Georgia%2C_United_States_01.jpg/1280px-A_Bojangles_fast_food_restaurant_in_Hiawassee%2C_Georgia%2C_United_States_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/A_Bojangles_fast_food_restaurant_in_Hiawassee%2C_Georgia%2C_United_States_01.jpg/480px-A_Bojangles_fast_food_restaurant_in_Hiawassee%2C_Georgia%2C_United_States_01.jpg")
                    .description("Fotografia principal de Snack Bar O Ponto.")
                    .build()
    ),

    SNACK_BAR_O_PONTO_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Snack Bar O Ponto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Exterior_of_a_modern_Taco_Bell_fast_food_restaurant_chain_location_in_Murphy%2C_North_Carolina_01.jpg/1280px-Exterior_of_a_modern_Taco_Bell_fast_food_restaurant_chain_location_in_Murphy%2C_North_Carolina_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Exterior_of_a_modern_Taco_Bell_fast_food_restaurant_chain_location_in_Murphy%2C_North_Carolina_01.jpg/480px-Exterior_of_a_modern_Taco_Bell_fast_food_restaurant_chain_location_in_Murphy%2C_North_Carolina_01.jpg")
                    .description("Logotipo oficial de Snack Bar O Ponto.")
                    .build()
    ),

    SNACK_BAR_O_PONTO_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Snack Bar O Ponto")
                    .url("https://archive.org/download/youtube-7-TNx2cA73g/7-TNx2cA73g.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/A_Bojangles_fast_food_restaurant_in_Hiawassee%2C_Georgia%2C_United_States_01.jpg/480px-A_Bojangles_fast_food_restaurant_in_Hiawassee%2C_Georgia%2C_United_States_01.jpg")
                    .description("Vídeo de apresentação de Snack Bar O Ponto.")
                    .build()
    ),

    BURGER_STATION_LUANDA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Burger Station Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Fast_food_outlets_-_geograph.org.uk_-_676197.jpg/1280px-Fast_food_outlets_-_geograph.org.uk_-_676197.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Fast_food_outlets_-_geograph.org.uk_-_676197.jpg/480px-Fast_food_outlets_-_geograph.org.uk_-_676197.jpg")
                    .description("Fotografia principal de Burger Station Luanda.")
                    .build()
    ),

    BURGER_STATION_LUANDA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Burger Station Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Fast_food_restaurant%2C_Elgin_-_geograph.org.uk_-_4086868.jpg/1280px-Fast_food_restaurant%2C_Elgin_-_geograph.org.uk_-_4086868.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Fast_food_restaurant%2C_Elgin_-_geograph.org.uk_-_4086868.jpg/480px-Fast_food_restaurant%2C_Elgin_-_geograph.org.uk_-_4086868.jpg")
                    .description("Logotipo oficial de Burger Station Luanda.")
                    .build()
    ),

    BURGER_STATION_LUANDA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Burger Station Luanda")
                    .url("https://archive.org/download/youtube-4yTpLEeDXS4/4yTpLEeDXS4.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Fast_food_outlets_-_geograph.org.uk_-_676197.jpg/480px-Fast_food_outlets_-_geograph.org.uk_-_676197.jpg")
                    .description("Vídeo de apresentação de Burger Station Luanda.")
                    .build()
    ),

    FAST_FOOD_KWANZA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Fast Food Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/Fast_food_restaurant%2C_Oversley_Mill_services_-_geograph.org.uk_-_3752179.jpg/1280px-Fast_food_restaurant%2C_Oversley_Mill_services_-_geograph.org.uk_-_3752179.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/Fast_food_restaurant%2C_Oversley_Mill_services_-_geograph.org.uk_-_3752179.jpg/480px-Fast_food_restaurant%2C_Oversley_Mill_services_-_geograph.org.uk_-_3752179.jpg")
                    .description("Fotografia principal de Fast Food Kwanza.")
                    .build()
    ),

    FAST_FOOD_KWANZA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Fast Food Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Fast_food_restaurant_at_Cullompton_Services_-_geograph.org.uk_-_1075192.jpg/1280px-Fast_food_restaurant_at_Cullompton_Services_-_geograph.org.uk_-_1075192.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Fast_food_restaurant_at_Cullompton_Services_-_geograph.org.uk_-_1075192.jpg/480px-Fast_food_restaurant_at_Cullompton_Services_-_geograph.org.uk_-_1075192.jpg")
                    .description("Logotipo oficial de Fast Food Kwanza.")
                    .build()
    ),

    LANCHES_DO_MIRAMAR_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Lanches do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Fast_food_restaurant_in_iran.jpg/1280px-Fast_food_restaurant_in_iran.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Fast_food_restaurant_in_iran.jpg/480px-Fast_food_restaurant_in_iran.jpg")
                    .description("Fotografia principal de Lanches do Miramar.")
                    .build()
    ),

    LANCHES_DO_MIRAMAR_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Lanches do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/A_Bojangles_fast_food_restaurant_in_Hiawassee%2C_Georgia%2C_United_States_02.jpg/1280px-A_Bojangles_fast_food_restaurant_in_Hiawassee%2C_Georgia%2C_United_States_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/A_Bojangles_fast_food_restaurant_in_Hiawassee%2C_Georgia%2C_United_States_02.jpg/480px-A_Bojangles_fast_food_restaurant_in_Hiawassee%2C_Georgia%2C_United_States_02.jpg")
                    .description("Logotipo oficial de Lanches do Miramar.")
                    .build()
    ),

    FOOD_TRUCK_TAXI_AZUL_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Food Truck Táxi Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Burger_Drwala_in_McDonald%27s%2C_winter_2024_2025%2C_%28from_left%29_the_cranberry_version_and_the_classic_one%2C_Gliwice%2C_Silesian_Voivodeship%2C_Poland%2C_January_2025.jpg/1280px-Burger_Drwala_in_McDonald%27s%2C_winter_2024_2025%2C_%28from_left%29_the_cranberry_version_and_the_classic_one%2C_Gliwice%2C_Silesian_Voivodeship%2C_Poland%2C_January_2025.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Burger_Drwala_in_McDonald%27s%2C_winter_2024_2025%2C_%28from_left%29_the_cranberry_version_and_the_classic_one%2C_Gliwice%2C_Silesian_Voivodeship%2C_Poland%2C_January_2025.jpg/480px-Burger_Drwala_in_McDonald%27s%2C_winter_2024_2025%2C_%28from_left%29_the_cranberry_version_and_the_classic_one%2C_Gliwice%2C_Silesian_Voivodeship%2C_Poland%2C_January_2025.jpg")
                    .description("Fotografia principal de Food Truck Táxi Azul.")
                    .build()
    ),

    FOOD_TRUCK_TAXI_AZUL_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Food Truck Táxi Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Classic_American_Diner.jpg/1280px-Classic_American_Diner.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Classic_American_Diner.jpg/480px-Classic_American_Diner.jpg")
                    .description("Logotipo oficial de Food Truck Táxi Azul.")
                    .build()
    ),

    CHURRASQUEIRA_DO_ZE_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Churrasqueira do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/A_plate_of_Texas_barbecue_served_at_Goldee%E2%80%99s_Barbecue_in_Fort_Worth%2C_Texas.jpg/1280px-A_plate_of_Texas_barbecue_served_at_Goldee%E2%80%99s_Barbecue_in_Fort_Worth%2C_Texas.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/A_plate_of_Texas_barbecue_served_at_Goldee%E2%80%99s_Barbecue_in_Fort_Worth%2C_Texas.jpg/480px-A_plate_of_Texas_barbecue_served_at_Goldee%E2%80%99s_Barbecue_in_Fort_Worth%2C_Texas.jpg")
                    .description("Fotografia principal de Churrasqueira do Zé.")
                    .build()
    ),

    CHURRASQUEIRA_DO_ZE_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Churrasqueira do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Allen_%26_Son_Barbecue_%285165581564%29.jpg/1280px-Allen_%26_Son_Barbecue_%285165581564%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Allen_%26_Son_Barbecue_%285165581564%29.jpg/480px-Allen_%26_Son_Barbecue_%285165581564%29.jpg")
                    .description("Logotipo oficial de Churrasqueira do Zé.")
                    .build()
    ),

    CHURRASQUEIRA_DO_ZE_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Churrasqueira do Zé")
                    .url("https://archive.org/download/Cost_of_4th_of_July_Cookouts_Increase/Cost_of_4th_of_July_Cookouts_Increase.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/A_plate_of_Texas_barbecue_served_at_Goldee%E2%80%99s_Barbecue_in_Fort_Worth%2C_Texas.jpg/480px-A_plate_of_Texas_barbecue_served_at_Goldee%E2%80%99s_Barbecue_in_Fort_Worth%2C_Texas.jpg")
                    .description("Vídeo de apresentação de Churrasqueira do Zé.")
                    .build()
    ),

    GRELHADOS_MIUDOS_KIZUA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Grelhados Miúdos Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Barbecue_grill_table.jpg/1280px-Barbecue_grill_table.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Barbecue_grill_table.jpg/480px-Barbecue_grill_table.jpg")
                    .description("Fotografia principal de Grelhados Miúdos Kizua.")
                    .build()
    ),

    GRELHADOS_MIUDOS_KIZUA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Grelhados Miúdos Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Billy_Jack%27s_BBQ%2C_Jacksonville_%28Florida%29.jpg/1280px-Billy_Jack%27s_BBQ%2C_Jacksonville_%28Florida%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Billy_Jack%27s_BBQ%2C_Jacksonville_%28Florida%29.jpg/480px-Billy_Jack%27s_BBQ%2C_Jacksonville_%28Florida%29.jpg")
                    .description("Logotipo oficial de Grelhados Miúdos Kizua.")
                    .build()
    ),

    GRELHADOS_MIUDOS_KIZUA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Grelhados Miúdos Kizua")
                    .url("https://archive.org/download/youtube-qt_rPBkdtQc/qt_rPBkdtQc.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Barbecue_grill_table.jpg/480px-Barbecue_grill_table.jpg")
                    .description("Vídeo de apresentação de Grelhados Miúdos Kizua.")
                    .build()
    ),

    ESPETOS_DA_BAIA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Espetos da Baía")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/DFC_2244_Juicy_grilled_steak_smothered_in_savory_brown_gravy_served_with_roasted_potatoes_saut%C3%A9ed_vegetables_and_a_crisp_mixed_salad.jpg/1280px-DFC_2244_Juicy_grilled_steak_smothered_in_savory_brown_gravy_served_with_roasted_potatoes_saut%C3%A9ed_vegetables_and_a_crisp_mixed_salad.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/DFC_2244_Juicy_grilled_steak_smothered_in_savory_brown_gravy_served_with_roasted_potatoes_saut%C3%A9ed_vegetables_and_a_crisp_mixed_salad.jpg/480px-DFC_2244_Juicy_grilled_steak_smothered_in_savory_brown_gravy_served_with_roasted_potatoes_saut%C3%A9ed_vegetables_and_a_crisp_mixed_salad.jpg")
                    .description("Fotografia principal de Espetos da Baía.")
                    .build()
    ),

    ESPETOS_DA_BAIA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Espetos da Baía")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/DFC_2288_Juicy_grilled_steak_with_creamy_mashed_potatoes_and_a_colorful_garden_salad_served_with_rich_gravy_on_the_side.jpg/1280px-DFC_2288_Juicy_grilled_steak_with_creamy_mashed_potatoes_and_a_colorful_garden_salad_served_with_rich_gravy_on_the_side.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/DFC_2288_Juicy_grilled_steak_with_creamy_mashed_potatoes_and_a_colorful_garden_salad_served_with_rich_gravy_on_the_side.jpg/480px-DFC_2288_Juicy_grilled_steak_with_creamy_mashed_potatoes_and_a_colorful_garden_salad_served_with_rich_gravy_on_the_side.jpg")
                    .description("Logotipo oficial de Espetos da Baía.")
                    .build()
    ),

    CHURRASCO_KING_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Churrasco King")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flickr_wordridden_3397801155--Chicken_fried_steak.jpg/1280px-Flickr_wordridden_3397801155--Chicken_fried_steak.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flickr_wordridden_3397801155--Chicken_fried_steak.jpg/480px-Flickr_wordridden_3397801155--Chicken_fried_steak.jpg")
                    .description("Fotografia principal de Churrasco King.")
                    .build()
    ),

    CHURRASCO_KING_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Churrasco King")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Grilled_steak_served_on_a_plate_with_avocado_and_sauce.jpg/1280px-Grilled_steak_served_on_a_plate_with_avocado_and_sauce.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Grilled_steak_served_on_a_plate_with_avocado_and_sauce.jpg/480px-Grilled_steak_served_on_a_plate_with_avocado_and_sauce.jpg")
                    .description("Logotipo oficial de Churrasco King.")
                    .build()
    ),

    GRELHADO_DA_CASA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Grelhado da Casa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Man_prepares_to_grill.jpg/1280px-Man_prepares_to_grill.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Man_prepares_to_grill.jpg/480px-Man_prepares_to_grill.jpg")
                    .description("Fotografia principal de Grelhado da Casa.")
                    .build()
    ),

    GRELHADO_DA_CASA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Grelhado da Casa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Grilled_chicken_and_risotto.jpg/1280px-Grilled_chicken_and_risotto.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Grilled_chicken_and_risotto.jpg/480px-Grilled_chicken_and_risotto.jpg")
                    .description("Logotipo oficial de Grelhado da Casa.")
                    .build()
    ),

    MARISQUEIRA_BAIA_DE_LUANDA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Marisqueira Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_01.jpg/1280px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_01.jpg/480px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_01.jpg")
                    .description("Fotografia principal de Marisqueira Baía de Luanda.")
                    .build()
    ),

    MARISQUEIRA_BAIA_DE_LUANDA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Marisqueira Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Aberdeen_Seafood%2C_Kings_Road%2C_Brighton_2025-09-08.jpg/1280px-Aberdeen_Seafood%2C_Kings_Road%2C_Brighton_2025-09-08.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Aberdeen_Seafood%2C_Kings_Road%2C_Brighton_2025-09-08.jpg/480px-Aberdeen_Seafood%2C_Kings_Road%2C_Brighton_2025-09-08.jpg")
                    .description("Logotipo oficial de Marisqueira Baía de Luanda.")
                    .build()
    ),

    MARISQUEIRA_BAIA_DE_LUANDA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Marisqueira Baía de Luanda")
                    .url("https://archive.org/download/whhisc-RESTAURANT_SHOW_Sea_Eagle_Market_-_Bourbon_Glazed_Shrimp_9-22-2016_Only_on_WHHI-TV/RESTAURANT_SHOW_Sea_Eagle_Market_-_Bourbon_Glazed_Shrimp_9-22-2016_Only_on_WHHI-TV.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_01.jpg/480px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_01.jpg")
                    .description("Vídeo de apresentação de Marisqueira Baía de Luanda.")
                    .build()
    ),

    MARISQUEIRA_DO_PORTO_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Marisqueira do Porto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Live_seafood_tanks_in_Danang.jpg/1280px-Live_seafood_tanks_in_Danang.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Live_seafood_tanks_in_Danang.jpg/480px-Live_seafood_tanks_in_Danang.jpg")
                    .description("Fotografia principal de Marisqueira do Porto.")
                    .build()
    ),

    MARISQUEIRA_DO_PORTO_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Marisqueira do Porto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/McCormick_%26_Schmick%27s_Seafood_Restaurant_exterior_in_Philadelphia%2C_Pennsylvania_02.jpg/1280px-McCormick_%26_Schmick%27s_Seafood_Restaurant_exterior_in_Philadelphia%2C_Pennsylvania_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/McCormick_%26_Schmick%27s_Seafood_Restaurant_exterior_in_Philadelphia%2C_Pennsylvania_02.jpg/480px-McCormick_%26_Schmick%27s_Seafood_Restaurant_exterior_in_Philadelphia%2C_Pennsylvania_02.jpg")
                    .description("Logotipo oficial de Marisqueira do Porto.")
                    .build()
    ),

    MARISQUEIRA_DO_PORTO_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Marisqueira do Porto")
                    .url("https://archive.org/download/youtube-nRyuhoCVVZU/nRyuhoCVVZU.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Live_seafood_tanks_in_Danang.jpg/480px-Live_seafood_tanks_in_Danang.jpg")
                    .description("Vídeo de apresentação de Marisqueira do Porto.")
                    .build()
    ),

    MARISQUEIRA_KILAMBA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Marisqueira Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_04.jpg/1280px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_04.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_04.jpg/480px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_04.jpg")
                    .description("Fotografia principal de Marisqueira Kilamba.")
                    .build()
    ),

    MARISQUEIRA_KILAMBA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Marisqueira Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cb/McCormick_%26_Schmick%27s_Seafood_Restaurant_interior_in_Philadelphia%2C_Pennsylvania_03.jpg/1280px-McCormick_%26_Schmick%27s_Seafood_Restaurant_interior_in_Philadelphia%2C_Pennsylvania_03.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cb/McCormick_%26_Schmick%27s_Seafood_Restaurant_interior_in_Philadelphia%2C_Pennsylvania_03.jpg/480px-McCormick_%26_Schmick%27s_Seafood_Restaurant_interior_in_Philadelphia%2C_Pennsylvania_03.jpg")
                    .description("Logotipo oficial de Marisqueira Kilamba.")
                    .build()
    ),

    MARISQUEIRA_DE_BENGUELA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Marisqueira de Benguela")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_06.jpg/1280px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_06.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_06.jpg/480px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_06.jpg")
                    .description("Fotografia principal de Marisqueira de Benguela.")
                    .build()
    ),

    MARISQUEIRA_DE_BENGUELA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Marisqueira de Benguela")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_07.jpg/1280px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_07.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_07.jpg/480px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_07.jpg")
                    .description("Logotipo oficial de Marisqueira de Benguela.")
                    .build()
    ),

    MARISQUEIRA_DO_NAMIBE_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Marisqueira do Namibe")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_09.jpg/1280px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_09.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_09.jpg/480px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_09.jpg")
                    .description("Fotografia principal de Marisqueira do Namibe.")
                    .build()
    ),

    MARISQUEIRA_DO_NAMIBE_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Marisqueira do Namibe")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_10.jpg/1280px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_10.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_10.jpg/480px-A_Red_Lobster_seafood_restaurant_in_Chattanooga%2C_Tennessee_10.jpg")
                    .description("Logotipo oficial de Marisqueira do Namibe.")
                    .build()
    ),

    SUSHI_KIZUA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Sushi Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/4200GlenalbynDrive_SushiBar.jpg/1280px-4200GlenalbynDrive_SushiBar.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/4200GlenalbynDrive_SushiBar.jpg/480px-4200GlenalbynDrive_SushiBar.jpg")
                    .description("Fotografia principal de Sushi Kizua.")
                    .build()
    ),

    SUSHI_KIZUA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Sushi Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Anago_-_Shira_Nui_AUD5.50_each_%284760494022%29.jpg/1280px-Anago_-_Shira_Nui_AUD5.50_each_%284760494022%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Anago_-_Shira_Nui_AUD5.50_each_%284760494022%29.jpg/480px-Anago_-_Shira_Nui_AUD5.50_each_%284760494022%29.jpg")
                    .description("Logotipo oficial de Sushi Kizua.")
                    .build()
    ),

    SUSHI_KIZUA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Sushi Kizua")
                    .url("https://archive.org/download/wcatwma-Glo_s_Eatery_-_Uzbek_Pylov_Pilaf/Glo_s_Eatery_-_Uzbek_Pylov_Pilaf.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/4200GlenalbynDrive_SushiBar.jpg/480px-4200GlenalbynDrive_SushiBar.jpg")
                    .description("Vídeo de apresentação de Sushi Kizua.")
                    .build()
    ),

    SUSHI_BOM_DIA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Sushi Bom Dia")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/El_tizoncito_counter.jpg/1280px-El_tizoncito_counter.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/El_tizoncito_counter.jpg/480px-El_tizoncito_counter.jpg")
                    .description("Fotografia principal de Sushi Bom Dia.")
                    .build()
    ),

    SUSHI_BOM_DIA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Sushi Bom Dia")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Hamachi_Zuke_-_Shira_Nui_AUD4.50_each_%284759859329%29.jpg/1280px-Hamachi_Zuke_-_Shira_Nui_AUD4.50_each_%284759859329%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Hamachi_Zuke_-_Shira_Nui_AUD4.50_each_%284759859329%29.jpg/480px-Hamachi_Zuke_-_Shira_Nui_AUD4.50_each_%284759859329%29.jpg")
                    .description("Logotipo oficial de Sushi Bom Dia.")
                    .build()
    ),

    SUSHI_BOM_DIA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Sushi Bom Dia")
                    .url("https://archive.org/download/youtube-LglwK0m3uR0/LglwK0m3uR0.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/El_tizoncito_counter.jpg/480px-El_tizoncito_counter.jpg")
                    .description("Vídeo de apresentação de Sushi Bom Dia.")
                    .build()
    ),

    SUSHI_TOKYO_LUANDA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Sushi Tokyo Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Salmon_%26_Scallop_Sashimi.jpg/1280px-Salmon_%26_Scallop_Sashimi.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Salmon_%26_Scallop_Sashimi.jpg/480px-Salmon_%26_Scallop_Sashimi.jpg")
                    .description("Fotografia principal de Sushi Tokyo Luanda.")
                    .build()
    ),

    SUSHI_TOKYO_LUANDA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Sushi Tokyo Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Salmon_Sashimi_%2838284471226%29.jpg/1280px-Salmon_Sashimi_%2838284471226%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Salmon_Sashimi_%2838284471226%29.jpg/480px-Salmon_Sashimi_%2838284471226%29.jpg")
                    .description("Logotipo oficial de Sushi Tokyo Luanda.")
                    .build()
    ),

    SUSHI_SAKURA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Sushi Sakura")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Salmon_Sashimi_with_Calamansi.JPG/1280px-Salmon_Sashimi_with_Calamansi.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Salmon_Sashimi_with_Calamansi.JPG/480px-Salmon_Sashimi_with_Calamansi.JPG")
                    .description("Fotografia principal de Sushi Sakura.")
                    .build()
    ),

    SUSHI_SAKURA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Sushi Sakura")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Salmon_Sushi_and_Sashimi_Platter_-_W_Sushi.jpg/1280px-Salmon_Sushi_and_Sashimi_Platter_-_W_Sushi.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Salmon_Sushi_and_Sashimi_Platter_-_W_Sushi.jpg/480px-Salmon_Sushi_and_Sashimi_Platter_-_W_Sushi.jpg")
                    .description("Logotipo oficial de Sushi Sakura.")
                    .build()
    ),

    SUSHI_MANGA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Sushi Manga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Salmon_sashimi_at_Reef_Seafood_and_Sushi%2C_Newstead%2C_Brisbane.jpg/1280px-Salmon_sashimi_at_Reef_Seafood_and_Sushi%2C_Newstead%2C_Brisbane.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Salmon_sashimi_at_Reef_Seafood_and_Sushi%2C_Newstead%2C_Brisbane.jpg/480px-Salmon_sashimi_at_Reef_Seafood_and_Sushi%2C_Newstead%2C_Brisbane.jpg")
                    .description("Fotografia principal de Sushi Manga.")
                    .build()
    ),

    SUSHI_MANGA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Sushi Manga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Salmon_sashimi_close_up.jpg/1280px-Salmon_sashimi_close_up.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Salmon_sashimi_close_up.jpg/480px-Salmon_sashimi_close_up.jpg")
                    .description("Logotipo oficial de Sushi Manga.")
                    .build()
    ),

    CAFE_KWANZA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Café Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Coffee_shop_1_-_Wellington%2C_New_Zealand.jpg/1280px-Coffee_shop_1_-_Wellington%2C_New_Zealand.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Coffee_shop_1_-_Wellington%2C_New_Zealand.jpg/480px-Coffee_shop_1_-_Wellington%2C_New_Zealand.jpg")
                    .description("Fotografia principal de Café Kwanza.")
                    .build()
    ),

    CAFE_KWANZA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Café Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Coffee_shop_2_-_Wellington%2C_New_Zealand.jpg/1280px-Coffee_shop_2_-_Wellington%2C_New_Zealand.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Coffee_shop_2_-_Wellington%2C_New_Zealand.jpg/480px-Coffee_shop_2_-_Wellington%2C_New_Zealand.jpg")
                    .description("Logotipo oficial de Café Kwanza.")
                    .build()
    ),

    CAFE_KWANZA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Café Kwanza")
                    .url("https://archive.org/download/youtube-3pKskFVIkYQ/3pKskFVIkYQ.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Coffee_shop_1_-_Wellington%2C_New_Zealand.jpg/480px-Coffee_shop_1_-_Wellington%2C_New_Zealand.jpg")
                    .description("Vídeo de apresentação de Café Kwanza.")
                    .build()
    ),

    CAFE_BOSSA_NOVA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Café Bossa Nova")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Dash_Coffee_at_Gate_1_Dasma_-_Interior_-_West_end_2.jpg/1280px-Dash_Coffee_at_Gate_1_Dasma_-_Interior_-_West_end_2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Dash_Coffee_at_Gate_1_Dasma_-_Interior_-_West_end_2.jpg/480px-Dash_Coffee_at_Gate_1_Dasma_-_Interior_-_West_end_2.jpg")
                    .description("Fotografia principal de Café Bossa Nova.")
                    .build()
    ),

    CAFE_BOSSA_NOVA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Café Bossa Nova")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Doutor_Coffee_Shop._%2853208125399%29.jpg/1280px-Doutor_Coffee_Shop._%2853208125399%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Doutor_Coffee_Shop._%2853208125399%29.jpg/480px-Doutor_Coffee_Shop._%2853208125399%29.jpg")
                    .description("Logotipo oficial de Café Bossa Nova.")
                    .build()
    ),

    CAFE_BOSSA_NOVA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Café Bossa Nova")
                    .url("https://archive.org/download/youtube-1AkeCuo40oc/1AkeCuo40oc.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Dash_Coffee_at_Gate_1_Dasma_-_Interior_-_West_end_2.jpg/480px-Dash_Coffee_at_Gate_1_Dasma_-_Interior_-_West_end_2.jpg")
                    .description("Vídeo de apresentação de Café Bossa Nova.")
                    .build()
    ),

    CAFE_DO_MIRAMAR_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Café do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Figaro_Coffee_shop_interior_in_Salawag%2C_Dasmari%C3%B1as%2C_Cavite_%E2%80%94_19_Mar_2022.jpg/1280px-Figaro_Coffee_shop_interior_in_Salawag%2C_Dasmari%C3%B1as%2C_Cavite_%E2%80%94_19_Mar_2022.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Figaro_Coffee_shop_interior_in_Salawag%2C_Dasmari%C3%B1as%2C_Cavite_%E2%80%94_19_Mar_2022.jpg/480px-Figaro_Coffee_shop_interior_in_Salawag%2C_Dasmari%C3%B1as%2C_Cavite_%E2%80%94_19_Mar_2022.jpg")
                    .description("Fotografia principal de Café do Miramar.")
                    .build()
    ),

    CAFE_DO_MIRAMAR_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Café do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Food_display_case_at_the_counter_of_French_Coffee_Shop%2C_Dieppe_2026-05-11.jpg/1280px-Food_display_case_at_the_counter_of_French_Coffee_Shop%2C_Dieppe_2026-05-11.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Food_display_case_at_the_counter_of_French_Coffee_Shop%2C_Dieppe_2026-05-11.jpg/480px-Food_display_case_at_the_counter_of_French_Coffee_Shop%2C_Dieppe_2026-05-11.jpg")
                    .description("Logotipo oficial de Café do Miramar.")
                    .build()
    ),

    CAFE_PAO_QUENTE_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Café Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/HK_CWB_%E9%8A%85%E9%91%BC%E7%81%A3%E5%BB%A3%E5%A0%B4_Causeway_Bay_Plaza_interior_shop_%E6%98%9F%E5%B7%B4%E5%85%8B_Starbucks_Coffee_Cafe_Jan_2017_Lnv2.jpg/1280px-HK_CWB_%E9%8A%85%E9%91%BC%E7%81%A3%E5%BB%A3%E5%A0%B4_Causeway_Bay_Plaza_interior_shop_%E6%98%9F%E5%B7%B4%E5%85%8B_Starbucks_Coffee_Cafe_Jan_2017_Lnv2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/HK_CWB_%E9%8A%85%E9%91%BC%E7%81%A3%E5%BB%A3%E5%A0%B4_Causeway_Bay_Plaza_interior_shop_%E6%98%9F%E5%B7%B4%E5%85%8B_Starbucks_Coffee_Cafe_Jan_2017_Lnv2.jpg/480px-HK_CWB_%E9%8A%85%E9%91%BC%E7%81%A3%E5%BB%A3%E5%A0%B4_Causeway_Bay_Plaza_interior_shop_%E6%98%9F%E5%B7%B4%E5%85%8B_Starbucks_Coffee_Cafe_Jan_2017_Lnv2.jpg")
                    .description("Fotografia principal de Café Pão Quente.")
                    .build()
    ),

    CAFE_PAO_QUENTE_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Café Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Interior_of_coffee_shop%2C_Kounkaku%2C_Matsue_-_Apr_11%2C_2026.jpg/1280px-Interior_of_coffee_shop%2C_Kounkaku%2C_Matsue_-_Apr_11%2C_2026.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Interior_of_coffee_shop%2C_Kounkaku%2C_Matsue_-_Apr_11%2C_2026.jpg/480px-Interior_of_coffee_shop%2C_Kounkaku%2C_Matsue_-_Apr_11%2C_2026.jpg")
                    .description("Logotipo oficial de Café Pão Quente.")
                    .build()
    ),

    COFFEE_STOP_ANGOLA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Coffee Stop Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Interior_of_the_Red_Roaster_coffee_shop_-_Brighton_-_geograph.org.uk_-_6384372.jpg/1280px-Interior_of_the_Red_Roaster_coffee_shop_-_Brighton_-_geograph.org.uk_-_6384372.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Interior_of_the_Red_Roaster_coffee_shop_-_Brighton_-_geograph.org.uk_-_6384372.jpg/480px-Interior_of_the_Red_Roaster_coffee_shop_-_Brighton_-_geograph.org.uk_-_6384372.jpg")
                    .description("Fotografia principal de Coffee Stop Angola.")
                    .build()
    ),

    COFFEE_STOP_ANGOLA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Coffee Stop Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Jammer_Joe%27s_-_Interior_of_Lake_McDonald_Lodge_Coffee_Shot_-_NPS_photo_by_Lon_Johnson.jpg/1280px-Jammer_Joe%27s_-_Interior_of_Lake_McDonald_Lodge_Coffee_Shot_-_NPS_photo_by_Lon_Johnson.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Jammer_Joe%27s_-_Interior_of_Lake_McDonald_Lodge_Coffee_Shot_-_NPS_photo_by_Lon_Johnson.jpg/480px-Jammer_Joe%27s_-_Interior_of_Lake_McDonald_Lodge_Coffee_Shot_-_NPS_photo_by_Lon_Johnson.jpg")
                    .description("Logotipo oficial de Coffee Stop Angola.")
                    .build()
    ),

    BAR_222_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Bar 222")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/1948_-_Marble_Bar_-_Interior_-_Allentown_PA.jpg/1280px-1948_-_Marble_Bar_-_Interior_-_Allentown_PA.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/1948_-_Marble_Bar_-_Interior_-_Allentown_PA.jpg/480px-1948_-_Marble_Bar_-_Interior_-_Allentown_PA.jpg")
                    .description("Fotografia principal de Bar 222.")
                    .build()
    ),

    BAR_222_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Bar 222")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Bar_in_Bristol.jpg/1280px-Bar_in_Bristol.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Bar_in_Bristol.jpg/480px-Bar_in_Bristol.jpg")
                    .description("Logotipo oficial de Bar 222.")
                    .build()
    ),

    BAR_222_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Bar 222")
                    .url("https://archive.org/download/youtube-6C2Kfz94a0k/6C2Kfz94a0k.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/1948_-_Marble_Bar_-_Interior_-_Allentown_PA.jpg/480px-1948_-_Marble_Bar_-_Interior_-_Allentown_PA.jpg")
                    .description("Vídeo de apresentação de Bar 222.")
                    .build()
    ),

    BAR_TROPICAL_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Bar Tropical")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Elephant_Bar%2C_Serramonte_interior_2.JPG/1280px-Elephant_Bar%2C_Serramonte_interior_2.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Elephant_Bar%2C_Serramonte_interior_2.JPG/480px-Elephant_Bar%2C_Serramonte_interior_2.JPG")
                    .description("Fotografia principal de Bar Tropical.")
                    .build()
    ),

    BAR_TROPICAL_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Bar Tropical")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Former_church_of_St_Augustine%2C_Leeming_Bar_-_interior_-_geograph.org.uk_-_7402047.jpg/1280px-Former_church_of_St_Augustine%2C_Leeming_Bar_-_interior_-_geograph.org.uk_-_7402047.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Former_church_of_St_Augustine%2C_Leeming_Bar_-_interior_-_geograph.org.uk_-_7402047.jpg/480px-Former_church_of_St_Augustine%2C_Leeming_Bar_-_interior_-_geograph.org.uk_-_7402047.jpg")
                    .description("Logotipo oficial de Bar Tropical.")
                    .build()
    ),

    BAR_TROPICAL_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Bar Tropical")
                    .url("https://archive.org/download/youtube-2YM9xoKF46U/2YM9xoKF46U.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Elephant_Bar%2C_Serramonte_interior_2.JPG/480px-Elephant_Bar%2C_Serramonte_interior_2.JPG")
                    .description("Vídeo de apresentação de Bar Tropical.")
                    .build()
    ),

    BAR_DO_KIZUA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Bar do Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Caipirinha_2.JPG/1280px-Caipirinha_2.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Caipirinha_2.JPG/480px-Caipirinha_2.JPG")
                    .description("Fotografia principal de Bar do Kizua.")
                    .build()
    ),

    BAR_DO_KIZUA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Bar do Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/Caipirinha_2007.JPG/1280px-Caipirinha_2007.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/Caipirinha_2007.JPG/480px-Caipirinha_2007.JPG")
                    .description("Logotipo oficial de Bar do Kizua.")
                    .build()
    ),

    PUB_KILAMBA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Pub Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Caipirinha_bottle.jpg/1280px-Caipirinha_bottle.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Caipirinha_bottle.jpg/480px-Caipirinha_bottle.jpg")
                    .description("Fotografia principal de Pub Kilamba.")
                    .build()
    ),

    PUB_KILAMBA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pub Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Caipirinha_cacha%C3%A7a.jpg/1280px-Caipirinha_cacha%C3%A7a.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Caipirinha_cacha%C3%A7a.jpg/480px-Caipirinha_cacha%C3%A7a.jpg")
                    .description("Logotipo oficial de Pub Kilamba.")
                    .build()
    ),

    BAR_ESQUINA_DO_MIRAMAR_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Bar Esquina do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Caipirinha_on_Sailboat.JPG/1280px-Caipirinha_on_Sailboat.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Caipirinha_on_Sailboat.JPG/480px-Caipirinha_on_Sailboat.JPG")
                    .description("Fotografia principal de Bar Esquina do Miramar.")
                    .build()
    ),

    BAR_ESQUINA_DO_MIRAMAR_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Bar Esquina do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Caipirinha_on_ice_cubes.jpg/1280px-Caipirinha_on_ice_cubes.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Caipirinha_on_ice_cubes.jpg/480px-Caipirinha_on_ice_cubes.jpg")
                    .description("Logotipo oficial de Bar Esquina do Miramar.")
                    .build()
    ),

    SELF_SERVICE_KWANZA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Self-Service Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/A_modern_restaurant_Thanksgiving_Day_buffet_01.jpg/1280px-A_modern_restaurant_Thanksgiving_Day_buffet_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/A_modern_restaurant_Thanksgiving_Day_buffet_01.jpg/480px-A_modern_restaurant_Thanksgiving_Day_buffet_01.jpg")
                    .description("Fotografia principal de Self-Service Kwanza.")
                    .build()
    ),

    SELF_SERVICE_KWANZA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Self-Service Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/A_modern_restaurant_Thanksgiving_Day_buffet_02.jpg/1280px-A_modern_restaurant_Thanksgiving_Day_buffet_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/A_modern_restaurant_Thanksgiving_Day_buffet_02.jpg/480px-A_modern_restaurant_Thanksgiving_Day_buffet_02.jpg")
                    .description("Logotipo oficial de Self-Service Kwanza.")
                    .build()
    ),

    SELF_SERVICE_KWANZA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Self-Service Kwanza")
                    .url("https://archive.org/download/Operatio1955/Operatio1955_512kb.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/A_modern_restaurant_Thanksgiving_Day_buffet_01.jpg/480px-A_modern_restaurant_Thanksgiving_Day_buffet_01.jpg")
                    .description("Vídeo de apresentação de Self-Service Kwanza.")
                    .build()
    ),

    SELF_SERVICE_DO_ZE_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Self-Service do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Buffet_golden_princess.jpg/1280px-Buffet_golden_princess.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Buffet_golden_princess.jpg/480px-Buffet_golden_princess.jpg")
                    .description("Fotografia principal de Self-Service do Zé.")
                    .build()
    ),

    SELF_SERVICE_DO_ZE_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Self-Service do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Buffet_in_Macau_1.jpg/1280px-Buffet_in_Macau_1.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Buffet_in_Macau_1.jpg/480px-Buffet_in_Macau_1.jpg")
                    .description("Logotipo oficial de Self-Service do Zé.")
                    .build()
    ),

    SELF_SERVICE_DO_ZE_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Self-Service do Zé")
                    .url("https://archive.org/download/Bohemian1938/Bohemian1938_512kb.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Buffet_golden_princess.jpg/480px-Buffet_golden_princess.jpg")
                    .description("Vídeo de apresentação de Self-Service do Zé.")
                    .build()
    ),

    SELF_SERVICE_KILAMBA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Self-Service Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Buffet_line_at_Todai.jpg/1280px-Buffet_line_at_Todai.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Buffet_line_at_Todai.jpg/480px-Buffet_line_at_Todai.jpg")
                    .description("Fotografia principal de Self-Service Kilamba.")
                    .build()
    ),

    SELF_SERVICE_KILAMBA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Self-Service Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Buffet_line_in_a_restaurant%2C_Colombia.jpg/1280px-Buffet_line_in_a_restaurant%2C_Colombia.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Buffet_line_in_a_restaurant%2C_Colombia.jpg/480px-Buffet_line_in_a_restaurant%2C_Colombia.jpg")
                    .description("Logotipo oficial de Self-Service Kilamba.")
                    .build()
    ),

    SELF_SERVICE_CENTRAL_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Self-Service Central")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Fish_at_Hotel_Nikko_breakfast_buffet_Kaohsiung_May_2026.jpg/1280px-Fish_at_Hotel_Nikko_breakfast_buffet_Kaohsiung_May_2026.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Fish_at_Hotel_Nikko_breakfast_buffet_Kaohsiung_May_2026.jpg/480px-Fish_at_Hotel_Nikko_breakfast_buffet_Kaohsiung_May_2026.jpg")
                    .description("Fotografia principal de Self-Service Central.")
                    .build()
    ),

    SELF_SERVICE_CENTRAL_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Self-Service Central")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Korean_buffet_sign.jpg/1280px-Korean_buffet_sign.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Korean_buffet_sign.jpg/480px-Korean_buffet_sign.jpg")
                    .description("Logotipo oficial de Self-Service Central.")
                    .build()
    ),

    SELF_SERVICE_DO_MIRAMAR_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Self-Service do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Le_Parc_Hotel%2C_Quito_%28buffet%29_pastry.jpg/1280px-Le_Parc_Hotel%2C_Quito_%28buffet%29_pastry.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Le_Parc_Hotel%2C_Quito_%28buffet%29_pastry.jpg/480px-Le_Parc_Hotel%2C_Quito_%28buffet%29_pastry.jpg")
                    .description("Fotografia principal de Self-Service do Miramar.")
                    .build()
    ),

    SELF_SERVICE_DO_MIRAMAR_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Self-Service do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Le_Parc_Hotel%2C_Quito_%28buffet%29_waffle_and_toppings.jpg/1280px-Le_Parc_Hotel%2C_Quito_%28buffet%29_waffle_and_toppings.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Le_Parc_Hotel%2C_Quito_%28buffet%29_waffle_and_toppings.jpg/480px-Le_Parc_Hotel%2C_Quito_%28buffet%29_waffle_and_toppings.jpg")
                    .description("Logotipo oficial de Self-Service do Miramar.")
                    .build()
    ),

    RESTAURANTE_VEGETARIANO_RAIZES_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Restaurante Vegetariano Raízes")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/A_vegetarian_plate_of_food.jpg/1280px-A_vegetarian_plate_of_food.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/A_vegetarian_plate_of_food.jpg/480px-A_vegetarian_plate_of_food.jpg")
                    .description("Fotografia principal de Restaurante Vegetariano Raízes.")
                    .build()
    ),

    RESTAURANTE_VEGETARIANO_RAIZES_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Restaurante Vegetariano Raízes")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Anjuna%2C_Goa%2C_India%2C_Vegan_food_plate%2C_plant_foods.jpg/1280px-Anjuna%2C_Goa%2C_India%2C_Vegan_food_plate%2C_plant_foods.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Anjuna%2C_Goa%2C_India%2C_Vegan_food_plate%2C_plant_foods.jpg/480px-Anjuna%2C_Goa%2C_India%2C_Vegan_food_plate%2C_plant_foods.jpg")
                    .description("Logotipo oficial de Restaurante Vegetariano Raízes.")
                    .build()
    ),

    RESTAURANTE_VEGETARIANO_RAIZES_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Restaurante Vegetariano Raízes")
                    .url("https://archive.org/download/youtube-cKg7sbwC-JQ/cKg7sbwC-JQ.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/A_vegetarian_plate_of_food.jpg/480px-A_vegetarian_plate_of_food.jpg")
                    .description("Vídeo de apresentação de Restaurante Vegetariano Raízes.")
                    .build()
    ),

    VEGGIE_HOUSE_LUANDA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Veggie House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Food_of_Puri%2C_Odisha.jpg/1280px-Food_of_Puri%2C_Odisha.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Food_of_Puri%2C_Odisha.jpg/480px-Food_of_Puri%2C_Odisha.jpg")
                    .description("Fotografia principal de Veggie House Luanda.")
                    .build()
    ),

    VEGGIE_HOUSE_LUANDA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Veggie House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Plate_of_Vegetarian_Meatballs.jpg/1280px-Plate_of_Vegetarian_Meatballs.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Plate_of_Vegetarian_Meatballs.jpg/480px-Plate_of_Vegetarian_Meatballs.jpg")
                    .description("Logotipo oficial de Veggie House Luanda.")
                    .build()
    ),

    VEGGIE_HOUSE_LUANDA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Veggie House Luanda")
                    .url("https://archive.org/download/Farm-Table/9.3%20Q%20and%20A%20with%20Inga.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Food_of_Puri%2C_Odisha.jpg/480px-Food_of_Puri%2C_Odisha.jpg")
                    .description("Vídeo de apresentação de Veggie House Luanda.")
                    .build()
    ),

    COZINHA_VERDE_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Cozinha Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Bowl%2C_salad_%28AM_1986.28-2%29.jpg/1280px-Bowl%2C_salad_%28AM_1986.28-2%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Bowl%2C_salad_%28AM_1986.28-2%29.jpg/480px-Bowl%2C_salad_%28AM_1986.28-2%29.jpg")
                    .description("Fotografia principal de Cozinha Verde.")
                    .build()
    ),

    COZINHA_VERDE_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Cozinha Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Bowl%2C_salad_%28AM_1986.28-3%29.jpg/1280px-Bowl%2C_salad_%28AM_1986.28-3%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Bowl%2C_salad_%28AM_1986.28-3%29.jpg/480px-Bowl%2C_salad_%28AM_1986.28-3%29.jpg")
                    .description("Logotipo oficial de Cozinha Verde.")
                    .build()
    ),

    BI_VEGETARIANO_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Bi Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Grilled_Veggie_Tofu_Paneer_Sandwich_with_Mango_Chutney_%284918261631%29.jpg/1280px-Grilled_Veggie_Tofu_Paneer_Sandwich_with_Mango_Chutney_%284918261631%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Grilled_Veggie_Tofu_Paneer_Sandwich_with_Mango_Chutney_%284918261631%29.jpg/480px-Grilled_Veggie_Tofu_Paneer_Sandwich_with_Mango_Chutney_%284918261631%29.jpg")
                    .description("Fotografia principal de Bi Vegetariano.")
                    .build()
    ),

    BI_VEGETARIANO_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Bi Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Grilled_beef_kalbi_and_mabo_tofu_set_meal_of_Matsuya.jpg/1280px-Grilled_beef_kalbi_and_mabo_tofu_set_meal_of_Matsuya.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Grilled_beef_kalbi_and_mabo_tofu_set_meal_of_Matsuya.jpg/480px-Grilled_beef_kalbi_and_mabo_tofu_set_meal_of_Matsuya.jpg")
                    .description("Logotipo oficial de Bi Vegetariano.")
                    .build()
    ),

    SABOR_VEGETARIANO_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Sabor Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Hamburgers%2C_tofu%2C_poivron%2C_aubergine_grill%C3%A9s.jpg/1280px-Hamburgers%2C_tofu%2C_poivron%2C_aubergine_grill%C3%A9s.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Hamburgers%2C_tofu%2C_poivron%2C_aubergine_grill%C3%A9s.jpg/480px-Hamburgers%2C_tofu%2C_poivron%2C_aubergine_grill%C3%A9s.jpg")
                    .description("Fotografia principal de Sabor Vegetariano.")
                    .build()
    ),

    SABOR_VEGETARIANO_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Sabor Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Home-madeTofu.JPG/1280px-Home-madeTofu.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Home-madeTofu.JPG/480px-Home-madeTofu.JPG")
                    .description("Logotipo oficial de Sabor Vegetariano.")
                    .build()
    ),

    PADARIA_PAO_QUENTE_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Padaria Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Breads_sold_in_the_bakery_shop_Gebacken.jpg/1280px-Breads_sold_in_the_bakery_shop_Gebacken.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Breads_sold_in_the_bakery_shop_Gebacken.jpg/480px-Breads_sold_in_the_bakery_shop_Gebacken.jpg")
                    .description("Fotografia principal de Padaria Pão Quente.")
                    .build()
    ),

    PADARIA_PAO_QUENTE_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Padaria Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Corrado_Bakery_at_90th_Street_and_Lexington_Avenue%2C_Upper_East_Side%2C_Manhattan.jpg/1280px-Corrado_Bakery_at_90th_Street_and_Lexington_Avenue%2C_Upper_East_Side%2C_Manhattan.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Corrado_Bakery_at_90th_Street_and_Lexington_Avenue%2C_Upper_East_Side%2C_Manhattan.jpg/480px-Corrado_Bakery_at_90th_Street_and_Lexington_Avenue%2C_Upper_East_Side%2C_Manhattan.jpg")
                    .description("Logotipo oficial de Padaria Pão Quente.")
                    .build()
    ),

    PADARIA_PAO_QUENTE_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Padaria Pão Quente")
                    .url("https://archive.org/download/Kusher_Bakery_in_Fife/Kusher_Bakery_in_Fife.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Breads_sold_in_the_bakery_shop_Gebacken.jpg/480px-Breads_sold_in_the_bakery_shop_Gebacken.jpg")
                    .description("Vídeo de apresentação de Padaria Pão Quente.")
                    .build()
    ),

    PADARIA_KWANZA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Padaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Moscow._Bakery_%22Daily_Bread%221.jpg/1280px-Moscow._Bakery_%22Daily_Bread%221.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Moscow._Bakery_%22Daily_Bread%221.jpg/480px-Moscow._Bakery_%22Daily_Bread%221.jpg")
                    .description("Fotografia principal de Padaria Kwanza.")
                    .build()
    ),

    PADARIA_KWANZA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Padaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/People_sitting_at_Corrado_bakery_on_a_sunny_morning%2C_90th_Street_and_Lexington_Avenue%2C_February_2021%2C_Upper_East_Side%2C_Manhattan.jpg/1280px-People_sitting_at_Corrado_bakery_on_a_sunny_morning%2C_90th_Street_and_Lexington_Avenue%2C_February_2021%2C_Upper_East_Side%2C_Manhattan.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/People_sitting_at_Corrado_bakery_on_a_sunny_morning%2C_90th_Street_and_Lexington_Avenue%2C_February_2021%2C_Upper_East_Side%2C_Manhattan.jpg/480px-People_sitting_at_Corrado_bakery_on_a_sunny_morning%2C_90th_Street_and_Lexington_Avenue%2C_February_2021%2C_Upper_East_Side%2C_Manhattan.jpg")
                    .description("Logotipo oficial de Padaria Kwanza.")
                    .build()
    ),

    PADARIA_KWANZA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Padaria Kwanza")
                    .url("https://archive.org/download/youtube-gg4lEIkFsuk/gg4lEIkFsuk.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Moscow._Bakery_%22Daily_Bread%221.jpg/480px-Moscow._Bakery_%22Daily_Bread%221.jpg")
                    .description("Vídeo de apresentação de Padaria Kwanza.")
                    .build()
    ),

    PASTELARIA_DOCE_MANJAR_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Pastelaria Doce Manjar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_01.jpg/1280px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_01.jpg/480px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_01.jpg")
                    .description("Fotografia principal de Pastelaria Doce Manjar.")
                    .build()
    ),

    PASTELARIA_DOCE_MANJAR_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Pastelaria Doce Manjar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_02.jpg/1280px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_02.jpg/480px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_02.jpg")
                    .description("Logotipo oficial de Pastelaria Doce Manjar.")
                    .build()
    ),

    PADARIA_KILAMBA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Padaria Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_05.jpg/1280px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_05.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_05.jpg/480px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_05.jpg")
                    .description("Fotografia principal de Padaria Kilamba.")
                    .build()
    ),

    PADARIA_KILAMBA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Padaria Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_06.jpg/1280px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_06.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_06.jpg/480px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_06.jpg")
                    .description("Logotipo oficial de Padaria Kilamba.")
                    .build()
    ),

    PADARIA_MANACA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Padaria Manacá")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_08.jpg/1280px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_08.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_08.jpg/480px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_08.jpg")
                    .description("Fotografia principal de Padaria Manacá.")
                    .build()
    ),

    PADARIA_MANACA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Padaria Manacá")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_09.jpg/1280px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_09.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_09.jpg/480px-SZ_%E6%B7%B1%E5%9C%B3_Shenzhen_%E5%8D%97%E5%B1%B1%E5%8D%80_Nanshan_%E6%B7%B1%E5%9C%B3%E7%81%A3_Shenzhen_Bay_MixC_mall_shop_1-7_Bread_Bakery_May_2026_N13P_09.jpg")
                    .description("Logotipo oficial de Padaria Manacá.")
                    .build()
    ),

    LINHAS_AEREAS_KWANZA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Linhas Aéreas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Dulles_Airport_terminal%2C_about_1963%2C_interior.jpg/1280px-Dulles_Airport_terminal%2C_about_1963%2C_interior.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Dulles_Airport_terminal%2C_about_1963%2C_interior.jpg/480px-Dulles_Airport_terminal%2C_about_1963%2C_interior.jpg")
                    .description("Fotografia principal de Linhas Aéreas Kwanza.")
                    .build()
    ),

    LINHAS_AEREAS_KWANZA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Linhas Aéreas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Interior_of_Hamburg_Airport_-_Terminal_1.jpg/1280px-Interior_of_Hamburg_Airport_-_Terminal_1.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Interior_of_Hamburg_Airport_-_Terminal_1.jpg/480px-Interior_of_Hamburg_Airport_-_Terminal_1.jpg")
                    .description("Logotipo oficial de Linhas Aéreas Kwanza.")
                    .build()
    ),

    LINHAS_AEREAS_KWANZA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Linhas Aéreas Kwanza")
                    .url("https://archive.org/download/youtube-oJVLE5yzcA4/oJVLE5yzcA4.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Dulles_Airport_terminal%2C_about_1963%2C_interior.jpg/480px-Dulles_Airport_terminal%2C_about_1963%2C_interior.jpg")
                    .description("Vídeo de apresentação de Linhas Aéreas Kwanza.")
                    .build()
    ),

    ANGOLA_EXPRESS_AIR_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Angola Express Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Interior_of_Oulu_Airport_Terminal_20240705_01.jpg/1280px-Interior_of_Oulu_Airport_Terminal_20240705_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Interior_of_Oulu_Airport_Terminal_20240705_01.jpg/480px-Interior_of_Oulu_Airport_Terminal_20240705_01.jpg")
                    .description("Fotografia principal de Angola Express Air.")
                    .build()
    ),

    ANGOLA_EXPRESS_AIR_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Angola Express Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Interior_of_Oulu_Airport_Terminal_20240705_02.jpg/1280px-Interior_of_Oulu_Airport_Terminal_20240705_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Interior_of_Oulu_Airport_Terminal_20240705_02.jpg/480px-Interior_of_Oulu_Airport_Terminal_20240705_02.jpg")
                    .description("Logotipo oficial de Angola Express Air.")
                    .build()
    ),

    ANGOLA_EXPRESS_AIR_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Angola Express Air")
                    .url("https://archive.org/download/HiloTakeoff/HiloTakeoff_512kb.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Interior_of_Oulu_Airport_Terminal_20240705_01.jpg/480px-Interior_of_Oulu_Airport_Terminal_20240705_01.jpg")
                    .description("Vídeo de apresentação de Angola Express Air.")
                    .build()
    ),

    SKY_ANGOLA_AIRLINES_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Sky Angola Airlines")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Airplane_to_Ljubljana_%285745904109%29.jpg/1280px-Airplane_to_Ljubljana_%285745904109%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Airplane_to_Ljubljana_%285745904109%29.jpg/480px-Airplane_to_Ljubljana_%285745904109%29.jpg")
                    .description("Fotografia principal de Sky Angola Airlines.")
                    .build()
    ),

    SKY_ANGOLA_AIRLINES_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Sky Angola Airlines")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Airplanes_at_CPH_1.jpg/1280px-Airplanes_at_CPH_1.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Airplanes_at_CPH_1.jpg/480px-Airplanes_at_CPH_1.jpg")
                    .description("Logotipo oficial de Sky Angola Airlines.")
                    .build()
    ),

    KUBINGA_AIR_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Kubinga Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Airplanes_at_CPH_4.jpg/1280px-Airplanes_at_CPH_4.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Airplanes_at_CPH_4.jpg/480px-Airplanes_at_CPH_4.jpg")
                    .description("Fotografia principal de Kubinga Air.")
                    .build()
    ),

    KUBINGA_AIR_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Kubinga Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Airplanes_at_CPH_5.jpg/1280px-Airplanes_at_CPH_5.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Airplanes_at_CPH_5.jpg/480px-Airplanes_at_CPH_5.jpg")
                    .description("Logotipo oficial de Kubinga Air.")
                    .build()
    ),

    ROYAL_WINGS_ANGOLA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Royal Wings Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Clouds_from_airplane.JPG/1280px-Clouds_from_airplane.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Clouds_from_airplane.JPG/480px-Clouds_from_airplane.JPG")
                    .description("Fotografia principal de Royal Wings Angola.")
                    .build()
    ),

    ROYAL_WINGS_ANGOLA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Royal Wings Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Flying_through_the_sunrise_-_Flickr_-_Lenny_K_Photography.jpg/1280px-Flying_through_the_sunrise_-_Flickr_-_Lenny_K_Photography.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Flying_through_the_sunrise_-_Flickr_-_Lenny_K_Photography.jpg/480px-Flying_through_the_sunrise_-_Flickr_-_Lenny_K_Photography.jpg")
                    .description("Logotipo oficial de Royal Wings Angola.")
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Agência de Viagens Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/%27The_Thompson_Agency_and_Co%27_page_306.jpg/1280px-%27The_Thompson_Agency_and_Co%27_page_306.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/%27The_Thompson_Agency_and_Co%27_page_306.jpg/480px-%27The_Thompson_Agency_and_Co%27_page_306.jpg")
                    .description("Fotografia principal de Agência de Viagens Kwanza.")
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Agência de Viagens Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/%27The_Thompson_Agency_and_Co%27_page_329.jpg/1280px-%27The_Thompson_Agency_and_Co%27_page_329.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/%27The_Thompson_Agency_and_Co%27_page_329.jpg/480px-%27The_Thompson_Agency_and_Co%27_page_329.jpg")
                    .description("Logotipo oficial de Agência de Viagens Kwanza.")
                    .build()
    ),

    AGENCIA_DE_VIAGENS_KWANZA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Agência de Viagens Kwanza")
                    .url("https://archive.org/download/youtube-AqdLexta-FU/AqdLexta-FU.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/%27The_Thompson_Agency_and_Co%27_page_306.jpg/480px-%27The_Thompson_Agency_and_Co%27_page_306.jpg")
                    .description("Vídeo de apresentação de Agência de Viagens Kwanza.")
                    .build()
    ),

    AVENTURA_VIAGENS_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Aventura Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/%27The_Thompson_Agency_and_Co%27_page_86.jpg/1280px-%27The_Thompson_Agency_and_Co%27_page_86.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/%27The_Thompson_Agency_and_Co%27_page_86.jpg/480px-%27The_Thompson_Agency_and_Co%27_page_86.jpg")
                    .description("Fotografia principal de Aventura Viagens.")
                    .build()
    ),

    AVENTURA_VIAGENS_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Aventura Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/%27The_Thompson_Agency_and_Co%27_page_89.jpg/1280px-%27The_Thompson_Agency_and_Co%27_page_89.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/%27The_Thompson_Agency_and_Co%27_page_89.jpg/480px-%27The_Thompson_Agency_and_Co%27_page_89.jpg")
                    .description("Logotipo oficial de Aventura Viagens.")
                    .build()
    ),

    AVENTURA_VIAGENS_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Aventura Viagens")
                    .url("https://archive.org/download/mondo-enduro/Mondo_Enduro-Why_Suzuki_Would_Not_Sponsor.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/%27The_Thompson_Agency_and_Co%27_page_86.jpg/480px-%27The_Thompson_Agency_and_Co%27_page_86.jpg")
                    .description("Vídeo de apresentação de Aventura Viagens.")
                    .build()
    ),

    TRAVEL_HOUSE_LUANDA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Travel House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/55_Cancri_e_Final_1_30.png/1280px-55_Cancri_e_Final_1_30.png")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/55_Cancri_e_Final_1_30.png/480px-55_Cancri_e_Final_1_30.png")
                    .description("Fotografia principal de Travel House Luanda.")
                    .build()
    ),

    TRAVEL_HOUSE_LUANDA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Travel House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Blowes_Gifts_Cards_and_Gifts%2C_Blowes_Office_Supplies%2C_and_Blowes_and_Stewart_Travel%2C_Stratford%2C_Ontario%2C_2025-08-04.jpg/1280px-Blowes_Gifts_Cards_and_Gifts%2C_Blowes_Office_Supplies%2C_and_Blowes_and_Stewart_Travel%2C_Stratford%2C_Ontario%2C_2025-08-04.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Blowes_Gifts_Cards_and_Gifts%2C_Blowes_Office_Supplies%2C_and_Blowes_and_Stewart_Travel%2C_Stratford%2C_Ontario%2C_2025-08-04.jpg/480px-Blowes_Gifts_Cards_and_Gifts%2C_Blowes_Office_Supplies%2C_and_Blowes_and_Stewart_Travel%2C_Stratford%2C_Ontario%2C_2025-08-04.jpg")
                    .description("Logotipo oficial de Travel House Luanda.")
                    .build()
    ),

    GLOBETROTTER_ANGOLA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Globetrotter Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/JAFFA_ROAD_COMPLETE_WITH_GERMAN_POST_OFFICE%2C_CASINO_%26_THEATRE_AGENCY_AND_DR._BENZINGER%27S_TRAVEL_AGENCY_IN_JERUSALEM_PHOTOGRAPHED_IN_1905._%D7%A8%D7%97%D7%95%D7%91_%D7%99%D7%A4%D7%95_%D7%91%D7%99%D7%A8.jpg/1280px-thumbnail.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/JAFFA_ROAD_COMPLETE_WITH_GERMAN_POST_OFFICE%2C_CASINO_%26_THEATRE_AGENCY_AND_DR._BENZINGER%27S_TRAVEL_AGENCY_IN_JERUSALEM_PHOTOGRAPHED_IN_1905._%D7%A8%D7%97%D7%95%D7%91_%D7%99%D7%A4%D7%95_%D7%91%D7%99%D7%A8.jpg/480px-thumbnail.jpg")
                    .description("Fotografia principal de Globetrotter Angola.")
                    .build()
    ),

    GLOBETROTTER_ANGOLA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Globetrotter Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Orli%2C_travel_office_at_ulica_Romualda_Traugutta%2C_Gdynia.jpg/1280px-Orli%2C_travel_office_at_ulica_Romualda_Traugutta%2C_Gdynia.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Orli%2C_travel_office_at_ulica_Romualda_Traugutta%2C_Gdynia.jpg/480px-Orli%2C_travel_office_at_ulica_Romualda_Traugutta%2C_Gdynia.jpg")
                    .description("Logotipo oficial de Globetrotter Angola.")
                    .build()
    ),

    SAFARIR_VIAGENS_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Safarir Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Roshan_Travel_Agent_Sri_Lanka.jpg/1280px-Roshan_Travel_Agent_Sri_Lanka.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Roshan_Travel_Agent_Sri_Lanka.jpg/480px-Roshan_Travel_Agent_Sri_Lanka.jpg")
                    .description("Fotografia principal de Safarir Viagens.")
                    .build()
    ),

    SAFARIR_VIAGENS_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Safarir Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/JAFFA_ROAD_COMPLETE_WITH_GERMAN_POST_OFFICE%2C_CASINO_%26_THEATRE_AGENCY_AND_DR._BENZINGER%27S_TRAVEL_AGENCY_IN_JERUSALEM_PHOTOGRAPHED_IN_1905._%D7%A8%D7%97%D7%95%D7%91_%D7%99%D7%A4%D7%95_%D7%91%D7%99%D7%A8%D7%95%D7%A9%D7%9C%D7%99%D7%9D..jpg/1280px-thumbnail.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/JAFFA_ROAD_COMPLETE_WITH_GERMAN_POST_OFFICE%2C_CASINO_%26_THEATRE_AGENCY_AND_DR._BENZINGER%27S_TRAVEL_AGENCY_IN_JERUSALEM_PHOTOGRAPHED_IN_1905._%D7%A8%D7%97%D7%95%D7%91_%D7%99%D7%A4%D7%95_%D7%91%D7%99%D7%A8%D7%95%D7%A9%D7%9C%D7%99%D7%9D..jpg/480px-thumbnail.jpg")
                    .description("Logotipo oficial de Safarir Viagens.")
                    .build()
    ),

    OPERADORA_TURISTICA_KWANZA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Operadora Turística Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/6_Water_St_bike_tour_group_jeh.jpg/1280px-6_Water_St_bike_tour_group_jeh.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/6_Water_St_bike_tour_group_jeh.jpg/480px-6_Water_St_bike_tour_group_jeh.jpg")
                    .description("Fotografia principal de Operadora Turística Kwanza.")
                    .build()
    ),

    OPERADORA_TURISTICA_KWANZA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Operadora Turística Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Chinese_tour_groups_in_Isfahan.jpg/1280px-Chinese_tour_groups_in_Isfahan.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Chinese_tour_groups_in_Isfahan.jpg/480px-Chinese_tour_groups_in_Isfahan.jpg")
                    .description("Logotipo oficial de Operadora Turística Kwanza.")
                    .build()
    ),

    OPERADORA_TURISTICA_KWANZA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Operadora Turística Kwanza")
                    .url("https://archive.org/download/youtube-Wjvo1k7YWRM/Wjvo1k7YWRM.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/6_Water_St_bike_tour_group_jeh.jpg/480px-6_Water_St_bike_tour_group_jeh.jpg")
                    .description("Vídeo de apresentação de Operadora Turística Kwanza.")
                    .build()
    ),

    AVENTURA_GUIDES_ANGOLA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Aventura Guides Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Disembarked_tour_group_at_Provo_station%2C_Jul_16.jpg/1280px-Disembarked_tour_group_at_Provo_station%2C_Jul_16.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Disembarked_tour_group_at_Provo_station%2C_Jul_16.jpg/480px-Disembarked_tour_group_at_Provo_station%2C_Jul_16.jpg")
                    .description("Fotografia principal de Aventura Guides Angola.")
                    .build()
    ),

    AVENTURA_GUIDES_ANGOLA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Aventura Guides Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Group_on_tour_at_the_Minnesota_State_Capitol.jpg/1280px-Group_on_tour_at_the_Minnesota_State_Capitol.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Group_on_tour_at_the_Minnesota_State_Capitol.jpg/480px-Group_on_tour_at_the_Minnesota_State_Capitol.jpg")
                    .description("Logotipo oficial de Aventura Guides Angola.")
                    .build()
    ),

    AVENTURA_GUIDES_ANGOLA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Aventura Guides Angola")
                    .url("https://archive.org/download/youtube-m6Q4ug11tO8/m6Q4ug11tO8.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Disembarked_tour_group_at_Provo_station%2C_Jul_16.jpg/480px-Disembarked_tour_group_at_Provo_station%2C_Jul_16.jpg")
                    .description("Vídeo de apresentação de Aventura Guides Angola.")
                    .build()
    ),

    TURISTAS_LUANDA_GUIDES_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Turistas Luanda Guides")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/City_Walk%2C_Leeds_-_geograph.org.uk_-_5205762.jpg/1280px-City_Walk%2C_Leeds_-_geograph.org.uk_-_5205762.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/City_Walk%2C_Leeds_-_geograph.org.uk_-_5205762.jpg/480px-City_Walk%2C_Leeds_-_geograph.org.uk_-_5205762.jpg")
                    .description("Fotografia principal de Turistas Luanda Guides.")
                    .build()
    ),

    TURISTAS_LUANDA_GUIDES_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Turistas Luanda Guides")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/City_Walk%2C_Universal_City.JPG/1280px-City_Walk%2C_Universal_City.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/City_Walk%2C_Universal_City.JPG/480px-City_Walk%2C_Universal_City.JPG")
                    .description("Logotipo oficial de Turistas Luanda Guides.")
                    .build()
    ),

    EXPEDICOES_KALANDULA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Expedições Kalandula")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/City_Walk_Orlando_03.jpg/1280px-City_Walk_Orlando_03.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/City_Walk_Orlando_03.jpg/480px-City_Walk_Orlando_03.jpg")
                    .description("Fotografia principal de Expedições Kalandula.")
                    .build()
    ),

    EXPEDICOES_KALANDULA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Expedições Kalandula")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/City_Walk_Orlando_04.jpg/1280px-City_Walk_Orlando_04.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/City_Walk_Orlando_04.jpg/480px-City_Walk_Orlando_04.jpg")
                    .description("Logotipo oficial de Expedições Kalandula.")
                    .build()
    ),

    GUIA_TOURS_MIRAMAR_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Guia Tours Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/City_Walk_Orlando_08.jpg/1280px-City_Walk_Orlando_08.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/City_Walk_Orlando_08.jpg/480px-City_Walk_Orlando_08.jpg")
                    .description("Fotografia principal de Guia Tours Miramar.")
                    .build()
    ),

    GUIA_TOURS_MIRAMAR_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Guia Tours Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flickr_-_Per_Ola_Wiberg_~_mostly_away_-_Trip_to_Birka_%2825%29_-_guided_tour_around_parts_of_Birka.jpg/1280px-Flickr_-_Per_Ola_Wiberg_~_mostly_away_-_Trip_to_Birka_%2825%29_-_guided_tour_around_parts_of_Birka.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flickr_-_Per_Ola_Wiberg_~_mostly_away_-_Trip_to_Birka_%2825%29_-_guided_tour_around_parts_of_Birka.jpg/480px-Flickr_-_Per_Ola_Wiberg_~_mostly_away_-_Trip_to_Birka_%2825%29_-_guided_tour_around_parts_of_Birka.jpg")
                    .description("Logotipo oficial de Guia Tours Miramar.")
                    .build()
    ),

    INTERPRETES_DE_LUANDA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Intérpretes de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/1868_detail%2C_Interpreter_at_Darjeeling%2C_Tibetan%2C_Bhotan_%28NYPL_b13409080-1125276%29_%28cropped%29.tiff/lossy-page1-960px-1868_detail%2C_Interpreter_at_Darjeeling%2C_Tibetan%2C_Bhotan_%28NYPL_b13409080-1125276%29_%28cropped%29.tiff.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/1868_detail%2C_Interpreter_at_Darjeeling%2C_Tibetan%2C_Bhotan_%28NYPL_b13409080-1125276%29_%28cropped%29.tiff/lossy-page1-960px-1868_detail%2C_Interpreter_at_Darjeeling%2C_Tibetan%2C_Bhotan_%28NYPL_b13409080-1125276%29_%28cropped%29.tiff.jpg")
                    .description("Fotografia principal de Intérpretes de Luanda.")
                    .build()
    ),

    INTERPRETES_DE_LUANDA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Intérpretes de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/DA-SD-04-13479_-_Afghan_residents_and_Afghan_interpreter_in_Moyo_Mohammed_Baba%2C_Afghanistan.jpg/1280px-DA-SD-04-13479_-_Afghan_residents_and_Afghan_interpreter_in_Moyo_Mohammed_Baba%2C_Afghanistan.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/DA-SD-04-13479_-_Afghan_residents_and_Afghan_interpreter_in_Moyo_Mohammed_Baba%2C_Afghanistan.jpg/480px-DA-SD-04-13479_-_Afghan_residents_and_Afghan_interpreter_in_Moyo_Mohammed_Baba%2C_Afghanistan.jpg")
                    .description("Logotipo oficial de Intérpretes de Luanda.")
                    .build()
    ),

    INTERPRETES_DE_LUANDA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Intérpretes de Luanda")
                    .url("https://archive.org/download/HarrietMurav20Dec2016YiddishBookCenter/audio%20only/Au889-harrietMurav-fullInterviewAudioOnly.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/1868_detail%2C_Interpreter_at_Darjeeling%2C_Tibetan%2C_Bhotan_%28NYPL_b13409080-1125276%29_%28cropped%29.tiff/lossy-page1-960px-1868_detail%2C_Interpreter_at_Darjeeling%2C_Tibetan%2C_Bhotan_%28NYPL_b13409080-1125276%29_%28cropped%29.tiff.jpg")
                    .description("Vídeo de apresentação de Intérpretes de Luanda.")
                    .build()
    ),

    GLOBAL_VOICES_ANGOLA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Global Voices Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Garry_Kasparov_-_Klaus_Bednarz_at_lit_Cologne_2007_-_%286784%29.jpg/1280px-Garry_Kasparov_-_Klaus_Bednarz_at_lit_Cologne_2007_-_%286784%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Garry_Kasparov_-_Klaus_Bednarz_at_lit_Cologne_2007_-_%286784%29.jpg/480px-Garry_Kasparov_-_Klaus_Bednarz_at_lit_Cologne_2007_-_%286784%29.jpg")
                    .description("Fotografia principal de Global Voices Angola.")
                    .build()
    ),

    GLOBAL_VOICES_ANGOLA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Global Voices Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Interpreter_Romashkina.jpg/1280px-Interpreter_Romashkina.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Interpreter_Romashkina.jpg/480px-Interpreter_Romashkina.jpg")
                    .description("Logotipo oficial de Global Voices Angola.")
                    .build()
    ),

    GLOBAL_VOICES_ANGOLA_VIDEO(
            DocumentFile.builder()
                    .title("Vídeo Global Voices Angola")
                    .url("https://archive.org/download/youtube-JG0eyQd31aQ/JG0eyQd31aQ.mp4")
                    .fileType(FileType.VIDEO)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Garry_Kasparov_-_Klaus_Bednarz_at_lit_Cologne_2007_-_%286784%29.jpg/480px-Garry_Kasparov_-_Klaus_Bednarz_at_lit_Cologne_2007_-_%286784%29.jpg")
                    .description("Vídeo de apresentação de Global Voices Angola.")
                    .build()
    ),

    TRADUCAO_E_INTERPRETE_SERVICES_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Tradução e Intérprete Services")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Interpreter_and_Translator_-_DPLA_-_6a67a9859fe10d26df26f30dc6588fec.jpg/1280px-Interpreter_and_Translator_-_DPLA_-_6a67a9859fe10d26df26f30dc6588fec.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Interpreter_and_Translator_-_DPLA_-_6a67a9859fe10d26df26f30dc6588fec.jpg/480px-Interpreter_and_Translator_-_DPLA_-_6a67a9859fe10d26df26f30dc6588fec.jpg")
                    .description("Fotografia principal de Tradução e Intérprete Services.")
                    .build()
    ),

    TRADUCAO_E_INTERPRETE_SERVICES_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Tradução e Intérprete Services")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Interpreters_%2801113765%29_%289840848393%29.jpg/1280px-Interpreters_%2801113765%29_%289840848393%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Interpreters_%2801113765%29_%289840848393%29.jpg/480px-Interpreters_%2801113765%29_%289840848393%29.jpg")
                    .description("Logotipo oficial de Tradução e Intérprete Services.")
                    .build()
    ),

    INTERPRETE_PRO_ANGOLA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Intérprete Pro Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Karlos_Del_Olmo_itzultzailea2020-2.jpg/960px-Karlos_Del_Olmo_itzultzailea2020-2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Karlos_Del_Olmo_itzultzailea2020-2.jpg/960px-Karlos_Del_Olmo_itzultzailea2020-2.jpg")
                    .description("Fotografia principal de Intérprete Pro Angola.")
                    .build()
    ),

    INTERPRETE_PRO_ANGOLA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Intérprete Pro Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Msiri_interpreter_and_spies.jpg/1280px-Msiri_interpreter_and_spies.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Msiri_interpreter_and_spies.jpg/480px-Msiri_interpreter_and_spies.jpg")
                    .description("Logotipo oficial de Intérprete Pro Angola.")
                    .build()
    ),

    IDIOMAS_KWANZA_IMAGE(
            DocumentFile.builder()
                    .title("Imagem Idiomas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/d/df/Bangladesh_Parliament_Business_Advisory_Committee_Meeting_%28PID-0056341%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/d/df/Bangladesh_Parliament_Business_Advisory_Committee_Meeting_%28PID-0056341%29.jpg")
                    .description("Fotografia principal de Idiomas Kwanza.")
                    .build()
    ),

    IDIOMAS_KWANZA_LOGO(
            DocumentFile.builder()
                    .title("Logotipo Idiomas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Business_meeting_or_training_seminar_of_the_company_Bang_%26_Co_1973_%28JOKAUAS2_16403-1%29.tif/lossy-page1-1280px-Business_meeting_or_training_seminar_of_the_company_Bang_%26_Co_1973_%28JOKAUAS2_16403-1%29.tif.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Business_meeting_or_training_seminar_of_the_company_Bang_%26_Co_1973_%28JOKAUAS2_16403-1%29.tif/lossy-page1-1280px-Business_meeting_or_training_seminar_of_the_company_Bang_%26_Co_1973_%28JOKAUAS2_16403-1%29.tif.jpg")
                    .description("Logotipo oficial de Idiomas Kwanza.")
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_BAIA_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Single Deluxe - Hotel Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/2020-09-24_21_06_04_A_bathroom_sink_and_toilet_in_a_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/1280px-thumbnail.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/2020-09-24_21_06_04_A_bathroom_sink_and_toilet_in_a_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/480px-thumbnail.jpg")
                    .description("Fotografia de Quarto Single Deluxe.")
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_BAIA_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Casal Premium - Hotel Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/%22Calliope%22_bed_in_the_Celestial_Suites_room_of_the_Hotel_Astrodome_in_Houston%2C_Texas_LCCN2011631571.tif/lossy-page1-1280px-%22Calliope%22_bed_in_the_Celestial_Suites_room_of_the_Hotel_Astrodome_in_Houston%2C_Texas_LCCN2011631571.tif.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/%22Calliope%22_bed_in_the_Celestial_Suites_room_of_the_Hotel_Astrodome_in_Houston%2C_Texas_LCCN2011631571.tif/lossy-page1-1280px-%22Calliope%22_bed_in_the_Celestial_Suites_room_of_the_Hotel_Astrodome_in_Houston%2C_Texas_LCCN2011631571.tif.jpg")
                    .description("Fotografia de Quarto Casal Premium.")
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_BAIA_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Suite Familiar - Hotel Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Canopy_bed_of_Amantaka_Suite_in_Amantaka_luxury_Resort_%26_Hotel_in_Luang_Prabang_Laos_5x4.jpg/1280px-Canopy_bed_of_Amantaka_Suite_in_Amantaka_luxury_Resort_%26_Hotel_in_Luang_Prabang_Laos_5x4.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/Canopy_bed_of_Amantaka_Suite_in_Amantaka_luxury_Resort_%26_Hotel_in_Luang_Prabang_Laos_5x4.jpg/480px-Canopy_bed_of_Amantaka_Suite_in_Amantaka_luxury_Resort_%26_Hotel_in_Luang_Prabang_Laos_5x4.jpg")
                    .description("Fotografia de Suite Familiar.")
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_BAIA_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Twin Executivo - Hotel Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Accessible_room_at_Hotel_Spenerhaus_%283227740249%29.jpg/1280px-Accessible_room_at_Hotel_Spenerhaus_%283227740249%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Accessible_room_at_Hotel_Spenerhaus_%283227740249%29.jpg/480px-Accessible_room_at_Hotel_Spenerhaus_%283227740249%29.jpg")
                    .description("Fotografia de Quarto Twin Executivo.")
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_BAIA_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Apartamento T1 Executivo - Hotel Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Apartment_hotel_Nice.jpg/1280px-Apartment_hotel_Nice.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Apartment_hotel_Nice.jpg/480px-Apartment_hotel_Nice.jpg")
                    .description("Fotografia de Apartamento T1 Executivo.")
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_MILANO_RESORT_SPA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Single Deluxe - Hotel Milano Resort & Spa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/2020-09-24_21_06_58_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/1280px-2020-09-24_21_06_58_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/2020-09-24_21_06_58_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/480px-2020-09-24_21_06_58_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg")
                    .description("Fotografia de Quarto Single Deluxe.")
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_MILANO_RESORT_SPA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Casal Premium - Hotel Milano Resort & Spa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Bed_in_hotel_room.jpg/1280px-Bed_in_hotel_room.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Bed_in_hotel_room.jpg/480px-Bed_in_hotel_room.jpg")
                    .description("Fotografia de Quarto Casal Premium.")
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_MILANO_RESORT_SPA_PHOTO(
            DocumentFile.builder()
                    .title("Suite Familiar - Hotel Milano Resort & Spa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Casanova_Suite_Living_Room.jpg/1280px-Casanova_Suite_Living_Room.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Casanova_Suite_Living_Room.jpg/480px-Casanova_Suite_Living_Room.jpg")
                    .description("Fotografia de Suite Familiar.")
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_MILANO_RESORT_SPA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Twin Executivo - Hotel Milano Resort & Spa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/At_Morocco_2023_32.jpg/1280px-At_Morocco_2023_32.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/At_Morocco_2023_32.jpg/480px-At_Morocco_2023_32.jpg")
                    .description("Fotografia de Quarto Twin Executivo.")
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_MILANO_RESORT_SPA_PHOTO(
            DocumentFile.builder()
                    .title("Apartamento T1 Executivo - Hotel Milano Resort & Spa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Broadview_Hotel_Douglas_Co_NE_west_facade.jpg/1280px-Broadview_Hotel_Douglas_Co_NE_west_facade.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Broadview_Hotel_Douglas_Co_NE_west_facade.jpg/480px-Broadview_Hotel_Douglas_Co_NE_west_facade.jpg")
                    .description("Fotografia de Apartamento T1 Executivo.")
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_KALANDULA_PALACE_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Single Deluxe - Hotel Kalandula Palace")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/2020-09-24_21_07_09_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/1280px-2020-09-24_21_07_09_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/2020-09-24_21_07_09_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/480px-2020-09-24_21_07_09_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg")
                    .description("Fotografia de Quarto Single Deluxe.")
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_KALANDULA_PALACE_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Casal Premium - Hotel Kalandula Palace")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Bed_in_hotel_room_2.jpg/1280px-Bed_in_hotel_room_2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Bed_in_hotel_room_2.jpg/480px-Bed_in_hotel_room_2.jpg")
                    .description("Fotografia de Quarto Casal Premium.")
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_KALANDULA_PALACE_PHOTO(
            DocumentFile.builder()
                    .title("Suite Familiar - Hotel Kalandula Palace")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Deluxe_Suite_Living_Room_%285547319695%29.jpg/1280px-Deluxe_Suite_Living_Room_%285547319695%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Deluxe_Suite_Living_Room_%285547319695%29.jpg/480px-Deluxe_Suite_Living_Room_%285547319695%29.jpg")
                    .description("Fotografia de Suite Familiar.")
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_KALANDULA_PALACE_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Twin Executivo - Hotel Kalandula Palace")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Comfort_Twin_Room_in_Triple_Configuration_%2821917602991%29.jpg/1280px-Comfort_Twin_Room_in_Triple_Configuration_%2821917602991%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Comfort_Twin_Room_in_Triple_Configuration_%2821917602991%29.jpg/480px-Comfort_Twin_Room_in_Triple_Configuration_%2821917602991%29.jpg")
                    .description("Fotografia de Quarto Twin Executivo.")
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_KALANDULA_PALACE_PHOTO(
            DocumentFile.builder()
                    .title("Apartamento T1 Executivo - Hotel Kalandula Palace")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Holiday_Villa.jpg/1280px-Holiday_Villa.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Holiday_Villa.jpg/480px-Holiday_Villa.jpg")
                    .description("Fotografia de Apartamento T1 Executivo.")
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_MIRAMAR_BUSINESS_HOTEL_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Single Deluxe - Miramar Business Hotel")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/2020-09-24_21_07_24_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/1280px-2020-09-24_21_07_24_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/2020-09-24_21_07_24_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg/480px-2020-09-24_21_07_24_A_room_with_a_single_king-size_bed_at_the_Ramada_by_Wyndham_Rochelle_Park_in_Rochelle_Park_Township%2C_Bergen_County%2C_New_Jersey.jpg")
                    .description("Fotografia de Quarto Single Deluxe.")
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_MIRAMAR_BUSINESS_HOTEL_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Casal Premium - Miramar Business Hotel")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Bed_in_hotel_room_3.jpg/1280px-Bed_in_hotel_room_3.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Bed_in_hotel_room_3.jpg/480px-Bed_in_hotel_room_3.jpg")
                    .description("Fotografia de Quarto Casal Premium.")
                    .build()
    ),

    SUITE_FAMILIAR_MIRAMAR_BUSINESS_HOTEL_PHOTO(
            DocumentFile.builder()
                    .title("Suite Familiar - Miramar Business Hotel")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Deluxe_Suite_Living_Room_%285547902622%29.jpg/1280px-Deluxe_Suite_Living_Room_%285547902622%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Deluxe_Suite_Living_Room_%285547902622%29.jpg/480px-Deluxe_Suite_Living_Room_%285547902622%29.jpg")
                    .description("Fotografia de Suite Familiar.")
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Twin Executivo - Miramar Business Hotel")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Deluxe_Room_-_Twin_beds.jpg/1280px-Deluxe_Room_-_Twin_beds.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Deluxe_Room_-_Twin_beds.jpg/480px-Deluxe_Room_-_Twin_beds.jpg")
                    .description("Fotografia de Quarto Twin Executivo.")
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_MIRAMAR_BUSINESS_HOTEL_PHOTO(
            DocumentFile.builder()
                    .title("Apartamento T1 Executivo - Miramar Business Hotel")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Holiday_Villa_-_panoramio.jpg/1280px-Holiday_Villa_-_panoramio.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Holiday_Villa_-_panoramio.jpg/480px-Holiday_Villa_-_panoramio.jpg")
                    .description("Fotografia de Apartamento T1 Executivo.")
                    .build()
    ),

    QUARTO_SINGLE_DELUXE_HOTEL_CASCADE_CITY_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Single Deluxe - Hotel Cascade City")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Hotel_Porto_Santa_Maria%2C_Funchal%2C_Madeira.jpg/1280px-Hotel_Porto_Santa_Maria%2C_Funchal%2C_Madeira.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Hotel_Porto_Santa_Maria%2C_Funchal%2C_Madeira.jpg/480px-Hotel_Porto_Santa_Maria%2C_Funchal%2C_Madeira.jpg")
                    .description("Fotografia de Quarto Single Deluxe.")
                    .build()
    ),

    QUARTO_CASAL_PREMIUM_HOTEL_CASCADE_CITY_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Casal Premium - Hotel Cascade City")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Bed_in_hotel_room_4.jpg/1280px-Bed_in_hotel_room_4.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Bed_in_hotel_room_4.jpg/480px-Bed_in_hotel_room_4.jpg")
                    .description("Fotografia de Quarto Casal Premium.")
                    .build()
    ),

    SUITE_FAMILIAR_HOTEL_CASCADE_CITY_PHOTO(
            DocumentFile.builder()
                    .title("Suite Familiar - Hotel Cascade City")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242119363%29.jpg/1280px-Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242119363%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242119363%29.jpg/480px-Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242119363%29.jpg")
                    .description("Fotografia de Suite Familiar.")
                    .build()
    ),

    QUARTO_TWIN_EXECUTIVO_HOTEL_CASCADE_CITY_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Twin Executivo - Hotel Cascade City")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Forest_Of_Hope_Guest_House.jpg/1280px-Forest_Of_Hope_Guest_House.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Forest_Of_Hope_Guest_House.jpg/480px-Forest_Of_Hope_Guest_House.jpg")
                    .description("Fotografia de Quarto Twin Executivo.")
                    .build()
    ),

    APARTAMENTO_T1_EXECUTIVO_HOTEL_CASCADE_CITY_PHOTO(
            DocumentFile.builder()
                    .title("Apartamento T1 Executivo - Hotel Cascade City")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Holiday_villa_in_Partina_-_panoramio.jpg/1280px-Holiday_villa_in_Partina_-_panoramio.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Holiday_villa_in_Partina_-_panoramio.jpg/480px-Holiday_villa_in_Partina_-_panoramio.jpg")
                    .description("Fotografia de Apartamento T1 Executivo.")
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_VILA_HARMONY_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Standard - Pousada Vila Harmony")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/American_homes_and_gardens_%281912%29_%2818128355536%29.jpg/1280px-American_homes_and_gardens_%281912%29_%2818128355536%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/American_homes_and_gardens_%281912%29_%2818128355536%29.jpg/480px-American_homes_and_gardens_%281912%29_%2818128355536%29.jpg")
                    .description("Fotografia de Quarto Standard.")
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_VILA_HARMONY_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Familiar - Pousada Vila Harmony")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/April_1967_OWNER%27S_BEDROOM_FROM_SOUTHWEST_-_Mar-a-Lago%2C_1100_South_Ocean_Boulevard%2C_Palm_Beach%2C_Palm_Beach_County%2C_FL_HABS_FLA%2C50-PALM%2C1-76.tif/lossy-page1-1280px-April_1967_OWNER%27S_BEDROOM_FROM_SOUTHWEST_-_Mar-a-Lago%2C_1100_South_Ocean_Boulevard%2C_Palm_Beach%2C_Palm_Beach_County%2C_FL_HABS_FLA%2C50-PALM%2C1-76.tif.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/April_1967_OWNER%27S_BEDROOM_FROM_SOUTHWEST_-_Mar-a-Lago%2C_1100_South_Ocean_Boulevard%2C_Palm_Beach%2C_Palm_Beach_County%2C_FL_HABS_FLA%2C50-PALM%2C1-76.tif/lossy-page1-1280px-April_1967_OWNER%27S_BEDROOM_FROM_SOUTHWEST_-_Mar-a-Lago%2C_1100_South_Ocean_Boulevard%2C_Palm_Beach%2C_Palm_Beach_County%2C_FL_HABS_FLA%2C50-PALM%2C1-76.tif.jpg")
                    .description("Fotografia de Quarto Familiar.")
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_VILA_HARMONY_PHOTO(
            DocumentFile.builder()
                    .title("Quarto com Varanda - Pousada Vila Harmony")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/11_suiteon7th.jpg/1280px-11_suiteon7th.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/11_suiteon7th.jpg/480px-11_suiteon7th.jpg")
                    .description("Fotografia de Quarto com Varanda.")
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_VILA_HARMONY_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Económico - Pousada Vila Harmony")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Belfast_Ibis_Hotel_-_Castle_Street_%285688450028%29.jpg/1280px-Belfast_Ibis_Hotel_-_Castle_Street_%285688450028%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Belfast_Ibis_Hotel_-_Castle_Street_%285688450028%29.jpg/480px-Belfast_Ibis_Hotel_-_Castle_Street_%285688450028%29.jpg")
                    .description("Fotografia de Quarto Económico.")
                    .build()
    ),

    QUARTO_TWIN_POUSADA_VILA_HARMONY_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Twin - Pousada Vila Harmony")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Ardtornish_House_-_interior%2C_view_of_billiard_room_flat_twin_bedroom.jpg/1280px-Ardtornish_House_-_interior%2C_view_of_billiard_room_flat_twin_bedroom.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Ardtornish_House_-_interior%2C_view_of_billiard_room_flat_twin_bedroom.jpg/480px-Ardtornish_House_-_interior%2C_view_of_billiard_room_flat_twin_bedroom.jpg")
                    .description("Fotografia de Quarto Twin.")
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_BAIA_AZUL_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Standard - Pousada Baía Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Beauty_in_simplicity_-_Flickr_-_Ryan_Vaarsi.jpg/1280px-Beauty_in_simplicity_-_Flickr_-_Ryan_Vaarsi.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Beauty_in_simplicity_-_Flickr_-_Ryan_Vaarsi.jpg/480px-Beauty_in_simplicity_-_Flickr_-_Ryan_Vaarsi.jpg")
                    .description("Fotografia de Quarto Standard.")
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_BAIA_AZUL_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Familiar - Pousada Baía Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Bridal_Tea_House_Hotel_-_Classic_Family_Room.jpg/1280px-Bridal_Tea_House_Hotel_-_Classic_Family_Room.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Bridal_Tea_House_Hotel_-_Classic_Family_Room.jpg/480px-Bridal_Tea_House_Hotel_-_Classic_Family_Room.jpg")
                    .description("Fotografia de Quarto Familiar.")
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_BAIA_AZUL_PHOTO(
            DocumentFile.builder()
                    .title("Quarto com Varanda - Pousada Baía Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Corner_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/1280px-Corner_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Corner_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/480px-Corner_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .description("Fotografia de Quarto com Varanda.")
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_BAIA_AZUL_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Económico - Pousada Baía Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Dining_Room_Fireplace%2C_The_Lodge_at_Bryce_Canyon%2C_Bryce_Canyon_National_Park%2C_Bryce_Canyon_City%2C_UT.jpg/1280px-Dining_Room_Fireplace%2C_The_Lodge_at_Bryce_Canyon%2C_Bryce_Canyon_National_Park%2C_Bryce_Canyon_City%2C_UT.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Dining_Room_Fireplace%2C_The_Lodge_at_Bryce_Canyon%2C_Bryce_Canyon_National_Park%2C_Bryce_Canyon_City%2C_UT.jpg/480px-Dining_Room_Fireplace%2C_The_Lodge_at_Bryce_Canyon%2C_Bryce_Canyon_National_Park%2C_Bryce_Canyon_City%2C_UT.jpg")
                    .description("Fotografia de Quarto Económico.")
                    .build()
    ),

    QUARTO_TWIN_POUSADA_BAIA_AZUL_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Twin - Pousada Baía Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Building_interior_Twin_Arrows_AZ_2026-04-06_09-44-47_1.jpg/1280px-Building_interior_Twin_Arrows_AZ_2026-04-06_09-44-47_1.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Building_interior_Twin_Arrows_AZ_2026-04-06_09-44-47_1.jpg/480px-Building_interior_Twin_Arrows_AZ_2026-04-06_09-44-47_1.jpg")
                    .description("Fotografia de Quarto Twin.")
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_RECANTO_VERDE_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Standard - Pousada Recanto Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Casa_de_Le%C3%B3n_Trotsky_2.jpg/1280px-Casa_de_Le%C3%B3n_Trotsky_2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Casa_de_Le%C3%B3n_Trotsky_2.jpg/480px-Casa_de_Le%C3%B3n_Trotsky_2.jpg")
                    .description("Fotografia de Quarto Standard.")
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_RECANTO_VERDE_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Familiar - Pousada Recanto Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Bridal_Tea_House_Hotel_-_Modern_Family_Room.jpg/1280px-Bridal_Tea_House_Hotel_-_Modern_Family_Room.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Bridal_Tea_House_Hotel_-_Modern_Family_Room.jpg/480px-Bridal_Tea_House_Hotel_-_Modern_Family_Room.jpg")
                    .description("Fotografia de Quarto Familiar.")
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_RECANTO_VERDE_PHOTO(
            DocumentFile.builder()
                    .title("Quarto com Varanda - Pousada Recanto Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Courtyard_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/1280px-Courtyard_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Courtyard_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/480px-Courtyard_Guest_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .description("Fotografia de Quarto com Varanda.")
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_RECANTO_VERDE_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Económico - Pousada Recanto Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/E5239-Zaragoza-Si-Usted-fuma.jpg/1280px-E5239-Zaragoza-Si-Usted-fuma.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/E5239-Zaragoza-Si-Usted-fuma.jpg/480px-E5239-Zaragoza-Si-Usted-fuma.jpg")
                    .description("Fotografia de Quarto Económico.")
                    .build()
    ),

    QUARTO_TWIN_POUSADA_RECANTO_VERDE_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Twin - Pousada Recanto Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Collapsing_roof_Twin_Arrows_AZ_2026-04-06_09-43-16_1.jpg/1280px-Collapsing_roof_Twin_Arrows_AZ_2026-04-06_09-43-16_1.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Collapsing_roof_Twin_Arrows_AZ_2026-04-06_09-43-16_1.jpg/480px-Collapsing_roof_Twin_Arrows_AZ_2026-04-06_09-43-16_1.jpg")
                    .description("Fotografia de Quarto Twin.")
                    .build()
    ),

    QUARTO_STANDARD_POUSADA_SAO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Standard - Pousada São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/EFTA00002045_-_Minimalist_bedroom_with_white_walls_light_wood_flooring_and_a_simple_wooden_desk_against_a_window_with_sheer_curtains_A_woven_basket_and_a_small_rug_add_texture_and_warmth_to_the_space.jpg/1280px-EFTA00002045_-_Minimalist_bedroom_with_white_walls_light_wood_flooring_and_a_simple_wooden_desk_against_a_window_with_sheer_curtains_A_woven_basket_and_a_small_rug_add_texture_and_warmth_to_the_space.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/EFTA00002045_-_Minimalist_bedroom_with_white_walls_light_wood_flooring_and_a_simple_wooden_desk_against_a_window_with_sheer_curtains_A_woven_basket_and_a_small_rug_add_texture_and_warmth_to_the_space.jpg/480px-EFTA00002045_-_Minimalist_bedroom_with_white_walls_light_wood_flooring_and_a_simple_wooden_desk_against_a_window_with_sheer_curtains_A_woven_basket_and_a_small_rug_add_texture_and_warmth_to_the_space.jpg")
                    .description("Fotografia de Quarto Standard.")
                    .build()
    ),

    QUARTO_FAMILIAR_POUSADA_SAO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Familiar - Pousada São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Construction_continues_on_new_Army_hotel_in_Stuttgart_%284817870469%29.jpg/1280px-Construction_continues_on_new_Army_hotel_in_Stuttgart_%284817870469%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Construction_continues_on_new_Army_hotel_in_Stuttgart_%284817870469%29.jpg/480px-Construction_continues_on_new_Army_hotel_in_Stuttgart_%284817870469%29.jpg")
                    .description("Fotografia de Quarto Familiar.")
                    .build()
    ),

    QUARTO_COM_VARANDA_POUSADA_SAO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto com Varanda - Pousada São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/EFTA00002099_-_Cozy_bedroom_with_a_white_bed_wicker_chair_piled_with_clothes_and_a_large_window_leading_to_a_balcony.jpg/1280px-EFTA00002099_-_Cozy_bedroom_with_a_white_bed_wicker_chair_piled_with_clothes_and_a_large_window_leading_to_a_balcony.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/EFTA00002099_-_Cozy_bedroom_with_a_white_bed_wicker_chair_piled_with_clothes_and_a_large_window_leading_to_a_balcony.jpg/480px-EFTA00002099_-_Cozy_bedroom_with_a_white_bed_wicker_chair_piled_with_clothes_and_a_large_window_leading_to_a_balcony.jpg")
                    .description("Fotografia de Quarto com Varanda.")
                    .build()
    ),

    QUARTO_ECONOMICO_POUSADA_SAO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Económico - Pousada São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Hotel_Planet_Merah_%2830514742646%29.jpg/1280px-Hotel_Planet_Merah_%2830514742646%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Hotel_Planet_Merah_%2830514742646%29.jpg/480px-Hotel_Planet_Merah_%2830514742646%29.jpg")
                    .description("Fotografia de Quarto Económico.")
                    .build()
    ),

    QUARTO_TWIN_POUSADA_SAO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Twin - Pousada São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Flickr_-_ronsaunders47_-_John_Lennon%27s_%22White_Room%22.jpg/1280px-Flickr_-_ronsaunders47_-_John_Lennon%27s_%22White_Room%22.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Flickr_-_ronsaunders47_-_John_Lennon%27s_%22White_Room%22.jpg/480px-Flickr_-_ronsaunders47_-_John_Lennon%27s_%22White_Room%22.jpg")
                    .description("Fotografia de Quarto Twin.")
                    .build()
    ),

    QUARTO_STANDARD_GUEST_HOUSE_MIRAMAR_INN_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Standard - Guest House Miramar Inn")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Petit_Trianon_%2823676271953%29.jpg/1280px-Petit_Trianon_%2823676271953%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Petit_Trianon_%2823676271953%29.jpg/480px-Petit_Trianon_%2823676271953%29.jpg")
                    .description("Fotografia de Quarto Standard.")
                    .build()
    ),

    QUARTO_FAMILIAR_GUEST_HOUSE_MIRAMAR_INN_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Familiar - Guest House Miramar Inn")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Cozumel_Caribe_Hotel_Room_1973.jpg/1280px-Cozumel_Caribe_Hotel_Room_1973.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Cozumel_Caribe_Hotel_Room_1973.jpg/480px-Cozumel_Caribe_Hotel_Room_1973.jpg")
                    .description("Fotografia de Quarto Familiar.")
                    .build()
    ),

    QUARTO_COM_VARANDA_GUEST_HOUSE_MIRAMAR_INN_PHOTO(
            DocumentFile.builder()
                    .title("Quarto com Varanda - Guest House Miramar Inn")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/1280px-Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/480px-Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .description("Fotografia de Quarto com Varanda.")
                    .build()
    ),

    QUARTO_ECONOMICO_GUEST_HOUSE_MIRAMAR_INN_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Económico - Guest House Miramar Inn")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Hyderabad_Hotel_%2820_May_2016%29.jpg/1280px-Hyderabad_Hotel_%2820_May_2016%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Hyderabad_Hotel_%2820_May_2016%29.jpg/480px-Hyderabad_Hotel_%2820_May_2016%29.jpg")
                    .description("Fotografia de Quarto Económico.")
                    .build()
    ),

    QUARTO_TWIN_GUEST_HOUSE_MIRAMAR_INN_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Twin - Guest House Miramar Inn")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Hotel_Pohjanhovi_Standard_Twin_bathroom_b.jpg/1280px-Hotel_Pohjanhovi_Standard_Twin_bathroom_b.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Hotel_Pohjanhovi_Standard_Twin_bathroom_b.jpg/480px-Hotel_Pohjanhovi_Standard_Twin_bathroom_b.jpg")
                    .description("Fotografia de Quarto Twin.")
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_PROGRESSO_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Simples - Hospedaria Progresso")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Art_Deco_facade_of_Pinnaroo_Institute_in_the_Murray_Mallee_South_Australia._%287524849558%29.jpg/1280px-Art_Deco_facade_of_Pinnaroo_Institute_in_the_Murray_Mallee_South_Australia._%287524849558%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Art_Deco_facade_of_Pinnaroo_Institute_in_the_Murray_Mallee_South_Australia._%287524849558%29.jpg/480px-Art_Deco_facade_of_Pinnaroo_Institute_in_the_Murray_Mallee_South_Australia._%287524849558%29.jpg")
                    .description("Fotografia de Quarto Simples.")
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_PROGRESSO_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Single - Hospedaria Progresso")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/American_homes_and_gardens_%281905%29_%2817965027030%29.jpg/1280px-American_homes_and_gardens_%281905%29_%2817965027030%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/American_homes_and_gardens_%281905%29_%2817965027030%29.jpg/480px-American_homes_and_gardens_%281905%29_%2817965027030%29.jpg")
                    .description("Fotografia de Quarto Single.")
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_PROGRESSO_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Familiar - Hospedaria Progresso")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Aston_Kuta_Family_Room_%2811267223136%29.jpg/1280px-Aston_Kuta_Family_Room_%2811267223136%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Aston_Kuta_Family_Room_%2811267223136%29.jpg/480px-Aston_Kuta_Family_Room_%2811267223136%29.jpg")
                    .description("Fotografia de Quarto Familiar.")
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_PROGRESSO_PHOTO(
            DocumentFile.builder()
                    .title("Quarto com Banho Privativo - Hospedaria Progresso")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_01.jpg/1280px-GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_01.jpg/480px-GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_01.jpg")
                    .description("Fotografia de Quarto com Banho Privativo.")
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_PROGRESSO_PHOTO(
            DocumentFile.builder()
                    .title("Estadia Prolongada - Hospedaria Progresso")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/D%27Brickashaw_Ferguson_-_Jets_-_Sept_2009_%28cropped%29.jpg/1280px-D%27Brickashaw_Ferguson_-_Jets_-_Sept_2009_%28cropped%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/D%27Brickashaw_Ferguson_-_Jets_-_Sept_2009_%28cropped%29.jpg/480px-D%27Brickashaw_Ferguson_-_Jets_-_Sept_2009_%28cropped%29.jpg")
                    .description("Fotografia de Estadia Prolongada.")
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Simples - Hospedaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Bulletin_of_the_State_Normal_School%2C_Fredericksburg%2C_Virginia%2C_June%2C_1917_%281917%29_%2814597260868%29.jpg/1280px-Bulletin_of_the_State_Normal_School%2C_Fredericksburg%2C_Virginia%2C_June%2C_1917_%281917%29_%2814597260868%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Bulletin_of_the_State_Normal_School%2C_Fredericksburg%2C_Virginia%2C_June%2C_1917_%281917%29_%2814597260868%29.jpg/480px-Bulletin_of_the_State_Normal_School%2C_Fredericksburg%2C_Virginia%2C_June%2C_1917_%281917%29_%2814597260868%29.jpg")
                    .description("Fotografia de Quarto Simples.")
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Single - Hospedaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/American_homes_and_gardens_%281911%29_%2818126631076%29.jpg/1280px-American_homes_and_gardens_%281911%29_%2818126631076%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/American_homes_and_gardens_%281911%29_%2818126631076%29.jpg/480px-American_homes_and_gardens_%281911%29_%2818126631076%29.jpg")
                    .description("Fotografia de Quarto Single.")
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Familiar - Hospedaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Descendants_of_the_Willard_Family_pose_in_the_Willard_Hotel_Crystal_Room_after_the_renovation_in_1984._Washington%2C_D.C_LCCN2011631123.tif/lossy-page1-1280px-Descendants_of_the_Willard_Family_pose_in_the_Willard_Hotel_Crystal_Room_after_the_renovation_in_1984._Washington%2C_D.C_LCCN2011631123.tif.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Descendants_of_the_Willard_Family_pose_in_the_Willard_Hotel_Crystal_Room_after_the_renovation_in_1984._Washington%2C_D.C_LCCN2011631123.tif/lossy-page1-1280px-Descendants_of_the_Willard_Family_pose_in_the_Willard_Hotel_Crystal_Room_after_the_renovation_in_1984._Washington%2C_D.C_LCCN2011631123.tif.jpg")
                    .description("Fotografia de Quarto Familiar.")
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto com Banho Privativo - Hospedaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/GD_%E5%BB%A3%E6%9D%B1%E7%9C%81_Guangdong_DG_%E6%9D%B1%E8%8E%9E%E5%B8%82_DongGuan_%E5%AE%B6%E5%85%B7%E5%A4%A7%E9%81%93_Jiaju_Avenue_%E7%B2%B5%E9%BE%8D%E9%85%92%E5%BA%97_YueLong_Hotel_bathroom_December_2025_N13P_07.jpg/1280px-GD_%E5%BB%A3%E6%9D%B1%E7%9C%81_Guangdong_DG_%E6%9D%B1%E8%8E%9E%E5%B8%82_DongGuan_%E5%AE%B6%E5%85%B7%E5%A4%A7%E9%81%93_Jiaju_Avenue_%E7%B2%B5%E9%BE%8D%E9%85%92%E5%BA%97_YueLong_Hotel_bathroom_December_2025_N13P_07.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/GD_%E5%BB%A3%E6%9D%B1%E7%9C%81_Guangdong_DG_%E6%9D%B1%E8%8E%9E%E5%B8%82_DongGuan_%E5%AE%B6%E5%85%B7%E5%A4%A7%E9%81%93_Jiaju_Avenue_%E7%B2%B5%E9%BE%8D%E9%85%92%E5%BA%97_YueLong_Hotel_bathroom_December_2025_N13P_07.jpg/480px-GD_%E5%BB%A3%E6%9D%B1%E7%9C%81_Guangdong_DG_%E6%9D%B1%E8%8E%9E%E5%B8%82_DongGuan_%E5%AE%B6%E5%85%B7%E5%A4%A7%E9%81%93_Jiaju_Avenue_%E7%B2%B5%E9%BE%8D%E9%85%92%E5%BA%97_YueLong_Hotel_bathroom_December_2025_N13P_07.jpg")
                    .description("Fotografia de Quarto com Banho Privativo.")
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Estadia Prolongada - Hospedaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Diary_of_a_refugee_%281910%29_%2814784387455%29.jpg/1280px-Diary_of_a_refugee_%281910%29_%2814784387455%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Diary_of_a_refugee_%281910%29_%2814784387455%29.jpg/480px-Diary_of_a_refugee_%281910%29_%2814784387455%29.jpg")
                    .description("Fotografia de Estadia Prolongada.")
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_KATANGA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Simples - Hospedaria Katanga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Eastnor_Castle_-_Eastnor_Lake_%2834052971815%29.jpg/1280px-Eastnor_Castle_-_Eastnor_Lake_%2834052971815%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Eastnor_Castle_-_Eastnor_Lake_%2834052971815%29.jpg/480px-Eastnor_Castle_-_Eastnor_Lake_%2834052971815%29.jpg")
                    .description("Fotografia de Quarto Simples.")
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_KATANGA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Single - Hospedaria Katanga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Bulletin_%281910%29_%2814779645144%29.jpg/1280px-Bulletin_%281910%29_%2814779645144%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Bulletin_%281910%29_%2814779645144%29.jpg/480px-Bulletin_%281910%29_%2814779645144%29.jpg")
                    .description("Fotografia de Quarto Single.")
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_KATANGA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Familiar - Hospedaria Katanga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Dining_room_at_Llanthony_Priory_hotel_-_geograph.org.uk_-_1767747.jpg/1280px-Dining_room_at_Llanthony_Priory_hotel_-_geograph.org.uk_-_1767747.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Dining_room_at_Llanthony_Priory_hotel_-_geograph.org.uk_-_1767747.jpg/480px-Dining_room_at_Llanthony_Priory_hotel_-_geograph.org.uk_-_1767747.jpg")
                    .description("Fotografia de Quarto Familiar.")
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_KATANGA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto com Banho Privativo - Hospedaria Katanga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/MC_%E6%BE%B3%E9%96%80_Macau_%E6%BE%B3%E9%96%80%E5%8D%8A%E5%B3%B6_Macao_Peninsula_%E5%BE%97%E5%8B%9D%E9%A6%AC%E8%B7%AF_2_Estrada_da_Vit%C3%B3ria_%E7%9A%87%E9%83%BD%E9%85%92%E5%BA%97_Royal_Macau_Hotel_hotel_%E6%B5%B4%E5%AE%A4_bathroom_%E6%B5%B4%E5%B8%98_shower_curtain_November_2024_R12S_01.jpg/1280px-thumbnail.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/MC_%E6%BE%B3%E9%96%80_Macau_%E6%BE%B3%E9%96%80%E5%8D%8A%E5%B3%B6_Macao_Peninsula_%E5%BE%97%E5%8B%9D%E9%A6%AC%E8%B7%AF_2_Estrada_da_Vit%C3%B3ria_%E7%9A%87%E9%83%BD%E9%85%92%E5%BA%97_Royal_Macau_Hotel_hotel_%E6%B5%B4%E5%AE%A4_bathroom_%E6%B5%B4%E5%B8%98_shower_curtain_November_2024_R12S_01.jpg/480px-thumbnail.jpg")
                    .description("Fotografia de Quarto com Banho Privativo.")
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_KATANGA_PHOTO(
            DocumentFile.builder()
                    .title("Estadia Prolongada - Hospedaria Katanga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Her_Majesty%27s_visit_to_the_Great_Britain_steam-ship_on_Tuesday_last_ILN_1845-0426-0001.jpg/1280px-Her_Majesty%27s_visit_to_the_Great_Britain_steam-ship_on_Tuesday_last_ILN_1845-0426-0001.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Her_Majesty%27s_visit_to_the_Great_Britain_steam-ship_on_Tuesday_last_ILN_1845-0426-0001.jpg/480px-Her_Majesty%27s_visit_to_the_Great_Britain_steam-ship_on_Tuesday_last_ILN_1845-0426-0001.jpg")
                    .description("Fotografia de Estadia Prolongada.")
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_NOVA_VIDA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Simples - Hospedaria Nova Vida")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Eastnor_Castle_-_Eastnor_Lake_%2834052997115%29.jpg/1280px-Eastnor_Castle_-_Eastnor_Lake_%2834052997115%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Eastnor_Castle_-_Eastnor_Lake_%2834052997115%29.jpg/480px-Eastnor_Castle_-_Eastnor_Lake_%2834052997115%29.jpg")
                    .description("Fotografia de Quarto Simples.")
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_NOVA_VIDA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Single - Hospedaria Nova Vida")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/DSC_8565_A_luxurious_blue-themed_bedroom_with_draped_fabric_ceiling_chandelier_tufted_headboard_and_elegant_seating_opening_onto_a_sunny_patio_with_lounge_chairs.jpg/1280px-thumbnail.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/DSC_8565_A_luxurious_blue-themed_bedroom_with_draped_fabric_ceiling_chandelier_tufted_headboard_and_elegant_seating_opening_onto_a_sunny_patio_with_lounge_chairs.jpg/480px-thumbnail.jpg")
                    .description("Fotografia de Quarto Single.")
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_NOVA_VIDA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Familiar - Hospedaria Nova Vida")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/Family_Room.jpg/1280px-Family_Room.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/Family_Room.jpg/480px-Family_Room.jpg")
                    .description("Fotografia de Quarto Familiar.")
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_NOVA_VIDA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto com Banho Privativo - Hospedaria Nova Vida")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_02.jpg/1280px-GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_02.jpg/480px-GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E5%BB%A3%E5%B7%9E_Guangzhou_Huangpu_MUSTEL_Hotel_Knowledge_City_%E6%B5%B4%E5%AE%A4_bathroom_shower_June_2025_R12S_02.jpg")
                    .description("Fotografia de Quarto com Banho Privativo.")
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_NOVA_VIDA_PHOTO(
            DocumentFile.builder()
                    .title("Estadia Prolongada - Hospedaria Nova Vida")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Letter_signed_Sara%2C_S.S._Arabic%2C_to_Ernst%2C_New_York_City%2C_June_23-24%2C_1927_-_DPLA_-_3b773a7162cb6ce318374acc38ec8f75_%28page_1%29.jpg/1280px-Letter_signed_Sara%2C_S.S._Arabic%2C_to_Ernst%2C_New_York_City%2C_June_23-24%2C_1927_-_DPLA_-_3b773a7162cb6ce318374acc38ec8f75_%28page_1%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Letter_signed_Sara%2C_S.S._Arabic%2C_to_Ernst%2C_New_York_City%2C_June_23-24%2C_1927_-_DPLA_-_3b773a7162cb6ce318374acc38ec8f75_%28page_1%29.jpg/480px-Letter_signed_Sara%2C_S.S._Arabic%2C_to_Ernst%2C_New_York_City%2C_June_23-24%2C_1927_-_DPLA_-_3b773a7162cb6ce318374acc38ec8f75_%28page_1%29.jpg")
                    .description("Fotografia de Estadia Prolongada.")
                    .build()
    ),

    QUARTO_SIMPLES_HOSPEDARIA_SAO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Simples - Hospedaria São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Florists%27_review_%28microform%29_%281912%29_%2816479903227%29.jpg/1280px-Florists%27_review_%28microform%29_%281912%29_%2816479903227%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Florists%27_review_%28microform%29_%281912%29_%2816479903227%29.jpg/480px-Florists%27_review_%28microform%29_%281912%29_%2816479903227%29.jpg")
                    .description("Fotografia de Quarto Simples.")
                    .build()
    ),

    QUARTO_SINGLE_HOSPEDARIA_SAO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Single - Hospedaria São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Florists%27_review_%28microform%29_%281912%29_%2816067218514%29.jpg/1280px-Florists%27_review_%28microform%29_%281912%29_%2816067218514%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Florists%27_review_%28microform%29_%281912%29_%2816067218514%29.jpg/480px-Florists%27_review_%28microform%29_%281912%29_%2816067218514%29.jpg")
                    .description("Fotografia de Quarto Single.")
                    .build()
    ),

    QUARTO_FAMILIAR_HOSPEDARIA_SAO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Familiar - Hospedaria São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Family_Suite_-_Safari_room.jpg/1280px-Family_Suite_-_Safari_room.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Family_Suite_-_Safari_room.jpg/480px-Family_Suite_-_Safari_room.jpg")
                    .description("Fotografia de Quarto Familiar.")
                    .build()
    ),

    QUARTO_COM_BANHO_PRIVATIVO_HOSPEDARIA_SAO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto com Banho Privativo - Hospedaria São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/MC_%E6%BE%B3%E9%96%80_Macau_%E6%BE%B3%E9%96%80%E5%8D%8A%E5%B3%B6_Macao_Peninsula_%E5%BE%97%E5%8B%9D%E9%A6%AC%E8%B7%AF_2_Estrada_da_Vit%C3%B3ria_%E7%9A%87%E9%83%BD%E9%85%92%E5%BA%97_Royal_Macau_Hotel_hotel_%E6%B5%B4%E5%AE%A4_bathroom_%E6%B5%B4%E5%B8%98_shower_curtain_November_2024_R12S_02.jpg/1280px-thumbnail.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/MC_%E6%BE%B3%E9%96%80_Macau_%E6%BE%B3%E9%96%80%E5%8D%8A%E5%B3%B6_Macao_Peninsula_%E5%BE%97%E5%8B%9D%E9%A6%AC%E8%B7%AF_2_Estrada_da_Vit%C3%B3ria_%E7%9A%87%E9%83%BD%E9%85%92%E5%BA%97_Royal_Macau_Hotel_hotel_%E6%B5%B4%E5%AE%A4_bathroom_%E6%B5%B4%E5%B8%98_shower_curtain_November_2024_R12S_02.jpg/480px-thumbnail.jpg")
                    .description("Fotografia de Quarto com Banho Privativo.")
                    .build()
    ),

    ESTADIA_PROLONGADA_HOSPEDARIA_SAO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Estadia Prolongada - Hospedaria São Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Letter_signed_Sara%2C_Washington%2C_Conn.%2C_to_Ernst%2C_S.S._Paris%2C_March_13%2C_1929_-_DPLA_-_7d8d6b361bf6b1eb449e3afbfd3b270f_%28page_1%29.jpg/1280px-Letter_signed_Sara%2C_Washington%2C_Conn.%2C_to_Ernst%2C_S.S._Paris%2C_March_13%2C_1929_-_DPLA_-_7d8d6b361bf6b1eb449e3afbfd3b270f_%28page_1%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Letter_signed_Sara%2C_Washington%2C_Conn.%2C_to_Ernst%2C_S.S._Paris%2C_March_13%2C_1929_-_DPLA_-_7d8d6b361bf6b1eb449e3afbfd3b270f_%28page_1%29.jpg/480px-Letter_signed_Sara%2C_Washington%2C_Conn.%2C_to_Ernst%2C_S.S._Paris%2C_March_13%2C_1929_-_DPLA_-_7d8d6b361bf6b1eb449e3afbfd3b270f_%28page_1%29.jpg")
                    .description("Fotografia de Estadia Prolongada.")
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_O_MUSQUETE_PHOTO(
            DocumentFile.builder()
                    .title("Menu Degustação do Chef - Restaurante O Musquete")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Asian_buffet_food_at_restaurant_Futo.jpg/1280px-Asian_buffet_food_at_restaurant_Futo.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Asian_buffet_food_at_restaurant_Futo.jpg/480px-Asian_buffet_food_at_restaurant_Futo.jpg")
                    .description("Fotografia de Menu Degustação do Chef.")
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_O_MUSQUETE_PHOTO(
            DocumentFile.builder()
                    .title("Prato do Dia - Restaurante O Musquete")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/A_W_A_Plate_Ad_Plate_Co_Fig_4_in_George_J_A_Skeen_Guide_to_Colombo_1898.jpg/1280px-A_W_A_Plate_Ad_Plate_Co_Fig_4_in_George_J_A_Skeen_Guide_to_Colombo_1898.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/A_W_A_Plate_Ad_Plate_Co_Fig_4_in_George_J_A_Skeen_Guide_to_Colombo_1898.jpg/480px-A_W_A_Plate_Ad_Plate_Co_Fig_4_in_George_J_A_Skeen_Guide_to_Colombo_1898.jpg")
                    .description("Fotografia de Prato do Dia.")
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_O_MUSQUETE_PHOTO(
            DocumentFile.builder()
                    .title("Bowl do Chef - Restaurante O Musquete")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Chiken_Steaks_in_Pakistan.jpg/1280px-Chiken_Steaks_in_Pakistan.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Chiken_Steaks_in_Pakistan.jpg/480px-Chiken_Steaks_in_Pakistan.jpg")
                    .description("Fotografia de Bowl do Chef.")
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_O_MUSQUETE_PHOTO(
            DocumentFile.builder()
                    .title("Menu Executivo do Dia - Restaurante O Musquete")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/1928-05-17_Paramount_Famous_Lasky_Corporation_West_Coast_Studios_Production_Department_Dinner_in_honor_or_New_York_executives_1.jpg/1280px-1928-05-17_Paramount_Famous_Lasky_Corporation_West_Coast_Studios_Production_Department_Dinner_in_honor_or_New_York_executives_1.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/1928-05-17_Paramount_Famous_Lasky_Corporation_West_Coast_Studios_Production_Department_Dinner_in_honor_or_New_York_executives_1.jpg/480px-1928-05-17_Paramount_Famous_Lasky_Corporation_West_Coast_Studios_Production_Department_Dinner_in_honor_or_New_York_executives_1.jpg")
                    .description("Fotografia de Menu Executivo do Dia.")
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_O_MUSQUETE_PHOTO(
            DocumentFile.builder()
                    .title("Jantar Romântico para Dois - Restaurante O Musquete")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/DSCF0763_A_couple_seated_at_a_seaside_table_enjoying_an_evening_meal_and_drinks_while_watching_the_sunset_over_the_water.jpg/1280px-DSCF0763_A_couple_seated_at_a_seaside_table_enjoying_an_evening_meal_and_drinks_while_watching_the_sunset_over_the_water.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/DSCF0763_A_couple_seated_at_a_seaside_table_enjoying_an_evening_meal_and_drinks_while_watching_the_sunset_over_the_water.jpg/480px-DSCF0763_A_couple_seated_at_a_seaside_table_enjoying_an_evening_meal_and_drinks_while_watching_the_sunset_over_the_water.jpg")
                    .description("Fotografia de Jantar Romântico para Dois.")
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_MAR_E_TERRA_PHOTO(
            DocumentFile.builder()
                    .title("Menu Degustação do Chef - Restaurante Mar e Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Elizabeth%27s_Restaurant_-_Food_and_Devices_-_New_Orleans_2016.jpg/1280px-Elizabeth%27s_Restaurant_-_Food_and_Devices_-_New_Orleans_2016.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Elizabeth%27s_Restaurant_-_Food_and_Devices_-_New_Orleans_2016.jpg/480px-Elizabeth%27s_Restaurant_-_Food_and_Devices_-_New_Orleans_2016.jpg")
                    .description("Fotografia de Menu Degustação do Chef.")
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_MAR_E_TERRA_PHOTO(
            DocumentFile.builder()
                    .title("Prato do Dia - Restaurante Mar e Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Daily_Colonist_%281896-07-24%29_%281896%29_%2814775700902%29.jpg/1280px-Daily_Colonist_%281896-07-24%29_%281896%29_%2814775700902%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Daily_Colonist_%281896-07-24%29_%281896%29_%2814775700902%29.jpg/480px-Daily_Colonist_%281896-07-24%29_%281896%29_%2814775700902%29.jpg")
                    .description("Fotografia de Prato do Dia.")
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_MAR_E_TERRA_PHOTO(
            DocumentFile.builder()
                    .title("Bowl do Chef - Restaurante Mar e Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Floris_Claesz_van_Dijck_Stillleben_mit_K%C3%A4se.jpg/1280px-Floris_Claesz_van_Dijck_Stillleben_mit_K%C3%A4se.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Floris_Claesz_van_Dijck_Stillleben_mit_K%C3%A4se.jpg/480px-Floris_Claesz_van_Dijck_Stillleben_mit_K%C3%A4se.jpg")
                    .description("Fotografia de Bowl do Chef.")
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_MAR_E_TERRA_PHOTO(
            DocumentFile.builder()
                    .title("Menu Executivo do Dia - Restaurante Mar e Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.jpg/1280px-DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.jpg/480px-DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.jpg")
                    .description("Fotografia de Menu Executivo do Dia.")
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_MAR_E_TERRA_PHOTO(
            DocumentFile.builder()
                    .title("Jantar Romântico para Dois - Restaurante Mar e Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/The_hunter_and_the_trapper_in_North_America%3B_or%2C_Romantic_adventures_in_field_and_forest._From_the_French_of_B%C3%A9n%C3%A9dict_R%C3%A9voil_%281875%29_%2814563522488%29.jpg/1280px-The_hunter_and_the_trapper_in_North_America%3B_or%2C_Romantic_adventures_in_field_and_forest._From_the_French_of_B%C3%A9n%C3%A9dict_R%C3%A9voil_%281875%29_%2814563522488%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/The_hunter_and_the_trapper_in_North_America%3B_or%2C_Romantic_adventures_in_field_and_forest._From_the_French_of_B%C3%A9n%C3%A9dict_R%C3%A9voil_%281875%29_%2814563522488%29.jpg/480px-The_hunter_and_the_trapper_in_North_America%3B_or%2C_Romantic_adventures_in_field_and_forest._From_the_French_of_B%C3%A9n%C3%A9dict_R%C3%A9voil_%281875%29_%2814563522488%29.jpg")
                    .description("Fotografia de Jantar Romântico para Dois.")
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_KWANZA_LIVING_PHOTO(
            DocumentFile.builder()
                    .title("Menu Degustação do Chef - Restaurante Kwanza Living")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Elizabeth%27s_Restaurant_Shrimp_and_Grits_Plate_New_Orleans.jpg/1280px-Elizabeth%27s_Restaurant_Shrimp_and_Grits_Plate_New_Orleans.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Elizabeth%27s_Restaurant_Shrimp_and_Grits_Plate_New_Orleans.jpg/480px-Elizabeth%27s_Restaurant_Shrimp_and_Grits_Plate_New_Orleans.jpg")
                    .description("Fotografia de Menu Degustação do Chef.")
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_KWANZA_LIVING_PHOTO(
            DocumentFile.builder()
                    .title("Prato do Dia - Restaurante Kwanza Living")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Marjie%27s_Grill_New_Orleans_5_December_2018_05.jpg/1280px-Marjie%27s_Grill_New_Orleans_5_December_2018_05.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Marjie%27s_Grill_New_Orleans_5_December_2018_05.jpg/480px-Marjie%27s_Grill_New_Orleans_5_December_2018_05.jpg")
                    .description("Fotografia de Prato do Dia.")
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_KWANZA_LIVING_PHOTO(
            DocumentFile.builder()
                    .title("Bowl do Chef - Restaurante Kwanza Living")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Floris_van_Dyck_002.jpg/1280px-Floris_van_Dyck_002.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Floris_van_Dyck_002.jpg/480px-Floris_van_Dyck_002.jpg")
                    .description("Fotografia de Bowl do Chef.")
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_KWANZA_LIVING_PHOTO(
            DocumentFile.builder()
                    .title("Menu Executivo do Dia - Restaurante Kwanza Living")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.tiff/lossy-page1-1280px-DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.tiff.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.tiff/lossy-page1-1280px-DINNER_%28held_by%29_WILLIAMS_ALUMNI_ASSOCIATION_OF_NEW_YORK_%28at%29_%22DELMONICO%27S%2C_NEW_YORK%2C_NY%22_%28REST%3B%29_%28NYPL_Hades-275186-4000011742%29.tiff.jpg")
                    .description("Fotografia de Menu Executivo do Dia.")
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_KWANZA_LIVING_PHOTO(
            DocumentFile.builder()
                    .title("Jantar Romântico para Dois - Restaurante Kwanza Living")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Asian_restaurant_table_setting.jpeg/1280px-Asian_restaurant_table_setting.jpeg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Asian_restaurant_table_setting.jpeg/480px-Asian_restaurant_table_setting.jpeg")
                    .description("Fotografia de Jantar Romântico para Dois.")
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO_PHOTO(
            DocumentFile.builder()
                    .title("Menu Degustação do Chef - Restaurante Sabor Angolano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Ethiopian_vegetarian_food_plate_at_a_restaurant%2C_Paris%2C_December_2024.jpg/1280px-Ethiopian_vegetarian_food_plate_at_a_restaurant%2C_Paris%2C_December_2024.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Ethiopian_vegetarian_food_plate_at_a_restaurant%2C_Paris%2C_December_2024.jpg/480px-Ethiopian_vegetarian_food_plate_at_a_restaurant%2C_Paris%2C_December_2024.jpg")
                    .description("Fotografia de Menu Degustação do Chef.")
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO_PHOTO(
            DocumentFile.builder()
                    .title("Prato do Dia - Restaurante Sabor Angolano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Plate%2C_oval_%28AM_1986.88-2%29.jpg/1280px-Plate%2C_oval_%28AM_1986.88-2%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Plate%2C_oval_%28AM_1986.88-2%29.jpg/480px-Plate%2C_oval_%28AM_1986.88-2%29.jpg")
                    .description("Fotografia de Prato do Dia.")
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_SABOR_ANGOLANO_PHOTO(
            DocumentFile.builder()
                    .title("Bowl do Chef - Restaurante Sabor Angolano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/JBLM_culinary_arts_team_preps_for_%27Food_Super_Bowl%27_130201-A-OP586-086.jpg/1280px-JBLM_culinary_arts_team_preps_for_%27Food_Super_Bowl%27_130201-A-OP586-086.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/JBLM_culinary_arts_team_preps_for_%27Food_Super_Bowl%27_130201-A-OP586-086.jpg/480px-JBLM_culinary_arts_team_preps_for_%27Food_Super_Bowl%27_130201-A-OP586-086.jpg")
                    .description("Fotografia de Bowl do Chef.")
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_SABOR_ANGOLANO_PHOTO(
            DocumentFile.builder()
                    .title("Menu Executivo do Dia - Restaurante Sabor Angolano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.jpg/1280px-EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.jpg/480px-EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.jpg")
                    .description("Fotografia de Menu Executivo do Dia.")
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_SABOR_ANGOLANO_PHOTO(
            DocumentFile.builder()
                    .title("Jantar Romântico para Dois - Restaurante Sabor Angolano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/BJ_%E5%8C%97%E4%BA%AC_Tour_Beijing_%E5%B5%97%E5%90%89%E5%BA%9C%E9%A4%90%E5%BB%B3_restaurant_Chinese_table_setting_Aug-2010.JPG/1280px-BJ_%E5%8C%97%E4%BA%AC_Tour_Beijing_%E5%B5%97%E5%90%89%E5%BA%9C%E9%A4%90%E5%BB%B3_restaurant_Chinese_table_setting_Aug-2010.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/BJ_%E5%8C%97%E4%BA%AC_Tour_Beijing_%E5%B5%97%E5%90%89%E5%BA%9C%E9%A4%90%E5%BB%B3_restaurant_Chinese_table_setting_Aug-2010.JPG/480px-BJ_%E5%8C%97%E4%BA%AC_Tour_Beijing_%E5%B5%97%E5%90%89%E5%BA%9C%E9%A4%90%E5%BB%B3_restaurant_Chinese_table_setting_Aug-2010.JPG")
                    .description("Fotografia de Jantar Romântico para Dois.")
                    .build()
    ),

    MENU_DEGUSTACAO_DO_CHEF_RESTAURANTE_TALATONA_PHOTO(
            DocumentFile.builder()
                    .title("Menu Degustação do Chef - Restaurante Talatona")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Food_at_Mirage_Restaurant_Dhaka.JPG/1280px-Food_at_Mirage_Restaurant_Dhaka.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Food_at_Mirage_Restaurant_Dhaka.JPG/480px-Food_at_Mirage_Restaurant_Dhaka.JPG")
                    .description("Fotografia de Menu Degustação do Chef.")
                    .build()
    ),

    PRATO_DO_DIA_RESTAURANTE_TALATONA_PHOTO(
            DocumentFile.builder()
                    .title("Prato do Dia - Restaurante Talatona")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Plate%2C_oval_%28AM_1986.88-3%29.jpg/1280px-Plate%2C_oval_%28AM_1986.88-3%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Plate%2C_oval_%28AM_1986.88-3%29.jpg/480px-Plate%2C_oval_%28AM_1986.88-3%29.jpg")
                    .description("Fotografia de Prato do Dia.")
                    .build()
    ),

    BOWL_DO_CHEF_RESTAURANTE_TALATONA_PHOTO(
            DocumentFile.builder()
                    .title("Bowl do Chef - Restaurante Talatona")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Myanmar%E2%80%99s_Traditional_Food_-_Mohinga.jpg/1280px-Myanmar%E2%80%99s_Traditional_Food_-_Mohinga.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Myanmar%E2%80%99s_Traditional_Food_-_Mohinga.jpg/480px-Myanmar%E2%80%99s_Traditional_Food_-_Mohinga.jpg")
                    .description("Fotografia de Bowl do Chef.")
                    .build()
    ),

    MENU_EXECUTIVO_DO_DIA_RESTAURANTE_TALATONA_PHOTO(
            DocumentFile.builder()
                    .title("Menu Executivo do Dia - Restaurante Talatona")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.tiff/lossy-page1-1280px-EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.tiff.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.tiff/lossy-page1-1280px-EXECUTIVE_COMMITTEE_DINNER_%28held_by%29_MERCHANTS_%26_BUSINESS_MENS_CLEVELAND_AND_HENDRICKS_CLUBS_%28at%29_DELMONICOS_NY_%28HOTEL%29_%28NYPL_Hades-269532-4000000488%29.tiff.jpg")
                    .description("Fotografia de Menu Executivo do Dia.")
                    .build()
    ),

    JANTAR_ROMANTICO_PARA_DOIS_RESTAURANTE_TALATONA_PHOTO(
            DocumentFile.builder()
                    .title("Jantar Romântico para Dois - Restaurante Talatona")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E4%BD%9B%E5%B1%B1_Foshan_%E9%A0%86%E5%BE%B7_Shunde_%E5%9B%9B%E5%AD%A3%E7%82%96%E6%B9%AF_Siji_Duntang_Chinese_Restaurant_table_cloth_setting_January_2024_R12S_02.jpg/1280px-GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E4%BD%9B%E5%B1%B1_Foshan_%E9%A0%86%E5%BE%B7_Shunde_%E5%9B%9B%E5%AD%A3%E7%82%96%E6%B9%AF_Siji_Duntang_Chinese_Restaurant_table_cloth_setting_January_2024_R12S_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E4%BD%9B%E5%B1%B1_Foshan_%E9%A0%86%E5%BE%B7_Shunde_%E5%9B%9B%E5%AD%A3%E7%82%96%E6%B9%AF_Siji_Duntang_Chinese_Restaurant_table_cloth_setting_January_2024_R12S_02.jpg/480px-GD_%E5%BB%A3%E6%9D%B1_Guangdong_%E4%BD%9B%E5%B1%B1_Foshan_%E9%A0%86%E5%BE%B7_Shunde_%E5%9B%9B%E5%AD%A3%E7%82%96%E6%B9%AF_Siji_Duntang_Chinese_Restaurant_table_cloth_setting_January_2024_R12S_02.jpg")
                    .description("Fotografia de Jantar Romântico para Dois.")
                    .build()
    ),

    MUAMBA_DE_GALINHA_CANTINHO_DA_MAE_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Muamba de Galinha - Cantinho da Mãe Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/African_Chicken_Peanut_Stew_%2837673757141%29.jpg/1280px-African_Chicken_Peanut_Stew_%2837673757141%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/African_Chicken_Peanut_Stew_%2837673757141%29.jpg/480px-African_Chicken_Peanut_Stew_%2837673757141%29.jpg")
                    .description("Fotografia de Muamba de Galinha.")
                    .build()
    ),

    CALULU_DE_PEIXE_CANTINHO_DA_MAE_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Calulu de Peixe - Cantinho da Mãe Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Haumania_liebrechtsiana_-_leaf_pouch_for_libok%C3%A9.jpg/1280px-Haumania_liebrechtsiana_-_leaf_pouch_for_libok%C3%A9.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Haumania_liebrechtsiana_-_leaf_pouch_for_libok%C3%A9.jpg/480px-Haumania_liebrechtsiana_-_leaf_pouch_for_libok%C3%A9.jpg")
                    .description("Fotografia de Calulu de Peixe.")
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_CANTINHO_DA_MAE_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Funge com Feijão e Ovo - Cantinho da Mãe Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Attieke_and_chicken.jpg/1280px-Attieke_and_chicken.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Attieke_and_chicken.jpg/480px-Attieke_and_chicken.jpg")
                    .description("Fotografia de Funge com Feijão e Ovo.")
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_CANTINHO_DA_MAE_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Peixe Grelhado do Dia - Cantinho da Mãe Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/2010-0117-Peru-piranha.jpg/1280px-2010-0117-Peru-piranha.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/2010-0117-Peru-piranha.jpg/480px-2010-0117-Peru-piranha.jpg")
                    .description("Fotografia de Peixe Grelhado do Dia.")
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_CANTINHO_DA_MAE_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Espetos Mistos do Kilamba - Cantinho da Mãe Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Chenjeh.jpg/1280px-Chenjeh.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Chenjeh.jpg/480px-Chenjeh.jpg")
                    .description("Fotografia de Espetos Mistos do Kilamba.")
                    .build()
    ),

    MUAMBA_DE_GALINHA_SABORES_DA_NOSSA_TERRA_PHOTO(
            DocumentFile.builder()
                    .title("Muamba de Galinha - Sabores da Nossa Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Baganda_peanut_stew_%28Ekinyeebwa%29_01.jpg/1280px-Baganda_peanut_stew_%28Ekinyeebwa%29_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Baganda_peanut_stew_%28Ekinyeebwa%29_01.jpg/480px-Baganda_peanut_stew_%28Ekinyeebwa%29_01.jpg")
                    .description("Fotografia de Muamba de Galinha.")
                    .build()
    ),

    CALULU_DE_PEIXE_SABORES_DA_NOSSA_TERRA_PHOTO(
            DocumentFile.builder()
                    .title("Calulu de Peixe - Sabores da Nossa Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/01_Food_in_Gran_Canaria_-_fish_and_seafood_mixed_grill_plate.jpg/1280px-01_Food_in_Gran_Canaria_-_fish_and_seafood_mixed_grill_plate.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/01_Food_in_Gran_Canaria_-_fish_and_seafood_mixed_grill_plate.jpg/480px-01_Food_in_Gran_Canaria_-_fish_and_seafood_mixed_grill_plate.jpg")
                    .description("Fotografia de Calulu de Peixe.")
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_SABORES_DA_NOSSA_TERRA_PHOTO(
            DocumentFile.builder()
                    .title("Funge com Feijão e Ovo - Sabores da Nossa Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Attieke_serves_with_fried_carp.jpg/1280px-Attieke_serves_with_fried_carp.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Attieke_serves_with_fried_carp.jpg/480px-Attieke_serves_with_fried_carp.jpg")
                    .description("Fotografia de Funge com Feijão e Ovo.")
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_SABORES_DA_NOSSA_TERRA_PHOTO(
            DocumentFile.builder()
                    .title("Peixe Grelhado do Dia - Sabores da Nossa Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/8862Binmaley_Dagupan_Road_Barangays_06.jpg/1280px-8862Binmaley_Dagupan_Road_Barangays_06.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/8862Binmaley_Dagupan_Road_Barangays_06.jpg/480px-8862Binmaley_Dagupan_Road_Barangays_06.jpg")
                    .description("Fotografia de Peixe Grelhado do Dia.")
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_SABORES_DA_NOSSA_TERRA_PHOTO(
            DocumentFile.builder()
                    .title("Espetos Mistos do Kilamba - Sabores da Nossa Terra")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/DFC_0330_Grilled_meat_skewers_topped_with_sliced_red_onion_chopped_herbs_and_a_sprinkle_of_seasoning_served_alongside_fresh_lettuce.jpg/1280px-DFC_0330_Grilled_meat_skewers_topped_with_sliced_red_onion_chopped_herbs_and_a_sprinkle_of_seasoning_served_alongside_fresh_lettuce.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/DFC_0330_Grilled_meat_skewers_topped_with_sliced_red_onion_chopped_herbs_and_a_sprinkle_of_seasoning_served_alongside_fresh_lettuce.jpg/480px-DFC_0330_Grilled_meat_skewers_topped_with_sliced_red_onion_chopped_herbs_and_a_sprinkle_of_seasoning_served_alongside_fresh_lettuce.jpg")
                    .description("Fotografia de Espetos Mistos do Kilamba.")
                    .build()
    ),

    MUAMBA_DE_GALINHA_TASCA_DO_MUAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Muamba de Galinha - Tasca do Muamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Baganda_peanut_stew_%28Ekinyeebwa%29_02.jpg/1280px-Baganda_peanut_stew_%28Ekinyeebwa%29_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Baganda_peanut_stew_%28Ekinyeebwa%29_02.jpg/480px-Baganda_peanut_stew_%28Ekinyeebwa%29_02.jpg")
                    .description("Fotografia de Muamba de Galinha.")
                    .build()
    ),

    CALULU_DE_PEIXE_TASCA_DO_MUAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Calulu de Peixe - Tasca do Muamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/02_Grilled_fish_and_seafood_dinner_in_Canary_Islands_-_Gran_Canaria_restaurant%2C_marisco_mixto_a_la_parrilla.jpg/1280px-02_Grilled_fish_and_seafood_dinner_in_Canary_Islands_-_Gran_Canaria_restaurant%2C_marisco_mixto_a_la_parrilla.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/02_Grilled_fish_and_seafood_dinner_in_Canary_Islands_-_Gran_Canaria_restaurant%2C_marisco_mixto_a_la_parrilla.jpg/480px-02_Grilled_fish_and_seafood_dinner_in_Canary_Islands_-_Gran_Canaria_restaurant%2C_marisco_mixto_a_la_parrilla.jpg")
                    .description("Fotografia de Calulu de Peixe.")
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_TASCA_DO_MUAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Funge com Feijão e Ovo - Tasca do Muamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Atti%C3%A9k%C3%A9.jpg/1280px-Atti%C3%A9k%C3%A9.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Atti%C3%A9k%C3%A9.jpg/480px-Atti%C3%A9k%C3%A9.jpg")
                    .description("Fotografia de Funge com Feijão e Ovo.")
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_TASCA_DO_MUAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Peixe Grelhado do Dia - Tasca do Muamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/8862Binmaley_Dagupan_Road_Barangays_07.jpg/1280px-8862Binmaley_Dagupan_Road_Barangays_07.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/8862Binmaley_Dagupan_Road_Barangays_07.jpg/480px-8862Binmaley_Dagupan_Road_Barangays_07.jpg")
                    .description("Fotografia de Peixe Grelhado do Dia.")
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_TASCA_DO_MUAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Espetos Mistos do Kilamba - Tasca do Muamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/DFC_1493_Hearty_plate_of_skewered_grilled_meat_and_veggies_draped_in_a_rich_tomato_sauce_served_with_golden_fries_and_a_side_of_coleslaw.jpg/1280px-DFC_1493_Hearty_plate_of_skewered_grilled_meat_and_veggies_draped_in_a_rich_tomato_sauce_served_with_golden_fries_and_a_side_of_coleslaw.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/DFC_1493_Hearty_plate_of_skewered_grilled_meat_and_veggies_draped_in_a_rich_tomato_sauce_served_with_golden_fries_and_a_side_of_coleslaw.jpg/480px-DFC_1493_Hearty_plate_of_skewered_grilled_meat_and_veggies_draped_in_a_rich_tomato_sauce_served_with_golden_fries_and_a_side_of_coleslaw.jpg")
                    .description("Fotografia de Espetos Mistos do Kilamba.")
                    .build()
    ),

    MUAMBA_DE_GALINHA_COZINHA_DO_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Muamba de Galinha - Cozinha do Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Baganda_peanut_stew_%28Ekinyeebwa%29_05.jpg/1280px-Baganda_peanut_stew_%28Ekinyeebwa%29_05.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Baganda_peanut_stew_%28Ekinyeebwa%29_05.jpg/480px-Baganda_peanut_stew_%28Ekinyeebwa%29_05.jpg")
                    .description("Fotografia de Muamba de Galinha.")
                    .build()
    ),

    CALULU_DE_PEIXE_COZINHA_DO_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Calulu de Peixe - Cozinha do Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Fish_seasoning_02.jpg/1280px-Fish_seasoning_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Fish_seasoning_02.jpg/480px-Fish_seasoning_02.jpg")
                    .description("Fotografia de Calulu de Peixe.")
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_COZINHA_DO_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Funge com Feijão e Ovo - Cozinha do Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Atti%C3%A9k%C3%A9_B%C3%A9nin.jpg/1280px-Atti%C3%A9k%C3%A9_B%C3%A9nin.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Atti%C3%A9k%C3%A9_B%C3%A9nin.jpg/480px-Atti%C3%A9k%C3%A9_B%C3%A9nin.jpg")
                    .description("Fotografia de Funge com Feijão e Ovo.")
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_COZINHA_DO_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Peixe Grelhado do Dia - Cozinha do Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/8862Binmaley_Dagupan_Road_Barangays_09.jpg/1280px-8862Binmaley_Dagupan_Road_Barangays_09.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/8862Binmaley_Dagupan_Road_Barangays_09.jpg/480px-8862Binmaley_Dagupan_Road_Barangays_09.jpg")
                    .description("Fotografia de Peixe Grelhado do Dia.")
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_COZINHA_DO_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Espetos Mistos do Kilamba - Cozinha do Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/DFC_2095_Savory_grilled_pork_skewers_sizzling_and_caramelized_to_a_perfect_golden-brown.jpg/1280px-DFC_2095_Savory_grilled_pork_skewers_sizzling_and_caramelized_to_a_perfect_golden-brown.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/DFC_2095_Savory_grilled_pork_skewers_sizzling_and_caramelized_to_a_perfect_golden-brown.jpg/480px-DFC_2095_Savory_grilled_pork_skewers_sizzling_and_caramelized_to_a_perfect_golden-brown.jpg")
                    .description("Fotografia de Espetos Mistos do Kilamba.")
                    .build()
    ),

    MUAMBA_DE_GALINHA_SOLAR_DO_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Muamba de Galinha - Solar do Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Banku_and_groundnut_soup_01.jpg/1280px-Banku_and_groundnut_soup_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Banku_and_groundnut_soup_01.jpg/480px-Banku_and_groundnut_soup_01.jpg")
                    .description("Fotografia de Muamba de Galinha.")
                    .build()
    ),

    CALULU_DE_PEIXE_SOLAR_DO_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Calulu de Peixe - Solar do Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Fish_seasoning_11.jpg/1280px-Fish_seasoning_11.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Fish_seasoning_11.jpg/480px-Fish_seasoning_11.jpg")
                    .description("Fotografia de Calulu de Peixe.")
                    .build()
    ),

    FUNGE_COM_FEIJAO_E_OVO_SOLAR_DO_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Funge com Feijão e Ovo - Solar do Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Cassava_Pone_in_a_dish.png/1280px-Cassava_Pone_in_a_dish.png")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Cassava_Pone_in_a_dish.png/480px-Cassava_Pone_in_a_dish.png")
                    .description("Fotografia de Funge com Feijão e Ovo.")
                    .build()
    ),

    PEIXE_GRELHADO_DO_DIA_SOLAR_DO_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Peixe Grelhado do Dia - Solar do Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/8862Binmaley_Dagupan_Road_Barangays_53.jpg/1280px-8862Binmaley_Dagupan_Road_Barangays_53.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/8862Binmaley_Dagupan_Road_Barangays_53.jpg/480px-8862Binmaley_Dagupan_Road_Barangays_53.jpg")
                    .description("Fotografia de Peixe Grelhado do Dia.")
                    .build()
    ),

    ESPETOS_MISTOS_DO_KILAMBA_SOLAR_DO_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Espetos Mistos do Kilamba - Solar do Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/DFC_4414_A_young_street_vendor_carefully_threads_colorful_skewers_of_grilled_meat_at_a_bustling_night_market.jpg/1280px-DFC_4414_A_young_street_vendor_carefully_threads_colorful_skewers_of_grilled_meat_at_a_bustling_night_market.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/DFC_4414_A_young_street_vendor_carefully_threads_colorful_skewers_of_grilled_meat_at_a_bustling_night_market.jpg/480px-DFC_4414_A_young_street_vendor_carefully_threads_colorful_skewers_of_grilled_meat_at_a_bustling_night_market.jpg")
                    .description("Fotografia de Espetos Mistos do Kilamba.")
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_NAPOLI_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Margherita - Pizzeria Napoli Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Eq_it-na_pizza-margherita_sep2005_sml.jpg/1280px-Eq_it-na_pizza-margherita_sep2005_sml.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Eq_it-na_pizza-margherita_sep2005_sml.jpg/480px-Eq_it-na_pizza-margherita_sep2005_sml.jpg")
                    .description("Fotografia de Pizza Margherita.")
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_NAPOLI_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Pepperoni - Pizzeria Napoli Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/All_Good_pizza_%2838501728345%29.jpg/1280px-All_Good_pizza_%2838501728345%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/All_Good_pizza_%2838501728345%29.jpg/480px-All_Good_pizza_%2838501728345%29.jpg")
                    .description("Fotografia de Pizza Pepperoni.")
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_NAPOLI_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Portuguesa - Pizzeria Napoli Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Brass_Funghi_%28quarter%29_-_Yeastie_Boys_Pizza_Club_2024-05-17.jpg/1280px-Brass_Funghi_%28quarter%29_-_Yeastie_Boys_Pizza_Club_2024-05-17.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Brass_Funghi_%28quarter%29_-_Yeastie_Boys_Pizza_Club_2024-05-17.jpg/480px-Brass_Funghi_%28quarter%29_-_Yeastie_Boys_Pizza_Club_2024-05-17.jpg")
                    .description("Fotografia de Pizza Portuguesa.")
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_NAPOLI_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Vegetariana - Pizzeria Napoli Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Kale_Pizza_from_Basil_Pizza_%26_Wine_Bar.jpg/1280px-Kale_Pizza_from_Basil_Pizza_%26_Wine_Bar.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Kale_Pizza_from_Basil_Pizza_%26_Wine_Bar.jpg/480px-Kale_Pizza_from_Basil_Pizza_%26_Wine_Bar.jpg")
                    .description("Fotografia de Pizza Vegetariana.")
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_NAPOLI_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Calzone Recheado - Pizzeria Napoli Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Calzone%2C_Italian_Pizzeria_and_Restaurant%2C_Live_Oak.jpg/1280px-Calzone%2C_Italian_Pizzeria_and_Restaurant%2C_Live_Oak.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Calzone%2C_Italian_Pizzeria_and_Restaurant%2C_Live_Oak.jpg/480px-Calzone%2C_Italian_Pizzeria_and_Restaurant%2C_Live_Oak.jpg")
                    .description("Fotografia de Calzone Recheado.")
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_FORNO_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Margherita - Pizzeria Forno Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Margherita_Originale.JPG/1280px-Margherita_Originale.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Margherita_Originale.JPG/480px-Margherita_Originale.JPG")
                    .description("Fotografia de Pizza Margherita.")
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_FORNO_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Pepperoni - Pizzeria Forno Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Nanuet_Hotel_Pepperoni_Pizza.jpg/1280px-Nanuet_Hotel_Pepperoni_Pizza.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Nanuet_Hotel_Pepperoni_Pizza.jpg/480px-Nanuet_Hotel_Pepperoni_Pizza.jpg")
                    .description("Fotografia de Pizza Pepperoni.")
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_FORNO_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Portuguesa - Pizzeria Forno Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Creative_capricciosa_pizza_on_the_rustic_table_with_tomato_and_green_paprika_in_the_restaurant._%2849446810177%29.jpg/1280px-Creative_capricciosa_pizza_on_the_rustic_table_with_tomato_and_green_paprika_in_the_restaurant._%2849446810177%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Creative_capricciosa_pizza_on_the_rustic_table_with_tomato_and_green_paprika_in_the_restaurant._%2849446810177%29.jpg/480px-Creative_capricciosa_pizza_on_the_rustic_table_with_tomato_and_green_paprika_in_the_restaurant._%2849446810177%29.jpg")
                    .description("Fotografia de Pizza Portuguesa.")
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_FORNO_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Vegetariana - Pizzeria Forno Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Mysore_Style_Tawa_Pizza_with_higher_resolution.jpg/1280px-Mysore_Style_Tawa_Pizza_with_higher_resolution.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Mysore_Style_Tawa_Pizza_with_higher_resolution.jpg/480px-Mysore_Style_Tawa_Pizza_with_higher_resolution.jpg")
                    .description("Fotografia de Pizza Vegetariana.")
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_FORNO_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Calzone Recheado - Pizzeria Forno Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Calzone_%283348696443%29.jpg/1280px-Calzone_%283348696443%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Calzone_%283348696443%29.jpg/480px-Calzone_%283348696443%29.jpg")
                    .description("Fotografia de Calzone Recheado.")
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_MSLICE_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Margherita - Pizzeria Mslice")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Margherita_pizza_on_plate_2.jpg/1280px-Margherita_pizza_on_plate_2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Margherita_pizza_on_plate_2.jpg/480px-Margherita_pizza_on_plate_2.jpg")
                    .description("Fotografia de Pizza Margherita.")
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_MSLICE_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Pepperoni - Pizzeria Mslice")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Nice_pepperoni_pizza.jpg/1280px-Nice_pepperoni_pizza.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Nice_pepperoni_pizza.jpg/480px-Nice_pepperoni_pizza.jpg")
                    .description("Fotografia de Pizza Pepperoni.")
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_MSLICE_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Portuguesa - Pizzeria Mslice")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Homemade_pizza_%2812%29.jpg/1280px-Homemade_pizza_%2812%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Homemade_pizza_%2812%29.jpg/480px-Homemade_pizza_%2812%29.jpg")
                    .description("Fotografia de Pizza Portuguesa.")
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_MSLICE_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Vegetariana - Pizzeria Mslice")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Pizza_%2847955822167%29.jpg/1280px-Pizza_%2847955822167%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Pizza_%2847955822167%29.jpg/480px-Pizza_%2847955822167%29.jpg")
                    .description("Fotografia de Pizza Vegetariana.")
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_MSLICE_PHOTO(
            DocumentFile.builder()
                    .title("Calzone Recheado - Pizzeria Mslice")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Calzone_01.jpg/1280px-Calzone_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Calzone_01.jpg/480px-Calzone_01.jpg")
                    .description("Fotografia de Calzone Recheado.")
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_MANGUERINHA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Margherita - Pizzeria Manguerinha")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Pepperoni_pizza_%282%29.png/1280px-Pepperoni_pizza_%282%29.png")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Pepperoni_pizza_%282%29.png/480px-Pepperoni_pizza_%282%29.png")
                    .description("Fotografia de Pizza Margherita.")
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_MANGUERINHA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Pepperoni - Pizzeria Manguerinha")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Pepperoni_pizza_%289519127849%29.jpg/1280px-Pepperoni_pizza_%289519127849%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Pepperoni_pizza_%289519127849%29.jpg/480px-Pepperoni_pizza_%289519127849%29.jpg")
                    .description("Fotografia de Pizza Pepperoni.")
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_MANGUERINHA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Portuguesa - Pizzeria Manguerinha")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Pita-Bread-Pizza-2010.jpg/1280px-Pita-Bread-Pizza-2010.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Pita-Bread-Pizza-2010.jpg/480px-Pita-Bread-Pizza-2010.jpg")
                    .description("Fotografia de Pizza Portuguesa.")
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_MANGUERINHA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Vegetariana - Pizzeria Manguerinha")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Pizza_%2847955824122%29.jpg/1280px-Pizza_%2847955824122%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Pizza_%2847955824122%29.jpg/480px-Pizza_%2847955824122%29.jpg")
                    .description("Fotografia de Pizza Vegetariana.")
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_MANGUERINHA_PHOTO(
            DocumentFile.builder()
                    .title("Calzone Recheado - Pizzeria Manguerinha")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Calzone_Pugliese_Di_Cipolle_Sponsali.jpg/1280px-Calzone_Pugliese_Di_Cipolle_Sponsali.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Calzone_Pugliese_Di_Cipolle_Sponsali.jpg/480px-Calzone_Pugliese_Di_Cipolle_Sponsali.jpg")
                    .description("Fotografia de Calzone Recheado.")
                    .build()
    ),

    PIZZA_MARGHERITA_PIZZERIA_BELLA_VISTA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Margherita - Pizzeria Bella Vista")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Pepperoni_pizza_called_%22New_Jersey_Drive%22_from_Finnish_restaurant_Skiffer.jpg/1280px-Pepperoni_pizza_called_%22New_Jersey_Drive%22_from_Finnish_restaurant_Skiffer.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Pepperoni_pizza_called_%22New_Jersey_Drive%22_from_Finnish_restaurant_Skiffer.jpg/480px-Pepperoni_pizza_called_%22New_Jersey_Drive%22_from_Finnish_restaurant_Skiffer.jpg")
                    .description("Fotografia de Pizza Margherita.")
                    .build()
    ),

    PIZZA_PEPPERONI_PIZZERIA_BELLA_VISTA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Pepperoni - Pizzeria Bella Vista")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Pepperoni_pizza_slice_on_a_red_plate.jpg/1280px-Pepperoni_pizza_slice_on_a_red_plate.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Pepperoni_pizza_slice_on_a_red_plate.jpg/480px-Pepperoni_pizza_slice_on_a_red_plate.jpg")
                    .description("Fotografia de Pizza Pepperoni.")
                    .build()
    ),

    PIZZA_PORTUGUESA_PIZZERIA_BELLA_VISTA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Portuguesa - Pizzeria Bella Vista")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Pizza_Capricciosa%2C_Mitchelli%27s_Pizza_Cafe%2C_2023_%2801%29.jpg/1280px-Pizza_Capricciosa%2C_Mitchelli%27s_Pizza_Cafe%2C_2023_%2801%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Pizza_Capricciosa%2C_Mitchelli%27s_Pizza_Cafe%2C_2023_%2801%29.jpg/480px-Pizza_Capricciosa%2C_Mitchelli%27s_Pizza_Cafe%2C_2023_%2801%29.jpg")
                    .description("Fotografia de Pizza Portuguesa.")
                    .build()
    ),

    PIZZA_VEGETARIANA_PIZZERIA_BELLA_VISTA_PHOTO(
            DocumentFile.builder()
                    .title("Pizza Vegetariana - Pizzeria Bella Vista")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Pizza_%2847955837793%29.jpg/1280px-Pizza_%2847955837793%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Pizza_%2847955837793%29.jpg/480px-Pizza_%2847955837793%29.jpg")
                    .description("Fotografia de Pizza Vegetariana.")
                    .build()
    ),

    CALZONE_RECHEADO_PIZZERIA_BELLA_VISTA_PHOTO(
            DocumentFile.builder()
                    .title("Calzone Recheado - Pizzeria Bella Vista")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Calzone_Soupi%C3%A9re_Normande_%28640x480%29.jpg/1280px-Calzone_Soupi%C3%A9re_Normande_%28640x480%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Calzone_Soupi%C3%A9re_Normande_%28640x480%29.jpg/480px-Calzone_Soupi%C3%A9re_Normande_%28640x480%29.jpg")
                    .description("Fotografia de Calzone Recheado.")
                    .build()
    ),

    HAMBURGUER_CLASSICO_SNACK_BAR_O_PONTO_PHOTO(
            DocumentFile.builder()
                    .title("Hambúrguer Clássico - Snack Bar O Ponto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/A_big_Classic%2C_the_Flxible_bus_%282176172574%29.jpg/1280px-A_big_Classic%2C_the_Flxible_bus_%282176172574%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/A_big_Classic%2C_the_Flxible_bus_%282176172574%29.jpg/480px-A_big_Classic%2C_the_Flxible_bus_%282176172574%29.jpg")
                    .description("Fotografia de Hambúrguer Clássico.")
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_SNACK_BAR_O_PONTO_PHOTO(
            DocumentFile.builder()
                    .title("Cheeseburger Especial - Snack Bar O Ponto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/7-Eleven_Cheeseburger_%2829692848751%29.jpg/1280px-7-Eleven_Cheeseburger_%2829692848751%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/7-Eleven_Cheeseburger_%2829692848751%29.jpg/480px-7-Eleven_Cheeseburger_%2829692848751%29.jpg")
                    .description("Fotografia de Cheeseburger Especial.")
                    .build()
    ),

    BATATAS_FRITAS_SNACK_BAR_O_PONTO_PHOTO(
            DocumentFile.builder()
                    .title("Batatas Fritas - Snack Bar O Ponto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Burger_with_French_Fries.jpg/1280px-Burger_with_French_Fries.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Burger_with_French_Fries.jpg/480px-Burger_with_French_Fries.jpg")
                    .description("Fotografia de Batatas Fritas.")
                    .build()
    ),

    WRAP_DE_FRANGO_SNACK_BAR_O_PONTO_PHOTO(
            DocumentFile.builder()
                    .title("Wrap de Frango - Snack Bar O Ponto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/-Egg_wrap_-Delicious_-Tempted_-Friends_-Fun_-Bike_Ride_-Golden_memories.jpg/1280px--Egg_wrap_-Delicious_-Tempted_-Friends_-Fun_-Bike_Ride_-Golden_memories.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/-Egg_wrap_-Delicious_-Tempted_-Friends_-Fun_-Bike_Ride_-Golden_memories.jpg/480px--Egg_wrap_-Delicious_-Tempted_-Friends_-Fun_-Bike_Ride_-Golden_memories.jpg")
                    .description("Fotografia de Wrap de Frango.")
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_SNACK_BAR_O_PONTO_PHOTO(
            DocumentFile.builder()
                    .title("Milk-shake de Chocolate - Snack Bar O Ponto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/2019_Take_Our_Daughters_and_Sons_to_Work_Day_%2820190425-OC-LSC-0307%29.jpg/1280px-2019_Take_Our_Daughters_and_Sons_to_Work_Day_%2820190425-OC-LSC-0307%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/2019_Take_Our_Daughters_and_Sons_to_Work_Day_%2820190425-OC-LSC-0307%29.jpg/480px-2019_Take_Our_Daughters_and_Sons_to_Work_Day_%2820190425-OC-LSC-0307%29.jpg")
                    .description("Fotografia de Milk-shake de Chocolate.")
                    .build()
    ),

    HAMBURGUER_CLASSICO_BURGER_STATION_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Hambúrguer Clássico - Burger Station Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Andrews_classic_roadside_hamburgers_in_Dekalb_Hall_jeh.jpg/1280px-Andrews_classic_roadside_hamburgers_in_Dekalb_Hall_jeh.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Andrews_classic_roadside_hamburgers_in_Dekalb_Hall_jeh.jpg/480px-Andrews_classic_roadside_hamburgers_in_Dekalb_Hall_jeh.jpg")
                    .description("Fotografia de Hambúrguer Clássico.")
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_BURGER_STATION_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Cheeseburger Especial - Burger Station Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Avocado_bacon_cheeseburger_and_pineapple_smoothie.jpg/1280px-Avocado_bacon_cheeseburger_and_pineapple_smoothie.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Avocado_bacon_cheeseburger_and_pineapple_smoothie.jpg/480px-Avocado_bacon_cheeseburger_and_pineapple_smoothie.jpg")
                    .description("Fotografia de Cheeseburger Especial.")
                    .build()
    ),

    BATATAS_FRITAS_BURGER_STATION_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Batatas Fritas - Burger Station Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Fast_Food_in_Lusaka_10.jpg/1280px-Fast_Food_in_Lusaka_10.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Fast_Food_in_Lusaka_10.jpg/480px-Fast_Food_in_Lusaka_10.jpg")
                    .description("Fotografia de Batatas Fritas.")
                    .build()
    ),

    WRAP_DE_FRANGO_BURGER_STATION_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Wrap de Frango - Burger Station Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/2017-05-28_AT_Wien_20_Brigittenau%2C_McDonald%27s_Rivergate%2C_Tomato_Salsa_Crispy_Chicken_Wrap_%2850776193102%29.jpg/1280px-2017-05-28_AT_Wien_20_Brigittenau%2C_McDonald%27s_Rivergate%2C_Tomato_Salsa_Crispy_Chicken_Wrap_%2850776193102%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/2017-05-28_AT_Wien_20_Brigittenau%2C_McDonald%27s_Rivergate%2C_Tomato_Salsa_Crispy_Chicken_Wrap_%2850776193102%29.jpg/480px-2017-05-28_AT_Wien_20_Brigittenau%2C_McDonald%27s_Rivergate%2C_Tomato_Salsa_Crispy_Chicken_Wrap_%2850776193102%29.jpg")
                    .description("Fotografia de Wrap de Frango.")
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_BURGER_STATION_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Milk-shake de Chocolate - Burger Station Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Crowds_of_people_on_Santa_Monica_Beach%2C_ca.1900_%28CHS-820%29.jpg/1280px-Crowds_of_people_on_Santa_Monica_Beach%2C_ca.1900_%28CHS-820%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Crowds_of_people_on_Santa_Monica_Beach%2C_ca.1900_%28CHS-820%29.jpg/480px-Crowds_of_people_on_Santa_Monica_Beach%2C_ca.1900_%28CHS-820%29.jpg")
                    .description("Fotografia de Milk-shake de Chocolate.")
                    .build()
    ),

    HAMBURGUER_CLASSICO_FAST_FOOD_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Hambúrguer Clássico - Fast Food Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Big_tower_hamburger.jpg/1280px-Big_tower_hamburger.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Big_tower_hamburger.jpg/480px-Big_tower_hamburger.jpg")
                    .description("Fotografia de Hambúrguer Clássico.")
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_FAST_FOOD_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Cheeseburger Especial - Fast Food Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/BK_Ultimate_Bacon_Cheeseburger.jpg/1280px-BK_Ultimate_Bacon_Cheeseburger.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/BK_Ultimate_Bacon_Cheeseburger.jpg/480px-BK_Ultimate_Bacon_Cheeseburger.jpg")
                    .description("Fotografia de Cheeseburger Especial.")
                    .build()
    ),

    BATATAS_FRITAS_FAST_FOOD_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Batatas Fritas - Fast Food Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Fast_Food_in_Lusaka_11.jpg/1280px-Fast_Food_in_Lusaka_11.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Fast_Food_in_Lusaka_11.jpg/480px-Fast_Food_in_Lusaka_11.jpg")
                    .description("Fotografia de Batatas Fritas.")
                    .build()
    ),

    WRAP_DE_FRANGO_FAST_FOOD_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Wrap de Frango - Fast Food Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/201906_Orlean%27s_Chicken_Wrap_from_Huatie_Group.jpg/1280px-201906_Orlean%27s_Chicken_Wrap_from_Huatie_Group.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/201906_Orlean%27s_Chicken_Wrap_from_Huatie_Group.jpg/480px-201906_Orlean%27s_Chicken_Wrap_from_Huatie_Group.jpg")
                    .description("Fotografia de Wrap de Frango.")
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_FAST_FOOD_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Milk-shake de Chocolate - Fast Food Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/DFC_0816_A_close-up_of_a_hand_holding_a_plastic_cup_while_a_chocolatey_smoothie_is_poured_over_ice_from_a_blender.jpg/1280px-DFC_0816_A_close-up_of_a_hand_holding_a_plastic_cup_while_a_chocolatey_smoothie_is_poured_over_ice_from_a_blender.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/DFC_0816_A_close-up_of_a_hand_holding_a_plastic_cup_while_a_chocolatey_smoothie_is_poured_over_ice_from_a_blender.jpg/480px-DFC_0816_A_close-up_of_a_hand_holding_a_plastic_cup_while_a_chocolatey_smoothie_is_poured_over_ice_from_a_blender.jpg")
                    .description("Fotografia de Milk-shake de Chocolate.")
                    .build()
    ),

    HAMBURGUER_CLASSICO_LANCHES_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Hambúrguer Clássico - Lanches do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Burger_Drwala_-_classic_version_in_McDonald%27s%2C_winter_2024_2025%2C_Gliwice%2C_Silesian_Voivodeship%2C_Poland%2C_January_2025.jpg/1280px-Burger_Drwala_-_classic_version_in_McDonald%27s%2C_winter_2024_2025%2C_Gliwice%2C_Silesian_Voivodeship%2C_Poland%2C_January_2025.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Burger_Drwala_-_classic_version_in_McDonald%27s%2C_winter_2024_2025%2C_Gliwice%2C_Silesian_Voivodeship%2C_Poland%2C_January_2025.jpg/480px-Burger_Drwala_-_classic_version_in_McDonald%27s%2C_winter_2024_2025%2C_Gliwice%2C_Silesian_Voivodeship%2C_Poland%2C_January_2025.jpg")
                    .description("Fotografia de Hambúrguer Clássico.")
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_LANCHES_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Cheeseburger Especial - Lanches do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Bacon_Cheeseburger_at_Copped_Hall_open_day_event%2C_Essex%2C_England.jpg/1280px-Bacon_Cheeseburger_at_Copped_Hall_open_day_event%2C_Essex%2C_England.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Bacon_Cheeseburger_at_Copped_Hall_open_day_event%2C_Essex%2C_England.jpg/480px-Bacon_Cheeseburger_at_Copped_Hall_open_day_event%2C_Essex%2C_England.jpg")
                    .description("Fotografia de Cheeseburger Especial.")
                    .build()
    ),

    BATATAS_FRITAS_LANCHES_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Batatas Fritas - Lanches do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Fast_Food_in_Lusaka_12.jpg/1280px-Fast_Food_in_Lusaka_12.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Fast_Food_in_Lusaka_12.jpg/480px-Fast_Food_in_Lusaka_12.jpg")
                    .description("Fotografia de Batatas Fritas.")
                    .build()
    ),

    WRAP_DE_FRANGO_LANCHES_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Wrap de Frango - Lanches do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Bacon-wrapped_Chicken_Breast2_%2810508582914%29.jpg/1280px-Bacon-wrapped_Chicken_Breast2_%2810508582914%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Bacon-wrapped_Chicken_Breast2_%2810508582914%29.jpg/480px-Bacon-wrapped_Chicken_Breast2_%2810508582914%29.jpg")
                    .description("Fotografia de Wrap de Frango.")
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_LANCHES_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Milk-shake de Chocolate - Lanches do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/Double_the_Chill%2C_Double_the_Delight.jpg/1280px-Double_the_Chill%2C_Double_the_Delight.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/Double_the_Chill%2C_Double_the_Delight.jpg/480px-Double_the_Chill%2C_Double_the_Delight.jpg")
                    .description("Fotografia de Milk-shake de Chocolate.")
                    .build()
    ),

    HAMBURGUER_CLASSICO_FOOD_TRUCK_TAXI_AZUL_PHOTO(
            DocumentFile.builder()
                    .title("Hambúrguer Clássico - Food Truck Táxi Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Classic_Burger_-_Joe%27s_Burger_House_2024-07-07.jpg/1280px-Classic_Burger_-_Joe%27s_Burger_House_2024-07-07.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Classic_Burger_-_Joe%27s_Burger_House_2024-07-07.jpg/480px-Classic_Burger_-_Joe%27s_Burger_House_2024-07-07.jpg")
                    .description("Fotografia de Hambúrguer Clássico.")
                    .build()
    ),

    CHEESEBURGER_ESPECIAL_FOOD_TRUCK_TAXI_AZUL_PHOTO(
            DocumentFile.builder()
                    .title("Cheeseburger Especial - Food Truck Táxi Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Cheeseburger_-_BrewDog_Camden%2C_Camden_Town%2C_London.jpg/1280px-Cheeseburger_-_BrewDog_Camden%2C_Camden_Town%2C_London.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Cheeseburger_-_BrewDog_Camden%2C_Camden_Town%2C_London.jpg/480px-Cheeseburger_-_BrewDog_Camden%2C_Camden_Town%2C_London.jpg")
                    .description("Fotografia de Cheeseburger Especial.")
                    .build()
    ),

    BATATAS_FRITAS_FOOD_TRUCK_TAXI_AZUL_PHOTO(
            DocumentFile.builder()
                    .title("Batatas Fritas - Food Truck Táxi Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Fast_food_01_ebru.jpg/1280px-Fast_food_01_ebru.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Fast_food_01_ebru.jpg/480px-Fast_food_01_ebru.jpg")
                    .description("Fotografia de Batatas Fritas.")
                    .build()
    ),

    WRAP_DE_FRANGO_FOOD_TRUCK_TAXI_AZUL_PHOTO(
            DocumentFile.builder()
                    .title("Wrap de Frango - Food Truck Táxi Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Bacon-wrapped_Chicken_Breast_%2810508565854%29.jpg/1280px-Bacon-wrapped_Chicken_Breast_%2810508565854%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Bacon-wrapped_Chicken_Breast_%2810508565854%29.jpg/480px-Bacon-wrapped_Chicken_Breast_%2810508565854%29.jpg")
                    .description("Fotografia de Wrap de Frango.")
                    .build()
    ),

    MILK_SHAKE_DE_CHOCOLATE_FOOD_TRUCK_TAXI_AZUL_PHOTO(
            DocumentFile.builder()
                    .title("Milk-shake de Chocolate - Food Truck Táxi Azul")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/GLASS_OF_HAPPINESS.jpg/1280px-GLASS_OF_HAPPINESS.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/GLASS_OF_HAPPINESS.jpg/480px-GLASS_OF_HAPPINESS.jpg")
                    .description("Fotografia de Milk-shake de Chocolate.")
                    .build()
    ),

    BIFE_GRELHADO_CHURRASQUEIRA_DO_ZE_PHOTO(
            DocumentFile.builder()
                    .title("Bife Grelhado - Churrasqueira do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Burger_and_fries_on_a_wooden_plate.jpg/1280px-Burger_and_fries_on_a_wooden_plate.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Burger_and_fries_on_a_wooden_plate.jpg/480px-Burger_and_fries_on_a_wooden_plate.jpg")
                    .description("Fotografia de Bife Grelhado.")
                    .build()
    ),

    FRANGO_GRELHADO_CHURRASQUEIRA_DO_ZE_PHOTO(
            DocumentFile.builder()
                    .title("Frango Grelhado - Churrasqueira do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/Chicken_I_m_a_g_e.jpg/1280px-Chicken_I_m_a_g_e.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/Chicken_I_m_a_g_e.jpg/480px-Chicken_I_m_a_g_e.jpg")
                    .description("Fotografia de Frango Grelhado.")
                    .build()
    ),

    COSTELETA_DE_PORCO_CHURRASQUEIRA_DO_ZE_PHOTO(
            DocumentFile.builder()
                    .title("Costeleta de Porco - Churrasqueira do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/7323Cuisine_of_Bulacan_01.jpg/1280px-7323Cuisine_of_Bulacan_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/7323Cuisine_of_Bulacan_01.jpg/480px-7323Cuisine_of_Bulacan_01.jpg")
                    .description("Fotografia de Costeleta de Porco.")
                    .build()
    ),

    ESPETO_MISTO_CHURRASQUEIRA_DO_ZE_PHOTO(
            DocumentFile.builder()
                    .title("Espeto Misto - Churrasqueira do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/DFC_3953_Skewered_pieces_of_fresh_squid_ready_for_grilling_at_a_busy_seafood_market.jpg/1280px-DFC_3953_Skewered_pieces_of_fresh_squid_ready_for_grilling_at_a_busy_seafood_market.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/DFC_3953_Skewered_pieces_of_fresh_squid_ready_for_grilling_at_a_busy_seafood_market.jpg/480px-DFC_3953_Skewered_pieces_of_fresh_squid_ready_for_grilling_at_a_busy_seafood_market.jpg")
                    .description("Fotografia de Espeto Misto.")
                    .build()
    ),

    ESPETO_DE_CAMARAO_CHURRASQUEIRA_DO_ZE_PHOTO(
            DocumentFile.builder()
                    .title("Espeto de Camarão - Churrasqueira do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Bacon_Wrapped_Shrimp_Skewers_at_The_Revel_Patio_Grill.jpg/1280px-Bacon_Wrapped_Shrimp_Skewers_at_The_Revel_Patio_Grill.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Bacon_Wrapped_Shrimp_Skewers_at_The_Revel_Patio_Grill.jpg/480px-Bacon_Wrapped_Shrimp_Skewers_at_The_Revel_Patio_Grill.jpg")
                    .description("Fotografia de Espeto de Camarão.")
                    .build()
    ),

    BIFE_GRELHADO_GRELHADOS_MIUDOS_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Bife Grelhado - Grelhados Miúdos Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/DFC_2081_Juicy_grilled_steak_topped_with_herb_butter_served_with_fries_saut%C3%A9ed_green_beans_coleslaw_and_a_side_of_gravy.jpg/1280px-DFC_2081_Juicy_grilled_steak_topped_with_herb_butter_served_with_fries_saut%C3%A9ed_green_beans_coleslaw_and_a_side_of_gravy.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/DFC_2081_Juicy_grilled_steak_topped_with_herb_butter_served_with_fries_saut%C3%A9ed_green_beans_coleslaw_and_a_side_of_gravy.jpg/480px-DFC_2081_Juicy_grilled_steak_topped_with_herb_butter_served_with_fries_saut%C3%A9ed_green_beans_coleslaw_and_a_side_of_gravy.jpg")
                    .description("Fotografia de Bife Grelhado.")
                    .build()
    ),

    FRANGO_GRELHADO_GRELHADOS_MIUDOS_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Frango Grelhado - Grelhados Miúdos Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Grill_chicken.jpg/1280px-Grill_chicken.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Grill_chicken.jpg/480px-Grill_chicken.jpg")
                    .description("Fotografia de Frango Grelhado.")
                    .build()
    ),

    COSTELETA_DE_PORCO_GRELHADOS_MIUDOS_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Costeleta de Porco - Grelhados Miúdos Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/7323Cuisine_of_Bulacan_02.jpg/1280px-7323Cuisine_of_Bulacan_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/7323Cuisine_of_Bulacan_02.jpg/480px-7323Cuisine_of_Bulacan_02.jpg")
                    .description("Fotografia de Costeleta de Porco.")
                    .build()
    ),

    ESPETO_MISTO_GRELHADOS_MIUDOS_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Espeto Misto - Grelhados Miúdos Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/DFC_5241-_Colorful_skewers_of_steamed_and_grilled_dim_sum_-_bright_yellow_siu_mai%2C_green_vegetable_dumplings%2C_seaweed-wrapped_bites_and_savory_meat_balls_-_ready_to_enjoy_at_a_bustling_Thai_street_food_stall.jpg/1280px-thumbnail.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/DFC_5241-_Colorful_skewers_of_steamed_and_grilled_dim_sum_-_bright_yellow_siu_mai%2C_green_vegetable_dumplings%2C_seaweed-wrapped_bites_and_savory_meat_balls_-_ready_to_enjoy_at_a_bustling_Thai_street_food_stall.jpg/480px-thumbnail.jpg")
                    .description("Fotografia de Espeto Misto.")
                    .build()
    ),

    ESPETO_DE_CAMARAO_GRELHADOS_MIUDOS_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Espeto de Camarão - Grelhados Miúdos Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Bread_in_the_Hellenic_Republic.jpg/1280px-Bread_in_the_Hellenic_Republic.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Bread_in_the_Hellenic_Republic.jpg/480px-Bread_in_the_Hellenic_Republic.jpg")
                    .description("Fotografia de Espeto de Camarão.")
                    .build()
    ),

    BIFE_GRELHADO_ESPETOS_DA_BAIA_PHOTO(
            DocumentFile.builder()
                    .title("Bife Grelhado - Espetos da Baía")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Entrec%C3%B4te_at_restaurant_Grill_it%21_Tapiola_Garden.jpg/1280px-Entrec%C3%B4te_at_restaurant_Grill_it%21_Tapiola_Garden.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Entrec%C3%B4te_at_restaurant_Grill_it%21_Tapiola_Garden.jpg/480px-Entrec%C3%B4te_at_restaurant_Grill_it%21_Tapiola_Garden.jpg")
                    .description("Fotografia de Bife Grelhado.")
                    .build()
    ),

    FRANGO_GRELHADO_ESPETOS_DA_BAIA_PHOTO(
            DocumentFile.builder()
                    .title("Frango Grelhado - Espetos da Baía")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Grilled_chicken_and_chips.jpg/1280px-Grilled_chicken_and_chips.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Grilled_chicken_and_chips.jpg/480px-Grilled_chicken_and_chips.jpg")
                    .description("Fotografia de Frango Grelhado.")
                    .build()
    ),

    COSTELETA_DE_PORCO_ESPETOS_DA_BAIA_PHOTO(
            DocumentFile.builder()
                    .title("Costeleta de Porco - Espetos da Baía")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/7323Cuisine_of_Bulacan_08.jpg/1280px-7323Cuisine_of_Bulacan_08.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/7323Cuisine_of_Bulacan_08.jpg/480px-7323Cuisine_of_Bulacan_08.jpg")
                    .description("Fotografia de Costeleta de Porco.")
                    .build()
    ),

    ESPETO_MISTO_ESPETOS_DA_BAIA_PHOTO(
            DocumentFile.builder()
                    .title("Espeto Misto - Espetos da Baía")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_%284340669590%29.jpg/1280px-Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_%284340669590%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_%284340669590%29.jpg/480px-Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_%284340669590%29.jpg")
                    .description("Fotografia de Espeto Misto.")
                    .build()
    ),

    ESPETO_DE_CAMARAO_ESPETOS_DA_BAIA_PHOTO(
            DocumentFile.builder()
                    .title("Espeto de Camarão - Espetos da Baía")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Brochette_de_la_mer_au_restaurant_Le_Saladier_%C3%A0_Villefranche-sur-Sa%C3%B4ne.JPG/1280px-Brochette_de_la_mer_au_restaurant_Le_Saladier_%C3%A0_Villefranche-sur-Sa%C3%B4ne.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Brochette_de_la_mer_au_restaurant_Le_Saladier_%C3%A0_Villefranche-sur-Sa%C3%B4ne.JPG/480px-Brochette_de_la_mer_au_restaurant_Le_Saladier_%C3%A0_Villefranche-sur-Sa%C3%B4ne.JPG")
                    .description("Fotografia de Espeto de Camarão.")
                    .build()
    ),

    BIFE_GRELHADO_CHURRASCO_KING_PHOTO(
            DocumentFile.builder()
                    .title("Bife Grelhado - Churrasco King")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Grilling_steak.jpg/1280px-Grilling_steak.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Grilling_steak.jpg/480px-Grilling_steak.jpg")
                    .description("Fotografia de Bife Grelhado.")
                    .build()
    ),

    FRANGO_GRELHADO_CHURRASCO_KING_PHOTO(
            DocumentFile.builder()
                    .title("Frango Grelhado - Churrasco King")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Grilled_chicken_and_fries.jpg/1280px-Grilled_chicken_and_fries.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Grilled_chicken_and_fries.jpg/480px-Grilled_chicken_and_fries.jpg")
                    .description("Fotografia de Frango Grelhado.")
                    .build()
    ),

    COSTELETA_DE_PORCO_CHURRASCO_KING_PHOTO(
            DocumentFile.builder()
                    .title("Costeleta de Porco - Churrasco King")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/7323Cuisine_of_Bulacan_09.jpg/1280px-7323Cuisine_of_Bulacan_09.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/7323Cuisine_of_Bulacan_09.jpg/480px-7323Cuisine_of_Bulacan_09.jpg")
                    .description("Fotografia de Costeleta de Porco.")
                    .build()
    ),

    ESPETO_MISTO_CHURRASCO_KING_PHOTO(
            DocumentFile.builder()
                    .title("Espeto Misto - Churrasco King")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_-_photo_by_Julia_%284340669958%29.jpg/1280px-Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_-_photo_by_Julia_%284340669958%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_-_photo_by_Julia_%284340669958%29.jpg/480px-Seafood_Don_-_Ichi_Ni_Izakaya_AUD20_-_photo_by_Julia_%284340669958%29.jpg")
                    .description("Fotografia de Espeto Misto.")
                    .build()
    ),

    ESPETO_DE_CAMARAO_CHURRASCO_KING_PHOTO(
            DocumentFile.builder()
                    .title("Espeto de Camarão - Churrasco King")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Classic_Platter_for_2_-_Rosa%27s_Thai_2025-07-22.jpg/1280px-Classic_Platter_for_2_-_Rosa%27s_Thai_2025-07-22.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Classic_Platter_for_2_-_Rosa%27s_Thai_2025-07-22.jpg/480px-Classic_Platter_for_2_-_Rosa%27s_Thai_2025-07-22.jpg")
                    .description("Fotografia de Espeto de Camarão.")
                    .build()
    ),

    BIFE_GRELHADO_GRELHADO_DA_CASA_PHOTO(
            DocumentFile.builder()
                    .title("Bife Grelhado - Grelhado da Casa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Grilled_chicken_served_with_creamy_mashed_potatoes_and_fresh_vegetables_undefined.jpg/1280px-Grilled_chicken_served_with_creamy_mashed_potatoes_and_fresh_vegetables_undefined.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Grilled_chicken_served_with_creamy_mashed_potatoes_and_fresh_vegetables_undefined.jpg/480px-Grilled_chicken_served_with_creamy_mashed_potatoes_and_fresh_vegetables_undefined.jpg")
                    .description("Fotografia de Bife Grelhado.")
                    .build()
    ),

    FRANGO_GRELHADO_GRELHADO_DA_CASA_PHOTO(
            DocumentFile.builder()
                    .title("Frango Grelhado - Grelhado da Casa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Grilled_chicken_with_fries.jpg/1280px-Grilled_chicken_with_fries.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Grilled_chicken_with_fries.jpg/480px-Grilled_chicken_with_fries.jpg")
                    .description("Fotografia de Frango Grelhado.")
                    .build()
    ),

    COSTELETA_DE_PORCO_GRELHADO_DA_CASA_PHOTO(
            DocumentFile.builder()
                    .title("Costeleta de Porco - Grelhado da Casa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/7323Cuisine_of_Bulacan_10.jpg/1280px-7323Cuisine_of_Bulacan_10.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/7323Cuisine_of_Bulacan_10.jpg/480px-7323Cuisine_of_Bulacan_10.jpg")
                    .description("Fotografia de Costeleta de Porco.")
                    .build()
    ),

    ESPETO_MISTO_GRELHADO_DA_CASA_PHOTO(
            DocumentFile.builder()
                    .title("Espeto Misto - Grelhado da Casa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Street_Foods_Chorizzo.jpg/1280px-Street_Foods_Chorizzo.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Street_Foods_Chorizzo.jpg/480px-Street_Foods_Chorizzo.jpg")
                    .description("Fotografia de Espeto Misto.")
                    .build()
    ),

    ESPETO_DE_CAMARAO_GRELHADO_DA_CASA_PHOTO(
            DocumentFile.builder()
                    .title("Espeto de Camarão - Grelhado da Casa")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/DFC_5231-_Skewered_sausages_and_fish_balls_grilling_and_bathing_in_a_savory_sauce_at_a_bustling_Thai_street_food_stall.jpg/1280px-DFC_5231-_Skewered_sausages_and_fish_balls_grilling_and_bathing_in_a_savory_sauce_at_a_bustling_Thai_street_food_stall.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/DFC_5231-_Skewered_sausages_and_fish_balls_grilling_and_bathing_in_a_savory_sauce_at_a_bustling_Thai_street_food_stall.jpg/480px-DFC_5231-_Skewered_sausages_and_fish_balls_grilling_and_bathing_in_a_savory_sauce_at_a_bustling_Thai_street_food_stall.jpg")
                    .description("Fotografia de Espeto de Camarão.")
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Arroz de Marisco - Marisqueira Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6108_1.jpg/1280px-20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6108_1.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6108_1.jpg/480px-20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6108_1.jpg")
                    .description("Fotografia de Arroz de Marisco.")
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Calulu de Camarão - Marisqueira Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Bangladeshi_Prawn_Curry.jpg/1280px-Bangladeshi_Prawn_Curry.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Bangladeshi_Prawn_Curry.jpg/480px-Bangladeshi_Prawn_Curry.jpg")
                    .description("Fotografia de Calulu de Camarão.")
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Filete de Robalo Grelhado - Marisqueira Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Auf_Holzbretter_genagelte_Lachsfilets_werden_am_offenen_Feuer_gegrillt%2C_Bonner_Weihnachtsmarkt_2025.jpg/1280px-Auf_Holzbretter_genagelte_Lachsfilets_werden_am_offenen_Feuer_gegrillt%2C_Bonner_Weihnachtsmarkt_2025.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Auf_Holzbretter_genagelte_Lachsfilets_werden_am_offenen_Feuer_gegrillt%2C_Bonner_Weihnachtsmarkt_2025.jpg/480px-Auf_Holzbretter_genagelte_Lachsfilets_werden_am_offenen_Feuer_gegrillt%2C_Bonner_Weihnachtsmarkt_2025.jpg")
                    .description("Fotografia de Filete de Robalo Grelhado.")
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Camarão Grelhado - Marisqueira Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/DZ6_0565_Sizzling_seafood_pad_thai_topped_with_a_whole_grilled_prawn_served_with_fresh_lime_and_scallions.jpg/1280px-DZ6_0565_Sizzling_seafood_pad_thai_topped_with_a_whole_grilled_prawn_served_with_fresh_lime_and_scallions.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/DZ6_0565_Sizzling_seafood_pad_thai_topped_with_a_whole_grilled_prawn_served_with_fresh_lime_and_scallions.jpg/480px-DZ6_0565_Sizzling_seafood_pad_thai_topped_with_a_whole_grilled_prawn_served_with_fresh_lime_and_scallions.jpg")
                    .description("Fotografia de Camarão Grelhado.")
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_BAIA_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Polvo à Lagareiro - Marisqueira Baía de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Calamari_grillati.JPG/1280px-Calamari_grillati.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Calamari_grillati.JPG/480px-Calamari_grillati.JPG")
                    .description("Fotografia de Polvo à Lagareiro.")
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DO_PORTO_PHOTO(
            DocumentFile.builder()
                    .title("Arroz de Marisco - Marisqueira do Porto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6109.jpg/1280px-20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6109.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6109.jpg/480px-20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6109.jpg")
                    .description("Fotografia de Arroz de Marisco.")
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DO_PORTO_PHOTO(
            DocumentFile.builder()
                    .title("Calulu de Camarão - Marisqueira do Porto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Bengali_Prawn_Curry.jpg/1280px-Bengali_Prawn_Curry.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Bengali_Prawn_Curry.jpg/480px-Bengali_Prawn_Curry.jpg")
                    .description("Fotografia de Calulu de Camarão.")
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_PORTO_PHOTO(
            DocumentFile.builder()
                    .title("Filete de Robalo Grelhado - Marisqueira do Porto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Dinner_at_Bardsley%27s_2023-08-29.jpg/1280px-Dinner_at_Bardsley%27s_2023-08-29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Dinner_at_Bardsley%27s_2023-08-29.jpg/480px-Dinner_at_Bardsley%27s_2023-08-29.jpg")
                    .description("Fotografia de Filete de Robalo Grelhado.")
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DO_PORTO_PHOTO(
            DocumentFile.builder()
                    .title("Camarão Grelhado - Marisqueira do Porto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Grilled_Game_Meat_-_Prawns_-_Calamari_-_Frites_-_on_a_white_plate.jpg/1280px-Grilled_Game_Meat_-_Prawns_-_Calamari_-_Frites_-_on_a_white_plate.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Grilled_Game_Meat_-_Prawns_-_Calamari_-_Frites_-_on_a_white_plate.jpg/480px-Grilled_Game_Meat_-_Prawns_-_Calamari_-_Frites_-_on_a_white_plate.jpg")
                    .description("Fotografia de Camarão Grelhado.")
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DO_PORTO_PHOTO(
            DocumentFile.builder()
                    .title("Polvo à Lagareiro - Marisqueira do Porto")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/DFC_0313_Skewered_grilled_baby_octopus_glistening_with_a_savory_glaze_and_served_on_a_bed_of_fresh_greens.jpg/1280px-DFC_0313_Skewered_grilled_baby_octopus_glistening_with_a_savory_glaze_and_served_on_a_bed_of_fresh_greens.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/DFC_0313_Skewered_grilled_baby_octopus_glistening_with_a_savory_glaze_and_served_on_a_bed_of_fresh_greens.jpg/480px-DFC_0313_Skewered_grilled_baby_octopus_glistening_with_a_savory_glaze_and_served_on_a_bed_of_fresh_greens.jpg")
                    .description("Fotografia de Polvo à Lagareiro.")
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Arroz de Marisco - Marisqueira Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6110.jpg/1280px-20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6110.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6110.jpg/480px-20200205_S%C3%A3oMiguel%40Nazar%C3%A9_6110.jpg")
                    .description("Fotografia de Arroz de Marisco.")
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Calulu de Camarão - Marisqueira Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Bengali_Shrimp_Curry.jpg/1280px-Bengali_Shrimp_Curry.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Bengali_Shrimp_Curry.jpg/480px-Bengali_Shrimp_Curry.jpg")
                    .description("Fotografia de Calulu de Camarão.")
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Filete de Robalo Grelhado - Marisqueira Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Fish_and_dill_for_2_-_Cha_Ca_La_Vong_VND120000_each.jpg/1280px-Fish_and_dill_for_2_-_Cha_Ca_La_Vong_VND120000_each.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Fish_and_dill_for_2_-_Cha_Ca_La_Vong_VND120000_each.jpg/480px-Fish_and_dill_for_2_-_Cha_Ca_La_Vong_VND120000_each.jpg")
                    .description("Fotografia de Filete de Robalo Grelhado.")
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Camarão Grelhado - Marisqueira Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Grilled_prawn_with_herb.jpg/1280px-Grilled_prawn_with_herb.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Grilled_prawn_with_herb.jpg/480px-Grilled_prawn_with_herb.jpg")
                    .description("Fotografia de Camarão Grelhado.")
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Polvo à Lagareiro - Marisqueira Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/DSCF1107_Skewered_baby_octopus_grilled_to_a_golden_finish_ready_to_be_served_as_a_savory_street-food_snack.jpg/1280px-DSCF1107_Skewered_baby_octopus_grilled_to_a_golden_finish_ready_to_be_served_as_a_savory_street-food_snack.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/DSCF1107_Skewered_baby_octopus_grilled_to_a_golden_finish_ready_to_be_served_as_a_savory_street-food_snack.jpg/480px-DSCF1107_Skewered_baby_octopus_grilled_to_a_golden_finish_ready_to_be_served_as_a_savory_street-food_snack.jpg")
                    .description("Fotografia de Polvo à Lagareiro.")
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DE_BENGUELA_PHOTO(
            DocumentFile.builder()
                    .title("Arroz de Marisco - Marisqueira de Benguela")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Arroz_caldoso_con_mariscos.jpg/1280px-Arroz_caldoso_con_mariscos.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Arroz_caldoso_con_mariscos.jpg/480px-Arroz_caldoso_con_mariscos.jpg")
                    .description("Fotografia de Arroz de Marisco.")
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DE_BENGUELA_PHOTO(
            DocumentFile.builder()
                    .title("Calulu de Camarão - Marisqueira de Benguela")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Cocunut_Prawn_Curry.JPG/1280px-Cocunut_Prawn_Curry.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Cocunut_Prawn_Curry.JPG/480px-Cocunut_Prawn_Curry.JPG")
                    .description("Fotografia de Calulu de Camarão.")
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DE_BENGUELA_PHOTO(
            DocumentFile.builder()
                    .title("Filete de Robalo Grelhado - Marisqueira de Benguela")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Fish_and_dill_for_2_-_close-up_-_Cha_Ca_La_Vong_VND120000_each.jpg/1280px-Fish_and_dill_for_2_-_close-up_-_Cha_Ca_La_Vong_VND120000_each.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Fish_and_dill_for_2_-_close-up_-_Cha_Ca_La_Vong_VND120000_each.jpg/480px-Fish_and_dill_for_2_-_close-up_-_Cha_Ca_La_Vong_VND120000_each.jpg")
                    .description("Fotografia de Filete de Robalo Grelhado.")
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DE_BENGUELA_PHOTO(
            DocumentFile.builder()
                    .title("Camarão Grelhado - Marisqueira de Benguela")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Jacob%27s_Restaurant_-_Jan_2019_-_Stierch_01.jpg/1280px-Jacob%27s_Restaurant_-_Jan_2019_-_Stierch_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Jacob%27s_Restaurant_-_Jan_2019_-_Stierch_01.jpg/480px-Jacob%27s_Restaurant_-_Jan_2019_-_Stierch_01.jpg")
                    .description("Fotografia de Camarão Grelhado.")
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DE_BENGUELA_PHOTO(
            DocumentFile.builder()
                    .title("Polvo à Lagareiro - Marisqueira de Benguela")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Grilled_octopus_2.jpg/1280px-Grilled_octopus_2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Grilled_octopus_2.jpg/480px-Grilled_octopus_2.jpg")
                    .description("Fotografia de Polvo à Lagareiro.")
                    .build()
    ),

    ARROZ_DE_MARISCO_MARISQUEIRA_DO_NAMIBE_PHOTO(
            DocumentFile.builder()
                    .title("Arroz de Marisco - Marisqueira do Namibe")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Arroz_de_marisco.jpg/1280px-Arroz_de_marisco.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Arroz_de_marisco.jpg/480px-Arroz_de_marisco.jpg")
                    .description("Fotografia de Arroz de Marisco.")
                    .build()
    ),

    CALULU_DE_CAMARAO_MARISQUEIRA_DO_NAMIBE_PHOTO(
            DocumentFile.builder()
                    .title("Calulu de Camarão - Marisqueira do Namibe")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Goan_Prawn_Curry-Goa_goa-IMG_07.jpg/1280px-Goan_Prawn_Curry-Goa_goa-IMG_07.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Goan_Prawn_Curry-Goa_goa-IMG_07.jpg/480px-Goan_Prawn_Curry-Goa_goa-IMG_07.jpg")
                    .description("Fotografia de Calulu de Camarão.")
                    .build()
    ),

    FILETE_DE_ROBALO_GRELHADO_MARISQUEIRA_DO_NAMIBE_PHOTO(
            DocumentFile.builder()
                    .title("Filete de Robalo Grelhado - Marisqueira do Namibe")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Fish_fillet_in_aluminum_tray.jpg/1280px-Fish_fillet_in_aluminum_tray.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Fish_fillet_in_aluminum_tray.jpg/480px-Fish_fillet_in_aluminum_tray.jpg")
                    .description("Fotografia de Filete de Robalo Grelhado.")
                    .build()
    ),

    CAMARAO_GRELHADO_MARISQUEIRA_DO_NAMIBE_PHOTO(
            DocumentFile.builder()
                    .title("Camarão Grelhado - Marisqueira do Namibe")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Jumbo_karidesler.jpg/1280px-Jumbo_karidesler.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Jumbo_karidesler.jpg/480px-Jumbo_karidesler.jpg")
                    .description("Fotografia de Camarão Grelhado.")
                    .build()
    ),

    POLVO_A_LAGAREIRO_MARISQUEIRA_DO_NAMIBE_PHOTO(
            DocumentFile.builder()
                    .title("Polvo à Lagareiro - Marisqueira do Namibe")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Pulpitos_Turkey.jpg/1280px-Pulpitos_Turkey.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Pulpitos_Turkey.jpg/480px-Pulpitos_Turkey.jpg")
                    .description("Fotografia de Polvo à Lagareiro.")
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Sashimi de Salmão - Sushi Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/2024-02-10_Salmon_Sashimi_at_Restaurant_Uri_Buri_in_Acre_anagoria.jpg/1280px-2024-02-10_Salmon_Sashimi_at_Restaurant_Uri_Buri_in_Acre_anagoria.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/2024-02-10_Salmon_Sashimi_at_Restaurant_Uri_Buri_in_Acre_anagoria.jpg/480px-2024-02-10_Salmon_Sashimi_at_Restaurant_Uri_Buri_in_Acre_anagoria.jpg")
                    .description("Fotografia de Sashimi de Salmão.")
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Nigiri Misto 8 Peças - Sushi Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Awabi_Nigiri_DSC07593.jpg/1280px-Awabi_Nigiri_DSC07593.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Awabi_Nigiri_DSC07593.jpg/480px-Awabi_Nigiri_DSC07593.jpg")
                    .description("Fotografia de Nigiri Misto 8 Peças.")
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Temaki de Salmão - Sushi Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Discounted_food_at_Japan_Centre%2C_Leicester_Square_2026-09-16.jpg/1280px-Discounted_food_at_Japan_Centre%2C_Leicester_Square_2026-09-16.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Discounted_food_at_Japan_Centre%2C_Leicester_Square_2026-09-16.jpg/480px-Discounted_food_at_Japan_Centre%2C_Leicester_Square_2026-09-16.jpg")
                    .description("Fotografia de Temaki de Salmão.")
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Hot Roll Especial - Sushi Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/43_HOT_ROLL%2C_A_TWO-HIGH_REVERSING_MILL_THAT_PRODUCES_THE_LONGEST_COPPER_AND_ALLOY_STRIP_IN_THE_U.S._INDUSTRY._OVERALL_LENGTH_OF_THE_RUN-OUT_LINE_IS_300%27._-_American_Brass_Foundry_HAER_NY%2C15-BUF%2C25-19.tif/lossy-page1-1280px-thumbnail.tif.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/43_HOT_ROLL%2C_A_TWO-HIGH_REVERSING_MILL_THAT_PRODUCES_THE_LONGEST_COPPER_AND_ALLOY_STRIP_IN_THE_U.S._INDUSTRY._OVERALL_LENGTH_OF_THE_RUN-OUT_LINE_IS_300%27._-_American_Brass_Foundry_HAER_NY%2C15-BUF%2C25-19.tif/lossy-page1-1280px-thumbnail.tif.jpg")
                    .description("Fotografia de Hot Roll Especial.")
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Menu Sushi 18 Peças - Sushi Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Assorted_Sushi_Platter_from_Nobu.jpg/1280px-Assorted_Sushi_Platter_from_Nobu.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Assorted_Sushi_Platter_from_Nobu.jpg/480px-Assorted_Sushi_Platter_from_Nobu.jpg")
                    .description("Fotografia de Menu Sushi 18 Peças.")
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_BOM_DIA_PHOTO(
            DocumentFile.builder()
                    .title("Sashimi de Salmão - Sushi Bom Dia")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Home-made_salmon_sashimi_%2815532557543%29.jpg/1280px-Home-made_salmon_sashimi_%2815532557543%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Home-made_salmon_sashimi_%2815532557543%29.jpg/480px-Home-made_salmon_sashimi_%2815532557543%29.jpg")
                    .description("Fotografia de Sashimi de Salmão.")
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_BOM_DIA_PHOTO(
            DocumentFile.builder()
                    .title("Nigiri Misto 8 Peças - Sushi Bom Dia")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Nigiri_Sushi%2C_Hosomaki_-_Uta_Sushi_Bar_%285049056668%29.jpg/1280px-Nigiri_Sushi%2C_Hosomaki_-_Uta_Sushi_Bar_%285049056668%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Nigiri_Sushi%2C_Hosomaki_-_Uta_Sushi_Bar_%285049056668%29.jpg/480px-Nigiri_Sushi%2C_Hosomaki_-_Uta_Sushi_Bar_%285049056668%29.jpg")
                    .description("Fotografia de Nigiri Misto 8 Peças.")
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_BOM_DIA_PHOTO(
            DocumentFile.builder()
                    .title("Temaki de Salmão - Sushi Bom Dia")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Eel_temaki_zushi_by_The_Wong_Family_Pictures.jpg/1280px-Eel_temaki_zushi_by_The_Wong_Family_Pictures.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Eel_temaki_zushi_by_The_Wong_Family_Pictures.jpg/480px-Eel_temaki_zushi_by_The_Wong_Family_Pictures.jpg")
                    .description("Fotografia de Temaki de Salmão.")
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_BOM_DIA_PHOTO(
            DocumentFile.builder()
                    .title("Hot Roll Especial - Sushi Bom Dia")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Ceviche_Hot_Roll.jpg/1280px-Ceviche_Hot_Roll.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Ceviche_Hot_Roll.jpg/480px-Ceviche_Hot_Roll.jpg")
                    .description("Fotografia de Hot Roll Especial.")
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_BOM_DIA_PHOTO(
            DocumentFile.builder()
                    .title("Menu Sushi 18 Peças - Sushi Bom Dia")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Assorted_Western_sushi_%28%E7%9B%9B%E3%82%8A%E5%90%88%E3%82%8F%E3%81%9B%29.jpg/1280px-Assorted_Western_sushi_%28%E7%9B%9B%E3%82%8A%E5%90%88%E3%82%8F%E3%81%9B%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Assorted_Western_sushi_%28%E7%9B%9B%E3%82%8A%E5%90%88%E3%82%8F%E3%81%9B%29.jpg/480px-Assorted_Western_sushi_%28%E7%9B%9B%E3%82%8A%E5%90%88%E3%82%8F%E3%81%9B%29.jpg")
                    .description("Fotografia de Menu Sushi 18 Peças.")
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_TOKYO_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Sashimi de Salmão - Sushi Tokyo Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Salmon_Sashimi_ingredients.png/1280px-Salmon_Sashimi_ingredients.png")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Salmon_Sashimi_ingredients.png/480px-Salmon_Sashimi_ingredients.png")
                    .description("Fotografia de Sashimi de Salmão.")
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_TOKYO_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Nigiri Misto 8 Peças - Sushi Tokyo Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Nigiri_Sushi_%2825966163204%29.jpg/1280px-Nigiri_Sushi_%2825966163204%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Nigiri_Sushi_%2825966163204%29.jpg/480px-Nigiri_Sushi_%2825966163204%29.jpg")
                    .description("Fotografia de Nigiri Misto 8 Peças.")
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_TOKYO_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Temaki de Salmão - Sushi Tokyo Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Fried_Banana_Temaki.jpg/1280px-Fried_Banana_Temaki.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Fried_Banana_Temaki.jpg/480px-Fried_Banana_Temaki.jpg")
                    .description("Fotografia de Temaki de Salmão.")
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_TOKYO_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Hot Roll Especial - Sushi Tokyo Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Deep-fried_Sushi_-_Hing_Wah_2025-08-23.jpg/1280px-Deep-fried_Sushi_-_Hing_Wah_2025-08-23.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Deep-fried_Sushi_-_Hing_Wah_2025-08-23.jpg/480px-Deep-fried_Sushi_-_Hing_Wah_2025-08-23.jpg")
                    .description("Fotografia de Hot Roll Especial.")
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_TOKYO_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Menu Sushi 18 Peças - Sushi Tokyo Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Japanese_Sushi_platter.jpg/1280px-Japanese_Sushi_platter.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Japanese_Sushi_platter.jpg/480px-Japanese_Sushi_platter.jpg")
                    .description("Fotografia de Menu Sushi 18 Peças.")
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_SAKURA_PHOTO(
            DocumentFile.builder()
                    .title("Sashimi de Salmão - Sushi Sakura")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Salmon_sashimi_appetizers.jpeg/1280px-Salmon_sashimi_appetizers.jpeg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Salmon_sashimi_appetizers.jpeg/480px-Salmon_sashimi_appetizers.jpeg")
                    .description("Fotografia de Sashimi de Salmão.")
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_SAKURA_PHOTO(
            DocumentFile.builder()
                    .title("Nigiri Misto 8 Peças - Sushi Sakura")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Nigiri_Sushi_%2826478725732%29.jpg/1280px-Nigiri_Sushi_%2826478725732%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Nigiri_Sushi_%2826478725732%29.jpg/480px-Nigiri_Sushi_%2826478725732%29.jpg")
                    .description("Fotografia de Nigiri Misto 8 Peças.")
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_SAKURA_PHOTO(
            DocumentFile.builder()
                    .title("Temaki de Salmão - Sushi Sakura")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/HK_%E5%8C%97%E8%A7%92_North_Point_%E5%92%8C%E7%94%B0_Wada_Japanese_Restaurant_%E6%94%BE%E9%A1%8C_Buffet_dinner_%E6%97%A5%E5%BC%8F%E6%89%8B%E5%8D%B7_Temaki_Shushi_Nori_roll_rice_Mar-2013.JPG/1280px-HK_%E5%8C%97%E8%A7%92_North_Point_%E5%92%8C%E7%94%B0_Wada_Japanese_Restaurant_%E6%94%BE%E9%A1%8C_Buffet_dinner_%E6%97%A5%E5%BC%8F%E6%89%8B%E5%8D%B7_Temaki_Shushi_Nori_roll_rice_Mar-2013.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/HK_%E5%8C%97%E8%A7%92_North_Point_%E5%92%8C%E7%94%B0_Wada_Japanese_Restaurant_%E6%94%BE%E9%A1%8C_Buffet_dinner_%E6%97%A5%E5%BC%8F%E6%89%8B%E5%8D%B7_Temaki_Shushi_Nori_roll_rice_Mar-2013.JPG/480px-HK_%E5%8C%97%E8%A7%92_North_Point_%E5%92%8C%E7%94%B0_Wada_Japanese_Restaurant_%E6%94%BE%E9%A1%8C_Buffet_dinner_%E6%97%A5%E5%BC%8F%E6%89%8B%E5%8D%B7_Temaki_Shushi_Nori_roll_rice_Mar-2013.JPG")
                    .description("Fotografia de Temaki de Salmão.")
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_SAKURA_PHOTO(
            DocumentFile.builder()
                    .title("Hot Roll Especial - Sushi Sakura")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Dynamite_roll.jpg/1280px-Dynamite_roll.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Dynamite_roll.jpg/480px-Dynamite_roll.jpg")
                    .description("Fotografia de Hot Roll Especial.")
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_SAKURA_PHOTO(
            DocumentFile.builder()
                    .title("Menu Sushi 18 Peças - Sushi Sakura")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Mrs_Y%27s_Sushi_on_platters.jpg/1280px-Mrs_Y%27s_Sushi_on_platters.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Mrs_Y%27s_Sushi_on_platters.jpg/480px-Mrs_Y%27s_Sushi_on_platters.jpg")
                    .description("Fotografia de Menu Sushi 18 Peças.")
                    .build()
    ),

    SASHIMI_DE_SALMAO_SUSHI_MANGA_PHOTO(
            DocumentFile.builder()
                    .title("Sashimi de Salmão - Sushi Manga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Salmon_sashimi_fish.jpg/1280px-Salmon_sashimi_fish.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Salmon_sashimi_fish.jpg/480px-Salmon_sashimi_fish.jpg")
                    .description("Fotografia de Sashimi de Salmão.")
                    .build()
    ),

    NIGIRI_MISTO_8_PECAS_SUSHI_MANGA_PHOTO(
            DocumentFile.builder()
                    .title("Nigiri Misto 8 Peças - Sushi Manga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Nigiri_Sushi_%2826478732232%29.jpg/1280px-Nigiri_Sushi_%2826478732232%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Nigiri_Sushi_%2826478732232%29.jpg/480px-Nigiri_Sushi_%2826478732232%29.jpg")
                    .description("Fotografia de Nigiri Misto 8 Peças.")
                    .build()
    ),

    TEMAKI_DE_SALMAO_SUSHI_MANGA_PHOTO(
            DocumentFile.builder()
                    .title("Temaki de Salmão - Sushi Manga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Ikura_temaki_zushi_by_Adonis_Chen_in_Taipei.jpg/1280px-Ikura_temaki_zushi_by_Adonis_Chen_in_Taipei.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Ikura_temaki_zushi_by_Adonis_Chen_in_Taipei.jpg/480px-Ikura_temaki_zushi_by_Adonis_Chen_in_Taipei.jpg")
                    .description("Fotografia de Temaki de Salmão.")
                    .build()
    ),

    HOT_ROLL_ESPECIAL_SUSHI_MANGA_PHOTO(
            DocumentFile.builder()
                    .title("Hot Roll Especial - Sushi Manga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Fried_smoked_salmon_roll.jpg/1280px-Fried_smoked_salmon_roll.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Fried_smoked_salmon_roll.jpg/480px-Fried_smoked_salmon_roll.jpg")
                    .description("Fotografia de Hot Roll Especial.")
                    .build()
    ),

    MENU_SUSHI_18_PECAS_SUSHI_MANGA_PHOTO(
            DocumentFile.builder()
                    .title("Menu Sushi 18 Peças - Sushi Manga")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Store_Bought_Sushi_Platter_with_Soy_Sauce.jpg/1280px-Store_Bought_Sushi_Platter_with_Soy_Sauce.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Store_Bought_Sushi_Platter_with_Soy_Sauce.jpg/480px-Store_Bought_Sushi_Platter_with_Soy_Sauce.jpg")
                    .description("Fotografia de Menu Sushi 18 Peças.")
                    .build()
    ),

    ESPRESSO_CAFE_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Espresso - Café Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/20221116_glass_coffee_cup_empty_Panewniki.jpg/1280px-20221116_glass_coffee_cup_empty_Panewniki.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/20221116_glass_coffee_cup_empty_Panewniki.jpg/480px-20221116_glass_coffee_cup_empty_Panewniki.jpg")
                    .description("Fotografia de Espresso.")
                    .build()
    ),

    CAPPUCCINO_CAFE_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Cappuccino - Café Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/A-cup-of-cappuccino-coffee-dar-es-salaam-cafe.jpg/1280px-A-cup-of-cappuccino-coffee-dar-es-salaam-cafe.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/A-cup-of-cappuccino-coffee-dar-es-salaam-cafe.jpg/480px-A-cup-of-cappuccino-coffee-dar-es-salaam-cafe.jpg")
                    .description("Fotografia de Cappuccino.")
                    .build()
    ),

    LATTE_CAFE_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Latte - Café Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Aromas_Latte_art%2C_Noosa_Heads%2C_Queensland.jpg/1280px-Aromas_Latte_art%2C_Noosa_Heads%2C_Queensland.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Aromas_Latte_art%2C_Noosa_Heads%2C_Queensland.jpg/480px-Aromas_Latte_art%2C_Noosa_Heads%2C_Queensland.jpg")
                    .description("Fotografia de Latte.")
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Fatia de Bolo de Chocolate - Café Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/1-2-3-4_cake_slice_with_chocolate_sour_cream_icing.JPG/1280px-1-2-3-4_cake_slice_with_chocolate_sour_cream_icing.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/1-2-3-4_cake_slice_with_chocolate_sour_cream_icing.JPG/480px-1-2-3-4_cake_slice_with_chocolate_sour_cream_icing.JPG")
                    .description("Fotografia de Fatia de Bolo de Chocolate.")
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Sandes de Atum - Café Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/BLT_sandwich_and_chips.jpg/1280px-BLT_sandwich_and_chips.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/BLT_sandwich_and_chips.jpg/480px-BLT_sandwich_and_chips.jpg")
                    .description("Fotografia de Sandes de Atum.")
                    .build()
    ),

    ESPRESSO_CAFE_BOSSA_NOVA_PHOTO(
            DocumentFile.builder()
                    .title("Espresso - Café Bossa Nova")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/20231223_una_tazza_di_bokeh_PD104696_1.jpg/1280px-20231223_una_tazza_di_bokeh_PD104696_1.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/20231223_una_tazza_di_bokeh_PD104696_1.jpg/480px-20231223_una_tazza_di_bokeh_PD104696_1.jpg")
                    .description("Fotografia de Espresso.")
                    .build()
    ),

    CAPPUCCINO_CAFE_BOSSA_NOVA_PHOTO(
            DocumentFile.builder()
                    .title("Cappuccino - Café Bossa Nova")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/A_cup_of_Cappuccino.jpg/1280px-A_cup_of_Cappuccino.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/A_cup_of_Cappuccino.jpg/480px-A_cup_of_Cappuccino.jpg")
                    .description("Fotografia de Cappuccino.")
                    .build()
    ),

    LATTE_CAFE_BOSSA_NOVA_PHOTO(
            DocumentFile.builder()
                    .title("Latte - Café Bossa Nova")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Cappuccino_with_latte_art_on_Coffee_Right_in_Brno%2C_Brno-City_District.jpg/1280px-Cappuccino_with_latte_art_on_Coffee_Right_in_Brno%2C_Brno-City_District.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Cappuccino_with_latte_art_on_Coffee_Right_in_Brno%2C_Brno-City_District.jpg/480px-Cappuccino_with_latte_art_on_Coffee_Right_in_Brno%2C_Brno-City_District.jpg")
                    .description("Fotografia de Latte.")
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_BOSSA_NOVA_PHOTO(
            DocumentFile.builder()
                    .title("Fatia de Bolo de Chocolate - Café Bossa Nova")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/A_slice_of_white_chocolate_cake%2C_January_2009.jpg/1280px-A_slice_of_white_chocolate_cake%2C_January_2009.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/A_slice_of_white_chocolate_cake%2C_January_2009.jpg/480px-A_slice_of_white_chocolate_cake%2C_January_2009.jpg")
                    .description("Fotografia de Fatia de Bolo de Chocolate.")
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_BOSSA_NOVA_PHOTO(
            DocumentFile.builder()
                    .title("Sandes de Atum - Café Bossa Nova")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Cucumber_sandwich%2C_samosas%2C_potato_chips_and_cake_on_a_plate_-_20110622.jpg/1280px-Cucumber_sandwich%2C_samosas%2C_potato_chips_and_cake_on_a_plate_-_20110622.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Cucumber_sandwich%2C_samosas%2C_potato_chips_and_cake_on_a_plate_-_20110622.jpg/480px-Cucumber_sandwich%2C_samosas%2C_potato_chips_and_cake_on_a_plate_-_20110622.jpg")
                    .description("Fotografia de Sandes de Atum.")
                    .build()
    ),

    ESPRESSO_CAFE_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Espresso - Café do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/A_cup_of_Brazilian_espresso_with_Ukrainian_macaron.jpg/1280px-A_cup_of_Brazilian_espresso_with_Ukrainian_macaron.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/A_cup_of_Brazilian_espresso_with_Ukrainian_macaron.jpg/480px-A_cup_of_Brazilian_espresso_with_Ukrainian_macaron.jpg")
                    .description("Fotografia de Espresso.")
                    .build()
    ),

    CAPPUCCINO_CAFE_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Cappuccino - Café do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/A_cup_of_cappuccino_at_Indooroopilly_Shopping_Centre.JPG/1280px-A_cup_of_cappuccino_at_Indooroopilly_Shopping_Centre.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/A_cup_of_cappuccino_at_Indooroopilly_Shopping_Centre.JPG/480px-A_cup_of_cappuccino_at_Indooroopilly_Shopping_Centre.JPG")
                    .description("Fotografia de Cappuccino.")
                    .build()
    ),

    LATTE_CAFE_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Latte - Café do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Compass_Coffee_Lattes.jpg/1280px-Compass_Coffee_Lattes.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Compass_Coffee_Lattes.jpg/480px-Compass_Coffee_Lattes.jpg")
                    .description("Fotografia de Latte.")
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Fatia de Bolo de Chocolate - Café do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Almond%2C_Coconut%2C_Chocolate_cake_-_Lost_in_the_Lanes_2025-07-08.jpg/1280px-Almond%2C_Coconut%2C_Chocolate_cake_-_Lost_in_the_Lanes_2025-07-08.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Almond%2C_Coconut%2C_Chocolate_cake_-_Lost_in_the_Lanes_2025-07-08.jpg/480px-Almond%2C_Coconut%2C_Chocolate_cake_-_Lost_in_the_Lanes_2025-07-08.jpg")
                    .description("Fotografia de Fatia de Bolo de Chocolate.")
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Sandes de Atum - Café do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Grilled_cheese_sandwich_on_white_plate.jpg/1280px-Grilled_cheese_sandwich_on_white_plate.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Grilled_cheese_sandwich_on_white_plate.jpg/480px-Grilled_cheese_sandwich_on_white_plate.jpg")
                    .description("Fotografia de Sandes de Atum.")
                    .build()
    ),

    ESPRESSO_CAFE_PAO_QUENTE_PHOTO(
            DocumentFile.builder()
                    .title("Espresso - Café Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/A_cup_of_espresso.jpg/1280px-A_cup_of_espresso.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/A_cup_of_espresso.jpg/480px-A_cup_of_espresso.jpg")
                    .description("Fotografia de Espresso.")
                    .build()
    ),

    CAPPUCCINO_CAFE_PAO_QUENTE_PHOTO(
            DocumentFile.builder()
                    .title("Cappuccino - Café Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/A_cup_of_cappuccino_at_Miettes_Bakery%2C_Graceville%2C_Queensland%2C_2023.jpg/1280px-A_cup_of_cappuccino_at_Miettes_Bakery%2C_Graceville%2C_Queensland%2C_2023.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/A_cup_of_cappuccino_at_Miettes_Bakery%2C_Graceville%2C_Queensland%2C_2023.jpg/480px-A_cup_of_cappuccino_at_Miettes_Bakery%2C_Graceville%2C_Queensland%2C_2023.jpg")
                    .description("Fotografia de Cappuccino.")
                    .build()
    ),

    LATTE_CAFE_PAO_QUENTE_PHOTO(
            DocumentFile.builder()
                    .title("Latte - Café Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Cup_of_coffee_with_latte_art_2016.jpg/1280px-Cup_of_coffee_with_latte_art_2016.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Cup_of_coffee_with_latte_art_2016.jpg/480px-Cup_of_coffee_with_latte_art_2016.jpg")
                    .description("Fotografia de Latte.")
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_CAFE_PAO_QUENTE_PHOTO(
            DocumentFile.builder()
                    .title("Fatia de Bolo de Chocolate - Café Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Baileys_Chocolate_Cake_-_Cafe_Coho_2026-01-08.jpg/1280px-Baileys_Chocolate_Cake_-_Cafe_Coho_2026-01-08.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Baileys_Chocolate_Cake_-_Cafe_Coho_2026-01-08.jpg/480px-Baileys_Chocolate_Cake_-_Cafe_Coho_2026-01-08.jpg")
                    .description("Fotografia de Fatia de Bolo de Chocolate.")
                    .build()
    ),

    SANDES_DE_ATUM_CAFE_PAO_QUENTE_PHOTO(
            DocumentFile.builder()
                    .title("Sandes de Atum - Café Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Plate%2C_Cape_Cod_Glass_Company%2C_c._1865%2C_cut_overlay_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08130.jpg/1280px-Plate%2C_Cape_Cod_Glass_Company%2C_c._1865%2C_cut_overlay_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08130.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Plate%2C_Cape_Cod_Glass_Company%2C_c._1865%2C_cut_overlay_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08130.jpg/480px-Plate%2C_Cape_Cod_Glass_Company%2C_c._1865%2C_cut_overlay_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08130.jpg")
                    .description("Fotografia de Sandes de Atum.")
                    .build()
    ),

    ESPRESSO_COFFEE_STOP_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Espresso - Coffee Stop Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Coffecup_Moscow_20180622.jpg/1280px-Coffecup_Moscow_20180622.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Coffecup_Moscow_20180622.jpg/480px-Coffecup_Moscow_20180622.jpg")
                    .description("Fotografia de Espresso.")
                    .build()
    ),

    CAPPUCCINO_COFFEE_STOP_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Cappuccino - Coffee Stop Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/A_cup_of_cappuccino_at_Regatta_Hotel.JPG/1280px-A_cup_of_cappuccino_at_Regatta_Hotel.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/A_cup_of_cappuccino_at_Regatta_Hotel.JPG/480px-A_cup_of_cappuccino_at_Regatta_Hotel.JPG")
                    .description("Fotografia de Cappuccino.")
                    .build()
    ),

    LATTE_COFFEE_STOP_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Latte - Coffee Stop Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Decaf_latte_-_Trading_Post_Coffee_Roasters_2025-03-09.jpg/1280px-Decaf_latte_-_Trading_Post_Coffee_Roasters_2025-03-09.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Decaf_latte_-_Trading_Post_Coffee_Roasters_2025-03-09.jpg/480px-Decaf_latte_-_Trading_Post_Coffee_Roasters_2025-03-09.jpg")
                    .description("Fotografia de Latte.")
                    .build()
    ),

    FATIA_DE_BOLO_DE_CHOCOLATE_COFFEE_STOP_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Fatia de Bolo de Chocolate - Coffee Stop Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Belgian_Chocolate_Fudge_Cake_-_Caff%C3%A8_Nero_2025-09-05.jpg/1280px-Belgian_Chocolate_Fudge_Cake_-_Caff%C3%A8_Nero_2025-09-05.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Belgian_Chocolate_Fudge_Cake_-_Caff%C3%A8_Nero_2025-09-05.jpg/480px-Belgian_Chocolate_Fudge_Cake_-_Caff%C3%A8_Nero_2025-09-05.jpg")
                    .description("Fotografia de Fatia de Bolo de Chocolate.")
                    .build()
    ),

    SANDES_DE_ATUM_COFFEE_STOP_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Sandes de Atum - Coffee Stop Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Plate%2C_attributed_to_the_Boston_%26_Sandwich_Glass_Company%2C_1828%2C_pressed_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08073.jpg/1280px-Plate%2C_attributed_to_the_Boston_%26_Sandwich_Glass_Company%2C_1828%2C_pressed_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08073.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Plate%2C_attributed_to_the_Boston_%26_Sandwich_Glass_Company%2C_1828%2C_pressed_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08073.jpg/480px-Plate%2C_attributed_to_the_Boston_%26_Sandwich_Glass_Company%2C_1828%2C_pressed_glass_-_Sandwich_Glass_Museum_-_Sandwich%2C_MA_-_DSC08073.jpg")
                    .description("Fotografia de Sandes de Atum.")
                    .build()
    ),

    CAIPIRINHA_BAR_222_PHOTO(
            DocumentFile.builder()
                    .title("Caipirinha - Bar 222")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/15-09-26-RalfR-WLC-0048.jpg/1280px-15-09-26-RalfR-WLC-0048.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/15-09-26-RalfR-WLC-0048.jpg/480px-15-09-26-RalfR-WLC-0048.jpg")
                    .description("Fotografia de Caipirinha.")
                    .build()
    ),

    GIN_TONICA_BAR_222_PHOTO(
            DocumentFile.builder()
                    .title("Gin & Tónica - Bar 222")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Beefeater_Zesty_Gin_%26_Tonic.jpg/1280px-Beefeater_Zesty_Gin_%26_Tonic.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Beefeater_Zesty_Gin_%26_Tonic.jpg/480px-Beefeater_Zesty_Gin_%26_Tonic.jpg")
                    .description("Fotografia de Gin & Tónica.")
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_222_PHOTO(
            DocumentFile.builder()
                    .title("Cerveja Artesanal - Bar 222")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/A_Butcher_Offering_a_Woman_a_Glass_of_Beer_%28SM_573%29.png/1280px-A_Butcher_Offering_a_Woman_a_Glass_of_Beer_%28SM_573%29.png")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/A_Butcher_Offering_a_Woman_a_Glass_of_Beer_%28SM_573%29.png/480px-A_Butcher_Offering_a_Woman_a_Glass_of_Beer_%28SM_573%29.png")
                    .description("Fotografia de Cerveja Artesanal.")
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_222_PHOTO(
            DocumentFile.builder()
                    .title("Petiscos do Dia - Bar 222")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Aceitunas_manzanilla_%28Espa%C3%B1a%29.jpg/1280px-Aceitunas_manzanilla_%28Espa%C3%B1a%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Aceitunas_manzanilla_%28Espa%C3%B1a%29.jpg/480px-Aceitunas_manzanilla_%28Espa%C3%B1a%29.jpg")
                    .description("Fotografia de Petiscos do Dia.")
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_222_PHOTO(
            DocumentFile.builder()
                    .title("Tapa de Camarão - Bar 222")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Karidesli_antre.jpg/1280px-Karidesli_antre.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Karidesli_antre.jpg/480px-Karidesli_antre.jpg")
                    .description("Fotografia de Tapa de Camarão.")
                    .build()
    ),

    CAIPIRINHA_BAR_TROPICAL_PHOTO(
            DocumentFile.builder()
                    .title("Caipirinha - Bar Tropical")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Caipirinha_%2811386811374%29.jpg/1280px-Caipirinha_%2811386811374%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Caipirinha_%2811386811374%29.jpg/480px-Caipirinha_%2811386811374%29.jpg")
                    .description("Fotografia de Caipirinha.")
                    .build()
    ),

    GIN_TONICA_BAR_TROPICAL_PHOTO(
            DocumentFile.builder()
                    .title("Gin & Tónica - Bar Tropical")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Crafter%27s_Gin_and_Tonic.jpg/1280px-Crafter%27s_Gin_and_Tonic.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Crafter%27s_Gin_and_Tonic.jpg/480px-Crafter%27s_Gin_and_Tonic.jpg")
                    .description("Fotografia de Gin & Tónica.")
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_TROPICAL_PHOTO(
            DocumentFile.builder()
                    .title("Cerveja Artesanal - Bar Tropical")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/A_glass_of_Stout_from_Cloudwater.jpg/1280px-A_glass_of_Stout_from_Cloudwater.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/A_glass_of_Stout_from_Cloudwater.jpg/480px-A_glass_of_Stout_from_Cloudwater.jpg")
                    .description("Fotografia de Cerveja Artesanal.")
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_TROPICAL_PHOTO(
            DocumentFile.builder()
                    .title("Petiscos do Dia - Bar Tropical")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Pinchos_de_tortilla_en_Barcelona.jpg/1280px-Pinchos_de_tortilla_en_Barcelona.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Pinchos_de_tortilla_en_Barcelona.jpg/480px-Pinchos_de_tortilla_en_Barcelona.jpg")
                    .description("Fotografia de Petiscos do Dia.")
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_TROPICAL_PHOTO(
            DocumentFile.builder()
                    .title("Tapa de Camarão - Bar Tropical")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Malwani_Chicken_Thali.jpg/1280px-Malwani_Chicken_Thali.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Malwani_Chicken_Thali.jpg/480px-Malwani_Chicken_Thali.jpg")
                    .description("Fotografia de Tapa de Camarão.")
                    .build()
    ),

    CAIPIRINHA_BAR_DO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Caipirinha - Bar do Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Caipirinha_and_Cacha%C3%A7a.jpg/1280px-Caipirinha_and_Cacha%C3%A7a.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Caipirinha_and_Cacha%C3%A7a.jpg/480px-Caipirinha_and_Cacha%C3%A7a.jpg")
                    .description("Fotografia de Caipirinha.")
                    .build()
    ),

    GIN_TONICA_BAR_DO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Gin & Tónica - Bar do Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Crafter%27s_Gin_and_Tonic_on_a_balcony.jpg/1280px-Crafter%27s_Gin_and_Tonic_on_a_balcony.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Crafter%27s_Gin_and_Tonic_on_a_balcony.jpg/480px-Crafter%27s_Gin_and_Tonic_on_a_balcony.jpg")
                    .description("Fotografia de Gin & Tónica.")
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_DO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Cerveja Artesanal - Bar do Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/BFB2_DSCN4836.jpg/1280px-BFB2_DSCN4836.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/BFB2_DSCN4836.jpg/480px-BFB2_DSCN4836.jpg")
                    .description("Fotografia de Cerveja Artesanal.")
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_DO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Petiscos do Dia - Bar do Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Tapa_aceitunas.JPG/1280px-Tapa_aceitunas.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Tapa_aceitunas.JPG/480px-Tapa_aceitunas.JPG")
                    .description("Fotografia de Petiscos do Dia.")
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_DO_KIZUA_PHOTO(
            DocumentFile.builder()
                    .title("Tapa de Camarão - Bar do Kizua")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Seafood_salad_with_onions_and_coriander%2C_from_Turkey.jpg/1280px-Seafood_salad_with_onions_and_coriander%2C_from_Turkey.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Seafood_salad_with_onions_and_coriander%2C_from_Turkey.jpg/480px-Seafood_salad_with_onions_and_coriander%2C_from_Turkey.jpg")
                    .description("Fotografia de Tapa de Camarão.")
                    .build()
    ),

    CAIPIRINHA_PUB_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Caipirinha - Pub Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Caipirinha_in_the_cocktail_shaker.jpg/1280px-Caipirinha_in_the_cocktail_shaker.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Caipirinha_in_the_cocktail_shaker.jpg/480px-Caipirinha_in_the_cocktail_shaker.jpg")
                    .description("Fotografia de Caipirinha.")
                    .build()
    ),

    GIN_TONICA_PUB_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Gin & Tónica - Pub Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Gin_%26_tonic_from_Crafters_Aromatic_Flower_Gin.jpg/1280px-Gin_%26_tonic_from_Crafters_Aromatic_Flower_Gin.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Gin_%26_tonic_from_Crafters_Aromatic_Flower_Gin.jpg/480px-Gin_%26_tonic_from_Crafters_Aromatic_Flower_Gin.jpg")
                    .description("Fotografia de Gin & Tónica.")
                    .build()
    ),

    CERVEJA_ARTESANAL_PUB_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Cerveja Artesanal - Pub Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Bottle_share_at_Pop%27n%27Hops%2C_Cardiff.jpg/1280px-Bottle_share_at_Pop%27n%27Hops%2C_Cardiff.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Bottle_share_at_Pop%27n%27Hops%2C_Cardiff.jpg/480px-Bottle_share_at_Pop%27n%27Hops%2C_Cardiff.jpg")
                    .description("Fotografia de Cerveja Artesanal.")
                    .build()
    ),

    PETISCOS_DO_DIA_PUB_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Petiscos do Dia - Pub Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Tapas_2012_094_Pulpitos.jpg/1280px-Tapas_2012_094_Pulpitos.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Tapas_2012_094_Pulpitos.jpg/480px-Tapas_2012_094_Pulpitos.jpg")
                    .description("Fotografia de Petiscos do Dia.")
                    .build()
    ),

    TAPA_DE_CAMARAO_PUB_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Tapa de Camarão - Pub Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/Shrimp_Appetizer.jpg/1280px-Shrimp_Appetizer.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/Shrimp_Appetizer.jpg/480px-Shrimp_Appetizer.jpg")
                    .description("Fotografia de Tapa de Camarão.")
                    .build()
    ),

    CAIPIRINHA_BAR_ESQUINA_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Caipirinha - Bar Esquina do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Caipirinha_2.jpg/1280px-Caipirinha_2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Caipirinha_2.jpg/480px-Caipirinha_2.jpg")
                    .description("Fotografia de Caipirinha.")
                    .build()
    ),

    GIN_TONICA_BAR_ESQUINA_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Gin & Tónica - Bar Esquina do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Gin_and_Tonic%2C_Howrah%2C_West_Bengal.jpg/1280px-Gin_and_Tonic%2C_Howrah%2C_West_Bengal.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Gin_and_Tonic%2C_Howrah%2C_West_Bengal.jpg/480px-Gin_and_Tonic%2C_Howrah%2C_West_Bengal.jpg")
                    .description("Fotografia de Gin & Tónica.")
                    .build()
    ),

    CERVEJA_ARTESANAL_BAR_ESQUINA_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Cerveja Artesanal - Bar Esquina do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Craft_beer_and_non-alcoholic_cocktail_at_restaurant_Plaza.jpg/1280px-Craft_beer_and_non-alcoholic_cocktail_at_restaurant_Plaza.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Craft_beer_and_non-alcoholic_cocktail_at_restaurant_Plaza.jpg/480px-Craft_beer_and_non-alcoholic_cocktail_at_restaurant_Plaza.jpg")
                    .description("Fotografia de Cerveja Artesanal.")
                    .build()
    ),

    PETISCOS_DO_DIA_BAR_ESQUINA_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Petiscos do Dia - Bar Esquina do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Tapas_Factory_Lindemannstra%C3%9Fe%2C_Dortmund.jpg/1280px-Tapas_Factory_Lindemannstra%C3%9Fe%2C_Dortmund.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Tapas_Factory_Lindemannstra%C3%9Fe%2C_Dortmund.jpg/480px-Tapas_Factory_Lindemannstra%C3%9Fe%2C_Dortmund.jpg")
                    .description("Fotografia de Petiscos do Dia.")
                    .build()
    ),

    TAPA_DE_CAMARAO_BAR_ESQUINA_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Tapa de Camarão - Bar Esquina do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Starter_dish_in_Turkey.jpg/1280px-Starter_dish_in_Turkey.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Starter_dish_in_Turkey.jpg/480px-Starter_dish_in_Turkey.jpg")
                    .description("Fotografia de Tapa de Camarão.")
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Buffet por Quilograma - Self-Service Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Buffet_lunch%2C_naan_and_salad_at_restaurant_Keitti%C3%B6mestari_in_November_2025.jpg/1280px-Buffet_lunch%2C_naan_and_salad_at_restaurant_Keitti%C3%B6mestari_in_November_2025.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Buffet_lunch%2C_naan_and_salad_at_restaurant_Keitti%C3%B6mestari_in_November_2025.jpg/480px-Buffet_lunch%2C_naan_and_salad_at_restaurant_Keitti%C3%B6mestari_in_November_2025.jpg")
                    .description("Fotografia de Buffet por Quilograma.")
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Prato do Dia Self-Service - Self-Service Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Chocolate_cake_and_tea_service.jpg/1280px-Chocolate_cake_and_tea_service.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Chocolate_cake_and_tea_service.jpg/480px-Chocolate_cake_and_tea_service.jpg")
                    .description("Fotografia de Prato do Dia Self-Service.")
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Sopa do Dia - Self-Service Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Argentine_Homemade_Vegetable_Soup.jpg/1280px-Argentine_Homemade_Vegetable_Soup.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Argentine_Homemade_Vegetable_Soup.jpg/480px-Argentine_Homemade_Vegetable_Soup.jpg")
                    .description("Fotografia de Sopa do Dia.")
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Salada do Buffet - Self-Service Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Circus_Circus_Reno_Buffet.jpg/1280px-Circus_Circus_Reno_Buffet.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Circus_Circus_Reno_Buffet.jpg/480px-Circus_Circus_Reno_Buffet.jpg")
                    .description("Fotografia de Salada do Buffet.")
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Sobremesa do Buffet - Self-Service Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/A_dessert_at_Windjammer_Buffet.jpg/1280px-A_dessert_at_Windjammer_Buffet.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/A_dessert_at_Windjammer_Buffet.jpg/480px-A_dessert_at_Windjammer_Buffet.jpg")
                    .description("Fotografia de Sobremesa do Buffet.")
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_ZE_PHOTO(
            DocumentFile.builder()
                    .title("Buffet por Quilograma - Self-Service do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Buffet_lunch%2C_salad_and_bread_at_Antell_Martintalo_in_November_2022.jpg/1280px-Buffet_lunch%2C_salad_and_bread_at_Antell_Martintalo_in_November_2022.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Buffet_lunch%2C_salad_and_bread_at_Antell_Martintalo_in_November_2022.jpg/480px-Buffet_lunch%2C_salad_and_bread_at_Antell_Martintalo_in_November_2022.jpg")
                    .description("Fotografia de Buffet por Quilograma.")
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_ZE_PHOTO(
            DocumentFile.builder()
                    .title("Prato do Dia Self-Service - Self-Service do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Food_was_bad_silent_service_code.jpg/1280px-Food_was_bad_silent_service_code.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Food_was_bad_silent_service_code.jpg/480px-Food_was_bad_silent_service_code.jpg")
                    .description("Fotografia de Prato do Dia Self-Service.")
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_DO_ZE_PHOTO(
            DocumentFile.builder()
                    .title("Sopa do Dia - Self-Service do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Bowl_of_beef_soup%2C_01.jpg/1280px-Bowl_of_beef_soup%2C_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Bowl_of_beef_soup%2C_01.jpg/480px-Bowl_of_beef_soup%2C_01.jpg")
                    .description("Fotografia de Sopa do Dia.")
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_DO_ZE_PHOTO(
            DocumentFile.builder()
                    .title("Salada do Buffet - Self-Service do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Club_60_Supper_Club_Salad_Bar.jpg/1280px-Club_60_Supper_Club_Salad_Bar.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Club_60_Supper_Club_Salad_Bar.jpg/480px-Club_60_Supper_Club_Salad_Bar.jpg")
                    .description("Fotografia de Salada do Buffet.")
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_ZE_PHOTO(
            DocumentFile.builder()
                    .title("Sobremesa do Buffet - Self-Service do Zé")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Bacchanal_Buffet_-_1.jpg/1280px-Bacchanal_Buffet_-_1.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Bacchanal_Buffet_-_1.jpg/480px-Bacchanal_Buffet_-_1.jpg")
                    .description("Fotografia de Sobremesa do Buffet.")
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Buffet por Quilograma - Self-Service Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Buffet_lunch_and_soup_at_Fazer_F8_in_July_2023.jpg/1280px-Buffet_lunch_and_soup_at_Fazer_F8_in_July_2023.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Buffet_lunch_and_soup_at_Fazer_F8_in_July_2023.jpg/480px-Buffet_lunch_and_soup_at_Fazer_F8_in_July_2023.jpg")
                    .description("Fotografia de Buffet por Quilograma.")
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Prato do Dia Self-Service - Self-Service Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Grow_Your_Own_Food_Art.IWMPST2893.jpg/1280px-Grow_Your_Own_Food_Art.IWMPST2893.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Grow_Your_Own_Food_Art.IWMPST2893.jpg/480px-Grow_Your_Own_Food_Art.IWMPST2893.jpg")
                    .description("Fotografia de Prato do Dia Self-Service.")
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Sopa do Dia - Self-Service Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Bowl_of_beef_soup%2C_02.jpg/1280px-Bowl_of_beef_soup%2C_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Bowl_of_beef_soup%2C_02.jpg/480px-Bowl_of_beef_soup%2C_02.jpg")
                    .description("Fotografia de Sopa do Dia.")
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Salada do Buffet - Self-Service Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Frankfurt%2C_Germany_-_REWE_salad_bar_1.jpg/1280px-Frankfurt%2C_Germany_-_REWE_salad_bar_1.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Frankfurt%2C_Germany_-_REWE_salad_bar_1.jpg/480px-Frankfurt%2C_Germany_-_REWE_salad_bar_1.jpg")
                    .description("Fotografia de Salada do Buffet.")
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Sobremesa do Buffet - Self-Service Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Bacchanal_Buffet_at_Caesars_Palace.jpg/1280px-Bacchanal_Buffet_at_Caesars_Palace.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Bacchanal_Buffet_at_Caesars_Palace.jpg/480px-Bacchanal_Buffet_at_Caesars_Palace.jpg")
                    .description("Fotografia de Sobremesa do Buffet.")
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_CENTRAL_PHOTO(
            DocumentFile.builder()
                    .title("Buffet por Quilograma - Self-Service Central")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Buffet_lunch_at_Antell_Martintalo_in_August_2022.jpg/1280px-Buffet_lunch_at_Antell_Martintalo_in_August_2022.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Buffet_lunch_at_Antell_Martintalo_in_August_2022.jpg/480px-Buffet_lunch_at_Antell_Martintalo_in_August_2022.jpg")
                    .description("Fotografia de Buffet por Quilograma.")
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_CENTRAL_PHOTO(
            DocumentFile.builder()
                    .title("Prato do Dia Self-Service - Self-Service Central")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Kekse_--_2021_--_9362.jpg/1280px-Kekse_--_2021_--_9362.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Kekse_--_2021_--_9362.jpg/480px-Kekse_--_2021_--_9362.jpg")
                    .description("Fotografia de Prato do Dia Self-Service.")
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_CENTRAL_PHOTO(
            DocumentFile.builder()
                    .title("Sopa do Dia - Self-Service Central")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Bowl_of_beef_soup%2C_03.jpg/1280px-Bowl_of_beef_soup%2C_03.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Bowl_of_beef_soup%2C_03.jpg/480px-Bowl_of_beef_soup%2C_03.jpg")
                    .description("Fotografia de Sopa do Dia.")
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_CENTRAL_PHOTO(
            DocumentFile.builder()
                    .title("Salada do Buffet - Self-Service Central")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Frankfurt%2C_Germany_-_REWE_salad_bar_2.jpg/1280px-Frankfurt%2C_Germany_-_REWE_salad_bar_2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Frankfurt%2C_Germany_-_REWE_salad_bar_2.jpg/480px-Frankfurt%2C_Germany_-_REWE_salad_bar_2.jpg")
                    .description("Fotografia de Salada do Buffet.")
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_CENTRAL_PHOTO(
            DocumentFile.builder()
                    .title("Sobremesa do Buffet - Self-Service Central")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Buffet_lunch_and_dessert_at_restaurant_S%C3%A4vel.jpg/1280px-Buffet_lunch_and_dessert_at_restaurant_S%C3%A4vel.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Buffet_lunch_and_dessert_at_restaurant_S%C3%A4vel.jpg/480px-Buffet_lunch_and_dessert_at_restaurant_S%C3%A4vel.jpg")
                    .description("Fotografia de Sobremesa do Buffet.")
                    .build()
    ),

    BUFFET_POR_QUILOGRAMA_SELF_SERVICE_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Buffet por Quilograma - Self-Service do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Buffet_lunch_at_Antell_Martintalo_in_December_2023_close_up.jpg/1280px-Buffet_lunch_at_Antell_Martintalo_in_December_2023_close_up.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Buffet_lunch_at_Antell_Martintalo_in_December_2023_close_up.jpg/480px-Buffet_lunch_at_Antell_Martintalo_in_December_2023_close_up.jpg")
                    .description("Fotografia de Buffet por Quilograma.")
                    .build()
    ),

    PRATO_DO_DIA_SELF_SERVICE_SELF_SERVICE_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Prato do Dia Self-Service - Self-Service do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Meal_at_a_Swedish_X2000_train_from_Lund_to_Stockholm_in_September_2024.jpg/1280px-Meal_at_a_Swedish_X2000_train_from_Lund_to_Stockholm_in_September_2024.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Meal_at_a_Swedish_X2000_train_from_Lund_to_Stockholm_in_September_2024.jpg/480px-Meal_at_a_Swedish_X2000_train_from_Lund_to_Stockholm_in_September_2024.jpg")
                    .description("Fotografia de Prato do Dia Self-Service.")
                    .build()
    ),

    SOPA_DO_DIA_SELF_SERVICE_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Sopa do Dia - Self-Service do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Bowl_of_beef_soup%2C_04.jpg/1280px-Bowl_of_beef_soup%2C_04.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Bowl_of_beef_soup%2C_04.jpg/480px-Bowl_of_beef_soup%2C_04.jpg")
                    .description("Fotografia de Sopa do Dia.")
                    .build()
    ),

    SALADA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Salada do Buffet - Self-Service do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Green_Salad_Bar_Corner_in_Clipper_Lounge.jpg/1280px-Green_Salad_Bar_Corner_in_Clipper_Lounge.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Green_Salad_Bar_Corner_in_Clipper_Lounge.jpg/480px-Green_Salad_Bar_Corner_in_Clipper_Lounge.jpg")
                    .description("Fotografia de Salada do Buffet.")
                    .build()
    ),

    SOBREMESA_DO_BUFFET_SELF_SERVICE_DO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Sobremesa do Buffet - Self-Service do Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/DSC00631_The_Buffet_at_Bellagio.jpg/1280px-DSC00631_The_Buffet_at_Bellagio.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/DSC00631_The_Buffet_at_Bellagio.jpg/480px-DSC00631_The_Buffet_at_Bellagio.jpg")
                    .description("Fotografia de Sobremesa do Buffet.")
                    .build()
    ),

    SALADA_DE_QUINOA_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO(
            DocumentFile.builder()
                    .title("Salada de Quinoa - Restaurante Vegetariano Raízes")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Healthy_quinoa_salad_with_dried_fruit.jpg/1280px-Healthy_quinoa_salad_with_dried_fruit.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Healthy_quinoa_salad_with_dried_fruit.jpg/480px-Healthy_quinoa_salad_with_dried_fruit.jpg")
                    .description("Fotografia de Salada de Quinoa.")
                    .build()
    ),

    TOFU_GRELHADO_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO(
            DocumentFile.builder()
                    .title("Tofu Grelhado - Restaurante Vegetariano Raízes")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Citrus-Tahini_Bowl_with_Grilled_Tofu_%26_Bok_Choy_%2813431238424%29.jpg/1280px-Citrus-Tahini_Bowl_with_Grilled_Tofu_%26_Bok_Choy_%2813431238424%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Citrus-Tahini_Bowl_with_Grilled_Tofu_%26_Bok_Choy_%2813431238424%29.jpg/480px-Citrus-Tahini_Bowl_with_Grilled_Tofu_%26_Bok_Choy_%2813431238424%29.jpg")
                    .description("Fotografia de Tofu Grelhado.")
                    .build()
    ),

    LEGUMES_ASSADOS_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO(
            DocumentFile.builder()
                    .title("Legumes Assados - Restaurante Vegetariano Raízes")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c6/DFC_1025_A_plate_of_grilled_sausage_skewers_with_roasted_vegetables_golden_fries_and_a_side_of_coleslaw_with_dipping_sauce.jpg/1280px-DFC_1025_A_plate_of_grilled_sausage_skewers_with_roasted_vegetables_golden_fries_and_a_side_of_coleslaw_with_dipping_sauce.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c6/DFC_1025_A_plate_of_grilled_sausage_skewers_with_roasted_vegetables_golden_fries_and_a_side_of_coleslaw_with_dipping_sauce.jpg/480px-DFC_1025_A_plate_of_grilled_sausage_skewers_with_roasted_vegetables_golden_fries_and_a_side_of_coleslaw_with_dipping_sauce.jpg")
                    .description("Fotografia de Legumes Assados.")
                    .build()
    ),

    BOWL_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO(
            DocumentFile.builder()
                    .title("Bowl de Legumes - Restaurante Vegetariano Raízes")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Alice_Muth_%281887-1952%29_in_The_Commercial_Appeal_of_Memphis%2C_Tennessee_on_October_4%2C_1946%2C_part_1.jpg/1280px-Alice_Muth_%281887-1952%29_in_The_Commercial_Appeal_of_Memphis%2C_Tennessee_on_October_4%2C_1946%2C_part_1.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Alice_Muth_%281887-1952%29_in_The_Commercial_Appeal_of_Memphis%2C_Tennessee_on_October_4%2C_1946%2C_part_1.jpg/480px-Alice_Muth_%281887-1952%29_in_The_Commercial_Appeal_of_Memphis%2C_Tennessee_on_October_4%2C_1946%2C_part_1.jpg")
                    .description("Fotografia de Bowl de Legumes.")
                    .build()
    ),

    CURRY_DE_LEGUMES_RESTAURANTE_VEGETARIANO_RAIZES_PHOTO(
            DocumentFile.builder()
                    .title("Curry de Legumes - Restaurante Vegetariano Raízes")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Aunt_Yoke_Ling%27s_Vegetable_Curry_%282874458745%29.jpg/1280px-Aunt_Yoke_Ling%27s_Vegetable_Curry_%282874458745%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Aunt_Yoke_Ling%27s_Vegetable_Curry_%282874458745%29.jpg/480px-Aunt_Yoke_Ling%27s_Vegetable_Curry_%282874458745%29.jpg")
                    .description("Fotografia de Curry de Legumes.")
                    .build()
    ),

    SALADA_DE_QUINOA_VEGGIE_HOUSE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Salada de Quinoa - Veggie House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Liat_Portal_for_Foodie_Disorder_-_Quinoa%2C_Schnitzel_and_Israeli_Salad.jpg/1280px-Liat_Portal_for_Foodie_Disorder_-_Quinoa%2C_Schnitzel_and_Israeli_Salad.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Liat_Portal_for_Foodie_Disorder_-_Quinoa%2C_Schnitzel_and_Israeli_Salad.jpg/480px-Liat_Portal_for_Foodie_Disorder_-_Quinoa%2C_Schnitzel_and_Israeli_Salad.jpg")
                    .description("Fotografia de Salada de Quinoa.")
                    .build()
    ),

    TOFU_GRELHADO_VEGGIE_HOUSE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Tofu Grelhado - Veggie House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/DFC_3935_Skewered_street-food_assortment_-_grilled_meatballs_tofu_cubes_and_sausages_brushed_with_savory_sauce_and_garnished_with_fresh_cilantro.jpg/1280px-DFC_3935_Skewered_street-food_assortment_-_grilled_meatballs_tofu_cubes_and_sausages_brushed_with_savory_sauce_and_garnished_with_fresh_cilantro.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/DFC_3935_Skewered_street-food_assortment_-_grilled_meatballs_tofu_cubes_and_sausages_brushed_with_savory_sauce_and_garnished_with_fresh_cilantro.jpg/480px-DFC_3935_Skewered_street-food_assortment_-_grilled_meatballs_tofu_cubes_and_sausages_brushed_with_savory_sauce_and_garnished_with_fresh_cilantro.jpg")
                    .description("Fotografia de Tofu Grelhado.")
                    .build()
    ),

    LEGUMES_ASSADOS_VEGGIE_HOUSE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Legumes Assados - Veggie House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Egusi_soup_with_vegetables_and_dried_catfish%2C_prawns%2C_beef_and_roasted_cowskin.jpg/1280px-Egusi_soup_with_vegetables_and_dried_catfish%2C_prawns%2C_beef_and_roasted_cowskin.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Egusi_soup_with_vegetables_and_dried_catfish%2C_prawns%2C_beef_and_roasted_cowskin.jpg/480px-Egusi_soup_with_vegetables_and_dried_catfish%2C_prawns%2C_beef_and_roasted_cowskin.jpg")
                    .description("Fotografia de Legumes Assados.")
                    .build()
    ),

    BOWL_DE_LEGUMES_VEGGIE_HOUSE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Bowl de Legumes - Veggie House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Asan_Tole_%2817211215463%29.jpg/1280px-Asan_Tole_%2817211215463%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Asan_Tole_%2817211215463%29.jpg/480px-Asan_Tole_%2817211215463%29.jpg")
                    .description("Fotografia de Bowl de Legumes.")
                    .build()
    ),

    CURRY_DE_LEGUMES_VEGGIE_HOUSE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Curry de Legumes - Veggie House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Bhaji_pav_2.jpg/1280px-Bhaji_pav_2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Bhaji_pav_2.jpg/480px-Bhaji_pav_2.jpg")
                    .description("Fotografia de Curry de Legumes.")
                    .build()
    ),

    SALADA_DE_QUINOA_COZINHA_VERDE_PHOTO(
            DocumentFile.builder()
                    .title("Salada de Quinoa - Cozinha Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Grilled_Brie_with_Ginger_Horseradish_Baste_%26_Fruit_Nut_ToFu_Honey_Drizzle_Yogurt_%26_Bugles_%28147934104%29.jpg/1280px-Grilled_Brie_with_Ginger_Horseradish_Baste_%26_Fruit_Nut_ToFu_Honey_Drizzle_Yogurt_%26_Bugles_%28147934104%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Grilled_Brie_with_Ginger_Horseradish_Baste_%26_Fruit_Nut_ToFu_Honey_Drizzle_Yogurt_%26_Bugles_%28147934104%29.jpg/480px-Grilled_Brie_with_Ginger_Horseradish_Baste_%26_Fruit_Nut_ToFu_Honey_Drizzle_Yogurt_%26_Bugles_%28147934104%29.jpg")
                    .description("Fotografia de Salada de Quinoa.")
                    .build()
    ),

    TOFU_GRELHADO_COZINHA_VERDE_PHOTO(
            DocumentFile.builder()
                    .title("Tofu Grelhado - Cozinha Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Grilled_Tofu_Bars.jpg/1280px-Grilled_Tofu_Bars.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Grilled_Tofu_Bars.jpg/480px-Grilled_Tofu_Bars.jpg")
                    .description("Fotografia de Tofu Grelhado.")
                    .build()
    ),

    LEGUMES_ASSADOS_COZINHA_VERDE_PHOTO(
            DocumentFile.builder()
                    .title("Legumes Assados - Cozinha Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Horka_Litinova_Panev_Tofu_Zlaty_Klas_2025.jpg/1280px-Horka_Litinova_Panev_Tofu_Zlaty_Klas_2025.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Horka_Litinova_Panev_Tofu_Zlaty_Klas_2025.jpg/480px-Horka_Litinova_Panev_Tofu_Zlaty_Klas_2025.jpg")
                    .description("Fotografia de Legumes Assados.")
                    .build()
    ),

    BOWL_DE_LEGUMES_COZINHA_VERDE_PHOTO(
            DocumentFile.builder()
                    .title("Bowl de Legumes - Cozinha Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Liat_Portal_for_Foodie_Disorder_-_Roasted_chicken_with_cauliflower_broccoli_potatoes_rice_and_salad.jpg/1280px-Liat_Portal_for_Foodie_Disorder_-_Roasted_chicken_with_cauliflower_broccoli_potatoes_rice_and_salad.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Liat_Portal_for_Foodie_Disorder_-_Roasted_chicken_with_cauliflower_broccoli_potatoes_rice_and_salad.jpg/480px-Liat_Portal_for_Foodie_Disorder_-_Roasted_chicken_with_cauliflower_broccoli_potatoes_rice_and_salad.jpg")
                    .description("Fotografia de Bowl de Legumes.")
                    .build()
    ),

    CURRY_DE_LEGUMES_COZINHA_VERDE_PHOTO(
            DocumentFile.builder()
                    .title("Curry de Legumes - Cozinha Verde")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Cabbage_with_Potatoes_Curry_-_Kolkata_2011-03-05_1911.JPG/1280px-Cabbage_with_Potatoes_Curry_-_Kolkata_2011-03-05_1911.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Cabbage_with_Potatoes_Curry_-_Kolkata_2011-03-05_1911.JPG/480px-Cabbage_with_Potatoes_Curry_-_Kolkata_2011-03-05_1911.JPG")
                    .description("Fotografia de Curry de Legumes.")
                    .build()
    ),

    SALADA_DE_QUINOA_BI_VEGETARIANO_PHOTO(
            DocumentFile.builder()
                    .title("Salada de Quinoa - Bi Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Grilled_tofu_vegetariana_arepa_with_sweet_plantains%2C_black_beans%2C_ajo_alio%2C_avocado.jpg/1280px-Grilled_tofu_vegetariana_arepa_with_sweet_plantains%2C_black_beans%2C_ajo_alio%2C_avocado.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Grilled_tofu_vegetariana_arepa_with_sweet_plantains%2C_black_beans%2C_ajo_alio%2C_avocado.jpg/480px-Grilled_tofu_vegetariana_arepa_with_sweet_plantains%2C_black_beans%2C_ajo_alio%2C_avocado.jpg")
                    .description("Fotografia de Salada de Quinoa.")
                    .build()
    ),

    TOFU_GRELHADO_BI_VEGETARIANO_PHOTO(
            DocumentFile.builder()
                    .title("Tofu Grelhado - Bi Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Grilled_tofu_with_steamed_chard_and_spicy_mango_sauce_%283252903983%29.jpg/1280px-Grilled_tofu_with_steamed_chard_and_spicy_mango_sauce_%283252903983%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Grilled_tofu_with_steamed_chard_and_spicy_mango_sauce_%283252903983%29.jpg/480px-Grilled_tofu_with_steamed_chard_and_spicy_mango_sauce_%283252903983%29.jpg")
                    .description("Fotografia de Tofu Grelhado.")
                    .build()
    ),

    LEGUMES_ASSADOS_BI_VEGETARIANO_PHOTO(
            DocumentFile.builder()
                    .title("Legumes Assados - Bi Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Liat_Portal_for_Foodie_Disorder_-_Grilled_Chicken_with_Roasted_Vegetables.jpg/1280px-Liat_Portal_for_Foodie_Disorder_-_Grilled_Chicken_with_Roasted_Vegetables.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Liat_Portal_for_Foodie_Disorder_-_Grilled_Chicken_with_Roasted_Vegetables.jpg/480px-Liat_Portal_for_Foodie_Disorder_-_Grilled_Chicken_with_Roasted_Vegetables.jpg")
                    .description("Fotografia de Legumes Assados.")
                    .build()
    ),

    BOWL_DE_LEGUMES_BI_VEGETARIANO_PHOTO(
            DocumentFile.builder()
                    .title("Bowl de Legumes - Bi Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Manns%27_superior_seeds_%2815767651344%29.jpg/1280px-Manns%27_superior_seeds_%2815767651344%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Manns%27_superior_seeds_%2815767651344%29.jpg/480px-Manns%27_superior_seeds_%2815767651344%29.jpg")
                    .description("Fotografia de Bowl de Legumes.")
                    .build()
    ),

    CURRY_DE_LEGUMES_BI_VEGETARIANO_PHOTO(
            DocumentFile.builder()
                    .title("Curry de Legumes - Bi Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Marlar_hin_%28garland_dish%29.jpg/1280px-Marlar_hin_%28garland_dish%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Marlar_hin_%28garland_dish%29.jpg/480px-Marlar_hin_%28garland_dish%29.jpg")
                    .description("Fotografia de Curry de Legumes.")
                    .build()
    ),

    SALADA_DE_QUINOA_SABOR_VEGETARIANO_PHOTO(
            DocumentFile.builder()
                    .title("Salada de Quinoa - Sabor Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Tofu_Benedict_-_Moksha_Caff%C3%A8_2026-05-03.jpg/1280px-Tofu_Benedict_-_Moksha_Caff%C3%A8_2026-05-03.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Tofu_Benedict_-_Moksha_Caff%C3%A8_2026-05-03.jpg/480px-Tofu_Benedict_-_Moksha_Caff%C3%A8_2026-05-03.jpg")
                    .description("Fotografia de Salada de Quinoa.")
                    .build()
    ),

    TOFU_GRELHADO_SABOR_VEGETARIANO_PHOTO(
            DocumentFile.builder()
                    .title("Tofu Grelhado - Sabor Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Grilled_Veggie_Tofu_Paneer_Sandwich_with_Mango_Chutney_%284918261643%29.jpg/1280px-Grilled_Veggie_Tofu_Paneer_Sandwich_with_Mango_Chutney_%284918261643%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Grilled_Veggie_Tofu_Paneer_Sandwich_with_Mango_Chutney_%284918261643%29.jpg/480px-Grilled_Veggie_Tofu_Paneer_Sandwich_with_Mango_Chutney_%284918261643%29.jpg")
                    .description("Fotografia de Tofu Grelhado.")
                    .build()
    ),

    LEGUMES_ASSADOS_SABOR_VEGETARIANO_PHOTO(
            DocumentFile.builder()
                    .title("Legumes Assados - Sabor Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Liat_Portal_for_Foodie_Disorder_-_Home_Cooked_Chicken_and_Roasted_Vegetables.jpg/1280px-Liat_Portal_for_Foodie_Disorder_-_Home_Cooked_Chicken_and_Roasted_Vegetables.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Liat_Portal_for_Foodie_Disorder_-_Home_Cooked_Chicken_and_Roasted_Vegetables.jpg/480px-Liat_Portal_for_Foodie_Disorder_-_Home_Cooked_Chicken_and_Roasted_Vegetables.jpg")
                    .description("Fotografia de Legumes Assados.")
                    .build()
    ),

    BOWL_DE_LEGUMES_SABOR_VEGETARIANO_PHOTO(
            DocumentFile.builder()
                    .title("Bowl de Legumes - Sabor Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Mother_Earth%27s_Children_p.67.jpg/1280px-Mother_Earth%27s_Children_p.67.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Mother_Earth%27s_Children_p.67.jpg/480px-Mother_Earth%27s_Children_p.67.jpg")
                    .description("Fotografia de Bowl de Legumes.")
                    .build()
    ),

    CURRY_DE_LEGUMES_SABOR_VEGETARIANO_PHOTO(
            DocumentFile.builder()
                    .title("Curry de Legumes - Sabor Vegetariano")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Midnight_curry_emits_great_aroma_and_ready_to_eat.jpg/1280px-Midnight_curry_emits_great_aroma_and_ready_to_eat.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Midnight_curry_emits_great_aroma_and_ready_to_eat.jpg/480px-Midnight_curry_emits_great_aroma_and_ready_to_eat.jpg")
                    .description("Fotografia de Curry de Legumes.")
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_PAO_QUENTE_PHOTO(
            DocumentFile.builder()
                    .title("Pão de Forma - Padaria Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Beer_bread_-_loaf_sliced_in_half.jpg/1280px-Beer_bread_-_loaf_sliced_in_half.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Beer_bread_-_loaf_sliced_in_half.jpg/480px-Beer_bread_-_loaf_sliced_in_half.jpg")
                    .description("Fotografia de Pão de Forma.")
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_PAO_QUENTE_PHOTO(
            DocumentFile.builder()
                    .title("Croissant de Manteiga - Padaria Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/20231022_101836_Croissant_supr%C3%AAme.jpg/1280px-20231022_101836_Croissant_supr%C3%AAme.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/20231022_101836_Croissant_supr%C3%AAme.jpg/480px-20231022_101836_Croissant_supr%C3%AAme.jpg")
                    .description("Fotografia de Croissant de Manteiga.")
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_PAO_QUENTE_PHOTO(
            DocumentFile.builder()
                    .title("Pastel de Nata - Padaria Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/A_cup_of_Ovaltine_a_piece_of_egg_tart_and_coconut_tart.jpg/1280px-A_cup_of_Ovaltine_a_piece_of_egg_tart_and_coconut_tart.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/A_cup_of_Ovaltine_a_piece_of_egg_tart_and_coconut_tart.jpg/480px-A_cup_of_Ovaltine_a_piece_of_egg_tart_and_coconut_tart.jpg")
                    .description("Fotografia de Pastel de Nata.")
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_PAO_QUENTE_PHOTO(
            DocumentFile.builder()
                    .title("Bolo de Chocolate - Padaria Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/BAILEYS_CHOCOLATE_CAKE_-_Trading_Post_Coffee_Roasters_2025-11-25.jpg/1280px-BAILEYS_CHOCOLATE_CAKE_-_Trading_Post_Coffee_Roasters_2025-11-25.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/BAILEYS_CHOCOLATE_CAKE_-_Trading_Post_Coffee_Roasters_2025-11-25.jpg/480px-BAILEYS_CHOCOLATE_CAKE_-_Trading_Post_Coffee_Roasters_2025-11-25.jpg")
                    .description("Fotografia de Bolo de Chocolate.")
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_PAO_QUENTE_PHOTO(
            DocumentFile.builder()
                    .title("Pão Doce Tradicional - Padaria Pão Quente")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Baker_Beach_2.jpg/1280px-Baker_Beach_2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Baker_Beach_2.jpg/480px-Baker_Beach_2.jpg")
                    .description("Fotografia de Pão Doce Tradicional.")
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Pão de Forma - Padaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Bread_in_red_bowl_atop_easter_eggs_and_loaf_of_bread_in_background.jpg/1280px-Bread_in_red_bowl_atop_easter_eggs_and_loaf_of_bread_in_background.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Bread_in_red_bowl_atop_easter_eggs_and_loaf_of_bread_in_background.jpg/480px-Bread_in_red_bowl_atop_easter_eggs_and_loaf_of_bread_in_background.jpg")
                    .description("Fotografia de Pão de Forma.")
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Croissant de Manteiga - Padaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Baklava_croissant.jpg/1280px-Baklava_croissant.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Baklava_croissant.jpg/480px-Baklava_croissant.jpg")
                    .description("Fotografia de Croissant de Manteiga.")
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Pastel de Nata - Padaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Apple_Crumble_%26_Custard_Tart_-_Caff%C3%A8_Nero_2025-09-14.jpg/1280px-Apple_Crumble_%26_Custard_Tart_-_Caff%C3%A8_Nero_2025-09-14.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Apple_Crumble_%26_Custard_Tart_-_Caff%C3%A8_Nero_2025-09-14.jpg/480px-Apple_Crumble_%26_Custard_Tart_-_Caff%C3%A8_Nero_2025-09-14.jpg")
                    .description("Fotografia de Pastel de Nata.")
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Bolo de Chocolate - Padaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Bolo_de_chocolate_em_Mogi_das_Cruzes.jpg/1280px-Bolo_de_chocolate_em_Mogi_das_Cruzes.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Bolo_de_chocolate_em_Mogi_das_Cruzes.jpg/480px-Bolo_de_chocolate_em_Mogi_das_Cruzes.jpg")
                    .description("Fotografia de Bolo de Chocolate.")
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Pão Doce Tradicional - Padaria Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Baker_New_Ulm_1974.jpg/1280px-Baker_New_Ulm_1974.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Baker_New_Ulm_1974.jpg/480px-Baker_New_Ulm_1974.jpg")
                    .description("Fotografia de Pão Doce Tradicional.")
                    .build()
    ),

    PAO_DE_FORMA_PASTELARIA_DOCE_MANJAR_PHOTO(
            DocumentFile.builder()
                    .title("Pão de Forma - Pastelaria Doce Manjar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Bread_slicing_machine_Foodtech_Br%C3%B8dskj%C3%A6remaskin_EXTRA_COOP_Norway_2017-11-02_bag_on_sliced_bread.jpg/1280px-Bread_slicing_machine_Foodtech_Br%C3%B8dskj%C3%A6remaskin_EXTRA_COOP_Norway_2017-11-02_bag_on_sliced_bread.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Bread_slicing_machine_Foodtech_Br%C3%B8dskj%C3%A6remaskin_EXTRA_COOP_Norway_2017-11-02_bag_on_sliced_bread.jpg/480px-Bread_slicing_machine_Foodtech_Br%C3%B8dskj%C3%A6remaskin_EXTRA_COOP_Norway_2017-11-02_bag_on_sliced_bread.jpg")
                    .description("Fotografia de Pão de Forma.")
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PASTELARIA_DOCE_MANJAR_PHOTO(
            DocumentFile.builder()
                    .title("Croissant de Manteiga - Pastelaria Doce Manjar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Bungeo-ppang-shaped_croissant_%2831976973836%29.jpg/1280px-Bungeo-ppang-shaped_croissant_%2831976973836%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Bungeo-ppang-shaped_croissant_%2831976973836%29.jpg/480px-Bungeo-ppang-shaped_croissant_%2831976973836%29.jpg")
                    .description("Fotografia de Croissant de Manteiga.")
                    .build()
    ),

    PASTEL_DE_NATA_PASTELARIA_DOCE_MANJAR_PHOTO(
            DocumentFile.builder()
                    .title("Pastel de Nata - Pastelaria Doce Manjar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Coffee_and_custard_tart_at_House_of_Morocco%2C_King%27s_Cross%2C_London_%2840750148283%29.jpg/1280px-Coffee_and_custard_tart_at_House_of_Morocco%2C_King%27s_Cross%2C_London_%2840750148283%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Coffee_and_custard_tart_at_House_of_Morocco%2C_King%27s_Cross%2C_London_%2840750148283%29.jpg/480px-Coffee_and_custard_tart_at_House_of_Morocco%2C_King%27s_Cross%2C_London_%2840750148283%29.jpg")
                    .description("Fotografia de Pastel de Nata.")
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PASTELARIA_DOCE_MANJAR_PHOTO(
            DocumentFile.builder()
                    .title("Bolo de Chocolate - Pastelaria Doce Manjar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Chocolate_Cake_2.jpg/1280px-Chocolate_Cake_2.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Chocolate_Cake_2.jpg/480px-Chocolate_Cake_2.jpg")
                    .description("Fotografia de Bolo de Chocolate.")
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PASTELARIA_DOCE_MANJAR_PHOTO(
            DocumentFile.builder()
                    .title("Pão Doce Tradicional - Pastelaria Doce Manjar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Bread_rolls_%285959537370%29.jpg/1280px-Bread_rolls_%285959537370%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Bread_rolls_%285959537370%29.jpg/480px-Bread_rolls_%285959537370%29.jpg")
                    .description("Fotografia de Pão Doce Tradicional.")
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Pão de Forma - Padaria Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Breads_of_Russia.jpg/1280px-Breads_of_Russia.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Breads_of_Russia.jpg/480px-Breads_of_Russia.jpg")
                    .description("Fotografia de Pão de Forma.")
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Croissant de Manteiga - Padaria Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Croissant%2C_cross_section.jpg/1280px-Croissant%2C_cross_section.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Croissant%2C_cross_section.jpg/480px-Croissant%2C_cross_section.jpg")
                    .description("Fotografia de Croissant de Manteiga.")
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Pastel de Nata - Padaria Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Custard_tart_emerging_from_wrapper.jpg/1280px-Custard_tart_emerging_from_wrapper.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Custard_tart_emerging_from_wrapper.jpg/480px-Custard_tart_emerging_from_wrapper.jpg")
                    .description("Fotografia de Pastel de Nata.")
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Bolo de Chocolate - Padaria Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Chocolate_Cake_with_a_Decadent_Ganache.jpg/1280px-Chocolate_Cake_with_a_Decadent_Ganache.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Chocolate_Cake_with_a_Decadent_Ganache.jpg/480px-Chocolate_Cake_with_a_Decadent_Ganache.jpg")
                    .description("Fotografia de Bolo de Chocolate.")
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_KILAMBA_PHOTO(
            DocumentFile.builder()
                    .title("Pão Doce Tradicional - Padaria Kilamba")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Bread_rolls_%285959538820%29.jpg/1280px-Bread_rolls_%285959538820%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Bread_rolls_%285959538820%29.jpg/480px-Bread_rolls_%285959538820%29.jpg")
                    .description("Fotografia de Pão Doce Tradicional.")
                    .build()
    ),

    PAO_DE_FORMA_PADARIA_MANACA_PHOTO(
            DocumentFile.builder()
                    .title("Pão de Forma - Padaria Manacá")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Fresh_made_bread_05.jpg/1280px-Fresh_made_bread_05.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Fresh_made_bread_05.jpg/480px-Fresh_made_bread_05.jpg")
                    .description("Fotografia de Pão de Forma.")
                    .build()
    ),

    CROISSANT_DE_MANTEIGA_PADARIA_MANACA_PHOTO(
            DocumentFile.builder()
                    .title("Croissant de Manteiga - Padaria Manacá")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Croissant%2C_whole.jpg/1280px-Croissant%2C_whole.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Croissant%2C_whole.jpg/480px-Croissant%2C_whole.jpg")
                    .description("Fotografia de Croissant de Manteiga.")
                    .build()
    ),

    PASTEL_DE_NATA_PADARIA_MANACA_PHOTO(
            DocumentFile.builder()
                    .title("Pastel de Nata - Padaria Manacá")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Egg_Tart_at_Grain_Express%2C_Centro_Whitehorse%2C_Box_Hill%2C_2007.jpg/1280px-Egg_Tart_at_Grain_Express%2C_Centro_Whitehorse%2C_Box_Hill%2C_2007.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Egg_Tart_at_Grain_Express%2C_Centro_Whitehorse%2C_Box_Hill%2C_2007.jpg/480px-Egg_Tart_at_Grain_Express%2C_Centro_Whitehorse%2C_Box_Hill%2C_2007.jpg")
                    .description("Fotografia de Pastel de Nata.")
                    .build()
    ),

    BOLO_DE_CHOCOLATE_PADARIA_MANACA_PHOTO(
            DocumentFile.builder()
                    .title("Bolo de Chocolate - Padaria Manacá")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Chocolate_Cake_with_almonds.jpg/1280px-Chocolate_Cake_with_almonds.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Chocolate_Cake_with_almonds.jpg/480px-Chocolate_Cake_with_almonds.jpg")
                    .description("Fotografia de Bolo de Chocolate.")
                    .build()
    ),

    PAO_DOCE_TRADICIONAL_PADARIA_MANACA_PHOTO(
            DocumentFile.builder()
                    .title("Pão Doce Tradicional - Padaria Manacá")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Bread_rolls_%285959546878%29.jpg/1280px-Bread_rolls_%285959546878%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Bread_rolls_%285959546878%29.jpg/480px-Bread_rolls_%285959546878%29.jpg")
                    .description("Fotografia de Pão Doce Tradicional.")
                    .build()
    ),

    VOO_LUANDA_LISBOA_LINHAS_AEREAS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Lisboa - Linhas Aéreas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Airplane_Beech_1900D_%282082947662%29.jpg/1280px-Airplane_Beech_1900D_%282082947662%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Airplane_Beech_1900D_%282082947662%29.jpg/480px-Airplane_Beech_1900D_%282082947662%29.jpg")
                    .description("Fotografia de Voo Luanda-Lisboa.")
                    .build()
    ),

    VOO_LUANDA_HUAMBO_LINHAS_AEREAS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Huambo - Linhas Aéreas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Aeroplane_interior_02.jpg/1280px-Aeroplane_interior_02.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Aeroplane_interior_02.jpg/480px-Aeroplane_interior_02.jpg")
                    .description("Fotografia de Voo Luanda-Huambo.")
                    .build()
    ),

    VOO_LUANDA_LUBANGO_LINHAS_AEREAS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Lubango - Linhas Aéreas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/Boarding_Gate_Sepinggan_International_Airport_%281%29.jpg/1280px-Boarding_Gate_Sepinggan_International_Airport_%281%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/Boarding_Gate_Sepinggan_International_Airport_%281%29.jpg/480px-Boarding_Gate_Sepinggan_International_Airport_%281%29.jpg")
                    .description("Fotografia de Voo Luanda-Lubango.")
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_LINHAS_AEREAS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-São Paulo - Linhas Aéreas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/A-4C_Skyhawk_from_VSF-1_in_flight_over_the_Med_c1968.jpg/1280px-A-4C_Skyhawk_from_VSF-1_in_flight_over_the_Med_c1968.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/A-4C_Skyhawk_from_VSF-1_in_flight_over_the_Med_c1968.jpg/480px-A-4C_Skyhawk_from_VSF-1_in_flight_over_the_Med_c1968.jpg")
                    .description("Fotografia de Voo Luanda-São Paulo.")
                    .build()
    ),

    VOO_LUANDA_LONDRES_LINHAS_AEREAS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Londres - Linhas Aéreas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/47_Airport_departures_board_free_photo_-_Melbourne_Airport_timetable_-_Creative_Commons_Attribution.jpg/1280px-47_Airport_departures_board_free_photo_-_Melbourne_Airport_timetable_-_Creative_Commons_Attribution.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/47_Airport_departures_board_free_photo_-_Melbourne_Airport_timetable_-_Creative_Commons_Attribution.jpg/480px-47_Airport_departures_board_free_photo_-_Melbourne_Airport_timetable_-_Creative_Commons_Attribution.jpg")
                    .description("Fotografia de Voo Luanda-Londres.")
                    .build()
    ),

    VOO_LUANDA_LISBOA_ANGOLA_EXPRESS_AIR_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Lisboa - Angola Express Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Airplane_Window_%28Unsplash%29.jpg/1280px-Airplane_Window_%28Unsplash%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Airplane_Window_%28Unsplash%29.jpg/480px-Airplane_Window_%28Unsplash%29.jpg")
                    .description("Fotografia de Voo Luanda-Lisboa.")
                    .build()
    ),

    VOO_LUANDA_HUAMBO_ANGOLA_EXPRESS_AIR_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Huambo - Angola Express Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/EBACE_2019%2C_Le_Grand-Saconnex_%28EB190620%29.jpg/1280px-EBACE_2019%2C_Le_Grand-Saconnex_%28EB190620%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/EBACE_2019%2C_Le_Grand-Saconnex_%28EB190620%29.jpg/480px-EBACE_2019%2C_Le_Grand-Saconnex_%28EB190620%29.jpg")
                    .description("Fotografia de Voo Luanda-Huambo.")
                    .build()
    ),

    VOO_LUANDA_LUBANGO_ANGOLA_EXPRESS_AIR_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Lubango - Angola Express Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Boarding_Gate_Sepinggan_International_Airport_%282%29.jpg/1280px-Boarding_Gate_Sepinggan_International_Airport_%282%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Boarding_Gate_Sepinggan_International_Airport_%282%29.jpg/480px-Boarding_Gate_Sepinggan_International_Airport_%282%29.jpg")
                    .description("Fotografia de Voo Luanda-Lubango.")
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_ANGOLA_EXPRESS_AIR_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-São Paulo - Angola Express Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/A-4C_Skyhawk_of_VA-192_in_flight_in_1964.jpg/1280px-A-4C_Skyhawk_of_VA-192_in_flight_in_1964.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/A-4C_Skyhawk_of_VA-192_in_flight_in_1964.jpg/480px-A-4C_Skyhawk_of_VA-192_in_flight_in_1964.jpg")
                    .description("Fotografia de Voo Luanda-São Paulo.")
                    .build()
    ),

    VOO_LUANDA_LONDRES_ANGOLA_EXPRESS_AIR_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Londres - Angola Express Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Brisbane_Airport_Domestic_Terminal_flights_departures_board%2C_June_2022.jpg/1280px-Brisbane_Airport_Domestic_Terminal_flights_departures_board%2C_June_2022.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Brisbane_Airport_Domestic_Terminal_flights_departures_board%2C_June_2022.jpg/480px-Brisbane_Airport_Domestic_Terminal_flights_departures_board%2C_June_2022.jpg")
                    .description("Fotografia de Voo Luanda-Londres.")
                    .build()
    ),

    VOO_LUANDA_LISBOA_SKY_ANGOLA_AIRLINES_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Lisboa - Sky Angola Airlines")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Airplanes_at_CPH_3.jpg/1280px-Airplanes_at_CPH_3.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Airplanes_at_CPH_3.jpg/480px-Airplanes_at_CPH_3.jpg")
                    .description("Fotografia de Voo Luanda-Lisboa.")
                    .build()
    ),

    VOO_LUANDA_HUAMBO_SKY_ANGOLA_AIRLINES_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Huambo - Sky Angola Airlines")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Economy_class_interior_of_B-6528_%2820230329094242%29.jpg/1280px-Economy_class_interior_of_B-6528_%2820230329094242%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Economy_class_interior_of_B-6528_%2820230329094242%29.jpg/480px-Economy_class_interior_of_B-6528_%2820230329094242%29.jpg")
                    .description("Fotografia de Voo Luanda-Huambo.")
                    .build()
    ),

    VOO_LUANDA_LUBANGO_SKY_ANGOLA_AIRLINES_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Lubango - Sky Angola Airlines")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Boarding_Gate_at_Samos_International_Airport.jpg/1280px-Boarding_Gate_at_Samos_International_Airport.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Boarding_Gate_at_Samos_International_Airport.jpg/480px-Boarding_Gate_at_Samos_International_Airport.jpg")
                    .description("Fotografia de Voo Luanda-Lubango.")
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_SKY_ANGOLA_AIRLINES_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-São Paulo - Sky Angola Airlines")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/A_wing_tip_of_an_airplane_%2840118125441%29.jpg/1280px-A_wing_tip_of_an_airplane_%2840118125441%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/A_wing_tip_of_an_airplane_%2840118125441%29.jpg/480px-A_wing_tip_of_an_airplane_%2840118125441%29.jpg")
                    .description("Fotografia de Voo Luanda-São Paulo.")
                    .build()
    ),

    VOO_LUANDA_LONDRES_SKY_ANGOLA_AIRLINES_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Londres - Sky Angola Airlines")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Departure_Board_at_Christchurch_airport.jpg/1280px-Departure_Board_at_Christchurch_airport.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Departure_Board_at_Christchurch_airport.jpg/480px-Departure_Board_at_Christchurch_airport.jpg")
                    .description("Fotografia de Voo Luanda-Londres.")
                    .build()
    ),

    VOO_LUANDA_LISBOA_KUBINGA_AIR_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Lisboa - Kubinga Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Bristol_Runway.jpg/1280px-Bristol_Runway.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Bristol_Runway.jpg/480px-Bristol_Runway.jpg")
                    .description("Fotografia de Voo Luanda-Lisboa.")
                    .build()
    ),

    VOO_LUANDA_HUAMBO_KUBINGA_AIR_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Huambo - Kubinga Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Foggy_airplane_cabin.jpg/1280px-Foggy_airplane_cabin.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Foggy_airplane_cabin.jpg/480px-Foggy_airplane_cabin.jpg")
                    .description("Fotografia de Voo Luanda-Huambo.")
                    .build()
    ),

    VOO_LUANDA_LUBANGO_KUBINGA_AIR_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Lubango - Kubinga Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Boarding_at_gate_G12_San_Francisco_International_Airport.jpg/1280px-Boarding_at_gate_G12_San_Francisco_International_Airport.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Boarding_at_gate_G12_San_Francisco_International_Airport.jpg/480px-Boarding_at_gate_G12_San_Francisco_International_Airport.jpg")
                    .description("Fotografia de Voo Luanda-Lubango.")
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_KUBINGA_AIR_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-São Paulo - Kubinga Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Above_the_Clouds_-_A_Glimpse_of_Heaven.jpg/1280px-Above_the_Clouds_-_A_Glimpse_of_Heaven.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Above_the_Clouds_-_A_Glimpse_of_Heaven.jpg/480px-Above_the_Clouds_-_A_Glimpse_of_Heaven.jpg")
                    .description("Fotografia de Voo Luanda-São Paulo.")
                    .build()
    ),

    VOO_LUANDA_LONDRES_KUBINGA_AIR_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Londres - Kubinga Air")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Departure_Board_at_ORD.jpg/1280px-Departure_Board_at_ORD.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Departure_Board_at_ORD.jpg/480px-Departure_Board_at_ORD.jpg")
                    .description("Fotografia de Voo Luanda-Londres.")
                    .build()
    ),

    VOO_LUANDA_LISBOA_ROYAL_WINGS_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Lisboa - Royal Wings Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Kursi-Jendela_Penumpang_Pesawat.jpg/1280px-Kursi-Jendela_Penumpang_Pesawat.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Kursi-Jendela_Penumpang_Pesawat.jpg/480px-Kursi-Jendela_Penumpang_Pesawat.jpg")
                    .description("Fotografia de Voo Luanda-Lisboa.")
                    .build()
    ),

    VOO_LUANDA_HUAMBO_ROYAL_WINGS_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Huambo - Royal Wings Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/GULFSTREAM_G-1_AIRPLANE_INTERIOR_-_NARA_-_17422746.jpg/1280px-GULFSTREAM_G-1_AIRPLANE_INTERIOR_-_NARA_-_17422746.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/GULFSTREAM_G-1_AIRPLANE_INTERIOR_-_NARA_-_17422746.jpg/480px-GULFSTREAM_G-1_AIRPLANE_INTERIOR_-_NARA_-_17422746.jpg")
                    .description("Fotografia de Voo Luanda-Huambo.")
                    .build()
    ),

    VOO_LUANDA_LUBANGO_ROYAL_WINGS_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Lubango - Royal Wings Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Boarding_gate_97_at_Urumqi_International_Airport.jpg/1280px-Boarding_gate_97_at_Urumqi_International_Airport.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/Boarding_gate_97_at_Urumqi_International_Airport.jpg/480px-Boarding_gate_97_at_Urumqi_International_Airport.jpg")
                    .description("Fotografia de Voo Luanda-Lubango.")
                    .build()
    ),

    VOO_LUANDA_SAO_PAULO_ROYAL_WINGS_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-São Paulo - Royal Wings Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Airplane_wing_sky_and_clouds.jpg/1280px-Airplane_wing_sky_and_clouds.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Airplane_wing_sky_and_clouds.jpg/480px-Airplane_wing_sky_and_clouds.jpg")
                    .description("Fotografia de Voo Luanda-São Paulo.")
                    .build()
    ),

    VOO_LUANDA_LONDRES_ROYAL_WINGS_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Voo Luanda-Londres - Royal Wings Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Departure_and_arrival_board_at_Lakselv_Airport.jpg/1280px-Departure_and_arrival_board_at_Lakselv_Airport.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Departure_and_arrival_board_at_Lakselv_Airport.jpg/480px-Departure_and_arrival_board_at_Lakselv_Airport.jpg")
                    .description("Fotografia de Voo Luanda-Londres.")
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_AGENCIA_DE_VIAGENS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Pacote Luanda-Namibe - Agência de Viagens Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/267_of_%27%28A_Noble_Life._By_the_author_of_%E2%80%9CJohn_Halifax%E2%80%9D_%28Dinah_Maria_Mulock%2C_afterwards_Craik%29.%29%27_%2811057815893%29.jpg/1280px-267_of_%27%28A_Noble_Life._By_the_author_of_%E2%80%9CJohn_Halifax%E2%80%9D_%28Dinah_Maria_Mulock%2C_afterwards_Craik%29.%29%27_%2811057815893%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/267_of_%27%28A_Noble_Life._By_the_author_of_%E2%80%9CJohn_Halifax%E2%80%9D_%28Dinah_Maria_Mulock%2C_afterwards_Craik%29.%29%27_%2811057815893%29.jpg/480px-267_of_%27%28A_Noble_Life._By_the_author_of_%E2%80%9CJohn_Halifax%E2%80%9D_%28Dinah_Maria_Mulock%2C_afterwards_Craik%29.%29%27_%2811057815893%29.jpg")
                    .description("Fotografia de Pacote Luanda-Namibe.")
                    .build()
    ),

    SAFARIR_EM_BENGUELA_AGENCIA_DE_VIAGENS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Safarir em Benguela - Agência de Viagens Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Arriving_on_Scheveningen_beach_-_DPLA_-_b72b64566b67f5123a11ca276437c5f5.jpg/1280px-Arriving_on_Scheveningen_beach_-_DPLA_-_b72b64566b67f5123a11ca276437c5f5.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Arriving_on_Scheveningen_beach_-_DPLA_-_b72b64566b67f5123a11ca276437c5f5.jpg/480px-Arriving_on_Scheveningen_beach_-_DPLA_-_b72b64566b67f5123a11ca276437c5f5.jpg")
                    .description("Fotografia de Safarir em Benguela.")
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_AGENCIA_DE_VIAGENS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Rota da Serra da Leba - Agência de Viagens Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/A_trip_to_the_Little_Atlas_Mountains.jpg/1280px-A_trip_to_the_Little_Atlas_Mountains.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/A_trip_to_the_Little_Atlas_Mountains.jpg/480px-A_trip_to_the_Little_Atlas_Mountains.jpg")
                    .description("Fotografia de Rota da Serra da Leba.")
                    .build()
    ),

    EXCURSAO_AS_ILHAS_AGENCIA_DE_VIAGENS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Excursão às Ilhas - Agência de Viagens Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Dolphin_Tour_with_Lagoon_Pontoon.jpg/1280px-Dolphin_Tour_with_Lagoon_Pontoon.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Dolphin_Tour_with_Lagoon_Pontoon.jpg/480px-Dolphin_Tour_with_Lagoon_Pontoon.jpg")
                    .description("Fotografia de Excursão às Ilhas.")
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AGENCIA_DE_VIAGENS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("City Tour em Luanda - Agência de Viagens Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/City_Sightseeing_Belfast_tour_bus_on_the_Clifton_Road_-_geograph.org.uk_-_4566846.jpg/1280px-City_Sightseeing_Belfast_tour_bus_on_the_Clifton_Road_-_geograph.org.uk_-_4566846.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/City_Sightseeing_Belfast_tour_bus_on_the_Clifton_Road_-_geograph.org.uk_-_4566846.jpg/480px-City_Sightseeing_Belfast_tour_bus_on_the_Clifton_Road_-_geograph.org.uk_-_4566846.jpg")
                    .description("Fotografia de City Tour em Luanda.")
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_AVENTURA_VIAGENS_PHOTO(
            DocumentFile.builder()
                    .title("Pacote Luanda-Namibe - Aventura Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Camel_Ride_during_the_Desert_Safari_Tour.jpg/1280px-Camel_Ride_during_the_Desert_Safari_Tour.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Camel_Ride_during_the_Desert_Safari_Tour.jpg/480px-Camel_Ride_during_the_Desert_Safari_Tour.jpg")
                    .description("Fotografia de Pacote Luanda-Namibe.")
                    .build()
    ),

    SAFARIR_EM_BENGUELA_AVENTURA_VIAGENS_PHOTO(
            DocumentFile.builder()
                    .title("Safarir em Benguela - Aventura Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/BeachClub.jpg/1280px-BeachClub.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/BeachClub.jpg/480px-BeachClub.jpg")
                    .description("Fotografia de Safarir em Benguela.")
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_AVENTURA_VIAGENS_PHOTO(
            DocumentFile.builder()
                    .title("Rota da Serra da Leba - Aventura Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Mountain_Road_Trip_%28Unsplash%29.jpg/1280px-Mountain_Road_Trip_%28Unsplash%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Mountain_Road_Trip_%28Unsplash%29.jpg/480px-Mountain_Road_Trip_%28Unsplash%29.jpg")
                    .description("Fotografia de Rota da Serra da Leba.")
                    .build()
    ),

    EXCURSAO_AS_ILHAS_AVENTURA_VIAGENS_PHOTO(
            DocumentFile.builder()
                    .title("Excursão às Ilhas - Aventura Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/El_Gouna_Hill_Villas_R10.jpg/1280px-El_Gouna_Hill_Villas_R10.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/El_Gouna_Hill_Villas_R10.jpg/480px-El_Gouna_Hill_Villas_R10.jpg")
                    .description("Fotografia de Excursão às Ilhas.")
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AVENTURA_VIAGENS_PHOTO(
            DocumentFile.builder()
                    .title("City Tour em Luanda - Aventura Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/City_Sightseeing_Oxford_tour_bus_%26_tower_of_Sa%C3%AFd_Business_School_-_geograph.org.uk_-_3036207.jpg/1280px-City_Sightseeing_Oxford_tour_bus_%26_tower_of_Sa%C3%AFd_Business_School_-_geograph.org.uk_-_3036207.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/City_Sightseeing_Oxford_tour_bus_%26_tower_of_Sa%C3%AFd_Business_School_-_geograph.org.uk_-_3036207.jpg/480px-City_Sightseeing_Oxford_tour_bus_%26_tower_of_Sa%C3%AFd_Business_School_-_geograph.org.uk_-_3036207.jpg")
                    .description("Fotografia de City Tour em Luanda.")
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_TRAVEL_HOUSE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Pacote Luanda-Namibe - Travel House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/DOHA_SAFARI.jpg/1280px-DOHA_SAFARI.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/DOHA_SAFARI.jpg/480px-DOHA_SAFARI.jpg")
                    .description("Fotografia de Pacote Luanda-Namibe.")
                    .build()
    ),

    SAFARIR_EM_BENGUELA_TRAVEL_HOUSE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Safarir em Benguela - Travel House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2823938738774%29.jpg/1280px-Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2823938738774%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2823938738774%29.jpg/480px-Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2823938738774%29.jpg")
                    .description("Fotografia de Safarir em Benguela.")
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_TRAVEL_HOUSE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Rota da Serra da Leba - Travel House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Mountain_road_trip_and_hike_%2815186281254%29.jpg/1280px-Mountain_road_trip_and_hike_%2815186281254%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Mountain_road_trip_and_hike_%2815186281254%29.jpg/480px-Mountain_road_trip_and_hike_%2815186281254%29.jpg")
                    .description("Fotografia de Rota da Serra da Leba.")
                    .build()
    ),

    EXCURSAO_AS_ILHAS_TRAVEL_HOUSE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Excursão às Ilhas - Travel House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Enjoying_the_River_-_geograph.org.uk_-_1389596.jpg/1280px-Enjoying_the_River_-_geograph.org.uk_-_1389596.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Enjoying_the_River_-_geograph.org.uk_-_1389596.jpg/480px-Enjoying_the_River_-_geograph.org.uk_-_1389596.jpg")
                    .description("Fotografia de Excursão às Ilhas.")
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_TRAVEL_HOUSE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("City Tour em Luanda - Travel House Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/City_Tour_Bus_in_Harmoni.jpg/1280px-City_Tour_Bus_in_Harmoni.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/City_Tour_Bus_in_Harmoni.jpg/480px-City_Tour_Bus_in_Harmoni.jpg")
                    .description("Fotografia de City Tour em Luanda.")
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_GLOBETROTTER_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Pacote Luanda-Namibe - Globetrotter Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Dubai_Safari.jpg/1280px-Dubai_Safari.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Dubai_Safari.jpg/480px-Dubai_Safari.jpg")
                    .description("Fotografia de Pacote Luanda-Namibe.")
                    .build()
    ),

    SAFARIR_EM_BENGUELA_GLOBETROTTER_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Safarir em Benguela - Globetrotter Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824271381310%29.jpg/1280px-Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824271381310%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824271381310%29.jpg/480px-Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824271381310%29.jpg")
                    .description("Fotografia de Safarir em Benguela.")
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_GLOBETROTTER_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Rota da Serra da Leba - Globetrotter Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Mountain_road_trip_and_hike_%2815186775433%29.jpg/1280px-Mountain_road_trip_and_hike_%2815186775433%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Mountain_road_trip_and_hike_%2815186775433%29.jpg/480px-Mountain_road_trip_and_hike_%2815186775433%29.jpg")
                    .description("Fotografia de Rota da Serra da Leba.")
                    .build()
    ),

    EXCURSAO_AS_ILHAS_GLOBETROTTER_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Excursão às Ilhas - Globetrotter Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Florida_Tour%2C_August_2006_%2818961050419%29.jpg/1280px-Florida_Tour%2C_August_2006_%2818961050419%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Florida_Tour%2C_August_2006_%2818961050419%29.jpg/480px-Florida_Tour%2C_August_2006_%2818961050419%29.jpg")
                    .description("Fotografia de Excursão às Ilhas.")
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_GLOBETROTTER_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("City Tour em Luanda - Globetrotter Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/City_Tour_bus_Gda%C5%84sk.jpg/1280px-City_Tour_bus_Gda%C5%84sk.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/City_Tour_bus_Gda%C5%84sk.jpg/480px-City_Tour_bus_Gda%C5%84sk.jpg")
                    .description("Fotografia de City Tour em Luanda.")
                    .build()
    ),

    PACOTE_LUANDA_NAMIBE_SAFARIR_VIAGENS_PHOTO(
            DocumentFile.builder()
                    .title("Pacote Luanda-Namibe - Safarir Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/K.K._Oestere._Arm%C3%A9e%2C_Haus-Uniform._K.K_%3DLomb._Venet._Adel._Leibgarde_%28NYPL_b14896507-91065%29.tiff/lossy-page1-1280px-K.K._Oestere._Arm%C3%A9e%2C_Haus-Uniform._K.K_%3DLomb._Venet._Adel._Leibgarde_%28NYPL_b14896507-91065%29.tiff.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/K.K._Oestere._Arm%C3%A9e%2C_Haus-Uniform._K.K_%3DLomb._Venet._Adel._Leibgarde_%28NYPL_b14896507-91065%29.tiff/lossy-page1-1280px-K.K._Oestere._Arm%C3%A9e%2C_Haus-Uniform._K.K_%3DLomb._Venet._Adel._Leibgarde_%28NYPL_b14896507-91065%29.tiff.jpg")
                    .description("Fotografia de Pacote Luanda-Namibe.")
                    .build()
    ),

    SAFARIR_EM_BENGUELA_SAFARIR_VIAGENS_PHOTO(
            DocumentFile.builder()
                    .title("Safarir em Benguela - Safarir Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824484623391%29.jpg/1280px-Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824484623391%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824484623391%29.jpg/480px-Cocolise_Isla_Resort%2C_Islas_del_Rosario_%2824484623391%29.jpg")
                    .description("Fotografia de Safarir em Benguela.")
                    .build()
    ),

    ROTA_DA_SERRA_DA_LEBA_SAFARIR_VIAGENS_PHOTO(
            DocumentFile.builder()
                    .title("Rota da Serra da Leba - Safarir Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Mountain_road_trip_and_hike_%2815806235385%29.jpg/1280px-Mountain_road_trip_and_hike_%2815806235385%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Mountain_road_trip_and_hike_%2815806235385%29.jpg/480px-Mountain_road_trip_and_hike_%2815806235385%29.jpg")
                    .description("Fotografia de Rota da Serra da Leba.")
                    .build()
    ),

    EXCURSAO_AS_ILHAS_SAFARIR_VIAGENS_PHOTO(
            DocumentFile.builder()
                    .title("Excursão às Ilhas - Safarir Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Island_J%C3%B6kuls%C3%A1rl%C3%B3n_03.JPG/1280px-Island_J%C3%B6kuls%C3%A1rl%C3%B3n_03.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Island_J%C3%B6kuls%C3%A1rl%C3%B3n_03.JPG/480px-Island_J%C3%B6kuls%C3%A1rl%C3%B3n_03.JPG")
                    .description("Fotografia de Excursão às Ilhas.")
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_SAFARIR_VIAGENS_PHOTO(
            DocumentFile.builder()
                    .title("City Tour em Luanda - Safarir Viagens")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/City_tour%2C_Wroclaw_%28P1180439%29.jpg/1280px-City_tour%2C_Wroclaw_%28P1180439%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/City_tour%2C_Wroclaw_%28P1180439%29.jpg/480px-City_tour%2C_Wroclaw_%28P1180439%29.jpg")
                    .description("Fotografia de City Tour em Luanda.")
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_OPERADORA_TURISTICA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("City Tour em Luanda - Operadora Turística Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/City_Walk%2C_Leeds_-_geograph.org.uk_-_5205737.jpg/1280px-City_Walk%2C_Leeds_-_geograph.org.uk_-_5205737.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/City_Walk%2C_Leeds_-_geograph.org.uk_-_5205737.jpg/480px-City_Walk%2C_Leeds_-_geograph.org.uk_-_5205737.jpg")
                    .description("Fotografia de City Tour em Luanda.")
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_OPERADORA_TURISTICA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Visita à Serra da Leba - Operadora Turística Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Biei.Shirahige-Falls2022.JPG/1280px-Biei.Shirahige-Falls2022.JPG")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Biei.Shirahige-Falls2022.JPG/480px-Biei.Shirahige-Falls2022.JPG")
                    .description("Fotografia de Visita à Serra da Leba.")
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_OPERADORA_TURISTICA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Expedição à Foz do Kwanza - Operadora Turística Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Ford_A9633_NLGRF_photo_contact_sheet_%281976-05-03%29%28Gerald_Ford_Library%29.jpg/1280px-Ford_A9633_NLGRF_photo_contact_sheet_%281976-05-03%29%28Gerald_Ford_Library%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Ford_A9633_NLGRF_photo_contact_sheet_%281976-05-03%29%28Gerald_Ford_Library%29.jpg/480px-Ford_A9633_NLGRF_photo_contact_sheet_%281976-05-03%29%28Gerald_Ford_Library%29.jpg")
                    .description("Fotografia de Expedição à Foz do Kwanza.")
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_OPERADORA_TURISTICA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Tour Gastronómico no Miramar - Operadora Turística Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/20180413_190254Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/1280px-20180413_190254Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/20180413_190254Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/480px-20180413_190254Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .description("Fotografia de Tour Gastronómico no Miramar.")
                    .build()
    ),

    PASSEIO_PELA_FALESIA_OPERADORA_TURISTICA_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Passeio pela Falésia - Operadora Turística Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Dorset_Coastal_Path%2C_Gad_Cliff_-_geograph.org.uk_-_79141.jpg/1280px-Dorset_Coastal_Path%2C_Gad_Cliff_-_geograph.org.uk_-_79141.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Dorset_Coastal_Path%2C_Gad_Cliff_-_geograph.org.uk_-_79141.jpg/480px-Dorset_Coastal_Path%2C_Gad_Cliff_-_geograph.org.uk_-_79141.jpg")
                    .description("Fotografia de Passeio pela Falésia.")
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_AVENTURA_GUIDES_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("City Tour em Luanda - Aventura Guides Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/City_Walk%2C_Leeds_-_geograph.org.uk_-_5205758.jpg/1280px-City_Walk%2C_Leeds_-_geograph.org.uk_-_5205758.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/City_Walk%2C_Leeds_-_geograph.org.uk_-_5205758.jpg/480px-City_Walk%2C_Leeds_-_geograph.org.uk_-_5205758.jpg")
                    .description("Fotografia de City Tour em Luanda.")
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_AVENTURA_GUIDES_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Visita à Serra da Leba - Aventura Guides Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Samoa_waterfall_scenery.jpg/1280px-Samoa_waterfall_scenery.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Samoa_waterfall_scenery.jpg/480px-Samoa_waterfall_scenery.jpg")
                    .description("Fotografia de Visita à Serra da Leba.")
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_AVENTURA_GUIDES_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Expedição à Foz do Kwanza - Aventura Guides Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Jim_Corebtt_National_Park_India.jpg/1280px-Jim_Corebtt_National_Park_India.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Jim_Corebtt_National_Park_India.jpg/480px-Jim_Corebtt_National_Park_India.jpg")
                    .description("Fotografia de Expedição à Foz do Kwanza.")
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_AVENTURA_GUIDES_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Tour Gastronómico no Miramar - Aventura Guides Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/20180413_190302Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/1280px-20180413_190302Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/20180413_190302Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/480px-20180413_190302Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .description("Fotografia de Tour Gastronómico no Miramar.")
                    .build()
    ),

    PASSEIO_PELA_FALESIA_AVENTURA_GUIDES_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Passeio pela Falésia - Aventura Guides Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Hartland_Quay_Cliff_Walk_16%2C_Coastal_scene_-_geograph.org.uk_-_8315968.jpg/1280px-Hartland_Quay_Cliff_Walk_16%2C_Coastal_scene_-_geograph.org.uk_-_8315968.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Hartland_Quay_Cliff_Walk_16%2C_Coastal_scene_-_geograph.org.uk_-_8315968.jpg/480px-Hartland_Quay_Cliff_Walk_16%2C_Coastal_scene_-_geograph.org.uk_-_8315968.jpg")
                    .description("Fotografia de Passeio pela Falésia.")
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_TURISTAS_LUANDA_GUIDES_PHOTO(
            DocumentFile.builder()
                    .title("City Tour em Luanda - Turistas Luanda Guides")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/City_Walk_Meraas-Float4.jpg/1280px-City_Walk_Meraas-Float4.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/City_Walk_Meraas-Float4.jpg/480px-City_Walk_Meraas-Float4.jpg")
                    .description("Fotografia de City Tour em Luanda.")
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_TURISTAS_LUANDA_GUIDES_PHOTO(
            DocumentFile.builder()
                    .title("Visita à Serra da Leba - Turistas Luanda Guides")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Shirahige-no-taki_Shirogane_Onsen_Biei_Hokkaido_Japan01s3.jpg/1280px-Shirahige-no-taki_Shirogane_Onsen_Biei_Hokkaido_Japan01s3.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Shirahige-no-taki_Shirogane_Onsen_Biei_Hokkaido_Japan01s3.jpg/480px-Shirahige-no-taki_Shirogane_Onsen_Biei_Hokkaido_Japan01s3.jpg")
                    .description("Fotografia de Visita à Serra da Leba.")
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_TURISTAS_LUANDA_GUIDES_PHOTO(
            DocumentFile.builder()
                    .title("Expedição à Foz do Kwanza - Turistas Luanda Guides")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Makhtesh_Ramon_Crater%2C_peak_of_Mount_Negev_in_Israel%27s_Negev_desert%2C_some_85km_south_of_Beersheba._Activities_like_Jeep_4X4_tours%2C_hiking%2C_cycling%2C_RZRs%2C_ATVs_trips%2C_abseiling%2C_hot_air_balloons_%26_camel_Safari.jpg/1280px-thumbnail.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Makhtesh_Ramon_Crater%2C_peak_of_Mount_Negev_in_Israel%27s_Negev_desert%2C_some_85km_south_of_Beersheba._Activities_like_Jeep_4X4_tours%2C_hiking%2C_cycling%2C_RZRs%2C_ATVs_trips%2C_abseiling%2C_hot_air_balloons_%26_camel_Safari.jpg/480px-thumbnail.jpg")
                    .description("Fotografia de Expedição à Foz do Kwanza.")
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_TURISTAS_LUANDA_GUIDES_PHOTO(
            DocumentFile.builder()
                    .title("Tour Gastronómico no Miramar - Turistas Luanda Guides")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/20180413_190400Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market.jpg/1280px-20180413_190400Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/20180413_190400Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market.jpg/480px-20180413_190400Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market.jpg")
                    .description("Fotografia de Tour Gastronómico no Miramar.")
                    .build()
    ),

    PASSEIO_PELA_FALESIA_TURISTAS_LUANDA_GUIDES_PHOTO(
            DocumentFile.builder()
                    .title("Passeio pela Falésia - Turistas Luanda Guides")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Hartland_Quay_Cliff_Walk_26%2C_Coastal_scene_-_geograph.org.uk_-_8315997.jpg/1280px-Hartland_Quay_Cliff_Walk_26%2C_Coastal_scene_-_geograph.org.uk_-_8315997.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Hartland_Quay_Cliff_Walk_26%2C_Coastal_scene_-_geograph.org.uk_-_8315997.jpg/480px-Hartland_Quay_Cliff_Walk_26%2C_Coastal_scene_-_geograph.org.uk_-_8315997.jpg")
                    .description("Fotografia de Passeio pela Falésia.")
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_EXPEDICOES_KALANDULA_PHOTO(
            DocumentFile.builder()
                    .title("City Tour em Luanda - Expedições Kalandula")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/City_Walk_Orlando_07.jpg/1280px-City_Walk_Orlando_07.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/City_Walk_Orlando_07.jpg/480px-City_Walk_Orlando_07.jpg")
                    .description("Fotografia de City Tour em Luanda.")
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_EXPEDICOES_KALANDULA_PHOTO(
            DocumentFile.builder()
                    .title("Visita à Serra da Leba - Expedições Kalandula")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Shirahige_Falls%2C_Biei_River%2C_Hokkaido%2C_Japan.jpg/1280px-Shirahige_Falls%2C_Biei_River%2C_Hokkaido%2C_Japan.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Shirahige_Falls%2C_Biei_River%2C_Hokkaido%2C_Japan.jpg/480px-Shirahige_Falls%2C_Biei_River%2C_Hokkaido%2C_Japan.jpg")
                    .description("Fotografia de Visita à Serra da Leba.")
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_EXPEDICOES_KALANDULA_PHOTO(
            DocumentFile.builder()
                    .title("Expedição à Foz do Kwanza - Expedições Kalandula")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Outlaw_Trail%2C_Sedona_6-24-22_-_Explored_-_Flickr_-_Sharon_Mollerus.jpg/1280px-Outlaw_Trail%2C_Sedona_6-24-22_-_Explored_-_Flickr_-_Sharon_Mollerus.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Outlaw_Trail%2C_Sedona_6-24-22_-_Explored_-_Flickr_-_Sharon_Mollerus.jpg/480px-Outlaw_Trail%2C_Sedona_6-24-22_-_Explored_-_Flickr_-_Sharon_Mollerus.jpg")
                    .description("Fotografia de Expedição à Foz do Kwanza.")
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_EXPEDICOES_KALANDULA_PHOTO(
            DocumentFile.builder()
                    .title("Tour Gastronómico no Miramar - Expedições Kalandula")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/20180413_194910Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/1280px-20180413_194910Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/20180413_194910Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/480px-20180413_194910Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .description("Fotografia de Tour Gastronómico no Miramar.")
                    .build()
    ),

    PASSEIO_PELA_FALESIA_EXPEDICOES_KALANDULA_PHOTO(
            DocumentFile.builder()
                    .title("Passeio pela Falésia - Expedições Kalandula")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Hartland_Quay_Cliff_Walk_28%2C_Coastal_scene_-_geograph.org.uk_-_8316000.jpg/1280px-Hartland_Quay_Cliff_Walk_28%2C_Coastal_scene_-_geograph.org.uk_-_8316000.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Hartland_Quay_Cliff_Walk_28%2C_Coastal_scene_-_geograph.org.uk_-_8316000.jpg/480px-Hartland_Quay_Cliff_Walk_28%2C_Coastal_scene_-_geograph.org.uk_-_8316000.jpg")
                    .description("Fotografia de Passeio pela Falésia.")
                    .build()
    ),

    CITY_TOUR_EM_LUANDA_GUIA_TOURS_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("City Tour em Luanda - Guia Tours Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Shirahige_Falls.jpg/1280px-Shirahige_Falls.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Shirahige_Falls.jpg/480px-Shirahige_Falls.jpg")
                    .description("Fotografia de City Tour em Luanda.")
                    .build()
    ),

    VISITA_A_SERRA_DA_LEBA_GUIA_TOURS_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Visita à Serra da Leba - Guia Tours Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Shirahige_Falls_20230712_01.jpg/1280px-Shirahige_Falls_20230712_01.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Shirahige_Falls_20230712_01.jpg/480px-Shirahige_Falls_20230712_01.jpg")
                    .description("Fotografia de Visita à Serra da Leba.")
                    .build()
    ),

    EXPEDICAO_A_FOZ_DO_KWANZA_GUIA_TOURS_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Expedição à Foz do Kwanza - Guia Tours Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Punta_Cana_Just_Safari_-_Jeep_Tour.jpg/1280px-Punta_Cana_Just_Safari_-_Jeep_Tour.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Punta_Cana_Just_Safari_-_Jeep_Tour.jpg/480px-Punta_Cana_Just_Safari_-_Jeep_Tour.jpg")
                    .description("Fotografia de Expedição à Foz do Kwanza.")
                    .build()
    ),

    TOUR_GASTRONOMICO_NO_MIRAMAR_GUIA_TOURS_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Tour Gastronómico no Miramar - Guia Tours Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/20180413_195443Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/1280px-20180413_195443Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/20180413_195443Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg/480px-20180413_195443Saigon_Hotpot_Night_Food_Tour_Ho_Thi_Ky_Flower_Market_Thanh_H%E1%BA%B1ng_L%C3%BD_Th%C3%A1i_Minh_Hi%E1%BA%BFu_Kim_Euncheol_Lee_Junho_Choi_Kwangmo.jpg")
                    .description("Fotografia de Tour Gastronómico no Miramar.")
                    .build()
    ),

    PASSEIO_PELA_FALESIA_GUIA_TOURS_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Passeio pela Falésia - Guia Tours Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Hartland_Quay_Cliff_Walk_35%2C_Coastal_scene_-_geograph.org.uk_-_8316011.jpg/1280px-Hartland_Quay_Cliff_Walk_35%2C_Coastal_scene_-_geograph.org.uk_-_8316011.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Hartland_Quay_Cliff_Walk_35%2C_Coastal_scene_-_geograph.org.uk_-_8316011.jpg/480px-Hartland_Quay_Cliff_Walk_35%2C_Coastal_scene_-_geograph.org.uk_-_8316011.jpg")
                    .description("Fotografia de Passeio pela Falésia.")
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_INTERPRETES_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Espanhol - Intérpretes de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Panorama%2C_Massachusetts_Agricultural_College_%281916%29.jpg/1280px-Panorama%2C_Massachusetts_Agricultural_College_%281916%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Panorama%2C_Massachusetts_Agricultural_College_%281916%29.jpg/480px-Panorama%2C_Massachusetts_Agricultural_College_%281916%29.jpg")
                    .description("Fotografia de Intérprete de Espanhol.")
                    .build()
    ),

    INTERPRETE_DE_FRANCES_INTERPRETES_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Francês - Intérpretes de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/European_Masters_in_Conference_Interpreting_%28EMCI%29.jpg/1280px-European_Masters_in_Conference_Interpreting_%28EMCI%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/European_Masters_in_Conference_Interpreting_%28EMCI%29.jpg/480px-European_Masters_in_Conference_Interpreting_%28EMCI%29.jpg")
                    .description("Fotografia de Intérprete de Francês.")
                    .build()
    ),

    INTERPRETE_DE_INGLES_INTERPRETES_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Inglês - Intérpretes de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/A_person_is_reaching_for_a_computer_mouse_while_headphones_lie_nearby_on_a_soft_surface.jpg/1280px-A_person_is_reaching_for_a_computer_mouse_while_headphones_lie_nearby_on_a_soft_surface.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/A_person_is_reaching_for_a_computer_mouse_while_headphones_lie_nearby_on_a_soft_surface.jpg/480px-A_person_is_reaching_for_a_computer_mouse_while_headphones_lie_nearby_on_a_soft_surface.jpg")
                    .description("Fotografia de Intérprete de Inglês.")
                    .build()
    ),

    GUIA_DE_CONFERENCIA_INTERPRETES_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Guia de Conferência - Intérpretes de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Secretary_Kerry_Walks_Through_the_Plaza_de_Armas_in_Old_Havana_%2820391450389%29.jpg/1280px-Secretary_Kerry_Walks_Through_the_Plaza_de_Armas_in_Old_Havana_%2820391450389%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Secretary_Kerry_Walks_Through_the_Plaza_de_Armas_in_Old_Havana_%2820391450389%29.jpg/480px-Secretary_Kerry_Walks_Through_the_Plaza_de_Armas_in_Old_Havana_%2820391450389%29.jpg")
                    .description("Fotografia de Guia de Conferência.")
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_INTERPRETES_DE_LUANDA_PHOTO(
            DocumentFile.builder()
                    .title("Tradução de Documentos - Intérpretes de Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176975.tif/lossy-page1-1280px-Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176975.tif.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176975.tif/lossy-page1-1280px-Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176975.tif.jpg")
                    .description("Fotografia de Tradução de Documentos.")
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_GLOBAL_VOICES_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Espanhol - Global Voices Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Ajay_Piramal_at_Horasis_Global_India_Business_Meeting_2014.jpg/1280px-Ajay_Piramal_at_Horasis_Global_India_Business_Meeting_2014.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Ajay_Piramal_at_Horasis_Global_India_Business_Meeting_2014.jpg/480px-Ajay_Piramal_at_Horasis_Global_India_Business_Meeting_2014.jpg")
                    .description("Fotografia de Intérprete de Espanhol.")
                    .build()
    ),

    INTERPRETE_DE_FRANCES_GLOBAL_VOICES_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Francês - Global Voices Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Interpreter_and_Nez_Perce_Indians%2C_by_J._W._Hansard.png/1280px-Interpreter_and_Nez_Perce_Indians%2C_by_J._W._Hansard.png")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Interpreter_and_Nez_Perce_Indians%2C_by_J._W._Hansard.png/480px-Interpreter_and_Nez_Perce_Indians%2C_by_J._W._Hansard.png")
                    .description("Fotografia de Intérprete de Francês.")
                    .build()
    ),

    INTERPRETE_DE_INGLES_GLOBAL_VOICES_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Inglês - Global Voices Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Abandoned_headphones_%28Unsplash%29.jpg/1280px-Abandoned_headphones_%28Unsplash%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Abandoned_headphones_%28Unsplash%29.jpg/480px-Abandoned_headphones_%28Unsplash%29.jpg")
                    .description("Fotografia de Intérprete de Inglês.")
                    .build()
    ),

    GUIA_DE_CONFERENCIA_GLOBAL_VOICES_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Guia de Conferência - Global Voices Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/IM_L7_GIMS_2024_1X7A2003.jpg/1280px-IM_L7_GIMS_2024_1X7A2003.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/IM_L7_GIMS_2024_1X7A2003.jpg/480px-IM_L7_GIMS_2024_1X7A2003.jpg")
                    .description("Fotografia de Guia de Conferência.")
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_GLOBAL_VOICES_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Tradução de Documentos - Global Voices Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/INTERIOR_DETAIL_VIEW_OF_THE_STATE_FORESTER%27S_OFFICE%2C_VIEW_LOOKING_NORTHWEST_AT_HIS_DESK._-_Oregon_State_Forester%27s_Office_Complex%2C_2600_State_Street%2C_Salem%2C_Marion%2C_OR_HABS_OR-186-29.tif/lossy-page1-1280px-thumbnail.tif.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/INTERIOR_DETAIL_VIEW_OF_THE_STATE_FORESTER%27S_OFFICE%2C_VIEW_LOOKING_NORTHWEST_AT_HIS_DESK._-_Oregon_State_Forester%27s_Office_Complex%2C_2600_State_Street%2C_Salem%2C_Marion%2C_OR_HABS_OR-186-29.tif/lossy-page1-1280px-thumbnail.tif.jpg")
                    .description("Fotografia de Tradução de Documentos.")
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Espanhol - Tradução e Intérprete Services")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Alan_Hassenfeld%2C_Chairman_Hasbro_USA%2C_at_the_Horasis_Global_China_Business_Meeting_2013.jpg/1280px-Alan_Hassenfeld%2C_Chairman_Hasbro_USA%2C_at_the_Horasis_Global_China_Business_Meeting_2013.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Alan_Hassenfeld%2C_Chairman_Hasbro_USA%2C_at_the_Horasis_Global_China_Business_Meeting_2013.jpg/480px-Alan_Hassenfeld%2C_Chairman_Hasbro_USA%2C_at_the_Horasis_Global_China_Business_Meeting_2013.jpg")
                    .description("Fotografia de Intérprete de Espanhol.")
                    .build()
    ),

    INTERPRETE_DE_FRANCES_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Francês - Tradução e Intérprete Services")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Interpreters_%2801113764%29_%289840785866%29.jpg/1280px-Interpreters_%2801113764%29_%289840785866%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Interpreters_%2801113764%29_%289840785866%29.jpg/480px-Interpreters_%2801113764%29_%289840785866%29.jpg")
                    .description("Fotografia de Intérprete de Francês.")
                    .build()
    ),

    INTERPRETE_DE_INGLES_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Inglês - Tradução e Intérprete Services")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Brown_headphones_iPad_%28Unsplash%29.jpg/1280px-Brown_headphones_iPad_%28Unsplash%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Brown_headphones_iPad_%28Unsplash%29.jpg/480px-Brown_headphones_iPad_%28Unsplash%29.jpg")
                    .description("Fotografia de Intérprete de Inglês.")
                    .build()
    ),

    GUIA_DE_CONFERENCIA_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO(
            DocumentFile.builder()
                    .title("Guia de Conferência - Tradução e Intérprete Services")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/IM_L7_GIMS_2024_1X7A2005.jpg/1280px-IM_L7_GIMS_2024_1X7A2005.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/IM_L7_GIMS_2024_1X7A2005.jpg/480px-IM_L7_GIMS_2024_1X7A2005.jpg")
                    .description("Fotografia de Guia de Conferência.")
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_TRADUCAO_E_INTERPRETE_SERVICES_PHOTO(
            DocumentFile.builder()
                    .title("Tradução de Documentos - Tradução e Intérprete Services")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.jpg/1280px-Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.jpg/480px-Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.jpg")
                    .description("Fotografia de Tradução de Documentos.")
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_INTERPRETE_PRO_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Espanhol - Intérprete Pro Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Antonio_Esc%C3%A1mez_%28Horasis_Global_India_Business_Meeting_2010%29.jpg/1280px-Antonio_Esc%C3%A1mez_%28Horasis_Global_India_Business_Meeting_2010%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Antonio_Esc%C3%A1mez_%28Horasis_Global_India_Business_Meeting_2010%29.jpg/480px-Antonio_Esc%C3%A1mez_%28Horasis_Global_India_Business_Meeting_2010%29.jpg")
                    .description("Fotografia de Intérprete de Espanhol.")
                    .build()
    ),

    INTERPRETE_DE_FRANCES_INTERPRETE_PRO_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Francês - Intérprete Pro Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Turkish_Language_Interpreter_Umair_Ahsan%2C_Translator_terc%C3%BCman_%C3%A7evirmen_Teacher_in_Lahore_Pakistan.jpg/1280px-Turkish_Language_Interpreter_Umair_Ahsan%2C_Translator_terc%C3%BCman_%C3%A7evirmen_Teacher_in_Lahore_Pakistan.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Turkish_Language_Interpreter_Umair_Ahsan%2C_Translator_terc%C3%BCman_%C3%A7evirmen_Teacher_in_Lahore_Pakistan.jpg/480px-Turkish_Language_Interpreter_Umair_Ahsan%2C_Translator_terc%C3%BCman_%C3%A7evirmen_Teacher_in_Lahore_Pakistan.jpg")
                    .description("Fotografia de Intérprete de Francês.")
                    .build()
    ),

    INTERPRETE_DE_INGLES_INTERPRETE_PRO_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Inglês - Intérprete Pro Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Desk-music-headphones-earphones_%2824243083451%29.jpg/1280px-Desk-music-headphones-earphones_%2824243083451%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Desk-music-headphones-earphones_%2824243083451%29.jpg/480px-Desk-music-headphones-earphones_%2824243083451%29.jpg")
                    .description("Fotografia de Intérprete de Inglês.")
                    .build()
    ),

    GUIA_DE_CONFERENCIA_INTERPRETE_PRO_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Guia de Conferência - Intérprete Pro Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/IM_L7_GIMS_2024_1X7A2240.jpg/1280px-IM_L7_GIMS_2024_1X7A2240.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/IM_L7_GIMS_2024_1X7A2240.jpg/480px-IM_L7_GIMS_2024_1X7A2240.jpg")
                    .description("Fotografia de Guia de Conferência.")
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_INTERPRETE_PRO_ANGOLA_PHOTO(
            DocumentFile.builder()
                    .title("Tradução de Documentos - Intérprete Pro Angola")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.tif/lossy-page1-1280px-Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.tif.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.tif/lossy-page1-1280px-Photograph_of_President_Reagan_working_at_his_desk_in_the_Oval_Office_-_NARA_-_198593.tif.jpg")
                    .description("Fotografia de Tradução de Documentos.")
                    .build()
    ),

    INTERPRETE_DE_ESPANHOL_IDIOMAS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Espanhol - Idiomas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/David_Landsman_at_Horasis_Global_India_Business_Meeting_2014.jpg/1280px-David_Landsman_at_Horasis_Global_India_Business_Meeting_2014.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/David_Landsman_at_Horasis_Global_India_Business_Meeting_2014.jpg/480px-David_Landsman_at_Horasis_Global_India_Business_Meeting_2014.jpg")
                    .description("Fotografia de Intérprete de Espanhol.")
                    .build()
    ),

    INTERPRETE_DE_FRANCES_IDIOMAS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Francês - Idiomas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Gregory_Barker%2C_Minister_of_State_for_Energy_and_Climate_Change%2C_United_Kingdom%2C_keynoting_the_Global_India_Business_Meeting_%2814513453892%29.jpg/1280px-Gregory_Barker%2C_Minister_of_State_for_Energy_and_Climate_Change%2C_United_Kingdom%2C_keynoting_the_Global_India_Business_Meeting_%2814513453892%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Gregory_Barker%2C_Minister_of_State_for_Energy_and_Climate_Change%2C_United_Kingdom%2C_keynoting_the_Global_India_Business_Meeting_%2814513453892%29.jpg/480px-Gregory_Barker%2C_Minister_of_State_for_Energy_and_Climate_Change%2C_United_Kingdom%2C_keynoting_the_Global_India_Business_Meeting_%2814513453892%29.jpg")
                    .description("Fotografia de Intérprete de Francês.")
                    .build()
    ),

    INTERPRETE_DE_INGLES_IDIOMAS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Intérprete de Inglês - Idiomas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Girl_in_headphones_%28cropped%29.jpg/1280px-Girl_in_headphones_%28cropped%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Girl_in_headphones_%28cropped%29.jpg/480px-Girl_in_headphones_%28cropped%29.jpg")
                    .description("Fotografia de Intérprete de Inglês.")
                    .build()
    ),

    GUIA_DE_CONFERENCIA_IDIOMAS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Guia de Conferência - Idiomas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/IM_L7_GIMS_2024_1X7A2241.jpg/1280px-IM_L7_GIMS_2024_1X7A2241.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/IM_L7_GIMS_2024_1X7A2241.jpg/480px-IM_L7_GIMS_2024_1X7A2241.jpg")
                    .description("Fotografia de Guia de Conferência.")
                    .build()
    ),

    TRADUCAO_DE_DOCUMENTOS_IDIOMAS_KWANZA_PHOTO(
            DocumentFile.builder()
                    .title("Tradução de Documentos - Idiomas Kwanza")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176976.tif/lossy-page1-1280px-Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176976.tif.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176976.tif/lossy-page1-1280px-Jimmy_Carter_at_his_desk_in_the_Oval_Office_-_NARA_-_176976.tif.jpg")
                    .description("Fotografia de Tradução de Documentos.")
                    .build()
    ),

    QUARTO_TWIN_DELUXE_EPICSANA_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Twin Deluxe - Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Hotel_Sunroute_Ariake_Standard_Single_bedroom_20110603-001.jpg/1280px-Hotel_Sunroute_Ariake_Standard_Single_bedroom_20110603-001.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Hotel_Sunroute_Ariake_Standard_Single_bedroom_20110603-001.jpg/480px-Hotel_Sunroute_Ariake_Standard_Single_bedroom_20110603-001.jpg")
                    .description("Fotografia de Quarto Twin Deluxe.")
                    .build()
    ),

    APARTAMENTO_FAMILIAR_EPICSANA_PHOTO(
            DocumentFile.builder()
                    .title("Apartamento Familiar - Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Bed_in_hotel_room_5.jpg/1280px-Bed_in_hotel_room_5.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Bed_in_hotel_room_5.jpg/480px-Bed_in_hotel_room_5.jpg")
                    .description("Fotografia de Apartamento Familiar.")
                    .build()
    ),

    PACOTE_DUAS_NOITES_EPICSANA_PHOTO(
            DocumentFile.builder()
                    .title("Pacote Duas Noites - Luanda")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242121913%29.jpg/1280px-Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242121913%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242121913%29.jpg/480px-Executive_Suite_Living_Room_-_Four_Points_L%C3%A9vis_%283242121913%29.jpg")
                    .description("Fotografia de Pacote Duas Noites.")
                    .build()
    ),

    QUARTO_INDIVIDUAL_EXECUTIVO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Individual Executivo - Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Petit_Trianon_%2824007466150%29.jpg/1280px-Petit_Trianon_%2824007466150%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Petit_Trianon_%2824007466150%29.jpg/480px-Petit_Trianon_%2824007466150%29.jpg")
                    .description("Fotografia de Quarto Individual Executivo.")
                    .build()
    ),

    QUARTO_FAMILIAR_COM_VARANDA_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Familiar com Varanda - Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Drake_Hotel%2C_Chicago%2C_Illinois_%2842718090014%29.jpg/1280px-Drake_Hotel%2C_Chicago%2C_Illinois_%2842718090014%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Drake_Hotel%2C_Chicago%2C_Illinois_%2842718090014%29.jpg/480px-Drake_Hotel%2C_Chicago%2C_Illinois_%2842718090014%29.jpg")
                    .description("Fotografia de Quarto Familiar com Varanda.")
                    .build()
    ),

    SUITE_MIRAMAR_COM_VISTA_PARA_O_MAR_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Suite Miramar com Vista para o Mar - Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Fireplace%2C_Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/1280px-Fireplace%2C_Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Fireplace%2C_Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/480px-Fireplace%2C_Fanny%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .description("Fotografia de Suite Miramar com Vista para o Mar.")
                    .build()
    ),

    ESTADIA_MENSAL_COM_DESCONTO_MIRAMAR_PHOTO(
            DocumentFile.builder()
                    .title("Estadia Mensal com Desconto - Miramar")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/IBIS_Hotel_Belfast_-_Castle_Street_%285676280619%29.jpg/1280px-IBIS_Hotel_Belfast_-_Castle_Street_%285676280619%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/IBIS_Hotel_Belfast_-_Castle_Street_%285676280619%29.jpg/480px-IBIS_Hotel_Belfast_-_Castle_Street_%285676280619%29.jpg")
                    .description("Fotografia de Estadia Mensal com Desconto.")
                    .build()
    ),

    QUARTO_INDIVIDUAL_SIMPLES_HUAMBO_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Individual Simples - Huambo")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Petit_Trianon_%2824194880042%29.jpg/1280px-Petit_Trianon_%2824194880042%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Petit_Trianon_%2824194880042%29.jpg/480px-Petit_Trianon_%2824194880042%29.jpg")
                    .description("Fotografia de Quarto Individual Simples.")
                    .build()
    ),

    QUARTO_CASAL_COM_BANHEIRA_HUAMBO_PHOTO(
            DocumentFile.builder()
                    .title("Quarto Casal com Banheira - Huambo")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Guest_room_with_one_bed%2C_Frye_Hotel%2C_Seattle%2C_circa_1923_%28MOHAI_8674%29.jpg/1280px-Guest_room_with_one_bed%2C_Frye_Hotel%2C_Seattle%2C_circa_1923_%28MOHAI_8674%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Guest_room_with_one_bed%2C_Frye_Hotel%2C_Seattle%2C_circa_1923_%28MOHAI_8674%29.jpg/480px-Guest_room_with_one_bed%2C_Frye_Hotel%2C_Seattle%2C_circa_1923_%28MOHAI_8674%29.jpg")
                    .description("Fotografia de Quarto Casal com Banheira.")
                    .build()
    ),

    PENSAO_COMPLETA_POR_DIA_HUAMBO_PHOTO(
            DocumentFile.builder()
                    .title("Pensão Completa por Dia - Huambo")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Fireplace%2C_George%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/1280px-Fireplace%2C_George%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Fireplace%2C_George%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg/480px-Fireplace%2C_George%E2%80%99s_Bedroom%2C_Glessner_House%2C_Prairie_Avenue_and_18th_Street%2C_Near_South_Side%2C_Chicago%2C_IL.jpg")
                    .description("Fotografia de Pensão Completa por Dia.")
                    .build()
    ),

    SALA_DE_CONFERENCIAS_POR_HORA_HUAMBO_PHOTO(
            DocumentFile.builder()
                    .title("Sala de Conferências por Hora - Huambo")
                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Ibis_Budget_Potsdamer_Platz_%2820160415_225548%29.jpg/1280px-Ibis_Budget_Potsdamer_Platz_%2820160415_225548%29.jpg")
                    .fileType(FileType.IMAGE)
                    .thumbnail("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Ibis_Budget_Potsdamer_Platz_%2820160415_225548%29.jpg/480px-Ibis_Budget_Potsdamer_Platz_%2820160415_225548%29.jpg")
                    .description("Fotografia de Sala de Conferências por Hora.")
                    .build()
    );

    private final DocumentFile documentFile;
}
