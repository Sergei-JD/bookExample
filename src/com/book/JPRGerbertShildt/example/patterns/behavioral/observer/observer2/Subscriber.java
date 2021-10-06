package com.book.JPRGerbertShildt.example.patterns.behavioral.observer.observer2;

import java.util.List;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacansies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacansies +
                "\n================================================================\n");
    }

}
