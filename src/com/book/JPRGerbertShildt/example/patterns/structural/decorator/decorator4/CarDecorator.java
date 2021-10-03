package com.book.JPRGerbertShildt.example.patterns.structural.decorator.decorator4;

abstract class CarDecorator implements Car {

    protected Car decorated;

    public CarDecorator(Car decorated){
        this.decorated = decorated;
    }

    public void draw(){
        decorated.draw();
    }

}
