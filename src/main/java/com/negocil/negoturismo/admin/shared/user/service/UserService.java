package com.negocil.negoturismo.admin.shared.user.service;

import com.negocil.negoturismo.admin.shared.user.exception.UserNotFoundException;
import com.negocil.negoturismo.admin.shared.user.exception.UserPhoneNotFoundException;
import com.negocil.negoturismo.admin.shared.user.exception.UserUsernameNotFoundException;
import com.negocil.negoturismo.admin.shared.user.exception.UserEmailNotFoundException;
import com.negocil.negoturismo.admin.shared.user.enums.UserStatus;
import com.negocil.negoturismo.admin.shared.user.repository.UserRepository;
import com.negocil.negoturismo.admin.shared.user.model.User;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class UserService extends ConcreteService<User> implements IFindOrCreate<User> {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<User> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username).orElseThrow(() -> new UserUsernameNotFoundException(username));
    }

    public User findByEmail(String email) {
        return repository.findByEmail(email).orElseThrow(() -> new UserEmailNotFoundException(email));
    }

    public User findByUsernameOrEmail(String usernameOrEmail) {
        return usernameOrEmail.contains("@") ? findByEmail(usernameOrEmail) : findByUsername(usernameOrEmail);
    }

    public User findByPhone(String phone) {
        return repository.findByPhone(phone).orElseThrow(() -> new UserPhoneNotFoundException(phone));
    }

    public User findByPhoneOrEmail(String phoneOrEmail) {
        return phoneOrEmail.contains("@") ? findByEmail(phoneOrEmail) : findByPhone(phoneOrEmail);
    }

    public void updateStatus(User user, UserStatus status) {
        user.setStatus(status);
        repository.save(user);
    }

    public void invalidateTokens(User user) {
        user.setTokensInvalidatedAt(Instant.now());
        repository.save(user);
    }

    public void updateTokensInvalidatedAt(User user, Instant tokensInvalidatedAt) {
        user.setTokensInvalidatedAt(tokensInvalidatedAt);
        repository.save(user);
    }

    @Override
    public User findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new UserNotFoundException(uuid));
    }

    @Override
    public User findOrCreate(User model) {
        return repository.findByUsername(model.getUsername()).orElseGet(() -> save(model));
    }
}
