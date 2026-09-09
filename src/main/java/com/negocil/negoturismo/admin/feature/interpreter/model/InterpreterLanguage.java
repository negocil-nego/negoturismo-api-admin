package com.negocil.negoturismo.admin.feature.interpreter.model;

import com.negocil.negoturismo.admin.feature.interpreter.enums.CountryLanguage;
import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.core.util.ConstraintUniqueKey;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = ConcreteTableModel.INTERPRETER_LANGUAGE, uniqueConstraints = {
        @UniqueConstraint(name = ConstraintUniqueKey.INTERPRETER_LANGUAGE_ID, columnNames = "interpreter_id"),
        @UniqueConstraint(name = ConstraintUniqueKey.INTERPRETER_LANGUAGE_LANG, columnNames = "country_language")
})
public class InterpreterLanguage extends CommonModel {
    @Column(nullable = false, unique = true, updatable = false)
    private UUID uuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interpreter_id")
    private Interpreter interpreter;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "country_language")
    private CountryLanguage language;

    private String concat;

    @PrePersist
    public void onCreate() {
        if (uuid == null) { uuid = UUID.randomUUID(); }
    }
}
