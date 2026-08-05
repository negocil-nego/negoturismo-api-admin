package com.negocil.negoturismo.admin.feature.tour_guide.service;

import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuideTouristArea;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.feature.tour_guide.repository.TourGuideRepository;
import com.negocil.negoturismo.admin.feature.tour_guide.repository.TourGuideTouristAreaRepository;
import com.negocil.negoturismo.admin.feature.tour_guide.repository.TouristAreaRepository;
import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TourGuideTouristAreaService {
    private final TourGuideTouristAreaRepository repository;
    private final TourGuideRepository tourGuideRepository;
    private final TouristAreaRepository touristAreaRepository;

    public Page<TourGuideTouristArea> findAll(Specification<TourGuideTouristArea> spec, Pageable pageable) {
        return repository.findAll(spec, pageable);
    }

    public TourGuideTouristArea save(TourGuideTouristArea data) {
        return repository.save(data);
    }

    public TourGuideTouristArea create(TourGuide tourGuide, TouristArea touristArea, java.math.BigDecimal price) {
        var model = TourGuideTouristArea.builder()
                .tourGuide(tourGuide)
                .touristArea(touristArea)
                .price(price != null ? price : java.math.BigDecimal.ZERO)
                .build();
        return repository.save(model);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
