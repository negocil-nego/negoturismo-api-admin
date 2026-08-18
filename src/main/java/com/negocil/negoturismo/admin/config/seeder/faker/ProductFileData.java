package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.product.model.ProductFile;
import com.negocil.negoturismo.admin.shared.document_file.enums.DocumentFileData;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductFileData {
    EPIC_SANA_ROOM_SINGLE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SINGLE.getProduct())
                    .doc(DocumentFileData.ROOM_SINGLE_IMAGE.getDocumentFile())
                    .build()
    ),
    EPIC_SANA_ROOM_SUITE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SUITE.getProduct())
                    .doc(DocumentFileData.ROOM_SUITE_IMAGE.getDocumentFile())
                    .build()
    ),
    MIRAMAR_ROOM_DOUBLE_PHOTO(
            ProductFile.builder()
                    .product(ProductData.MIRAMAR_ROOM_DOUBLE.getProduct())
                    .doc(DocumentFileData.ROOM_DOUBLE_IMAGE.getDocumentFile())
                    .build()
    ),
    HUAMBO_ROOM_TWIN_PHOTO(
            ProductFile.builder()
                    .product(ProductData.HUAMBO_ROOM_TWIN.getProduct())
                    .doc(DocumentFileData.ROOM_TWIN_IMAGE.getDocumentFile())
                    .build()
    );

    private final ProductFile productFile;
}
