package com.book.JPRGerbertShildt.example.patterns.structural.decorator.decorator1;

public class Decorator {

    public static void main(String[] args) {

        FileStream fileStream = new FileBufferedReader(new FileStreamReader());
        fileStream.read();

    }

}
