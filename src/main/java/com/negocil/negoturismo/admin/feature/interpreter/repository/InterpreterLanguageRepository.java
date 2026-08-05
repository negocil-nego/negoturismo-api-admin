package com.negocil.negoturismo.admin.feature.interpreter.repository;

import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import com.negocil.negoturismo.admin.feature.interpreter.model.InterpreterLanguage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface InterpreterLanguageRepository extends JpaRepository<InterpreterLanguage, Long>, JpaSpecificationExecutor<InterpreterLanguage> {
    Optional<InterpreterLanguage> findByUuid(UUID uuid);

    @NativeQuery(name = "InterpreterLanguage.search", countQuery = "InterpreterLanguage.countSearch")
    Page<InterpreterLanguage> search(@Param("query") String query, Pageable pageable);

    Optional<InterpreterLanguage> findByInterpreterAndLanguage(Interpreter interpreter, String language);
}
