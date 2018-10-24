package com.thomasorten.securitydemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.rmi.registry.Registry;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(ModelMap map) {
        return "home";
    }

    @GetMapping("/home")
    public String home(ModelMap map) {
        return "redirect:/";
    }

    @GetMapping("/hello")
    public String hello(ModelMap map) {
        return "hello";
    }

    @GetMapping("/login")
    public String login(ModelMap map) {
        return "login";
    }
    
}
