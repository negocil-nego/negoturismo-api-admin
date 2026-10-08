package com.negocil.negoturismo.admin.shared.full_search.algolia.organization.service;

import com.algolia.api.SearchClient;
import com.algolia.model.search.Hit;
import com.algolia.model.search.SearchResponse;
import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.organization.repository.OrganizationRepository;
import com.negocil.negoturismo.admin.shared.full_search.algolia.organization.mapper.OrganizationSearchDocumentMapper;
import com.negocil.negoturismo.admin.shared.full_search.algolia.util.AlgoliaUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "service", name = "fullsearch", havingValue = "algolia", matchIfMissing = true)
public class OrganizationAlgoliaService {
    private static final String ORGANIZATIONS_INDEX = "organizations";
    private final OrganizationRepository repository;
    private final SearchClient algoliaClient;

    public void indexBulk(Collection<Organization> organizations) {
        try {
            var documents = organizations.stream().map(OrganizationSearchDocumentMapper::toDocument).toList();
            algoliaClient.saveObjects(ORGANIZATIONS_INDEX, documents);
            log.info("Indexed {} organizations in search index", documents.size());
        } catch (Exception e) {
            log.error("Failed to index {} organizations in search index", organizations.size(), e);
        }
    }

    public void indexSaveOrUpdate(Organization organization) {
        try {
            algoliaClient.saveObject(ORGANIZATIONS_INDEX, OrganizationSearchDocumentMapper.toDocument(organization));
        } catch (Exception e) {
            log.error("Failed to save organization {} in search index", organization.getUuid(), e);
        }
    }

    public void remove(Organization organization) {
        try {
            algoliaClient.deleteObject(ORGANIZATIONS_INDEX, String.valueOf(organization.getUuid()));
        } catch (Exception e) {
            log.error("Failed to remove organization {} from search index", organization.getUuid(), e);
        }
    }

    public void deleteAll() {
        try {
            algoliaClient.clearObjects(ORGANIZATIONS_INDEX);
            log.info("Cleared organizations search index");
        } catch (Exception e) {
            log.error("Failed to clear organizations search index", e);
        }
    }

    public Page<Organization> search(String query, Pageable pageable) {
        try {
            var responses = algoliaClient.search(AlgoliaUtils.searchMethodParams(ORGANIZATIONS_INDEX, query, pageable), Hit.class);

            if (!(responses.getResults().getFirst() instanceof SearchResponse<Hit> result) || result.getHits().isEmpty()) {
                return Page.empty(pageable);
            }

            var uuids = AlgoliaUtils.generatorUuids(result.getHits());

            var byUuid = repository.findByUuidIn(uuids).stream().collect(Collectors.toMap(Organization::getUuid, Function.identity()));

            var organizations = uuids.stream().map(byUuid::get).filter(Objects::nonNull).toList();

            return new PageImpl<>(organizations, pageable, Optional.ofNullable(result.getNbHits()).orElse(0));
        } catch (Exception e) {
            log.error("Failed to search organizations in search index", e);
            return Page.empty(pageable);
        }
    }
}
