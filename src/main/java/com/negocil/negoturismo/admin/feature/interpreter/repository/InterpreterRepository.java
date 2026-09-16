package com.negocil.negoturismo.admin.feature.interpreter.repository;

import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import com.negocil.negoturismo.admin.feature.interpreter.util.InterpreterQuery;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import com.negocil.negoturismo.admin.shared.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InterpreterRepository extends ConcreteRepository<Interpreter> {
    @NativeQuery(value = InterpreterQuery.INTERPRETER_SEARCH, countQuery = InterpreterQuery.INTERPRETER_SEARCH_COUNT)
    Page<Interpreter> search(@Param("query") String query, Pageable pageable);
    Optional<Interpreter> findByUser(User user);
}
