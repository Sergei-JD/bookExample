package com.book.JPRGerbertShildt.example.patterns.structural.decorator.decorator3;

public class RightBracketDecorator extends Decorator{

    public RightBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }

}
