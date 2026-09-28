package com.negocil.negoturismo.admin.feature.tour_guide.model;

import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = ConcreteTableModel.TOURIST_AREA)
public class TouristArea extends ConcreteModel {
    @NotBlank
    private String name;

    @NotBlank
    private String state;

    @NotBlank
    private String address;

    private String image;

    private Double latitude;

    private Double longitude;

    @Builder.Default
    @OneToMany(mappedBy = "touristArea", fetch = FetchType.LAZY)
    private List<TouristAreaFile> files = new ArrayList<>();
}
