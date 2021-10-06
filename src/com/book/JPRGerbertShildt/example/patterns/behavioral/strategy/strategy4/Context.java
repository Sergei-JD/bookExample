package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy4;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void download(String file){
        strategy.download(file);
    }

}
