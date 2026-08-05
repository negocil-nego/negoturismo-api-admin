package com.negocil.negoturismo.admin.feature.tour_guide.repository;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuideTouristArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TourGuideTouristAreaRepository extends JpaRepository<TourGuideTouristArea, Long>, JpaSpecificationExecutor<TourGuideTouristArea> {
}
