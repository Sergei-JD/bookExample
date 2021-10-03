package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge2;

public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }

}
