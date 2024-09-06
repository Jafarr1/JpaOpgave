package com.example.jpaunicode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.jpaunicode.model.Unicode;
import com.example.jpaunicode.repository.UnicodeRepository;

import jakarta.annotation.PostConstruct;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class InitData {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @PostConstruct
    public void init() {
        // Define a set of Unicode characters to initialize
        Set<Character> unicodeSet = Stream.of('A', 'B', 'C', 'Æ', 'Ø', 'Å')
                .collect(Collectors.toSet());
        saveUnicodeSet(unicodeSet);
    }

    private void saveUnicodeSet(Set<Character> unicodeSet) {
        // Convert each character to a Unicode entity and save it
        unicodeSet.forEach(character -> {
            int unicodeValue = (int) character; // Get the Unicode integer value of the character
            Unicode unicode = new Unicode(unicodeValue, character); // Create Unicode entity
            unicodeRepository.save(unicode); // Save the entity in the database
        });
    }
}
