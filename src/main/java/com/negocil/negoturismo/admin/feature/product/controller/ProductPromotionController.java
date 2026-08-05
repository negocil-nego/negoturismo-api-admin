package com.negocil.negoturismo.admin.feature.product.controller;

import com.negocil.negoturismo.admin.feature.product.dto.request.ProductPromotionRequest;
import com.negocil.negoturismo.admin.feature.product.dto.response.ProductPromotionPaginate;
import com.negocil.negoturismo.admin.feature.product.dto.response.ProductPromotionResponse;
import com.negocil.negoturismo.admin.feature.product.service.ProductPromotionService;
import com.negocil.negoturismo.admin.feature.product.service.ProductService;
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
@RequestMapping(RouteNamed.PRODUCT_PROMOTION)
@Tag(name = "Product Promotion", description = "Endpoints for product promotions management")
public class ProductPromotionController {
    private final ProductPromotionService service;
    private final ProductService productService;

    @GetMapping()
    @Operation(summary = "Get all entities paginated")
    @CanPermission(PermissionCode.READ_PRODUCT_PROMOTION)
    public ResponseEntity<ProductPromotionPaginate> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(ProductPromotionPaginate.of(service.findAll(PageRequest.of(page, size))));
    }

    @GetMapping("/search")
    @Operation(summary = "Search product promotions using full-text search")
    @CanPermission(PermissionCode.READ_PRODUCT_PROMOTION)
    public ResponseEntity<ProductPromotionPaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(ProductPromotionPaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @PostMapping
    @Operation(summary = "Create product promotion")
    @CanPermission(PermissionCode.CREATE_PRODUCT_PROMOTION)
    public ResponseEntity<ProductPromotionResponse> save(@RequestBody @Valid ProductPromotionRequest request) {
        var model = request.toModel();
        var product = productService.findByUuid(request.productUuid());
        model.setProduct(product);
        var saved = service.save(model);
        return new ResponseEntity<>(ProductPromotionResponse.of(saved), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update product promotion")
    @CanPermission(PermissionCode.UPDATE_PRODUCT_PROMOTION)
    public ResponseEntity<ProductPromotionResponse> update(@PathVariable Long id, @RequestBody @Valid ProductPromotionRequest request) {
        var model = request.toModel();
        var product = productService.findByUuid(request.productUuid());
        model.setProduct(product);
        var updated = service.update(id, model);
        return new ResponseEntity<>(ProductPromotionResponse.of(updated), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete product promotion by id")
    @CanPermission(PermissionCode.DELETE_PRODUCT_PROMOTION)
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
