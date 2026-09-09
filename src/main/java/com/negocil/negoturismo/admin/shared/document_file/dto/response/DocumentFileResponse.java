package com.negocil.negoturismo.admin.shared.document_file.dto.response;

import com.negocil.negoturismo.admin.shared.document_file.enums.FileType;
import com.negocil.negoturismo.admin.shared.document_file.model.DocumentFile;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Document file data returned to clients")
public record DocumentFileResponse(
        @Schema(description = "Unique identifier of the document file", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID uuid,

        @Schema(description = "File URL", example = "https://example.com/file.jpg")
        String url,

        @Schema(description = "File type", example = "IMAGE")
        FileType fileType,

        @Schema(description = "Thumbnail URL", example = "https://example.com/thumb.jpg", nullable = true)
        String thumbnail,

        @Schema(description = "File title", example = "Product Photo")
        String title,

        @Schema(description = "File description", example = "Main product photo", nullable = true)
        String description
) {
    public static DocumentFileResponse of(DocumentFile doc) {
        return new DocumentFileResponse(
                doc.getUuid(),
                doc.getUrl(),
                doc.getFileType(),
                doc.getThumbnail(),
                doc.getTitle(),
                doc.getDescription()
        );
    }
}
