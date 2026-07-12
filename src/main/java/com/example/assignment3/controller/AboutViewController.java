package com.example.assignment3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutViewController {
    
    @GetMapping({"/about"})
    public String about() {
        return "about";
    }
}
