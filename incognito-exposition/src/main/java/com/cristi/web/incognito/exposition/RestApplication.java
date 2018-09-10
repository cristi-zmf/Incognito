package com.cristi.web.incognito.exposition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//@StandardConfig
@SpringBootApplication
@ComponentScan(basePackages = "com.cristi.web.incognito")
public class RestApplication extends SpringBootServletInitializer {
//    private static Class<RestApplication> applicationClass = RestApplication.class;
    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(applicationClass);
//    }
}
