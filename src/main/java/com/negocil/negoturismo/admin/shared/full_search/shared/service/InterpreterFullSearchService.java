package com.negocil.negoturismo.admin.shared.full_search.shared.service;

import com.negocil.negoturismo.admin.config.ServiceConfig;
import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import com.negocil.negoturismo.admin.feature.interpreter.repository.InterpreterRepository;
import com.negocil.negoturismo.admin.shared.full_search.algolia.interpreter.service.InterpreterAlgoliaService;
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
public class InterpreterFullSearchService {
    private static final int REINDEX_PAGE_SIZE = 500;

    private final ServiceConfig serviceConfig;
    private final ObjectProvider<InterpreterAlgoliaService> interpreterAlgolia;
    private final InterpreterRepository repository;

    public void indexBulk(Collection<Interpreter> interpreters) {
        algolia().ifPresent(service -> service.indexBulk(interpreters));
    }

    public void indexSaveOrUpdate(Interpreter interpreter) {
        algolia().ifPresent(service -> service.indexSaveOrUpdate(interpreter));
    }

    public void remove(Interpreter interpreter) {
        algolia().ifPresent(service -> service.remove(interpreter));
    }

    public void reindexAll() {
        var algoliaService = algolia();
        if (algoliaService.isEmpty()) {
            log.info("Full search index is not active, skipping interpreters reindex");
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
        log.info("Reindexed {} interpreters", total);
    }

    public Page<Interpreter> search(String query, Pageable pageable) {
        return algolia()
                .map(service -> service.search(query, pageable))
                .orElseGet(() -> repository.search(query, pageable));
    }

    private Optional<InterpreterAlgoliaService> algolia() {
        return serviceConfig.fullsearchEqualsAlgolia()
                ? Optional.ofNullable(interpreterAlgolia.getIfAvailable())
                : Optional.empty();
    }
}
