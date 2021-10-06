package com.book.JPRGerbertShildt.example.patterns.behavioral.template_method.template_method1;

abstract class Template {

    abstract void stepOne();

    abstract void stepTwo();

    abstract void stepThree();

    void run() {
        stepOne();
        stepTwo();
        stepThree();
    }

}
