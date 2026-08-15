package com.negocil.negoturismo.admin.shared.document_file.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DocumentFileData {
    EPIC_SANA_IMAGE(
            "Fachada Hotel Epic Sana",
            "https://images.unsplash.com/photo-1566073771259-6a8506099945?w=800",
            FileType.IMAGE,
            "https://images.unsplash.com/photo-1566073771259-6a8506099945?w=200",
            "Fotografia da fachada do Hotel Epic Sana Luanda."
    ),
    EPIC_SANA_LOGO(
            "Logotipo Hotel Epic Sana",
            "https://images.unsplash.com/photo-1542314831-068cd1dbfeeb?w=400",
            FileType.IMAGE,
            "https://images.unsplash.com/photo-1542314831-068cd1dbfeeb?w=200",
            "Logotipo oficial do Hotel Epic Sana Luanda."
    ),
    EPIC_SANA_VIDEO(
            "Vídeo Hotel Epic Sana",
            "https://videos.pexels.com/video-files/3297319/3297319-uhd_2560_1440_25fps.mp4",
            FileType.VIDEO,
            "https://images.unsplash.com/photo-1566073771259-6a8506099945?w=200",
            "Vídeo promocional do Hotel Epic Sana Luanda."
    ),
    ROOM_SINGLE_IMAGE(
            "Fotografia Quarto Single Deluxe",
            "https://images.unsplash.com/photo-1631049307264-da0ec9d70304?w=800",
            FileType.IMAGE,
            "https://images.unsplash.com/photo-1631049307264-da0ec9d70304?w=200",
            "Fotografia do quarto single deluxe com cama queen-size."
    ),
    ROOM_SUITE_IMAGE(
            "Fotografia Suite Presidencial",
            "https://images.unsplash.com/photo-1578683010236-d716f9a3f461?w=800",
            FileType.IMAGE,
            "https://images.unsplash.com/photo-1578683010236-d716f9a3f461?w=200",
            "Fotografia da suite presidencial com varanda privada."
    ),
    MIRAMAR_IMAGE(
            "Fachada Pensão Residencial Miramar",
            "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?w=800",
            FileType.IMAGE,
            "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?w=200",
            "Fotografia da fachada da Pensão Residencial Miramar."
    ),
    MIRAMAR_LOGO(
            "Logotipo Pensão Residencial Miramar",
            "https://images.unsplash.com/photo-1571896349842-33c89424de2d?w=400",
            FileType.IMAGE,
            "https://images.unsplash.com/photo-1571896349842-33c89424de2d?w=200",
            "Logotipo oficial da Pensão Residencial Miramar."
    ),
    MIRAMAR_VIDEO(
            "Vídeo Pensão Residencial Miramar",
            "https://videos.pexels.com/video-files/3378359/3378359-uhd_2560_1440_25fps.mp4",
            FileType.VIDEO,
            "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?w=200",
            "Vídeo promocional da Pensão Residencial Miramar."
    ),
    ROOM_DOUBLE_IMAGE(
            "Fotografia Quarto Casal Standard",
            "https://images.unsplash.com/photo-1590490360182-c33d955f7e4d?w=800",
            FileType.IMAGE,
            "https://images.unsplash.com/photo-1590490360182-c33d955f7e4d?w=200",
            "Fotografia do quarto de casal standard com vista para a cidade."
    ),
    HUAMBO_IMAGE(
            "Fachada Hospedaria Central do Huambo",
            "https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?w=800",
            FileType.IMAGE,
            "https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?w=200",
            "Fotografia da fachada da Hospedaria Central do Huambo."
    ),
    HUAMBO_LOGO(
            "Logotipo Hospedaria Central do Huambo",
            "https://images.unsplash.com/photo-1596394516093-501ba68a0ba6?w=400",
            FileType.IMAGE,
            "https://images.unsplash.com/photo-1596394516093-501ba68a0ba6?w=200",
            "Logotipo oficial da Hospedaria Central do Huambo."
    ),
    HUAMBO_VIDEO(
            "Vídeo Hospedaria Central do Huambo",
            "https://videos.pexels.com/video-files/3571264/3571264-uhd_2560_1440_30fps.mp4",
            FileType.VIDEO,
            "https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?w=200",
            "Vídeo promocional da Hospedaria Central do Huambo."
    ),
    ROOM_TWIN_IMAGE(
            "Fotografia Quarto Twin Simples",
            "https://images.unsplash.com/photo-1595576508898-0ad5c879a061?w=800",
            FileType.IMAGE,
            "https://images.unsplash.com/photo-1595576508898-0ad5c879a061?w=200",
            "Fotografia do quarto twin com duas camas individuais."
    );

    private final String title;
    private final String url;
    private final FileType fileType;
    private final String thumbnail;
    private final String description;
}
