package com.negocil.negoturismo.admin.shared.user.model;

import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.user.enums.UserOutboxMethod;
import com.negocil.negoturismo.admin.shared.core.enums.OutboxStatus;
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
@Table(name = ConcreteTableModel.USERS_OUTBOX)
public class UserOutbox extends CommonModel {
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private UserOutboxMethod method;

    @Enumerated(EnumType.STRING)
    private OutboxStatus status = OutboxStatus.PENDING;
}
