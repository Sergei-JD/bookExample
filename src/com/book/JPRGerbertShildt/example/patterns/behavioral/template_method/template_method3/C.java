package com.book.JPRGerbertShildt.example.patterns.behavioral.template_method.template_method3;

abstract class C {

    void templateMethod() {
        System.out.print("1");
        different();
        System.out.print("3");
        different2();
    }

    abstract void different();

    abstract void different2();

}
