package com.book.JPRGerbertShildt.example.patterns.creational.builder.builder2;

public class Car {

    public void buildBase() {
        print("Делаем корпус");
    }

    public void buildWheels() {
        print("Ставим колесо");
    }

    public void buildEngine(Engine engine) {
        print("Ставим движок: " + engine.getEngineType());
    }

    private void print(String msg){
        System.out.println(msg);
    }

}
