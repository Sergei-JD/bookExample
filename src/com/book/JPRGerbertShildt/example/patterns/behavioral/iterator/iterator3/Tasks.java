package com.book.JPRGerbertShildt.example.patterns.behavioral.iterator.iterator3;

public class Tasks implements Container {

    String[] tasks = {"Изучать Java", "Учить English", "Освоить Spring", "Освоить Hibernate"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class  TaskIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < tasks.length) {
                return  true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }

    }

}
