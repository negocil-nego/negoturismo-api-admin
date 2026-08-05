package com.negocil.negoturismo.admin.feature.product.repository;

import com.negocil.negoturismo.admin.feature.product.model.ProductPromotion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Optional;

@Repository
public interface ProductPromotionRepository extends JpaRepository<ProductPromotion, Long>, JpaSpecificationExecutor<ProductPromotion> {
    @Query(name = "ProductPromotion.search", countQuery = "ProductPromotion.countSearch", nativeQuery = true)
    Page<ProductPromotion> search(@Param("query") String query, Pageable pageable);

    @Modifying
    @Transactional
    @Query("UPDATE ProductPromotion p SET p.status = com.negocil.negoturismo.admin.feature.product.enums.ProductPromotionStatus.EXPIRED WHERE p.completedAt < :now AND p.status != com.negocil.negoturismo.admin.feature.product.enums.ProductPromotionStatus.EXPIRED")
    int updateStatusToExpired(@Param("now") Instant now);

    Optional<ProductPromotion> findByProduct(com.negocil.negoturismo.admin.feature.product.model.Product product);
}
