package com.negocil.negoturismo.admin.feature.click.controller;

import com.negocil.negoturismo.admin.feature.click.dto.response.ClickTodayResponse;
import com.negocil.negoturismo.admin.feature.click.service.ClickService;
import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.CLICK)
@Tag(name = "Click", description = "Endpoints for click tracking")
public class ClickController {

    private final ClickService service;

    @GetMapping("/today")
    @Operation(operationId = "adminGetClicksToday", summary = "Get clicks today by type", description = "Retrieve the total number of clicks for each type (PRODUCT, INTERPRETER, TOUR_GUIDE, TOURIST_AREA) for the current day.")
    public ResponseEntity<ClickTodayResponse> getClicksToday() {
        return ResponseEntity.ok(service.getClicksToday());
    }
}
