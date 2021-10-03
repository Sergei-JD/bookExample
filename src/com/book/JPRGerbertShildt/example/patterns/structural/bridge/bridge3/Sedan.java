package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge3;

public class Sedan extends  Car {

    public Sedan(Make m) {
        super(m);
    }

    @Override
    void showType() {
        System.out.println("Sedan");
    }

}
