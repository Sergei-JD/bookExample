package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command4;

public class CommandTest {

    public static void main(String[] args) {

        Car car = new Car();

        StartCar startCar = new StartCar(car);
        StopCar stopCar = new StopCar(car);

        CarInvoker carInvoker1 = new CarInvoker(startCar);
        CarInvoker carInvoker2 = new CarInvoker(stopCar);

        carInvoker1.execute();
        carInvoker2.execute();

    }

}
