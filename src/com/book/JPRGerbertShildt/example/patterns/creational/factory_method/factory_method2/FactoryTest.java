package com.book.JPRGerbertShildt.example.patterns.creational.factory_method.factory_method2;

public class FactoryTest {

    public static void main(String[] args){

        String win = "linux";

        Factory factory = new Factory();

        OS os = factory.getCurrentOS(win);
        os.getOS();

    }

}
