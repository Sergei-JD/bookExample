package com.book.JPRGerbertShildt.example.patterns.structural.flyweight.flyweight3;

public class Circle implements Shape {

    int r = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println("("+x+", "+y+"): рисуем круг радиусом " +r);
    }

}
