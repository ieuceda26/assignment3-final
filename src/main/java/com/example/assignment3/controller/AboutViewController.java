package com.example.assignment3.controller;

import com.example.assignment3.entity.Character;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutViewController {

    @GetMapping({"/about"})
    public String about(Model model) {
        Character fallbackCharacter = new Character();
        fallbackCharacter.setName("Goku");
        fallbackCharacter.setImageUrl("/goku.jpeg");
        model.addAttribute("character", fallbackCharacter);
        model.addAttribute("pageTitle", "About This Website");
        return "about";
    }
}
