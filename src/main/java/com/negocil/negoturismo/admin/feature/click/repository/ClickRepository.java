package com.negocil.negoturismo.admin.feature.click.repository;

import com.negocil.negoturismo.admin.feature.click.enums.ClickType;
import com.negocil.negoturismo.admin.feature.click.model.Click;
import com.negocil.negoturismo.admin.shared.core.repository.CommonRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface ClickRepository extends CommonRepository<Click> {

    @Query("SELECT c.type, SUM(c.count) FROM Click c WHERE c.createdAt >= :startOfDay GROUP BY c.type")
    List<Object[]> countByTypeToday(@Param("startOfDay") Instant startOfDay);

    long countByTypeAndCreatedAtBetween(ClickType type, Instant start, Instant end);
}
