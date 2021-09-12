package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    
    @GetMapping("/thymeleaf")
    public String view(Model model){
        model.addAttribute("message", "Hello, Thymeleaf!!");
        return "thymeleaf";
    }
}
