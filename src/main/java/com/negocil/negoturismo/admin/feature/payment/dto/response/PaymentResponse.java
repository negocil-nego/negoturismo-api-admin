package com.negocil.negoturismo.admin.feature.payment.dto.response;

import com.negocil.negoturismo.admin.feature.payment.enums.PaymentStatus;
import com.negocil.negoturismo.admin.feature.payment.model.Payment;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.Instant;

@Schema(description = "Payment data returned to clients")
public record PaymentResponse(
        @Schema(description = "Payment amount", example = "150.00")
        BigDecimal price,

        @Schema(description = "Current payment status", example = "PENDING")
        PaymentStatus status,

        @Schema(description = "Payment creation timestamp")
        Instant createdAt,

        @Schema(description = "Payment last update timestamp")
        Instant updatedAt
) {
    public static PaymentResponse of(Payment payment) {
        return new PaymentResponse(
                payment.getPrice(),
                payment.getStatus(),
                payment.getCreatedAt(),
                payment.getUpdatedAt()
        );
    }
}
