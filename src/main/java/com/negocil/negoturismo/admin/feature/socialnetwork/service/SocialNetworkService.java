package com.negocil.negoturismo.admin.feature.socialnetwork.service;

import com.negocil.negoturismo.admin.feature.socialnetwork.model.SocialNetwork;
import com.negocil.negoturismo.admin.feature.socialnetwork.repository.SocialNetworkRepository;
import com.negocil.negoturismo.admin.shared.core.exception.NotFoundException;
import com.negocil.negoturismo.admin.shared.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SocialNetworkService {
    private final SocialNetworkRepository repository;

    public Optional<SocialNetwork> findByUserId(Long userId) {
        return repository.findByUserId(userId);
    }

    public SocialNetwork findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new NotFoundException(uuid));
    }

    public SocialNetwork findOrCreateByUser(User user) {
        return repository.findByUserId(user.getId())
                .orElseGet(() -> {
                    var socialNetwork = SocialNetwork.builder()
                            .user(user)
                            .build();
                    return repository.save(socialNetwork);
                });
    }

    public SocialNetwork save(SocialNetwork socialNetwork) {
        return repository.save(socialNetwork);
    }

    public boolean deleteByUuid(UUID uuid) {
        var item = findByUuid(uuid);
        item.setDeletedAt(java.time.Instant.now());
        repository.save(item);
        return true;
    }
}
