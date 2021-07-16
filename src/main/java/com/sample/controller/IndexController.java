package com.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    public static final String WELCOME_MESSAGE = "Welcome to ZeroCode Example!";

    @RequestMapping("/")
    public String index() {
        return WELCOME_MESSAGE;
    }
}