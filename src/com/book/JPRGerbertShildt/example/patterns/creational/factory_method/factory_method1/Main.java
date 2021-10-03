package com.book.JPRGerbertShildt.example.patterns.creational.factory_method.factory_method1;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();

        Car toyota = factory.create("Toyota");
        Car audi = factory.create("Audi");

        toyota.drive();
        audi.drive();

    }

}
