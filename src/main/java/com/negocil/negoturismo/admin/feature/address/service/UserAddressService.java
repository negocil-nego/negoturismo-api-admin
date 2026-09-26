package com.negocil.negoturismo.admin.feature.address.service;

import com.negocil.negoturismo.admin.feature.address.model.Address;
import com.negocil.negoturismo.admin.feature.address.model.UserAddress;
import com.negocil.negoturismo.admin.feature.address.repository.AddressRepository;
import com.negocil.negoturismo.admin.feature.address.repository.UserAddressRepository;
import com.negocil.negoturismo.admin.shared.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserAddressService {
    private final UserAddressRepository userAddressRepository;
    private final AddressRepository addressRepository;

    public Optional<UserAddress> findByUserId(Long userId) {
        return userAddressRepository.findByUserId(userId);
    }

    public UserAddress findOrCreateByUser(User user) {
        return userAddressRepository.findByUserId(user.getId())
                .orElseGet(() -> {
                    var address = Address.builder().build();
                    var savedAddress = addressRepository.save(address);
                    var userAddress = UserAddress.builder()
                            .user(user)
                            .address(savedAddress)
                            .build();
                    return userAddressRepository.save(userAddress);
                });
    }

    public UserAddress save(UserAddress userAddress) {
        return userAddressRepository.save(userAddress);
    }

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }
}
