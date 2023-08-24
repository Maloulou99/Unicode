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
    private final UnicodeRepository unicodeRepository;

    @Autowired
    public InitData(UnicodeRepository unicodeRepository) {
        this.unicodeRepository = unicodeRepository;
    }

    @PostConstruct
    public void initData() {
        Set<Character> characters = new HashSet<>();
        characters.add('a');
        characters.add('b');
        characters.add('c');

        for (char c : characters) {
            Unicode unicode = new Unicode();
            unicode.setUnicode(c);
            unicode.setLetter(c);
            unicodeRepository.save(unicode);
        }
    }
}

