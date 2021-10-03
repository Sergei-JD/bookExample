package com.book.JPRGerbertShildt.example.patterns.creational.factory_method.factory_method1;

public class Factory {

    public Car create(String typeOfCar) {

        return switch (typeOfCar) {
            case "Toyota" -> new Toyota();
            case "Audi" -> new Audi();
            default -> null;
        };
    }

}
