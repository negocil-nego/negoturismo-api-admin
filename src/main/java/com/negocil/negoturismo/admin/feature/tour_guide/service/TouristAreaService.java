package com.negocil.negoturismo.admin.feature.tour_guide.service;

import com.negocil.negoturismo.admin.feature.tour_guide.exception.TouristAreaNotFoundException;

import com.negocil.negoturismo.admin.feature.tour_guide.repository.TouristAreaRepository;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import com.negocil.negoturismo.admin.shared.full_search.shared.service.TouristAreaFullSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TouristAreaService extends ConcreteService<TouristArea> implements IFindOrCreate<TouristArea> {
    private final TouristAreaRepository repository;
    private final TouristAreaFullSearchService fullSearch;

    public TouristAreaService(TouristAreaRepository repository, TouristAreaFullSearchService fullSearch) {
        super(repository);
        this.repository = repository;
        this.fullSearch = fullSearch;
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
    public TouristArea save(TouristArea data) {
        var touristArea = super.save(data);
        fullSearch.indexSaveOrUpdate(touristArea);
        return touristArea;
    }

    @Override
    public TouristArea update(long id, TouristArea data) {
        var touristArea = super.update(id, data);
        fullSearch.indexSaveOrUpdate(touristArea);
        return touristArea;
    }

    @Override
    public TouristArea update(UUID uuid, TouristArea data) {
        var touristArea = super.update(uuid, data);
        fullSearch.indexSaveOrUpdate(touristArea);
        return touristArea;
    }

    @Override
    public boolean deleteByUuid(UUID uuid) {
        var touristArea = findByUuid(uuid);
        var deleted = super.deleteByUuid(uuid);
        fullSearch.remove(touristArea);
        return deleted;
    }

    @Override
    public TouristArea findOrCreate(TouristArea model) {
        return repository.findByName(model.getName()).orElseGet(() -> save(model));
    }
}
