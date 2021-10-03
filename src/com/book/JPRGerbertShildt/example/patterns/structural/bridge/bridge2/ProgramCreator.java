package com.book.JPRGerbertShildt.example.patterns.structural.bridge.bridge2;

public class ProgramCreator {

    public static void main(String[] args) {

        Program [] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Program program: programs) {
            program.developProgram();
        }

    }

}
