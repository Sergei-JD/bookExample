package com.book.JPRGerbertShildt.example.patterns.structural.facade.facade4;

public class Engine implements Car {

    public void start() {
        System.out.println("Запустить двигатель");
    }

    public void stop() {
        System.out.println("Остановить двигатель");
    }

}
