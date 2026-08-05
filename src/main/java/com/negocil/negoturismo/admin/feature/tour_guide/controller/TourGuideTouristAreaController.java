package com.negocil.negoturismo.admin.feature.tour_guide.controller;

import com.negocil.negoturismo.admin.feature.tour_guide.dto.request.TourGuideTouristAreaRequest;
import com.negocil.negoturismo.admin.feature.tour_guide.dto.response.TourGuideTouristAreaResponse;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuideTouristArea;
import com.negocil.negoturismo.admin.feature.tour_guide.repository.TourGuideRepository;
import com.negocil.negoturismo.admin.feature.tour_guide.repository.TouristAreaRepository;
import com.negocil.negoturismo.admin.feature.tour_guide.service.TourGuideTouristAreaService;
import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.TOUR_GUIDE_TOURIST_AREA)
@Tag(name = "Tour Guide Tourist Area", description = "Endpoints for tour guide tourist area associations")
public class TourGuideTouristAreaController {
    private final TourGuideTouristAreaService service;
    private final TourGuideRepository tourGuideRepository;
    private final TouristAreaRepository touristAreaRepository;

    @PostMapping
    @Operation(summary = "Create tour guide tourist area association")
    public ResponseEntity<TourGuideTouristAreaResponse> save(@RequestBody @Valid TourGuideTouristAreaRequest request) {
        var tourGuide = tourGuideRepository.findByUuid(request.tourGuideUuid())
                .orElseThrow(() -> new com.negocil.negoturismo.admin.shared.core.exception.NotFoundException(request.tourGuideUuid()));
        var touristArea = touristAreaRepository.findByUuid(request.touristAreaUuid())
                .orElseThrow(() -> new com.negocil.negoturismo.admin.shared.core.exception.NotFoundException(request.touristAreaUuid()));
        var saved = service.create(tourGuide, touristArea, request.price());
        return new ResponseEntity<>(TourGuideTouristAreaResponse.of(saved), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete tour guide tourist area association by id")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
