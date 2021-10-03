package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge1;

public class AudiCar extends ICar {

    public AudiCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    void drive() {
        System.out.println("drive audi car");
    }

}
