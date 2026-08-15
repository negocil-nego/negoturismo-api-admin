package com.negocil.negoturismo.admin.feature.product.model;


import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.shared.core.util.ConstraintUniqueKey;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(
        name = ConcreteTableModel.PRODUCT,
        uniqueConstraints = {
                @UniqueConstraint(name = ConstraintUniqueKey.PRODUCT_NAME, columnNames = "name"),
                @UniqueConstraint(name = ConstraintUniqueKey.PRODUCT_SLUG, columnNames = "slug")
        }
)
public class Product extends ConcreteModel {
    @NotBlank
    @Size(max = 100)
    @Column(unique = true)
    private String name;

    @NotBlank
    @Size(max = 100)
    @Column(unique = true)
    private String slug;

    @NotBlank
    @Size(max = 1000)
    @Column(length = 1000)
    private String description;

    @Size(max = 2000)
    private String image;

    @NotNull
    @Builder.Default
    private BigDecimal price = BigDecimal.ZERO;

    @NotNull
    @PositiveOrZero
    @Builder.Default
    private Integer position = 0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @Builder.Default
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ProductFile> files = new ArrayList<>();
}
