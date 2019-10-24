package com.dela.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class GreetingsController {

    @Autowired
    MessageSource messageSource;

    @GetMapping(path = "/greeting")
    public String getGreeting() {
        return messageSource.getMessage("greetings.good_morning", null, LocaleContextHolder.getLocale());
    }
}
