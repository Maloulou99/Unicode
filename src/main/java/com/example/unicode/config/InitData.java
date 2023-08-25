package com.example.unicode.config;

import com.example.unicode.model.Unicode;
import com.example.unicode.repository.UnicodeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData {
    @Autowired
    private UnicodeRepository unicodeRepository;

    @PostConstruct
    public void initData() {
        Set<Character> unicodeLetters = generateUnicodeLettersSet();

        for (char letter : unicodeLetters) {
            Unicode unicode = new Unicode();
            unicode.setUnicode((int) letter);
            unicode.setLetter(letter);
            unicodeRepository.save(unicode);
        }

        System.out.println("Unicode letters saved to the database.");
    }

    public Set<Character> generateUnicodeLettersSet() {
        Set<Character> unicodeLetters = new HashSet<>();

        for (int codePoint = 0; codePoint <= Character.MAX_VALUE; codePoint++) {
            if (Character.isLetter(codePoint)) {
                unicodeLetters.add((char) codePoint);
            }
        }

        return unicodeLetters;
    }
}

