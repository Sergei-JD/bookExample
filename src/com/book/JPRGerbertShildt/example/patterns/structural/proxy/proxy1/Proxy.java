package com.book.JPRGerbertShildt.example.patterns.structural.proxy.proxy1;

public class Proxy {

    public static void main(String[] args) {

        Car car = new CarProxy();
        car.drive();

    }

}
