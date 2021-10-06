package com.book.JPRGerbertShildt.example.patterns.behavioral.mediator.mediator3;

public class MediatorRunner {

    public static void main(String[] args) {

        TextChat chat = new TextChat();

        User admin = new Admin(chat, "BOSS");
        User user1 = new SimpleUser(chat, "John");
        User user2 = new SimpleUser(chat, "Mike");
        User user3 = new SimpleUser(chat, "Lex");
        user2.setEnable(false);

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.sendMessage("Привет, я пользователь чата.");
//        admin.sendMessage("Админ зашел в чат!");


    }

}
