package com.negocil.negoturismo.admin.feature.interpreter.service;

import com.negocil.negoturismo.admin.feature.interpreter.exception.InterpreterLanguageNotFoundException;
import com.negocil.negoturismo.admin.feature.interpreter.dto.request.InterpreterLanguageFilterPaginate;
import com.negocil.negoturismo.admin.feature.interpreter.dto.mapper.InterpreterLanguageSpecification;
import com.negocil.negoturismo.admin.feature.interpreter.repository.InterpreterLanguageRepository;
import com.negocil.negoturismo.admin.feature.interpreter.model.InterpreterLanguage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InterpreterLanguageService {
    private final InterpreterLanguageRepository repository;

    public InterpreterLanguageService(InterpreterLanguageRepository repository) {
        this.repository = repository;
    }

    public Page<InterpreterLanguage> findAll(InterpreterLanguageFilterPaginate filter) {
        var spec = new InterpreterLanguageSpecification(filter);
        return repository.findAll(spec, filter.toRequest());
    }

    public Page<InterpreterLanguage> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    public InterpreterLanguage findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new InterpreterLanguageNotFoundException(uuid));
    }

    public InterpreterLanguage save(InterpreterLanguage model) {
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
}
