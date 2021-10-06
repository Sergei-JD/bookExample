package com.book.JPRGerbertShildt.example.patterns.behavioral.memento.memento1;

public class Originator {

    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Memento createMomento() {
        return new Memento(state);
    }

    void getDataFromMomento(Memento momento) {
        this.state = momento.getState();
    }

}
