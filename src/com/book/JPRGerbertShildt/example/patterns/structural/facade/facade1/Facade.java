package com.book.JPRGerbertShildt.example.patterns.structural.facade.facade1;

import java.io.IOException;

public class Facade {

    public static void main(String[] args) throws IOException {

        FileReadFacade fileReadFacade = new FileReadFacade();
        System.out.println(fileReadFacade.readFile("temp.txt"));

    }

}
