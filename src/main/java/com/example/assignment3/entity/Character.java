package com.example.assignment3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    private String universe;

    private String role;

    private String species;

    private String imageUrl;

    private String abilities;

    private String appearance;

    private String powerLevel;

    // Constructors
    public Character() {}

    public Character(String name, String description, String universe, String role, String species, String imageUrl, String abilities, String appearance, String powerLevel) {
        this.name = name;
        this.description = description;
        this.universe = universe;
        this.role = role;
        this.species = species;
        this.imageUrl = imageUrl;
        this.abilities = abilities;
        this.appearance = appearance;
        this.powerLevel = powerLevel;
    }

    // Getters
    public Long getCharacterId() { return characterId; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getUniverse() { return universe; }
    public String getRole() { return role; }
    public String getSpecies() { return species; }
    public String getImageUrl() { return imageUrl; }
    public String getPowerLevel() { return powerLevel; }
    public String getAbilities() { return abilities; }
    public String getAppearance() { return appearance; }
    // Setters
    public void setCharacterId(Long characterId) { this.characterId = characterId; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setUniverse(String universe) { this.universe = universe; }
    public void setRole(String role) { this.role = role; }
    public void setSpecies(String species) { this.species = species; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public void setAbilities(String abilities) { this.abilities = abilities; }
    public void setAppearance(String appearance) { this.appearance = appearance; }
    public void setPowerLevel(String powerLevel) { this.powerLevel = powerLevel; }
}

