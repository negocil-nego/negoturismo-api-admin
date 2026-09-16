package com.negocil.negoturismo.admin.shared.core.repository;

import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepository<T extends CommonModel> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {
}
