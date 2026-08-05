package com.negocil.negoturismo.admin.feature.interpreter.repository;

import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import com.negocil.negoturismo.admin.feature.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InterpreterRepository extends ConcreteRepository<Interpreter> {
    Optional<Interpreter> findByUser(User user);
}
