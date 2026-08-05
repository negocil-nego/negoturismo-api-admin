package com.negocil.negoturismo.admin.feature.interpreter.controller;

import com.negocil.negoturismo.admin.feature.interpreter.dto.response.InterpreterResponse;
import com.negocil.negoturismo.admin.feature.interpreter.service.InterpreterService;
import com.negocil.negoturismo.admin.shared.core.annotation.CanPermission;
import com.negocil.negoturismo.admin.shared.core.enums.PermissionCode;
import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.INTERPRETER)
@Tag(name = "Interpreter", description = "Endpoints for interpreters management")
public class InterpreterController {
    private final InterpreterService service;

    @GetMapping("/{uuid}")
    @Operation(summary = "Get interpreter by uuid")
    @CanPermission(PermissionCode.READ_INTERPRETER)
    public ResponseEntity<InterpreterResponse> findByUuid(@PathVariable UUID uuid) {
        return ResponseEntity.ok(InterpreterResponse.of(service.findByUuid(uuid)));
    }

    @DeleteMapping("/{uuid}")
    @Operation(summary = "Delete interpreter by uuid")
    @CanPermission(PermissionCode.DELETE_INTERPRETER)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        service.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
