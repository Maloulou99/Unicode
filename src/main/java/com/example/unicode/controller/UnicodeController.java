package com.example.unicode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicodeController {
        /*@GetMapping("/unicode/{i}")
        public String unicodeToChar(@PathVariable int i) {
            char c = (char) i;
            return "unicode=" + i + " char=" + c;
        }*/

        //Bare for at gøre koden mindre, så har jeg tilrettet den således:
        @GetMapping("/unicode/{i}")
        public String unicodeToChar(@PathVariable int i){
            return "unicode=" + i + " char=" + (char) i;
        }

        @GetMapping("/char/{c}")
         public String charToUnicode(@PathVariable char c) {
            return "char=" + c + " unicode=" + (int) c;
        }

}
