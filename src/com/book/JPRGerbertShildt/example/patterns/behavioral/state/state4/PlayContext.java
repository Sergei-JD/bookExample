package com.book.JPRGerbertShildt.example.patterns.behavioral.state.state4;

public class PlayContext implements State {

    private State state;

    public void setState(State state){
        this.state = state;
    }

    public void doAction() {
        this.state.doAction();
    }

}
