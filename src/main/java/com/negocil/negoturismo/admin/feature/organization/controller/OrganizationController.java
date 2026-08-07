package com.negocil.negoturismo.admin.feature.organization.controller;

import com.negocil.negoturismo.admin.feature.organization.dto.request.OrganizationRequest;
import com.negocil.negoturismo.admin.feature.organization.dto.response.OrganizationPaginate;
import com.negocil.negoturismo.admin.feature.organization.dto.response.OrganizationResponse;
import com.negocil.negoturismo.admin.feature.organization.service.OrganizationService;
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
@RequestMapping(RouteNamed.ORGANIZATION)
@Tag(name = "Organization", description = "Endpoints for organizations management")
public class OrganizationController {
    private final OrganizationService service;

    @GetMapping()
    @Operation(operationId = "listOrganizations", summary = "Get all entities paginated")
    @CanPermission(PermissionCode.READ_ORGANIZATION)
    public ResponseEntity<OrganizationPaginate> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(OrganizationPaginate.of(service.findAll(PageRequest.of(page, size))));
    }

    @GetMapping("/search")
    @Operation(operationId = "searchOrganizations", summary = "Search organizations using full-text search")
    @CanPermission(PermissionCode.READ_ORGANIZATION)
    public ResponseEntity<OrganizationPaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(OrganizationPaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @PostMapping
    @Operation(operationId = "createOrganization", summary = "Create organization")
    @CanPermission(PermissionCode.CREATE_ORGANIZATION)
    public ResponseEntity<OrganizationResponse> save(@RequestBody @Valid OrganizationRequest organizationDto) {
        var organization = service.save(organizationDto.toModel());
        return new ResponseEntity<>(OrganizationResponse.of(organization), HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    @Operation(operationId = "updateOrganization", summary = "Update organization")
    @CanPermission(PermissionCode.UPDATE_ORGANIZATION)
    public ResponseEntity<OrganizationResponse> update(@PathVariable UUID uuid, @RequestBody @Valid OrganizationRequest organizationDto) {
        var organization = service.update(uuid, organizationDto.toModel());
        return new ResponseEntity<>(OrganizationResponse.of(organization), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{uuid}")
    @Operation(operationId = "deleteOrganization", summary = "Delete organization by uuid")
    @CanPermission(PermissionCode.DELETE_ORGANIZATION)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        service.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
