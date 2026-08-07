package com.negocil.negoturismo.admin.feature.interpreter.controller;

import com.negocil.negoturismo.admin.feature.interpreter.dto.request.InterpreterLanguageRequest;
import com.negocil.negoturismo.admin.feature.interpreter.dto.response.InterpreterLanguagePaginate;
import com.negocil.negoturismo.admin.feature.interpreter.dto.response.InterpreterLanguageResponse;
import com.negocil.negoturismo.admin.feature.interpreter.service.InterpreterLanguageService;
import com.negocil.negoturismo.admin.feature.interpreter.service.InterpreterService;
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

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.INTERPRETER_LANGUAGE)
@Tag(name = "Interpreter Language", description = "Endpoints for interpreter languages management")
public class InterpreterLanguageController {
    private final InterpreterLanguageService service;
    private final InterpreterService interpreterService;

    @GetMapping()
    @Operation(operationId = "listInterpreterLanguages", summary = "Get all entities paginated")
    @CanPermission(PermissionCode.READ_INTERPRETER)
    public ResponseEntity<InterpreterLanguagePaginate> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(InterpreterLanguagePaginate.of(service.findAll(PageRequest.of(page, size))));
    }

    @GetMapping("/search")
    @Operation(operationId = "searchInterpreterLanguages", summary = "Search interpreter languages using full-text search")
    @CanPermission(PermissionCode.READ_INTERPRETER)
    public ResponseEntity<InterpreterLanguagePaginate> search(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(InterpreterLanguagePaginate.of(service.search(query, PageRequest.of(page, size))));
    }

    @PostMapping
    @Operation(operationId = "createInterpreterLanguage", summary = "Create interpreter language")
    @CanPermission(PermissionCode.CREATE_INTERPRETER)
    public ResponseEntity<InterpreterLanguageResponse> save(@RequestBody @Valid InterpreterLanguageRequest request) {
        var model = request.toModel();
        var interpreter = interpreterService.findByUuid(request.interpreterUuid());
        model.setInterpreter(interpreter);
        model.setConcat(interpreter.getUser().getName() + " " + model.getLanguage());
        var saved = service.save(model);
        return new ResponseEntity<>(InterpreterLanguageResponse.of(saved), HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    @Operation(operationId = "updateInterpreterLanguage", summary = "Update interpreter language")
    @CanPermission(PermissionCode.UPDATE_INTERPRETER)
    public ResponseEntity<InterpreterLanguageResponse> update(@PathVariable UUID uuid, @RequestBody @Valid InterpreterLanguageRequest request) {
        var model = request.toModel();
        var interpreter = interpreterService.findByUuid(request.interpreterUuid());
        model.setInterpreter(interpreter);
        model.setConcat(interpreter.getUser().getName() + " " + model.getLanguage());
        var updated = service.update(uuid, model);
        return new ResponseEntity<>(InterpreterLanguageResponse.of(updated), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{uuid}")
    @Operation(operationId = "deleteInterpreterLanguage", summary = "Delete interpreter language by uuid")
    @CanPermission(PermissionCode.DELETE_INTERPRETER)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        service.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
