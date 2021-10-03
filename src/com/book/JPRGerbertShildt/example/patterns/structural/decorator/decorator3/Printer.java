package com.book.JPRGerbertShildt.example.patterns.structural.decorator.decorator3;

public class Printer implements PrinterInterface {

    String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }

}
