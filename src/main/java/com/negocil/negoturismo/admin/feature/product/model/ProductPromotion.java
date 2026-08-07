package com.negocil.negoturismo.admin.feature.product.model;

import com.negocil.negoturismo.admin.feature.product.enums.ProductPromotionStatus;
import com.negocil.negoturismo.admin.shared.core.model.CommonModel;
import com.negocil.negoturismo.admin.shared.core.util.ConcreteTableModel;
import jakarta.persistence.*;
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
@Table(name = ConcreteTableModel.PRODUCT_PROMOTION)
@SQLRestriction("status = 'ACTIVE' AND started_at <= CURRENT_TIMESTAMP AND completed_at >= CURRENT_TIMESTAMP")
public class ProductPromotion extends CommonModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    protected ProductPromotionStatus status = ProductPromotionStatus.PENDENT;

    protected Instant startedAt;
    protected Instant completedAt;

    private double oldPrice;
    private double newPrice;

    private String concat;
}
