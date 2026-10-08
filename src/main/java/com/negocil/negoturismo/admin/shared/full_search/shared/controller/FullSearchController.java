package com.negocil.negoturismo.admin.shared.full_search.shared.controller;

import com.negocil.negoturismo.admin.shared.core.annotation.CanPermission;
import com.negocil.negoturismo.admin.shared.core.enums.PermissionCode;
import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import com.negocil.negoturismo.admin.shared.full_search.shared.service.FullSearchIndexService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(RouteNamed.FULL_SEARCH)
@Tag(name = "Full Search", description = "Endpoints for full search index management")
public class FullSearchController {
    private final FullSearchIndexService indexService;

    @PostMapping("/reindex")
    @Operation(operationId = "reindexFullSearch", summary = "Reindex all searchable entities")
    @CanPermission(PermissionCode.FULL_SEARCH_REINDEX)
    public ResponseEntity<Void> reindex() {
        indexService.reindexAll();
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
