package com.negocil.negoturismo.admin.feature.product.repository;

import com.negocil.negoturismo.admin.feature.address.model.Address;
import com.negocil.negoturismo.admin.feature.product.model.Product;
import com.negocil.negoturismo.admin.feature.product.model.ProductAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductAddressRepository extends JpaRepository<ProductAddress, Long>, JpaSpecificationExecutor<ProductAddress> {
    Optional<ProductAddress> findByProductAndAddress(Product product, Address address);
}
