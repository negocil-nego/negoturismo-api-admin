package com.negocil.negoturismo.admin.shared.otp.model;

import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;


@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = ConcreteTableModel.OTP_VERIFICATIONS)
public class OtpVerification extends CommonModel {
    private String otp;
    private Instant expiredAt;

    public boolean isExpired() {  return expiredAt == null || expiredAt.isBefore(Instant.now()); }
}
