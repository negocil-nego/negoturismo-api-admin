package com.negocil.negoturismo.admin.feature.tour_guide.model;

import com.negocil.negoturismo.admin.shared.user.model.User;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.core.util.ConstraintUniqueKey;
import com.negocil.negoturismo.admin.shared.core.util.ValidateFields;
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
@Table(name = ConcreteTableModel.TOUR_GUIDE, uniqueConstraints = {
        @UniqueConstraint(name = ConstraintUniqueKey.TOUR_GUIDE_USER, columnNames = "user_id"),
        @UniqueConstraint(name = ConstraintUniqueKey.TOUR_GUIDE_CONCAT, columnNames = "concat")
})
public class TourGuide extends ConcreteModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
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

    @Column(unique = true)
    private String concat;

    private String photo;

    private String video;
}
