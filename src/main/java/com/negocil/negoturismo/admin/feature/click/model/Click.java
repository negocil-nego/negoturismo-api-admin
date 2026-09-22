package com.negocil.negoturismo.admin.feature.click.model;

import com.negocil.negoturismo.admin.feature.click.enums.ClickType;
import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
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
@Table(name = "TB_CLICKS")
public class Click extends CommonModel {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ClickType type;

    @Column(nullable = false)
    private Integer count;

    @Column(nullable = false)
    private String entityId;
}
