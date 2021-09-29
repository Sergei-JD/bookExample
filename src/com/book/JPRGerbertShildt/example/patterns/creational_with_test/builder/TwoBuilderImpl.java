package com.book.JPRGerbertShildt.example.patterns.creational_with_test.builder;

public class TwoBuilderImpl extends Builder {
    public TwoBuilderImpl(){
        car = new Car();
    }
    public Car buildCar() {
        car.buildBase();
        car.buildWheels();
        Engine engine = new OneEngine();
        car.buildEngine(engine);
        car.buildWheels();
        engine = new TwoEngine();
        car.buildEngine(engine);
        return car;
    }
}
