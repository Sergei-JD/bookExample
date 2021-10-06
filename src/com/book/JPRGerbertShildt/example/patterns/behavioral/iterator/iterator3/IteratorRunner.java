package com.book.JPRGerbertShildt.example.patterns.behavioral.iterator.iterator3;

public class IteratorRunner {

    public static void main(String[] args) {

        Tasks c = new Tasks();
        Iterator it = c.getIterator();

        while (it.hasNext()) {
            System.out.println((String)it.next() );
        }

    }

}
