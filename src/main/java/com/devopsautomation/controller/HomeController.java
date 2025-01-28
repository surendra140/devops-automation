package com.devopsautomation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String message(){
        return "Welcome to Surendra's codespace";
    }
}
