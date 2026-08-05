package com.negocil.negoturismo.admin.feature.organization.model;

import com.negocil.negoturismo.admin.feature.user.model.User;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.core.util.ConstraintUniqueKey;
import com.negocil.negoturismo.admin.shared.core.util.ValidateFields;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Table(name = ConcreteTableModel.ORGANIZATION, uniqueConstraints = {
        @UniqueConstraint(name = ConstraintUniqueKey.ORGANIZATION_NAME, columnNames = "name"),
        @UniqueConstraint(name = ConstraintUniqueKey.ORGANIZATION_SLUG, columnNames = "slug"),
        @UniqueConstraint(name = ConstraintUniqueKey.ORGANIZATION_EMAIL, columnNames = "email"),
        @UniqueConstraint(name = ConstraintUniqueKey.ORGANIZATION_PHONE, columnNames = "phone"),
        @UniqueConstraint(name = "UK_ORGANIZATION_USER", columnNames = "user_id")
})
public class Organization extends ConcreteModel {
    @NotBlank
    @Size(max = 100)
    @Column(unique = true)
    private String name;

    @NotBlank
    @Size(max = 100)
    @Column(unique = true)
    private String slug;

    @NotBlank
    @Size(max = 100)
    @Column(unique = true)
    private String email;

    @NotBlank
    @Size(max = 15)
    @Column(unique = true)
    @Pattern(regexp = ValidateFields.REGEX_PHONE, message = "Phone invalid")
    private String phone;

    @Size(min = ValidateFields.DESCRIPTION_SIZE_MIN, max = ValidateFields.DESCRIPTION_SIZE_MAX)
    @Column(length = ValidateFields.DESCRIPTION_SIZE_MAX)
    private String description;

    @Size(max = 255)
    private String address;

    @Min(0)
    @Max(5)
    @PositiveOrZero
    @Builder.Default
    private Integer rating = 0;

    @Size(max = 2048)
    private String image;

    @Size(max = 2048)
    private String logo;

    @Size(max = 2048)
    private String video;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
