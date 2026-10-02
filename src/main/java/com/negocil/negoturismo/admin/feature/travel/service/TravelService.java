package com.negocil.negoturismo.admin.feature.travel.service;

import com.negocil.negoturismo.admin.feature.travel.exception.TravelNotFoundException;
import com.negocil.negoturismo.admin.feature.travel.model.Travel;
import com.negocil.negoturismo.admin.feature.travel.repository.TravelRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TravelService extends ConcreteService<Travel> implements IFindOrCreate<Travel> {
    private final TravelRepository repository;

    public TravelService(TravelRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Page<Travel> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Travel> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    @Override
    public Travel findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new TravelNotFoundException(uuid));
    }

    @Override
    public Travel findOrCreate(Travel model) {
        return repository.findByCityAndTypeAndDepartureTime(
                model.getCity(),
                model.getType(),
                model.getDepartureTime()
        ).orElseGet(() -> save(model));
    }
}
