package com.negocil.negoturismo.admin.feature.tour_guide.controller;

import com.negocil.negoturismo.admin.feature.tour_guide.dto.request.TouristAreaRequest;
import com.negocil.negoturismo.admin.feature.tour_guide.dto.response.TouristAreaPaginate;
import com.negocil.negoturismo.admin.feature.tour_guide.dto.response.TouristAreaResponse;
import com.negocil.negoturismo.admin.feature.tour_guide.service.TouristAreaService;
import com.negocil.negoturismo.admin.shared.core.annotation.CanPermission;
import com.negocil.negoturismo.admin.shared.core.enums.PermissionCode;
import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.TOURIST_AREA)
@Tag(name = "Tourist Area", description = "Endpoints for tourist area management")
public class TouristAreaController {
    private final TouristAreaService service;

    @GetMapping()
    @Operation(summary = "Get all entities paginated")
    @CanPermission(PermissionCode.READ_TOURIST_AREA)
    public ResponseEntity<TouristAreaPaginate> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(TouristAreaPaginate.of(service.findAll(PageRequest.of(page, size))));
    }

    @GetMapping("/search")
    @Operation(summary = "Search tourist areas using full-text search")
    @CanPermission(PermissionCode.READ_TOURIST_AREA)
    public ResponseEntity<TouristAreaPaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(TouristAreaPaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @GetMapping("/{uuid}")
    @Operation(summary = "Get tourist area by uuid")
    @CanPermission(PermissionCode.READ_TOURIST_AREA)
    public ResponseEntity<TouristAreaResponse> findByUuid(@PathVariable UUID uuid) {
        return ResponseEntity.ok(TouristAreaResponse.of(service.findByUuid(uuid)));
    }

    @PostMapping
    @Operation(summary = "Create tourist area")
    @CanPermission(PermissionCode.CREATE_TOURIST_AREA)
    public ResponseEntity<TouristAreaResponse> save(@RequestBody @Valid TouristAreaRequest touristAreaDto) {
        var touristArea = service.save(touristAreaDto.toModel());
        return new ResponseEntity<>(TouristAreaResponse.of(touristArea), HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    @Operation(summary = "Update tourist area")
    @CanPermission(PermissionCode.UPDATE_TOURIST_AREA)
    public ResponseEntity<TouristAreaResponse> update(@PathVariable UUID uuid, @RequestBody @Valid TouristAreaRequest touristAreaDto) {
        var touristArea = service.update(uuid, touristAreaDto.toModel());
        return new ResponseEntity<>(TouristAreaResponse.of(touristArea), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{uuid}")
    @Operation(summary = "Delete tourist area by uuid")
    @CanPermission(PermissionCode.DELETE_TOURIST_AREA)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        service.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
