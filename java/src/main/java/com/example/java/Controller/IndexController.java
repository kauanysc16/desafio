package com.example.java.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
   @GetMapping("/home")
    public String acessoHomePage() {
        return "index";
    }   
}
