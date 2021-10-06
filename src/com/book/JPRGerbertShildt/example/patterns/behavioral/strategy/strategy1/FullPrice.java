package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy1;

public class FullPrice implements Strategy {

    @Override
    public double getPrice(double price) {
        return price;
    }

}
