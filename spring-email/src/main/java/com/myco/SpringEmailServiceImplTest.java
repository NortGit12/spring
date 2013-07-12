package com.myco;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class SpringEmailServiceImplTest {

    @Inject
    static SpringEmailService springEmailService;

    public static void main(String[] args) {
        List<String> recipientsList = new ArrayList<>();
        recipientsList.add("jnorton@ancestry.com");
        String sender = "donotreply@ancestry.com";
        String subject = "Most amazing subject ever!";
        String attachmentPath = null;
        String attachmentName = null;

        springEmailService.sendEncouragingEmail(recipientsList, sender, subject, attachmentPath, attachmentName);
        System.out.println("How did it go?");
    }

}