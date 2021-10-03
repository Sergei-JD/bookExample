package com.book.JPRGerbertShildt.example.patterns.structural.adapter.adapter1;

public class TruckWrap implements Car {

    Truck truck;

    public TruckWrap(Truck truck) {
        this.truck = truck;
    }

    @Override
    public void wash() {
        truck.clean();
    }

}
