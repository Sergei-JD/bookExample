package com.book.JPRGerbertShildt.example.patterns.behavioral.mediator.mediator4;

public class Mediator {

    public static void sendMessage(User user, String msg){
        System.out.println(user.getName() + ": " + msg);
    }

}
