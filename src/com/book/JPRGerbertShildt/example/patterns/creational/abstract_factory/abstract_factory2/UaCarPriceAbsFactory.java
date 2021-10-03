package com.book.JPRGerbertShildt.example.patterns.creational.abstract_factory.abstract_factory2;

public class UaCarPriceAbsFactory implements InteAbsFactory {

    public Lada getLada() {
        return new UaLadaImpl();
    }

    public Ferrari getFerrari() {
        return new UaFerrariImpl();
    }

    public Porshe getPorshe() {
        return new UaPorsheImpl();
    }

}
