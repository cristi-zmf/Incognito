package com.cristi.web.incognito.infra.persistence;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.cristi.web.incognito")
public class PersistenceConfig {
}
