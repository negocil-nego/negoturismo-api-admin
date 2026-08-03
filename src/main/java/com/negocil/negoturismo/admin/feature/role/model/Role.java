package com.negocil.negoturismo.admin.feature.role.model;

import com.negocil.negoturismo.admin.feature.permission.model.Permission;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.core.util.PivotTableModel;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = ConcreteTableModel.ROLE)
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
public class Role extends ConcreteModel {
    @NotBlank
    @Column(unique = true)
    private String code;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = PivotTableModel.TB_ROLES_PERMISSIONS,
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    @Builder.Default
    private Set<Permission> permissions = new HashSet<>();
}
