package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command3;

public class StartCommand implements Command {

    Computer computer;

    public StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }

}
