package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor4;

public interface Visitor {

    void visit(SportCar sportCar);

    void visit(Engine engine);

    void visit(Whell whell);

}
