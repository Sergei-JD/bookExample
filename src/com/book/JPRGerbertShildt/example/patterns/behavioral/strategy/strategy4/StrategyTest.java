package com.book.JPRGerbertShildt.example.patterns.behavioral.strategy.strategy4;

public class StrategyTest {

    public static void main(String[] args) {

        Context context = new Context(new DownloadWindownsStrategy());
        context.download("file.txt");

        context = new Context(new DownloadLinuxStrategy());
        context.download("file.txt");

    }

}
