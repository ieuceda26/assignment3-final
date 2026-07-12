package com.example.assignment3.controller;

import com.example.assignment3.entity.Character;
import com.example.assignment3.service.CharacterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping({"/characters"})
public class CharacterUIController {

    private final CharacterService characterService;

    public CharacterUIController(CharacterService characterService) {
        this.characterService = characterService;
    }


    // GET /characters
    @GetMapping()
    public String getAllCharacters(Model model) {
        model.addAttribute("characterList", characterService.getAllCharacters());
        model.addAttribute("pageTitle", "Character Gallery");
        return "index";
    }

    // GET /characters/{id}
    @GetMapping("/{id}")
    public String getCharacterById(@PathVariable Long id, Model model) {
        Optional<Character> character = characterService.getCharacterById(id);
        if (character.isPresent()) {
            model.addAttribute("character", character.get());
            model.addAttribute("pageTitle", character.get().getName() + " Details");
            return "details";
        }
        return "redirect:/characters";
    }

    // GET /characters/new — show create form
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("character", new Character());
        model.addAttribute("pageTitle", "Add a Character");
        return "new-character-form";
    }

    // POST /characters/save — handle create
    @PostMapping("/save")
    public String createCharacter(Character character) {
        Character created = characterService.addCharacter(character);
        if (created != null) {
            return "redirect:/characters/" + created.getCharacterId();
        }
        return "redirect:/characters/new?error=true";
    }

    // GET /characters/updateForm/{id} — show update form
    @GetMapping("/updateForm/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Optional<Character> character = characterService.getCharacterById(id);
        if (character.isPresent()) {
            model.addAttribute("character", character.get());
            model.addAttribute("pageTitle", "Update Character: " + id);
            return "character-update";
        }
        return "redirect:/characters";
    }

    // POST /characters/update/{id} — handle update
    @PostMapping("/update/{id}")
    public String updateCharacter(@PathVariable Long id, Character updatedCharacter) {
        Optional<Character> updated = characterService.updateCharacter(id, updatedCharacter);
        if (updated.isPresent()) {
            return "redirect:/characters/" + id;
        }
        return "redirect:/characters/" + id + "?error=true";
    }

    // GET /characters/delete/{id}
    @GetMapping("/delete/{id}")
    public String deleteCharacter(@PathVariable Long id) {
        boolean isDeleted = characterService.deleteCharacter(id);
        if (isDeleted) {
            return "redirect:/characters";
        }
        return "redirect:/characters/" + id + "?error=true";
    }
}
