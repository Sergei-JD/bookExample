package com.book.JPRGerbertShildt.example.patterns.behavioral.command.command4;

public class CarInvoker {

    public Command command;

    public CarInvoker(Command command){
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }

}
