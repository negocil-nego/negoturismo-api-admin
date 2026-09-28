package com.negocil.negoturismo.admin.feature.tour_guide.dto.response;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristAreaFile;
import com.negocil.negoturismo.admin.shared.document_file.enums.FileType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Tourist area file data returned to clients")
public record TouristAreaFileResponse(
        @Schema(description = "Unique identifier of the tourist area file", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "File URL", example = "https://example.com/file.jpg")
        String url,

        @Schema(description = "File type", example = "IMAGE")
        FileType fileType,

        @Schema(description = "Thumbnail URL", example = "https://example.com/thumb.jpg", nullable = true)
        String thumbnail,

        @Schema(description = "File title", example = "Miradouro da Lua 1")
        String title,

        @Schema(description = "File description", nullable = true)
        String description
) {
    public static TouristAreaFileResponse of(TouristAreaFile file) {
        var doc = file.getDoc();
        return new TouristAreaFileResponse(
                doc.getUuid(),
                doc.getUrl(),
                doc.getFileType(),
                doc.getThumbnail(),
                doc.getTitle(),
                doc.getDescription()
        );
    }
}
