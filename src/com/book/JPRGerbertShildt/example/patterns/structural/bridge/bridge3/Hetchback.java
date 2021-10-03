package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge3;

public class Hetchback extends Car {

    public Hetchback(Make m) {
        super(m);
    }

    @Override
    void showType() {
        System.out.println("Hetchback");
    }

}
