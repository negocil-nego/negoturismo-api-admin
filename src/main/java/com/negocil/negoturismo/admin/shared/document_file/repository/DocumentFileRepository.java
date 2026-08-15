package com.negocil.negoturismo.admin.shared.document_file.repository;

import com.negocil.negoturismo.admin.shared.document_file.model.DocumentFile;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DocumentFileRepository extends ConcreteRepository<DocumentFile> {
    Optional<DocumentFile> findByUrl(String url);
}
