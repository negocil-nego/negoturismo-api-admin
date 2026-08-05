package com.negocil.negoturismo.admin.feature.user.controller;

import com.negocil.negoturismo.admin.feature.user.dto.request.UserRequest;
import com.negocil.negoturismo.admin.feature.user.dto.response.UserPaginate;
import com.negocil.negoturismo.admin.feature.user.dto.response.UserResponse;
import com.negocil.negoturismo.admin.feature.user.service.UserService;
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
@RequestMapping(RouteNamed.USER)
@Tag(name = "User", description = "Endpoints for users management")
public class UserController {
    private final UserService service;

    @GetMapping()
    @Operation(summary = "Get all entities paginated")
    @CanPermission(PermissionCode.READ_USER)
    public ResponseEntity<UserPaginate> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(UserPaginate.of(service.findAll(PageRequest.of(page, size))));
    }

    @GetMapping("/search")
    @Operation(summary = "Search users using full-text search")
    @CanPermission(PermissionCode.READ_USER)
    public ResponseEntity<UserPaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(UserPaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @PostMapping
    @Operation(summary = "Create user")
    @CanPermission(PermissionCode.CREATE_USER)
    public ResponseEntity<UserResponse> save(@RequestBody @Valid UserRequest userDto) {
        var user = service.save(userDto.toModel());
        return new ResponseEntity<>(UserResponse.of(user), HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    @Operation(summary = "Update user")
    @CanPermission(PermissionCode.UPDATE_USER)
    public ResponseEntity<UserResponse> update(@PathVariable UUID uuid, @RequestBody @Valid UserRequest userDto) {
        var user = service.update(uuid, userDto.toModel());
        return new ResponseEntity<>(UserResponse.of(user), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{uuid}")
    @Operation(summary = "Delete user by uuid")
    @CanPermission(PermissionCode.DELETE_USER)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        service.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
