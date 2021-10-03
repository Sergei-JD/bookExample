package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge4;

abstract class Car {

    protected Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    abstract public void setEngine();

}
