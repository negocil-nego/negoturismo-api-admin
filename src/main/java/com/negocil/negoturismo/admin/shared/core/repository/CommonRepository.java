package com.negocil.negoturismo.admin.shared.core.repository;

import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@NoRepositoryBean
public interface CommonRepository<T extends CommonModel> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {
    Optional<T> findByUuid(UUID uuid);

    @Modifying
    @Transactional
    void deleteByUuid(UUID uuid);
}