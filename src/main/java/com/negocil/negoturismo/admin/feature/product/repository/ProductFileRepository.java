package com.negocil.negoturismo.admin.feature.product.repository;

import com.negocil.negoturismo.admin.feature.product.model.Product;
import com.negocil.negoturismo.admin.feature.product.model.ProductFile;
import com.negocil.negoturismo.admin.shared.document_file.model.DocumentFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductFileRepository extends JpaRepository<ProductFile, Long>, JpaSpecificationExecutor<ProductFile> {
    Optional<ProductFile> findByProductAndDoc(Product product, DocumentFile doc);
}
