package com.negocil.negoturismo.admin.feature.tour_guide.controller;

import com.negocil.negoturismo.admin.feature.tour_guide.dto.request.TourGuideFilterPaginate;
import com.negocil.negoturismo.admin.feature.tour_guide.dto.request.TourGuideRequest;
import com.negocil.negoturismo.admin.feature.tour_guide.dto.response.TourGuidePaginate;
import com.negocil.negoturismo.admin.feature.tour_guide.dto.response.TourGuideResponse;
import com.negocil.negoturismo.admin.feature.tour_guide.service.TourGuideService;
import com.negocil.negoturismo.admin.feature.user.repository.UserRepository;
import com.negocil.negoturismo.admin.shared.core.annotation.CanPermission;
import com.negocil.negoturismo.admin.shared.core.enums.PermissionCode;
import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.TOUR_GUIDE)
@Tag(name = "Tour Guide", description = "Endpoints for tour guide management")
public class TourGuideController {
    private final TourGuideService service;
    private final UserRepository userRepository;

    @GetMapping()
    @Operation(summary = "Get tour guides by filter")
    @CanPermission(PermissionCode.READ_TOUR_GUIDE)
    public ResponseEntity<TourGuidePaginate> findByFilter(@ParameterObject @ModelAttribute TourGuideFilterPaginate filter) {
        return ResponseEntity.ok(TourGuidePaginate.of(service.findAll(filter)));
    }

    @GetMapping("/search")
    @Operation(summary = "Search tour guides using full-text search")
    @CanPermission(PermissionCode.READ_TOUR_GUIDE)
    public ResponseEntity<TourGuidePaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(TourGuidePaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @GetMapping("/{uuid}")
    @Operation(summary = "Get tour guide by uuid")
    @CanPermission(PermissionCode.READ_TOUR_GUIDE)
    public ResponseEntity<TourGuideResponse> findByUuid(@PathVariable UUID uuid) {
        return ResponseEntity.ok(TourGuideResponse.of(service.findByUuid(uuid)));
    }

    @PostMapping
    @Operation(summary = "Create tour guide")
    @CanPermission(PermissionCode.CREATE_TOUR_GUIDE)
    public ResponseEntity<TourGuideResponse> save(@RequestBody @Valid TourGuideRequest request) {
        var user = userRepository.findByUuid(request.userUuid()).orElseThrow();
        var tourGuide = com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide.builder()
                .user(user)
                .build();
        var saved = service.save(tourGuide);
        return new ResponseEntity<>(TourGuideResponse.of(saved), HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    @Operation(summary = "Update tour guide")
    @CanPermission(PermissionCode.UPDATE_TOUR_GUIDE)
    public ResponseEntity<TourGuideResponse> update(@PathVariable UUID uuid, @RequestBody @Valid TourGuideRequest request) {
        var user = userRepository.findByUuid(request.userUuid()).orElseThrow();
        var tourGuide = com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide.builder()
                .user(user)
                .build();
        var updated = service.update(uuid, tourGuide);
        return new ResponseEntity<>(TourGuideResponse.of(updated), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{uuid}")
    @Operation(summary = "Delete tour guide by uuid")
    @CanPermission(PermissionCode.DELETE_TOUR_GUIDE)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        service.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
