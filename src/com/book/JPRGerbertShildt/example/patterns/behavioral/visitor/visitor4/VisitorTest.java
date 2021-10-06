package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor4;

public class VisitorTest {

    public static void main(String[] args) {

        Car computer = new SportCar();
        computer.accept(new CarVisitor());

    }

}
