package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Receiver {

    List<Command> commands = new ArrayList<>();

    void addCommands(Command command) {
        commands.add(command);
    }

    void runCommand() {
        try {
            for (Command command : commands) {
                command.execute();
//                throw new IOException();
            }
        } catch (Exception e) {
            for (Command command : commands) {
                command.revert();
            }
        }
    }

}
