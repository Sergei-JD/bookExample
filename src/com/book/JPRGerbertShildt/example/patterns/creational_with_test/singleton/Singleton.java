package com.book.JPRGerbertShildt.example.patterns.creational_with_test.singleton;

public class Singleton {

    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void setUp() {
        System.out.println("setUp");
    }

}

