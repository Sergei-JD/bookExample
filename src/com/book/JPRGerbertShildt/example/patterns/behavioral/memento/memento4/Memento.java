package com.book.JPRGerbertShildt.example.patterns.behavioral.memento.memento4;

public class Memento {

    private String state;

    public Memento(String newState){
        state=newState;
    }

    public String getState(){
        return state;
    }

}
