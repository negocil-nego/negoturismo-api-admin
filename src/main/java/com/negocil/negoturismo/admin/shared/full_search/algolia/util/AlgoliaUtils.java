package com.negocil.negoturismo.admin.shared.full_search.algolia.util;

import com.algolia.model.search.Hit;
import com.algolia.model.search.SearchForHits;
import com.algolia.model.search.SearchMethodParams;
import org.springframework.data.domain.Pageable;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class AlgoliaUtils {

    public static List<UUID> generatorUuids(List<Hit> hits) {
        return hits.stream().map(it -> UUID.fromString(it.getObjectID())).toList();
    }

    public static SearchMethodParams searchMethodParams(String index, String query, Pageable pageable) {
        return new SearchMethodParams().setRequests(Collections.singletonList(new SearchForHits()
                .setIndexName(index)
                .setQuery(query)
                .setPage(pageable.getPageNumber())
                .setHitsPerPage(pageable.getPageSize())
        ));
    }
}
