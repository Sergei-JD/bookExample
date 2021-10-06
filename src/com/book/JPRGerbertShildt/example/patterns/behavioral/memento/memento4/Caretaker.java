package com.book.JPRGerbertShildt.example.patterns.behavioral.memento.memento4;

public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento newMemento) {
        memento = newMemento;
    }

}
