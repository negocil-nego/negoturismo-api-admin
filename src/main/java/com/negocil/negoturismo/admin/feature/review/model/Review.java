package com.negocil.negoturismo.admin.feature.review.model;

import com.negocil.negoturismo.admin.feature.user.model.User;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
@Table(name = ConcreteTableModel.REVIEW)
public class Review extends ConcreteModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @NotNull
    private User user;

    @NotNull
    @Min(1)
    @Max(5)
    private Integer rating;

    @Size(max = 2000)
    @Column(length = 2000)
    private String content;
}
