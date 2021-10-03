package com.book.JPRGerbertShildt.example.patterns.structural.flyweight.flyweight4;

public class Flyweight {

    private int row;

    public Flyweight(int row) {
        this.row = row;
        System.out.println("ctor: " + this.row);
    }

    void report(int col) {
        System.out.print(" " + row + col);
    }

}
