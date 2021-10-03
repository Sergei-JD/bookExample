package com.book.JPRGerbertShildt.example.patterns.structural.decorator.decorator3;

public class LeftBracketDecorator extends Decorator {

    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.print();
    }

}
