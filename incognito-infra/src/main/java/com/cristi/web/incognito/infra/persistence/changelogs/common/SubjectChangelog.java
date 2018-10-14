package com.cristi.web.incognito.infra.persistence.changelogs.common;

import com.cristi.web.incognito.domain.subject.Description;
import com.cristi.web.incognito.domain.subject.Subject;
import com.cristi.web.incognito.domain.subject.Subjects;
import com.cristi.web.incognito.domain.subject.Title;
import com.cristi.web.incognito.infra.persistence.subject.MongoSubjects;
import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import org.springframework.data.mongodb.core.MongoTemplate;

@ChangeLog(order = "001")
public class SubjectChangelog {
    @ChangeSet(order = "001", id = "someChangeWithJongo", author = "testAuthor")
    public void initialDataSetForSubjectCollection( MongoTemplate mongoTemplate) {
        // type: org.jongo.Jongo : Jongo driver can be used, used for simpler notation
        // example:

        Subject subject = new Subject(new Title("iPhone xx"), new Description("so xx!!!!!"));
        mongoTemplate.save(subject);
    }

}
