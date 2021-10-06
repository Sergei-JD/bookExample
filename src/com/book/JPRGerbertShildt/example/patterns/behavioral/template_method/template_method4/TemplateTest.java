package com.book.JPRGerbertShildt.example.patterns.behavioral.template_method.template_method4;

public class TemplateTest {

    public static void main(String[] args) {

        Car car1 = new OneCar();
        car1.start();

        System.out.println();

        Car car2 = new TwoCar();
        car2.start();

    }

}
