package com.book.JPRGerbertShildt.example.patterns.creational.abstract_factory.abstract_factory1;

public class AbstractFactory {

    Factory createFactory(String typeOfFactory) {

        switch (typeOfFactory) {
            case "Car": return new CarFactory();
            case "Tank": return new TankFactory();
            default: return null;
        }
    }

}
