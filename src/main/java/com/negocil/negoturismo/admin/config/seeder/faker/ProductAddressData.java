package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.address.enums.AddressData;
import com.negocil.negoturismo.admin.feature.product.model.ProductAddress;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductAddressData {
    PROD_ADDR_1(
            ProductAddress.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SINGLE.getProduct())
                    .address(AddressData.ADDRESS_1.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    PROD_ADDR_2(
            ProductAddress.builder()
                    .product(ProductData.EPIC_SANA_ROOM_SUITE.getProduct())
                    .address(AddressData.ADDRESS_1.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    PROD_ADDR_3(
            ProductAddress.builder()
                    .product(ProductData.MIRAMAR_ROOM_DOUBLE.getProduct())
                    .address(AddressData.ADDRESS_2.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    PROD_ADDR_4(
            ProductAddress.builder()
                    .product(ProductData.HUAMBO_ROOM_TWIN.getProduct())
                    .address(AddressData.ADDRESS_3.getAddress())
                    .isPrincipal(true)
                    .build()
    );

    private final ProductAddress productAddress;
}
