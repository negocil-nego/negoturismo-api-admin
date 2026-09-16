package com.negocil.negoturismo.admin.shared.user.model;

import com.negocil.negoturismo.admin.shared.user.enums.UserStatus;
import com.negocil.negoturismo.admin.shared.user.enums.UserType;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.core.util.ConstraintUniqueKey;
import com.negocil.negoturismo.admin.shared.core.util.ValidateFields;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = ConcreteTableModel.USER, uniqueConstraints = {
        @UniqueConstraint(name = ConstraintUniqueKey.USER_USERNAME, columnNames = "username"),
        @UniqueConstraint(name = ConstraintUniqueKey.USER_EMAIL,    columnNames = "email"),
        @UniqueConstraint(name = ConstraintUniqueKey.USER_PHONE,    columnNames = "phone")
})
public class User extends ConcreteModel implements UserDetails {
    @NotBlank
    private String name;

    @Column(unique = true)
    private String username;

    @Email
    @Column(unique = true)
    private String email;

    @Size(max = 15)
    @Column(unique = true)
    @Pattern(regexp = ValidateFields.REGEX_PHONE, message = "Phone invalid")
    private String phone;

    private String password;

    private LocalDate birthday;

    private String logo;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private UserType type = UserType.CLIENT;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private UserStatus status = UserStatus.PENDING;

    private Instant tokensInvalidatedAt;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }
}
