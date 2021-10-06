package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor1;

public class VisitorRunner {

    public static void main(String[] args) {

        Animal animal1 = new Dog();
        animal1.doJob(new ConcreteVisitor());

        Animal animal2 = new Cat();
        animal2.doJob(new ConcreteVisitor());

    }

}
