package com.negocil.negoturismo.admin.feature.payment.dto.response;

import com.negocil.negoturismo.admin.feature.payment.enums.PaymentStatus;
import com.negocil.negoturismo.admin.feature.payment.model.Payment;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Schema(description = "List of recent payments for the authenticated user")
public record PaymentRecentResponse(
        @Schema(description = "List of recent payments")
        List<PaymentItem> payments
) {
    @Schema(description = "Individual payment item")
    public record PaymentItem(
            @Schema(description = "Payment amount", example = "150.00")
            BigDecimal price,

            @Schema(description = "Current payment status", example = "PAID")
            PaymentStatus status,

            @Schema(description = "Payment creation timestamp")
            Instant createdAt
    ) {
        public static PaymentItem of(Payment payment) {
            return new PaymentItem(
                    payment.getPrice(),
                    payment.getStatus(),
                    payment.getCreatedAt()
            );
        }
    }

    public static PaymentRecentResponse of(List<Payment> payments) {
        return new PaymentRecentResponse(
                payments.stream().map(PaymentItem::of).toList()
        );
    }
}
