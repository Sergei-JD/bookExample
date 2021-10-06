package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy3;

public class StrategyClient {

    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int[] arr) {
        strategy.sort(arr);
    }

}
