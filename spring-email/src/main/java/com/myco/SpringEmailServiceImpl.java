package com.myco;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.ui.velocity.VelocityEngineUtils;

@Service
public class SpringEmailServiceImpl implements SpringEmailService {

    @Inject
    private JavaMailSender mailSender;
    @Inject
    private VelocityEngine velocityEngine;

    @Override
    public Boolean sendEncouragingEmail(final List<String> recipientsList, final String sender, final String subject,
            final String adjective, final String attachmentPath, final String attachmentName) {
        Boolean result = false;

        for(String currentRecipient : recipientsList) {
            sendEmail(currentRecipient, sender, subject, adjective, attachmentPath, attachmentName);
        }

        result = true;

        return result;
    }

    private void sendEmail(final String toEmailAddresses, final String fromEmailAddress, final String subject, final String adjective,
            final String attachmentPath, final String attachmentName) {

        MimeMessagePreparator preparator = new MimeMessagePreparator() {
            public void prepare(MimeMessage mimeMessage) throws Exception {

                MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true);
                message.setTo(toEmailAddresses);
                message.setFrom(new InternetAddress(fromEmailAddress));
                message.setSubject(subject);

                Map<String, Object> model = new HashMap<>();
//                model.put("userCode", "12345-ABCD");
                model.put("adjective", adjective);

                String body = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "templates/coolEmailTemplate.vm", "UTF-8", model);
                message.setText(body, true);

                if (!StringUtils.isBlank(attachmentPath)) {
                    FileSystemResource file = new FileSystemResource(attachmentPath);
                    message.addAttachment(attachmentName, file);
                }
            }
        };

        this.mailSender.send(preparator);
    }

}