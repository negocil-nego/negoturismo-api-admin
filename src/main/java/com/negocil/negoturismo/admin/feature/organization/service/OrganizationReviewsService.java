package com.negocil.negoturismo.admin.feature.organization.service;

import com.negocil.negoturismo.admin.feature.organization.model.OrganizationReviews;
import com.negocil.negoturismo.admin.feature.organization.repository.OrganizationReviewsRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OrganizationReviewsService implements IFindOrCreate<OrganizationReviews> {
    private final OrganizationReviewsRepository repository;

    public OrganizationReviewsService(OrganizationReviewsRepository repository) {
        this.repository = repository;
    }

    public Page<OrganizationReviews> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public OrganizationReviews save(OrganizationReviews data) {
        return repository.save(data);
    }

    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public OrganizationReviews findOrCreate(OrganizationReviews model) {
        return repository.findByOrganizationAndReview(model.getOrganization(), model.getReview())
                .orElseGet(() -> save(model));
    }
}
