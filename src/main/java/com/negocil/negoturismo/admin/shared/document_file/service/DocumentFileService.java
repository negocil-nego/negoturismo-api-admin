package com.negocil.negoturismo.admin.shared.document_file.service;

import com.negocil.negoturismo.admin.shared.document_file.exception.DocumentFileNotFoundException;
import com.negocil.negoturismo.admin.shared.document_file.repository.DocumentFileRepository;
import com.negocil.negoturismo.admin.shared.document_file.model.DocumentFile;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DocumentFileService extends ConcreteService<DocumentFile> implements IFindOrCreate<DocumentFile> {
    private static final int CONCAT_MAX_SIZE = 255;
    private final DocumentFileRepository repository;

    public DocumentFileService(DocumentFileRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Page<DocumentFile> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public DocumentFile findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new DocumentFileNotFoundException(uuid));
    }

    @Override
    public DocumentFile save(DocumentFile data) {
        var concat = "%s, %s, %s".formatted(data.getTitle(), data.getUrl(), data.getFileType());
        data.setConcat(concat.length() > CONCAT_MAX_SIZE ? concat.substring(0, CONCAT_MAX_SIZE) : concat);
        return super.save(data);
    }

    @Override
    public DocumentFile findOrCreate(DocumentFile model) {
        return repository.findByUrl(model.getUrl())
                .orElseGet(() -> save(model));
    }
}
