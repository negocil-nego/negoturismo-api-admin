package com.negocil.negoturismo.admin.config;

import com.negocil.negoturismo.admin.feature.category.model.CategoryData;
import com.negocil.negoturismo.admin.feature.category.service.CategoryService;
import com.negocil.negoturismo.admin.feature.permission.model.PermissionData;
import com.negocil.negoturismo.admin.feature.permission.service.PermissionService;
import com.negocil.negoturismo.admin.feature.role.model.RoleData;
import com.negocil.negoturismo.admin.feature.role.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Order(2)
@Component
@RequiredArgsConstructor
public class SeederConfig implements CommandLineRunner {
    private final PermissionService permissionService;
    private final CategoryService categoryService;
    private final RoleService roleService;

    @Override
    public void run(String @NonNull ... args) throws Exception {
        log.info("Starting initial data seed...");
        long start = System.currentTimeMillis();

        var categories = Arrays.stream(CategoryData.values())
                .map(CategoryData::getCategory)
                .map(categoryService::findOrCreate)
                .toList();
        log.info("Categories processed: {}", categories.size());

        var permissions = Arrays.stream(PermissionData.values())
                .map(PermissionData::getPermission)
                .map(permissionService::findOrCreate)
                .toList();
        log.info("Permissions processed: {}", permissions.size());

        var roles = Arrays.stream(RoleData.values())
                .map(RoleData::getRole)
                .map(roleService::findOrCreate)
                .toList();
        log.info("Roles processed: {}", roles.size());

        long end = System.currentTimeMillis() - start;
        log.info("Seed finished successfully in {}ms", end);
    }
}