package com.book.JPRGerbertShildt.example.patterns.structural.adapter.adapter2;

public class AdapterJavaToDatabase extends JavaApplication implements Database {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }

}
