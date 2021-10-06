package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command2;

public class DeleteCommand implements Command {

    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }

}
