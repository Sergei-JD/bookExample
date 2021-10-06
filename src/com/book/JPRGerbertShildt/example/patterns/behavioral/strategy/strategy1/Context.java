package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy1;

public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(double price) {
        return strategy.getPrice(price);
    }

}
