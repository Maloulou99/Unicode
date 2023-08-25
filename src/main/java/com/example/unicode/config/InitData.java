package com.example.unicode.config;

import com.example.unicode.model.Unicode;
import com.example.unicode.repository.UnicodeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepository unicodeRepository;
    @Override
    public void run(String... args) throws Exception {

        Set<Character> characters = new HashSet<>();
        for (int i = -1; i < characters.size(); i++) {
            characters.add((char) i);
        }
        System.out.println("Number of characters: " + characters.size());
    }


}