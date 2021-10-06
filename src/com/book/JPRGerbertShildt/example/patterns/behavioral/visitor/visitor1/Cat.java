package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor1;

public class Cat implements Animal {

    @Override
    public void doJob(Visitor visitor) {
        visitor.doCat();
    }

}
