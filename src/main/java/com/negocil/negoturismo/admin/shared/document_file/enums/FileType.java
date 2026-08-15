package com.negocil.negoturismo.admin.shared.document_file.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Getter
@RequiredArgsConstructor
public enum FileType {
    IMAGE(Set.of("png", "jpg", "jpeg")),
    VIDEO(Set.of("mp4", "mpeg4", "mpeg", "hls", "m3u8")),
    DOCUMENT(Set.of("pdf"));

    private final Set<String> extensions;
}
