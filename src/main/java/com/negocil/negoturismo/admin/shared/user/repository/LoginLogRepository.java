package com.negocil.negoturismo.admin.shared.user.repository;

import com.negocil.negoturismo.admin.shared.user.model.LoginLog;
import com.negocil.negoturismo.admin.shared.core.repository.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginLogRepository extends CommonRepository<LoginLog> {
}
