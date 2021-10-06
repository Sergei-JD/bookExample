package com.book.JPRGerbertShildt.example.patterns.behavioral.chain_of_responsibility.chain_of_responsibility1;

public class FileMessagePrinter extends MessagePrinter{

    @Override
    void printMessage(String message) {
        System.out.println("Print to file: " + message);
    }

}
