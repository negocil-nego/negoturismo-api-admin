package com.negocil.negoturismo.admin.shared.document_file.dto.response;

import com.negocil.negoturismo.admin.shared.document_file.model.DocumentFile;
import com.negocil.negoturismo.admin.shared.core.dto.response.PaginateResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@NoArgsConstructor
@Schema(description = "Paginated response containing a list of document files")
public class DocumentFilePaginate extends PaginateResponse<DocumentFileResponse> {

    public DocumentFilePaginate(
            List<DocumentFileResponse> content,
            boolean empty,
            boolean first,
            boolean last,
            int number,
            int numberOfElements,
            int size,
            long totalElements,
            int totalPages
    ) {
        super(content, empty, first, last, number, numberOfElements, size, totalElements, totalPages);
    }

    public static DocumentFilePaginate of(Page<DocumentFile> page) {
        return new DocumentFilePaginate(
                page.getContent().stream().map(DocumentFileResponse::of).toList(),
                page.isEmpty(),
                page.isFirst(),
                page.isLast(),
                page.getNumber(),
                page.getNumberOfElements(),
                page.getSize(),
                page.getTotalElements(),
                page.getTotalPages()
        );
    }
}
