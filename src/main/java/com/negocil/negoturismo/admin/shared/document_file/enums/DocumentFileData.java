package com.negocil.negoturismo.admin.shared.document_file.enums;

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
                    .url("https://videos.pexels.com/video-files/3297319/3297319-uhd_2560_1440_25fps.mp4")
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
                    .url("https://videos.pexels.com/video-files/3378359/3378359-uhd_2560_1440_25fps.mp4")
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
    );

    private final DocumentFile documentFile;
}
