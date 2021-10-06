package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor1;

public class ConcreteVisitor implements Visitor {

    @Override
    public void doDog() {
        System.out.println("Dog");
    }

    @Override
    public void doCat() {
        System.out.println("Cat");
    }

}
