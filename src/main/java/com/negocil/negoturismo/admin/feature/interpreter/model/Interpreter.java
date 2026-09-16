package com.negocil.negoturismo.admin.feature.interpreter.model;

import com.negocil.negoturismo.admin.shared.user.model.User;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.core.util.ConstraintUniqueKey;
import com.negocil.negoturismo.admin.shared.core.util.ValidateFields;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

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

    @Column(unique = true)
    private String slug;

    @Email
    private String email;

    @Size(max = 15)
    @Pattern(regexp = ValidateFields.REGEX_PHONE, message = "Phone invalid")
    private String whatsapp;

    @Size(max = ValidateFields.DESCRIPTION_SIZE_MAX)
    private String description;

    private String concat;

    private String photo;

    private String video;

    @Builder.Default
    @OneToMany(mappedBy = "interpreter", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<InterpreterLanguage> languages = new ArrayList<>();
}
