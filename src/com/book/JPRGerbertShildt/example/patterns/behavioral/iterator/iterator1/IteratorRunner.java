package com.book.JPRGerbertShildt.example.patterns.behavioral.iterator.iterator1;

public class IteratorRunner {

    public static void main(String[] args) {

        ArrayContainer arrayContainer = new ArrayContainer();

        Iterator iterator = arrayContainer.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
