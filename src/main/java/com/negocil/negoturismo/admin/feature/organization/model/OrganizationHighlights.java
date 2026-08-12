package com.negocil.negoturismo.admin.feature.organization.model;

import com.negocil.negoturismo.admin.feature.organization.enums.OrganizationHighlightsStatus;
import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.SQLRestriction;

import java.time.Instant;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = ConcreteTableModel.ORGANIZATION_HIGHLIGHTS)
@SQLRestriction("status = 'ACTIVE' AND started_at <= CURRENT_TIMESTAMP AND completed_at >= CURRENT_TIMESTAMP")
public class OrganizationHighlights extends CommonModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    protected OrganizationHighlightsStatus status = OrganizationHighlightsStatus.PENDENT;

    protected Instant startedAt;
    protected Instant completedAt;

    @Size(max = 2000)
    private String description;

    private String concat;
}
