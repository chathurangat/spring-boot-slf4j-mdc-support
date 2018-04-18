package com.springbootdev.examples.slf4j.mdc.springbootslf4jmdcsupport.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/welcome")
    public String welcomeMessage()
    {
        logger.info("inside the welcomeMessage");
        return "Welcome to www.SpringBootDev.com";
    }
}
