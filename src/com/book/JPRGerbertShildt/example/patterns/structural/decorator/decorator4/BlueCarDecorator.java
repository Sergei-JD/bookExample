package com.book.JPRGerbertShildt.example.patterns.structural.decorator.decorator4;

public class BlueCarDecorator extends CarDecorator {

    public BlueCarDecorator(Car decorated) {
        super(decorated);
    }

    public void draw() {
        decorated.draw();
        setColor();
    }

    private void setColor(){
        System.out.println("Color: red");
    }

}
