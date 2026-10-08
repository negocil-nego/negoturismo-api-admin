package com.negocil.negoturismo.admin.feature.tour_guide.service;

import com.negocil.negoturismo.admin.feature.tour_guide.exception.TourGuideNotFoundException;

import com.negocil.negoturismo.admin.feature.tour_guide.repository.TourGuideRepository;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import com.negocil.negoturismo.admin.shared.user.model.User;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import com.negocil.negoturismo.admin.shared.core.util.StringUtils;
import com.negocil.negoturismo.admin.shared.full_search.shared.service.TourGuideFullSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TourGuideService extends ConcreteService<TourGuide> implements IFindOrCreate<TourGuide> {
    private final TourGuideRepository repository;
    private final TourGuideFullSearchService fullSearch;

    public TourGuideService(TourGuideRepository repository, TourGuideFullSearchService fullSearch) {
        super(repository);
        this.repository = repository;
        this.fullSearch = fullSearch;
    }

    public Page<TourGuide> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<TourGuide> search(String query, Pageable pageable) {
        return repository.search(query, pageable);
    }

    @Override
    public TourGuide findByUuid(UUID uuid) {
        return repository.findByUuid(uuid).orElseThrow(() -> new TourGuideNotFoundException(uuid));
    }

    @Override
    public TourGuide save(TourGuide data) {
        User user = data.getUser();
        data.setConcat("%s,%s,%s,%s".formatted(user.getName(), user.getPhone(), user.getEmail(), user.getPhone()));
        data.setSlug(StringUtils.generateSlug(user.getUsername()));
        var tourGuide = super.save(data);
        fullSearch.indexSaveOrUpdate(tourGuide);
        return tourGuide;
    }

    @Override
    public TourGuide update(long id, TourGuide data) {
        var tourGuide = super.update(id, data);
        fullSearch.indexSaveOrUpdate(tourGuide);
        return tourGuide;
    }

    @Override
    public TourGuide update(UUID uuid, TourGuide data) {
        var tourGuide = super.update(uuid, data);
        fullSearch.indexSaveOrUpdate(tourGuide);
        return tourGuide;
    }

    @Override
    public boolean deleteByUuid(UUID uuid) {
        var tourGuide = findByUuid(uuid);
        var deleted = super.deleteByUuid(uuid);
        fullSearch.remove(tourGuide);
        return deleted;
    }

    @Override
    public TourGuide findOrCreate(TourGuide model) {
        if (model.getUser() != null) {
            return repository.findByUserUuid(model.getUser().getUuid()).orElseGet(() -> save(model));
        }
        return save(model);
    }
}
