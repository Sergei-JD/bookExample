package com.book.JPRGerbertShildt.example.patterns.creational.abstract_factory;

public class TankFactory implements Factory {
    @Override
    public Tank createOfTank(String typeOfTank) {
        switch (typeOfTank) {
            case "Leopard": return new Leopard();
            case "Patton": return new Patton();
            default: return null;
        }
    }

    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }
}
