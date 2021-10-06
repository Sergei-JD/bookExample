package com.book.JPRGerbertShildt.example.patterns.behavioral.iterator.iterator4;

public class IteratorTest {

    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        Iterator iterator = numbers.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
