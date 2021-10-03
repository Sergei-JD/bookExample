package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge1;

public class ToyotaTruck extends ITruck {

    public ToyotaTruck(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    void drive() {
        System.out.println("drive toyota truck");
    }

}
