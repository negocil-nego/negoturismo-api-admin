package com.negocil.negoturismo.admin.feature.interpreter.model;

import com.negocil.negoturismo.admin.feature.user.model.User;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.core.util.ConstraintUniqueKey;
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
@Table(name = ConcreteTableModel.INTERPRETER, uniqueConstraints = {
        @UniqueConstraint(name = ConstraintUniqueKey.INTERPRETER_USER, columnNames = "user_id")
})
public class Interpreter extends ConcreteModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
