package com.negocil.negoturismo.admin.shared.user.controller;

import com.negocil.negoturismo.admin.shared.user.dto.request.UserRequestBlockedActionDto;
import com.negocil.negoturismo.admin.shared.user.dto.response.UserRequestBlockedResponse;
import com.negocil.negoturismo.admin.shared.user.service.UserRequestBlockedService;
import com.negocil.negoturismo.admin.shared.core.annotation.CanPermission;
import com.negocil.negoturismo.admin.shared.core.enums.PermissionCode;
import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.USER_REQUEST_BLOCKED)
@Tag(name = "User Request Blocked", description = "Endpoints for managing user unlock requests")
public class UserRequestBlockedController {
    private final UserRequestBlockedService service;

    @GetMapping()
    @Operation(operationId = "adminListUserRequestBlockeds", summary = "List all pending unlock requests")
    @CanPermission(PermissionCode.READ_USER_REQUEST_BLOCKED)
    public ResponseEntity<List<UserRequestBlockedResponse>> findAll() {
        return ResponseEntity.ok(service.findAllPending().stream()
                .map(UserRequestBlockedResponse::of)
                .toList());
    }

    @GetMapping("/{uuid}")
    @Operation(operationId = "adminGetUserRequestBlocked", summary = "Get a single unlock request by uuid")
    @CanPermission(PermissionCode.READ_USER_REQUEST_BLOCKED)
    public ResponseEntity<UserRequestBlockedResponse> findByUuid(@PathVariable UUID uuid) {
        return ResponseEntity.ok(UserRequestBlockedResponse.of(service.findByUuid(uuid)));
    }

    @PutMapping("/{uuid}/approve")
    @Operation(operationId = "adminApproveUserRequestBlocked", summary = "Approve unlock request and activate user account")
    @CanPermission(PermissionCode.UPDATE_USER_REQUEST_BLOCKED)
    public ResponseEntity<UserRequestBlockedResponse> approve(
            @PathVariable UUID uuid,
            @RequestBody(required = false) UserRequestBlockedActionDto request
    ) {
        String responseComment = request != null ? request.responseComment() : null;
        return ResponseEntity.ok(UserRequestBlockedResponse.of(service.approve(uuid, responseComment)));
    }

    @PutMapping("/{uuid}/reject")
    @Operation(operationId = "adminRejectUserRequestBlocked", summary = "Reject unlock request")
    @CanPermission(PermissionCode.UPDATE_USER_REQUEST_BLOCKED)
    public ResponseEntity<UserRequestBlockedResponse> reject(
            @PathVariable UUID uuid,
            @RequestBody(required = false) UserRequestBlockedActionDto request
    ) {
        String responseComment = request != null ? request.responseComment() : null;
        return ResponseEntity.ok(UserRequestBlockedResponse.of(service.reject(uuid, responseComment)));
    }
}
