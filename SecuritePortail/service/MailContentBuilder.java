package ma.emsi.gestion_depense.SecuritePortail.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
@Service
@AllArgsConstructor
public class MailContentBuilder {
    private final TemplateEngine templateEngine;
    String build(String message){ // takes the email message as input
        Context context=new Context();
        context.setVariable("message",message);//send the email inside thymleaf's context method using this
        return templateEngine.process("mailTemplate",context);//passing te file mail to the template engine's process method

    }
}
