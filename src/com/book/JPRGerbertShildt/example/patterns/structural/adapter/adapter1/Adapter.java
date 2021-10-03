package com.book.JPRGerbertShildt.example.patterns.structural.adapter.adapter1;

public class Adapter {

    public static void main(String[] args) {

        CarWash carWash1 = new CarWash();
        carWash1.washCar(new Audi());
        CarWash carWash2 = new CarWash();
        carWash2.washCar(new TruckWrap(new MyTruck()));

    }

}
