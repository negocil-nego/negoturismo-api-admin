package com.negocil.negoturismo.admin.feature.travel.service;

import com.negocil.negoturismo.admin.feature.travel.exception.TravelNotFoundException;
import com.negocil.negoturismo.admin.feature.travel.model.Travel;
import com.negocil.negoturismo.admin.feature.travel.repository.TravelRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import com.negocil.negoturismo.admin.shared.full_search.shared.service.TravelFullSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TravelService extends ConcreteService<Travel> implements IFindOrCreate<Travel> {
    private final TravelRepository repository;
    private final TravelFullSearchService fullSearch;

    public TravelService(TravelRepository repository, TravelFullSearchService fullSearch) {
        super(repository);
        this.repository = repository;
        this.fullSearch = fullSearch;
    }

    public Page<Travel> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Travel> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    @Override
    public Travel save(Travel data) {
        var travel = super.save(data);
        fullSearch.indexSaveOrUpdate(travel);
        return travel;
    }

    @Override
    public Travel update(long id, Travel data) {
        var travel = super.update(id, data);
        fullSearch.indexSaveOrUpdate(travel);
        return travel;
    }

    @Override
    public Travel update(UUID uuid, Travel data) {
        var travel = super.update(uuid, data);
        fullSearch.indexSaveOrUpdate(travel);
        return travel;
    }

    @Override
    public boolean deleteByUuid(UUID uuid) {
        var travel = findByUuid(uuid);
        var deleted = super.deleteByUuid(uuid);
        fullSearch.remove(travel);
        return deleted;
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
