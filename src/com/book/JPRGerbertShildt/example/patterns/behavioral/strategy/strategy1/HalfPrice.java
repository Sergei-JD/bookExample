package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy1;

public class HalfPrice implements Strategy {

    @Override
    public double getPrice(double price) {
        return price * 0.5;
    }

}
