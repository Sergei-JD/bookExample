package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command1;

public class CommandRunner {

    public static void main(String[] args) {

      Receiver receiver = new Receiver();

      receiver.addCommands(new MouseClick());
      receiver.addCommands(new MousePress());

      receiver.runCommand();

    }

}
