package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor2;

public class Test implements ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }

}
