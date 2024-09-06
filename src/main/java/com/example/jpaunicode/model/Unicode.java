package com.example.jpaunicode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Unicode {

@Id
    private int unicode;
@Column(nullable = false)
    private char bogstav;

    public Unicode() {
    }

    public Unicode(int unicode, char bogstav) {
        this.unicode = unicode;
        this.bogstav = bogstav;
    }

    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public char getBogstav() {
        return bogstav;
    }

    public void setBogstav(char bogstav) {
        this.bogstav = bogstav;
    }
}
