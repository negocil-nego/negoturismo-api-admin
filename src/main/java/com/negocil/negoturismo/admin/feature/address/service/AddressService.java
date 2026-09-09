package com.negocil.negoturismo.admin.feature.address.service;

import com.negocil.negoturismo.admin.feature.address.model.Address;
import com.negocil.negoturismo.admin.feature.address.repository.AddressRepository;
import com.negocil.negoturismo.admin.shared.core.contract.IFindOrCreate;
import com.negocil.negoturismo.admin.shared.core.service.ConcreteService;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends ConcreteService<Address> implements IFindOrCreate<Address> {
    private final AddressRepository repository;

    public AddressService(AddressRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public Address findOrCreate(Address model) {
        return repository.findByStateAndMunicipalityAndAddress(model.getState(), model.getMunicipality(), model.getAddress())
                .orElseGet(() -> save(model));
    }
}
