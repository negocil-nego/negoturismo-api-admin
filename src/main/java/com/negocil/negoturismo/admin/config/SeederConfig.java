package com.negocil.negoturismo.admin.config;

import com.negocil.negoturismo.admin.config.seeder.faker.*;
import com.negocil.negoturismo.admin.config.seeder.system.CategoryData;
import com.negocil.negoturismo.admin.config.seeder.system.PermissionData;
import com.negocil.negoturismo.admin.config.seeder.system.RoleData;
import com.negocil.negoturismo.admin.feature.address.enums.AddressData;
import com.negocil.negoturismo.admin.feature.address.model.Address;
import com.negocil.negoturismo.admin.feature.address.service.AddressService;
import com.negocil.negoturismo.admin.feature.category.model.Category;
import com.negocil.negoturismo.admin.feature.category.service.CategoryService;
import com.negocil.negoturismo.admin.feature.interpreter.model.Interpreter;
import com.negocil.negoturismo.admin.feature.interpreter.model.InterpreterLanguage;
import com.negocil.negoturismo.admin.feature.interpreter.service.InterpreterLanguageService;
import com.negocil.negoturismo.admin.feature.interpreter.service.InterpreterService;
import com.negocil.negoturismo.admin.feature.organization.model.*;
import com.negocil.negoturismo.admin.feature.organization.service.*;
import com.negocil.negoturismo.admin.feature.permission.service.PermissionService;
import com.negocil.negoturismo.admin.feature.product.model.*;
import com.negocil.negoturismo.admin.feature.product.service.*;
import com.negocil.negoturismo.admin.feature.review.enums.ReviewData;
import com.negocil.negoturismo.admin.feature.review.model.Review;
import com.negocil.negoturismo.admin.feature.review.service.ReviewService;
import com.negocil.negoturismo.admin.feature.role.service.RoleService;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuide;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TourGuideTouristArea;
import com.negocil.negoturismo.admin.feature.tour_guide.model.TouristArea;
import com.negocil.negoturismo.admin.feature.tour_guide.service.TourGuideService;
import com.negocil.negoturismo.admin.feature.tour_guide.service.TourGuideTouristAreaService;
import com.negocil.negoturismo.admin.feature.tour_guide.service.TouristAreaService;
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
    private final ReviewService reviewService;
    private final AddressService addressService;
    private final OrganizationReviewsService organizationReviewsService;
    private final OrganizationAddressService organizationAddressService;
    private final ProductReviewsService productReviewsService;
    private final ProductAddressService productAddressService;

    @Override
    public void run(String @NonNull ... args) {
        log.info("Starting initial data seed...");
        long start = System.currentTimeMillis();

        // 1. Categorias
        Map<String, Category> categoryCache = seedMap(
                CategoryData.values(),
                d -> d.getCategory().getName(),
                d -> categoryService.findOrCreate(d.getCategory())
        );

        // 2. Permissões e Roles do Sistema
        seedList(PermissionData.values(), PermissionData::getPermission, permissionService::findOrCreate);
        seedList(RoleData.values(), RoleData::getRole, roleService::findOrCreate);

        // 3. Utilizadores
        Map<String, User> userCache = seedMap(
                UserData.values(),
                d -> d.getUser().getUsername(),
                d -> userService.findOrCreate(d.getUser())
        );

        // 4. Endereços
        Map<String, Address> addressCache = seedMap(
                AddressData.values(),
                d -> d.getAddress().getAddress(),
                d -> addressService.findOrCreate(d.getAddress())
        );

        // 5. Avaliações (Reviews)
        Map<String, Review> reviewCache = seedMap(
                ReviewData.values(),
                d -> d.getReview().getContent(),
                d -> {
                    Review r = d.getReview();
                    return reviewService.findOrCreate(r.toBuilder()
                            .user(userCache.get(r.getUser().getUsername()))
                            .build());
                }
        );

        // 6. Ficheiros de Documentos
        Map<String, DocumentFile> docCache = seedMap(
                DocumentFileData.values(),
                d -> d.getDocumentFile().getTitle(),
                d -> documentFileService.findOrCreate(d.getDocumentFile())
        );

        // 7. Organizações
        Map<String, Organization> orgCache = seedMap(
                OrganizationData.values(),
                d -> d.getOrganization().getName(),
                d -> {
                    Organization org = d.getOrganization();
                    return organizationService.findOrCreate(org.toBuilder()
                            .user(userCache.get(org.getUser().getUsername()))
                            .build());
                }
        );

        // 8. Destaques de Organização
        seedList(OrganizationHighlightsData.values(),
                d -> {
                    OrganizationHighlights item = d.getOrganizationHighlights();
                    return item.toBuilder()
                            .organization(orgCache.get(item.getOrganization().getName()))
                            .build();
                },
                organizationHighlightsService::findOrCreate
        );

        // 9. Ficheiros de Organização
        seedList(OrganizationFileData.values(),
                d -> {
                    OrganizationFile item = d.getOrganizationFile();
                    return item.toBuilder()
                            .organization(orgCache.get(item.getOrganization().getName()))
                            .doc(docCache.get(item.getDoc().getTitle()))
                            .build();
                },
                organizationFileService::findOrCreate
        );

        // 10. Categorias de Organização
        orgCache.values().forEach(org -> categoryCache.values().forEach(category ->
                organizationCategoryService.findOrCreate(OrganizationCategory.builder()
                        .organization(org)
                        .category(category)
                        .build())));

        // 11. Produtos
        Map<String, Product> productCache = seedMap(
                ProductData.values(),
                d -> d.getProduct().getName(),
                d -> {
                    Product prod = d.getProduct();
                    return productService.findOrCreate(prod.toBuilder()
                            .organization(orgCache.get(prod.getOrganization().getName()))
                            .build());
                }
        );

        // 12. Promoções de Produto
        seedList(ProductPromotionData.values(),
                d -> {
                    ProductPromotion item = d.getProductPromotion();
                    return item.toBuilder()
                            .product(productCache.get(item.getProduct().getName()))
                            .build();
                },
                productPromotionService::findOrCreate
        );

        // 13. Ficheiros de Produto
        seedList(ProductFileData.values(),
                d -> {
                    ProductFile item = d.getProductFile();
                    return item.toBuilder()
                            .product(productCache.get(item.getProduct().getName()))
                            .doc(docCache.get(item.getDoc().getTitle()))
                            .build();
                },
                productFileService::findOrCreate
        );

        // 14. Intérpretes
        Map<String, Interpreter> interpreterCache = seedMap(
                InterpreterData.values(),
                d -> d.getInterpreter().getUser().getUsername(),
                d -> {
                    Interpreter interpreter = d.getInterpreter();
                    return interpreterService.findOrCreate(interpreter.toBuilder()
                            .user(userCache.get(interpreter.getUser().getUsername()))
                            .build());
                }
        );

        // 15. Idiomas de Intérpretes
        seedList(InterpreterLanguageData.values(),
                d -> {
                    InterpreterLanguage item = d.getInterpreterLanguage();
                    return item.toBuilder()
                            .interpreter(interpreterCache.get(item.getInterpreter().getUser().getUsername()))
                            .build();
                },
                interpreterLanguageService::findOrCreate
        );

        // 16. Áreas Turísticas
        Map<String, TouristArea> areaCache = seedMap(
                TouristAreaData.values(),
                d -> d.getTouristArea().getName(),
                d -> touristAreaService.findOrCreate(d.getTouristArea())
        );

        // 17. Guias Turísticos
        Map<String, TourGuide> guideCache = seedMap(
                TourGuideData.values(),
                d -> d.getTourGuide().getUser().getUsername(),
                d -> {
                    TourGuide guide = d.getTourGuide();
                    return tourGuideService.findOrCreate(guide.toBuilder()
                            .user(userCache.get(guide.getUser().getUsername()))
                            .build());
                }
        );

        // 18. Atribuições de Áreas Turísticas aos Guias
        seedList(TourGuideTouristAreaData.values(),
                d -> {
                    TourGuideTouristArea item = d.getTourGuideTouristArea();
                    return item.toBuilder()
                            .tourGuide(guideCache.get(item.getTourGuide().getUser().getUsername()))
                            .touristArea(areaCache.get(item.getTouristArea().getName()))
                            .build();
                },
                tourGuideTouristAreaService::findOrCreate
        );

        // 19. Reviews de Organização
        seedList(OrganizationReviewsData.values(),
                d -> {
                    OrganizationReviews item = d.getOrganizationReviews();
                    return item.toBuilder()
                            .organization(orgCache.get(item.getOrganization().getName()))
                            .review(reviewCache.get(item.getReview().getContent()))
                            .build();
                },
                organizationReviewsService::findOrCreate
        );

        // 20. Endereços de Organização
        seedList(OrganizationAddressData.values(),
                d -> {
                    OrganizationAddress item = d.getOrganizationAddress();
                    return item.toBuilder()
                            .organization(orgCache.get(item.getOrganization().getName()))
                            .address(addressCache.get(item.getAddress().getAddress()))
                            .build();
                },
                organizationAddressService::findOrCreate
        );

        // 21. Reviews de Produto
        seedList(ProductReviewsData.values(),
                d -> {
                    ProductReviews item = d.getProductReviews();
                    return item.toBuilder()
                            .product(productCache.get(item.getProduct().getName()))
                            .review(reviewCache.get(item.getReview().getContent()))
                            .build();
                },
                productReviewsService::findOrCreate
        );

        // 22. Endereços de Produto
        seedList(ProductAddressData.values(),
                d -> {
                    ProductAddress item = d.getProductAddress();
                    return item.toBuilder()
                            .product(productCache.get(item.getProduct().getName()))
                            .address(addressCache.get(item.getAddress().getAddress()))
                            .build();
                },
                productAddressService::findOrCreate
        );

        log.info("Seed finished successfully in {}ms", System.currentTimeMillis() - start);
    }

    private <T, D> void seedList(D[] dataArray, Function<D, T> mapper, Function<T, T> serviceCall) {
        Arrays.stream(dataArray).map(mapper).forEach(serviceCall::apply);
    }

    private <K, V, D> Map<K, V> seedMap(D[] dataArray, Function<D, K> keyMapper, Function<D, V> valueProvider) {
        return Arrays.stream(dataArray).collect(Collectors.toMap(keyMapper, valueProvider));
    }
}