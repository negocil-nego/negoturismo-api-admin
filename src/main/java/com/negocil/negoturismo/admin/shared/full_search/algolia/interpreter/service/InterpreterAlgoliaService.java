package com.negocil.negoturismo.admin.shared.full_search.algolia.interpreter.service;

import com.algolia.api.SearchClient;
import com.algolia.model.search.Hit;
import com.algolia.model.search.SearchResponse;
import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import com.negocil.negoturismo.admin.feature.interpreter.repository.InterpreterRepository;
import com.negocil.negoturismo.admin.shared.full_search.algolia.interpreter.mapper.InterpreterSearchDocumentMapper;
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
public class InterpreterAlgoliaService {
    private static final String INTERPRETERS_INDEX = "interpreters";
    private final InterpreterRepository repository;
    private final SearchClient algoliaClient;

    public void indexBulk(Collection<Interpreter> interpreters) {
        try {
            var documents = interpreters.stream().map(InterpreterSearchDocumentMapper::toDocument).toList();
            algoliaClient.saveObjects(INTERPRETERS_INDEX, documents);
            log.info("Indexed {} interpreters in search index", documents.size());
        } catch (Exception e) {
            log.error("Failed to index {} interpreters in search index", interpreters.size(), e);
        }
    }

    public void indexSaveOrUpdate(Interpreter interpreter) {
        try {
            algoliaClient.saveObject(INTERPRETERS_INDEX, InterpreterSearchDocumentMapper.toDocument(interpreter));
        } catch (Exception e) {
            log.error("Failed to save interpreter {} in search index", interpreter.getUuid(), e);
        }
    }

    public void remove(Interpreter interpreter) {
        try {
            algoliaClient.deleteObject(INTERPRETERS_INDEX, String.valueOf(interpreter.getUuid()));
        } catch (Exception e) {
            log.error("Failed to remove interpreter {} from search index", interpreter.getUuid(), e);
        }
    }

    public void deleteAll() {
        try {
            algoliaClient.clearObjects(INTERPRETERS_INDEX);
            log.info("Cleared interpreters search index");
        } catch (Exception e) {
            log.error("Failed to clear interpreters search index", e);
        }
    }

    public Page<Interpreter> search(String query, Pageable pageable) {
        try {
            var responses = algoliaClient.search(AlgoliaUtils.searchMethodParams(INTERPRETERS_INDEX, query, pageable), Hit.class);

            if (!(responses.getResults().getFirst() instanceof SearchResponse<Hit> result) || result.getHits().isEmpty()) {
                return Page.empty(pageable);
            }

            var uuids = AlgoliaUtils.generatorUuids(result.getHits());

            var byUuid = repository.findByUuidIn(uuids).stream().collect(Collectors.toMap(Interpreter::getUuid, Function.identity()));

            var interpreters = uuids.stream().map(byUuid::get).filter(Objects::nonNull).toList();

            return new PageImpl<>(interpreters, pageable, Optional.ofNullable(result.getNbHits()).orElse(0));
        } catch (Exception e) {
            log.error("Failed to search interpreters in search index", e);
            return Page.empty(pageable);
        }
    }
}
