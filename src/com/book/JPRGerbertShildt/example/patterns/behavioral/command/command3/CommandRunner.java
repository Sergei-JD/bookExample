package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command3;

public class CommandRunner {

    public static void main(String[] args) {

        Computer computer = new Computer();
        User user = new User(
                new StartCommand(computer),
                new StopCommand(computer),
                new ResetCommand(computer)
        );

        user.startComputer();
        user.stopComputer();
        user.resetComputer();

    }

}
