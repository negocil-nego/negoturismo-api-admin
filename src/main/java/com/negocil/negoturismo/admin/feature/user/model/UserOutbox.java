package com.negocil.negoturismo.admin.feature.user.model;

import com.negocil.negoturismo.admin.feature.user.enums.UserOutboxMethod;
import com.negocil.negoturismo.admin.shared.core.enums.OutboxStatus;
import com.negocil.negoturismo.admin.shared.core.util.OutboxTableModel;
import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = OutboxTableModel.USER)
public class UserOutbox extends CommonModel {
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private UserOutboxMethod method;

    @Enumerated(EnumType.STRING)
    private OutboxStatus status = OutboxStatus.PENDING;
}
