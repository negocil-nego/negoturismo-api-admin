package com.negocil.negoturismo.admin.feature.travel.model;

import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.travel.enums.Country;
import com.negocil.negoturismo.admin.feature.travel.enums.TravelType;
import com.negocil.negoturismo.admin.shared.core.model.ConcreteModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = ConcreteTableModel.TRAVEL)
public class Travel extends ConcreteModel {
    @NotBlank
    @Size(max = 100)
    private String city;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Country country;

    @NotBlank
    @Size(max = 1000)
    private String description;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TravelType type;

    @NotNull
    @Column(nullable = false)
    private LocalDateTime departureTime;

    @NotNull
    @Column(nullable = false)
    private LocalDateTime estimatedCompletionTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;
}
