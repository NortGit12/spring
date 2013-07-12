package com.myco;

import java.util.List;

public interface SpringEmailService {

    /**
     * Send an encouraging e-mail to recipients
     *
     * @param recipientsList
     * @param sender
     * @param subject
     * @param attachmentPath
     * @param attachmentName
     *
     * @return true (success) or false (failure)
     */
    Boolean sendEncouragingEmail(final List<String> recipientsList, final String sender, final String subject,
            final String adjective, final String attachmentPath, final String attachmentName);

}