package com.negocil.negoturismo.admin.feature.organization.controller;

import com.negocil.negoturismo.admin.feature.organization.dto.request.OrganizationHighlightsRequest;
import com.negocil.negoturismo.admin.feature.organization.dto.response.OrganizationHighlightsPaginate;
import com.negocil.negoturismo.admin.feature.organization.dto.response.OrganizationHighlightsResponse;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationHighlights;
import com.negocil.negoturismo.admin.feature.organization.service.OrganizationHighlightsService;
import com.negocil.negoturismo.admin.feature.organization.service.OrganizationService;
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
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.ORGANIZATION_HIGHLIGHTS)
@Tag(name = "Organization Highlights", description = "Endpoints for organization highlights management")
public class OrganizationHighlightsController {
    private final OrganizationHighlightsService service;
    private final OrganizationService organizationService;

    @GetMapping()
    @Operation(summary = "Get all organization highlights paginated")
    @CanPermission(PermissionCode.READ_ORGANIZATION_HIGHLIGHTS)
    public ResponseEntity<OrganizationHighlightsPaginate> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(OrganizationHighlightsPaginate.of(service.findAll(PageRequest.of(page, size))));
    }

    @GetMapping("/search")
    @Operation(summary = "Search organization highlights using full-text search")
    @CanPermission(PermissionCode.READ_ORGANIZATION_HIGHLIGHTS)
    public ResponseEntity<OrganizationHighlightsPaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(OrganizationHighlightsPaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @PostMapping
    @Operation(summary = "Create organization highlights")
    @CanPermission(PermissionCode.CREATE_ORGANIZATION_HIGHLIGHTS)
    public ResponseEntity<OrganizationHighlightsResponse> save(@RequestBody @Valid OrganizationHighlightsRequest request) {
        var model = request.toModel();
        var organization = organizationService.findByUuid(request.organizationUuid());
        model.setOrganization(organization);
        var saved = service.save(model);
        return new ResponseEntity<>(OrganizationHighlightsResponse.of(saved), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update organization highlights")
    @CanPermission(PermissionCode.UPDATE_ORGANIZATION_HIGHLIGHTS)
    public ResponseEntity<OrganizationHighlightsResponse> update(@PathVariable Long id, @RequestBody @Valid OrganizationHighlightsRequest request) {
        var model = request.toModel();
        var organization = organizationService.findByUuid(request.organizationUuid());
        model.setOrganization(organization);
        var updated = service.update(id, model);
        return new ResponseEntity<>(OrganizationHighlightsResponse.of(updated), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete organization highlights by id")
    @CanPermission(PermissionCode.DELETE_ORGANIZATION_HIGHLIGHTS)
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
