package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command4;

public class StopCar implements Command {

    Car car;

    public StopCar(Car car) {
        this.car = car;
    }

    public void execute() {
        car.stopEngine();
    }

}
