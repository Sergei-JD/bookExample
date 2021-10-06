package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor3;

public class BodyElement implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
