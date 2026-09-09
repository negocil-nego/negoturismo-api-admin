package com.negocil.negoturismo.admin.shared.document_file.dto.request;

import com.negocil.negoturismo.admin.shared.document_file.enums.FileType;
import com.negocil.negoturismo.admin.shared.document_file.model.DocumentFile;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Schema(description = "Request payload for creating or updating a document file")
public record DocumentFileRequest(
        @Schema(description = "File URL", example = "https://example.com/file.jpg", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 2000)
        @NotBlank
        @Size(max = 2000)
        String url,

        @Schema(description = "File type", example = "IMAGE", requiredMode = Schema.RequiredMode.REQUIRED)
        FileType fileType,

        @Schema(description = "Thumbnail URL", example = "https://example.com/thumb.jpg", requiredMode = Schema.RequiredMode.NOT_REQUIRED, maxLength = 2000)
        @Size(max = 2000)
        String thumbnail,

        @Schema(description = "File title", example = "Product Photo", requiredMode = Schema.RequiredMode.REQUIRED, maxLength = 255)
        @Size(max = 255)
        String title,

        @Schema(description = "File description", example = "Main product photo", requiredMode = Schema.RequiredMode.NOT_REQUIRED, maxLength = 1000)
        @Size(max = 1000)
        String description
) {
    public DocumentFile toModel() {
        return DocumentFile.builder()
                .url(url)
                .fileType(fileType)
                .thumbnail(thumbnail)
                .title(title)
                .description(description)
                .build();
    }
}
