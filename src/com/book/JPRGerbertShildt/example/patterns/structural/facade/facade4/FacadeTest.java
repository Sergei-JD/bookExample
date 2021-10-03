package com.book.JPRGerbertShildt.example.patterns.structural.facade.facade4;

public class FacadeTest {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.startCar();
        System.out.println();
        facade.stoptCar();

    }

}
