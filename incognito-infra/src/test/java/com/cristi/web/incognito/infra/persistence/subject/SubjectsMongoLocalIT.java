package com.cristi.web.incognito.infra.persistence.subject;

import com.cristi.web.incognito.domain.subject.Description;
import com.cristi.web.incognito.domain.subject.Subject;
import com.cristi.web.incognito.domain.subject.Title;
import com.cristi.web.incognito.incognito.application.ApplicationConfig;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataMongoTest
@SpringBootTest(classes = {ApplicationConfig.class})
@EnableAutoConfiguration
public class SubjectsMongoLocalIT {

    @Autowired
    private MongoSubjects repo;
    @Autowired
    private SubjectsMongo sut;

    @Test
    public void findAll() {
    }

    @Test
    public void getOrThrow() {
    }

    @Test
    public void get() {
        Subject subject = new Subject(new Title("iphone xs"), new Description("It is so expensive!!"));
        repo.insert(subject);
        Optional<Subject> actual = sut.get(subject.getId());
        assertThat(actual).isNotEmpty();
        assertThat(actual.get()).isEqualToComparingFieldByFieldRecursively(subject);
    }

    @Test
    public void add() {
    }
}