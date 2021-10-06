package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command3;

public class ResetCommand implements Command {

    Computer computer;

    public ResetCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }

}
