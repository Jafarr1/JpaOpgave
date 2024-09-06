package com.example.jpaunicode.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicodeRestController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char)i;
        return "unicode=" + i + "char=" + c;
    }

    @GetMapping("/char/{ch}")
    public String charToUnicode(@PathVariable String ch) {
        char character = ch.charAt(0);
        int unicodeValue = character;
        return "char=" + character + " unicode=" + unicodeValue;
    }

    @GetMapping("/letters")
    public String getLetters(@RequestParam char start, @RequestParam int count) {
        if (count <= 0) {
            return "Antallet skal være større end 0.";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            char currentChar = (char) (start + i);
            result.append(currentChar).append(" ");
        }

        return result.toString().trim();
    }
}


