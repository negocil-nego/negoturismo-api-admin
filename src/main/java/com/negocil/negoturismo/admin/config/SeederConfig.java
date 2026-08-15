package com.negocil.negoturismo.admin.config;

import com.negocil.negoturismo.admin.feature.category.enums.CategoryData;
import com.negocil.negoturismo.admin.feature.category.model.Category;
import com.negocil.negoturismo.admin.feature.category.service.CategoryService;
import com.negocil.negoturismo.admin.feature.interpreter.enums.InterpreterData;
import com.negocil.negoturismo.admin.feature.interpreter.enums.InterpreterLanguageData;
import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import com.negocil.negoturismo.admin.feature.interpreter.model.InterpreterLanguage;
import com.negocil.negoturismo.admin.feature.interpreter.service.InterpreterLanguageService;
import com.negocil.negoturismo.admin.feature.interpreter.service.InterpreterService;
import com.negocil.negoturismo.admin.feature.organization.enums.OrganizationData;
import com.negocil.negoturismo.admin.feature.organization.enums.OrganizationFileData;
import com.negocil.negoturismo.admin.feature.organization.enums.OrganizationHighlightsData;
import com.negocil.negoturismo.admin.feature.organization.model.Organization;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationCategory;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationFile;
import com.negocil.negoturismo.admin.feature.organization.model.OrganizationHighlights;
import com.negocil.negoturismo.admin.feature.organization.service.OrganizationCategoryService;
import com.negocil.negoturismo.admin.feature.organization.service.OrganizationFileService;
import com.negocil.negoturismo.admin.feature.organization.service.OrganizationHighlightsService;
import com.negocil.negoturismo.admin.feature.organization.service.OrganizationService;
import com.negocil.negoturismo.admin.feature.permission.enums.PermissionData;
import com.negocil.negoturismo.admin.feature.permission.service.PermissionService;
import com.negocil.negoturismo.admin.feature.product.enums.ProductData;
import com.negocil.negoturismo.admin.feature.product.enums.ProductFileData;
import com.negocil.negoturismo.admin.feature.product.enums.ProductPromotionData;
import com.negocil.negoturismo.admin.feature.product.model.Product;
import com.negocil.negoturismo.admin.feature.product.model.ProductFile;
import com.negocil.negoturismo.admin.feature.product.model.ProductPromotion;
import com.negocil.negoturismo.admin.feature.product.service.ProductFileService;
import com.negocil.negoturismo.admin.feature.product.service.ProductPromotionService;
import com.negocil.negoturismo.admin.feature.product.service.ProductService;
import com.negocil.negoturismo.admin.feature.role.enums.RoleData;
import com.negocil.negoturismo.admin.feature.role.service.RoleService;
import com.negocil.negoturismo.admin.feature.tour_guide.enums.TourGuideData;
import com.negocil.negoturismo.admin.feature.tour_guide.enums.TourGuideTouristAreaData;
import com.negocil.negoturismo.admin.feature.tour_guide.enums.TouristAreaData;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuideTouristArea;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.feature.tour_guide.service.TourGuideService;
import com.negocil.negoturismo.admin.feature.tour_guide.service.TourGuideTouristAreaService;
import com.negocil.negoturismo.admin.feature.tour_guide.service.TouristAreaService;
import com.negocil.negoturismo.admin.feature.user.enums.UserData;
import com.negocil.negoturismo.admin.feature.user.model.User;
import com.negocil.negoturismo.admin.feature.user.service.UserService;
import com.negocil.negoturismo.admin.shared.document_file.enums.DocumentFileData;
import com.negocil.negoturismo.admin.shared.document_file.model.DocumentFile;
import com.negocil.negoturismo.admin.shared.document_file.service.DocumentFileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Order(2)
@Component
@RequiredArgsConstructor
public class SeederConfig implements CommandLineRunner {
    private final OrganizationHighlightsService organizationHighlightsService;
    private final TourGuideTouristAreaService tourGuideTouristAreaService;
    private final InterpreterLanguageService interpreterLanguageService;
    private final ProductPromotionService productPromotionService;
    private final OrganizationCategoryService organizationCategoryService;
    private final OrganizationFileService organizationFileService;
    private final OrganizationService organizationService;
    private final InterpreterService interpreterService;
    private final DocumentFileService documentFileService;
    private final TouristAreaService touristAreaService;
    private final PermissionService permissionService;
    private final ProductFileService productFileService;
    private final TourGuideService tourGuideService;
    private final CategoryService categoryService;
    private final ProductService productService;
    private final RoleService roleService;
    private final UserService userService;

