package com.negocil.negoturismo.admin.feature.tour_guide.repository;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import com.negocil.negoturismo.admin.feature.tour_guide.util.TourGuideQuery;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TourGuideRepository extends ConcreteRepository<TourGuide> {
    Optional<TourGuide> findByUserUuid(UUID userUuid);

    @NativeQuery(value = TourGuideQuery.TOUR_GUIDE_SEARCH, countQuery = TourGuideQuery.TOUR_GUIDE_SEARCH_COUNT)
    Page<TourGuide> search(@Param("query") String query, Pageable pageable);
}
