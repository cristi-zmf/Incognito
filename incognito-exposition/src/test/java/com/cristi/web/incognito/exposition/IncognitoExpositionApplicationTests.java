package com.cristi.web.incognito.exposition;

import com.cristi.web.incognito.incognito.application.ApplicationConfig;
import com.cristi.web.incognito.infra.persistence.subject.MongoSubjects;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationConfig.class)
public class IncognitoExpositionApplicationTests {


	@Test
	public void contextLoads() {
	}

}
