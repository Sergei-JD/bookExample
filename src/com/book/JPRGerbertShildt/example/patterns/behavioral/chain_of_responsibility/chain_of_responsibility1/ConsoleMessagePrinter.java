package com.book.JPRGerbertShildt.example.patterns.behavioral.chain_of_responsibility.chain_of_responsibility1;

public class ConsoleMessagePrinter extends MessagePrinter {

    @Override
    void printMessage(String message) {
        System.out.println("Print to console: " + message);
    }

}
