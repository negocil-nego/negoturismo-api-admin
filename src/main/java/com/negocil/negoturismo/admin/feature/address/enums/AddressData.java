package com.negocil.negoturismo.admin.feature.address.enums;

import com.negocil.negoturismo.admin.feature.address.model.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum AddressData {
    ADDRESS_1(
            Address.builder()
                    .latitude(new BigDecimal("-8.8399"))
                    .longitude(new BigDecimal("13.2894"))
                    .state("Luanda")
                    .municipality("Ingombota")
                    .address("Rua da Missão, 45, Ingombota, Luanda")
                    .build()
    ),
    ADDRESS_2(
            Address.builder()
                    .latitude(new BigDecimal("-8.8410"))
                    .longitude(new BigDecimal("13.2343"))
                    .state("Luanda")
                    .municipality("Miramar")
                    .address("Bairro do Miramar, Av. 4 de Fevereiro, Luanda")
                    .build()
    ),
    ADDRESS_3(
            Address.builder()
                    .latitude(new BigDecimal("-12.7500"))
                    .longitude(new BigDecimal("15.7333"))
                    .state("Huambo")
                    .municipality("Centro")
                    .address("Avenida da Independência, 123, Centro, Huambo")
                    .build()
    ),
    ADDRESS_4(
            Address.builder()
                    .latitude(new BigDecimal("-8.8350"))
                    .longitude(new BigDecimal("13.2700"))
                    .state("Luanda")
                    .municipality("Maianga")
                    .address("Rua dos Enganos, 78, Maianga, Luanda")
                    .build()
    ),
    ADDRESS_5(
            Address.builder()
                    .latitude(new BigDecimal("-8.8500"))
                    .longitude(new BigDecimal("13.2400"))
                    .state("Luanda")
                    .municipality("Samba")
                    .address("Rua da Samba, 200, Samba, Luanda")
                    .build()
    ),
    ADDRESS_6(
            Address.builder()
                    .latitude(new BigDecimal("-12.7450"))
                    .longitude(new BigDecimal("15.7400"))
                    .state("Huambo")
                    .municipality("Catalã")
                    .address("Rua do Catalã, 56, Catalã, Huambo")
                    .build()
    ),
    ADDRESS_7(
            Address.builder()
                    .latitude(new BigDecimal("-8.8200"))
                    .longitude(new BigDecimal("13.2600"))
                    .state("Luanda")
                    .municipality("Viana")
                    .address("Estrada de Viana, km 15, Viana, Luanda")
                    .build()
    ),
    ADDRESS_8(
            Address.builder()
                    .latitude(new BigDecimal("-12.7600"))
                    .longitude(new BigDecimal("15.7200"))
                    .state("Huambo")
                    .municipality("Santo António")
                    .address("Rua de Santo António, 90, Santo António, Huambo")
                    .build()
    );

    private final Address address;
}
