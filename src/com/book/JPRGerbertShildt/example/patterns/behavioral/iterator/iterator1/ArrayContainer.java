package com.book.JPRGerbertShildt.example.patterns.behavioral.iterator.iterator1;

public class ArrayContainer implements Container {

    String [] array = {"Max", "John", "Mike"};

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return array[index++];
            }
            return null;
        }
    }
}
