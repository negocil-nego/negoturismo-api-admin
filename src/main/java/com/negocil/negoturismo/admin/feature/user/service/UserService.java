package com.negocil.negoturismo.admin.feature.user.service;

import com.negocil.negoturismo.admin.feature.user.exception.UserEmailNotFoundException;
import com.negocil.negoturismo.admin.feature.user.exception.UserNotFoundException;
import com.negocil.negoturismo.admin.feature.user.dto.request.UserFilterPaginate;
import com.negocil.negoturismo.admin.feature.user.dto.mapper.UserSpecification;
import com.negocil.negoturismo.admin.feature.user.exception.UserPhoneNotFoundException;
import com.negocil.negoturismo.admin.feature.user.exception.UserUsernameNotFoundException;
import com.negocil.negoturismo.admin.feature.user.repository.UserRepository;
import com.negocil.negoturismo.admin.feature.user.model.User;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService extends ConcreteService<User> implements IFindOrCreate<User> {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Page<User> findAll(UserFilterPaginate userFilterPaginate) {
        var spec = new UserSpecification(userFilterPaginate);
        return findAll(spec, userFilterPaginate.toRequest());
    }

    @Override
    public User findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new UserNotFoundException(uuid));
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username).orElseThrow(() -> new UserUsernameNotFoundException(username));
    }

    public User findByEmail(String email) {
        return repository.findByEmail(email).orElseThrow(() -> new UserEmailNotFoundException(email));
    }

    public User findByPhone(String phone) {
        return repository.findByPhone(phone).orElseThrow(() -> new UserPhoneNotFoundException(phone));
    }

    @Override
    public User findOrCreate(User model) {
        return repository.findByUsername(model.getUsername()).orElseGet(() -> repository.save(model));
    }
}
