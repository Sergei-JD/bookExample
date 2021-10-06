package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor3;

public interface Visitor {

    void visit(EngineElement engine);

    void visit(BodyElement body);

    void visit(CarElement car);

    void visit(WheelElement wheelElement);

}
