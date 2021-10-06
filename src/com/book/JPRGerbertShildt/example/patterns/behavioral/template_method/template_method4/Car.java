package com.book.JPRGerbertShildt.example.patterns.behavioral.template_method.template_method4;

abstract class Car {

    abstract void startEngine();

    abstract void stopEngine();

    public final void start(){
        startEngine();
        stopEngine();
    }

}
