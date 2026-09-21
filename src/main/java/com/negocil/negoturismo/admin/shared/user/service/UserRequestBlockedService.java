package com.negocil.negoturismo.admin.shared.user.service;

import com.negocil.negoturismo.admin.shared.user.enums.UserRequestBlockedStatus;
import com.negocil.negoturismo.admin.shared.user.enums.UserStatus;
import com.negocil.negoturismo.admin.shared.user.model.UserRequestBlocked;
import com.negocil.negoturismo.admin.shared.user.repository.UserRequestBlockedRepository;
import com.negocil.negoturismo.admin.shared.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserRequestBlockedService {
    private final UserRequestBlockedRepository repository;
    private final UserRepository userRepository;

    public List<UserRequestBlocked> findAllPending() {
        return repository.findByStatusOrderByCreatedAtDesc(UserRequestBlockedStatus.PENDING);
    }

    public UserRequestBlocked findByUuid(UUID uuid) {
        return repository.findByUuid(uuid)
                .orElseThrow(() -> new RuntimeException("User request blocked not found"));
    }

    @Transactional
    public UserRequestBlocked approve(UUID uuid, String responseComment) {
        var request = findByUuid(uuid);
        request.setStatus(UserRequestBlockedStatus.APPROVED);
        request.setResponseComment(responseComment);
        var user = request.getUser();
        user.setStatus(UserStatus.ACTIVE);
        userRepository.save(user);
        return repository.save(request);
    }

    @Transactional
    public UserRequestBlocked reject(UUID uuid, String responseComment) {
        var request = findByUuid(uuid);
        request.setStatus(UserRequestBlockedStatus.REJECTED);
        request.setResponseComment(responseComment);
        return repository.save(request);
    }
}