    @Override
    public void run(String @NonNull ... args) {
        log.info("Starting initial data seed...");
        long start = System.currentTimeMillis();

        // Cache das Categorias (Indexado por Nome)
        Map<String, Category> categoryCache = seedMap(
                CategoryData.values(),
                d -> d.getCategory().getName(),
                d -> categoryService.findOrCreate(d.getCategory())
        );
        seedList(PermissionData.values(), PermissionData::getPermission, permissionService::findOrCreate);
        seedList(RoleData.values(), RoleData::getRole, roleService::findOrCreate);

        // Cache dos Utilizadores em memória
        Map<String, User> userCache = seedMap(
                UserData.values(),
                d -> d.getUser().getUsername(),
                d -> userService.findOrCreate(d.getUser())
        );

        // Cache das Organizações
        Map<String, Organization> orgCache = seedMap(
                OrganizationData.values(),
                OrganizationData::getName,
                d -> organizationService.findOrCreate(Organization.builder()
                        .name(d.getName())
                        .slug(d.getSlug())
                        .email(d.getEmail())
                        .phone(d.getPhone())
                        .description(d.getDescription())
                        .address(d.getAddress())
                        .image(d.getImage())
                        .logo(d.getLogo())
                        .video(d.getVideo())
                        .user(userCache.get(d.getOwnerUsername()))
                        .build())
        );

        // Destaques de Organização
        seedList(OrganizationHighlightsData.values(), d -> OrganizationHighlights.builder()
                .organization(orgCache.get(d.getOrganizationName()))
                .description(d.getDescription())
                .status(d.getStatus())
                .startedAt(d.getStartedAt())
                .completedAt(d.getCompletedAt())
                .build(), organizationHighlightsService::findOrCreate);

        // Cache dos Ficheiros de Documentos (Indexado por Título)
        Map<String, DocumentFile> docCache = seedMap(
                DocumentFileData.values(),
                DocumentFileData::getTitle,
                d -> documentFileService.findOrCreate(DocumentFile.builder()
                        .url(d.getUrl())
                        .fileType(d.getFileType())
                        .thumbnail(d.getThumbnail())
                        .title(d.getTitle())
                        .description(d.getDescription())
                        .build())
        );

        // Ficheiros de Organização
        seedList(OrganizationFileData.values(), d -> OrganizationFile.builder()
                .organization(orgCache.get(d.getOrganizationName()))
                .doc(docCache.get(d.getDocumentFileTitle()))
                .build(), organizationFileService::findOrCreate);

        // Categorias de Organização (todas as organizações em todas as categorias possíveis)
        orgCache.values().forEach(org -> categoryCache.values().forEach(category ->
                organizationCategoryService.findOrCreate(OrganizationCategory.builder()
                        .organization(org)
                        .category(category)
                        .build())));

        // Cache dos Produtos
        Map<String, Product> productCache = seedMap(
                ProductData.values(),
                ProductData::getName,
                d -> productService.findOrCreate(Product.builder()
                        .name(d.getName())
                        .slug(d.getSlug())
                        .description(d.getDescription())
                        .image(d.getImage())
                        .price(d.getPrice())
                        .position(d.getPosition())
                        .organization(orgCache.get(d.getOrganizationName()))
                        .build())
        );

        // Promoções de Produto
        seedList(ProductPromotionData.values(), d -> ProductPromotion.builder()
                .product(productCache.get(d.getProductName()))
                .description(d.getDescription())
                .status(d.getStatus())
                .startedAt(d.getStartedAt())
                .completedAt(d.getCompletedAt())
                .oldPrice(d.getOldPrice())
                .newPrice(d.getNewPrice())
                .build(), productPromotionService::findOrCreate);

        // Ficheiros de Produto
        seedList(ProductFileData.values(), d -> ProductFile.builder()
                .product(productCache.get(d.getProductName()))
                .doc(docCache.get(d.getDocumentFileTitle()))
                .build(), productFileService::findOrCreate);

        // Cache de Intérpretes (Indexado por Username do Utilizador)
        Map<String, Interpreter> interpreterCache = seedMap(
                InterpreterData.values(),
                InterpreterData::getUsername,
                d -> interpreterService.findOrCreate(Interpreter.builder()
                        .user(userCache.get(d.getUsername()))
                        .email(d.getEmail())
                        .whatsapp(d.getWhatsapp())
                        .description(d.getDescription())
                        .photo(d.getPhoto())
                        .video(d.getVideo())
                        .build())
        );

        // Idiomas de Intérpretes
        seedList(InterpreterLanguageData.values(), d -> InterpreterLanguage.builder()
                .interpreter(interpreterCache.get(d.getUsername()))
                .language(d.getLanguage())
                .build(), interpreterLanguageService::findOrCreate);

        // Cache de Áreas Turísticas
        Map<String, TouristArea> areaCache = seedMap(
                TouristAreaData.values(),
                TouristAreaData::getName,
                d -> touristAreaService.findOrCreate(TouristArea.builder()
                        .name(d.getName())
                        .state(d.getState())
                        .address(d.getAddress())
                        .build())
        );

        // Cache de Guias Turísticos (Indexado por Username do Utilizador)
        Map<String, TourGuide> guideCache = seedMap(
                TourGuideData.values(),
                TourGuideData::getUsername,
                d -> tourGuideService.findOrCreate(TourGuide.builder()
                        .user(userCache.get(d.getUsername()))
                        .email(d.getEmail())
                        .whatsapp(d.getWhatsapp())
                        .description(d.getDescription())
                        .photo(d.getPhoto())
                        .video(d.getVideo())
                        .build())
        );

        // Atribuições de Áreas Turísticas aos Guias
        seedList(TourGuideTouristAreaData.values(), d -> TourGuideTouristArea.builder()
                .tourGuide(guideCache.get(d.getGuideUsername()))
                .touristArea(areaCache.get(d.getTouristAreaName()))
                .price(d.getPrice())
                .build(), tourGuideTouristAreaService::findOrCreate);

        log.info("Seed finished successfully in {}ms", System.currentTimeMillis() - start);
    }

    private <T, D> void seedList(D[] dataArray, Function<D, T> mapper, Function<T, T> serviceCall) {
        Arrays.stream(dataArray).map(mapper).forEach(serviceCall::apply);
    }

    private <K, V, D> Map<K, V> seedMap(D[] dataArray, Function<D, K> keyMapper, Function<D, V> valueProvider) {
        return Arrays.stream(dataArray).collect(Collectors.toMap(keyMapper, valueProvider));
    }
}