package com.book.JPRGerbertShildt.example.patterns.structural.flyweight.flyweight4;

public class Factory {

    private Flyweight[] pool;

    public Factory(int maxRows) {
        pool = new Flyweight[maxRows];
    }

    public Flyweight getFlyweight(int row) {

        if (pool[row] == null) {
            pool[row] = new Flyweight(row);
        }

        return pool[row];
    }

}
