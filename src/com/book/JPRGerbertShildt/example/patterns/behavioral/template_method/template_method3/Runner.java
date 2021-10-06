package com.book.JPRGerbertShildt.example.patterns.behavioral.template_method.template_method3;

public class Runner {

    public static void main(String[] args) {

        C a = new A();
        a.templateMethod();
        System.out.println("\n====");

        C b = new B();
        b.templateMethod();

    }

}
