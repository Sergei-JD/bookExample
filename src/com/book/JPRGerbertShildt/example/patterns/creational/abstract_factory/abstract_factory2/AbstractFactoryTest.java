package com.book.JPRGerbertShildt.example.patterns.creational.abstract_factory.abstract_factory2;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        String country = "UA";
        InteAbsFactory ifactory = null;

        if(country.equals("UA")) {
            ifactory = new UaCarPriceAbsFactory();
        } else if(country.equals("RU")) {
            ifactory = new RuCarPriceAbsFactory();
        }

        Lada lada = ifactory.getLada();
        System.out.println(lada.getLadaPrice());

    }

}
