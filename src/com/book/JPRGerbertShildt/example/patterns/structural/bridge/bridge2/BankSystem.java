package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge2;

public class BankSystem extends Program {

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }

}
