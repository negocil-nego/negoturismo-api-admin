package com.negocil.negoturismo.admin.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@NoArgsConstructor
@ConfigurationProperties(prefix = "service")
public class ServiceConfig {
    private String email;
    private String phone;
    private String fullsearch;

    public boolean fullsearchEqualsAlgolia() {
        return "algolia".equalsIgnoreCase(fullsearch);
    }
}
