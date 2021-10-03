package com.book.JPRGerbertShildt.example.patterns.structural.decorator.decorator1;

public class FileStreamReader implements FileStream {

    @Override
    public void read() {
        System.out.println("read file");
    }

}
