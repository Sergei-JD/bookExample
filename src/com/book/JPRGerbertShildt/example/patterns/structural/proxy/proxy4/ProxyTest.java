package com.book.JPRGerbertShildt.example.patterns.structural.proxy.proxy4;

public class ProxyTest {

    public static void main(String[] args) {

        Image image = new ProxyImage("test.jpg");
        image.display();
        image.display();

    }

}
