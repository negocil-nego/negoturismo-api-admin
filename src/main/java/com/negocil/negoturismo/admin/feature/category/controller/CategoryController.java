package com.negocil.negoturismo.admin.feature.category.controller;

import com.negocil.negoturismo.admin.feature.category.dto.request.CategoryRequest;
import com.negocil.negoturismo.admin.feature.category.dto.response.CategoryPaginate;
import com.negocil.negoturismo.admin.feature.category.dto.response.CategoryResponse;
import com.negocil.negoturismo.admin.feature.category.service.CategoryService;
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
@RequestMapping(RouteNamed.CATEGORY)
@Tag(name = "Category", description = "Endpoints for categories management")
public class CategoryController {
    private final CategoryService service;

    @GetMapping()
    @Operation(summary = "Get all entities paginated")
    @CanPermission(PermissionCode.READ_CATEGORY)
    public ResponseEntity<CategoryPaginate> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(CategoryPaginate.of(service.findAll(PageRequest.of(page, size))));
    }

    @GetMapping("/search")
    @Operation(summary = "Search categories using full-text search")
    @CanPermission(PermissionCode.READ_CATEGORY)
    public ResponseEntity<CategoryPaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(CategoryPaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @PostMapping
    @Operation(summary = "Create category")
    @CanPermission(PermissionCode.CREATE_CATEGORY)
    public ResponseEntity<CategoryResponse> save(@RequestBody @Valid CategoryRequest categoryDto) {
        var category = service.save(categoryDto.toModel());
        return new ResponseEntity<>(CategoryResponse.of(category), HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    @Operation(summary = "Update category")
    @CanPermission(PermissionCode.UPDATE_CATEGORY)
    public ResponseEntity<CategoryResponse> update(@PathVariable UUID uuid, @RequestBody @Valid CategoryRequest categoryDto) {
        var category = service.update(uuid, categoryDto.toModel());
        return new ResponseEntity<>(CategoryResponse.of(category), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{uuid}")
    @Operation(summary = "Delete category by uuid")
    @CanPermission(PermissionCode.DELETE_CATEGORY)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        service.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}