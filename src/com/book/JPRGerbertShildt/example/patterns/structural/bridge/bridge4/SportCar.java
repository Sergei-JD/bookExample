package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge4;

public class SportCar extends Car {

    public SportCar(Engine engine) {
        super(engine);
    }

    public void setEngine() {
        System.out.print("SportCar engine: ");
        engine.setEngine();
    }

}
