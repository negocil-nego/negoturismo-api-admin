package com.negocil.negoturismo.admin.feature.travel.controller;

import com.negocil.negoturismo.admin.feature.organization.service.OrganizationService;
import com.negocil.negoturismo.admin.feature.travel.dto.request.TravelRequest;
import com.negocil.negoturismo.admin.feature.travel.dto.response.TravelPaginate;
import com.negocil.negoturismo.admin.feature.travel.dto.response.TravelResponse;
import com.negocil.negoturismo.admin.feature.travel.service.TravelService;
import com.negocil.negoturismo.admin.shared.core.annotation.CanPermission;
import com.negocil.negoturismo.admin.shared.core.enums.PermissionCode;
import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.TRAVEL)
@Tag(name = "Travel", description = "Endpoints for travels management")
public class TravelController {
    private final TravelService service;
    private final OrganizationService organizationService;

    @GetMapping()
    @Operation(operationId = "listTravels", summary = "Get all entities paginated")
    @CanPermission(PermissionCode.READ_TRAVEL)
    public ResponseEntity<TravelPaginate> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(TravelPaginate.of(service.findAll(PageRequest.of(page, size))));
    }

    @GetMapping("/search")
    @Operation(operationId = "searchTravels", summary = "Search travels using full-text search")
    @CanPermission(PermissionCode.READ_TRAVEL)
    public ResponseEntity<TravelPaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(TravelPaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @PostMapping
    @Operation(operationId = "createTravel", summary = "Create travel")
    @CanPermission(PermissionCode.CREATE_TRAVEL)
    public ResponseEntity<TravelResponse> save(@RequestBody @Valid TravelRequest travelDto) {
        var model = travelDto.toModel();
        model.setOrganization(organizationService.findByUuid(travelDto.organizationUuid()));
        var travel = service.save(model);
        return new ResponseEntity<>(TravelResponse.of(travel), HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    @Operation(operationId = "updateTravel", summary = "Update travel")
    @CanPermission(PermissionCode.UPDATE_TRAVEL)
    public ResponseEntity<TravelResponse> update(@PathVariable UUID uuid, @RequestBody @Valid TravelRequest travelDto) {
        var model = travelDto.toModel();
        model.setOrganization(organizationService.findByUuid(travelDto.organizationUuid()));
        var travel = service.update(uuid, model);
        return new ResponseEntity<>(TravelResponse.of(travel), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{uuid}")
    @Operation(operationId = "deleteTravel", summary = "Delete travel by uuid")
    @CanPermission(PermissionCode.DELETE_TRAVEL)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        service.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
