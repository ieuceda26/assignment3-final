package com.example.assignment3.controller;

import com.example.assignment3.entity.Character;
import com.example.assignment3.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    
    // Get all characters
    @GetMapping
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    // Get a character by ID
    @GetMapping("/{id}")
    public ResponseEntity<Character> getCharacterById(@PathVariable Long id) {
        Optional<Character> character = characterService.getCharacterById(id);
        if (character.isPresent()) {
            return ResponseEntity.ok(character.get());
        }
        return ResponseEntity.notFound().build();
    }

    // Add a new character
    @PostMapping
    public Character addCharacter(@RequestBody Character character) {
        return characterService.addCharacter(character);
    }

    // Update an existing character
    @PutMapping("/{id}")
    public ResponseEntity<Character> updateCharacter(@PathVariable Long id, @RequestBody Character updatedCharacter) {
        Optional<Character> result = characterService.updateCharacter(id, updatedCharacter);
        if (result.isPresent()) {
            return ResponseEntity.ok(result.get());
        }
        return ResponseEntity.notFound().build();
    }

    // Delete a character
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCharacter(@PathVariable Long id) {
        if (characterService.deleteCharacter(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    
    // Get all characters of a given universe
    @GetMapping("/universe/{universe}")
    public List<Character> getCharactersByUniverse(@PathVariable String universe) {
        return characterService.getCharactersByUniverse(universe);
    }

    // Get characters whose name contains a string
    @GetMapping("/search")
    public List<Character> searchByName(@RequestParam String name) {
        return characterService.searchByName(name);
    }
}

