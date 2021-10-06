package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor3;

public class CarElement implements Element {

    Element[] elements;

    public CarElement() {
        this.elements = new Element[]{new WheelElement("переднее левое"),
        new WheelElement("переднее правое"), new WheelElement("заднее левое"),
        new WheelElement("заднее правое"), new EngineElement()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element: elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }

}
