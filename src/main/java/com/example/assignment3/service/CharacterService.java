package com.example.assignment3.service;

import com.example.assignment3.entity.Character;
import com.example.assignment3.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    // Get all characters
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    // Get a character by ID
    public Optional<Character> getCharacterById(Long id) {
        return characterRepository.findById(id);
    }

    // Add a new character
    public Character addCharacter(Character character) {
        return characterRepository.save(character);
    }

    // Update an existing character
    public Optional<Character> updateCharacter(Long id, Character updatedCharacter) {
        Optional<Character> existing = characterRepository.findById(id);
        if (existing.isPresent()) {
            Character character = existing.get();
            character.setName(updatedCharacter.getName());
            character.setDescription(updatedCharacter.getDescription());
            character.setUniverse(updatedCharacter.getUniverse());
            character.setRole(updatedCharacter.getRole());
            return Optional.of(characterRepository.save(character));
        }
        return Optional.empty();
    }

    // Delete a character
    public boolean deleteCharacter(Long id) {
        if (characterRepository.existsById(id)) {
            characterRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // Get all characters by universe
    public List<Character> getCharactersByUniverse(String universe) {
        return characterRepository.findByUniverse(universe);
    }

    // Get characters whose name contains a string
    public List<Character> searchByName(String name) {
        return characterRepository.findByNameContainingIgnoreCase(name);
    }
}
