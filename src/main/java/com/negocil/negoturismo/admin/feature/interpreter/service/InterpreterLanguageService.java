package com.negocil.negoturismo.admin.feature.interpreter.service;

import com.negocil.negoturismo.admin.feature.interpreter.exception.InterpreterLanguageNotFoundException;

import com.negocil.negoturismo.admin.feature.interpreter.repository.InterpreterLanguageRepository;
import com.negocil.negoturismo.admin.feature.interpreter.model.InterpreterLanguage;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InterpreterLanguageService implements IFindOrCreate<InterpreterLanguage> {
    private final InterpreterLanguageRepository repository;

    public InterpreterLanguageService(InterpreterLanguageRepository repository) {
        this.repository = repository;
    }

    public Page<InterpreterLanguage> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<InterpreterLanguage> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    public InterpreterLanguage findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new InterpreterLanguageNotFoundException(uuid));
    }

    public InterpreterLanguage save(InterpreterLanguage model) {
        var user = model.getInterpreter().getUser();
        model.setConcat("%s %s".formatted(user.getName(), model.getLanguage()));
        return repository.save(model);
    }

    public InterpreterLanguage update(UUID uuid, InterpreterLanguage model) {
        var item = findByUuid(uuid);
        item.setInterpreter(model.getInterpreter());
        item.setLanguage(model.getLanguage());
        item.setConcat(model.getInterpreter().getUser().getName() + " " + model.getLanguage());
        return repository.save(item);
    }

    public boolean deleteByUuid(UUID uuid) {
        var item = findByUuid(uuid);
        repository.delete(item);
        return true;
    }

    @Override
    public InterpreterLanguage findOrCreate(InterpreterLanguage model) {
        return repository.findByInterpreterAndLanguage(model.getInterpreter(), model.getLanguage())
                .orElseGet(() -> save(model));
    }
}
