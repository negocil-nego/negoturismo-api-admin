package com.negocil.negoturismo.admin.feature.tour_guide.repository;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TouristAreaRepository extends ConcreteRepository<TouristArea> {
    Optional<TouristArea> findByName(String name);

    @Query(name = "TouristArea.search", countQuery = "TouristArea.countSearch")
    Page<TouristArea> search(@Param("query") String query, Pageable pageable);
}
