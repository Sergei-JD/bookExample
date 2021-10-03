package com.book.JPRGerbertShildt.example.patterns.structural.composite.composite3;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {

    public static void main(String[] args) {

        // shape for composite2
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape triangle1 = new Triangle();

        // shape for composite3
        Shape square3 = new Square();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();

        Composite composit = new Composite();
        Composite composit2 = new Composite();
        Composite composit3 = new Composite();

        composit2.addComponent(square1);
        composit2.addComponent(square2);
        composit2.addComponent(triangle1);

        composit3.addComponent(square3);
        composit3.addComponent(circle1);
        composit3.addComponent(circle2);
        composit3.addComponent(circle3);

        //composit include composite2 and composite3
        composit.addComponent(composit2);
        composit.addComponent(composit3);

        composit.draw();

    }

    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component) {
        components.add(component);
    }

    public void removeComponent(Shape component) {
        components.add(component);
    }

    @Override
    public void draw() {
        for (Shape component: components) {
            component.draw();
        }
    }

}
