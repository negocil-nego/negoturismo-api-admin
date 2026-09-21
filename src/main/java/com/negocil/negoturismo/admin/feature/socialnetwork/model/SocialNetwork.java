package com.negocil.negoturismo.admin.feature.socialnetwork.model;

import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.core.util.ConstraintUniqueKey;
import com.negocil.negoturismo.admin.shared.user.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = ConcreteTableModel.SOCIAL_NETWORK, uniqueConstraints = {
        @UniqueConstraint(name = ConstraintUniqueKey.SOCIAL_NETWORK_USER, columnNames = "user_id")
})
public class SocialNetwork extends ConcreteModel {
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String whatsapp;

    private String instagram;

    private String tiktok;

    private String facebook;

    private String youtube;

    private String linkedin;

    private String telegram;
}
