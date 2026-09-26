package com.negocil.negoturismo.admin.feature.payment.service;

import com.negocil.negoturismo.admin.feature.payment.dto.response.PaymentRecentResponse;
import com.negocil.negoturismo.admin.feature.payment.enums.PaymentStatus;
import com.negocil.negoturismo.admin.feature.payment.repository.PaymentRepository;
import com.negocil.negoturismo.admin.shared.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;

    public long countTotal(User user) {
        return repository.countByUserUuid(user.getUuid());
    }

    public long countByStatus(User user, PaymentStatus status) {
        return repository.countByUserUuidAndStatus(user.getUuid(), status);
    }

    public PaymentRecentResponse getRecentPayments(User user) {
        var payments = repository.findTop10ByUserUuidOrderByCreatedAtDesc(user.getUuid());
        return PaymentRecentResponse.of(payments);
    }
}
