package com.book.JPRGerbertShildt.example.patterns.structural.facade.facade3;

public class DVDRom {

    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    void load() {
        data = true;
    }

    void unload() {
        data = false;
    }

}
