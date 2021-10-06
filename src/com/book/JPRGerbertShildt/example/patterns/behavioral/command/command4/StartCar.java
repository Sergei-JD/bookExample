package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command4;

public class StartCar implements Command {

    Car car;

    public StartCar(Car car) {
        this.car = car;
    }

    public void execute() {
        car.startEngine();
    }

}
