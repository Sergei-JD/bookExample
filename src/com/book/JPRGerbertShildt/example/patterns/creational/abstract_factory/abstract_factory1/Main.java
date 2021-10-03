package com.book.JPRGerbertShildt.example.patterns.creational.abstract_factory.abstract_factory1;

public class Main {

    public static void main(String[] args) {

        Factory carFactory = new AbstractFactory().createFactory("Car");
        Factory tankFactory = new AbstractFactory().createFactory("Tank");

        Car aston = carFactory.createCar("Aston");
        Car audi = carFactory.createCar("Audi");
        aston.drive();
        audi.drive();

        Tank leopard = tankFactory.createOfTank("Leopard");
        Tank patton = tankFactory.createOfTank("Patton");
        leopard.drive();
        patton.drive();

    }

}
