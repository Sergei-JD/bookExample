package com.book.JPRGerbertShildt.example.patterns.creational.abstract_factory;

public class CarFactory implements Factory {
    @Override
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Aston": return new Aston();
            case "Audi": return new Audi();
            default: return null;
        }
    }

    @Override
    public Tank createOfTank(String typeOfTank) {
        return null;
    }
}
