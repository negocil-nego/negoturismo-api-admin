package com.negocil.negoturismo.admin.shared.user.repository;

import com.negocil.negoturismo.admin.shared.user.enums.UserRequestBlockedStatus;
import com.negocil.negoturismo.admin.shared.user.model.UserRequestBlocked;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRequestBlockedRepository extends ConcreteRepository<UserRequestBlocked> {
    List<UserRequestBlocked> findByStatusOrderByCreatedAtDesc(UserRequestBlockedStatus status);
}
