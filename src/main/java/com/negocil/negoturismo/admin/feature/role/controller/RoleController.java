package com.negocil.negoturismo.admin.feature.role.controller;

import com.negocil.negoturismo.admin.feature.role.dto.request.RoleRequest;
import com.negocil.negoturismo.admin.feature.role.dto.response.RolePaginate;
import com.negocil.negoturismo.admin.feature.role.dto.response.RoleResponse;
import com.negocil.negoturismo.admin.feature.role.service.RoleService;
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
@RequestMapping(RouteNamed.ROLE)
@Tag(name = "Role", description = "Endpoints for roles management")
public class RoleController {
    private final RoleService service;

    @GetMapping()
    @Operation(summary = "Get all entities paginated")
    @CanPermission(PermissionCode.READ_ROLE)
    public ResponseEntity<RolePaginate> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(RolePaginate.of(service.findAll(PageRequest.of(page, size))));
    }

    @GetMapping("/search")
    @Operation(summary = "Search roles using full-text search")
    @CanPermission(PermissionCode.READ_ROLE)
    public ResponseEntity<RolePaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(RolePaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @PostMapping
    @Operation(summary = "Create role")
    @CanPermission(PermissionCode.CREATE_ROLE)
    public ResponseEntity<RoleResponse> save(@RequestBody @Valid RoleRequest roleDto) {
        var role = service.save(roleDto.toModel());
        return new ResponseEntity<>(RoleResponse.of(role), HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    @Operation(summary = "Update role")
    @CanPermission(PermissionCode.UPDATE_ROLE)
    public ResponseEntity<RoleResponse> update(@PathVariable UUID uuid, @RequestBody @Valid RoleRequest roleDto) {
        var role = service.update(uuid, roleDto.toModel());
        return new ResponseEntity<>(RoleResponse.of(role), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{uuid}")
    @Operation(summary = "Delete role by uuid")
    @CanPermission(PermissionCode.DELETE_ROLE)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        service.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
