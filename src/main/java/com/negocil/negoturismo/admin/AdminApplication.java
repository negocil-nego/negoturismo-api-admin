package com.negocil.negoturismo.admin;

import com.negocil.negoturismo.admin.config.properties.CorsProperties;
import com.negocil.negoturismo.admin.config.properties.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({RsaKeyProperties.class, CorsProperties.class})
public class AdminApplication {
	static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
}