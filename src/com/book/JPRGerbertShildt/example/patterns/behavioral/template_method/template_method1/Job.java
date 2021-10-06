package com.book.JPRGerbertShildt.example.patterns.behavioral.template_method.template_method1;

public class Job extends Template {

    @Override
    void stepOne() {
        System.out.println("first step...");
    }

    @Override
    void stepTwo() {
        System.out.println("second step...");
    }

    @Override
    void stepThree() {
        System.out.println("third step...");
    }

}
