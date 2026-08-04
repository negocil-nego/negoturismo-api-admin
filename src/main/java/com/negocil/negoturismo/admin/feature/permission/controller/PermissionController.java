package com.negocil.negoturismo.admin.feature.permission.controller;

import com.negocil.negoturismo.admin.feature.permission.dto.request.PermissionFilterPaginate;
import com.negocil.negoturismo.admin.feature.permission.dto.response.PermissionPaginate;
import com.negocil.negoturismo.admin.feature.permission.dto.response.PermissionResponse;
import com.negocil.negoturismo.admin.feature.permission.dto.request.PermissionRequest;
import com.negocil.negoturismo.admin.feature.permission.service.PermissionService;
import com.negocil.negoturismo.admin.shared.core.annotation.CanPermission;
import com.negocil.negoturismo.admin.shared.core.enums.PermissionCode;
import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.PERMISSION)
@Tag(name = "Permission", description = "Endpoints for permissions management")
public class PermissionController {
    private final PermissionService service;

    @GetMapping()
    @Operation(summary = "Get permissions by filter")
    @CanPermission(PermissionCode.READ_PERMISSION)
    public ResponseEntity<PermissionPaginate> findByFilter(@ParameterObject @ModelAttribute PermissionFilterPaginate filter) {
        return ResponseEntity.ok(PermissionPaginate.of(service.findAll(filter)));
    }

    @GetMapping("/search")
    @Operation(summary = "Search permissions using full-text search")
    @CanPermission(PermissionCode.READ_PERMISSION)
    public ResponseEntity<PermissionPaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(PermissionPaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @PostMapping
    @Operation(summary = "Create permission")
    @CanPermission(PermissionCode.CREATE_PERMISSION)
    public ResponseEntity<PermissionResponse> save(@RequestBody @Valid PermissionRequest permissionDto) {
        var permission = service.save(permissionDto.toModel());
        return new ResponseEntity<>(PermissionResponse.of(permission), HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    @Operation(summary = "Update permission")
    @CanPermission(PermissionCode.UPDATE_PERMISSION)
    public ResponseEntity<PermissionResponse> update(@PathVariable UUID uuid, @RequestBody @Valid PermissionRequest permissionDto) {
        var permission = service.update(uuid, permissionDto.toModel());
        return new ResponseEntity<>(PermissionResponse.of(permission), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{uuid}")
    @Operation(summary = "Delete permission by uuid")
    @CanPermission(PermissionCode.DELETE_PERMISSION)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        service.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
