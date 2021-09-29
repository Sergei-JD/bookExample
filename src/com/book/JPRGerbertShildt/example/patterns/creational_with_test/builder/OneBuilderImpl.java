package com.book.JPRGerbertShildt.example.patterns.creational_with_test.builder;

public class OneBuilderImpl extends Builder {
    public OneBuilderImpl(){
        car = new Car();
    }
    public Car buildCar() {
        car.buildBase();
        car.buildWheels();
        Engine engine = new OneEngine();
        car.buildEngine(engine);
        return car;
    }
}
