package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge1;

public class Bridge {

    public static void main(String[] args) {

        ICar toyotaCar = new ToyotaCar(new CarBridge());
        toyotaCar.drive();

        ICar audiCar = new AudiCar(new CarBridge());
        audiCar.drive();

        ITruck toyotaTruck = new ToyotaTruck(new TruckBridge());
        toyotaTruck.drive();

        ITruck audiTruck = new AudiTruck(new TruckBridge());
        audiTruck.drive();

    }

}
