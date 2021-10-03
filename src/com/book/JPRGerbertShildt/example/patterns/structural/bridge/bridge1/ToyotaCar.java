package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge1;

public class ToyotaCar extends ICar {

    public ToyotaCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    void drive() {
        System.out.println("drive toyota car");
    }

}
