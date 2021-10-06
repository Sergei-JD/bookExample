package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor3;

public class EngineElement implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
