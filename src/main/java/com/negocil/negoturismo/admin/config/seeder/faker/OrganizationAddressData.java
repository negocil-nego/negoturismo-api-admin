package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.address.enums.AddressData;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationAddress;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrganizationAddressData {
    ORG_ADDR_1(
            OrganizationAddress.builder()
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .address(AddressData.ADDRESS_1.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    ORG_ADDR_2(
            OrganizationAddress.builder()
                    .organization(OrganizationData.EPIC_SANA.getOrganization())
                    .address(AddressData.ADDRESS_4.getAddress())
                    .isPrincipal(false)
                    .build()
    ),
    ORG_ADDR_3(
            OrganizationAddress.builder()
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .address(AddressData.ADDRESS_2.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    ORG_ADDR_4(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .address(AddressData.ADDRESS_3.getAddress())
                    .isPrincipal(true)
                    .build()
    ),
    ORG_ADDR_5(
            OrganizationAddress.builder()
                    .organization(OrganizationData.HUAMBO.getOrganization())
                    .address(AddressData.ADDRESS_6.getAddress())
                    .isPrincipal(false)
                    .build()
    ),
    ORG_ADDR_6(
            OrganizationAddress.builder()
                    .organization(OrganizationData.MIRAMAR.getOrganization())
                    .address(AddressData.ADDRESS_5.getAddress())
                    .isPrincipal(false)
                    .build()
    );

    private final OrganizationAddress organizationAddress;
}
