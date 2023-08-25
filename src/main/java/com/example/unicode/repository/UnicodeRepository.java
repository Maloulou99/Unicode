package com.example.unicode.repository;

import com.example.unicode.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashSet;
import java.util.Set;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {


}
