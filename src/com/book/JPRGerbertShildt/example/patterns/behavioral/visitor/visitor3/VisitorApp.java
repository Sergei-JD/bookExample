package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor3;

public class VisitorApp {

    public static void main(String[] args) {

        Element car = new CarElement();

        car.accept(new HooliganVisitor());

        System.out.println("\n====================\n");

        car.accept(new MechanicVisitor());

    }

}
