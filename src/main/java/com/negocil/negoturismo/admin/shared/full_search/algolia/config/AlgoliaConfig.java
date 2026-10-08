package com.negocil.negoturismo.admin.shared.full_search.algolia.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.algolia.api.SearchClient;

@Configuration
@EnableConfigurationProperties(AlgoliaProperties.class)
@ConditionalOnProperty(prefix = "service", name = "fullsearch", havingValue = "algolia", matchIfMissing = true)
public class AlgoliaConfig {

    @Bean(destroyMethod = "close")
    public SearchClient algoliaClient(AlgoliaProperties properties) {
        return new SearchClient(properties.appId(), properties.apiKey());
    }
}
