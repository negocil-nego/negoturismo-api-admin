package com.negocil.negoturismo.admin.feature.tour_guide.service;

import com.negocil.negoturismo.admin.feature.tour_guide.exception.TouristAreaFileNotFoundException;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristAreaFile;
import com.negocil.negoturismo.admin.feature.tour_guide.repository.TouristAreaFileRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristAreaFileService implements IFindOrCreate<TouristAreaFile> {
    private final TouristAreaFileRepository repository;

    public TouristAreaFileService(TouristAreaFileRepository repository) {
        this.repository = repository;
    }

    public Page<TouristAreaFile> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public TouristAreaFile findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new TouristAreaFileNotFoundException(id));
    }

    public List<TouristAreaFile> findByTouristArea(com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea touristArea) {
        return repository.findByTouristArea(touristArea);
    }

    public TouristAreaFile save(TouristAreaFile data) {
        return repository.save(data);
    }

    public boolean deleteById(Long id) {
        var item = findById(id);
        repository.delete(item);
        return true;
    }

    @Override
    public TouristAreaFile findOrCreate(TouristAreaFile model) {
        return repository.findByTouristAreaAndDoc(model.getTouristArea(), model.getDoc())
                .orElseGet(() -> save(model));
    }
}
