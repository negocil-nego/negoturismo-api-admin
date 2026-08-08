package com.negocil.negoturismo.admin.feature.product.repository;

import com.negocil.negoturismo.admin.feature.product.model.Product;
import com.negocil.negoturismo.admin.feature.product.util.ProductQuery;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends ConcreteRepository<Product> {
    Optional<Product> findByName(String name);

    @NativeQuery(value = ProductQuery.PRODUCT_SEARCH, countQuery = ProductQuery.PRODUCT_SEARCH_COUNT)
    Page<Product> search(@Param("query") String query, Pageable pageable);
}
