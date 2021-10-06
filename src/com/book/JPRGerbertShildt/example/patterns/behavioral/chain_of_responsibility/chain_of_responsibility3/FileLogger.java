package com.book.JPRGerbertShildt.example.patterns.behavioral.chain_of_responsibility.chain_of_responsibility3;

public class FileLogger extends Logger{

    public FileLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Write to file: " + message);
    }

}
