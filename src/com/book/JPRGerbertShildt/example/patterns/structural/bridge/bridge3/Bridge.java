package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge3;

public class Bridge {

    public static void main(String[] args) {

        Car car1 = new Hetchback(new Kia());
        Car car2 = new Hetchback(new Skoda());
        Car car3 = new Sedan(new Kia());
        Car car4 = new Sedan(new Skoda());

        car1.showDetails();
        System.out.println();
        car2.showDetails();
        System.out.println();
        car3.showDetails();
        System.out.println();
        car4.showDetails();

    }

}
