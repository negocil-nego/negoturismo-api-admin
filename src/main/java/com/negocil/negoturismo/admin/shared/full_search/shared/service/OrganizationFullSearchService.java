package com.negocil.negoturismo.admin.shared.full_search.shared.service;

import com.negocil.negoturismo.admin.config.ServiceConfig;
import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.organization.repository.OrganizationRepository;
import com.negocil.negoturismo.admin.shared.full_search.algolia.organization.service.OrganizationAlgoliaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrganizationFullSearchService {
    private static final int REINDEX_PAGE_SIZE = 500;

    private final ServiceConfig serviceConfig;
    private final ObjectProvider<OrganizationAlgoliaService> organizationAlgolia;
    private final OrganizationRepository repository;

    public void indexBulk(Collection<Organization> organizations) {
        algolia().ifPresent(service -> service.indexBulk(organizations));
    }

    public void indexSaveOrUpdate(Organization organization) {
        algolia().ifPresent(service -> service.indexSaveOrUpdate(organization));
    }

    public void remove(Organization organization) {
        algolia().ifPresent(service -> service.remove(organization));
    }

    public void reindexAll() {
        var algoliaService = algolia();
        if (algoliaService.isEmpty()) {
            log.info("Full search index is not active, skipping organizations reindex");
            return;
        }

        algoliaService.get().deleteAll();

        long total = 0;
        var pageable = PageRequest.of(0, REINDEX_PAGE_SIZE, Sort.by("id"));
        var page = repository.findAll(pageable);
        while (true) {
            var content = page.getContent();
            if (!content.isEmpty()) {
                algoliaService.get().indexBulk(content);
                total += content.size();
            }
            if (!page.hasNext()) {
                break;
            }
            page = repository.findAll(page.nextPageable());
        }
        log.info("Reindexed {} organizations", total);
    }

    public Page<Organization> search(String query, Pageable pageable) {
        return algolia()
                .map(service -> service.search(query, pageable))
                .orElseGet(() -> repository.search(query, pageable));
    }

    private Optional<OrganizationAlgoliaService> algolia() {
        return serviceConfig.fullsearchEqualsAlgolia()
                ? Optional.ofNullable(organizationAlgolia.getIfAvailable())
                : Optional.empty();
    }
}
