package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge4;

public class UnknownCar extends Car {

    public UnknownCar(Engine engine) {
        super(engine);
    }

    public void setEngine() {
        System.out.print("UnknownCar engine: ");
        engine.setEngine();
    }

}
