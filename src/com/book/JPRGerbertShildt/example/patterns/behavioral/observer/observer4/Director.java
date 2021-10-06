package com.book.JPRGerbertShildt.example.patterns.behavioral.observer.observer4;

import java.util.List;

public class Director implements Observer {

    public void event(List<String> strings) {
        System.out.println("The list of students has changed: " + strings);
    }

}
