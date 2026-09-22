package com.negocil.negoturismo.admin.shared.user.model;

import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.user.enums.UserDataType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = ConcreteTableModel.USER_DATA)
public class UserData extends CommonModel {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserDataType type;

    @Column(nullable = false)
    private String value;

    @Column(nullable = false)
    private String otp;

    @Column(nullable = false)
    private Instant expiredAt;

    public boolean isExpired() {
        return expiredAt == null || expiredAt.isBefore(Instant.now());
    }
}
