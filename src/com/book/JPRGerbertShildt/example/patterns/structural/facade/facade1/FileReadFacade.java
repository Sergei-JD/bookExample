package com.book.JPRGerbertShildt.example.patterns.structural.facade.facade1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadFacade {

    String readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("F:/bookExample/src/com/book/JPRGerbertShildt/example/patterns/structural/facade/facade1/temp.txt"));
        StringBuilder stringBuilder = new StringBuilder();

        int j = 0;
        while ((j = reader.read()) != -1) {
            stringBuilder.append((char)j);
        }

        return stringBuilder.toString();
    }

}
