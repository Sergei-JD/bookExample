package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge3;

abstract class Car {

    Make make;

    public Car(Make m) {
        make = m;
    }

    abstract void showType();

    void showDetails() {
        showType();
        make.setMake();
    }

}
