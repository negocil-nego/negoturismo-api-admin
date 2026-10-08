package com.negocil.negoturismo.admin.shared.full_search.algolia.organization.mapper;

import com.negocil.negoturismo.admin.feature.address.model.Address;
import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationAddress;
import com.negocil.negoturismo.admin.shared.full_search.algolia.organization.dto.OrganizationSearchDocument;

import java.util.stream.Collectors;

public final class OrganizationSearchDocumentMapper {

    private OrganizationSearchDocumentMapper() {}

    public static OrganizationSearchDocument toDocument(Organization organization) {
        var location = organization.getAddresses()
                .stream()
                .map(OrganizationAddress::getAddress)
                .map(Address::addressFormat)
                .collect(Collectors.joining(":"));

        return new OrganizationSearchDocument(
                String.valueOf(organization.getUuid()),
                organization.getName(),
                organization.getDescription(),
                organization.getAddress(),
                organization.getRating(),
                location
        );
    }
}
