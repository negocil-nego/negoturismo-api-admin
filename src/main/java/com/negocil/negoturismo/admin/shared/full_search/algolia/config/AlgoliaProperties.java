package com.negocil.negoturismo.admin.shared.full_search.algolia.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "fullsearch.algolia")
public record AlgoliaProperties(String appId, String apiKey) {}
