package com.negocil.negoturismo.admin.feature.socialnetwork.controller;

import com.negocil.negoturismo.admin.feature.socialnetwork.dto.request.SocialNetworkRequest;
import com.negocil.negoturismo.admin.feature.socialnetwork.dto.response.SocialNetworkResponse;
import com.negocil.negoturismo.admin.feature.socialnetwork.model.SocialNetwork;
import com.negocil.negoturismo.admin.feature.socialnetwork.service.SocialNetworkService;
import com.negocil.negoturismo.admin.shared.core.annotation.CanPermission;
import com.negocil.negoturismo.admin.shared.core.enums.PermissionCode;
import com.negocil.negoturismo.admin.shared.core.util.RouteNamed;
import com.negocil.negoturismo.admin.shared.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(RouteNamed.SOCIAL_NETWORK)
@RequiredArgsConstructor
@Tag(name = "Social Network", description = "Endpoints for social network management")
public class SocialNetworkController {
    private final SocialNetworkService socialNetworkService;
    private final UserService userService;

    @GetMapping("/user/{userUuid}")
    @Operation(operationId = "getSocialNetworkByUser", summary = "Get social network by user UUID")
    @CanPermission(PermissionCode.READ_USER)
    public ResponseEntity<SocialNetworkResponse> getByUser(@PathVariable UUID userUuid) {
        var user = userService.findByUuid(userUuid);
        var socialNetwork = socialNetworkService.findOrCreateByUser(user);
        return ResponseEntity.ok(SocialNetworkResponse.of(socialNetwork));
    }

    @PostMapping
    @Operation(operationId = "createSocialNetwork", summary = "Create or update social network for user")
    @CanPermission(PermissionCode.CREATE_USER)
    public ResponseEntity<SocialNetworkResponse> save(@RequestBody @Valid SocialNetworkRequest request) {
        var user = userService.findByUuid(request.userUuid());
        var socialNetwork = socialNetworkService.findOrCreateByUser(user);

        socialNetwork.setWhatsapp(request.whatsapp());
        socialNetwork.setInstagram(request.instagram());
        socialNetwork.setTiktok(request.tiktok());
        socialNetwork.setFacebook(request.facebook());
        socialNetwork.setYoutube(request.youtube());
        socialNetwork.setLinkedin(request.linkedin());
        socialNetwork.setTelegram(request.telegram());

        var saved = socialNetworkService.save(socialNetwork);
        return new ResponseEntity<>(SocialNetworkResponse.of(saved), HttpStatus.CREATED);
    }

    @DeleteMapping("/{uuid}")
    @Operation(operationId = "deleteSocialNetwork", summary = "Delete social network by UUID")
    @CanPermission(PermissionCode.DELETE_USER)
    public ResponseEntity<Void> deleteByUuid(@PathVariable UUID uuid) {
        socialNetworkService.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
