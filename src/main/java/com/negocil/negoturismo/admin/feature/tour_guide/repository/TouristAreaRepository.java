package com.negocil.negoturismo.admin.feature.tour_guide.repository;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.feature.tour_guide.util.TouristAreaQuery;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TouristAreaRepository extends ConcreteRepository<TouristArea> {
    Optional<TouristArea> findByName(String name);

    @NativeQuery(value = TouristAreaQuery.TOURIST_AREA_SEARCH, countQuery = TouristAreaQuery.TOURIST_AREA_SEARCH_COUNT)
    Page<TouristArea> search(@Param("query") String query, Pageable pageable);
}
