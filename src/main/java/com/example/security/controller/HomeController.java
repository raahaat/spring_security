package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String home()
    {
        return "This is the home page";
    }

    @GetMapping("/login")
    public String login()
    {
        return "This is the login page";
    }

    @GetMapping("/register")
    public String register()
    {
        return "This is the register page";
    }
}
