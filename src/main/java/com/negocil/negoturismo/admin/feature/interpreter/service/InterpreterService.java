package com.negocil.negoturismo.admin.feature.interpreter.service;

import com.negocil.negoturismo.admin.feature.interpreter.exception.InterpreterNotFoundException;
import com.negocil.negoturismo.admin.feature.interpreter.repository.InterpreterRepository;
import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import com.negocil.negoturismo.admin.shared.core.util.StringUtils;
import com.negocil.negoturismo.admin.shared.full_search.shared.service.InterpreterFullSearchService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InterpreterService extends ConcreteService<Interpreter> implements IFindOrCreate<Interpreter> {
    private final InterpreterRepository repository;
    private final InterpreterFullSearchService fullSearch;

    public InterpreterService(InterpreterRepository repository, InterpreterFullSearchService fullSearch) {
        super(repository);
        this.repository = repository;
        this.fullSearch = fullSearch;
    }

    @Override
    public Interpreter save(Interpreter data) {
        var user = data.getUser();
        data.setConcat("%s,%s,%s,%s".formatted(user.getName(), user.getPhone(), user.getEmail(), user.getPhone()));
        data.setSlug(StringUtils.generateSlug(user.getUsername()));
        var interpreter = super.save(data);
        fullSearch.indexSaveOrUpdate(interpreter);
        return interpreter;
    }

    @Override
    public Interpreter update(long id, Interpreter data) {
        var interpreter = super.update(id, data);
        fullSearch.indexSaveOrUpdate(interpreter);
        return interpreter;
    }

    @Override
    public Interpreter update(UUID uuid, Interpreter data) {
        var interpreter = super.update(uuid, data);
        fullSearch.indexSaveOrUpdate(interpreter);
        return interpreter;
    }

    @Override
    public boolean deleteByUuid(UUID uuid) {
        var interpreter = findByUuid(uuid);
        var deleted = super.deleteByUuid(uuid);
        fullSearch.remove(interpreter);
        return deleted;
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
