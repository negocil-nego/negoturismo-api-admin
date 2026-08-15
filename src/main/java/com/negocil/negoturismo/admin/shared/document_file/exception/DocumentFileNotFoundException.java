package com.negocil.negoturismo.admin.shared.document_file.exception;

import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;

import java.util.UUID;

public class DocumentFileNotFoundException extends NotFoundException {
    public DocumentFileNotFoundException() {
        super("Not Found by document file");
    }

    public DocumentFileNotFoundException(String message) {
        super(message);
    }

    public DocumentFileNotFoundException(long id) {
        super(id);
    }

    public DocumentFileNotFoundException(UUID uuid) {
        super(uuid);
    }
}
