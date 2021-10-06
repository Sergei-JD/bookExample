package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command1;

public class MouseClick implements Command {

    @Override
    public void execute() {
        System.out.println("click command");
    }

    @Override
    public void revert() {
        System.out.println("revert");
    }
}
