package com.book.JPRGerbertShildt.example.patterns.structural.proxy.proxy3;

public class Runner {

    public static void main(String[] args) {

        Image image = new ProxyImage("D:/image/my.jpg");
        image.display();

    }

}
