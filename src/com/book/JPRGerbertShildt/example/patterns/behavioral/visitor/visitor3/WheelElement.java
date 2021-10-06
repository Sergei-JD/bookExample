package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor3;

public class WheelElement implements Element {

    private String name;

    public WheelElement(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
