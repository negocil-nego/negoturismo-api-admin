package com.negocil.negoturismo.admin.feature.interpreter.service;

import com.negocil.negoturismo.admin.feature.interpreter.exception.InterpreterNotFoundException;
import com.negocil.negoturismo.admin.feature.interpreter.repository.InterpreterRepository;
import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import com.negocil.negoturismo.admin.shared.core.util.StringUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InterpreterService extends ConcreteService<Interpreter> implements IFindOrCreate<Interpreter> {
    private final InterpreterRepository repository;

    public InterpreterService(InterpreterRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public Interpreter save(Interpreter data) {
        var user = data.getUser();
        data.setConcat("%s,%s,%s,%s".formatted(user.getName(), user.getPhone(), user.getEmail(), user.getPhone()));
        data.setSlug(StringUtils.generateSlug(user.getUsername()));
        return super.save(data);
    }

    @Override
    public Interpreter findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new InterpreterNotFoundException(uuid));
    }

    @Override
    public Interpreter findOrCreate(Interpreter model) {
        return repository.findByUser(model.getUser()).orElseGet(() -> save(model));
    }
}
