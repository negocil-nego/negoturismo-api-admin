package com.negocil.negoturismo.admin.feature.product.controller;

import com.negocil.negoturismo.admin.feature.product.dto.request.ProductRequest;
import com.negocil.negoturismo.admin.feature.product.dto.response.ProductPaginate;
import com.negocil.negoturismo.admin.feature.product.dto.response.ProductResponse;
import com.negocil.negoturismo.admin.feature.product.service.ProductService;
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
@RequestMapping(RouteNamed.PRODUCT)
@Tag(name = "Product", description = "Endpoints for products management")
public class ProductController {
    private final ProductService service;

    @GetMapping()
    @Operation(summary = "Get all entities paginated")
    @CanPermission(PermissionCode.READ_PRODUCT)
    public ResponseEntity<ProductPaginate> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(ProductPaginate.of(service.findAll(PageRequest.of(page, size))));
    }

    @GetMapping("/search")
    @Operation(summary = "Search products using full-text search")
    @CanPermission(PermissionCode.READ_PRODUCT)
    public ResponseEntity<ProductPaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(ProductPaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @PostMapping
    @Operation(summary = "Create product")
    @CanPermission(PermissionCode.CREATE_PRODUCT)
    public ResponseEntity<ProductResponse> save(@RequestBody @Valid ProductRequest productDto) {
        var product = service.save(productDto.toModel());
        return new ResponseEntity<>(ProductResponse.of(product), HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    @Operation(summary = "Update product")
    @CanPermission(PermissionCode.UPDATE_PRODUCT)
    public ResponseEntity<ProductResponse> update(@PathVariable UUID uuid, @RequestBody @Valid ProductRequest productDto) {
        var product = service.update(uuid, productDto.toModel());
        return new ResponseEntity<>(ProductResponse.of(product), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{uuid}")
    @Operation(summary = "Delete product by uuid")
    @CanPermission(PermissionCode.DELETE_PRODUCT)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        service.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
