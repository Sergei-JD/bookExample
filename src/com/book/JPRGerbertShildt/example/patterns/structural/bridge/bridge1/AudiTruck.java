package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge1;

public class AudiTruck extends ITruck {

    public AudiTruck(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    void drive() {
        System.out.println("drive audi truck");
    }

}
