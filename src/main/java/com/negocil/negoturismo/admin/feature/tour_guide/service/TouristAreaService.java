package com.negocil.negoturismo.admin.feature.tour_guide.service;

import com.negocil.negoturismo.admin.feature.tour_guide.exception.TouristAreaNotFoundException;

import com.negocil.negoturismo.admin.feature.tour_guide.repository.TouristAreaRepository;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TouristAreaService extends ConcreteService<TouristArea> implements IFindOrCreate<TouristArea> {
    private final TouristAreaRepository repository;

    public TouristAreaService(TouristAreaRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Page<TouristArea> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<TouristArea> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    @Override
    public TouristArea findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new TouristAreaNotFoundException(uuid));
    }

    @Override
    public TouristArea findOrCreate(TouristArea model) {
        return repository.findByName(model.getName()).orElseGet(() -> save(model));
    }
}
