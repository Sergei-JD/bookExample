package com.book.JPRGerbertShildt.example.patterns.structural.decorator.decorator1;

public class FileBufferedReader extends FileDecorator {

    public FileBufferedReader(FileStream fileDecorator) {
        super(fileDecorator);
    }

    @Override
    public void read() {
        fileDecorator.read();
        System.out.println("buffered read");
    }

}
