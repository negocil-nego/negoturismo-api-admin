package com.negocil.negoturismo.admin.feature.payment.repository;

import com.negocil.negoturismo.admin.feature.payment.enums.PaymentStatus;
import com.negocil.negoturismo.admin.feature.payment.model.Payment;
import com.negocil.negoturismo.admin.shared.core.repository.CommonRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PaymentRepository extends CommonRepository<Payment> {
    long countByUserUuidAndStatus(UUID userUuid, PaymentStatus status);
    long countByUserUuid(UUID userUuid);
    List<Payment> findTop10ByUserUuidOrderByCreatedAtDesc(UUID userUuid);
}
