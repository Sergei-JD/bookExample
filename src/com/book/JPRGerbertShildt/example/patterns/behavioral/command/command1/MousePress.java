package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command1;

public class MousePress implements Command{

    @Override
    public void execute() {
        System.out.println("click mouse pressed");
    }

    @Override
    public void revert() {
        System.out.println("revert");
    }
}
