package com.book.JPRGerbertShildt.example.patterns.creational_with_test.prototype;

public class PrototypeTest {

    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = prototype.copy();
        clone.setType(ComplicatedObject.Type.ONE);
    }

}
