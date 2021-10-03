package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge1;

abstract class ITruck {

    IBridge iBridge;

    public ITruck(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    abstract void drive();

}
