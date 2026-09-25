package com.negocil.negoturismo.admin.shared.core.i18n;

import com.negocil.negoturismo.admin.shared.user.model.User;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class I18n {
    private final MessageSource messageSource;

    public I18n(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String get(User user, String key, Object... args) {
        return messageSource.getMessage(key, args, user.getLanguage());
    }

    public String get(String key, Locale locale, Object... args) {
        return messageSource.getMessage(key, args, locale);
    }

    public String get(String key, Object... args) {
        return messageSource.getMessage(key, args, Locale.getDefault());
    }
}