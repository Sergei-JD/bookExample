package com.book.JPRGerbertShildt.example.patterns.creational.builder.builder2;

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
