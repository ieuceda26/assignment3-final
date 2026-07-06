package com.example.assignment3.repository;
import com.example.assignment3.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

    // Get all characters of a given universe
    List<Character> findByUniverse(String universe);

    // Get characters whose name contains a string 
    List<Character> findByNameContainingIgnoreCase(String name);
}
