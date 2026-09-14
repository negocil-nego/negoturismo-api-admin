package com.negocil.negoturismo.admin.feature.user.service;

import com.negocil.negoturismo.admin.feature.user.exception.UserEmailNotFoundException;
import com.negocil.negoturismo.admin.feature.user.exception.UserNotFoundException;

import com.negocil.negoturismo.admin.feature.user.exception.UserPhoneNotFoundException;
import com.negocil.negoturismo.admin.feature.user.exception.UserUsernameNotFoundException;
import com.negocil.negoturismo.admin.feature.user.repository.UserRepository;
import com.negocil.negoturismo.admin.feature.user.model.User;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

    @Override
    public User findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new UserNotFoundException(uuid));
    }

    @Override
    public User findOrCreate(User model) {
        return repository.findByUsername(model.getUsername()).orElseGet(() -> save(model));
    }
}
