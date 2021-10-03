package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge1;

abstract class ICar {

    IBridge iBridge;

    public ICar(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    abstract void drive();

}
