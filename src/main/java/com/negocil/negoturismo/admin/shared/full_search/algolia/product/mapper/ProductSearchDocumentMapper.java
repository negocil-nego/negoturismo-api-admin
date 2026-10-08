package com.negocil.negoturismo.admin.shared.full_search.algolia.product.mapper;

import com.negocil.negoturismo.admin.feature.product.model.Product;
import com.negocil.negoturismo.admin.shared.full_search.algolia.product.dto.ProductSearchDocument;

public final class ProductSearchDocumentMapper {

    private ProductSearchDocumentMapper() {}

    public static ProductSearchDocument toDocument(Product product) {
        return new ProductSearchDocument(
                String.valueOf(product.getUuid()),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }
}
