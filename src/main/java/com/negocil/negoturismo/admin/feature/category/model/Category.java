package com.negocil.negoturismo.admin.feature.category.model;


import com.negocil.negoturismo.admin.feature.category.enums.CategoryGroup;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = ConcreteTableModel.CATEGORY)
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
public class Category extends ConcreteModel {
    @NotBlank
    @Column(unique = true)
    private String name;

    @NotBlank
    @Size(max = 100)
    @Column(unique = true)
    private String slug;

    @NotBlank
    @Size(max = 255)
    private String description;

    @Size(max = 100)
    private String icon;
}