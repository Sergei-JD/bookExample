package com.book.JPRGerbertShildt.example.patterns.behavioral.visitor.visitor2;

public class SeniorDeveloper implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixed database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }

}
