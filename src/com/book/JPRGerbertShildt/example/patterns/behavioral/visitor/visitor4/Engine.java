package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor4;

public class Engine implements Car {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
