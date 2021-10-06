package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command3;

public class StopCommand implements Command {

    Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }

}
