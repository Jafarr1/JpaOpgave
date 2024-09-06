package com.example.jpaunicode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jpaunicode.model.Unicode;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {
}
