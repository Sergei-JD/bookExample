package com.book.JPRGerbertShildt.example.patterns.behavioral.iterator.iterator2;

public class JavaDeveloperRunner {

    public static void main(String[] args) {

        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Sergei JD", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }

    }

}
