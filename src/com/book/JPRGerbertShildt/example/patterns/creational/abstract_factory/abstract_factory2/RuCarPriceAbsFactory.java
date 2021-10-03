package com.book.JPRGerbertShildt.example.patterns.creational.abstract_factory.abstract_factory2;

public class RuCarPriceAbsFactory implements InteAbsFactory {

    public Lada getLada() {
        return new RuLadaImpl();
    }

    public Ferrari getFerrari() {
        return new RuFerrariImpl();
    }

    public Porshe getPorshe() {
        return new RuPorsheImpl();
    }

}
