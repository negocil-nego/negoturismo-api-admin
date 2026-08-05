package com.negocil.negoturismo.admin.config;

import com.negocil.negoturismo.admin.feature.organization.repository.OrganizationHighlightsRepository;
import com.negocil.negoturismo.admin.feature.product.repository.ProductPromotionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Slf4j
@Configuration
@EnableScheduling
@RequiredArgsConstructor
public class SchedulerConfig {
    private final ProductPromotionRepository productPromotionRepo;
    private final OrganizationHighlightsRepository organizationHighlightsRepo;

    @Transactional
    @Scheduled(cron = "0 0 0 * * ?")
    public void checkAndExpirePromotionsAndHighlights() {
        log.info("Starting daily job to expire product promotions and organization highlights...");
        Instant now = Instant.now();

        try {
            int expiredPromotions = productPromotionRepo.updateStatusToExpired(now);
            log.info("Expired {} product promotions.", expiredPromotions);
        } catch (Exception e) {
            log.error("Failed to expire product promotions: ", e);
        }

        try {
            int expiredHighlights = organizationHighlightsRepo.updateStatusToExpired(now);
            log.info("Expired {} organization highlights.", expiredHighlights);
        } catch (Exception e) {
            log.error("Failed to expire organization highlights: ", e);
        }
    }
}
