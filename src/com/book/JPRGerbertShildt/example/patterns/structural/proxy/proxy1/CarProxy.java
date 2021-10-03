package com.book.JPRGerbertShildt.example.patterns.structural.proxy.proxy1;

public class CarProxy implements Car {

    Car car = new Reno();

    @Override
    public void drive() {
        System.out.println("Proxy code");
        car.drive();
    }

}
