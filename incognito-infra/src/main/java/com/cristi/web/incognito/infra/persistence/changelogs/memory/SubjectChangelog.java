package com.cristi.web.incognito.infra.persistence.changelogs.memory;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.springframework.context.annotation.Profile;

@ChangeLog(order = "001")
@Profile("MEMORY_MONGO")
public class SubjectChangelog {
    @ChangeSet(order = "001", id = "someChangeWithJongo", author = "testAuthor")
    public void initialDataSetForSubjectCollection(Jongo jongo) {
        // type: org.jongo.Jongo : Jongo driver can be used, used for simpler notation
        // example:
        MongoCollection mycollection = jongo.getCollection("subject");
        mycollection.insert(
                "{" +
                        "_id:{value:071eed5c-d87e-498b-ab3e-08e7819117d5}," +
                        "title:{value:iphone xs}," +
                        "description:{value:very expensive phone}," +
                        "_class:com.cristi.web.incognito.domain.subject.Subject}"
        );
    }

}
