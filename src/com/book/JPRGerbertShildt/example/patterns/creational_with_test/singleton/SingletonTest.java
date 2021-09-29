package com.book.JPRGerbertShildt.example.patterns.creational_with_test.singleton;

class SingletonTest {

    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.setUp();
    }

}