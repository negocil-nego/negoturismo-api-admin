package com.negocil.negoturismo.admin.shared.full_search.shared.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FullSearchIndexService {
    private final OrganizationFullSearchService organizationFullSearch;
    private final ProductFullSearchService productFullSearch;
    private final InterpreterFullSearchService interpreterFullSearch;
    private final TourGuideFullSearchService tourGuideFullSearch;
    private final TouristAreaFullSearchService touristAreaFullSearch;

    public void reindexAll() {
        organizationFullSearch.reindexAll();
        productFullSearch.reindexAll();
        interpreterFullSearch.reindexAll();
        tourGuideFullSearch.reindexAll();
        touristAreaFullSearch.reindexAll();
    }
}
