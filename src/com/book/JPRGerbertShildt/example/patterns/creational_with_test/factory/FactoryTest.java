package com.book.JPRGerbertShildt.example.patterns.creational_with_test.factory;

public class FactoryTest {

    public static void main(String[] args){
        String win = "linux";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(win);
        os.getOS();
    }

}
