package com.negocil.negoturismo.admin.feature.tour_guide.model;

import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import com.negocil.negoturismo.admin.shared.core.util.ConstraintUniqueKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = ConcreteTableModel.TOUR_GUIDE_TOURIST_AREA, uniqueConstraints = {
        @UniqueConstraint(name = ConstraintUniqueKey.TOUR_GUIDE_TOURIST_AREA_TG, columnNames = "tour_guide_id"),
        @UniqueConstraint(name = ConstraintUniqueKey.TOUR_GUIDE_TOURIST_AREA_TA, columnNames = "tourist_area_id")
})
public class TourGuideTouristArea extends CommonModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tour_guide_id", nullable = false)
    private TourGuide tourGuide;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tourist_area_id", nullable = false)
    private TouristArea touristArea;

    @jakarta.validation.constraints.NotNull
    @Builder.Default
    private BigDecimal price = BigDecimal.ZERO;
}
