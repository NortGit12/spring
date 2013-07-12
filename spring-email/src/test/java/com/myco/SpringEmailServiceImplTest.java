package com.myco;

import com.myco.service.test.AbstractServiceImplTest;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;

public class SpringEmailServiceImplTest extends AbstractServiceImplTest {

    @Inject
    SpringEmailService springEmailService;

    @Test
    public void testSendEncouragingEmailValidSimpleEmail() {
        List<String> recipientsList = new ArrayList<>();
        recipientsList.add("jnorton@ancestry.com");
//        recipientsList.add("jvincent@ancestry.com");
//        recipientsList.add("jeff12ntn@gmail.com");
        String sender = "donotreply@ancestry.com";
        String subject = "This just in ...";
        String adjective = "AMAZING, COOL & AWESOME";
        String attachmentPath = null;
        String attachmentName = null;

        springEmailService.sendEncouragingEmail(recipientsList, sender, subject, adjective, attachmentPath, attachmentName);
    }

}