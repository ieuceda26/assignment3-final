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

    // Constructors
    public Character() {}

    public Character(String name, String description, String universe, String role) {
        this.name = name;
        this.description = description;
        this.universe = universe;
        this.role = role;
    }

    // Getters
    public Long getCharacterId() { return characterId; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getUniverse() { return universe; }
    public String getRole() { return role; }

    // Setters
    public void setCharacterId(Long characterId) { this.characterId = characterId; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setUniverse(String universe) { this.universe = universe; }
    public void setRole(String role) { this.role = role; }
}

