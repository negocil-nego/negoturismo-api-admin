package com.negocil.negoturismo.admin.config.seeder.faker;

import com.negocil.negoturismo.admin.feature.user.enums.UserStatus;
import com.negocil.negoturismo.admin.feature.user.enums.UserType;
import com.negocil.negoturismo.admin.feature.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public enum UserData {
    ANA_SILVA(
            User.builder()
                    .name("Ana Silva")
                    .username("anasilva")
                    .email("ana.silva@negoturismo.com")
                    .phone("+244923456789")
                    .password("$2a$10$8.t1sD6.c5DqS.GZ0y2mKeYx5JkW/1tLlz4GfWwQJc62qKz0K/s1i")
                    .birthday(LocalDate.of(1992, 5, 12))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    CARLOS_NDALU(
            User.builder()
                    .name("Carlos Ndalu")
                    .username("carlosndalu")
                    .email("carlos.ndalu@negoturismo.com")
                    .phone("+244912345678")
                    .password("$2a$10$8.t1sD6.c5DqS.GZ0y2mKeYx5JkW/1tLlz4GfWwQJc62qKz0K/s1i")
                    .birthday(LocalDate.of(1988, 8, 24))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    MATEUS_KALANDULA(
            User.builder()
                    .name("Mateus Kalandula")
                    .username("mateuskalandula")
                    .email("mateus.kalandula@negoturismo.com")
                    .phone("+244933456789")
                    .password("$2a$10$8.t1sD6.c5DqS.GZ0y2mKeYx5JkW/1tLlz4GfWwQJc62qKz0K/s1i")
                    .birthday(LocalDate.of(1990, 1, 1))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    JULIETA_BENGUELA(
            User.builder()
                    .name("Julieta Benguela")
                    .username("julietabenguela")
                    .email("julieta.benguela@negoturismo.com")
                    .phone("+244943456789")
                    .password("$2a$10$8.t1sD6.c5DqS.GZ0y2mKeYx5JkW/1tLlz4GfWwQJc62qKz0K/s1i")
                    .birthday(LocalDate.of(1995, 10, 15))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    EPIC_SANA_OWNER(
            User.builder()
                    .name("Epic Sana Owner")
                    .username("epicsana_owner")
                    .email("epicsana@negoturismo.com")
                    .phone("+244922345678")
                    .password("$2a$10$8.t1sD6.c5DqS.GZ0y2mKeYx5JkW/1tLlz4GfWwQJc62qKz0K/s1i")
                    .birthday(LocalDate.of(1980, 2, 2))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    MIRAMAR_OWNER(
            User.builder()
                    .name("Pensão Miramar Owner")
                    .username("pensao_miramar_owner")
                    .email("miramar@negoturismo.com")
                    .phone("+244922345679")
                    .password("$2a$10$8.t1sD6.c5DqS.GZ0y2mKeYx5JkW/1tLlz4GfWwQJc62qKz0K/s1i")
                    .birthday(LocalDate.of(1985, 3, 3))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    ),
    HUAMBO_OWNER(
            User.builder()
                    .name("Hospedaria Huambo Owner")
                    .username("hospedaria_huambo_owner")
                    .email("huambo@negoturismo.com")
                    .phone("+244922345680")
                    .password("$2a$10$8.t1sD6.c5DqS.GZ0y2mKeYx5JkW/1tLlz4GfWwQJc62qKz0K/s1i")
                    .birthday(LocalDate.of(1978, 4, 4))
                    .type(UserType.CLIENT)
                    .status(UserStatus.ACTIVE)
                    .build()
    );

    private final User user;
}
