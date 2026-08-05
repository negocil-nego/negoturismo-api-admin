package com.negocil.negoturismo.admin.shared.otp.model;

import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.otp.enums.OtpVerificationTable;
import com.negocil.negoturismo.admin.shared.otp.enums.OtpVerificationType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;


@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = ConcreteTableModel.OTP)
public class OtpVerification extends CommonModel {
    private String code;

    private String parentId;

    @Column(nullable = false, updatable = false)
    protected Instant expiresAt;

    @Enumerated(EnumType.STRING)
    private OtpVerificationType otpVerificationType;

    @Enumerated(EnumType.STRING)
    private OtpVerificationTable otpVerificationTable;
}
