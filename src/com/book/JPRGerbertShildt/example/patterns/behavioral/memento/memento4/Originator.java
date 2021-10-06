package com.book.JPRGerbertShildt.example.patterns.behavioral.memento.memento4;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String newState) {
        state = newState;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        state=memento.getState();
    }

}
