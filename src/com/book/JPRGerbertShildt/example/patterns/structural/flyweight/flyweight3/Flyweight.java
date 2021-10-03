package com.book.JPRGerbertShildt.example.patterns.structural.flyweight.flyweight3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Flyweight {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("точка"));
        shapes.add(shapeFactory.getShape("точка"));
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("квадрат"));
        shapes.add(shapeFactory.getShape("круг"));
        shapes.add(shapeFactory.getShape("точка"));

        Random rand = new Random();
        for (Shape shape: shapes) {
            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            shape.draw(x, y);
        }
    }

}
