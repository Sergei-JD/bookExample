package com.book.JPRGerbertShildt.example.patterns.structural.adapter.adapter2;

public class DatabaseRunner {

    public static void main(String[] args) {

        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.select();
        database.update();
        database.remove();

    }

}
