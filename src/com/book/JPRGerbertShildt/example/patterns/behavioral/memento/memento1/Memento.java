package com.book.JPRGerbertShildt.example.patterns.behavioral.memento.memento1;

public class Memento {

    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {
        this.state = state;
    }

}
