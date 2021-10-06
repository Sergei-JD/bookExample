package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy2;

public class DeveloperRunner {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.setActivity(new Sleeoing());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Codeing());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

    }

}
