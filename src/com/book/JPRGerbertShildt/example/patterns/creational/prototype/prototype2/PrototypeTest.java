package com.book.JPRGerbertShildt.example.patterns.creational.prototype.prototype2;

public class PrototypeTest {

    public static void main(String[] args) {

        ComplicatedObject prototype = new ComplicatedObject();

        ComplicatedObject clone = prototype.copy();
        clone.setType(ComplicatedObject.Type.ONE);

    }

}
