package com.negocil.negoturismo.admin.feature.organization.repository;

import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationFile;
import com.negocil.negoturismo.admin.shared.document_file.model.DocumentFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizationFileRepository extends JpaRepository<OrganizationFile, Long>, JpaSpecificationExecutor<OrganizationFile> {
    Optional<OrganizationFile> findByOrganizationAndDoc(Organization organization, DocumentFile doc);
}
