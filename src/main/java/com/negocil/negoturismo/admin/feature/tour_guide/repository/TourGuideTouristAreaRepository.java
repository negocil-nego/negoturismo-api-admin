package com.negocil.negoturismo.admin.feature.tour_guide.repository;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuideTouristArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import java.util.Optional;

@Repository
public interface TourGuideTouristAreaRepository extends JpaRepository<TourGuideTouristArea, Long>, JpaSpecificationExecutor<TourGuideTouristArea> {
    Optional<TourGuideTouristArea> findByTourGuideAndTouristArea(TourGuide tourGuide, TouristArea touristArea);
}
