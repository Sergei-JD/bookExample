package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy1;

public class StrategyRunner {

    public static void main(String[] args) {

        double priceSource = 100;

        Context context = new Context(new HalfPrice());

        double price = context.getPrice(priceSource);
        System.out.println(price);

        context = new Context(new FullPrice());

        price = context.getPrice(priceSource);
        System.out.println(price);

    }

}
