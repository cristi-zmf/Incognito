package com.cristi.web.incognito.exposition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@StandardConfig
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.cristi.web.incognito")
public class RestApplication extends SpringBootServletInitializer {
    private static Class<RestApplication> applicationClass = RestApplication.class;
    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
}
